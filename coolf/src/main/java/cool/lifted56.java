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

@SuppressWarnings("all") final class lifted56 extends Strategy 
{ 
  TermReference s_21;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail307:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail307;
      IStrategoTerm arg57 = term.getSubterm(2);
      if(arg57.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg57).getConstructor())
        break Fail307;
      if(s_21.value == null)
        s_21.value = arg57.getSubterm(0);
      else
        if(s_21.value != arg57.getSubterm(0) && !s_21.value.match(arg57.getSubterm(0)))
          break Fail307;
      if(true)
        return term;
    }
    return null;
  }
}