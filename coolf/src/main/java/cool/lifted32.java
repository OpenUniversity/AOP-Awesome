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

@SuppressWarnings("all") final class lifted32 extends Strategy 
{ 
  TermReference y_10;

  TermReference z_10;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail378:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail378;
      if(y_10.value == null)
        y_10.value = term.getSubterm(0);
      else
        if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
          break Fail378;
      if(z_10.value == null)
        z_10.value = term.getSubterm(1);
      else
        if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
          break Fail378;
      if(true)
        return term;
    }
    return null;
  }
}