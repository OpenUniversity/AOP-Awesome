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

@SuppressWarnings("all") final class lifted66 extends Strategy 
{ 
  public static final lifted66 instance = new lifted66();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail283:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
        break Fail283;
      IStrategoTerm arg108 = term.getSubterm(0);
      if(arg108.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg108).getConstructor())
        break Fail283;
      if(true)
        return term;
    }
    return null;
  }
}