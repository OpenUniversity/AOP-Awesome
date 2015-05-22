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
  TermReference n_20;

  TermReference m_20;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail311:
    { 
      IStrategoTerm o_20 = null;
      IStrategoTerm u_20 = null;
      o_20 = term;
      if(n_20.value == null)
        break Fail311;
      term = n_20.value;
      u_20 = n_20.value;
      if(m_20.value == null)
        break Fail311;
      term = hashtable_get_0_1.instance.invoke(context, m_20.value, o_20);
      if(term == null)
        break Fail311;
      term = add_key_to_multiple_values_table_0_2.instance.invoke(context, u_20, term, o_20);
      if(term == null)
        break Fail311;
      if(true)
        return term;
    }
    return null;
  }
}