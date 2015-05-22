package cjp;

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

@SuppressWarnings("all") final class lifted28 extends Strategy 
{ 
  TermReference h_29;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail168:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail168;
      IStrategoTerm arg91 = term.getSubterm(0);
      if(arg91.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg91).getConstructor())
        break Fail168;
      if(h_29.value == null)
        h_29.value = arg91.getSubterm(0);
      else
        if(h_29.value != arg91.getSubterm(0) && !h_29.value.match(arg91.getSubterm(0)))
          break Fail168;
      if(true)
        return term;
    }
    return null;
  }
}