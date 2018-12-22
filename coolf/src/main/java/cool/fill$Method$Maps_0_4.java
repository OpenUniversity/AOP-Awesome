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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_49, IStrategoTerm z_49, IStrategoTerm a_50, IStrategoTerm b_50)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fillMethodMaps_0_4");
    Fail212:
    { 
      IStrategoTerm c_50 = null;
      IStrategoTerm e_50 = null;
      IStrategoTerm f_50 = null;
      IStrategoTerm g_50 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail212;
      f_50 = term.getSubterm(0);
      c_50 = term.getSubterm(1);
      e_50 = term.getSubterm(2);
      g_50 = term.getSubterm(3);
      IStrategoTerm term201 = term;
      Success159:
      { 
        Fail213:
        { 
          IStrategoTerm term202 = term;
          Success160:
          { 
            Fail214:
            { 
              IStrategoTerm h_50 = null;
              h_50 = term;
              IStrategoTerm term203 = term;
              Success161:
              { 
                Fail215:
                { 
                  term = termFactory.makeTuple(c_50, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail215;
                  { 
                    if(true)
                      break Fail214;
                    if(true)
                      break Success161;
                  }
                }
                term = term203;
              }
              term = h_50;
              { 
                IStrategoTerm q_50 = null;
                IStrategoTerm i_50 = null;
                q_50 = y_49;
                term = c_50;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail213;
                IStrategoTerm arg164 = term.getSubterm(0);
                if(arg164.getTermType() != IStrategoTerm.APPL || transform._consRequires_1 != ((IStrategoAppl)arg164).getConstructor())
                  break Fail213;
                i_50 = arg164.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, q_50, f_50, i_50);
                if(term == null)
                  break Fail213;
                if(true)
                  break Success160;
              }
            }
            term = term202;
          }
          IStrategoTerm term204 = term;
          Success162:
          { 
            Fail216:
            { 
              IStrategoTerm j_50 = null;
              j_50 = term;
              IStrategoTerm term205 = term;
              Success163:
              { 
                Fail217:
                { 
                  term = termFactory.makeTuple(e_50, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail217;
                  { 
                    if(true)
                      break Fail216;
                    if(true)
                      break Success163;
                  }
                }
                term = term205;
              }
              term = j_50;
              { 
                IStrategoTerm s_50 = null;
                IStrategoTerm k_50 = null;
                s_50 = a_50;
                term = e_50;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail213;
                IStrategoTerm arg165 = term.getSubterm(0);
                if(arg165.getTermType() != IStrategoTerm.APPL || transform._consOnEntry_1 != ((IStrategoAppl)arg165).getConstructor())
                  break Fail213;
                k_50 = arg165.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, s_50, f_50, k_50);
                if(term == null)
                  break Fail213;
                if(true)
                  break Success162;
              }
            }
            term = term204;
          }
          IStrategoTerm term206 = term;
          Success164:
          { 
            Fail218:
            { 
              IStrategoTerm l_50 = null;
              l_50 = term;
              IStrategoTerm term207 = term;
              Success165:
              { 
                Fail219:
                { 
                  term = termFactory.makeTuple(g_50, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail219;
                  { 
                    if(true)
                      break Fail218;
                    if(true)
                      break Success165;
                  }
                }
                term = term207;
              }
              term = l_50;
              { 
                IStrategoTerm u_50 = null;
                IStrategoTerm n_50 = null;
                u_50 = z_49;
                term = g_50;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail213;
                IStrategoTerm arg166 = term.getSubterm(0);
                if(arg166.getTermType() != IStrategoTerm.APPL || transform._consOnExit_1 != ((IStrategoAppl)arg166).getConstructor())
                  break Fail213;
                n_50 = arg166.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, u_50, f_50, n_50);
                if(term == null)
                  break Fail213;
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
        IStrategoTerm w_50 = null;
        w_50 = term;
        term = report_with_failure_0_1.instance.invoke(context, w_50, cool.const73);
        if(term == null)
          break Fail212;
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