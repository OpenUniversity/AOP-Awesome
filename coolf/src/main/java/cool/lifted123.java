package cool;

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

@SuppressWarnings("all") final class lifted123 extends Strategy 
{ 
  TermReference n_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail245:
    { 
      term = gen_method_state_0_1.instance.invoke(context, term, n_44.value);
      if(term == null)
        break Fail245;
      if(true)
        return term;
    }
    return null;
  }
}