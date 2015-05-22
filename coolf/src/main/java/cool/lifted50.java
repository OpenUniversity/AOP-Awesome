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

@SuppressWarnings("all") final class lifted50 extends Strategy 
{ 
  TermReference m_21;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail313:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
        break Fail313;
      if(m_21.value == null)
        m_21.value = term.getSubterm(0);
      else
        if(m_21.value != term.getSubterm(0) && !m_21.value.match(term.getSubterm(0)))
          break Fail313;
      if(true)
        return term;
    }
    return null;
  }
}