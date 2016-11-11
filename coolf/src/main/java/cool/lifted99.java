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

@SuppressWarnings("all") final class lifted99 extends Strategy 
{ 
  TermReference e_50;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail372:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail372;
      if(e_50.value == null)
        e_50.value = term.getSubterm(0);
      else
        if(e_50.value != term.getSubterm(0) && !e_50.value.match(term.getSubterm(0)))
          break Fail372;
      if(true)
        return term;
    }
    return null;
  }
}