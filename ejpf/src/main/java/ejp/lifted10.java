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

@SuppressWarnings("all") final class lifted10 extends Strategy 
{ 
  TermReference p_77;

  TermReference q_77;

  TermReference v_15;

  TermReference s_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail335:
    { 
      term = ejp_to_java_0_4.instance.invoke(context, term, p_77.value, q_77.value, v_15.value, s_77.value);
      if(term == null)
        break Fail335;
      if(true)
        return term;
    }
    return null;
  }
}