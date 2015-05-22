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

@SuppressWarnings("all") public class $And$Comp_2_0 extends Strategy 
{ 
  public static $And$Comp_2_0 instance = new $And$Comp_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_55, Strategy r_55)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AndComp_2_0");
    Fail254:
    { 
      IStrategoTerm w_182 = null;
      IStrategoTerm u_182 = null;
      IStrategoTerm v_182 = null;
      IStrategoTerm x_182 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail254;
      u_182 = term.getSubterm(0);
      v_182 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      w_182 = annos1;
      term = q_55.invoke(context, u_182);
      if(term == null)
        break Fail254;
      x_182 = term;
      term = r_55.invoke(context, v_182);
      if(term == null)
        break Fail254;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{x_182, term}), checkListAnnos(termFactory, w_182));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}