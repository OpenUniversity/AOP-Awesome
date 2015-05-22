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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_78)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_78 = new TermReference(ref_j_78);
    context.push("ejp_converter_aspect_or_class_0_1");
    Fail249:
    { 
      IStrategoTerm term187 = term;
      Success178:
      { 
        Fail250:
        { 
          IStrategoTerm i_54 = null;
          TermReference j_54 = new TermReference();
          IStrategoTerm k_54 = null;
          TermReference l_54 = new TermReference();
          IStrategoTerm m_54 = null;
          IStrategoTerm n_54 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDec_2 != ((IStrategoAppl)term).getConstructor())
            break Fail250;
          i_54 = term.getSubterm(0);
          IStrategoTerm arg166 = term.getSubterm(1);
          if(arg166.getTermType() != IStrategoTerm.APPL || transform._consAspectBody_1 != ((IStrategoAppl)arg166).getConstructor())
            break Fail250;
          k_54 = arg166.getSubterm(0);
          n_54 = term;
          IStrategoTerm term188 = term;
          Success179:
          { 
            Fail251:
            { 
              IStrategoTerm s_54 = null;
              IStrategoTerm u_54 = null;
              term = i_54;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDecHead_6 != ((IStrategoAppl)term).getConstructor())
                break Fail251;
              IStrategoTerm arg168 = term.getSubterm(1);
              if(arg168.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg168).getConstructor())
                break Fail251;
              if(j_54.value == null)
                j_54.value = arg168.getSubterm(0);
              else
                if(j_54.value != arg168.getSubterm(0) && !j_54.value.match(arg168.getSubterm(0)))
                  break Fail251;
              term = new_iset_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail251;
              if(l_54.value == null)
                l_54.value = term;
              else
                if(l_54.value != term && !l_54.value.match(term))
                  break Fail251;
              u_54 = term;
              term = k_54;
              lifted88 lifted880 = new lifted88();
              lifted880.l_54 = l_54;
              lifted880.j_78 = j_78;
              lifted880.j_54 = j_54;
              term = topdown_1_0.instance.invoke(context, term, lifted880);
              if(term == null)
                break Fail251;
              s_54 = term;
              term = u_54;
              if(l_54.value == null)
                break Fail251;
              term = iset_elements_0_0.instance.invoke(context, l_54.value);
              if(term == null)
                break Fail251;
              term = termFactory.makeTuple(s_54, term);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail251;
              term = termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term});
              m_54 = term;
              if(true)
                break Success179;
            }
            term = term188;
            IStrategoTerm x_54 = null;
            x_54 = term;
            term = report_with_failure_0_1.instance.invoke(context, x_54, ejp.const113);
            if(term == null)
              break Fail250;
          }
          term = n_54;
          if(m_54 == null)
            break Fail250;
          term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{i_54, m_54});
          if(true)
            break Success178;
        }
        term = term187;
        IStrategoTerm z_53 = null;
        IStrategoTerm a_54 = null;
        IStrategoTerm b_54 = null;
        IStrategoTerm c_54 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail249;
        z_53 = term.getSubterm(0);
        a_54 = term.getSubterm(1);
        c_54 = term;
        IStrategoTerm term189 = term;
        Success180:
        { 
          Fail252:
          { 
            term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{z_53, a_54});
            term = ejp_to_java2_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail252;
            b_54 = term;
            if(true)
              break Success180;
          }
          term = term189;
          IStrategoTerm e_54 = null;
          e_54 = term;
          term = report_with_failure_0_1.instance.invoke(context, e_54, ejp.const113);
          if(term == null)
            break Fail249;
        }
        term = c_54;
        if(b_54 == null)
          break Fail249;
        term = b_54;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}