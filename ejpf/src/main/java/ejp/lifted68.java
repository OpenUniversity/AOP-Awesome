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

@SuppressWarnings("all") final class lifted68 extends Strategy 
{ 
  TermReference a_39;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail275:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
        break Fail275;
      if(a_39.value == null)
        a_39.value = term.getSubterm(1);
      else
        if(a_39.value != term.getSubterm(1) && !a_39.value.match(term.getSubterm(1)))
          break Fail275;
      if(true)
        return term;
    }
    return null;
  }
}