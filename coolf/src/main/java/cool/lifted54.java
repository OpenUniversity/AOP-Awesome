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

@SuppressWarnings("all") final class lifted54 extends Strategy 
{ 
  TermReference m_21;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail309:
    { 
      if(m_21.value == null)
        break Fail309;
      term = fetch_1_0.instance.invoke(context, m_21.value, lifted55.instance);
      if(term == null)
        break Fail309;
      if(true)
        return term;
    }
    return null;
  }
}