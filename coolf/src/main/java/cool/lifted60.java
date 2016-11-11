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

@SuppressWarnings("all") final class lifted60 extends Strategy 
{ 
  TermReference r_37;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail411:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail411;
      IStrategoTerm arg71 = term.getSubterm(2);
      if(arg71.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg71).getConstructor())
        break Fail411;
      if(r_37.value == null)
        r_37.value = arg71.getSubterm(0);
      else
        if(r_37.value != arg71.getSubterm(0) && !r_37.value.match(arg71.getSubterm(0)))
          break Fail411;
      if(true)
        return term;
    }
    return null;
  }
}