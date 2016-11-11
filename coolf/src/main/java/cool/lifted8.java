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

@SuppressWarnings("all") final class lifted8 extends Strategy 
{ 
  TermReference b_26;

  TermReference n_26;

  TermReference c_26;

  TermReference h_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail506:
    { 
      lifted9 lifted910 = new lifted9();
      lifted910.b_26 = b_26;
      lifted910.n_26 = n_26;
      lifted910.c_26 = c_26;
      lifted910.h_26 = h_26;
      term = try_1_0.instance.invoke(context, term, lifted910);
      if(term == null)
        break Fail506;
      if(true)
        return term;
    }
    return null;
  }
}