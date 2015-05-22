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

@SuppressWarnings("all") final class lifted38 extends Strategy 
{ 
  TermReference n_21;

  TermReference o_21;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail308:
    { 
      IStrategoTerm p_21 = null;
      IStrategoTerm q_21 = null;
      IStrategoTerm r_21 = null;
      p_21 = term;
      r_21 = term;
      if(n_21.value == null)
        break Fail308;
      term = hashtable_get_0_1.instance.invoke(context, n_21.value, p_21);
      if(term == null)
        break Fail308;
      q_21 = term;
      term = r_21;
      if(o_21.value == null)
        break Fail308;
      term = termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{ejp.constNil0, q_21, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{p_21}), termFactory.makeAppl(transform._consExprName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{o_21.value})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{p_21})})}), (IStrategoList)ejp.constNil0)})});
      if(true)
        return term;
    }
    return null;
  }
}