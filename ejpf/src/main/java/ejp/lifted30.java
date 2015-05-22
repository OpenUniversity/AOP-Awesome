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

@SuppressWarnings("all") final class lifted30 extends Strategy 
{ 
  TermReference n_19;

  TermReference m_19;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail315:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail315;
      if(n_19.value == null)
        n_19.value = term.getSubterm(1);
      else
        if(n_19.value != term.getSubterm(1) && !n_19.value.match(term.getSubterm(1)))
          break Fail315;
      IStrategoTerm arg52 = term.getSubterm(2);
      if(arg52.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg52).getConstructor())
        break Fail315;
      if(m_19.value == null)
        m_19.value = arg52.getSubterm(0);
      else
        if(m_19.value != arg52.getSubterm(0) && !m_19.value.match(arg52.getSubterm(0)))
          break Fail315;
      if(true)
        return term;
    }
    return null;
  }
}