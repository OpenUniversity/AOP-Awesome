package ejp;

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

@SuppressWarnings("all") public class random_string_0_0 extends Strategy 
{ 
  public static random_string_0_0 instance = new random_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("random_string_0_0");
    Fail73:
    { 
      term = next_random_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail73;
      term = abs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail73;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail73;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}