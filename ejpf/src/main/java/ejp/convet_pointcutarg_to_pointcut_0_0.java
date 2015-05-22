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

@SuppressWarnings("all") public class convet_pointcutarg_to_pointcut_0_0 extends Strategy 
{ 
  public static convet_pointcutarg_to_pointcut_0_0 instance = new convet_pointcutarg_to_pointcut_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail99:
    { 
      IStrategoTerm l_39 = null;
      IStrategoTerm m_39 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consPointcutargDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail99;
      l_39 = term.getSubterm(0);
      m_39 = term.getSubterm(1);
      term = termFactory.makeAppl(transform._consPointcutDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consPointcutDecHead_3, new IStrategoTerm[]{ejp.constCons24, l_39, m_39}), ejp.constNoPointcutBody0});
      if(true)
        return term;
    }
    context.push("convet_pointcutarg_to_pointcut_0_0");
    context.popOnFailure();
    return null;
  }
}