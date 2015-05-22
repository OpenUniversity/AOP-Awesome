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

@SuppressWarnings("all") final class lifted25 extends Strategy 
{ 
  TermReference p_18;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail320:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail320;
      IStrategoTerm arg44 = term.getSubterm(1);
      if(arg44.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg44).getConstructor())
        break Fail320;
      IStrategoTerm arg47 = arg44.getSubterm(2);
      if(arg47.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg47).getConstructor())
        break Fail320;
      if(p_18.value == null)
        p_18.value = arg47.getSubterm(0);
      else
        if(p_18.value != arg47.getSubterm(0) && !p_18.value.match(arg47.getSubterm(0)))
          break Fail320;
      if(true)
        return term;
    }
    return null;
  }
}