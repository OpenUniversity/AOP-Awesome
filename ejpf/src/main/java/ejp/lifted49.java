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

@SuppressWarnings("all") final class lifted49 extends Strategy 
{ 
  TermReference n_25;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail297:
    { 
      lifted50 lifted500 = new lifted50();
      lifted500.n_25 = n_25;
      term = try_1_0.instance.invoke(context, term, lifted500);
      if(term == null)
        break Fail297;
      if(true)
        return term;
    }
    return null;
  }
}