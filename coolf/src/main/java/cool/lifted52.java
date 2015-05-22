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

@SuppressWarnings("all") final class lifted52 extends Strategy 
{ 
  TermReference m_21;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail310:
    { 
      if(m_21.value == null)
        break Fail310;
      term = fetch_1_0.instance.invoke(context, m_21.value, lifted53.instance);
      if(term == null)
        break Fail310;
      if(true)
        return term;
    }
    return null;
  }
}