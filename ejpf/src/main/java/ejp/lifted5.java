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

@SuppressWarnings("all") final class lifted5 extends Strategy 
{ 
  TermReference p_77;

  TermReference q_16;

  TermReference r_77;

  TermReference s_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail341:
    { 
      IStrategoTerm h_17 = null;
      h_17 = term;
      if(p_77.value == null)
        break Fail341;
      term = hashtable_copy_0_0.instance.invoke(context, p_77.value);
      if(term == null)
        break Fail341;
      term = ejp_to_java_0_4.instance.invoke(context, h_17, term, q_16.value, r_77.value, s_77.value);
      if(term == null)
        break Fail341;
      if(true)
        return term;
    }
    return null;
  }
}