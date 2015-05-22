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

@SuppressWarnings("all") public class gen_synthetic_method_name_0_0 extends Strategy 
{ 
  public static gen_synthetic_method_name_0_0 instance = new gen_synthetic_method_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_synthetic_method_name_0_0");
    Fail133:
    { 
      IStrategoTerm q_25 = null;
      q_25 = term;
      term = next_random_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail133;
      term = abs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail133;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail133;
      term = (IStrategoTerm)termFactory.makeListCons(q_25, termFactory.makeListCons(term, (IStrategoList)cjp.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail133;
      term = debug_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail133;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}