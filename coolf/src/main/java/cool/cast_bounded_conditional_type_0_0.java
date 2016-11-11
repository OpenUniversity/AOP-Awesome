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
    Fail169:
    { 
      IStrategoTerm y_38 = null;
      IStrategoTerm z_38 = null;
      IStrategoTerm a_39 = null;
      y_38 = term;
      a_39 = term;
      z_38 = y_38;
      term = a_39;
      IStrategoTerm term193 = term;
      Success148:
      { 
        Fail170:
        { 
          IStrategoTerm b_39 = null;
          b_39 = term;
          term = z_38;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
            break Fail170;
          term = b_39;
          { 
            term = cool.constInt0;
            if(true)
              break Success148;
          }
        }
        term = term193;
        IStrategoTerm term194 = term;
        Success149:
        { 
          Fail171:
          { 
            IStrategoTerm c_39 = null;
            c_39 = term;
            term = z_38;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
              break Fail171;
            term = c_39;
            { 
              term = cool.constLong0;
              if(true)
                break Success149;
            }
          }
          term = term194;
          IStrategoTerm term195 = term;
          Success150:
          { 
            Fail172:
            { 
              IStrategoTerm d_39 = null;
              d_39 = term;
              term = z_38;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                break Fail172;
              term = d_39;
              { 
                term = cool.constLong0;
                if(true)
                  break Success150;
              }
            }
            term = term195;
            IStrategoTerm term196 = term;
            Success151:
            { 
              Fail173:
              { 
                IStrategoTerm e_39 = null;
                e_39 = term;
                term = z_38;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail173;
                term = e_39;
                { 
                  term = cool.constLong0;
                  if(true)
                    break Success151;
                }
              }
              term = term196;
              Success152:
              { 
                Fail174:
                { 
                  IStrategoTerm f_39 = null;
                  f_39 = term;
                  term = or_2_0.instance.invoke(context, z_38, lifted68.instance, lifted69.instance);
                  if(term == null)
                    break Fail174;
                  term = f_39;
                  { 
                    term = cool.constBoolean0;
                    if(true)
                      break Success152;
                  }
                }
                term = debug_0_0.instance.invoke(context, cool.const80);
                if(term == null)
                  break Fail169;
                term = debug_0_0.instance.invoke(context, y_38);
                if(term == null)
                  break Fail169;
                term = cool.const77;
                if(true)
                  break Fail169;
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