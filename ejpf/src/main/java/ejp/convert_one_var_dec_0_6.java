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

@SuppressWarnings("all") public class convert_one_var_dec_0_6 extends Strategy 
{ 
  public static convert_one_var_dec_0_6 instance = new convert_one_var_dec_0_6();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_17, IStrategoTerm j_17, IStrategoTerm k_17, IStrategoTerm l_17, IStrategoTerm m_17, IStrategoTerm n_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("convert_one_var_dec_0_6");
    Fail19:
    { 
      IStrategoTerm o_17 = null;
      IStrategoTerm p_17 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail19;
      o_17 = term.getSubterm(0);
      p_17 = term.getSubterm(1);
      term = termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{o_17, ejp.constNone0});
      term = add_local_var_0_2.instance.invoke(context, term, i_17, k_17);
      if(term == null)
        break Fail19;
      Success16:
      { 
        Fail20:
        { 
          IStrategoTerm q_17 = null;
          q_17 = term;
          term = or_2_0.instance.invoke(context, p_17, lifted18.instance, lifted19.instance);
          if(term == null)
            break Fail20;
          term = q_17;
          { 
            term = termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{o_17, p_17});
            term = convert_var_dec_by_ejp_call_0_6.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{i_17, j_17, k_17, l_17, m_17, n_17});
            if(term == null)
              break Fail19;
            if(true)
              break Success16;
          }
        }
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{j_17, k_17, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{o_17, p_17}), (IStrategoList)ejp.constNil0)})}), (IStrategoList)ejp.constNil0);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 0 || targs.length != 6)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5]);
  }
}