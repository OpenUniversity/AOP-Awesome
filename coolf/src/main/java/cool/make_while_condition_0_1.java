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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_while_condition_0_1");
    Fail182:
    { 
      IStrategoTerm j_38 = null;
      IStrategoTerm k_38 = null;
      IStrategoTerm l_38 = null;
      IStrategoTerm m_38 = null;
      m_38 = term;
      term = length_0_0.instance.invoke(context, i_38);
      if(term == null)
        break Fail182;
      l_38 = term;
      term = m_38;
      IStrategoTerm term185 = term;
      Success143:
      { 
        Fail183:
        { 
          IStrategoTerm n_38 = null;
          IStrategoTerm r_38 = null;
          n_38 = term;
          r_38 = l_38;
          term = equal_0_1.instance.invoke(context, r_38, cool.const18);
          if(term == null)
            break Fail183;
          term = n_38;
          { 
            term = cool.constFalse0;
            if(true)
              break Success143;
          }
        }
        term = term185;
        Success144:
        { 
          Fail184:
          { 
            IStrategoTerm o_38 = null;
            IStrategoTerm t_38 = null;
            o_38 = term;
            t_38 = l_38;
            term = equal_0_1.instance.invoke(context, t_38, cool.const16);
            if(term == null)
              break Fail184;
            term = o_38;
            { 
              IStrategoTerm p_38 = null;
              term = i_38;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail182;
              p_38 = ((IStrategoList)term).head();
              IStrategoTerm arg138 = ((IStrategoList)term).tail();
              if(arg138.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg138).isEmpty())
                break Fail182;
              term = p_38;
              if(true)
                break Success144;
            }
          }
          term = i_38;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail182;
          k_38 = ((IStrategoList)term).head();
          j_38 = ((IStrategoList)term).tail();
          term = this.invoke(context, term, j_38);
          if(term == null)
            break Fail182;
          term = termFactory.makeAppl(transform._consLazyOr_2, new IStrategoTerm[]{term, k_38});
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