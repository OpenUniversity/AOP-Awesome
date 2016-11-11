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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_79, IStrategoTerm d_79, IStrategoTerm e_79, IStrategoTerm f_79)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fillMethodMaps_0_4");
    Fail319:
    { 
      IStrategoTerm g_79 = null;
      IStrategoTerm h_79 = null;
      IStrategoTerm i_79 = null;
      IStrategoTerm j_79 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail319;
      i_79 = term.getSubterm(0);
      g_79 = term.getSubterm(1);
      h_79 = term.getSubterm(2);
      j_79 = term.getSubterm(3);
      IStrategoTerm term304 = term;
      Success259:
      { 
        Fail320:
        { 
          IStrategoTerm term305 = term;
          Success260:
          { 
            Fail321:
            { 
              IStrategoTerm l_79 = null;
              l_79 = term;
              IStrategoTerm term306 = term;
              Success261:
              { 
                Fail322:
                { 
                  term = termFactory.makeTuple(g_79, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail322;
                  { 
                    if(true)
                      break Fail321;
                    if(true)
                      break Success261;
                  }
                }
                term = term306;
              }
              term = l_79;
              { 
                IStrategoTerm t_79 = null;
                IStrategoTerm m_79 = null;
                t_79 = c_79;
                term = g_79;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail320;
                IStrategoTerm arg172 = term.getSubterm(0);
                if(arg172.getTermType() != IStrategoTerm.APPL || transform._consRequires_1 != ((IStrategoAppl)arg172).getConstructor())
                  break Fail320;
                m_79 = arg172.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, t_79, i_79, m_79);
                if(term == null)
                  break Fail320;
                if(true)
                  break Success260;
              }
            }
            term = term305;
          }
          IStrategoTerm term307 = term;
          Success262:
          { 
            Fail323:
            { 
              IStrategoTerm n_79 = null;
              n_79 = term;
              IStrategoTerm term308 = term;
              Success263:
              { 
                Fail324:
                { 
                  term = termFactory.makeTuple(h_79, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail324;
                  { 
                    if(true)
                      break Fail323;
                    if(true)
                      break Success263;
                  }
                }
                term = term308;
              }
              term = n_79;
              { 
                IStrategoTerm v_79 = null;
                IStrategoTerm o_79 = null;
                v_79 = e_79;
                term = h_79;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail320;
                IStrategoTerm arg173 = term.getSubterm(0);
                if(arg173.getTermType() != IStrategoTerm.APPL || transform._consOnEntry_1 != ((IStrategoAppl)arg173).getConstructor())
                  break Fail320;
                o_79 = arg173.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, v_79, i_79, o_79);
                if(term == null)
                  break Fail320;
                if(true)
                  break Success262;
              }
            }
            term = term307;
          }
          IStrategoTerm term309 = term;
          Success264:
          { 
            Fail325:
            { 
              IStrategoTerm p_79 = null;
              p_79 = term;
              IStrategoTerm term310 = term;
              Success265:
              { 
                Fail326:
                { 
                  term = termFactory.makeTuple(j_79, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail326;
                  { 
                    if(true)
                      break Fail325;
                    if(true)
                      break Success265;
                  }
                }
                term = term310;
              }
              term = p_79;
              { 
                IStrategoTerm x_79 = null;
                IStrategoTerm q_79 = null;
                x_79 = d_79;
                term = j_79;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail320;
                IStrategoTerm arg174 = term.getSubterm(0);
                if(arg174.getTermType() != IStrategoTerm.APPL || transform._consOnExit_1 != ((IStrategoAppl)arg174).getConstructor())
                  break Fail320;
                q_79 = arg174.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, x_79, i_79, q_79);
                if(term == null)
                  break Fail320;
                if(true)
                  break Success264;
              }
            }
            term = term309;
          }
          if(true)
            break Success259;
        }
        term = term304;
        IStrategoTerm z_79 = null;
        z_79 = term;
        term = report_with_failure_0_1.instance.invoke(context, z_79, cool.const133);
        if(term == null)
          break Fail319;
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