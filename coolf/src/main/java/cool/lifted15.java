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

@SuppressWarnings("all") final class lifted15 extends Strategy 
{ 
  TermReference f_27;

  TermReference q_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail500:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail500;
      if(f_27.value == null)
        f_27.value = term.getSubterm(1);
      else
        if(f_27.value != term.getSubterm(1) && !f_27.value.match(term.getSubterm(1)))
          break Fail500;
      if(q_26.value == null)
        q_26.value = term.getSubterm(2);
      else
        if(q_26.value != term.getSubterm(2) && !q_26.value.match(term.getSubterm(2)))
          break Fail500;
      if(true)
        return term;
    }
    return null;
  }
}