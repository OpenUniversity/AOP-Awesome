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

@SuppressWarnings("all") final class lifted26 extends Strategy 
{ 
  TermReference l_29;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail170:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail170;
      IStrategoTerm arg88 = term.getSubterm(0);
      if(arg88.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg88).getConstructor())
        break Fail170;
      if(l_29.value == null)
        l_29.value = arg88.getSubterm(0);
      else
        if(l_29.value != arg88.getSubterm(0) && !l_29.value.match(arg88.getSubterm(0)))
          break Fail170;
      if(true)
        return term;
    }
    return null;
  }
}