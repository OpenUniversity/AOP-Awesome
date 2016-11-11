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

@SuppressWarnings("all") public class fetch_0_0 extends Strategy 
{ 
  public static fetch_0_0 instance = new fetch_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_0_0");
    Fail278:
    { 
      IStrategoTerm term287 = term;
      IStrategoConstructor cons13 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success242:
      { 
        if(cons13 == transform._consExprName_1)
        { 
          Fail279:
          { 
            IStrategoTerm c_51 = null;
            c_51 = term.getSubterm(0);
            term = this.invoke(context, c_51);
            if(term == null)
              break Fail279;
            if(true)
              break Success242;
          }
          term = term287;
        }
        Success243:
        { 
          if(cons13 == transform._consExprName_2)
          { 
            Fail280:
            { 
              IStrategoTerm a_51 = null;
              IStrategoTerm b_51 = null;
              a_51 = term.getSubterm(0);
              b_51 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{a_51, b_51});
              term = this.invoke(context, term);
              if(term == null)
                break Fail280;
              if(true)
                break Success243;
            }
            term = term287;
          }
          Success244:
          { 
            if(cons13 == transform._consAmbName_2)
            { 
              Fail281:
              { 
                IStrategoTerm v_50 = null;
                IStrategoTerm w_50 = null;
                v_50 = term.getSubterm(0);
                IStrategoTerm arg141 = term.getSubterm(1);
                if(arg141.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg141).getConstructor())
                  break Fail281;
                w_50 = arg141.getSubterm(0);
                term = this.invoke(context, v_50);
                if(term == null)
                  break Fail281;
                term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(cool.const24, termFactory.makeListCons(w_50, (IStrategoList)cool.constNil0)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail281;
                if(true)
                  break Success244;
              }
              term = term287;
            }
            Success245:
            { 
              if(cons13 == transform._consAmbName_1)
              { 
                Fail282:
                { 
                  IStrategoTerm u_50 = null;
                  u_50 = term.getSubterm(0);
                  term = this.invoke(context, u_50);
                  if(term == null)
                    break Fail282;
                  if(true)
                    break Success245;
                }
                term = term287;
              }
              if(cons13 == transform._consId_1)
              { 
                IStrategoTerm t_50 = null;
                t_50 = term.getSubterm(0);
                term = t_50;
              }
              else
              { 
                break Fail278;
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