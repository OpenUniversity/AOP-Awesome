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

@SuppressWarnings("all") final class lifted72 extends Strategy 
{ 
  public static final lifted72 instance = new lifted72();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail271:
    { 
      IStrategoTerm p_39 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consClassType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail271;
      p_39 = term.getSubterm(0);
      term = pp_aspectj_string_0_0.instance.invoke(context, p_39);
      if(term == null)
        break Fail271;
      term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)ejp.constNil0)})});
      if(true)
        return term;
    }
    return null;
  }
}