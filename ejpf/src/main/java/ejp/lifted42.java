package ejp;

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

@SuppressWarnings("all") final class lifted42 extends Strategy 
{ 
  TermReference m_22;

  TermReference q_22;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail305:
    { 
      term = handle_pointcutargs_0_2.instance.invoke(context, term, m_22.value, q_22.value);
      if(term == null)
        break Fail305;
      if(true)
        return term;
    }
    return null;
  }
}