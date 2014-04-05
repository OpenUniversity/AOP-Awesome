package ejpplugin;

import org.aspectj.weaver.UnresolvedType;
import org.aspectj.weaver.bcel.LazyClassGen;
import org.aspectj.weaver.bcel.LazyMethodGen;

public class Wrapper {

	private UnresolvedType targetType;
	private String targetMethodName;
	
	public Wrapper(UnresolvedType targetType, String joinpointName, String pointcutName) {
		this.targetType = targetType;
		this.targetMethodName = String.format("%s.%s", joinpointName, pointcutName);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LazyMethodGen) {
			LazyMethodGen method = (LazyMethodGen) obj;
			LazyClassGen clazz = method.getEnclosingClass();
			return targetType.equals(UnresolvedType.forName(clazz.getName()))
					&& targetMethodName.equals(method.getName());
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Wrapper: " + targetType.getName() + " " + targetMethodName;
	}
}