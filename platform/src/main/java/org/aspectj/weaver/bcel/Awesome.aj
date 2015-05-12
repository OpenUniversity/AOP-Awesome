package org.aspectj.weaver.bcel;

import java.util.Iterator;
import java.util.List;

import org.aspectj.apache.bcel.generic.FieldInstruction;
import org.aspectj.apache.bcel.generic.InstructionConstants;
import org.aspectj.apache.bcel.generic.InstructionFactory;
import org.aspectj.apache.bcel.generic.InstructionHandle;
import org.aspectj.apache.bcel.generic.InstructionList;
import org.aspectj.apache.bcel.generic.InstructionTargeter;
import org.aspectj.apache.bcel.generic.ObjectType;
import org.aspectj.bridge.ISourceLocation;
import org.aspectj.weaver.Advice;
import org.aspectj.weaver.AdviceKind;
import org.aspectj.weaver.ConcreteTypeMunger;
import org.aspectj.weaver.Member;
import org.aspectj.weaver.ResolvedMember;
import org.aspectj.weaver.ShadowMunger;
import org.aspectj.weaver.UnresolvedType;
import org.openu.awesome.platform.IEffect;
import org.openu.awesome.platform.MultiMechanism;

public privileged aspect Awesome {

	private MultiMechanism BcelWeaver.MM;

	after(BcelWeaver weaver, BcelWorld world): execution(BcelWeaver.new(BcelWorld)) && args(world) && target(weaver) {
		weaver.MM = new MultiMechanism(world);
	}

	boolean around(BcelWeaver weaver, BcelWorld world, LazyClassGen clazz, List<ShadowMunger> shadowMungers,
			List<ConcreteTypeMunger> typeMungers, List<ConcreteTypeMunger> lateTypeMungers, boolean inReweavableMode):
		call(* BcelClassWeaver.weave(..)) && args(world, clazz, shadowMungers, typeMungers, lateTypeMungers, inReweavableMode) && this(weaver) {
		return weaver.MM.transform(clazz);
	}

}
