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

@SuppressWarnings("all") public class cast_equality_type_0_0 extends Strategy 
{ 
  public static cast_equality_type_0_0 instance = new cast_equality_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("cast_equality_type_0_0");
    Fail45:
    { 
      IStrategoTerm l_22 = null;
      IStrategoTerm m_22 = null;
      IStrategoTerm n_22 = null;
      l_22 = term;
      n_22 = term;
      m_22 = l_22;
      term = n_22;
      IStrategoTerm term78 = term;
      Success36:
      { 
        Fail46:
        { 
          IStrategoTerm o_22 = null;
          o_22 = term;
          term = m_22;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
            break Fail46;
          term = o_22;
          { 
            term = cool.constDouble0;
            if(true)
              break Success36;
          }
        }
        term = term78;
        IStrategoTerm term79 = term;
        Success37:
        { 
          Fail47:
          { 
            IStrategoTerm p_22 = null;
            p_22 = term;
            term = m_22;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
              break Fail47;
            term = p_22;
            { 
              term = cool.constDouble0;
              if(true)
                break Success37;
            }
          }
          term = term79;
          IStrategoTerm term80 = term;
          Success38:
          { 
            Fail48:
            { 
              IStrategoTerm q_22 = null;
              q_22 = term;
              term = m_22;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail48;
              term = q_22;
              { 
                term = cool.constDouble0;
                if(true)
                  break Success38;
              }
            }
            term = term80;
            IStrategoTerm term81 = term;
            Success39:
            { 
              Fail49:
              { 
                IStrategoTerm r_22 = null;
                r_22 = term;
                term = or_2_0.instance.invoke(context, m_22, lifted58.instance, lifted59.instance);
                if(term == null)
                  break Fail49;
                term = r_22;
                { 
                  term = cool.constDouble0;
                  if(true)
                    break Success39;
                }
              }
              term = term81;
              IStrategoTerm term82 = term;
              Success40:
              { 
                Fail50:
                { 
                  IStrategoTerm s_22 = null;
                  s_22 = term;
                  term = or_2_0.instance.invoke(context, m_22, lifted60.instance, lifted61.instance);
                  if(term == null)
                    break Fail50;
                  term = s_22;
                  { 
                    term = cool.constDouble0;
                    if(true)
                      break Success40;
                  }
                }
                term = term82;
                IStrategoTerm term83 = term;
                Success41:
                { 
                  Fail51:
                  { 
                    IStrategoTerm t_22 = null;
                    t_22 = term;
                    term = m_22;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail51;
                    term = t_22;
                    { 
                      term = cool.constDouble0;
                      if(true)
                        break Success41;
                    }
                  }
                  term = term83;
                  IStrategoTerm term84 = term;
                  Success42:
                  { 
                    Fail52:
                    { 
                      IStrategoTerm u_22 = null;
                      u_22 = term;
                      term = m_22;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail52;
                      term = u_22;
                      { 
                        term = cool.constDouble0;
                        if(true)
                          break Success42;
                      }
                    }
                    term = term84;
                    IStrategoTerm term85 = term;
                    Success43:
                    { 
                      Fail53:
                      { 
                        IStrategoTerm v_22 = null;
                        v_22 = term;
                        term = m_22;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail53;
                        term = v_22;
                        { 
                          term = cool.constDouble0;
                          if(true)
                            break Success43;
                        }
                      }
                      term = term85;
                      Success44:
                      { 
                        Fail54:
                        { 
                          IStrategoTerm w_22 = null;
                          w_22 = term;
                          term = or_2_0.instance.invoke(context, m_22, lifted62.instance, lifted63.instance);
                          if(term == null)
                            break Fail54;
                          term = w_22;
                          { 
                            term = cool.constBoolean0;
                            if(true)
                              break Success44;
                          }
                        }
                        term = debug_0_0.instance.invoke(context, cool.const12);
                        if(term == null)
                          break Fail45;
                        term = debug_0_0.instance.invoke(context, l_22);
                        if(term == null)
                          break Fail45;
                        term = cool.const9;
                        if(true)
                          break Fail45;
                      }
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