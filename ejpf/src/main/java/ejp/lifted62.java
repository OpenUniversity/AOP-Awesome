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

@SuppressWarnings("all") final class lifted62 extends Strategy 
{ 
  public static final lifted62 instance = new lifted62();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail287:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
        break Fail287;
      IStrategoTerm arg94 = term.getSubterm(0);
      if(arg94.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg94).getConstructor())
        break Fail287;
      if(true)
        return term;
    }
    return null;
  }
}