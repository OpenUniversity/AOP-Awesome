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

@SuppressWarnings("all") public class $Not$Comp_1_0 extends Strategy 
{ 
  public static $Not$Comp_1_0 instance = new $Not$Comp_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NotComp_1_0");
    Fail158:
    { 
      IStrategoTerm d_161 = null;
      IStrategoTerm c_161 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consNotComp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail158;
      c_161 = term.getSubterm(0);
      IStrategoList annos2 = term.getAnnotations();
      d_161 = annos2;
      term = p_34.invoke(context, c_161);
      if(term == null)
        break Fail158;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consNotComp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_161));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}