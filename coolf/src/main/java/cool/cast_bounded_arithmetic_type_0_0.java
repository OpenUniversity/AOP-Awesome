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

@SuppressWarnings("all") public class cast_bounded_arithmetic_type_0_0 extends Strategy 
{ 
  public static cast_bounded_arithmetic_type_0_0 instance = new cast_bounded_arithmetic_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("cast_bounded_arithmetic_type_0_0");
    Fail183:
    { 
      IStrategoTerm u_39 = null;
      IStrategoTerm v_39 = null;
      IStrategoTerm w_39 = null;
      u_39 = term;
      w_39 = term;
      v_39 = u_39;
      term = w_39;
      IStrategoTerm term205 = term;
      Success160:
      { 
        Fail184:
        { 
          IStrategoTerm x_39 = null;
          x_39 = term;
          term = v_39;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
            break Fail184;
          term = x_39;
          { 
            term = cool.constInt0;
            if(true)
              break Success160;
          }
        }
        term = term205;
        IStrategoTerm term206 = term;
        Success161:
        { 
          Fail185:
          { 
            IStrategoTerm y_39 = null;
            y_39 = term;
            term = v_39;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
              break Fail185;
            term = y_39;
            { 
              term = cool.constInt0;
              if(true)
                break Success161;
            }
          }
          term = term206;
          IStrategoTerm term207 = term;
          Success162:
          { 
            Fail186:
            { 
              IStrategoTerm z_39 = null;
              z_39 = term;
              term = v_39;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail186;
              term = z_39;
              { 
                term = cool.constInt0;
                if(true)
                  break Success162;
              }
            }
            term = term207;
            IStrategoTerm term208 = term;
            Success163:
            { 
              Fail187:
              { 
                IStrategoTerm a_40 = null;
                a_40 = term;
                term = v_39;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail187;
                term = a_40;
                { 
                  term = cool.constLong0;
                  if(true)
                    break Success163;
                }
              }
              term = term208;
              IStrategoTerm term209 = term;
              Success164:
              { 
                Fail188:
                { 
                  IStrategoTerm b_40 = null;
                  b_40 = term;
                  term = or_2_0.instance.invoke(context, v_39, lifted72.instance, lifted73.instance);
                  if(term == null)
                    break Fail188;
                  term = b_40;
                  { 
                    term = cool.constFloat0;
                    if(true)
                      break Success164;
                  }
                }
                term = term209;
                IStrategoTerm term210 = term;
                Success165:
                { 
                  Fail189:
                  { 
                    IStrategoTerm c_40 = null;
                    c_40 = term;
                    term = v_39;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail189;
                    term = c_40;
                    { 
                      term = cool.constDouble0;
                      if(true)
                        break Success165;
                    }
                  }
                  term = term210;
                  Success166:
                  { 
                    Fail190:
                    { 
                      IStrategoTerm d_40 = null;
                      d_40 = term;
                      term = v_39;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail190;
                      term = d_40;
                      { 
                        term = cool.constLong0;
                        if(true)
                          break Success166;
                      }
                    }
                    term = debug_0_0.instance.invoke(context, cool.const80);
                    if(term == null)
                      break Fail183;
                    term = debug_0_0.instance.invoke(context, u_39);
                    if(term == null)
                      break Fail183;
                    term = cool.const77;
                    if(true)
                      break Fail183;
                  }
                }
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