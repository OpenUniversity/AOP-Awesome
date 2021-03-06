package org.aspectj.weaver.bcel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.aspectj.bridge.MessageUtil;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.weaver.Advice;
import org.aspectj.weaver.AnnotationAJ;
import org.aspectj.weaver.ResolvedMember;
import org.aspectj.weaver.ResolvedMemberImpl;
import org.aspectj.weaver.ResolvedType;
import org.aspectj.weaver.Shadow;
import org.aspectj.weaver.ShadowMunger;
import org.aspectj.weaver.UnresolvedType;
import org.openu.awesome.platform.AbstractWeaver;
import org.openu.awesome.platform.IEffect;

import cjp.runtime.Closure;
import cjp.runtime.Joinpoint;
import cjp.runtime.JoinpointSignature;
import cjp.runtime.JoinpointWrapper;


public aspect ClosuresWeaver extends AbstractWeaver {

	private Map<NameAndArgumentType, UnresolvedType> jpToReturnType = new HashMap<NameAndArgumentType, UnresolvedType>();
	private Map<NameAndArgumentType, UnresolvedType[]> jpToExceptions = new HashMap<NameAndArgumentType, UnresolvedType[]>();

	private List<Pair<NameAndArgumentType, ResolvedMember>> jpAndAroundAdvice = new ArrayList<Pair<NameAndArgumentType, ResolvedMember>>();
	private List<Pair<ResolvedMember, NameAndArgumentType>> exhibitAndJp = new ArrayList<Pair<ResolvedMember, NameAndArgumentType>>();
	private List<Pair<NameAndArgumentType, ResolvedMember>> jpAndAdvice = new ArrayList<Pair<NameAndArgumentType, ResolvedMember>>();
	private List<Pair<NameAndArgumentType, UnresolvedType>> jpAndAfterReturningType = new ArrayList<Pair<NameAndArgumentType, UnresolvedType>>();
	private List<Pair<NameAndArgumentType, UnresolvedType>> jpAndAfterThrowingException = new ArrayList<Pair<NameAndArgumentType, UnresolvedType>>();

	/** advises that should not be used */
	private List<ResolvedMember> advicesToRemove = new ArrayList<ResolvedMember>();

	public List<IEffect> match(BcelShadow shadow) {
		return Collections.emptyList();
	}

	public List<IEffect> order(BcelShadow shadow, List<IEffect> effects) {
		return effects;
	}

	@Override
	public void setInputFilesPreWeaving(List<ResolvedType> files) {
		advicesToRemove.clear();

		for (ResolvedType resolvedType : files) {
			for (Iterator<ResolvedMember> iter = resolvedType.getMethods(true, true); iter.hasNext(); ) {
				ResolvedMember methodGen = iter.next();

				ResolvedMemberImpl bcelMethod = (ResolvedMemberImpl)methodGen;
				for (AnnotationAJ annotation : bcelMethod.getAnnotations()) {
					if (Joinpoint.class.getName().equals(annotation.getTypeName())) {
						jpToReturnType.put(
								new NameAndArgumentType(bcelMethod.getName(), bcelMethod.getParameterSignature()),
								bcelMethod.getReturnType());
						jpToExceptions.put(
								new NameAndArgumentType(bcelMethod.getName(), bcelMethod.getParameterSignature()),
								bcelMethod.getExceptions());
					}

					if (AfterReturning.class.getName().equals(annotation.getTypeName())) {
						AnnotationAJ ann = getJoinpointSignature(bcelMethod.getAnnotations());
						if (ann != null) {
							jpAndAfterReturningType.add(new Pair<NameAndArgumentType, UnresolvedType>(joinpointSignatureToNameAndArgumentType(ann), bcelMethod.getParameterTypes()[0]));
						}
					}

					if (AfterThrowing.class.getName().equals(annotation.getTypeName())) {
						AnnotationAJ ann = getJoinpointSignature(bcelMethod.getAnnotations());
						if (ann != null) {
							jpAndAfterThrowingException.add(new Pair<NameAndArgumentType, UnresolvedType>(joinpointSignatureToNameAndArgumentType(ann), bcelMethod.getParameterTypes()[0]));
						}
					}

					if (Around.class.getName().equals(annotation.getTypeName())) {
						AnnotationAJ ann = getJoinpointSignature(bcelMethod.getAnnotations());
						if (ann != null) {
							jpAndAroundAdvice.add(new Pair<NameAndArgumentType, ResolvedMember>(joinpointSignatureToNameAndArgumentType(ann), bcelMethod));
							jpAndAdvice.add(new Pair<NameAndArgumentType, ResolvedMember>(joinpointSignatureToNameAndArgumentType(ann), bcelMethod));
						}
					}

					if (Closure.class.getName().equals(annotation.getTypeName())) {
						exhibitAndJp.add(new Pair<ResolvedMember, NameAndArgumentType>(bcelMethod, new NameAndArgumentType(bcelMethod.getName(), bcelMethod.getParameterSignature())));
					}

					if (After.class.getName().equals(annotation.getTypeName())) {
						AnnotationAJ ann = getJoinpointSignature(bcelMethod.getAnnotations());
						if (ann != null) {
							jpAndAdvice.add(new Pair<NameAndArgumentType, ResolvedMember>(joinpointSignatureToNameAndArgumentType(ann), bcelMethod));
						}
					}

					if (Before.class.getName().equals(annotation.getTypeName())) {
						AnnotationAJ ann = getJoinpointSignature(bcelMethod.getAnnotations());
						if (ann != null) {
							jpAndAdvice.add(new Pair<NameAndArgumentType, ResolvedMember>(joinpointSignatureToNameAndArgumentType(ann), bcelMethod));
						}
					}
				}
			}
		}
	}

	private AnnotationAJ getJoinpointSignature(AnnotationAJ[] annotations) {
		for (AnnotationAJ annotation : annotations) {
			if (JoinpointSignature.class.getName().equals(annotation.getTypeName()))
				return annotation;
		}

		return null;
	}

	List<ShadowMunger> around(): execution(* getShadowMungers(..)) {
		List<ShadowMunger> result = proceed();
		if (result == null) {
			return null;
		}

		for (ResolvedMember member : advicesToRemove) {
			ShadowMunger munger = member.getAssociatedShadowMunger();
			if (munger == null) {
				continue;
			}

			Advice advice = (Advice) munger;
			for (int i=0; i<result.size(); ++i) {
				ShadowMunger munger2 = result.get(i);
				if (munger2 instanceof Advice) {
					Advice advice2 = (Advice) munger2;
					if (advice.getKind() == advice2.getKind() &&
							advice.getSignature().equals(advice2.getSignature())) {
						result.remove(i);
						break;
					}
				}
			}
		}

		return result;
	}

	after(): execution(* setInputFilesPreWeaving(..)) {
		for (Pair<NameAndArgumentType, UnresolvedType> pair : jpAndAfterReturningType) {
			ResolvedType retType = jpToReturnType.get(pair.getFirst()).resolve(world);
			ResolvedType expectedRetType = pair.getSecond().resolve(world);

			if (!Utils.isConvertableFrom(retType, expectedRetType)) {
				world.getMessageHandler().handleMessage(MessageUtil.error("wrong return type is used while advising joinpoint '" + pair.getFirst() + "', return type: " + expectedRetType + ", should be: " + retType));
			}
		}

		for (Pair<NameAndArgumentType, UnresolvedType> pair : jpAndAfterThrowingException) {
			UnresolvedType[] exceptions = jpToExceptions.get(pair.getFirst());
			ResolvedType exception = pair.getSecond().resolve(world);

			if (!isConvertableFromOneOf(exception, exceptions)) {
				world.getMessageHandler().handleMessage(MessageUtil.error("wrong exception is thrown while advising joinpoint '" + pair.getFirst() + "', exception: " + exception));
			}
		}

		for (Pair<NameAndArgumentType, ResolvedMember> pair : jpAndAroundAdvice) {
			ResolvedMemberImpl bcelMethod = (ResolvedMemberImpl) pair.getSecond();
			ResolvedType expectedRetType = bcelMethod.getReturnType().resolve(world);
			UnresolvedType retType = jpToReturnType.get(pair.getFirst());
			
			if (!retType.resolve(world).isAssignableFrom(expectedRetType)) {
				advicesToRemove.add(bcelMethod);
				world.getMessageHandler().handleMessage(MessageUtil.error("wrong return value while advising joinpoint '" + pair.getFirst() + "', got: " + expectedRetType + ", should be: " + retType));
			}
		}

		for (Pair<ResolvedMember, NameAndArgumentType> pair : exhibitAndJp) {
			if (!jpToReturnType.containsKey(pair.getSecond())) {
				advicesToRemove.add(pair.getFirst());
				world.getMessageHandler().handleMessage(MessageUtil.error("tried to exhibit non-existing joinpoint '" + pair.getFirst() + "'"));
			}
		}

		for (Pair<NameAndArgumentType, ResolvedMember> pair : jpAndAdvice) {
			if (!jpToReturnType.containsKey(pair.getFirst())) {
				advicesToRemove.add(pair.getSecond());
				world.getMessageHandler().handleMessage(MessageUtil.error("tried to advice non-existing joinpoint '" + pair.getFirst() + "'"));
			}
		}

		/** should we take exception also from before & after advice ?? */
		for (Pair<NameAndArgumentType, ResolvedMember> pair : jpAndAdvice) {
			UnresolvedType[] exceptions = pair.getSecond().getExceptions();
			if (exceptions == null || exceptions.length == 0)
				continue;

			UnresolvedType[] retTypes = jpToExceptions.get(pair.getFirst());
			for (UnresolvedType exception : exceptions) {
				ResolvedType resolvedException = exception.resolve(world);
				if (!isAssignableFromOneOf(resolvedException, retTypes)) {
					advicesToRemove.add(pair.getSecond());
					world.getMessageHandler().handleMessage(MessageUtil.error("wrong exception is thrown while advising joinpoint '" + pair.getFirst() +"', exception: " + resolvedException));
				}
			}
		}

		jpToReturnType.clear();
		jpToExceptions.clear();
		jpAndAfterReturningType.clear();
		jpAndAfterThrowingException.clear();
		jpAndAroundAdvice.clear();
		exhibitAndJp.clear();
		jpAndAdvice.clear();
	}

	private boolean isConvertableFromOneOf(ResolvedType excpType, UnresolvedType[] excpTypes) {
		if (excpTypes == null)
			return false;

		for (UnresolvedType retType : excpTypes) {
			ResolvedType type1 = retType.resolve(world);
			if (Utils.isConvertableFrom(type1, excpType)) {
				return true;
			}
		}

		return false;
	}

	private boolean isAssignableFromOneOf(ResolvedType excpType, UnresolvedType[] excpTypes) {
		if (excpTypes == null)
			return false;

		for (UnresolvedType retType : excpTypes) {
			ResolvedType type1 = retType.resolve(world);
			if (type1.isAssignableFrom(excpType)) {
				return true;
			}
		}

		return false;
	}

	private NameAndArgumentType joinpointSignatureToNameAndArgumentType(AnnotationAJ ann) {
		return new NameAndArgumentType(ann.getStringFormOfValue("name"), getArgumentTypes(ann.getStringFormOfValue("args")));
	}

	private String getArgumentTypes(String args) {
		return "(" + args.substring(1, args.length()-1).replaceAll(",", "") + ")";
	}

	private Class<?> convertToClass(String arg) {
		if ("I".equals(arg))
			return int.class;
		if ("Z".equals(arg))
			return boolean.class;
		if ("B".equals(arg))
			return byte.class;
		if ("C".equals(arg))
			return char.class;
		if ("S".equals(arg))
			return short.class;
		if ("J".equals(arg))
			return long.class;
		if ("F".equals(arg))
			return float.class;
		if ("D".equals(arg))
			return double.class;
		if (arg.startsWith("L")) {
			try {
				return Class.forName(arg.substring(1, arg.length()-1).replaceAll("\\$", "\\."));
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	void around(MultiMechanism mm, List effects, BcelShadow shadow):
        execution(void MultiMechanism.mix(List, BcelShadow))
        && this(mm) && args(effects, shadow) {
		if ((shadow.getKind() == Shadow.PreInitialization || shadow.getKind() == Shadow.Initialization) &&
				ResolvedType.forName(JoinpointWrapper.class.getName()).equals(shadow.getSignature().getDeclaringType().resolve(world).getSuperclass())) {
			return;
		}

		if (effects!=null && !effects.isEmpty()) {
			for (AnnotationAJ ann : shadow.getSignature().resolve(world).getAnnotations())
				if (Closure.class.getName().equals(ann.getTypeName()))
					filterAdvice(effects, shadow);
		}
		proceed(mm, effects, shadow);
	}

	private void filterAdvice(List<IEffect> effects, Shadow shadow) {
		List<IEffect> filteredAdv = new ArrayList<IEffect>();
		for(IEffect effect:effects)
			if (effect!=null && (effect instanceof Advice)) {
				Advice advice = (Advice)effect;
				if (isJoinpointAdvice(advice) || (!shadow.hasThis() ||
						!ResolvedType.forName(JoinpointWrapper.class.getName()).equals(shadow.getThisType().resolve(world).getSuperclass())))
					filteredAdv.add(effect);
			}
        effects.retainAll(filteredAdv);
	}

	boolean isJoinpointAdvice(Advice advice) {
		for (AnnotationAJ ann : advice.getSignature().getAnnotations())
			if (JoinpointSignature.class.getName().equals(ann.getTypeName()))  {
				return true;
			}
		return false;
	}

	Map<ResolvedType, Shadow> type2enclosingShadow = new HashMap<ResolvedType, Shadow>();

	Map<ResolvedType, BcelShadow> type2closure = new HashMap<ResolvedType, BcelShadow>();

	List<BcelShadow> around(MultiMechanism mm, LazyClassGen clazz):
		reifyClass(mm, clazz) {
		List<BcelShadow> shadows = proceed(mm, clazz);
		List<BcelShadow> closures = new ArrayList<BcelShadow>();
		List<BcelShadow> shadowsToRemove = new ArrayList<BcelShadow>();
		
		for (BcelShadow shadow : shadows) {
			if (shadow.getKind() == Shadow.StaticInitialization ||
					shadow.getKind() == Shadow.ExceptionHandler)
				continue;

			if (shadow.getKind() == Shadow.ConstructorCall) {
			   type2enclosingShadow.put(shadow.getSignature().getDeclaringType().resolve(world), shadow.getEnclosingShadow());
			   continue;
			}

			for (AnnotationAJ ann : shadow.getSignature().resolve(world).getAnnotations()) {
				if (Closure.class.getName().equals(ann.getTypeName())) {
					closures.add(shadow);
					shadow.setNullTarget();
					break;
				}
			}
		}

		for (BcelShadow closure : closures)
		    for (BcelShadow shadow : shadows)
			if (closure.equals(shadow.getEnclosingShadow())) {
				Shadow closureEnclosingShadow = type2enclosingShadow.get(closure.getEnclosingType());
				if (closureEnclosingShadow != null ) {
					shadow.setEnclosingCodeSignature(closureEnclosingShadow.getMatchingSignature());
				}
				else {
					type2closure.put(closure.getEnclosingType(), shadow);
				}

				break;
			}

		for (BcelShadow shadow : shadows) {
			if (ResolvedType.forName(JoinpointWrapper.class.getName()).equals(shadow.getSignature().getDeclaringType().resolve(world).getSuperclass()) &&
					(shadow.getKind() == Shadow.ConstructorCall || shadow.getKind() == Shadow.ConstructorExecution || shadow.getKind() == Shadow.Initialization || shadow.getKind() == Shadow.PreInitialization)) {
				shadowsToRemove.add(shadow);
			}
		}
		shadows.removeAll(shadowsToRemove);

		for (Map.Entry<ResolvedType, BcelShadow> entry : type2closure.entrySet()) {
		    Shadow enclosingShadow = type2enclosingShadow.get(entry.getKey());
		    if (enclosingShadow != null) {
		       entry.getValue().setEnclosingCodeSignature(enclosingShadow.getMatchingSignature());
		       type2closure.remove(entry.getKey());
		    }
		}

		return shadows;
	}
}
