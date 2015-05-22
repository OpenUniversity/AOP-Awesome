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

@SuppressWarnings("all") final class lifted115 extends Strategy 
{ 
  TermReference u_43;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail251:
    { 
      IStrategoTerm i_44 = null;
      IStrategoTerm k_45 = null;
      i_44 = term;
      if(u_43.value == null)
        break Fail251;
      k_45 = u_43.value;
      term = strip_annos_0_0.instance.invoke(context, i_44);
      if(term == null)
        break Fail251;
      term = hashtable_put_0_2.instance.invoke(context, k_45, term, i_44);
      if(term == null)
        break Fail251;
      if(true)
        return term;
    }
    return null;
  }
}