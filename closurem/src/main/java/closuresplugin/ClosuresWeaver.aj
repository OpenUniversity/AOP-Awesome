package closuresplugin;

import java.util.Collections;
import java.util.List;

import org.aspectj.weaver.bcel.BcelShadow;

import awesome.platform.AbstractWeaver;
import awesome.platform.IEffect;


public aspect ClosuresWeaver extends AbstractWeaver {

	public List<IEffect> match(BcelShadow shadow) {
		return Collections.emptyList();
	}

	public List<IEffect> order(BcelShadow shadow, List<IEffect> effects) {
		return null;
	}
}
