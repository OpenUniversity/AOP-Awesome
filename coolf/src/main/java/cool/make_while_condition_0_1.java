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

@SuppressWarnings("all") public class make_while_condition_0_1 extends Strategy 
{ 
  public static make_while_condition_0_1 instance = new make_while_condition_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_52)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_while_condition_0_1");
    Fail292:
    { 
      IStrategoTerm a_53 = null;
      IStrategoTerm b_53 = null;
      IStrategoTerm c_53 = null;
      IStrategoTerm d_53 = null;
      d_53 = term;
      term = length_0_0.instance.invoke(context, z_52);
      if(term == null)
        break Fail292;
      c_53 = term;
      term = d_53;
      IStrategoTerm term291 = term;
      Success246:
      { 
        Fail293:
        { 
          IStrategoTerm e_53 = null;
          IStrategoTerm i_53 = null;
          e_53 = term;
          i_53 = c_53;
          term = equal_0_1.instance.invoke(context, i_53, cool.const85);
          if(term == null)
            break Fail293;
          term = e_53;
          { 
            term = cool.constFalse0;
            if(true)
              break Success246;
          }
        }
        term = term291;
        Success247:
        { 
          Fail294:
          { 
            IStrategoTerm f_53 = null;
            IStrategoTerm k_53 = null;
            f_53 = term;
            k_53 = c_53;
            term = equal_0_1.instance.invoke(context, k_53, cool.const83);
            if(term == null)
              break Fail294;
            term = f_53;
            { 
              IStrategoTerm g_53 = null;
              term = z_52;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail292;
              g_53 = ((IStrategoList)term).head();
              IStrategoTerm arg152 = ((IStrategoList)term).tail();
              if(arg152.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg152).isEmpty())
                break Fail292;
              term = g_53;
              if(true)
                break Success247;
            }
          }
          term = z_52;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail292;
          b_53 = ((IStrategoList)term).head();
          a_53 = ((IStrategoList)term).tail();
          term = this.invoke(context, term, a_53);
          if(term == null)
            break Fail292;
          term = termFactory.makeAppl(transform._consLazyOr_2, new IStrategoTerm[]{term, b_53});
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