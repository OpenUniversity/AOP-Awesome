package cjp;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_34, Strategy o_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AndComp_2_0");
    Fail157:
    { 
      IStrategoTerm z_160 = null;
      IStrategoTerm x_160 = null;
      IStrategoTerm y_160 = null;
      IStrategoTerm a_161 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail157;
      x_160 = term.getSubterm(0);
      y_160 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      z_160 = annos1;
      term = n_34.invoke(context, x_160);
      if(term == null)
        break Fail157;
      a_161 = term;
      term = o_34.invoke(context, y_160);
      if(term == null)
        break Fail157;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{a_161, term}), checkListAnnos(termFactory, z_160));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}