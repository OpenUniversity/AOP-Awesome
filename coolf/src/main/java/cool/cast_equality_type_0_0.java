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
    Fail159:
    { 
      IStrategoTerm k_38 = null;
      IStrategoTerm l_38 = null;
      IStrategoTerm m_38 = null;
      k_38 = term;
      m_38 = term;
      l_38 = k_38;
      term = m_38;
      IStrategoTerm term184 = term;
      Success139:
      { 
        Fail160:
        { 
          IStrategoTerm n_38 = null;
          n_38 = term;
          term = l_38;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
            break Fail160;
          term = n_38;
          { 
            term = cool.constDouble0;
            if(true)
              break Success139;
          }
        }
        term = term184;
        IStrategoTerm term185 = term;
        Success140:
        { 
          Fail161:
          { 
            IStrategoTerm o_38 = null;
            o_38 = term;
            term = l_38;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
              break Fail161;
            term = o_38;
            { 
              term = cool.constDouble0;
              if(true)
                break Success140;
            }
          }
          term = term185;
          IStrategoTerm term186 = term;
          Success141:
          { 
            Fail162:
            { 
              IStrategoTerm p_38 = null;
              p_38 = term;
              term = l_38;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail162;
              term = p_38;
              { 
                term = cool.constDouble0;
                if(true)
                  break Success141;
              }
            }
            term = term186;
            IStrategoTerm term187 = term;
            Success142:
            { 
              Fail163:
              { 
                IStrategoTerm q_38 = null;
                q_38 = term;
                term = or_2_0.instance.invoke(context, l_38, lifted62.instance, lifted63.instance);
                if(term == null)
                  break Fail163;
                term = q_38;
                { 
                  term = cool.constDouble0;
                  if(true)
                    break Success142;
                }
              }
              term = term187;
              IStrategoTerm term188 = term;
              Success143:
              { 
                Fail164:
                { 
                  IStrategoTerm r_38 = null;
                  r_38 = term;
                  term = or_2_0.instance.invoke(context, l_38, lifted64.instance, lifted65.instance);
                  if(term == null)
                    break Fail164;
                  term = r_38;
                  { 
                    term = cool.constDouble0;
                    if(true)
                      break Success143;
                  }
                }
                term = term188;
                IStrategoTerm term189 = term;
                Success144:
                { 
                  Fail165:
                  { 
                    IStrategoTerm s_38 = null;
                    s_38 = term;
                    term = l_38;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail165;
                    term = s_38;
                    { 
                      term = cool.constDouble0;
                      if(true)
                        break Success144;
                    }
                  }
                  term = term189;
                  IStrategoTerm term190 = term;
                  Success145:
                  { 
                    Fail166:
                    { 
                      IStrategoTerm t_38 = null;
                      t_38 = term;
                      term = l_38;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail166;
                      term = t_38;
                      { 
                        term = cool.constDouble0;
                        if(true)
                          break Success145;
                      }
                    }
                    term = term190;
                    IStrategoTerm term191 = term;
                    Success146:
                    { 
                      Fail167:
                      { 
                        IStrategoTerm u_38 = null;
                        u_38 = term;
                        term = l_38;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail167;
                        term = u_38;
                        { 
                          term = cool.constDouble0;
                          if(true)
                            break Success146;
                        }
                      }
                      term = term191;
                      Success147:
                      { 
                        Fail168:
                        { 
                          IStrategoTerm v_38 = null;
                          v_38 = term;
                          term = or_2_0.instance.invoke(context, l_38, lifted66.instance, lifted67.instance);
                          if(term == null)
                            break Fail168;
                          term = v_38;
                          { 
                            term = cool.constBoolean0;
                            if(true)
                              break Success147;
                          }
                        }
                        term = debug_0_0.instance.invoke(context, cool.const80);
                        if(term == null)
                          break Fail159;
                        term = debug_0_0.instance.invoke(context, k_38);
                        if(term == null)
                          break Fail159;
                        term = cool.const77;
                        if(true)
                          break Fail159;
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