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

@SuppressWarnings("all") final class lifted48 extends Strategy 
{ 
  TermReference x_24;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail300:
    { 
      term = fetch_0_1.instance.invoke(context, term, x_24.value);
      if(term == null)
        break Fail300;
      if(true)
        return term;
    }
    return null;
  }
}