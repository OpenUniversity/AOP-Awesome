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
    Fail199:
    { 
      IStrategoTerm s_40 = null;
      IStrategoTerm t_40 = null;
      IStrategoTerm u_40 = null;
      s_40 = term;
      u_40 = term;
      t_40 = s_40;
      term = u_40;
      IStrategoTerm term219 = term;
      Success174:
      { 
        Fail200:
        { 
          IStrategoTerm v_40 = null;
          v_40 = term;
          term = t_40;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
            break Fail200;
          term = v_40;
          { 
            term = cool.constByte0;
            if(true)
              break Success174;
          }
        }
        term = term219;
        IStrategoTerm term220 = term;
        Success175:
        { 
          Fail201:
          { 
            IStrategoTerm w_40 = null;
            w_40 = term;
            term = or_2_0.instance.invoke(context, t_40, lifted78.instance, lifted79.instance);
            if(term == null)
              break Fail201;
            term = w_40;
            { 
              term = cool.constChar0;
              if(true)
                break Success175;
            }
          }
          term = term220;
          IStrategoTerm term221 = term;
          Success176:
          { 
            Fail202:
            { 
              IStrategoTerm x_40 = null;
              x_40 = term;
              term = t_40;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail202;
              term = x_40;
              { 
                term = cool.constShort0;
                if(true)
                  break Success176;
              }
            }
            term = term221;
            IStrategoTerm term222 = term;
            Success177:
            { 
              Fail203:
              { 
                IStrategoTerm y_40 = null;
                y_40 = term;
                term = t_40;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail203;
                term = y_40;
                { 
                  term = cool.constInt0;
                  if(true)
                    break Success177;
                }
              }
              term = term222;
              IStrategoTerm term223 = term;
              Success178:
              { 
                Fail204:
                { 
                  IStrategoTerm z_40 = null;
                  z_40 = term;
                  term = t_40;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail204;
                  term = z_40;
                  { 
                    term = cool.constLong0;
                    if(true)
                      break Success178;
                  }
                }
                term = term223;
                IStrategoTerm term224 = term;
                Success179:
                { 
                  Fail205:
                  { 
                    IStrategoTerm a_41 = null;
                    a_41 = term;
                    term = t_40;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail205;
                    term = a_41;
                    { 
                      term = cool.constLong0;
                      if(true)
                        break Success179;
                    }
                  }
                  term = term224;
                  IStrategoTerm term225 = term;
                  Success180:
                  { 
                    Fail206:
                    { 
                      IStrategoTerm b_41 = null;
                      b_41 = term;
                      term = or_2_0.instance.invoke(context, t_40, lifted80.instance, lifted81.instance);
                      if(term == null)
                        break Fail206;
                      term = b_41;
                      { 
                        term = cool.constFloat0;
                        if(true)
                          break Success180;
                      }
                    }
                    term = term225;
                    Success181:
                    { 
                      Fail207:
                      { 
                        IStrategoTerm c_41 = null;
                        c_41 = term;
                        term = t_40;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail207;
                        term = c_41;
                        { 
                          term = cool.constDouble0;
                          if(true)
                            break Success181;
                        }
                      }
                      term = debug_0_0.instance.invoke(context, cool.const80);
                      if(term == null)
                        break Fail199;
                      term = debug_0_0.instance.invoke(context, s_40);
                      if(term == null)
                        break Fail199;
                      term = cool.const77;
                      if(true)
                        break Fail199;
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