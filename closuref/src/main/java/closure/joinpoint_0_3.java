package closure;

import java.util.HashMap;
import java.util.Map;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

import closure.transform.pp_aspectj_string_0_0;

public class joinpoint_0_3 extends Strategy {
	Map<String, String> name2returnType = new HashMap<String, String>();
	Map<String, String> name2exceptions = new HashMap<String, String>();

	public static joinpoint_0_3 instance = new joinpoint_0_3();

	@Override
	public IStrategoTerm invoke(Context ctx, IStrategoTerm term1, IStrategoTerm term2, IStrategoTerm term3, IStrategoTerm term4) {
		String joinpointName = toString(pp_aspectj_string_0_0.instance.invoke(ctx, term1));
		String joinpointParams = toString(term2);
		String returnValue = toString(pp_aspectj_string_0_0.instance.invoke(ctx, term3));
		String thrownExceptions = toString(pp_aspectj_string_0_0.instance.invoke(ctx, term4));
		System.out.println("joinpointName = " + joinpointName);
		System.out.println("returnValue = " + returnValue);
		System.out.println("thrownExceptions = " + thrownExceptions);
		System.out.println("joinpointParams = " + joinpointParams);

		name2returnType.put(joinpointName, returnValue);
		name2exceptions.put(joinpointName, thrownExceptions);
		// TODO: add imports from the aspect that contains the joinpoint
		// TODO: consider arguments

		return term1;
	}

	private static String toString(IStrategoTerm term) {
		String termAsString = term.toString();
		return termAsString.substring(1, termAsString.length()-1).replaceAll("\\\\\"", "\"");
	}

	public String getReturnTypeForJoinpoint(String name) {
		return name2returnType.get(name);
	}

	public String getExceptionForJoinpoint(String name) {
		return name2exceptions.get(name);
	}

	public boolean isJoinpointDeclared(String name) {
		return name2returnType.keySet().contains(name);
	}
}
