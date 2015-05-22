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

@SuppressWarnings("all") final class lifted57 extends Strategy 
{ 
  TermReference s_21;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail306:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail306;
      IStrategoTerm arg60 = term.getSubterm(2);
      if(arg60.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg60).getConstructor())
        break Fail306;
      if(s_21.value == null)
        s_21.value = arg60.getSubterm(0);
      else
        if(s_21.value != arg60.getSubterm(0) && !s_21.value.match(arg60.getSubterm(0)))
          break Fail306;
      if(true)
        return term;
    }
    return null;
  }
}