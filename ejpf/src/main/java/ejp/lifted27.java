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

@SuppressWarnings("all") final class lifted27 extends Strategy 
{ 
  TermReference n_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail319:
    { 
      term = add_local_vars_0_1.instance.invoke(context, term, n_77.value);
      if(term == null)
        break Fail319;
      if(true)
        return term;
    }
    return null;
  }
}