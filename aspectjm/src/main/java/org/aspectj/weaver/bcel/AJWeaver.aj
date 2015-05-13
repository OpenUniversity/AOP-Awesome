package org.aspectj.weaver.bcel;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.aspectj.apache.bcel.Constants;
import org.aspectj.apache.bcel.classfile.ConstantPool;
import org.aspectj.apache.bcel.generic.FieldInstruction;
import org.aspectj.apache.bcel.generic.Instruction;
import org.aspectj.apache.bcel.generic.InstructionFactory;
import org.aspectj.apache.bcel.generic.InstructionHandle;
import org.aspectj.apache.bcel.generic.InstructionList;
import org.aspectj.apache.bcel.generic.InvokeInstruction;
import org.aspectj.bridge.MessageUtil;
import org.aspectj.bridge.context.CompilationAndWeavingContext;
import org.aspectj.bridge.context.ContextToken;
import org.aspectj.util.PartialOrder;
import org.aspectj.weaver.AdviceKind;
import org.aspectj.weaver.AjAttribute;
import org.aspectj.weaver.AjcMemberMaker;
import org.aspectj.weaver.BCException;
import org.aspectj.weaver.ConcreteTypeMunger;
import org.aspectj.weaver.IntMap;
import org.aspectj.weaver.Member;
import org.aspectj.weaver.NameMangler;
import org.aspectj.weaver.NewFieldTypeMunger;
import org.aspectj.weaver.ResolvedMember;
import org.aspectj.weaver.ResolvedType;
import org.aspectj.weaver.Shadow;
import org.aspectj.weaver.ShadowMunger;
import org.aspectj.weaver.UnresolvedType;
import org.aspectj.weaver.WeaverMessages;
import org.aspectj.weaver.WeaverStateInfo;
import org.openu.awesome.platform.AbstractWeaver;
import org.openu.awesome.platform.IEffect;
import org.openu.awesome.platform.MultiMechanism;




