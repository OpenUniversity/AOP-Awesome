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
  TermReference t_42;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail248:
    { 
      IStrategoTerm h_43 = null;
      IStrategoTerm k_44 = null;
      h_43 = term;
      if(t_42.value == null)
        break Fail248;
      k_44 = t_42.value;
      term = strip_annos_0_0.instance.invoke(context, h_43);
      if(term == null)
        break Fail248;
      term = hashtable_put_0_2.instance.invoke(context, k_44, term, h_43);
      if(term == null)
        break Fail248;
      if(true)
        return term;
    }
    return null;
  }
}