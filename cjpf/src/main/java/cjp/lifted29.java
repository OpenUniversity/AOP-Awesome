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

@SuppressWarnings("all") final class lifted29 extends Strategy 
{ 
  TermReference h_29;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail167:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail167;
      IStrategoTerm arg93 = term.getSubterm(1);
      if(arg93.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg93).getConstructor())
        break Fail167;
      if(h_29.value == null)
        h_29.value = arg93.getSubterm(0);
      else
        if(h_29.value != arg93.getSubterm(0) && !h_29.value.match(arg93.getSubterm(0)))
          break Fail167;
      if(true)
        return term;
    }
    return null;
  }
}