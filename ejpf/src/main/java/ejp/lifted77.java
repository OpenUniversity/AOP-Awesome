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

@SuppressWarnings("all") final class lifted77 extends Strategy 
{ 
  public static final lifted77 instance = new lifted77();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail265:
    { 
      IStrategoTerm s_51 = null;
      s_51 = term;
      term = try_1_0.instance.invoke(context, term, gen_source_location_0_0.instance);
      if(term == null)
        break Fail265;
      term = termFactory.annotateTerm(s_51, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)ejp.constNil0)));
      if(true)
        return term;
    }
    return null;
  }
}