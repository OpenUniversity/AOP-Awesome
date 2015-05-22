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

@SuppressWarnings("all") public class cast_conditional_type_0_0 extends Strategy 
{ 
  public static cast_conditional_type_0_0 instance = new cast_conditional_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("cast_conditional_type_0_0");
    Fail77:
    { 
      IStrategoTerm h_24 = null;
      IStrategoTerm i_24 = null;
      IStrategoTerm j_24 = null;
      h_24 = term;
      j_24 = term;
      i_24 = h_24;
      term = j_24;
      IStrategoTerm term106 = term;
      Success64:
      { 
        Fail78:
        { 
          IStrategoTerm k_24 = null;
          k_24 = term;
          term = i_24;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
            break Fail78;
          term = k_24;
          { 
            term = cool.constLong0;
            if(true)
              break Success64;
          }
        }
        term = term106;
        IStrategoTerm term107 = term;
        Success65:
        { 
          Fail79:
          { 
            IStrategoTerm l_24 = null;
            l_24 = term;
            term = or_2_0.instance.invoke(context, i_24, lifted70.instance, lifted71.instance);
            if(term == null)
              break Fail79;
            term = l_24;
            { 
              term = cool.constLong0;
              if(true)
                break Success65;
            }
          }
          term = term107;
          IStrategoTerm term108 = term;
          Success66:
          { 
            Fail80:
            { 
              IStrategoTerm m_24 = null;
              m_24 = term;
              term = i_24;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail80;
              term = m_24;
              { 
                term = cool.constLong0;
                if(true)
                  break Success66;
              }
            }
            term = term108;
            IStrategoTerm term109 = term;
            Success67:
            { 
              Fail81:
              { 
                IStrategoTerm n_24 = null;
                n_24 = term;
                term = i_24;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail81;
                term = n_24;
                { 
                  term = cool.constLong0;
                  if(true)
                    break Success67;
                }
              }
              term = term109;
              IStrategoTerm term110 = term;
              Success68:
              { 
                Fail82:
                { 
                  IStrategoTerm o_24 = null;
                  o_24 = term;
                  term = i_24;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail82;
                  term = o_24;
                  { 
                    term = cool.constLong0;
                    if(true)
                      break Success68;
                  }
                }
                term = term110;
                IStrategoTerm term111 = term;
                Success69:
                { 
                  Fail83:
                  { 
                    IStrategoTerm p_24 = null;
                    p_24 = term;
                    term = i_24;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail83;
                    term = p_24;
                    { 
                      term = cool.constLong0;
                      if(true)
                        break Success69;
                    }
                  }
                  term = term111;
                  Success70:
                  { 
                    Fail84:
                    { 
                      IStrategoTerm q_24 = null;
                      q_24 = term;
                      term = or_2_0.instance.invoke(context, i_24, lifted72.instance, lifted73.instance);
                      if(term == null)
                        break Fail84;
                      term = q_24;
                      { 
                        term = cool.constBoolean0;
                        if(true)
                          break Success70;
                      }
                    }
                    term = debug_0_0.instance.invoke(context, cool.const12);
                    if(term == null)
                      break Fail77;
                    term = debug_0_0.instance.invoke(context, h_24);
                    if(term == null)
                      break Fail77;
                    term = cool.const9;
                    if(true)
                      break Fail77;
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