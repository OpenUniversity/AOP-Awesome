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
    Fail191:
    { 
      IStrategoTerm g_40 = null;
      IStrategoTerm h_40 = null;
      IStrategoTerm i_40 = null;
      g_40 = term;
      i_40 = term;
      h_40 = g_40;
      term = i_40;
      IStrategoTerm term212 = term;
      Success167:
      { 
        Fail192:
        { 
          IStrategoTerm j_40 = null;
          j_40 = term;
          term = h_40;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
            break Fail192;
          term = j_40;
          { 
            term = cool.constLong0;
            if(true)
              break Success167;
          }
        }
        term = term212;
        IStrategoTerm term213 = term;
        Success168:
        { 
          Fail193:
          { 
            IStrategoTerm k_40 = null;
            k_40 = term;
            term = or_2_0.instance.invoke(context, h_40, lifted74.instance, lifted75.instance);
            if(term == null)
              break Fail193;
            term = k_40;
            { 
              term = cool.constLong0;
              if(true)
                break Success168;
            }
          }
          term = term213;
          IStrategoTerm term214 = term;
          Success169:
          { 
            Fail194:
            { 
              IStrategoTerm l_40 = null;
              l_40 = term;
              term = h_40;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail194;
              term = l_40;
              { 
                term = cool.constLong0;
                if(true)
                  break Success169;
              }
            }
            term = term214;
            IStrategoTerm term215 = term;
            Success170:
            { 
              Fail195:
              { 
                IStrategoTerm m_40 = null;
                m_40 = term;
                term = h_40;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail195;
                term = m_40;
                { 
                  term = cool.constLong0;
                  if(true)
                    break Success170;
                }
              }
              term = term215;
              IStrategoTerm term216 = term;
              Success171:
              { 
                Fail196:
                { 
                  IStrategoTerm n_40 = null;
                  n_40 = term;
                  term = h_40;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail196;
                  term = n_40;
                  { 
                    term = cool.constLong0;
                    if(true)
                      break Success171;
                  }
                }
                term = term216;
                IStrategoTerm term217 = term;
                Success172:
                { 
                  Fail197:
                  { 
                    IStrategoTerm o_40 = null;
                    o_40 = term;
                    term = h_40;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail197;
                    term = o_40;
                    { 
                      term = cool.constLong0;
                      if(true)
                        break Success172;
                    }
                  }
                  term = term217;
                  Success173:
                  { 
                    Fail198:
                    { 
                      IStrategoTerm p_40 = null;
                      p_40 = term;
                      term = or_2_0.instance.invoke(context, h_40, lifted76.instance, lifted77.instance);
                      if(term == null)
                        break Fail198;
                      term = p_40;
                      { 
                        term = cool.constBoolean0;
                        if(true)
                          break Success173;
                      }
                    }
                    term = debug_0_0.instance.invoke(context, cool.const80);
                    if(term == null)
                      break Fail191;
                    term = debug_0_0.instance.invoke(context, g_40);
                    if(term == null)
                      break Fail191;
                    term = cool.const77;
                    if(true)
                      break Fail191;
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