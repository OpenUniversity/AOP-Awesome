package org.aspectj.weaver.bcel;

import java.util.List;

import org.aspectj.weaver.ConcreteTypeMunger;
import org.aspectj.weaver.IClassFileProvider;
import org.aspectj.weaver.ShadowMunger;
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

	before(BcelWeaver weaver, IClassFileProvider input): execution(* BcelWeaver.weave(..)) && args(input) && this(weaver) {
		weaver.MM.setInputFiles(input);
	}
}
