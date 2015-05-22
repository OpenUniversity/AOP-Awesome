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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_56, Strategy b_56)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OrComp_2_0");
    Fail253:
    { 
      IStrategoTerm d_183 = null;
      IStrategoTerm b_183 = null;
      IStrategoTerm c_183 = null;
      IStrategoTerm e_183 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail253;
      b_183 = term.getSubterm(0);
      c_183 = term.getSubterm(1);
      IStrategoList annos0 = term.getAnnotations();
      d_183 = annos0;
      term = a_56.invoke(context, b_183);
      if(term == null)
        break Fail253;
      e_183 = term;
      term = b_56.invoke(context, c_183);
      if(term == null)
        break Fail253;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{e_183, term}), checkListAnnos(termFactory, d_183));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}