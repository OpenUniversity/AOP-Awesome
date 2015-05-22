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

@SuppressWarnings("all") final class lifted31 extends Strategy 
{ 
  TermReference h_19;

  TermReference g_19;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail314:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail314;
      if(h_19.value == null)
        h_19.value = term.getSubterm(1);
      else
        if(h_19.value != term.getSubterm(1) && !h_19.value.match(term.getSubterm(1)))
          break Fail314;
      IStrategoTerm arg54 = term.getSubterm(2);
      if(arg54.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg54).getConstructor())
        break Fail314;
      if(g_19.value == null)
        g_19.value = arg54.getSubterm(0);
      else
        if(g_19.value != arg54.getSubterm(0) && !g_19.value.match(arg54.getSubterm(0)))
          break Fail314;
      if(true)
        return term;
    }
    return null;
  }
}