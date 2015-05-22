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

@SuppressWarnings("all") final class lifted127 extends Strategy 
{ 
  TermReference p_43;

  TermReference r_43;

  TermReference q_43;

  TermReference s_43;

  TermReference y_43;

  TermReference z_43;

  TermReference h_44;

  TermReference u_43;

  TermReference v_43;

  TermReference c_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail240:
    { 
      term = make_lock_and_unlock_methods_0_10.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{p_43.value, r_43.value, q_43.value, s_43.value, y_43.value, z_43.value, h_44.value, u_43.value, v_43.value, c_44.value});
      if(term == null)
        break Fail240;
      if(true)
        return term;
    }
    return null;
  }
}