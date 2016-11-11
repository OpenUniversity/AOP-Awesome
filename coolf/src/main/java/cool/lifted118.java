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

@SuppressWarnings("all") final class lifted118 extends Strategy 
{ 
  TermReference s_71;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail355:
    { 
      IStrategoTerm l_72 = null;
      IStrategoTerm q_73 = null;
      l_72 = term;
      if(s_71.value == null)
        break Fail355;
      q_73 = s_71.value;
      term = strip_annos_0_0.instance.invoke(context, l_72);
      if(term == null)
        break Fail355;
      term = hashtable_put_0_2.instance.invoke(context, q_73, term, l_72);
      if(term == null)
        break Fail355;
      if(true)
        return term;
    }
    return null;
  }
}