package org.aspectj.weaver.bcel;

import org.aspectj.asm.AsmManager;
import org.aspectj.asm.IRelationship;
import org.aspectj.weaver.Advice;
import org.aspectj.weaver.AnnotationAJ;
import org.aspectj.weaver.Shadow;
import org.aspectj.weaver.ShadowMunger;
import org.aspectj.weaver.model.AsmRelationshipProvider;

import lom.runtime.BridgedSourceLocation;

public aspect LOM {
	after(AsmManager model, Shadow matchedShadow, ShadowMunger munger) returning (IRelationship foreward):
		cflow(execution(static void addAdvisedRelationship(AsmManager, Shadow, ShadowMunger)) && args(model, matchedShadow, munger))
		&& call(IRelationship get(String, IRelationship.Kind, String, boolean, boolean)) {
		if (foreward != null) {
			AnnotationAJ ann = getSourceLocation((Advice)munger);
			if (ann != null) {
				foreward.setSourceLine(Integer.parseInt(ann.getStringFormOfValue("line")));
			}
		}
	}

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
