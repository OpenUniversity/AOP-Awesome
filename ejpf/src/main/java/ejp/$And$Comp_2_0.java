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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_56, Strategy e_56)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AndComp_2_0");
    Fail254:
    { 
      IStrategoTerm i_183 = null;
      IStrategoTerm g_183 = null;
      IStrategoTerm h_183 = null;
      IStrategoTerm j_183 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail254;
      g_183 = term.getSubterm(0);
      h_183 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      i_183 = annos1;
      term = c_56.invoke(context, g_183);
      if(term == null)
        break Fail254;
      j_183 = term;
      term = e_56.invoke(context, h_183);
      if(term == null)
        break Fail254;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{j_183, term}), checkListAnnos(termFactory, i_183));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}