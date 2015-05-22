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
  TermReference d_21;

  TermReference e_21;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail308:
    { 
      IStrategoTerm f_21 = null;
      IStrategoTerm g_21 = null;
      IStrategoTerm h_21 = null;
      f_21 = term;
      h_21 = term;
      if(d_21.value == null)
        break Fail308;
      term = hashtable_get_0_1.instance.invoke(context, d_21.value, f_21);
      if(term == null)
        break Fail308;
      g_21 = term;
      term = h_21;
      if(e_21.value == null)
        break Fail308;
      term = termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{ejp.constNil0, g_21, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{f_21}), termFactory.makeAppl(transform._consExprName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{e_21.value})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{f_21})})}), (IStrategoList)ejp.constNil0)})});
      if(true)
        return term;
    }
    return null;
  }
}