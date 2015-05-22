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

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  TermReference p_77;

  TermReference q_16;

  TermReference r_77;

  TermReference s_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail340:
    { 
      lifted5 lifted510 = new lifted5();
      lifted510.p_77 = p_77;
      lifted510.q_16 = q_16;
      lifted510.r_77 = r_77;
      lifted510.s_77 = s_77;
      term = try_1_0.instance.invoke(context, term, lifted510);
      if(term == null)
        break Fail340;
      if(true)
        return term;
    }
    return null;
  }
}