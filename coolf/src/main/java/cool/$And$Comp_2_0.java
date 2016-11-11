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

@SuppressWarnings("all") public class $And$Comp_2_0 extends Strategy 
{ 
  public static $And$Comp_2_0 instance = new $And$Comp_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_82, Strategy l_82)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AndComp_2_0");
    Fail336:
    { 
      IStrategoTerm t_192 = null;
      IStrategoTerm r_192 = null;
      IStrategoTerm s_192 = null;
      IStrategoTerm u_192 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail336;
      r_192 = term.getSubterm(0);
      s_192 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      t_192 = annos1;
      term = k_82.invoke(context, r_192);
      if(term == null)
        break Fail336;
      u_192 = term;
      term = l_82.invoke(context, s_192);
      if(term == null)
        break Fail336;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{u_192, term}), checkListAnnos(termFactory, t_192));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}