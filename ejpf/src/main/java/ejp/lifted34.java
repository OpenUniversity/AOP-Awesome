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

@SuppressWarnings("all") final class lifted34 extends Strategy 
{ 
  TermReference n_20;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail312:
    { 
      IStrategoTerm p_20 = null;
      p_20 = term;
      if(n_20.value == null)
        break Fail312;
      term = hashtable_get_0_1.instance.invoke(context, n_20.value, p_20);
      if(term == null)
        break Fail312;
      term = map_1_0.instance.invoke(context, term, lifted35.instance);
      if(term == null)
        break Fail312;
      term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{ejp.constNil0, p_20, term});
      if(true)
        return term;
    }
    return null;
  }
}