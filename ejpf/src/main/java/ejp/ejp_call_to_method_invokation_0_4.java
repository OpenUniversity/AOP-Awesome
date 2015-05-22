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

@SuppressWarnings("all") public class ejp_call_to_method_invokation_0_4 extends Strategy 
{ 
  public static ejp_call_to_method_invokation_0_4 instance = new ejp_call_to_method_invokation_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_22, IStrategoTerm ref_k_22, IStrategoTerm ref_l_22, IStrategoTerm ref_m_22)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_22 = new TermReference(ref_k_22);
    TermReference l_22 = new TermReference(ref_l_22);
    TermReference m_22 = new TermReference(ref_m_22);
    context.push("ejp_call_to_method_invokation_0_4");
    Fail36:
    { 
      TermReference n_22 = new TermReference();
      IStrategoTerm o_22 = null;
      TermReference q_22 = new TermReference();
      IStrategoTerm r_22 = null;
      IStrategoTerm s_22 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      if(q_22.value == null)
        q_22.value = term.getSubterm(0);
      else
        if(q_22.value != term.getSubterm(0) && !q_22.value.match(term.getSubterm(0)))
          break Fail36;
      o_22 = term.getSubterm(1);
      s_22 = term;
      IStrategoTerm term19 = term;
      Success19:
      { 
        Fail37:
        { 
          term = random_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail37;
          if(n_22.value == null)
            n_22.value = term;
          else
            if(n_22.value != term && !n_22.value.match(term))
              break Fail37;
          term = o_22;
          lifted40 lifted400 = new lifted40();
          lifted400.k_22 = k_22;
          lifted400.l_22 = l_22;
          lifted400.n_22 = n_22;
          term = topdown_1_0.instance.invoke(context, term, lifted400);
          if(term == null)
            break Fail37;
          term = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term});
          lifted42 lifted420 = new lifted42();
          lifted420.m_22 = m_22;
          lifted420.q_22 = q_22;
          term = try_1_0.instance.invoke(context, term, lifted420);
          if(term == null)
            break Fail37;
          term = create_method_invokation_0_1.instance.invoke(context, term, q_22.value);
          if(term == null)
            break Fail37;
          r_22 = term;
          if(true)
            break Success19;
        }
        term = term19;
        IStrategoTerm y_22 = null;
        y_22 = term;
        term = report_with_failure_0_1.instance.invoke(context, y_22, ejp.const7);
        if(term == null)
          break Fail36;
      }
      term = s_22;
      if(r_22 == null)
        break Fail36;
      term = r_22;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}