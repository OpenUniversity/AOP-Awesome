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

@SuppressWarnings("all") final class lifted119 extends Strategy 
{ 
  TermReference f_43;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail245:
    { 
      IStrategoTerm k_43 = null;
      IStrategoTerm m_44 = null;
      k_43 = term;
      if(f_43.value == null)
        break Fail245;
      term = f_43.value;
      m_44 = f_43.value;
      if(f_43.value == null)
        break Fail245;
      term = hashtable_keys_0_0.instance.invoke(context, f_43.value);
      if(term == null)
        break Fail245;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail245;
      term = hashtable_put_0_2.instance.invoke(context, m_44, k_43, term);
      if(term == null)
        break Fail245;
      if(true)
        return term;
    }
    return null;
  }
}