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

@SuppressWarnings("all") final class lifted64 extends Strategy 
{ 
  public static final lifted64 instance = new lifted64();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail285:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
        break Fail285;
      IStrategoTerm arg101 = term.getSubterm(0);
      if(arg101.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg101).getConstructor())
        break Fail285;
      if(true)
        return term;
    }
    return null;
  }
}