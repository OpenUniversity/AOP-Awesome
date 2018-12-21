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

@SuppressWarnings("all") public class cast_shift_type_0_0 extends Strategy 
{ 
  public static cast_shift_type_0_0 instance = new cast_shift_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("cast_shift_type_0_0");
    Fail61:
    { 
      IStrategoTerm j_23 = null;
      IStrategoTerm k_23 = null;
      IStrategoTerm l_23 = null;
      j_23 = term;
      l_23 = term;
      k_23 = j_23;
      term = l_23;
      IStrategoTerm term92 = term;
      Success50:
      { 
        Fail62:
        { 
          IStrategoTerm m_23 = null;
          m_23 = term;
          term = k_23;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
            break Fail62;
          term = m_23;
          { 
            term = cool.constInt0;
            if(true)
              break Success50;
          }
        }
        term = term92;
        IStrategoTerm term93 = term;
        Success51:
        { 
          Fail63:
          { 
            IStrategoTerm n_23 = null;
            n_23 = term;
            term = k_23;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
              break Fail63;
            term = n_23;
            { 
              term = cool.constInt0;
              if(true)
                break Success51;
            }
          }
          term = term93;
          IStrategoTerm term94 = term;
          Success52:
          { 
            Fail64:
            { 
              IStrategoTerm o_23 = null;
              o_23 = term;
              term = k_23;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail64;
              term = o_23;
              { 
                term = cool.constInt0;
                if(true)
                  break Success52;
              }
            }
            term = term94;
            IStrategoTerm term95 = term;
            Success53:
            { 
              Fail65:
              { 
                IStrategoTerm p_23 = null;
                p_23 = term;
                term = k_23;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail65;
                term = p_23;
                { 
                  term = cool.constLong0;
                  if(true)
                    break Success53;
                }
              }
              term = term95;
              IStrategoTerm term96 = term;
              Success54:
              { 
                Fail66:
                { 
                  IStrategoTerm q_23 = null;
                  q_23 = term;
                  term = or_2_0.instance.invoke(context, k_23, lifted66.instance, lifted67.instance);
                  if(term == null)
                    break Fail66;
                  term = q_23;
                  { 
                    term = cool.constLong0;
                    if(true)
                      break Success54;
                  }
                }
                term = term96;
                IStrategoTerm term97 = term;
                Success55:
                { 
                  Fail67:
                  { 
                    IStrategoTerm r_23 = null;
                    r_23 = term;
                    term = k_23;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail67;
                    term = r_23;
                    { 
                      term = cool.constLong0;
                      if(true)
                        break Success55;
                    }
                  }
                  term = term97;
                  Success56:
                  { 
                    Fail68:
                    { 
                      IStrategoTerm s_23 = null;
                      s_23 = term;
                      term = k_23;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail68;
                      term = s_23;
                      { 
                        term = cool.constLong0;
                        if(true)
                          break Success56;
                      }
                    }
                    term = debug_0_0.instance.invoke(context, cool.const12);
                    if(term == null)
                      break Fail61;
                    term = debug_0_0.instance.invoke(context, j_23);
                    if(term == null)
                      break Fail61;
                    term = cool.const9;
                    if(true)
                      break Fail61;
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