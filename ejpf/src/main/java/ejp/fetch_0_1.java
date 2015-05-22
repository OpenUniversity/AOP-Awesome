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

@SuppressWarnings("all") public class fetch_0_1 extends Strategy 
{ 
  public static fetch_0_1 instance = new fetch_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_77)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_0_1");
    Fail0:
    { 
      IStrategoTerm term0 = term;
      IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success0:
      { 
        if(cons0 == transform._consMethodName_2)
        { 
          Fail1:
          { 
            IStrategoTerm e_11 = null;
            e_11 = term.getSubterm(0);
            term = this.invoke(context, e_11, o_77);
            if(term == null)
              break Fail1;
            if(true)
              break Success0;
          }
          term = term0;
        }
        Success1:
        { 
          if(cons0 == transform._consExprName_1)
          { 
            Fail2:
            { 
              IStrategoTerm c_11 = null;
              c_11 = term.getSubterm(0);
              term = this.invoke(context, c_11, o_77);
              if(term == null)
                break Fail2;
              if(true)
                break Success1;
            }
            term = term0;
          }
          Success2:
          { 
            if(cons0 == transform._consExprName_2)
            { 
              Fail3:
              { 
                IStrategoTerm z_10 = null;
                IStrategoTerm a_11 = null;
                z_10 = term.getSubterm(0);
                a_11 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{z_10, a_11});
                term = this.invoke(context, term, o_77);
                if(term == null)
                  break Fail3;
                if(true)
                  break Success2;
              }
              term = term0;
            }
            Success3:
            { 
              if(cons0 == transform._consAmbName_2)
              { 
                Fail4:
                { 
                  IStrategoTerm x_10 = null;
                  x_10 = term.getSubterm(0);
                  IStrategoTerm arg1 = term.getSubterm(1);
                  if(arg1.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg1).getConstructor())
                    break Fail4;
                  term = this.invoke(context, x_10, o_77);
                  if(term == null)
                    break Fail4;
                  if(true)
                    break Success3;
                }
                term = term0;
              }
              Success4:
              { 
                if(cons0 == transform._consAmbName_1)
                { 
                  Fail5:
                  { 
                    IStrategoTerm u_10 = null;
                    u_10 = term.getSubterm(0);
                    term = this.invoke(context, u_10, o_77);
                    if(term == null)
                      break Fail5;
                    if(true)
                      break Success4;
                  }
                  term = term0;
                }
                if(cons0 == transform._consId_1)
                { 
                  IStrategoTerm q_10 = null;
                  IStrategoTerm s_10 = null;
                  q_10 = term.getSubterm(0);
                  s_10 = o_77;
                  term = strip_annos_0_0.instance.invoke(context, q_10);
                  if(term == null)
                    break Fail0;
                  term = iset_add_0_1.instance.invoke(context, s_10, term);
                  if(term == null)
                    break Fail0;
                }
                else
                { 
                  break Fail0;
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