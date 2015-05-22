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

@SuppressWarnings("all") final class lifted116 extends Strategy 
{ 
  TermReference v_43;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail250:
    { 
      IStrategoTerm j_44 = null;
      IStrategoTerm m_45 = null;
      j_44 = term;
      if(v_43.value == null)
        break Fail250;
      m_45 = v_43.value;
      term = strip_annos_0_0.instance.invoke(context, j_44);
      if(term == null)
        break Fail250;
      term = hashtable_put_0_2.instance.invoke(context, m_45, term, j_44);
      if(term == null)
        break Fail250;
      if(true)
        return term;
    }
    return null;
  }
}