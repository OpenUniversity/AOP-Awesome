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
            IStrategoTerm e_53 = null;
            IStrategoTerm f_53 = null;
            IStrategoTerm g_53 = null;
            IStrategoTerm h_53 = null;
            e_53 = term.getSubterm(0);
            f_53 = term.getSubterm(1);
            h_53 = term;
            IStrategoTerm term184 = term;
            Success176:
            { 
              Fail247:
              { 
                term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{e_53, f_53});
                term = topdown_1_0.instance.invoke(context, term, lifted84.instance);
                if(term == null)
                  break Fail247;
                g_53 = term;
                if(true)
                  break Success176;
              }
              term = term184;
              IStrategoTerm j_53 = null;
              j_53 = term;
              term = report_with_failure_0_1.instance.invoke(context, j_53, ejp.const112);
              if(term == null)
                break Fail246;
            }
            term = h_53;
            if(g_53 == null)
              break Fail246;
            term = g_53;
            if(true)
              break Success175;
          }
          term = term183;
        }
        if(cons25 == transform._consAspectDec_2)
        { 
          IStrategoTerm w_52 = null;
          IStrategoTerm x_52 = null;
          IStrategoTerm y_52 = null;
          IStrategoTerm z_52 = null;
          w_52 = term.getSubterm(0);
          x_52 = term.getSubterm(1);
          z_52 = term;
          IStrategoTerm term186 = term;
          Success177:
          { 
            Fail248:
            { 
              term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{w_52, x_52});
              term = topdown_1_0.instance.invoke(context, term, lifted86.instance);
              if(term == null)
                break Fail248;
              y_52 = term;
              if(true)
                break Success177;
            }
            term = term186;
            IStrategoTerm b_53 = null;
            b_53 = term;
            term = report_with_failure_0_1.instance.invoke(context, b_53, ejp.const112);
            if(term == null)
              break Fail245;
          }
          term = z_52;
          if(y_52 == null)
            break Fail245;
          term = y_52;
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