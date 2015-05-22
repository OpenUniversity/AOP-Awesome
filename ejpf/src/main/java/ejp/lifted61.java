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

@SuppressWarnings("all") final class lifted61 extends Strategy 
{ 
  public static final lifted61 instance = new lifted61();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail288:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
        break Fail288;
      IStrategoTerm arg92 = term.getSubterm(0);
      if(arg92.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg92).getConstructor())
        break Fail288;
      if(true)
        return term;
    }
    return null;
  }
}