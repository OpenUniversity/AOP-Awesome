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

@SuppressWarnings("all") final class lifted40 extends Strategy 
{ 
  TermReference k_22;

  TermReference l_22;

  TermReference n_22;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail306:
    { 
      lifted41 lifted411 = new lifted41();
      lifted411.k_22 = k_22;
      lifted411.l_22 = l_22;
      lifted411.n_22 = n_22;
      term = try_1_0.instance.invoke(context, term, lifted411);
      if(term == null)
        break Fail306;
      if(true)
        return term;
    }
    return null;
  }
}