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

@SuppressWarnings("all") final class lifted7 extends Strategy 
{ 
  TermReference p_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail339:
    { 
      term = process_method_param_0_1.instance.invoke(context, term, p_77.value);
      if(term == null)
        break Fail339;
      if(true)
        return term;
    }
    return null;
  }
}