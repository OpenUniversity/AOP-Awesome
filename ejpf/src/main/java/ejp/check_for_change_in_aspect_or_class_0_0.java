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

@SuppressWarnings("all") public class check_for_change_in_aspect_or_class_0_0 extends Strategy 
{ 
  public static check_for_change_in_aspect_or_class_0_0 instance = new check_for_change_in_aspect_or_class_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("check_for_change_in_aspect_or_class_0_0");
    Fail245:
    { 
      IStrategoTerm term183 = term;
      IStrategoConstructor cons25 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success175:
      { 
        if(cons25 == transform._consClassDec_2)
        { 
          Fail246:
          { 
            IStrategoTerm q_53 = null;
            IStrategoTerm r_53 = null;
            IStrategoTerm s_53 = null;
            IStrategoTerm t_53 = null;
            q_53 = term.getSubterm(0);
            r_53 = term.getSubterm(1);
            t_53 = term;
            IStrategoTerm term184 = term;
            Success176:
            { 
              Fail247:
              { 
                term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{q_53, r_53});
                term = topdown_1_0.instance.invoke(context, term, lifted84.instance);
                if(term == null)
                  break Fail247;
                s_53 = term;
                if(true)
                  break Success176;
              }
              term = term184;
              IStrategoTerm v_53 = null;
              v_53 = term;
              term = report_with_failure_0_1.instance.invoke(context, v_53, ejp.const112);
              if(term == null)
                break Fail246;
            }
            term = t_53;
            if(s_53 == null)
              break Fail246;
            term = s_53;
            if(true)
              break Success175;
          }
          term = term183;
        }
        if(cons25 == transform._consAspectDec_2)
        { 
          IStrategoTerm i_53 = null;
          IStrategoTerm j_53 = null;
          IStrategoTerm k_53 = null;
          IStrategoTerm l_53 = null;
          i_53 = term.getSubterm(0);
          j_53 = term.getSubterm(1);
          l_53 = term;
          IStrategoTerm term186 = term;
          Success177:
          { 
            Fail248:
            { 
              term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{i_53, j_53});
              term = topdown_1_0.instance.invoke(context, term, lifted86.instance);
              if(term == null)
                break Fail248;
              k_53 = term;
              if(true)
                break Success177;
            }
            term = term186;
            IStrategoTerm n_53 = null;
            n_53 = term;
            term = report_with_failure_0_1.instance.invoke(context, n_53, ejp.const112);
            if(term == null)
              break Fail245;
          }
          term = l_53;
          if(k_53 == null)
            break Fail245;
          term = k_53;
        }
        else
        { 
          break Fail245;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}