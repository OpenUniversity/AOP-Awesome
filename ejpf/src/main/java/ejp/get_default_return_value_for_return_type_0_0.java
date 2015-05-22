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

@SuppressWarnings("all") public class get_default_return_value_for_return_type_0_0 extends Strategy 
{ 
  public static get_default_return_value_for_return_type_0_0 instance = new get_default_return_value_for_return_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_default_return_value_for_return_type_0_0");
    Fail104:
    { 
      IStrategoTerm n_40 = null;
      IStrategoTerm o_40 = null;
      IStrategoTerm p_40 = null;
      n_40 = term;
      p_40 = term;
      term = strip_annos_0_0.instance.invoke(context, n_40);
      if(term == null)
        break Fail104;
      o_40 = term;
      term = p_40;
      IStrategoTerm term60 = term;
      Success55:
      { 
        Fail105:
        { 
          IStrategoTerm q_40 = null;
          q_40 = term;
          term = o_40;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consVoid_0 != ((IStrategoAppl)term).getConstructor())
            break Fail105;
          term = q_40;
          { 
            term = ejp.constNone0;
            if(true)
              break Success55;
          }
        }
        term = term60;
        IStrategoTerm term61 = term;
        Success56:
        { 
          Fail106:
          { 
            IStrategoTerm r_40 = null;
            r_40 = term;
            term = o_40;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
              break Fail106;
            term = r_40;
            { 
              term = ejp.constSome0;
              if(true)
                break Success56;
            }
          }
          term = term61;
          IStrategoTerm term62 = term;
          Success57:
          { 
            Fail107:
            { 
              IStrategoTerm s_40 = null;
              s_40 = term;
              term = o_40;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                break Fail107;
              term = s_40;
              { 
                term = ejp.constSome0;
                if(true)
                  break Success57;
              }
            }
            term = term62;
            IStrategoTerm term63 = term;
            Success58:
            { 
              Fail108:
              { 
                IStrategoTerm t_40 = null;
                t_40 = term;
                term = o_40;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail108;
                term = t_40;
                { 
                  term = ejp.constSome0;
                  if(true)
                    break Success58;
                }
              }
              term = term63;
              IStrategoTerm term64 = term;
              Success59:
              { 
                Fail109:
                { 
                  IStrategoTerm u_40 = null;
                  u_40 = term;
                  term = o_40;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail109;
                  term = u_40;
                  { 
                    term = ejp.constSome0;
                    if(true)
                      break Success59;
                  }
                }
                term = term64;
                IStrategoTerm term65 = term;
                Success60:
                { 
                  Fail110:
                  { 
                    IStrategoTerm v_40 = null;
                    v_40 = term;
                    term = o_40;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail110;
                    term = v_40;
                    { 
                      term = ejp.constSome0;
                      if(true)
                        break Success60;
                    }
                  }
                  term = term65;
                  IStrategoTerm term66 = term;
                  Success61:
                  { 
                    Fail111:
                    { 
                      IStrategoTerm w_40 = null;
                      w_40 = term;
                      term = o_40;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail111;
                      term = w_40;
                      { 
                        term = ejp.constSome0;
                        if(true)
                          break Success61;
                      }
                    }
                    term = term66;
                    Success62:
                    { 
                      Fail112:
                      { 
                        IStrategoTerm x_40 = null;
                        x_40 = term;
                        term = o_40;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail112;
                        term = x_40;
                        { 
                          term = ejp.constSome1;
                          if(true)
                            break Success62;
                        }
                      }
                      term = ejp.constSome2;
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