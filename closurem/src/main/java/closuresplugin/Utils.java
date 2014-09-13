package closuresplugin;

import java.util.Iterator;

import org.aspectj.weaver.ResolvedMember;
import org.aspectj.weaver.ResolvedType;

public class Utils {

	public static boolean isConvertableFrom(ResolvedType type1, ResolvedType type2) {
		if (type1.isInterface() && type2.isInterface()) {
			return true; // Not sure about this..
//			return isInterfacesConvertable(type1, type2);
		}

		if (type1.isInterface()) {
			if (type2.isClass() && !type2.isFinal())
				return true;
		}

		if (type2.isInterface()) {
			if (type1.isClass() && !type1.isFinal())
				return true;
		}

		return type1.isConvertableFrom(type2);
	}

	private static boolean isInterfacesConvertable(ResolvedType type1, ResolvedType type2) {
		Iterator<ResolvedMember> methods = type1.getMethods(true,true);

		a: while(methods.hasNext()) {
			ResolvedMember method = methods.next();
			for (Iterator<ResolvedMember> methods2 = type2.getMethods(true, true); methods2.hasNext();) {
				ResolvedMember method2 = methods2.next();
				if (method.getSignature().equals(method2.getSignature()) &&
						method.getDeclaringType().equals(method2.getDeclaringType()))
					continue a;
			}
			return false;
		}

		return true;
	}
}
