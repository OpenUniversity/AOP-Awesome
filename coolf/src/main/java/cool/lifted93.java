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

@SuppressWarnings("all") final class lifted93 extends Strategy 
{ 
  TermReference e_34;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail269:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail269;
      if(e_34.value == null)
        e_34.value = term.getSubterm(0);
      else
        if(e_34.value != term.getSubterm(0) && !e_34.value.match(term.getSubterm(0)))
          break Fail269;
      if(true)
        return term;
    }
    return null;
  }
}