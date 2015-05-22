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

@SuppressWarnings("all") final class lifted29 extends Strategy 
{ 
  TermReference b_19;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail316:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail316;
      IStrategoTerm arg49 = term.getSubterm(0);
      if(arg49.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg49).getConstructor())
        break Fail316;
      if(b_19.value == null)
        b_19.value = arg49.getSubterm(0);
      else
        if(b_19.value != arg49.getSubterm(0) && !b_19.value.match(arg49.getSubterm(0)))
          break Fail316;
      if(true)
        return term;
    }
    return null;
  }
}