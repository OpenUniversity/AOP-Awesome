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
      IStrategoTerm s_52 = null;
      IStrategoTerm t_52 = null;
      IStrategoTerm u_52 = null;
      IStrategoTerm v_52 = null;
      TermReference w_52 = new TermReference();
      IStrategoTerm x_52 = null;
      IStrategoTerm y_52 = null;
      IStrategoTerm b_53 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail241;
      t_52 = term.getSubterm(0);
      u_52 = term.getSubterm(1);
      x_52 = term.getSubterm(2);
      b_53 = term;
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
              IStrategoTerm z_52 = null;
              IStrategoTerm c_53 = null;
              z_52 = term;
              term = SRTS_all.instance.invoke(context, x_52, lifted80.instance);
              if(term == null)
                break Fail243;
              c_53 = term;
              s_52 = x_52;
              term = c_53;
              if(term != s_52 && !s_52.match(term))
                break Fail243;
              term = z_52;
              { 
                v_52 = u_52;
                term = x_52;
                y_52 = x_52;
                if(true)
                  break Success173;
              }
            }
            term = term181;
            Success174:
            { 
              Fail244:
              { 
                IStrategoTerm a_53 = null;
                a_53 = term;
                term = t_52;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail244;
                IStrategoTerm arg156 = term.getSubterm(0);
                if(arg156.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg156).getConstructor())
                  break Fail244;
                term = a_53;
                { 
                  term = t_52;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail242;
                  IStrategoTerm arg159 = term.getSubterm(0);
                  if(arg159.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg159).getConstructor())
                    break Fail242;
                  if(w_52.value == null)
                    w_52.value = arg159.getSubterm(1);
                  else
                    if(w_52.value != arg159.getSubterm(1) && !w_52.value.match(arg159.getSubterm(1)))
                      break Fail242;
                  if(true)
                    break Success174;
                }
              }
              term = ejp.constNone0;
              if(w_52.value == null)
                w_52.value = term;
              else
                if(w_52.value != term && !w_52.value.match(term))
                  break Fail242;
            }
            term = termFactory.makeTuple(u_52, ejp.constCons45);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail242;
            v_52 = term;
            term = x_52;
            lifted82 lifted820 = new lifted82();
            lifted820.w_52 = w_52;
            term = SRTS_all.instance.invoke(context, term, lifted820);
            if(term == null)
              break Fail242;
            y_52 = term;
          }
          if(true)
            break Success172;
        }
        term = term180;
        IStrategoTerm f_53 = null;
        f_53 = term;
        term = report_with_failure_0_1.instance.invoke(context, f_53, ejp.const111);
        if(term == null)
          break Fail241;
      }
      term = b_53;
      if(v_52 == null || y_52 == null)
        break Fail241;
      term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{t_52, v_52, y_52});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}