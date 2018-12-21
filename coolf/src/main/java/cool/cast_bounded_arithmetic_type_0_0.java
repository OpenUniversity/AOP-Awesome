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
    Fail69:
    { 
      IStrategoTerm v_23 = null;
      IStrategoTerm w_23 = null;
      IStrategoTerm x_23 = null;
      v_23 = term;
      x_23 = term;
      w_23 = v_23;
      term = x_23;
      IStrategoTerm term99 = term;
      Success57:
      { 
        Fail70:
        { 
          IStrategoTerm y_23 = null;
          y_23 = term;
          term = w_23;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
            break Fail70;
          term = y_23;
          { 
            term = cool.constInt0;
            if(true)
              break Success57;
          }
        }
        term = term99;
        IStrategoTerm term100 = term;
        Success58:
        { 
          Fail71:
          { 
            IStrategoTerm z_23 = null;
            z_23 = term;
            term = w_23;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
              break Fail71;
            term = z_23;
            { 
              term = cool.constInt0;
              if(true)
                break Success58;
            }
          }
          term = term100;
          IStrategoTerm term101 = term;
          Success59:
          { 
            Fail72:
            { 
              IStrategoTerm a_24 = null;
              a_24 = term;
              term = w_23;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail72;
              term = a_24;
              { 
                term = cool.constInt0;
                if(true)
                  break Success59;
              }
            }
            term = term101;
            IStrategoTerm term102 = term;
            Success60:
            { 
              Fail73:
              { 
                IStrategoTerm b_24 = null;
                b_24 = term;
                term = w_23;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail73;
                term = b_24;
                { 
                  term = cool.constLong0;
                  if(true)
                    break Success60;
                }
              }
              term = term102;
              IStrategoTerm term103 = term;
              Success61:
              { 
                Fail74:
                { 
                  IStrategoTerm c_24 = null;
                  c_24 = term;
                  term = or_2_0.instance.invoke(context, w_23, lifted68.instance, lifted69.instance);
                  if(term == null)
                    break Fail74;
                  term = c_24;
                  { 
                    term = cool.constFloat0;
                    if(true)
                      break Success61;
                  }
                }
                term = term103;
                IStrategoTerm term104 = term;
                Success62:
                { 
                  Fail75:
                  { 
                    IStrategoTerm d_24 = null;
                    d_24 = term;
                    term = w_23;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail75;
                    term = d_24;
                    { 
                      term = cool.constDouble0;
                      if(true)
                        break Success62;
                    }
                  }
                  term = term104;
                  Success63:
                  { 
                    Fail76:
                    { 
                      IStrategoTerm e_24 = null;
                      e_24 = term;
                      term = w_23;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail76;
                      term = e_24;
                      { 
                        term = cool.constLong0;
                        if(true)
                          break Success63;
                      }
                    }
                    term = debug_0_0.instance.invoke(context, cool.const12);
                    if(term == null)
                      break Fail69;
                    term = debug_0_0.instance.invoke(context, v_23);
                    if(term == null)
                      break Fail69;
                    term = cool.const9;
                    if(true)
                      break Fail69;
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