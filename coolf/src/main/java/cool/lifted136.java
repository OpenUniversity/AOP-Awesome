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

@SuppressWarnings("all") final class lifted136 extends Strategy 
{ 
  public static final lifted136 instance = new lifted136();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail340:
    { 
      IStrategoTerm f_80 = null;
      IStrategoTerm g_80 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail340;
      IStrategoTerm arg175 = term.getSubterm(0);
      if(arg175.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)arg175).getConstructor())
        break Fail340;
      f_80 = arg175.getSubterm(0);
      g_80 = term.getSubterm(1);
      term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{cool.constCons44, cool.constBoolean0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{f_80, g_80}), (IStrategoList)cool.constNil0)});
      if(true)
        return term;
    }
    return null;
  }
}