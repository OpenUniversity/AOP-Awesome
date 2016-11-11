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

@SuppressWarnings("all") final class lifted133 extends Strategy 
{ 
  TermReference b_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail342:
    { 
      IStrategoTerm u_77 = null;
      u_77 = term;
      term = gen_method_state_name_0_1.instance.invoke(context, u_77, b_77.value);
      if(term == null)
        break Fail342;
      term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)});
      if(true)
        return term;
    }
    return null;
  }
}