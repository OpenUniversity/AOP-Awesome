package cjp;

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

@SuppressWarnings("all") final class lifted30 extends Strategy 
{ 
  public static final lifted30 instance = new lifted30();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail166:
    { 
      IStrategoTerm n_30 = null;
      n_30 = term;
      term = try_1_0.instance.invoke(context, term, gen_source_location_0_0.instance);
      if(term == null)
        break Fail166;
      term = termFactory.annotateTerm(n_30, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cjp.constNil0)));
      if(true)
        return term;
    }
    return null;
  }
}