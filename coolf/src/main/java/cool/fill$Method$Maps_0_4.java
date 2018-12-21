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

@SuppressWarnings("all") public class fill$Method$Maps_0_4 extends Strategy 
{ 
  public static fill$Method$Maps_0_4 instance = new fill$Method$Maps_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_51, IStrategoTerm k_51, IStrategoTerm l_51, IStrategoTerm m_51)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fillMethodMaps_0_4");
    Fail219:
    { 
      IStrategoTerm n_51 = null;
      IStrategoTerm o_51 = null;
      IStrategoTerm p_51 = null;
      IStrategoTerm q_51 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail219;
      p_51 = term.getSubterm(0);
      n_51 = term.getSubterm(1);
      o_51 = term.getSubterm(2);
      q_51 = term.getSubterm(3);
      IStrategoTerm term201 = term;
      Success159:
      { 
        Fail220:
        { 
          IStrategoTerm term202 = term;
          Success160:
          { 
            Fail221:
            { 
              IStrategoTerm r_51 = null;
              r_51 = term;
              IStrategoTerm term203 = term;
              Success161:
              { 
                Fail222:
                { 
                  term = termFactory.makeTuple(n_51, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail222;
                  { 
                    if(true)
                      break Fail221;
                    if(true)
                      break Success161;
                  }
                }
                term = term203;
              }
              term = r_51;
              { 
                IStrategoTerm z_51 = null;
                IStrategoTerm s_51 = null;
                z_51 = j_51;
                term = n_51;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail220;
                IStrategoTerm arg182 = term.getSubterm(0);
                if(arg182.getTermType() != IStrategoTerm.APPL || transform._consRequires_1 != ((IStrategoAppl)arg182).getConstructor())
                  break Fail220;
                s_51 = arg182.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, z_51, p_51, s_51);
                if(term == null)
                  break Fail220;
                if(true)
                  break Success160;
              }
            }
            term = term202;
          }
          IStrategoTerm term204 = term;
          Success162:
          { 
            Fail223:
            { 
              IStrategoTerm t_51 = null;
              t_51 = term;
              IStrategoTerm term205 = term;
              Success163:
              { 
                Fail224:
                { 
                  term = termFactory.makeTuple(o_51, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail224;
                  { 
                    if(true)
                      break Fail223;
                    if(true)
                      break Success163;
                  }
                }
                term = term205;
              }
              term = t_51;
              { 
                IStrategoTerm b_52 = null;
                IStrategoTerm u_51 = null;
                b_52 = l_51;
                term = o_51;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail220;
                IStrategoTerm arg183 = term.getSubterm(0);
                if(arg183.getTermType() != IStrategoTerm.APPL || transform._consOnEntry_1 != ((IStrategoAppl)arg183).getConstructor())
                  break Fail220;
                u_51 = arg183.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, b_52, p_51, u_51);
                if(term == null)
                  break Fail220;
                if(true)
                  break Success162;
              }
            }
            term = term204;
          }
          IStrategoTerm term206 = term;
          Success164:
          { 
            Fail225:
            { 
              IStrategoTerm v_51 = null;
              v_51 = term;
              IStrategoTerm term207 = term;
              Success165:
              { 
                Fail226:
                { 
                  term = termFactory.makeTuple(q_51, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail226;
                  { 
                    if(true)
                      break Fail225;
                    if(true)
                      break Success165;
                  }
                }
                term = term207;
              }
              term = v_51;
              { 
                IStrategoTerm d_52 = null;
                IStrategoTerm w_51 = null;
                d_52 = k_51;
                term = q_51;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail220;
                IStrategoTerm arg184 = term.getSubterm(0);
                if(arg184.getTermType() != IStrategoTerm.APPL || transform._consOnExit_1 != ((IStrategoAppl)arg184).getConstructor())
                  break Fail220;
                w_51 = arg184.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, d_52, p_51, w_51);
                if(term == null)
                  break Fail220;
                if(true)
                  break Success164;
              }
            }
            term = term206;
          }
          if(true)
            break Success159;
        }
        term = term201;
        IStrategoTerm f_52 = null;
        f_52 = term;
        term = report_with_failure_0_1.instance.invoke(context, f_52, cool.const77);
        if(term == null)
          break Fail219;
      }
      term = cool.constNone0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}