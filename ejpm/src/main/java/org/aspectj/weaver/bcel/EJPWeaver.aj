package org.aspectj.weaver.bcel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;
import org.aspectj.apache.bcel.classfile.annotation.AnnotationGen;
import org.aspectj.apache.bcel.classfile.annotation.ElementValue;
import org.aspectj.bridge.MessageUtil;
import org.aspectj.weaver.AdviceKind;
import org.aspectj.weaver.AjcMemberMaker;
import org.aspectj.weaver.AnnotationAJ;
import org.aspectj.weaver.BindingScope;
import org.aspectj.weaver.IClassFileProvider;
import org.aspectj.weaver.ResolvedMember;
import org.aspectj.weaver.ResolvedMemberImpl;
import org.aspectj.weaver.ResolvedPointcutDefinition;
import org.aspectj.weaver.ResolvedType;
import org.aspectj.weaver.UnresolvedType;
import org.aspectj.weaver.World;
import org.aspectj.weaver.bcel.AnnotationAccessVar;
import org.aspectj.weaver.bcel.BcelAdvice;
import org.aspectj.weaver.bcel.BcelAnnotation;
import org.aspectj.weaver.bcel.BcelMethod;
import org.aspectj.weaver.bcel.BcelShadow;
import org.aspectj.weaver.bcel.BcelVar;
import org.aspectj.weaver.bcel.LazyClassGen;
import org.aspectj.weaver.bcel.LazyMethodGen;
import org.aspectj.weaver.bcel.UnwovenClassFile;
import org.aspectj.weaver.patterns.AndPointcut;
import org.aspectj.weaver.patterns.DeclareSoft;
import org.aspectj.weaver.patterns.ExactTypePattern;
import org.aspectj.weaver.patterns.FormalBinding;
import org.aspectj.weaver.patterns.OrPointcut;
import org.aspectj.weaver.patterns.Pointcut;

import org.openu.awesome.platform.AbstractWeaver;
import org.openu.awesome.platform.IEffect;
import org.openu.awesome.platform.MultiMechanism;

