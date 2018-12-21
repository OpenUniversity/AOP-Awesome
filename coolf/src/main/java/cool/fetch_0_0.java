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
    Fail164:
    { 
      IStrategoTerm term181 = term;
      IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success139:
      { 
        if(cons5 == transform._consExprName_1)
        { 
          Fail165:
          { 
            IStrategoTerm a_35 = null;
            a_35 = term.getSubterm(0);
            term = this.invoke(context, a_35);
            if(term == null)
              break Fail165;
            if(true)
              break Success139;
          }
          term = term181;
        }
        Success140:
        { 
          if(cons5 == transform._consExprName_2)
          { 
            Fail166:
            { 
              IStrategoTerm y_34 = null;
              IStrategoTerm z_34 = null;
              y_34 = term.getSubterm(0);
              z_34 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{y_34, z_34});
              term = this.invoke(context, term);
              if(term == null)
                break Fail166;
              if(true)
                break Success140;
            }
            term = term181;
          }
          Success141:
          { 
            if(cons5 == transform._consAmbName_2)
            { 
              Fail167:
              { 
                IStrategoTerm u_34 = null;
                IStrategoTerm v_34 = null;
                u_34 = term.getSubterm(0);
                IStrategoTerm arg127 = term.getSubterm(1);
                if(arg127.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg127).getConstructor())
                  break Fail167;
                v_34 = arg127.getSubterm(0);
                term = this.invoke(context, u_34);
                if(term == null)
                  break Fail167;
                term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(cool.const0, termFactory.makeListCons(v_34, (IStrategoList)cool.constNil0)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail167;
                if(true)
                  break Success141;
              }
              term = term181;
            }
            Success142:
            { 
              if(cons5 == transform._consAmbName_1)
              { 
                Fail168:
                { 
                  IStrategoTerm t_34 = null;
                  t_34 = term.getSubterm(0);
                  term = this.invoke(context, t_34);
                  if(term == null)
                    break Fail168;
                  if(true)
                    break Success142;
                }
                term = term181;
              }
              if(cons5 == transform._consId_1)
              { 
                IStrategoTerm s_34 = null;
                s_34 = term.getSubterm(0);
                term = s_34;
              }
              else
              { 
                break Fail164;
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