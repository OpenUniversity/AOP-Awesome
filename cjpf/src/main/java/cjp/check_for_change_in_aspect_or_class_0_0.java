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

@SuppressWarnings("all") public class check_for_change_in_aspect_or_class_0_0 extends Strategy 
{ 
  public static check_for_change_in_aspect_or_class_0_0 instance = new check_for_change_in_aspect_or_class_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("check_for_change_in_aspect_or_class_0_0");
    Fail148:
    { 
      IStrategoTerm term124 = term;
      IStrategoConstructor cons11 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success121:
      { 
        if(cons11 == transform._consClassDec_2)
        { 
          Fail149:
          { 
            IStrategoTerm l_32 = null;
            IStrategoTerm m_32 = null;
            IStrategoTerm n_32 = null;
            IStrategoTerm o_32 = null;
            l_32 = term.getSubterm(0);
            m_32 = term.getSubterm(1);
            o_32 = term;
            IStrategoTerm term125 = term;
            Success122:
            { 
              Fail150:
              { 
                term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{l_32, m_32});
                term = topdown_1_0.instance.invoke(context, term, lifted37.instance);
                if(term == null)
                  break Fail150;
                n_32 = term;
                if(true)
                  break Success122;
              }
              term = term125;
              IStrategoTerm q_32 = null;
              q_32 = term;
              term = report_with_failure_0_1.instance.invoke(context, q_32, cjp.const104);
              if(term == null)
                break Fail149;
            }
            term = o_32;
            if(n_32 == null)
              break Fail149;
            term = n_32;
            if(true)
              break Success121;
          }
          term = term124;
        }
        if(cons11 == transform._consAspectDec_2)
        { 
          IStrategoTerm d_32 = null;
          IStrategoTerm e_32 = null;
          IStrategoTerm f_32 = null;
          IStrategoTerm g_32 = null;
          d_32 = term.getSubterm(0);
          e_32 = term.getSubterm(1);
          g_32 = term;
          IStrategoTerm term127 = term;
          Success123:
          { 
            Fail151:
            { 
              term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{d_32, e_32});
              term = topdown_1_0.instance.invoke(context, term, lifted39.instance);
              if(term == null)
                break Fail151;
              f_32 = term;
              if(true)
                break Success123;
            }
            term = term127;
            IStrategoTerm i_32 = null;
            i_32 = term;
            term = report_with_failure_0_1.instance.invoke(context, i_32, cjp.const104);
            if(term == null)
              break Fail148;
          }
          term = g_32;
          if(f_32 == null)
            break Fail148;
          term = f_32;
        }
        else
        { 
          break Fail148;
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