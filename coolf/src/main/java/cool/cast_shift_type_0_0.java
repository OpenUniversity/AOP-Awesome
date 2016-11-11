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
    Fail175:
    { 
      IStrategoTerm i_39 = null;
      IStrategoTerm j_39 = null;
      IStrategoTerm k_39 = null;
      i_39 = term;
      k_39 = term;
      j_39 = i_39;
      term = k_39;
      IStrategoTerm term198 = term;
      Success153:
      { 
        Fail176:
        { 
          IStrategoTerm l_39 = null;
          l_39 = term;
          term = j_39;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
            break Fail176;
          term = l_39;
          { 
            term = cool.constInt0;
            if(true)
              break Success153;
          }
        }
        term = term198;
        IStrategoTerm term199 = term;
        Success154:
        { 
          Fail177:
          { 
            IStrategoTerm m_39 = null;
            m_39 = term;
            term = j_39;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
              break Fail177;
            term = m_39;
            { 
              term = cool.constInt0;
              if(true)
                break Success154;
            }
          }
          term = term199;
          IStrategoTerm term200 = term;
          Success155:
          { 
            Fail178:
            { 
              IStrategoTerm n_39 = null;
              n_39 = term;
              term = j_39;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail178;
              term = n_39;
              { 
                term = cool.constInt0;
                if(true)
                  break Success155;
              }
            }
            term = term200;
            IStrategoTerm term201 = term;
            Success156:
            { 
              Fail179:
              { 
                IStrategoTerm o_39 = null;
                o_39 = term;
                term = j_39;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail179;
                term = o_39;
                { 
                  term = cool.constLong0;
                  if(true)
                    break Success156;
                }
              }
              term = term201;
              IStrategoTerm term202 = term;
              Success157:
              { 
                Fail180:
                { 
                  IStrategoTerm p_39 = null;
                  p_39 = term;
                  term = or_2_0.instance.invoke(context, j_39, lifted70.instance, lifted71.instance);
                  if(term == null)
                    break Fail180;
                  term = p_39;
                  { 
                    term = cool.constLong0;
                    if(true)
                      break Success157;
                  }
                }
                term = term202;
                IStrategoTerm term203 = term;
                Success158:
                { 
                  Fail181:
                  { 
                    IStrategoTerm q_39 = null;
                    q_39 = term;
                    term = j_39;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail181;
                    term = q_39;
                    { 
                      term = cool.constLong0;
                      if(true)
                        break Success158;
                    }
                  }
                  term = term203;
                  Success159:
                  { 
                    Fail182:
                    { 
                      IStrategoTerm r_39 = null;
                      r_39 = term;
                      term = j_39;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail182;
                      term = r_39;
                      { 
                        term = cool.constLong0;
                        if(true)
                          break Success159;
                      }
                    }
                    term = debug_0_0.instance.invoke(context, cool.const80);
                    if(term == null)
                      break Fail175;
                    term = debug_0_0.instance.invoke(context, i_39);
                    if(term == null)
                      break Fail175;
                    term = cool.const77;
                    if(true)
                      break Fail175;
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