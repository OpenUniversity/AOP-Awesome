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

@SuppressWarnings("all") final class lifted122 extends Strategy 
{ 
  TermReference k_44;

  TermReference l_44;

  TermReference m_44;

  TermReference n_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail256:
    { 
      term = fill$Method$Maps_0_4.instance.invoke(context, term, k_44.value, l_44.value, m_44.value, n_44.value);
      if(term == null)
        break Fail256;
      if(true)
        return term;
    }
    return null;
  }
}