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

@SuppressWarnings("all") final class lifted33 extends Strategy 
{ 
  TermReference x_20;

  TermReference w_20;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail311:
    { 
      IStrategoTerm y_20 = null;
      IStrategoTerm e_21 = null;
      y_20 = term;
      if(x_20.value == null)
        break Fail311;
      term = x_20.value;
      e_21 = x_20.value;
      if(w_20.value == null)
        break Fail311;
      term = hashtable_get_0_1.instance.invoke(context, w_20.value, y_20);
      if(term == null)
        break Fail311;
      term = add_key_to_multiple_values_table_0_2.instance.invoke(context, e_21, term, y_20);
      if(term == null)
        break Fail311;
      if(true)
        return term;
    }
    return null;
  }
}