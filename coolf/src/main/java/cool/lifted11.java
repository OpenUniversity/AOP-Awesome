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

@SuppressWarnings("all") final class lifted11 extends Strategy 
{ 
  TermReference g_11;

  TermReference r_10;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail397:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail397;
      if(g_11.value == null)
        g_11.value = term.getSubterm(1);
      else
        if(g_11.value != term.getSubterm(1) && !g_11.value.match(term.getSubterm(1)))
          break Fail397;
      if(r_10.value == null)
        r_10.value = term.getSubterm(2);
      else
        if(r_10.value != term.getSubterm(2) && !r_10.value.match(term.getSubterm(2)))
          break Fail397;
      if(true)
        return term;
    }
    return null;
  }
}