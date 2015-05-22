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

@SuppressWarnings("all") final class lifted13 extends Strategy 
{ 
  TermReference p_77;

  TermReference z_14;

  TermReference a_15;

  TermReference q_77;

  TermReference r_77;

  TermReference s_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail332:
    { 
      term = convert_one_var_dec_0_6.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{p_77.value, z_14.value, a_15.value, q_77.value, r_77.value, s_77.value});
      if(term == null)
        break Fail332;
      if(true)
        return term;
    }
    return null;
  }
}