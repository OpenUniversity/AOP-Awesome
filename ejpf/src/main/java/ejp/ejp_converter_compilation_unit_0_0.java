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

@SuppressWarnings("all") public class ejp_converter_compilation_unit_0_0 extends Strategy 
{ 
  public static ejp_converter_compilation_unit_0_0 instance = new ejp_converter_compilation_unit_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ejp_converter_compilation_unit_0_0");
    Fail241:
    { 
      IStrategoTerm g_52 = null;
      IStrategoTerm h_52 = null;
      IStrategoTerm i_52 = null;
      IStrategoTerm j_52 = null;
      TermReference k_52 = new TermReference();
      IStrategoTerm l_52 = null;
      IStrategoTerm m_52 = null;
      IStrategoTerm p_52 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail241;
      h_52 = term.getSubterm(0);
      i_52 = term.getSubterm(1);
      l_52 = term.getSubterm(2);
      p_52 = term;
      IStrategoTerm term180 = term;
      Success172:
      { 
        Fail242:
        { 
          IStrategoTerm term181 = term;
          Success173:
          { 
            Fail243:
            { 
              IStrategoTerm n_52 = null;
              IStrategoTerm q_52 = null;
              n_52 = term;
              term = SRTS_all.instance.invoke(context, l_52, lifted80.instance);
              if(term == null)
                break Fail243;
              q_52 = term;
              g_52 = l_52;
              term = q_52;
              if(term != g_52 && !g_52.match(term))
                break Fail243;
              term = n_52;
              { 
                j_52 = i_52;
                term = l_52;
                m_52 = l_52;
                if(true)
                  break Success173;
              }
            }
            term = term181;
            Success174:
            { 
              Fail244:
              { 
                IStrategoTerm o_52 = null;
                o_52 = term;
                term = h_52;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail244;
                IStrategoTerm arg156 = term.getSubterm(0);
                if(arg156.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg156).getConstructor())
                  break Fail244;
                term = o_52;
                { 
                  term = h_52;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail242;
                  IStrategoTerm arg159 = term.getSubterm(0);
                  if(arg159.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg159).getConstructor())
                    break Fail242;
                  if(k_52.value == null)
                    k_52.value = arg159.getSubterm(1);
                  else
                    if(k_52.value != arg159.getSubterm(1) && !k_52.value.match(arg159.getSubterm(1)))
                      break Fail242;
                  if(true)
                    break Success174;
                }
              }
              term = ejp.constNone0;
              if(k_52.value == null)
                k_52.value = term;
              else
                if(k_52.value != term && !k_52.value.match(term))
                  break Fail242;
            }
            term = termFactory.makeTuple(i_52, ejp.constCons45);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail242;
            j_52 = term;
            term = l_52;
            lifted82 lifted820 = new lifted82();
            lifted820.k_52 = k_52;
            term = SRTS_all.instance.invoke(context, term, lifted820);
            if(term == null)
              break Fail242;
            m_52 = term;
          }
          if(true)
            break Success172;
        }
        term = term180;
        IStrategoTerm t_52 = null;
        t_52 = term;
        term = report_with_failure_0_1.instance.invoke(context, t_52, ejp.const111);
        if(term == null)
          break Fail241;
      }
      term = p_52;
      if(j_52 == null || m_52 == null)
        break Fail241;
      term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{h_52, j_52, m_52});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}