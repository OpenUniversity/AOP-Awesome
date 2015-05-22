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

@SuppressWarnings("all") final class lifted70 extends Strategy 
{ 
  TermReference i_39;

  TermReference g_39;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail273:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consNonScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
        break Fail273;
      if(i_39.value == null)
        i_39.value = term.getSubterm(0);
      else
        if(i_39.value != term.getSubterm(0) && !i_39.value.match(term.getSubterm(0)))
          break Fail273;
      if(g_39.value == null)
        g_39.value = term.getSubterm(1);
      else
        if(g_39.value != term.getSubterm(1) && !g_39.value.match(term.getSubterm(1)))
          break Fail273;
      if(true)
        return term;
    }
    return null;
  }
}