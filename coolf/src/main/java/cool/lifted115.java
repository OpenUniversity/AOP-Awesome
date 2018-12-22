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
  TermReference s_42;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail249:
    { 
      IStrategoTerm g_43 = null;
      IStrategoTerm i_44 = null;
      g_43 = term;
      if(s_42.value == null)
        break Fail249;
      i_44 = s_42.value;
      term = strip_annos_0_0.instance.invoke(context, g_43);
      if(term == null)
        break Fail249;
      term = hashtable_put_0_2.instance.invoke(context, i_44, term, g_43);
      if(term == null)
        break Fail249;
      if(true)
        return term;
    }
    return null;
  }
}