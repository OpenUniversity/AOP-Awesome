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

@SuppressWarnings("all") public class $Or$Comp_2_0 extends Strategy 
{ 
  public static $Or$Comp_2_0 instance = new $Or$Comp_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_55, Strategy p_55)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OrComp_2_0");
    Fail253:
    { 
      IStrategoTerm r_182 = null;
      IStrategoTerm p_182 = null;
      IStrategoTerm q_182 = null;
      IStrategoTerm s_182 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail253;
      p_182 = term.getSubterm(0);
      q_182 = term.getSubterm(1);
      IStrategoList annos0 = term.getAnnotations();
      r_182 = annos0;
      term = o_55.invoke(context, p_182);
      if(term == null)
        break Fail253;
      s_182 = term;
      term = p_55.invoke(context, q_182);
      if(term == null)
        break Fail253;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{s_182, term}), checkListAnnos(termFactory, r_182));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}