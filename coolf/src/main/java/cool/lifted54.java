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

@SuppressWarnings("all") final class lifted54 extends Strategy 
{ 
  TermReference l_37;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail417:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
        break Fail417;
      if(l_37.value == null)
        l_37.value = term.getSubterm(0);
      else
        if(l_37.value != term.getSubterm(0) && !l_37.value.match(term.getSubterm(0)))
          break Fail417;
      if(true)
        return term;
    }
    return null;
  }
}