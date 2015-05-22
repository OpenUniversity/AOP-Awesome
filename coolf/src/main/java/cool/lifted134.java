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

@SuppressWarnings("all") final class lifted134 extends Strategy 
{ 
  public static final lifted134 instance = new lifted134();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail235:
    { 
      IStrategoTerm w_51 = null;
      IStrategoTerm x_51 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail235;
      IStrategoTerm arg185 = term.getSubterm(0);
      if(arg185.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)arg185).getConstructor())
        break Fail235;
      w_51 = arg185.getSubterm(0);
      x_51 = term.getSubterm(1);
      term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{cool.constCons26, cool.constBoolean0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{w_51, x_51}), (IStrategoList)cool.constNil0)});
      if(true)
        return term;
    }
    return null;
  }
}