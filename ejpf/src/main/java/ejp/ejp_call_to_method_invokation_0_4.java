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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_21, IStrategoTerm ref_a_22, IStrategoTerm ref_b_22, IStrategoTerm ref_c_22)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_22 = new TermReference(ref_a_22);
    TermReference b_22 = new TermReference(ref_b_22);
    TermReference c_22 = new TermReference(ref_c_22);
    context.push("ejp_call_to_method_invokation_0_4");
    Fail36:
    { 
      TermReference d_22 = new TermReference();
      IStrategoTerm e_22 = null;
      TermReference g_22 = new TermReference();
      IStrategoTerm h_22 = null;
      IStrategoTerm i_22 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      if(g_22.value == null)
        g_22.value = term.getSubterm(0);
      else
        if(g_22.value != term.getSubterm(0) && !g_22.value.match(term.getSubterm(0)))
          break Fail36;
      e_22 = term.getSubterm(1);
      i_22 = term;
      IStrategoTerm term19 = term;
      Success19:
      { 
        Fail37:
        { 
          term = random_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail37;
          if(d_22.value == null)
            d_22.value = term;
          else
            if(d_22.value != term && !d_22.value.match(term))
              break Fail37;
          term = e_22;
          lifted40 lifted400 = new lifted40();
          lifted400.a_22 = a_22;
          lifted400.b_22 = b_22;
          lifted400.d_22 = d_22;
          term = topdown_1_0.instance.invoke(context, term, lifted400);
          if(term == null)
            break Fail37;
          term = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term});
          lifted42 lifted420 = new lifted42();
          lifted420.c_22 = c_22;
          lifted420.g_22 = g_22;
          term = try_1_0.instance.invoke(context, term, lifted420);
          if(term == null)
            break Fail37;
          term = create_method_invokation_0_1.instance.invoke(context, term, g_22.value);
          if(term == null)
            break Fail37;
          h_22 = term;
          if(true)
            break Success19;
        }
        term = term19;
        IStrategoTerm o_22 = null;
        o_22 = term;
        term = report_with_failure_0_1.instance.invoke(context, o_22, ejp.const7);
        if(term == null)
          break Fail36;
      }
      term = i_22;
      if(h_22 == null)
        break Fail36;
      term = h_22;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}