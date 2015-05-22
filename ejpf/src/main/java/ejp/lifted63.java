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

@SuppressWarnings("all") final class lifted63 extends Strategy 
{ 
  public static final lifted63 instance = new lifted63();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail286:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
        break Fail286;
      IStrategoTerm arg99 = term.getSubterm(0);
      if(arg99.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg99).getConstructor())
        break Fail286;
      if(true)
        return term;
    }
    return null;
  }
}