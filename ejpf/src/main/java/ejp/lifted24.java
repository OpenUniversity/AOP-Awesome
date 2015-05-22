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

@SuppressWarnings("all") final class lifted24 extends Strategy 
{ 
  TermReference p_18;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail322:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail322;
      IStrategoTerm arg37 = term.getSubterm(0);
      if(arg37.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg37).getConstructor())
        break Fail322;
      IStrategoTerm arg39 = arg37.getSubterm(1);
      if(arg39.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg39).getConstructor())
        break Fail322;
      IStrategoTerm arg42 = arg39.getSubterm(2);
      if(arg42.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg42).getConstructor())
        break Fail322;
      if(p_18.value == null)
        p_18.value = arg42.getSubterm(0);
      else
        if(p_18.value != arg42.getSubterm(0) && !p_18.value.match(arg42.getSubterm(0)))
          break Fail322;
      if(true)
        return term;
    }
    return null;
  }
}