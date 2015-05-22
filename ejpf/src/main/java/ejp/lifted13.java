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
  TermReference c_77;

  TermReference x_14;

  TermReference y_14;

  TermReference d_77;

  TermReference e_77;

  TermReference f_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail332:
    { 
      term = convert_one_var_dec_0_6.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{c_77.value, x_14.value, y_14.value, d_77.value, e_77.value, f_77.value});
      if(term == null)
        break Fail332;
      if(true)
        return term;
    }
    return null;
  }
}