package org.aspectj.weaver.bcel;

import org.aspectj.asm.AsmManager;
import org.aspectj.weaver.Advice;
import org.aspectj.weaver.AnnotationAJ;
import org.aspectj.weaver.model.AsmRelationshipProvider;

import lom.runtime.BridgedSourceLocation;

public aspect LOM {

	String around(AsmManager asm, Advice advice):
		execution(* AsmRelationshipProvider.getHandle(AsmManager, Advice))
		&& args(asm, advice) {
		if (null == advice.handle) {
			AnnotationAJ ann = getSourceLocation(advice);
			if (ann != null) {
				advice.handle = ann.getStringFormOfValue("file");
				return advice.handle;
			}
		}
		return proceed(asm, advice);
	}

	public static AnnotationAJ getSourceLocation(Advice advice) {
		for (AnnotationAJ ann : advice.getSignature().getAnnotations()) {
			if (BridgedSourceLocation.class.getName().equals(ann.getTypeName())) {
				return ann;
			}
		}
		return null;
	}
}
