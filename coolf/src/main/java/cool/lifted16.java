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

@SuppressWarnings("all") final class lifted16 extends Strategy 
{ 
  TermReference y_10;

  TermReference z_10;

  TermReference c_10;

  TermReference d_10;

  TermReference e_10;

  TermReference f_10;

  TermReference g_10;

  TermReference h_10;

  TermReference j_10;

  TermReference k_10;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail392:
    { 
      IStrategoTerm d_14 = null;
      IStrategoTerm f_14 = null;
      d_14 = term;
      if(y_10.value == null || z_10.value == null)
        break Fail392;
      term = termFactory.makeTuple(y_10.value, z_10.value);
      f_14 = term;
      term = try_to_get_type_0_3.instance.invoke(context, f_14, cool.constNone0, c_10.value, d_10.value);
      if(term == null)
        break Fail392;
      term = cast_equality_type_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail392;
      term = add_external_impl_0_9.instance.invokeDynamic(context, d_14, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, term, j_10.value, k_10.value});
      if(term == null)
        break Fail392;
      if(true)
        return term;
    }
    return null;
  }
}