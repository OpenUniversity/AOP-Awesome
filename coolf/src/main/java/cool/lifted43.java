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

@SuppressWarnings("all") final class lifted43 extends Strategy 
{ 
  TermReference h_26;

  TermReference b_26;

  TermReference c_26;

  TermReference d_26;

  TermReference e_26;

  TermReference f_26;

  TermReference g_26;

  TermReference i_26;

  TermReference j_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail472:
    { 
      IStrategoTerm o_30 = null;
      o_30 = term;
      if(h_26.value == null)
        break Fail472;
      term = cast_bounded_arithmetic_type_0_0.instance.invoke(context, h_26.value);
      if(term == null)
        break Fail472;
      term = add_external_impl_0_9.instance.invokeDynamic(context, o_30, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, term, i_26.value, j_26.value});
      if(term == null)
        break Fail472;
      if(true)
        return term;
    }
    return null;
  }
}