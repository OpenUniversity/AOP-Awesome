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

@SuppressWarnings("all") final class lifted101 extends Strategy 
{ 
  TermReference f_33;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail261:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail261;
      if(f_33.value == null)
        f_33.value = term.getSubterm(0);
      else
        if(f_33.value != term.getSubterm(0) && !f_33.value.match(term.getSubterm(0)))
          break Fail261;
      if(true)
        return term;
    }
    return null;
  }
}