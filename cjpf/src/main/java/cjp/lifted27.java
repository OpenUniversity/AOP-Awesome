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

@SuppressWarnings("all") final class lifted27 extends Strategy 
{ 
  TermReference l_29;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail169:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail169;
      IStrategoTerm arg90 = term.getSubterm(1);
      if(arg90.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg90).getConstructor())
        break Fail169;
      if(l_29.value == null)
        l_29.value = arg90.getSubterm(0);
      else
        if(l_29.value != arg90.getSubterm(0) && !l_29.value.match(arg90.getSubterm(0)))
          break Fail169;
      if(true)
        return term;
    }
    return null;
  }
}