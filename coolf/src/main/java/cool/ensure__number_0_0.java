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

@SuppressWarnings("all") public class ensure__number_0_0 extends Strategy 
{ 
  public static ensure__number_0_0 instance = new ensure__number_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ensure__number_0_0");
    Fail85:
    { 
      IStrategoTerm t_24 = null;
      IStrategoTerm u_24 = null;
      IStrategoTerm v_24 = null;
      t_24 = term;
      v_24 = term;
      u_24 = t_24;
      term = v_24;
      IStrategoTerm term113 = term;
      Success71:
      { 
        Fail86:
        { 
          IStrategoTerm w_24 = null;
          w_24 = term;
          term = u_24;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
            break Fail86;
          term = w_24;
          { 
            term = cool.constByte0;
            if(true)
              break Success71;
          }
        }
        term = term113;
        IStrategoTerm term114 = term;
        Success72:
        { 
          Fail87:
          { 
            IStrategoTerm x_24 = null;
            x_24 = term;
            term = or_2_0.instance.invoke(context, u_24, lifted74.instance, lifted75.instance);
            if(term == null)
              break Fail87;
            term = x_24;
            { 
              term = cool.constChar0;
              if(true)
                break Success72;
            }
          }
          term = term114;
          IStrategoTerm term115 = term;
          Success73:
          { 
            Fail88:
            { 
              IStrategoTerm y_24 = null;
              y_24 = term;
              term = u_24;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail88;
              term = y_24;
              { 
                term = cool.constShort0;
                if(true)
                  break Success73;
              }
            }
            term = term115;
            IStrategoTerm term116 = term;
            Success74:
            { 
              Fail89:
              { 
                IStrategoTerm z_24 = null;
                z_24 = term;
                term = u_24;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail89;
                term = z_24;
                { 
                  term = cool.constInt0;
                  if(true)
                    break Success74;
                }
              }
              term = term116;
              IStrategoTerm term117 = term;
              Success75:
              { 
                Fail90:
                { 
                  IStrategoTerm a_25 = null;
                  a_25 = term;
                  term = u_24;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail90;
                  term = a_25;
                  { 
                    term = cool.constLong0;
                    if(true)
                      break Success75;
                  }
                }
                term = term117;
                IStrategoTerm term118 = term;
                Success76:
                { 
                  Fail91:
                  { 
                    IStrategoTerm b_25 = null;
                    b_25 = term;
                    term = u_24;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail91;
                    term = b_25;
                    { 
                      term = cool.constLong0;
                      if(true)
                        break Success76;
                    }
                  }
                  term = term118;
                  IStrategoTerm term119 = term;
                  Success77:
                  { 
                    Fail92:
                    { 
                      IStrategoTerm c_25 = null;
                      c_25 = term;
                      term = or_2_0.instance.invoke(context, u_24, lifted76.instance, lifted77.instance);
                      if(term == null)
                        break Fail92;
                      term = c_25;
                      { 
                        term = cool.constFloat0;
                        if(true)
                          break Success77;
                      }
                    }
                    term = term119;
                    Success78:
                    { 
                      Fail93:
                      { 
                        IStrategoTerm d_25 = null;
                        d_25 = term;
                        term = u_24;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail93;
                        term = d_25;
                        { 
                          term = cool.constDouble0;
                          if(true)
                            break Success78;
                        }
                      }
                      term = debug_0_0.instance.invoke(context, cool.const12);
                      if(term == null)
                        break Fail85;
                      term = debug_0_0.instance.invoke(context, t_24);
                      if(term == null)
                        break Fail85;
                      term = cool.const9;
                      if(true)
                        break Fail85;
                    }
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