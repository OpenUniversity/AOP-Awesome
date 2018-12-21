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

@SuppressWarnings("all") final class lifted70 extends Strategy 
{ 
  public static final lifted70 instance = new lifted70();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail294:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
        break Fail294;
      if(true)
        return term;
    }
    return null;
  }
}