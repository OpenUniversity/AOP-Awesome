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

@SuppressWarnings("all") final class lifted54 extends Strategy 
{ 
  public static final lifted54 instance = new lifted54();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail294:
    { 
      IStrategoTerm g_28 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail294;
      g_28 = term.getSubterm(0);
      term = (IStrategoTerm)termFactory.makeListCons(g_28, (IStrategoList)ejp.constCons3);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail294;
      if(true)
        return term;
    }
    return null;
  }
}