public aspect EJPWeaver extends AbstractWeaver {

	private Logger logger = Logger.getLogger(EJPWeaver.class.getName());
	private HashMap<ResolvedType, MultiMap> type2method2pointcutarg = new HashMap<ResolvedType, MultiMap>();
	private EJPTypeMunger typeMunger;
	
	private List<DeclareSoft> declareSofts = new LinkedList<DeclareSoft>();
	private List<BcelShadow> shadows = new ArrayList<BcelShadow>();

	private Set<ResolvedMember> visitedMethods = new HashSet<ResolvedMember>();
	private List<NoMatchTuple> tuples = new ArrayList<NoMatchTuple>();

	private List<RequiredAdvice> requiredAdvices = new ArrayList<RequiredAdvice>();
	private UnresolvedType METHOD_ANNO_UTYPE = UnresolvedType.forName("ejps.runtime.MethodAnno");
	private UnresolvedType EXPLICIT_JOINPOINT_UTYPE = UnresolvedType.forName("ejps.runtime.ExplicitJoinPoint");

	after(ResolvedType resolvedType): call(* *.collectCrosscuttingMembers(..)) && target(resolvedType) {
		Iterator<ResolvedMember> methodIterator = resolvedType.getMethods(false, false);
		while(methodIterator.hasNext()) {
			ResolvedMember rm = methodIterator.next();
			AnnotationAJ ann = rm.getAnnotationOfType(EXPLICIT_JOINPOINT_UTYPE);
			if (ann != null) {
				Pattern pattern = Pattern.compile("\\[(.+)\\]");
				Matcher matcher = pattern.matcher(ann.getStringFormOfValue("handles"));
				/*System.out.println("handles: " + Pointcut.fromString(
						String.format("call(* *(..)) && withincode(@ejps.runtime.ExplicitScopedJoinPoint * ejp$%s$%s(..))",
								(rm.getDeclaringType().getPackageName() == null || rm.getDeclaringType().getPackageName().isEmpty() ?
										"" : rm.getDeclaringType().getPackageName().replaceAll("\\.", "$") + "$") + 
								rm.getDeclaringType().getClassName(),
								rm.getName())));*/
				if (matcher.find()) {
					String[] commaSeparatedExceptions = matcher.group(1).split(",");
					for (String exception : commaSeparatedExceptions)
						declareSofts.add(new DeclareSoft(
								new ExactTypePattern(UnresolvedType.forName(exception), true, false),
								Pointcut.fromString(
										String.format("call(* *(..)) && withincode(@ejps.runtime.ExplicitScopedJoinPoint * ejp$%s$%s(..))",
												(rm.getDeclaringType().getPackageName() == null || rm.getDeclaringType().getPackageName().isEmpty() ?
														"" : rm.getDeclaringType().getPackageName().replaceAll("\\.", "$") + "$") + 
												rm.getDeclaringType().getClassName(),
												rm.getName()))));
				}
			}
		}
	}
	
	List<DeclareSoft> around(): execution(* World.getDeclareSoft()) {
		List<DeclareSoft> result = proceed();
		result.addAll(declareSofts);
		return result;
	}

	after(LazyClassGen lazyClassGen): execution(* MultiMechanism.transform(LazyClassGen)) && args(lazyClassGen) {
		for (RequiredAdvice requiredAdvice : requiredAdvices) {
			for (BcelShadow shadow : shadows) {
				if (requiredAdvice.getAdvice().match(shadow, world)) {

					if (requiredAdvice.getId() == null) {
						requiredAdvice.match();
					}
					else {
						requiredAdvice.getAdvice().specializeOn(shadow);

						BcelVar bc = requiredAdvice.getAdvice().getExposedStateAsBcelVars(false)[0];
						AnnotationAccessVar accv = (AnnotationAccessVar) bc;
						BcelAnnotation banno = (BcelAnnotation) ((BcelMethod) accv.getMember()).getAnnotationOfType(METHOD_ANNO_UTYPE);
						String id = banno.getStringFormOfValue("value");

						if (requiredAdvice.getId().equals(id)) {
							requiredAdvice.match();
						}
					}
				}
			}
		}
	}

	after(): execution(* org.aspectj.weaver.bcel.BcelWeaver.allWeavingComplete()) {
		for (RequiredAdvice my : requiredAdvices) {
			if (!my.isMatchFound()) {
				world.getMessageHandler().handleMessage(
						MessageUtil.error(my.getErrorMessage(),
								my.getAdvice().getSourceLocation()));
			}
		}
	}
 	
	after(): execution(void MultiMechanism.setInputFilesPreWeaving(..)) {
		for (ResolvedType rt : type2method2pointcutarg.keySet()) {
			for (String pcName : (Set<String>)type2method2pointcutarg.get(rt).keySet()) {
				ResolvedPointcutDefinition pcDef = getPointcutDef(rt, pcName);
				if (pcDef == null) {
					System.out.println("error: could not find pointcut " + pcName);
					continue;
				}
				Pointcut pc = composePointcut((List<Pointcut>)type2method2pointcutarg.get(rt).get(pcName));
				if (pc == null) {
					System.out.println("error: couldn't compose pointcut");
					continue;
				}
				pcDef.setPointcut(pc);
			}
		}
	}

	private Pointcut composePointcut(List<Pointcut> pointcuts) {
		Iterator<Pointcut> iter = pointcuts.iterator();
		if (!iter.hasNext())
			return null;
		Pointcut result = iter.next();
		while(iter.hasNext()) {
			result = new OrPointcut(result, iter.next());
		}
		return result;
	}
	
	private ResolvedPointcutDefinition getPointcutDef(ResolvedType rt, String pcName) {
		for (ResolvedMember rm : rt.getDeclaredPointcuts()) {
			if (rm instanceof ResolvedPointcutDefinition && pcName.equals(rm.getName()))
				return (ResolvedPointcutDefinition) rm;
		}
		return null;
	}
	
	private static FormalBinding[] extractBindings(UnresolvedType[] params, String[] argumentNames) {
		// assert debug info was here
		if (argumentNames.length != params.length) {
		}

		List<FormalBinding> bindings = new ArrayList<FormalBinding>();
		for (int i = 0; i < argumentNames.length; i++) {
			String argumentName = argumentNames[i];
			UnresolvedType argumentType = params[i];

			bindings.add(shouldBind(argumentType) ?
					new FormalBinding.ImplicitFormalBinding(argumentType, argumentName, i) :
					new FormalBinding(argumentType, argumentName, i));
		}

		return bindings.toArray(new FormalBinding[] {});
	}

	private static boolean shouldBind(UnresolvedType argumentType) {
		// do not bind JoinPoint / StaticJoinPoint /
		// EnclosingStaticJoinPoint
		// TODO solve me : this means that the JP/SJP/ESJP cannot appear as
		// binding
		// f.e. when applying advice on advice etc
		return AjcMemberMaker.TYPEX_JOINPOINT.equals(argumentType)
				|| AjcMemberMaker.TYPEX_PROCEEDINGJOINPOINT.equals(argumentType)
				|| AjcMemberMaker.TYPEX_STATICJOINPOINT.equals(argumentType)
				|| AjcMemberMaker.TYPEX_ENCLOSINGSTATICJOINPOINT.equals(argumentType)
				|| AjcMemberMaker.AROUND_CLOSURE_TYPE.equals(argumentType);
	}

	@Override
	public void setInputFilesPreWeaving(List<ResolvedType> files) {
		UnresolvedType POINTCUT_UTYPE = UnresolvedType.forName("org.aspectj.lang.annotation.Pointcut");
		
		for (ResolvedType resolvedType : files) {

			for (Iterator<ResolvedMember> iter = resolvedType.getMethods(true, true); iter.hasNext(); ) {
				ResolvedMember methodGen = iter.next();
				if (visitedMethods.contains(methodGen))
					continue;

				visitedMethods.add(methodGen);

				ResolvedMemberImpl bcelMethod = (ResolvedMemberImpl)methodGen;
				for (AnnotationAJ annotation : bcelMethod.getAnnotations()) {

					if ("ejps.runtime.Pointcutargs".equals(annotation.getTypeName())) {

						Pointcut pointcutToAdd = Pointcut.fromString(annotation.getStringFormOfValue("expr"))
						.resolve(new BindingScope(
								bcelMethod.getDeclaringType().resolve(world),
								bcelMethod.getSourceContext(),
								extractBindings(bcelMethod.getParameterTypes(), bcelMethod.getParameterNames())));

						ResolvedType rt = world.resolve(
								annotation.getStringFormOfValue("aspect") + "$" + annotation.getStringFormOfValue("joinpoint"));
						
						if (!type2method2pointcutarg.containsKey(rt)) {
							type2method2pointcutarg.put(
									rt,
									new MultiHashMap());
						}
						
						MultiMap method2pointcut = type2method2pointcutarg.get(rt);
						method2pointcut.put(
								annotation.getStringFormOfValue("pointcut"),
								pointcutToAdd);

						continue;
					}

					if ("ejps.runtime.NoMatch".equals(annotation.getTypeName())) {

						Pointcut resolvedPointcut =
								Pointcut.fromString(bcelMethod.getAnnotationOfType(POINTCUT_UTYPE).getStringFormOfValue("value"))
								.resolve(new BindingScope(
										bcelMethod.getDeclaringType().resolve(world),
										bcelMethod.getSourceContext(),
										extractBindings(bcelMethod.getParameterTypes(), bcelMethod.getParameterNames())));

						tuples.add(new NoMatchTuple(
								new BcelAdvice(AdviceKind.Before, resolvedPointcut, bcelMethod, 0, 0, 0, null, resolvedType),
								annotation.getStringFormOfValue("error"),
								annotation.getStringFormOfValue("expr"),
								bcelMethod,
								getGranularity(annotation.getStringFormOfValue("granularity"))));

						continue;
					}
				}
			}
		}
	}

	private NoMatchGranularity getGranularity(String granularity) {
		if ("class".equals(granularity))
			return NoMatchGranularity.CLASS;
		if ("ejp".equals(granularity))
			return NoMatchGranularity.EJP;
		if ("method".equals(granularity))
			return NoMatchGranularity.METHOD;
		if ("package".equals(granularity))
			return NoMatchGranularity.PACKAGE;

		throw new IllegalArgumentException("unknown nomatch granularity: " + granularity);
	}

	public void setInputFiles(IClassFileProvider input) {

		super.setInputFiles(input);
		if (typeMunger == null)
			typeMunger = new EJPTypeMunger();
		else
			typeMunger.clear();

		Set<UnresolvedType> allClasses = new HashSet<UnresolvedType>();
		for (Iterator i = input.getClassFileIterator(); i.hasNext();) {
			UnwovenClassFile classFile = (UnwovenClassFile) i.next();
			UnresolvedType clazz = Utils.getUnresolvedType(classFile);
			allClasses.add(clazz);
		}

		for (UnresolvedType classType : allClasses) {
			typeMunger.process(world.resolve(classType));

			ResolvedType res = world.resolve(classType);
			for (ResolvedMember rm : res.getDeclaredMethods()) {
				ResolvedMemberImpl enclMethod = (ResolvedMemberImpl) rm;

				AnnotationGen ann = getPointcutargsAnnotation(enclMethod);
				if (ann == null) {
					continue;
				}
				ElementValue aspectNameVal = Utils.getAnnotationElementValue(ann, "aspect");
				ElementValue joinpointVal = Utils.getAnnotationElementValue(ann, "joinpoint");
				ElementValue pointcutVal = Utils.getAnnotationElementValue(ann, "pointcut");
				ElementValue exprVal = Utils.getAnnotationElementValue(ann, "expr");
				String fullPointcutName = String.format("%s.%s",
						joinpointVal.stringifyValue(), pointcutVal.stringifyValue());

				ResolvedType rt = world.resolve(UnresolvedType.forName(aspectNameVal.stringifyValue()));
				for (ResolvedMember resolvedMember : rt.getDeclaredPointcuts()) {
					if (fullPointcutName.equals(resolvedMember.getName())) {
						ResolvedPointcutDefinition rpd = (ResolvedPointcutDefinition) resolvedMember;
						Pointcut originalPointcut = rpd.getPointcut();
						if ("".equals(originalPointcut.toString())) {
							rpd.setPointcut(
									Pointcut.fromString(exprVal.stringifyValue()));
						}
						else {
							rpd.setPointcut(new OrPointcut(
									originalPointcut,
									Pointcut.fromString(exprVal.stringifyValue())));
						}
						continue;
					}
				}
			}
		}
	}
	
	List<BcelShadow> around(MultiMechanism mm, LazyClassGen cg) : reifyClass(mm, cg) {
			for (Object mg : cg.getMethodGens()) {
				LazyMethodGen cmg = (LazyMethodGen) mg;
				if (cmg.getMemberView() == null)
					continue;
				
				for (AnnotationAJ aaj : cmg.getMemberView().getAnnotations()) {
					if ("org.aspectj.lang.annotation.Pointcut".equals(aaj.getTypeName())) {
						String result = typeMunger.getExprForPointcutargs(cg.getType(), cmg.getName());
					}
				}
			}
			return proceed(mm, cg);
	}

	public List<IEffect> match(BcelShadow shadow) {
		shadows.add(shadow);
		
		for (NoMatchTuple tuple : tuples) {
			BcelAdvice conditionalShadowMunger = tuple.getConditionalShadowMunger();
			if (conditionalShadowMunger.match(shadow, world)) {
				conditionalShadowMunger.specializeOn(shadow);

				switch(tuple.getGranularity()) {
				case CLASS:
					handleNoMatchByClass(tuple, conditionalShadowMunger);
					break;
				case EJP:
					handleNoMatchByEjp(tuple, conditionalShadowMunger);
					break;
				case METHOD:
					handleNoMatchByMethod(tuple, conditionalShadowMunger);
					break;
				case PACKAGE:
					handleNoMatchByPackage(tuple, conditionalShadowMunger);
					break;
				default:
					throw new IllegalArgumentException("unknown granularity: " + tuple.granularity);
				}
			}
		}
		
		return Collections.emptyList();
	}

	private void handleNoMatchByPackage(NoMatchTuple tuple, BcelAdvice conditionalShadowMunger) {
		BcelVar bc = conditionalShadowMunger.getExposedStateAsBcelVars(false)[0];

		if ("".equals(bc.getType().getPackageName())) {
			System.out.println("empty package is not supported for 'by pacakge' nomatch statement");
			return;
		}

		ResolvedMemberImpl bcelMethod = tuple.getMethod();
		Pointcut requiredShadowMunger = Pointcut.fromString(tuple.getRequiredShadowMunger());
		String pattern = String.format("within(%s.*)", bc.getType().getPackageName());
		Pointcut additionalShadowMunger = Pointcut.fromString(pattern);

		Pointcut finalPointcut = new AndPointcut(additionalShadowMunger, requiredShadowMunger)
		.resolve(new BindingScope(
				bcelMethod.getDeclaringType().resolve(world),
				bcelMethod.getSourceContext(),
				new FormalBinding[0]));

//		System.out.println("finalPointcut = " + finalPointcut);

		requiredAdvices.add(new RequiredAdvice(
				new BcelAdvice(AdviceKind.Before, finalPointcut, bcelMethod, 0, 0, 0, null, world.resolve(bcelMethod.getDeclaringType())),
				tuple.getErrorMessage(),
				null));
	}

	private void handleNoMatchByClass(NoMatchTuple tuple, BcelAdvice conditionalShadowMunger) {
		BcelVar bc = conditionalShadowMunger.getExposedStateAsBcelVars(false)[0];

		ResolvedMemberImpl bcelMethod = tuple.getMethod();
		Pointcut requiredShadowMunger = Pointcut.fromString(tuple.getRequiredShadowMunger());
		String pattern = String.format("within(%s)", bc.getType().getRawName());
		Pointcut additionalShadowMunger = Pointcut.fromString(pattern);

		Pointcut finalPointcut = new AndPointcut(additionalShadowMunger, requiredShadowMunger)
		.resolve(new BindingScope(
				bcelMethod.getDeclaringType().resolve(world),
				bcelMethod.getSourceContext(),
				new FormalBinding[0]));

//		System.out.println("finalPointcut = " + finalPointcut);

		requiredAdvices.add(new RequiredAdvice(
				new BcelAdvice(AdviceKind.Before, finalPointcut, bcelMethod, 0, 0, 0, null, world.resolve(bcelMethod.getDeclaringType())),
				tuple.getErrorMessage(),
				null));
	}

	private void handleNoMatchByMethod(NoMatchTuple tuple, BcelAdvice conditionalShadowMunger) {
		BcelVar bc = conditionalShadowMunger.getExposedStateAsBcelVars(false)[0];
		AnnotationAccessVar accv = (AnnotationAccessVar) bc;
		BcelAnnotation methodAnnoAnn = (BcelAnnotation) ((BcelMethod) accv.getMember()).getAnnotationOfType(METHOD_ANNO_UTYPE);
		
		ResolvedMemberImpl bcelMethod = tuple.getMethod();
		Pointcut requiredShadowMunger = Pointcut.fromString(tuple.getRequiredShadowMunger());
		String pattern = "@withincode(anno)";
		Pointcut additionalShadowMunger = Pointcut.fromString(pattern);
		
		Pointcut finalPointcut = new AndPointcut(additionalShadowMunger, requiredShadowMunger)
		.resolve(new BindingScope(
				bcelMethod.getDeclaringType().resolve(world),
				bcelMethod.getSourceContext(),
				extractBindings(bcelMethod.getParameterTypes(), bcelMethod.getParameterNames())));
		
//		System.out.println("finalPointcut = " + finalPointcut);
		
		requiredAdvices.add(new RequiredAdvice(
				new BcelAdvice(AdviceKind.Before, finalPointcut, bcelMethod, 0, 0, 0, null, world.resolve(bcelMethod.getDeclaringType())),
				tuple.getErrorMessage(),
				methodAnnoAnn.getStringFormOfValue("value")));
	}

	private void handleNoMatchByEjp(NoMatchTuple tuple, BcelAdvice conditionalShadowMunger) {
		BcelVar bc = conditionalShadowMunger.getExposedStateAsBcelVars(false)[0];
		AnnotationAccessVar accv = (AnnotationAccessVar) bc;
		BcelAnnotation methodAnnoAnn = (BcelAnnotation) ((BcelMethod) accv.getMember()).getAnnotationOfType(METHOD_ANNO_UTYPE);
		
		ResolvedMemberImpl bcelMethod = tuple.getMethod();
		Pointcut requiredShadowMunger = Pointcut.fromString(tuple.getRequiredShadowMunger());
		String pattern = "@withincode(anno) && @withincode(ejps.runtime.ExplicitScopedJoinPoint)";
		Pointcut additionalShadowMunger = Pointcut.fromString(pattern);
		
		Pointcut finalPointcut = new AndPointcut(additionalShadowMunger, requiredShadowMunger)
		.resolve(new BindingScope(
				bcelMethod.getDeclaringType().resolve(world),
				bcelMethod.getSourceContext(),
				extractBindings(bcelMethod.getParameterTypes(), bcelMethod.getParameterNames())));
		
//		System.out.println("finalPointcut = " + finalPointcut);
		
		requiredAdvices.add(new RequiredAdvice(
				new BcelAdvice(AdviceKind.Before, finalPointcut, bcelMethod, 0, 0, 0, null, world.resolve(bcelMethod.getDeclaringType())),
				tuple.getErrorMessage(),
				methodAnnoAnn.getStringFormOfValue("value")));
	}

	public List<IEffect> order(BcelShadow shadow, List<IEffect> effects) {
		return effects;
	}
	
	private AnnotationGen getPointcutargsAnnotation(ResolvedMember method) {
		if (method == null)
			return null;
		for (AnnotationAJ ann : method.getAnnotations())
			if (Utils.EJP_Pointcutargs.getName().equals(ann.getTypeName()))
				return ((BcelAnnotation) ann). getBcelAnnotation();
		return null;
	}
	
	private class NoMatchTuple {
		private BcelAdvice conditionalShadowMunger;
		private String errorMessage;
		private String requiredShadowMunger;
		private NoMatchGranularity granularity;

		private ResolvedMemberImpl method;
		
		public NoMatchTuple(BcelAdvice conditionalShadowMunger, String message, String requiredShadowMunger, ResolvedMemberImpl method, NoMatchGranularity granularity) {
			this.conditionalShadowMunger = conditionalShadowMunger;
			this.errorMessage = message;
			this.requiredShadowMunger = requiredShadowMunger;
			this.method = method;
			this.granularity = granularity;
		}
		
		public BcelAdvice getConditionalShadowMunger() { return conditionalShadowMunger; }
		public String getErrorMessage() { return errorMessage; }
		public String getRequiredShadowMunger() { return requiredShadowMunger; }
		public ResolvedMemberImpl getMethod() { return method; }
		public NoMatchGranularity getGranularity() { return granularity; }
	}
	
	private class RequiredAdvice {
		private BcelAdvice advice;
		private String errorMessage;
		private String id;

		private boolean matchFound;
		
		public RequiredAdvice(BcelAdvice advice, String errorMessage, String id) {
			this.advice = advice;
			this.errorMessage = errorMessage;
			this.id = id;
		}
		
		public void match() {
			matchFound = true;
		}
		
		public BcelAdvice getAdvice() { return advice; }
		public String getErrorMessage() { return errorMessage; }
		public String getId() { return id; }
		public boolean isMatchFound() { return matchFound; }
	}

	private enum NoMatchGranularity {
		PACKAGE,
		CLASS,
		METHOD,
		EJP
	}
}
