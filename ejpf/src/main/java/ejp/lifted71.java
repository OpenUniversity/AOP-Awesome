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

@SuppressWarnings("all") final class lifted71 extends Strategy 
{ 
  TermReference s_39;

  TermReference q_39;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail272:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
        break Fail272;
      if(s_39.value == null)
        s_39.value = term.getSubterm(0);
      else
        if(s_39.value != term.getSubterm(0) && !s_39.value.match(term.getSubterm(0)))
          break Fail272;
      if(q_39.value == null)
        q_39.value = term.getSubterm(1);
      else
        if(q_39.value != term.getSubterm(1) && !q_39.value.match(term.getSubterm(1)))
          break Fail272;
      if(true)
        return term;
    }
    return null;
  }
}