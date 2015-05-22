package cjp;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.java_front.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class joinpoint_params_to_string_0_0 extends Strategy 
{ 
  public static joinpoint_params_to_string_0_0 instance = new joinpoint_params_to_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("joinpoint_params_to_string_0_0");
    Fail123:
    { 
      term = map_1_0.instance.invoke(context, term, lifted23.instance);
      if(term == null)
        break Fail123;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail123;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}