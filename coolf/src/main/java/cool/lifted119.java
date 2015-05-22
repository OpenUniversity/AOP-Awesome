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
  TermReference h_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail247:
    { 
      IStrategoTerm m_44 = null;
      IStrategoTerm o_45 = null;
      m_44 = term;
      if(h_44.value == null)
        break Fail247;
      term = h_44.value;
      o_45 = h_44.value;
      if(h_44.value == null)
        break Fail247;
      term = hashtable_keys_0_0.instance.invoke(context, h_44.value);
      if(term == null)
        break Fail247;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail247;
      term = hashtable_put_0_2.instance.invoke(context, o_45, m_44, term);
      if(term == null)
        break Fail247;
      if(true)
        return term;
    }
    return null;
  }
}