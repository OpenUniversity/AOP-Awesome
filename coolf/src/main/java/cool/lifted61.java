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

@SuppressWarnings("all") final class lifted61 extends Strategy 
{ 
  TermReference r_37;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail410:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail410;
      IStrategoTerm arg74 = term.getSubterm(2);
      if(arg74.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg74).getConstructor())
        break Fail410;
      if(r_37.value == null)
        r_37.value = arg74.getSubterm(0);
      else
        if(r_37.value != arg74.getSubterm(0) && !r_37.value.match(arg74.getSubterm(0)))
          break Fail410;
      if(true)
        return term;
    }
    return null;
  }
}