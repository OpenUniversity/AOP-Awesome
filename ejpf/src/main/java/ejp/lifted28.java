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

@SuppressWarnings("all") final class lifted28 extends Strategy 
{ 
  TermReference d_19;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail317:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail317;
      IStrategoTerm arg48 = term.getSubterm(0);
      if(arg48.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg48).getConstructor())
        break Fail317;
      if(d_19.value == null)
        d_19.value = arg48.getSubterm(0);
      else
        if(d_19.value != arg48.getSubterm(0) && !d_19.value.match(arg48.getSubterm(0)))
          break Fail317;
      if(true)
        return term;
    }
    return null;
  }
}