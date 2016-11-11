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

@SuppressWarnings("all") final class lifted117 extends Strategy 
{ 
  TermReference r_71;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail356:
    { 
      IStrategoTerm k_72 = null;
      IStrategoTerm o_73 = null;
      k_72 = term;
      if(r_71.value == null)
        break Fail356;
      o_73 = r_71.value;
      term = strip_annos_0_0.instance.invoke(context, k_72);
      if(term == null)
        break Fail356;
      term = hashtable_put_0_2.instance.invoke(context, o_73, term, k_72);
      if(term == null)
        break Fail356;
      if(true)
        return term;
    }
    return null;
  }
}