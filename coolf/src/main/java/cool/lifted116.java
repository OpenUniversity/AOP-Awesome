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

@SuppressWarnings("all") final class lifted116 extends Strategy 
{ 
  public static final lifted116 instance = new lifted116();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail357:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMutex_1 != ((IStrategoAppl)term).getConstructor())
        break Fail357;
      if(true)
        return term;
    }
    return null;
  }
}