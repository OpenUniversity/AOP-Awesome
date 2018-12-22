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

@SuppressWarnings("all") final class lifted1 extends Strategy 
{ 
  TermReference t_8;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail405:
    { 
      IStrategoTerm u_8 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail405;
      u_8 = term.getSubterm(0);
      if(t_8.value == null)
        break Fail405;
      term = iset_elements_0_0.instance.invoke(context, t_8.value);
      if(term == null)
        break Fail405;
      term = termFactory.makeTuple(u_8, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail405;
      term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
      if(true)
        return term;
    }
    return null;
  }
}