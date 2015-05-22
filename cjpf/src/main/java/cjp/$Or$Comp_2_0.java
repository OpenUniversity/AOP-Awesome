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

@SuppressWarnings("all") public class $Or$Comp_2_0 extends Strategy 
{ 
  public static $Or$Comp_2_0 instance = new $Or$Comp_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_34, Strategy m_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OrComp_2_0");
    Fail156:
    { 
      IStrategoTerm u_160 = null;
      IStrategoTerm s_160 = null;
      IStrategoTerm t_160 = null;
      IStrategoTerm v_160 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail156;
      s_160 = term.getSubterm(0);
      t_160 = term.getSubterm(1);
      IStrategoList annos0 = term.getAnnotations();
      u_160 = annos0;
      term = l_34.invoke(context, s_160);
      if(term == null)
        break Fail156;
      v_160 = term;
      term = m_34.invoke(context, t_160);
      if(term == null)
        break Fail156;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{v_160, term}), checkListAnnos(termFactory, u_160));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}