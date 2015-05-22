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

@SuppressWarnings("all") public class ejp_converter_aspect_or_class_0_1 extends Strategy 
{ 
  public static ejp_converter_aspect_or_class_0_1 instance = new ejp_converter_aspect_or_class_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_77)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_77 = new TermReference(ref_x_77);
    context.push("ejp_converter_aspect_or_class_0_1");
    Fail249:
    { 
      IStrategoTerm term187 = term;
      Success178:
      { 
        Fail250:
        { 
          IStrategoTerm w_53 = null;
          TermReference x_53 = new TermReference();
          IStrategoTerm y_53 = null;
          TermReference z_53 = new TermReference();
          IStrategoTerm a_54 = null;
          IStrategoTerm b_54 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDec_2 != ((IStrategoAppl)term).getConstructor())
            break Fail250;
          w_53 = term.getSubterm(0);
          IStrategoTerm arg166 = term.getSubterm(1);
          if(arg166.getTermType() != IStrategoTerm.APPL || transform._consAspectBody_1 != ((IStrategoAppl)arg166).getConstructor())
            break Fail250;
          y_53 = arg166.getSubterm(0);
          b_54 = term;
          IStrategoTerm term188 = term;
          Success179:
          { 
            Fail251:
            { 
              IStrategoTerm g_54 = null;
              IStrategoTerm i_54 = null;
              term = w_53;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDecHead_6 != ((IStrategoAppl)term).getConstructor())
                break Fail251;
              IStrategoTerm arg168 = term.getSubterm(1);
              if(arg168.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg168).getConstructor())
                break Fail251;
              if(x_53.value == null)
                x_53.value = arg168.getSubterm(0);
              else
                if(x_53.value != arg168.getSubterm(0) && !x_53.value.match(arg168.getSubterm(0)))
                  break Fail251;
              term = new_iset_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail251;
              if(z_53.value == null)
                z_53.value = term;
              else
                if(z_53.value != term && !z_53.value.match(term))
                  break Fail251;
              i_54 = term;
              term = y_53;
              lifted88 lifted880 = new lifted88();
              lifted880.z_53 = z_53;
              lifted880.x_77 = x_77;
              lifted880.x_53 = x_53;
              term = topdown_1_0.instance.invoke(context, term, lifted880);
              if(term == null)
                break Fail251;
              g_54 = term;
              term = i_54;
              if(z_53.value == null)
                break Fail251;
              term = iset_elements_0_0.instance.invoke(context, z_53.value);
              if(term == null)
                break Fail251;
              term = termFactory.makeTuple(g_54, term);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail251;
              term = termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term});
              a_54 = term;
              if(true)
                break Success179;
            }
            term = term188;
            IStrategoTerm l_54 = null;
            l_54 = term;
            term = report_with_failure_0_1.instance.invoke(context, l_54, ejp.const113);
            if(term == null)
              break Fail250;
          }
          term = b_54;
          if(a_54 == null)
            break Fail250;
          term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{w_53, a_54});
          if(true)
            break Success178;
        }
        term = term187;
        IStrategoTerm n_53 = null;
        IStrategoTerm o_53 = null;
        IStrategoTerm p_53 = null;
        IStrategoTerm q_53 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail249;
        n_53 = term.getSubterm(0);
        o_53 = term.getSubterm(1);
        q_53 = term;
        IStrategoTerm term189 = term;
        Success180:
        { 
          Fail252:
          { 
            term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{n_53, o_53});
            term = ejp_to_java2_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail252;
            p_53 = term;
            if(true)
              break Success180;
          }
          term = term189;
          IStrategoTerm s_53 = null;
          s_53 = term;
          term = report_with_failure_0_1.instance.invoke(context, s_53, ejp.const113);
          if(term == null)
            break Fail249;
        }
        term = q_53;
        if(p_53 == null)
          break Fail249;
        term = p_53;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}