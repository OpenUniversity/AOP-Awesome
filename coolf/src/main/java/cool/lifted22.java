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

@SuppressWarnings("all") final class lifted22 extends Strategy 
{ 
  TermReference x_26;

  TermReference y_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail494:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail494;
      if(x_26.value == null)
        x_26.value = term.getSubterm(0);
      else
        if(x_26.value != term.getSubterm(0) && !x_26.value.match(term.getSubterm(0)))
          break Fail494;
      if(y_26.value == null)
        y_26.value = term.getSubterm(1);
      else
        if(y_26.value != term.getSubterm(1) && !y_26.value.match(term.getSubterm(1)))
          break Fail494;
      if(true)
        return term;
    }
    return null;
  }
}