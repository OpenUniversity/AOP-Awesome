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

@SuppressWarnings("all") final class lifted50 extends Strategy 
{ 
  TermReference d_25;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail298:
    { 
      term = add_local_vars_0_1.instance.invoke(context, term, d_25.value);
      if(term == null)
        break Fail298;
      if(true)
        return term;
    }
    return null;
  }
}