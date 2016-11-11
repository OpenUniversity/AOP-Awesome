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

@SuppressWarnings("all") public class $Or$Comp_2_0 extends Strategy 
{ 
  public static $Or$Comp_2_0 instance = new $Or$Comp_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_82, Strategy j_82)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OrComp_2_0");
    Fail335:
    { 
      IStrategoTerm o_192 = null;
      IStrategoTerm m_192 = null;
      IStrategoTerm n_192 = null;
      IStrategoTerm p_192 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail335;
      m_192 = term.getSubterm(0);
      n_192 = term.getSubterm(1);
      IStrategoList annos0 = term.getAnnotations();
      o_192 = annos0;
      term = i_82.invoke(context, m_192);
      if(term == null)
        break Fail335;
      p_192 = term;
      term = j_82.invoke(context, n_192);
      if(term == null)
        break Fail335;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{p_192, term}), checkListAnnos(termFactory, o_192));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}