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
  TermReference n_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail248:
    { 
      IStrategoTerm s_44 = null;
      IStrategoTerm u_45 = null;
      s_44 = term;
      if(n_44.value == null)
        break Fail248;
      term = n_44.value;
      u_45 = n_44.value;
      if(n_44.value == null)
        break Fail248;
      term = hashtable_keys_0_0.instance.invoke(context, n_44.value);
      if(term == null)
        break Fail248;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail248;
      term = hashtable_put_0_2.instance.invoke(context, u_45, s_44, term);
      if(term == null)
        break Fail248;
      if(true)
        return term;
    }
    return null;
  }
}