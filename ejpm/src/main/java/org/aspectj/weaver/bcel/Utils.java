package org.aspectj.weaver.bcel;

import org.aspectj.apache.bcel.classfile.annotation.AnnotationGen;
import org.aspectj.apache.bcel.classfile.annotation.ElementValue;
import org.aspectj.apache.bcel.classfile.annotation.NameValuePair;
import org.aspectj.weaver.AnnotationAJ;
import org.aspectj.weaver.ResolvedMember;
import org.aspectj.weaver.ResolvedType;
import org.aspectj.weaver.UnresolvedType;
import org.aspectj.weaver.bcel.BcelAnnotation;
import org.aspectj.weaver.bcel.LazyClassGen;
import org.aspectj.weaver.bcel.UnwovenClassFile;

public class Utils {

	public final static UnresolvedType EJP_ExplicitJoinPoint =
			UnresolvedType.forName("ejps.runtime.ExplicitJoinPoint");

	public final static UnresolvedType EJP_ExplicitScopedJoinPoint =
			UnresolvedType.forName("ejps.runtime.ExplicitScopedJoinPoint");

	public final static UnresolvedType EJP_Pointcutargs =
			UnresolvedType.forName("ejps.runtime.Pointcutargs");
	
	public final static UnresolvedType AJ_Pointcut =
			UnresolvedType.forName("org.aspectj.lang.annotation.Pointcut");

	public final static UnresolvedType[] EJP_Method_Annotations = new UnresolvedType[]
			{ EJP_ExplicitJoinPoint, EJP_ExplicitScopedJoinPoint, EJP_Pointcutargs };
	
	public static AnnotationGen getEJPAnnotation(ResolvedMember method) {
		AnnotationGen result = null;
		if (method == null)
			return result;
		AnnotationAJ[] anns = method.getAnnotations();
		for (AnnotationAJ ann : anns)
			for (UnresolvedType type : EJP_Method_Annotations)
				if (ann.getTypeName().equals(type.getName())) {
					result = ((BcelAnnotation) ann).getBcelAnnotation();
					break;
				}
		return result;
	}

	public static ElementValue getAnnotationElementValue(AnnotationGen annotation,
			String elementName) {
		for (NameValuePair nvp : annotation.getValues()) {
			if (nvp.getNameString().equals(elementName))
				return (ElementValue) nvp.getValue();
		}
		return null;
	}
	
	public static UnresolvedType getUnresolvedType(ResolvedType type) {
		//System.out.println("FROM ResolvedType:"+type.getName());
		return UnresolvedType.forName(type.getName());
	}

	public static UnresolvedType getUnresolvedType(LazyClassGen clazz) {
		//System.out.println("FROM LazyClassGen:"+clazz.getClassName());
		return UnresolvedType.forName(clazz.getClassName());
	}
		

	public static UnresolvedType getUnresolvedType(UnwovenClassFile classFile) {
		//System.out.println("FROM UnwovenClassFile:"+classFile.getClassName());
		return UnresolvedType.forName(classFile.getClassName());
	}
	
	public static UnresolvedType getUnresolvedType(Class<?> clazz) {
		//System.out.println("FROM UnwovenClassFile:"+classFile.getClassName());
		return UnresolvedType.forName(clazz.getName());
	}
}