public privileged aspect AJWeaver extends AbstractWeaver {

	private Map<BcelShadow, List<ShadowMunger>> shadowMungers = new HashMap<BcelShadow, List<ShadowMunger>>();

	private List<BcelShadow> initializationShadows = new ArrayList<BcelShadow>();

	private List<ShadowMunger> mungers = new ArrayList<ShadowMunger>();

	BcelClassWeaver itdWeaver;

	declare parents: BcelAdvice implements IEffect;

	/*
	 public void init(List addedSuperInitializersAsList,
	 List addedThisInitializers, Set aspectsAffectingType) {
	 setAddedSuperInitializersAsList(addedSuperInitializersAsList);
	 setAddedThisInitializers(addedThisInitializers);
	 this.aspectsAffectingType = aspectsAffectingType;
	 resetInitializationShadows();
	 resetShadowMungers();
	 } */

	List<BcelShadow> around(MultiMechanism mm, LazyMethodGen mg) :
		reifyMethod(mm, mg) {
		//Transforming synchronized methods 
		if (mg.hasBody() && world.isJoinpointSynchronizationEnabled()
				&& world.areSynchronizationPointcutsInUse()
				&& mg.getMethod().isSynchronized()) {
			BcelClassWeaver.transformSynchronizedMethod(mg);
		}
		//If it is not special for AspectJ -> proceed 
		if (!isSpecial(mg))
			return proceed(mm, mg);

		BcelShadow enclosing = null;
		if (mg.isAdviceMethod()) {
			enclosing = BcelShadow.makeAdviceExecution(world, mg);
		} else {
			AjAttribute.EffectiveSignatureAttribute effective = mg
					.getEffectiveSignature();
			if (effective != null && effective.isWeaveBody()) {
				ResolvedMember rm = effective.getEffectiveSignature();
				// Annotations for things with effective signatures are
				// never stored in the effective
				// signature itself - we have to hunt for them. Storing them
				// in the effective signature
				// would mean keeping two sets up to date (no way!!)
				fixAnnotationsForResolvedMember(rm, mg.getMemberView());
				enclosing = BcelShadow.makeShadowForMethod(world, mg, effective
						.getShadowKind(), rm);
			}
		}
		if (enclosing == null)
			return null;

		List<BcelShadow> result = mm.reify(mg.getBody(), mg, enclosing);
		if (result == null)
			result = new ArrayList<BcelShadow>();
		enclosing.init();
		result.add(enclosing);
		return result;
	}

	List<BcelShadow> around(MultiMechanism mm, InstructionHandle ih,
			LazyMethodGen mg, BcelShadow encl) : 
		reifyInstr(mm, ih, mg, encl) {
		if (!isSpecial(ih, mg, encl))
			return proceed(mm, ih, mg, encl);
		return reifySpecial(ih, mg, encl);
	}

	List<BcelShadow> around(MultiMechanism mm, InstructionList il,
			LazyMethodGen mg, BcelShadow encl) : reifyIL(mm, il, mg, encl) {
		List<BcelShadow> result = proceed(mm, il, mg, encl);
		itdWeaver.getShadowsAfter(mg, encl);
		List<BcelShadow> afterShadows = shadows;
		if (afterShadows != null)
			if (result == null)
				return afterShadows;
			else
				result.addAll(afterShadows);
		return result;
	}

	public List<IEffect> match(BcelShadow shadow) {
		match(shadow, mungers);
		List<IEffect> result = new ArrayList<IEffect>();
		List<ShadowMunger> matching = shadowMungers.get(shadow);
		if (matching != null) {
			for (ShadowMunger munger : matching)
				if (munger instanceof BcelAdvice)
					result.add((IEffect) munger);
//					result.add((BcelAdvice) munger);
		}
		return result;
	}

	/**
	 * Taken from the shadow method. SK: this method sorts advice pieces to be
	 * applied to a join point. The advice pieces are sorted by the
	 * PartialOrder.sort(mungers) method. In case of success (i.e., no circular
	 * dependencies), the mungers field is reset with the ordered set. very
	 * simple.
	 * 
	 */
	public List<IEffect> order(BcelShadow shadow, List<IEffect> effects) {

		List<IEffect> sorted = PartialOrder.sort(effects);

		// Bunch of code to work out whether to report xlints for advice that
		// isn't ordered at this Joinpoint
		possiblyReportUnorderedAdvice(shadow, effects, sorted);

		if (sorted == null) {
			// this means that we have circular dependencies
			for (IEffect eff : effects) {
				if (eff instanceof ShadowMunger)
					world.getMessageHandler().handleMessage(
							MessageUtil.error(WeaverMessages.format(
									WeaverMessages.CIRCULAR_DEPENDENCY, this),
									((ShadowMunger) eff).getSourceLocation()));
			}
		}
		return sorted;
	}

	public List<BcelShadow> getInitializationShadows() {
		return initializationShadows;
	}

	public List<ShadowMunger> getShadowMungers(BcelShadow shadow) {
		return shadowMungers.get(shadow);
	}

	/**
	 * Whether this instruction should be processed by the mechanism, rather
	 * than by the base mechanism.
	 * 
	 * @param ih
	 * @return
	 */
	private boolean isSpecial(InstructionHandle ih, LazyMethodGen mg,
			BcelShadow enclosing) {
		LazyClassGen clazz = mg.getEnclosingClass();
		ConstantPool cpg = clazz.getConstantPool();

		Instruction i = ih.getInstruction();
		if (i instanceof FieldInstruction) {
			FieldInstruction fi = (FieldInstruction) i;
			Member field = BcelWorld.makeFieldJoinPointSignature(clazz, fi);
			// TODO: Should be moved from BM to the MM level!!!
			// synthetic fields are never join points:
			if (field.getName().startsWith(NameMangler.PREFIX))
				return true;
			ResolvedMember resolvedField = field.resolve(world);
			if (resolvedField == null) {
				return true;
			} else if (resolvedField.isSynthetic()) {
				// sets of synthetics aren't join points in 1.1
				return true;
			} else if ((fi.getOpcode() == Constants.PUTFIELD || fi.getOpcode() == Constants.PUTSTATIC)
					&& Modifier.isFinal(resolvedField.getModifiers())
					&& Utility.isConstantPushInstruction(ih.getPrev()
							.getInstruction())) {
				return true;
			}
		} else if (i instanceof InvokeInstruction) {
			InvokeInstruction ii = (InvokeInstruction) i;
			//TODO:figure out if it really what it is supposed to be
			if (ii.getMethodName(clazz.getConstantPool()).equals("<init>")) {
				return false;
			} else if (ii.opcode == Constants.INVOKESPECIAL) {
				String onTypeName = ii.getClassName(cpg);
				// we are a super call, and this is not a join point in
				// AspectJ-1.{0,1}
				if (!onTypeName.equals(clazz.getName())) {
					return true;
				}
			}
			String methodName = ii.getName(cpg);
			if (methodName.startsWith(NameMangler.PREFIX)) {
				return true;
			}
		} else if ((i.getOpcode() == Constants.MONITORENTER) || (i.getOpcode() == Constants.MONITOREXIT)) {
			return true;
		} else if (Range.isRangeHandle(ih))
			return true;
		return false;
	}

	private List<BcelShadow> reifySpecial(InstructionHandle ih,
			LazyMethodGen mg, BcelShadow enclosing) {
		LazyClassGen clazz = mg.getEnclosingClass();
		ConstantPool cpg = clazz.getConstantPool();
		List<BcelShadow> result = new ArrayList<BcelShadow>();
		Instruction i = ih.getInstruction();
		if (i instanceof InvokeInstruction) {
			InvokeInstruction ii = (InvokeInstruction) i;
			if (ii.opcode == Constants.INVOKESPECIAL) {
				String onTypeName = ii.getClassName(cpg);
				// we are a super call, and this is not a join point in
				// AspectJ-1.{0,1}
				if (!onTypeName.equals(mg.getEnclosingClass().getName())) {
					return null;
				}
			}
			Member jpSig = world.makeJoinPointSignatureForMethodInvocation(
					clazz, ii);
			ResolvedMember declaredSig = jpSig.resolve(world);
			// System.err.println(method + ", declaredSig: " +declaredSig);
			if (declaredSig == null)
				return null;
			if (declaredSig.getKind() == Member.FIELD) {
				Shadow.Kind kind;
				if (jpSig.getReturnType().equals(ResolvedType.VOID)) {
					kind = Shadow.FieldSet;
				} else {
					kind = Shadow.FieldGet;
				}
				result.add(BcelShadow.makeShadowForMethodCall(world, mg, ih,
						enclosing, kind, declaredSig));
			} else {
				AjAttribute.EffectiveSignatureAttribute effectiveSig = declaredSig
						.getEffectiveSignature();
				if (effectiveSig == null)
					return null;
				if (effectiveSig.isWeaveBody())
					return null;
				ResolvedMember rm = effectiveSig.getEffectiveSignature();
				fixAnnotationsForResolvedMember(rm, declaredSig); // abracadabra

				result.add(BcelShadow.makeShadowForMethodCall(world, mg, ih,
						enclosing, effectiveSig.getShadowKind(), rm));
			}
		} else if (world.isJoinpointSynchronizationEnabled()
				&& ((i.getOpcode() == Constants.MONITORENTER) || (i.getOpcode() == Constants.MONITOREXIT))) {
			if (i.getOpcode() == Constants.MONITORENTER) {
				BcelShadow monitorEntryShadow = BcelShadow.makeMonitorEnter(
						world, mg, ih, enclosing);
				result.add(monitorEntryShadow);
				// match(monitorEntryShadow,shadowAccumulator);
			} else {
				BcelShadow monitorExitShadow = BcelShadow.makeMonitorExit(
						world, mg, ih, enclosing);
				result.add(monitorExitShadow);
				// match(monitorExitShadow,shadowAccumulator);
			}
		}
		if (result != null && result.size() == 0)
			return null;
		return result;
	}

	/**
	 * The method matches a shadow against a list of shadow mungers. Matching
	 * mungers are associated with the shadow.
	 * 
	 * @param shadow
	 *            is a join point shadow to be matched
	 * @param shadowMungers
	 *            is a list of advice
	 * @return whether the shadow matches any of advice
	 */
	private boolean match(BcelShadow shadow, List<ShadowMunger> shadowMungers) {
		LazyClassGen clazz = shadow.getEnclosingClass();
		boolean isMatched = false;
		// The captureLowLevelContext seem to mean
		// more wordy debug info.
		if (BcelClassWeaver.captureLowLevelContext) { // duplicate blocks - one with context
			// capture, one without, seems faster
			// than multiple 'ifs()'
			ContextToken shadowMatchToken = CompilationAndWeavingContext
					.enteringPhase(
							CompilationAndWeavingContext.MATCHING_SHADOW,
							shadow);
			for (ShadowMunger munger : shadowMungers) {
				ContextToken mungerMatchToken = CompilationAndWeavingContext
						.enteringPhase(
								CompilationAndWeavingContext.MATCHING_POINTCUT,
								munger.getPointcut());
				// the munger.match(shadow, world) matches the shadow against a
				// munger's pointcut
				if (munger.match(shadow, world)) {
					// SK: whatever it means
					//WeaverMetrics.recordMatchResult(true);// Could pass:
					// munger
					addAssociation(shadow, munger);
					isMatched = true;
					// It is Ok here, because we are in the AJ mechanism.
					if (shadow.getKind() == Shadow.StaticInitialization) {
						clazz.warnOnAddedStaticInitializer(shadow, munger
								.getSourceLocation());
					}
				} else {
					//WeaverMetrics.recordMatchResult(false); // Could pass:
					// munger
				}
				CompilationAndWeavingContext.leavingPhase(mungerMatchToken);
			}
			CompilationAndWeavingContext.leavingPhase(shadowMatchToken);
		} else {
			for (ShadowMunger munger : shadowMungers) {
				if (munger.match(shadow, world)) {
					addAssociation(shadow, munger);
					isMatched = true;
					if (shadow.getKind() == Shadow.StaticInitialization) {
						clazz.warnOnAddedStaticInitializer(shadow, munger
								.getSourceLocation());
					}
				}
			}
		}
		return isMatched;
	}

	// ======================= The following is to be moved from BM

	// not quite optimal... but the xlint is ignore by default
	/**
	 * Copied from the Shadow class.
	 *  SK: that's smth not really essential to the advice ordering process. */
	private void possiblyReportUnorderedAdvice(BcelShadow shadow,
			List<IEffect> mungers, List sorted) {
		if (sorted != null
				&& world.getLint().unorderedAdviceAtShadow.isEnabled()
				&& mungers.size() > 1) {

			// Stores a set of strings of the form 'aspect1:aspect2' which
			// indicates there is no
			// precedence specified between the two aspects at this shadow.
			Set clashingAspects = new HashSet();
			int max = mungers.size();

			// Compare every pair of advice mungers
			for (int i = max - 1; i >= 0; i--) {
				for (int j = 0; j < i; j++) {
					IEffect a = mungers.get(i);
					IEffect b = mungers.get(j);
					if ((a instanceof BcelAdvice) && (b instanceof BcelAdvice)) {
						BcelAdvice adviceA = (BcelAdvice) a;
						BcelAdvice adviceB = (BcelAdvice) b;
						if (!adviceA.getConcreteAspect().equals(
								adviceB.getConcreteAspect())) {
							AdviceKind adviceKindA = adviceA.getKind();
							AdviceKind adviceKindB = adviceB.getKind();

							// make sure they are the nice ones (<6) and not any
							// synthetic advice ones we
							// create to support other features of the language.
							if (adviceKindA.getKey() < (byte) 6
									&& adviceKindB.getKey() < (byte) 6
									&& adviceKindA.getPrecedence() == adviceKindB
											.getPrecedence()) {

								// Ask the world if it knows about precedence
								// between these
								Integer order = world.getPrecedenceIfAny(
										adviceA.getConcreteAspect(), adviceB
												.getConcreteAspect());

								if (order != null
										&& order.equals(new Integer(0))) {
									String key = adviceA.getDeclaringAspect()
											+ ":"
											+ adviceB.getDeclaringAspect();
									String possibleExistingKey = adviceB
											.getDeclaringAspect()
											+ ":"
											+ adviceA.getDeclaringAspect();
									if (!clashingAspects
											.contains(possibleExistingKey))
										clashingAspects.add(key);
								}
							}
						}
					}
				}
			}
			for (Iterator iter = clashingAspects.iterator(); iter.hasNext();) {
				String element = (String) iter.next();
				String aspect1 = element.substring(0, element.indexOf(":"));
				String aspect2 = element.substring(element.indexOf(":") + 1);
				world.getLint().unorderedAdviceAtShadow.signal(new String[] {
						this.toString(), aspect1, aspect2 }, shadow
						.getSourceLocation(), null);
			}
		}
	}

	private Map mapToAnnotations = new HashMap();

	/**
	 * For a given resolvedmember, this will discover the real annotations for
	 * it. <b>Should only be used when the resolvedmember is the contents of an
	 * effective signature attribute, as thats the only time when the
	 * annotations aren't stored directly in the resolvedMember</b>
	 * 
	 * @param rm
	 *            the sig we want it to pretend to be 'int A.m()' or somesuch
	 *            ITD like thing
	 * @param declaredSig
	 *            the real sig 'blah.ajc$xxx'
	 */
	private void fixAnnotationsForResolvedMember(ResolvedMember rm,
			ResolvedMember declaredSig) {
		try {
			UnresolvedType memberHostType = declaredSig.getDeclaringType();
			ResolvedType[] annotations = (ResolvedType[]) mapToAnnotations
					.get(rm);
			String methodName = declaredSig.getName();
			// FIXME asc shouldnt really rely on string names !
			if (annotations == null) {
				if (rm.getKind() == Member.FIELD) {
					if (methodName.startsWith("ajc$inlineAccessField")) {
						ResolvedMember resolvedDooberry = world.resolve(rm);
						annotations = resolvedDooberry.getAnnotationTypes();
					} else {
						ResolvedMember realthing = AjcMemberMaker
								.interFieldInitializer(rm, memberHostType);
						ResolvedMember resolvedDooberry = world
								.resolve(realthing);
						annotations = resolvedDooberry.getAnnotationTypes();
					}
				} else if (rm.getKind() == Member.METHOD && !rm.isAbstract()) {
					if (methodName.startsWith("ajc$inlineAccessMethod")
							|| methodName.startsWith("ajc$superDispatch")) {
						ResolvedMember resolvedDooberry = world
								.resolve(declaredSig);
						annotations = resolvedDooberry.getAnnotationTypes();
					} else {
						ResolvedMember realthing = AjcMemberMaker
								.interMethodDispatcher(rm.resolve(world),
										memberHostType).resolve(world);
						// ResolvedMember resolvedDooberry =
						// world.resolve(realthing);
						ResolvedMember theRealMember = findResolvedMemberNamed(
								memberHostType.resolve(world), realthing
										.getName());
						// AMC temp guard for M4
						if (theRealMember == null) {
							throw new UnsupportedOperationException(
									"Known limitation in M4 - can't find ITD members when type variable is used as an argument and has upper bound specified");
						}
						annotations = theRealMember.getAnnotationTypes();
					}
				} else if (rm.getKind() == Member.CONSTRUCTOR) {
					ResolvedMember realThing = AjcMemberMaker
							.postIntroducedConstructor(memberHostType
									.resolve(world), rm.getDeclaringType(), rm
									.getParameterTypes());
					ResolvedMember resolvedDooberry = world.resolve(realThing);
					// AMC temp guard for M4
					if (resolvedDooberry == null) {
						throw new UnsupportedOperationException(
								"Known limitation in M4 - can't find ITD members when type variable is used as an argument and has upper bound specified");
					}
					annotations = resolvedDooberry.getAnnotationTypes();
				}
				if (annotations == null)
					annotations = new ResolvedType[0];
				mapToAnnotations.put(rm, annotations);
			}
			rm.setAnnotationTypes(annotations);
		} catch (UnsupportedOperationException ex) {
			throw ex;
		} catch (Throwable t) {
			// FIXME asc remove this catch after more testing has confirmed the
			// above stuff is OK
			throw new BCException(
					"Unexpectedly went bang when searching for annotations on "
							+ rm, t);
		}
	}

	/**
	 * For some named resolved type, this method looks for a member with a
	 * particular name - it should only be used when you truly believe there is
	 * only one member with that name in the type as it returns the first one it
	 * finds.
	 */
	private ResolvedMember findResolvedMemberNamed(ResolvedType type,
			String methodName) {
		ResolvedMember[] allMethods = type.getDeclaredMethods();
		for (int i = 0; i < allMethods.length; i++) {
			ResolvedMember member = allMethods[i];
			if (member.getName().equals(methodName))
				return member;
		}
		return null;
	}

	private void positionAndImplement(MultiMechanism mm,
			List initializationShadows) {
		for (Iterator i = initializationShadows.iterator(); i.hasNext();) {
			BcelShadow s = (BcelShadow) i.next();
			positionInitializationShadow(mm, s);
			// s.getEnclosingMethod().print();
			mm.transform(s);
		}
	}

	/** TODO: Most of these should be moved to AJ mechanism */
	private void positionInitializationShadow(MultiMechanism mm, BcelShadow s) {
		LazyMethodGen mg = s.getEnclosingMethod();
		InstructionHandle call = itdWeaver.findSuperOrThisCall(mg);

		InstructionList body = mg.getBody();
		ShadowRange r = new ShadowRange(body);
		r.associateWithShadow((BcelShadow) s);
		if (s.getKind() == Shadow.PreInitialization) {
			// XXX assert first instruction is an ALOAD_0.
			// a pre shadow goes from AFTER the first instruction (which we
			// believe to
			// be an ALOAD_0) to just before the call to super
			r.associateWithTargets(Range.genStart(body, body.getStart()
					.getNext()), Range.genEnd(body, call.getPrev()));
		} else {
			// assert s.getKind() == Shadow.Initialization
			r.associateWithTargets(Range.genStart(body, call.getNext()), Range
					.genEnd(body));
		}
		// keeps method-to-shadow relations up-to-date
		mm.addMethodShadow(mg, s);
	}

	private boolean isThisCall(LazyClassGen clazz, InstructionHandle ih) {
		ConstantPool cpg = clazz.getConstantPool();
		InvokeInstruction inst = (InvokeInstruction) ih.getInstruction();
		return inst.getClassName(cpg).equals(clazz.getName());
	}

	/**
	 * get a called method: Assumes the called method is in this class, and the
	 * reference to it is exact (a la INVOKESPECIAL).
	 * 
	 * @param ih
	 *            The InvokeInstruction instructionHandle pointing to the called
	 *            method.
	 */
	private LazyMethodGen getCalledMethod(LazyClassGen clazz,
			InstructionHandle ih) {
		ConstantPool cpg = clazz.getConstantPool();
		InvokeInstruction inst = (InvokeInstruction) ih.getInstruction();

		String methodName = inst.getName(cpg);
		String signature = inst.getSignature(cpg);

		return clazz.getLazyMethodGen(methodName, signature);
	}


	private boolean isSpecial(LazyMethodGen mg) {
		return mg.hasBody()
				&& (mg.getName().startsWith("ajc$interFieldInit")
						|| mg.isAdviceMethod() || !shouldWeaveBody(mg));
	}

	private boolean shouldWeaveBody(LazyMethodGen mg) {
		return !(mg.isBridgeMethod()
				|| (mg.isAjSynthetic() && !mg.getName().equals("<clinit>")) || (mg
				.getEffectiveSignature() != null && !mg.getEffectiveSignature()
				.isWeaveBody()));
	}

	// =========================================

	protected void addAssociation(BcelShadow shadow, ShadowMunger munger) {
		// the associations between mungers and shadows should be external.
		// shadow.addMunger(munger);
		List<ShadowMunger> mungers = shadowMungers.get(shadow);
		if (mungers == null) {
			mungers = new ArrayList<ShadowMunger>();
			shadowMungers.put(shadow, mungers);
		}
		mungers.add(munger);
	}

	BcelShadow around(BcelShadow oldShadow, LazyMethodGen recipient, BcelShadow enclosing):
		call(* BcelShadow.copyInto(..)) &&
		withincode(static InstructionList genInlineInstructions(LazyMethodGen, LazyMethodGen, IntMap,
				InstructionFactory, boolean)) &&
		target(oldShadow) &&
		args(recipient, enclosing) {
		BcelShadow freshShadow = proceed(oldShadow, recipient, enclosing);
		List<ShadowMunger> oldMungers = getShadowMungers(oldShadow);
		if (oldMungers != null) {
			for (ShadowMunger munger : oldMungers)
				addAssociation(freshShadow, munger);
		}
		return freshShadow;
	}

	///////////////
	/// AspectJ ///
	///////////////

	public BcelClassWeaver.new(BcelWorld world, LazyClassGen clazz) {
		this(world, clazz, null,
				clazz.getBcelObjectType().getResolvedTypeX().getInterTypeMungers(),
				world.getCrosscuttingMembersSet().getLateTypeMungers());
	}

	Set<String> BcelClassWeaver.aspectsAffectingType;

	public boolean BcelClassWeaver.weaveNormalITDs() {
		if (clazz.isWoven() && !clazz.isReweavable()) {
			if (world.getLint().nonReweavableTypeEncountered.isEnabled()) {
				world.getLint().nonReweavableTypeEncountered.signal(clazz.getType().getName(), ty.getSourceLocation());
			}
			// Integer uniqueID = new Integer(rm.hashCode() * deca.hashCode());
			// if (!reportedProblems.contains(uniqueID)) {
			// reportedProblems.add(uniqueID);
			// world.getLint().elementAlreadyAnnotated.signal(new String[] { rm.toString(),
			// world.showMessage(IMessage.ERROR, WeaverMessages.format(WeaverMessages.ALREADY_WOVEN, clazz.getType().getName()),
			// ty.getSourceLocation(), null);
			return false;
		}

		if (inReweavableMode || clazz.getType().isAspect()) {
			aspectsAffectingType = new HashSet<String>();
		}

		boolean isChanged = false;

		// we want to "touch" all aspects
		if (clazz.getType().isAspect()) {
			isChanged = true;
		}

		WeaverStateInfo typeWeaverState = (world.isOverWeaving() ? getLazyClassGen().getType().getWeaverState() : null);
		// start by munging all typeMungers
		for (ConcreteTypeMunger o : typeMungers) {
			if (!(o instanceof BcelTypeMunger)) {
				// ???System.err.println("surprising: " + o);
				continue;
			}
			BcelTypeMunger munger = (BcelTypeMunger) o;

			if (typeWeaverState != null && typeWeaverState.isAspectAlreadyApplied(munger.getAspectType())) {
				continue;
			}
			boolean typeMungerAffectedType = munger.munge(this);
			if (typeMungerAffectedType) {
				isChanged = true;
				if (inReweavableMode || clazz.getType().isAspect()) {
					aspectsAffectingType.add(munger.getAspectType().getSignature());
				}
			}
		}

		// Weave special half type/half shadow mungers...
		isChanged = weaveDeclareAtMethodCtor(clazz) || isChanged;
		isChanged = weaveDeclareAtField(clazz) || isChanged;

		// XXX do major sort of stuff
		// sort according to: Major: type hierarchy
		// within each list: dominates
		// don't forget to sort addedThisInitialiers according to dominates
		addedSuperInitializersAsList = new ArrayList<IfaceInitList>(addedSuperInitializers.values());
		addedSuperInitializersAsList = PartialOrder.sort(addedSuperInitializersAsList);
		if (addedSuperInitializersAsList == null) {
			throw new BCException("circularity in inter-types");
		}

		// this will create a static initializer if there isn't one
		// this is in just as bad taste as NOPs
		LazyMethodGen staticInit = clazz.getStaticInitializer();
		staticInit.getBody().insert(genInitInstructions(addedClassInitializers, true));

		return isChanged;
	}

	public boolean BcelClassWeaver.weaveLateITDs(boolean isChanged) {
		// now proceed with late type mungers
		if (lateTypeMungers != null) {
			for (Iterator<ConcreteTypeMunger> i = lateTypeMungers.iterator(); i.hasNext();) {
				BcelTypeMunger munger = (BcelTypeMunger) i.next();
				if (munger.matches(clazz.getType())) {
					boolean typeMungerAffectedType = munger.munge(this);
					if (typeMungerAffectedType) {
						isChanged = true;
						if (inReweavableMode || clazz.getType().isAspect()) {
							aspectsAffectingType.add(munger.getAspectType().getSignature());
						}
					}
				}
			}
		}

		// FIXME AV - see #75442, for now this is not enough to fix the bug,
		// comment that out until we really fix it
		// // flush to save some memory
		// PerObjectInterfaceTypeMunger.unregisterFromAsAdvisedBy(clazz.getType()
		// );

		// finally, if we changed, we add in the introduced methods.
		if (isChanged) {
			clazz.getOrCreateWeaverStateInfo(inReweavableMode);
			weaveInAddedMethods();
		}

		if (inReweavableMode) {
			WeaverStateInfo wsi = clazz.getOrCreateWeaverStateInfo(true);
			wsi.addAspectsAffectingType(aspectsAffectingType);
			wsi.setUnwovenClassFileData(ty.getJavaClass().getBytes());
			wsi.setReweavable(true);
		} else {
			clazz.getOrCreateWeaverStateInfo(false).setReweavable(false);
		}

		// tidyup, reduce ongoing memory usage of BcelMethods that hang around
		for (LazyMethodGen mg : clazz.getMethodGens()) {
			BcelMethod method = mg.getMemberView();
			if (method != null) {
				method.wipeJoinpointSignatures();
			}
		}

		return isChanged;
	}

	public void BcelClassWeaver.addAspectsAffectingType(MultiMechanism mm, LazyClassGen clazz) {
		if (!(inReweavableMode || clazz.getType().isAspect()))
			return;
		for (Iterator i = clazz.getMethodGens().iterator(); i.hasNext();) {
			LazyMethodGen mg = (LazyMethodGen) i.next();
			List<BcelShadow> matchedShadows = mm.getMethodShadows(mg);
			if (!mg.hasBody() || matchedShadows == null
					|| matchedShadows.size() == 0)
				continue;
			// For matching mungers, add their declaring aspects to the list
			// that affected this type
			if (inReweavableMode || clazz.getType().isAspect())
				aspectsAffectingType.addAll(
						findAspectsForMungers(mg));
		}
	}

	List<BcelShadow> around(LazyMethodGen mg):
		get(* LazyMethodGen.matchedShadows) &&
		withincode(* BcelClassWeaver.findAspectsForMungers(..)) &&
		target(mg) {
		List<BcelShadow> shadows = mm.getMethodShadows(mg);
		return shadows != null ? shadows : new ArrayList<BcelShadow>();
	}

	List<ShadowMunger> around(BcelShadow shadow):
		call(* Shadow.getMungers()) &&
		withincode(* BcelClassWeaver.findAspectsForMungers(..)) &&
		target(shadow) {
		List<ShadowMunger> mungers = getShadowMungers(shadow);
		return mungers != null ? mungers : new ArrayList<ShadowMunger>();
	}

	public void BcelAdvice.transform(BcelShadow shadow) {
		implementOn(shadow);
		//This is copied here from Shadow class.
		reportAfterWeaving(shadow);
	}

	private void BcelAdvice.reportAfterWeaving(BcelShadow shadow) {
//		BcelWorld world = shadow.getWorld();
//		if (world.getCrossReferenceHandler() != null) {
//			world.getCrossReferenceHandler().addCrossReference(
//					this.getSourceLocation(), // What is being applied
//					shadow.getSourceLocation(), // Where is it being												// applied
//					determineRelKind().getName(), // What kind of advice?
//					((BcelAdvice) this).hasDynamicTests() // Is a
//					// runtime
//					// test
//					// being
//					// stuffed
//					// in the
//					// code?
//					);
//		}
//
//		// TAG: WeavingMessage
//		if (!world.getMessageHandler().isIgnoring(
//				IMessage.WEAVEINFO)) {
//			reportWeavingMessage(shadow);
//		}
//
//		if (world.getModel() != null) {
//			// System.err.println("munger: " + munger + " on " + this);
//			AsmRelationshipProvider.addAdvisedRelationship(world.getModelAsAsmManager(), shadow, this);
//		}
	}

	public void BcelClassWeaver.getShadowsAfter(LazyMethodGen mg, BcelShadow enclosingShadow) {
    	if (!mg.getName().equals("<init>")) {
    		return;
    	}

    	List<BcelShadow> shadowAccumulator = new ArrayList<BcelShadow>();
    	shadowAccumulator.add(enclosingShadow);
    	matchInit(mg, shadowAccumulator);   	
	}

	List<BcelShadow> shadows;
	
	BcelShadow around():
		call(* BcelShadow.makeIfaceInitialization(..)) &&
		withincode(private boolean BcelClassWeaver.matchInit(LazyMethodGen, List<BcelShadow>)) {
		BcelShadow shadow = proceed();
		shadows.add(shadow);
		return shadow;
		}
	
	void around():
		call(* indexShadowMungers()) {
		return;
	}
	
	BcelShadow around(LazyMethodGen mg, List<BcelShadow> shadowAccumulator):
		call(public static BcelShadow BcelShadow.makeConstructorExecution(BcelWorld, LazyMethodGen, InstructionHandle)) &&
		withincode(private boolean BcelClassWeaver.matchInit(LazyMethodGen, List<BcelShadow>)) &&
		args(mg, shadowAccumulator) {
			return shadowAccumulator.get(0);
		}

	void around():
		call(void BcelClassWeaver.match(..)) &&
		withincode(private boolean BcelClassWeaver.matchInit(LazyMethodGen, List<BcelShadow>)) {
			return;
		}

	boolean around():
		call(* BcelClassWeaver.canMatch(..)) {
			return false;
		}

	boolean around():
		call(boolean BcelClassWeaver.match(..)) &&
		withincode(* BcelClassWeaver.matchInit(..)) {
			return false;
		}

	before(LazyMethodGen mg, List<BcelShadow> shadowAccumulator):
		execution(private boolean BcelClassWeaver.matchInit(LazyMethodGen, List<BcelShadow>)) &&
		args(mg, shadowAccumulator) {
		shadows = new ArrayList<BcelShadow>();
		}
	
	after(LazyMethodGen mg, List<BcelShadow> shadowAccumulator):
		execution(private boolean BcelClassWeaver.matchInit(LazyMethodGen, List<BcelShadow>)) &&
		args(mg, shadowAccumulator) {
		initializationShadows.add(BcelShadow.makeUnfinishedInitialization(
				world, mg));
		initializationShadows.add(BcelShadow
				.makeUnfinishedPreinitialization(world, mg));
		}

	boolean around(MultiMechanism mm, LazyClassGen clazz):
		transformClass(mm, clazz) {
//		itdWeaver = new BcelClassWeaver(world, clazz);
		System.out.println("KOBI!");
		itdWeaver = new BcelClassWeaver(world, clazz, null,
				clazz.getBcelObjectType().getResolvedTypeX().getInterTypeMungers(),
				world.getCrosscuttingMembersSet().getLateTypeMungers());
		
		boolean result = itdWeaver.weaveNormalITDs();
		mungers = world.getCrosscuttingMembersSet().getShadowMungers();
		initializationShadows = new ArrayList<BcelShadow>();
		//other guys are accessed directly from itdWeaver
		boolean tmp = proceed(mm, clazz);
		result = tmp || result;
		// if we matched any initialization shadows, we inline and weave
		if (!initializationShadows.isEmpty()) {
			result = true;
			// Repeat next step until nothing left to inline...cant go on 
			// infinetly as compiler will have detected and reported 
			// "Recursive constructor invocation"
			List<LazyMethodGen> methodGens = new ArrayList(clazz.getMethodGens());
			List<LazyMethodGen> recursiveCtors = new ArrayList<LazyMethodGen>();
			while (itdWeaver.inlineSelfConstructors(methodGens, recursiveCtors))
				;
			positionAndImplement(mm, initializationShadows);
		}
		itdWeaver.addAspectsAffectingType(mm, clazz);
		return itdWeaver.weaveLateITDs(result);
	}

	AjAttribute.EffectiveSignatureAttribute around(LazyMethodGen lmg):
		call(* LazyMethodGen.getEffectiveSignature()) &&
		target(lmg) {
		if (lmg.getMemberView() == null)
			return null;
		return proceed(lmg);
	}
}
