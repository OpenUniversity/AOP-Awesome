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

@SuppressWarnings("all") final class lifted129 extends Strategy 
{ 
  TermReference z_57;

  TermReference o_71;

  TermReference a_58;

  TermReference p_71;

  TermReference v_71;

  TermReference z_71;

  TermReference j_72;

  TermReference r_71;

  TermReference s_71;

  TermReference d_72;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail345:
    { 
      term = make_lock_and_unlock_methods_0_10.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{z_57.value, o_71.value, a_58.value, p_71.value, v_71.value, z_71.value, j_72.value, r_71.value, s_71.value, d_72.value});
      if(term == null)
        break Fail345;
      if(true)
        return term;
    }
    return null;
  }
}