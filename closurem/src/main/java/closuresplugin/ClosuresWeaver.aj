package closuresplugin;

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
import org.aspectj.weaver.CrosscuttingMembers;
import org.aspectj.weaver.ResolvedMember;
import org.aspectj.weaver.ResolvedMemberImpl;
import org.aspectj.weaver.ResolvedType;
import org.aspectj.weaver.ShadowMunger;
import org.aspectj.weaver.UnresolvedType;
import org.aspectj.weaver.bcel.BcelMethod;
import org.aspectj.weaver.bcel.BcelShadow;
import org.aspectj.weaver.CrosscuttingMembersSet;

import closures.runtime.Closure;
import closures.runtime.Joinpoint;
import closures.runtime.JoinpointSignature;
import awesome.platform.AbstractWeaver;
import awesome.platform.IEffect;


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
//				System.out.println("saw method:" + bcelMethod.toDebugString());
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
//							System.out.println("saw joinpoint sig:" + bcelMethod.toDebugString() + ", " + getArgumentTypes(ann.getStringFormOfValue("args")) + ", " + ann.getStringFormOfValue("name") +", " + bcelMethod.getParameterTypes()[0]);
							jpAndAfterReturningType.add(new Pair<NameAndArgumentType, UnresolvedType>(joinpointSignatureToNameAndArgumentType(ann), bcelMethod.getParameterTypes()[0]));
						}
					}

					if (AfterThrowing.class.getName().equals(annotation.getTypeName())) {
						AnnotationAJ ann = getJoinpointSignature(bcelMethod.getAnnotations());
						if (ann != null) {
//							System.out.println("saw joinpoint sig:" + bcelMethod.toDebugString() + ", " + getArgumentTypes(ann.getStringFormOfValue("args")) + ", " + ann.getStringFormOfValue("name") +", " + bcelMethod.getParameterTypes()[0]);
							jpAndAfterThrowingException.add(new Pair<NameAndArgumentType, UnresolvedType>(joinpointSignatureToNameAndArgumentType(ann), bcelMethod.getParameterTypes()[0]));
						}
					}

					if (Around.class.getName().equals(annotation.getTypeName())) {
						AnnotationAJ ann = getJoinpointSignature(bcelMethod.getAnnotations());
						if (ann != null) {
//							System.out.println("saw joinpoint sig while looking for around advices:" + bcelMethod.toDebugString() + ", " + getArgumentTypes(ann.getStringFormOfValue("args")) + ", " + ann.getStringFormOfValue("name") +", " + bcelMethod.getParameterTypes()[0]);
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
}
