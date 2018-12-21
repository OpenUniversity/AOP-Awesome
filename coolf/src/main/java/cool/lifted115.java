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
  TermReference a_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail252:
    { 
      IStrategoTerm o_44 = null;
      IStrategoTerm q_45 = null;
      o_44 = term;
      if(a_44.value == null)
        break Fail252;
      q_45 = a_44.value;
      term = strip_annos_0_0.instance.invoke(context, o_44);
      if(term == null)
        break Fail252;
      term = hashtable_put_0_2.instance.invoke(context, q_45, term, o_44);
      if(term == null)
        break Fail252;
      if(true)
        return term;
    }
    return null;
  }
}