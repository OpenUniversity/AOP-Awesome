package closure;

import org.strategoxt.lang.JavaInteropRegisterer;
import org.strategoxt.lang.Strategy;

public class InteropRegisterer extends JavaInteropRegisterer {

	public InteropRegisterer(Strategy ... strategies) {
		super(strategies);
	}
}
