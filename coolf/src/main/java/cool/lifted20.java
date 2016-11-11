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

@SuppressWarnings("all") final class lifted20 extends Strategy 
{ 
  TermReference x_26;

  TermReference y_26;

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
    ITermFactory termFactory = context.getFactory();
    Fail495:
    { 
      IStrategoTerm c_30 = null;
      IStrategoTerm e_30 = null;
      c_30 = term;
      if(x_26.value == null || y_26.value == null)
        break Fail495;
      term = termFactory.makeTuple(x_26.value, y_26.value);
      e_30 = term;
      term = try_to_get_type_0_3.instance.invoke(context, e_30, cool.constNone0, b_26.value, c_26.value);
      if(term == null)
        break Fail495;
      term = cast_equality_type_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail495;
      term = add_external_impl_0_9.instance.invokeDynamic(context, c_30, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, term, i_26.value, j_26.value});
      if(term == null)
        break Fail495;
      if(true)
        return term;
    }
    return null;
  }
}