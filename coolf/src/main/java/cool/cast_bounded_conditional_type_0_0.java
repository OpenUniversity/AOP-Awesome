package cool;

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

@SuppressWarnings("all") public class cast_bounded_conditional_type_0_0 extends Strategy 
{ 
  public static cast_bounded_conditional_type_0_0 instance = new cast_bounded_conditional_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("cast_bounded_conditional_type_0_0");
    Fail55:
    { 
      IStrategoTerm z_22 = null;
      IStrategoTerm a_23 = null;
      IStrategoTerm b_23 = null;
      z_22 = term;
      b_23 = term;
      a_23 = z_22;
      term = b_23;
      IStrategoTerm term87 = term;
      Success45:
      { 
        Fail56:
        { 
          IStrategoTerm c_23 = null;
          c_23 = term;
          term = a_23;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
            break Fail56;
          term = c_23;
          { 
            term = cool.constInt0;
            if(true)
              break Success45;
          }
        }
        term = term87;
        IStrategoTerm term88 = term;
        Success46:
        { 
          Fail57:
          { 
            IStrategoTerm d_23 = null;
            d_23 = term;
            term = a_23;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
              break Fail57;
            term = d_23;
            { 
              term = cool.constLong0;
              if(true)
                break Success46;
            }
          }
          term = term88;
          IStrategoTerm term89 = term;
          Success47:
          { 
            Fail58:
            { 
              IStrategoTerm e_23 = null;
              e_23 = term;
              term = a_23;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                break Fail58;
              term = e_23;
              { 
                term = cool.constLong0;
                if(true)
                  break Success47;
              }
            }
            term = term89;
            IStrategoTerm term90 = term;
            Success48:
            { 
              Fail59:
              { 
                IStrategoTerm f_23 = null;
                f_23 = term;
                term = a_23;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail59;
                term = f_23;
                { 
                  term = cool.constLong0;
                  if(true)
                    break Success48;
                }
              }
              term = term90;
              Success49:
              { 
                Fail60:
                { 
                  IStrategoTerm g_23 = null;
                  g_23 = term;
                  term = or_2_0.instance.invoke(context, a_23, lifted64.instance, lifted65.instance);
                  if(term == null)
                    break Fail60;
                  term = g_23;
                  { 
                    term = cool.constBoolean0;
                    if(true)
                      break Success49;
                  }
                }
                term = debug_0_0.instance.invoke(context, cool.const12);
                if(term == null)
                  break Fail55;
                term = debug_0_0.instance.invoke(context, z_22);
                if(term == null)
                  break Fail55;
                term = cool.const9;
                if(true)
                  break Fail55;
              }
            }
          }
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