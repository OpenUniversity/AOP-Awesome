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

@SuppressWarnings("all") final class lifted105 extends Strategy 
{ 
  TermReference e_49;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail367:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail367;
      if(e_49.value == null)
        e_49.value = term.getSubterm(0);
      else
        if(e_49.value != term.getSubterm(0) && !e_49.value.match(term.getSubterm(0)))
          break Fail367;
      if(true)
        return term;
    }
    return null;
  }
}