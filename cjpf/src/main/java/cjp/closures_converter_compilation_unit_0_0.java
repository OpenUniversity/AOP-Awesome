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

@SuppressWarnings("all") public class closures_converter_compilation_unit_0_0 extends Strategy 
{ 
  public static closures_converter_compilation_unit_0_0 instance = new closures_converter_compilation_unit_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("closures_converter_compilation_unit_0_0");
    Fail144:
    { 
      IStrategoTerm n_31 = null;
      IStrategoTerm o_31 = null;
      IStrategoTerm p_31 = null;
      IStrategoTerm q_31 = null;
      TermReference r_31 = new TermReference();
      IStrategoTerm s_31 = null;
      IStrategoTerm t_31 = null;
      IStrategoTerm w_31 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail144;
      o_31 = term.getSubterm(0);
      p_31 = term.getSubterm(1);
      s_31 = term.getSubterm(2);
      w_31 = term;
      IStrategoTerm term121 = term;
      Success118:
      { 
        Fail145:
        { 
          IStrategoTerm term122 = term;
          Success119:
          { 
            Fail146:
            { 
              IStrategoTerm u_31 = null;
              IStrategoTerm x_31 = null;
              u_31 = term;
              term = SRTS_all.instance.invoke(context, s_31, lifted33.instance);
              if(term == null)
                break Fail146;
              x_31 = term;
              n_31 = s_31;
              term = x_31;
              if(term != n_31 && !n_31.match(term))
                break Fail146;
              term = u_31;
              { 
                q_31 = p_31;
                term = s_31;
                t_31 = s_31;
                if(true)
                  break Success119;
              }
            }
            term = term122;
            Success120:
            { 
              Fail147:
              { 
                IStrategoTerm v_31 = null;
                v_31 = term;
                term = o_31;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail147;
                IStrategoTerm arg94 = term.getSubterm(0);
                if(arg94.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg94).getConstructor())
                  break Fail147;
                term = v_31;
                { 
                  term = o_31;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail145;
                  IStrategoTerm arg97 = term.getSubterm(0);
                  if(arg97.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg97).getConstructor())
                    break Fail145;
                  if(r_31.value == null)
                    r_31.value = arg97.getSubterm(1);
                  else
                    if(r_31.value != arg97.getSubterm(1) && !r_31.value.match(arg97.getSubterm(1)))
                      break Fail145;
                  if(true)
                    break Success120;
                }
              }
              term = cjp.constNone0;
              if(r_31.value == null)
                r_31.value = term;
              else
                if(r_31.value != term && !r_31.value.match(term))
                  break Fail145;
            }
            term = termFactory.makeTuple(p_31, cjp.constCons39);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail145;
            q_31 = term;
            term = s_31;
            lifted35 lifted350 = new lifted35();
            lifted350.r_31 = r_31;
            term = SRTS_all.instance.invoke(context, term, lifted350);
            if(term == null)
              break Fail145;
            t_31 = term;
          }
          if(true)
            break Success118;
        }
        term = term121;
        IStrategoTerm a_32 = null;
        a_32 = term;
        term = report_with_failure_0_1.instance.invoke(context, a_32, cjp.const103);
        if(term == null)
          break Fail144;
      }
      term = w_31;
      if(q_31 == null || t_31 == null)
        break Fail144;
      term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{o_31, q_31, t_31});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}