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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_50, IStrategoTerm v_50, IStrategoTerm w_50, IStrategoTerm x_50)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fillMethodMaps_0_4");
    Fail218:
    { 
      IStrategoTerm z_50 = null;
      IStrategoTerm a_51 = null;
      IStrategoTerm b_51 = null;
      IStrategoTerm c_51 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail218;
      b_51 = term.getSubterm(0);
      z_50 = term.getSubterm(1);
      a_51 = term.getSubterm(2);
      c_51 = term.getSubterm(3);
      IStrategoTerm term200 = term;
      Success158:
      { 
        Fail219:
        { 
          IStrategoTerm term201 = term;
          Success159:
          { 
            Fail220:
            { 
              IStrategoTerm d_51 = null;
              d_51 = term;
              IStrategoTerm term202 = term;
              Success160:
              { 
                Fail221:
                { 
                  term = termFactory.makeTuple(z_50, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail221;
                  { 
                    if(true)
                      break Fail220;
                    if(true)
                      break Success160;
                  }
                }
                term = term202;
              }
              term = d_51;
              { 
                IStrategoTerm l_51 = null;
                IStrategoTerm e_51 = null;
                l_51 = u_50;
                term = z_50;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail219;
                IStrategoTerm arg182 = term.getSubterm(0);
                if(arg182.getTermType() != IStrategoTerm.APPL || transform._consRequires_1 != ((IStrategoAppl)arg182).getConstructor())
                  break Fail219;
                e_51 = arg182.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, l_51, b_51, e_51);
                if(term == null)
                  break Fail219;
                if(true)
                  break Success159;
              }
            }
            term = term201;
          }
          IStrategoTerm term203 = term;
          Success161:
          { 
            Fail222:
            { 
              IStrategoTerm f_51 = null;
              f_51 = term;
              IStrategoTerm term204 = term;
              Success162:
              { 
                Fail223:
                { 
                  term = termFactory.makeTuple(a_51, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail223;
                  { 
                    if(true)
                      break Fail222;
                    if(true)
                      break Success162;
                  }
                }
                term = term204;
              }
              term = f_51;
              { 
                IStrategoTerm n_51 = null;
                IStrategoTerm g_51 = null;
                n_51 = w_50;
                term = a_51;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail219;
                IStrategoTerm arg183 = term.getSubterm(0);
                if(arg183.getTermType() != IStrategoTerm.APPL || transform._consOnEntry_1 != ((IStrategoAppl)arg183).getConstructor())
                  break Fail219;
                g_51 = arg183.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, n_51, b_51, g_51);
                if(term == null)
                  break Fail219;
                if(true)
                  break Success161;
              }
            }
            term = term203;
          }
          IStrategoTerm term205 = term;
          Success163:
          { 
            Fail224:
            { 
              IStrategoTerm h_51 = null;
              h_51 = term;
              IStrategoTerm term206 = term;
              Success164:
              { 
                Fail225:
                { 
                  term = termFactory.makeTuple(c_51, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail225;
                  { 
                    if(true)
                      break Fail224;
                    if(true)
                      break Success164;
                  }
                }
                term = term206;
              }
              term = h_51;
              { 
                IStrategoTerm p_51 = null;
                IStrategoTerm i_51 = null;
                p_51 = v_50;
                term = c_51;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail219;
                IStrategoTerm arg184 = term.getSubterm(0);
                if(arg184.getTermType() != IStrategoTerm.APPL || transform._consOnExit_1 != ((IStrategoAppl)arg184).getConstructor())
                  break Fail219;
                i_51 = arg184.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, p_51, b_51, i_51);
                if(term == null)
                  break Fail219;
                if(true)
                  break Success163;
              }
            }
            term = term205;
          }
          if(true)
            break Success158;
        }
        term = term200;
        IStrategoTerm r_51 = null;
        r_51 = term;
        term = report_with_failure_0_1.instance.invoke(context, r_51, cool.const74);
        if(term == null)
          break Fail218;
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