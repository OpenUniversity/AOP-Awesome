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
  TermReference b_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail251:
    { 
      IStrategoTerm p_44 = null;
      IStrategoTerm s_45 = null;
      p_44 = term;
      if(b_44.value == null)
        break Fail251;
      s_45 = b_44.value;
      term = strip_annos_0_0.instance.invoke(context, p_44);
      if(term == null)
        break Fail251;
      term = hashtable_put_0_2.instance.invoke(context, s_45, term, p_44);
      if(term == null)
        break Fail251;
      if(true)
        return term;
    }
    return null;
  }
}