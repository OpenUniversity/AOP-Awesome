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

@SuppressWarnings("all") public class $Not$Comp_1_0 extends Strategy 
{ 
  public static $Not$Comp_1_0 instance = new $Not$Comp_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_55)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NotComp_1_0");
    Fail255:
    { 
      IStrategoTerm a_183 = null;
      IStrategoTerm z_182 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consNotComp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail255;
      z_182 = term.getSubterm(0);
      IStrategoList annos2 = term.getAnnotations();
      a_183 = annos2;
      term = s_55.invoke(context, z_182);
      if(term == null)
        break Fail255;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consNotComp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_183));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}