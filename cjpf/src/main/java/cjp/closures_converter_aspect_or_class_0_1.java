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

@SuppressWarnings("all") public class closures_converter_aspect_or_class_0_1 extends Strategy 
{ 
  public static closures_converter_aspect_or_class_0_1 instance = new closures_converter_aspect_or_class_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("closures_converter_aspect_or_class_0_1");
    Fail152:
    { 
      IStrategoTerm term128 = term;
      IStrategoConstructor cons12 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success124:
      { 
        if(cons12 == transform._consAspectDec_2)
        { 
          Fail153:
          { 
            IStrategoTerm d_33 = null;
            IStrategoTerm e_33 = null;
            IStrategoTerm f_33 = null;
            IStrategoTerm g_33 = null;
            d_33 = term.getSubterm(0);
            e_33 = term.getSubterm(1);
            g_33 = term;
            IStrategoTerm term129 = term;
            Success125:
            { 
              Fail154:
              { 
                term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{d_33, e_33});
                term = closures_to_ajc_0_1.instance.invoke(context, term, v_40);
                if(term == null)
                  break Fail154;
                f_33 = term;
                if(true)
                  break Success125;
              }
              term = term129;
              IStrategoTerm i_33 = null;
              i_33 = term;
              term = report_with_failure_0_1.instance.invoke(context, i_33, cjp.const105);
              if(term == null)
                break Fail153;
            }
            term = g_33;
            if(f_33 == null)
              break Fail153;
            term = f_33;
            if(true)
              break Success124;
          }
          term = term128;
        }
        if(cons12 == transform._consClassDec_2)
        { 
          IStrategoTerm u_32 = null;
          IStrategoTerm v_32 = null;
          IStrategoTerm w_32 = null;
          IStrategoTerm x_32 = null;
          u_32 = term.getSubterm(0);
          v_32 = term.getSubterm(1);
          x_32 = term;
          IStrategoTerm term130 = term;
          Success126:
          { 
            Fail155:
            { 
              term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{u_32, v_32});
              term = closures_to_java_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail155;
              w_32 = term;
              if(true)
                break Success126;
            }
            term = term130;
            IStrategoTerm z_32 = null;
            z_32 = term;
            term = report_with_failure_0_1.instance.invoke(context, z_32, cjp.const105);
            if(term == null)
              break Fail152;
          }
          term = x_32;
          if(w_32 == null)
            break Fail152;
          term = w_32;
        }
        else
        { 
          break Fail152;
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