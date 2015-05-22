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

@SuppressWarnings("all") final class lifted1 extends Strategy 
{ 
  TermReference j_11;

  TermReference m_11;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail345:
    { 
      IStrategoTerm t_11 = null;
      IStrategoTerm v_11 = null;
      IStrategoTerm y_11 = null;
      v_11 = term;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail345;
      t_11 = term;
      y_11 = v_11;
      term = ejp_to_java_0_4.instance.invoke(context, y_11, t_11, j_11.value, ejp.constNone0, m_11.value);
      if(term == null)
        break Fail345;
      if(true)
        return term;
    }
    return null;
  }
}