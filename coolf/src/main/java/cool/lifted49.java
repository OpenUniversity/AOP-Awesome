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

@SuppressWarnings("all") final class lifted49 extends Strategy 
{ 
  TermReference h_27;

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
    Fail466:
    { 
      IStrategoTerm s_31 = null;
      s_31 = term;
      if(h_27.value == null)
        break Fail466;
      term = type_of_0_3.instance.invoke(context, h_27.value, h_26.value, b_26.value, c_26.value);
      if(term == null)
        break Fail466;
      term = add_external_impl_0_9.instance.invokeDynamic(context, s_31, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, term, i_26.value, j_26.value});
      if(term == null)
        break Fail466;
      if(true)
        return term;
    }
    return null;
  }
}