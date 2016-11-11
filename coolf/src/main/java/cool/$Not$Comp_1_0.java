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

@SuppressWarnings("all") public class $Not$Comp_1_0 extends Strategy 
{ 
  public static $Not$Comp_1_0 instance = new $Not$Comp_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_82)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NotComp_1_0");
    Fail337:
    { 
      IStrategoTerm x_192 = null;
      IStrategoTerm w_192 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consNotComp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail337;
      w_192 = term.getSubterm(0);
      IStrategoList annos2 = term.getAnnotations();
      x_192 = annos2;
      term = m_82.invoke(context, w_192);
      if(term == null)
        break Fail337;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consNotComp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_192));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}