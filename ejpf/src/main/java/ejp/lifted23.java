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

@SuppressWarnings("all") final class lifted23 extends Strategy 
{ 
  TermReference p_18;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail323:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail323;
      IStrategoTerm arg33 = term.getSubterm(0);
      if(arg33.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg33).getConstructor())
        break Fail323;
      IStrategoTerm arg36 = arg33.getSubterm(2);
      if(arg36.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg36).getConstructor())
        break Fail323;
      if(p_18.value == null)
        p_18.value = arg36.getSubterm(0);
      else
        if(p_18.value != arg36.getSubterm(0) && !p_18.value.match(arg36.getSubterm(0)))
          break Fail323;
      if(true)
        return term;
    }
    return null;
  }
}