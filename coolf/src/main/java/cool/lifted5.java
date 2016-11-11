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

@SuppressWarnings("all") final class lifted5 extends Strategy 
{ 
  TermReference s_24;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail511:
    { 
      IStrategoTerm t_24 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail511;
      t_24 = term.getSubterm(0);
      if(s_24.value == null)
        break Fail511;
      term = iset_elements_0_0.instance.invoke(context, s_24.value);
      if(term == null)
        break Fail511;
      term = termFactory.makeTuple(t_24, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail511;
      term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
      if(true)
        return term;
    }
    return null;
  }
}