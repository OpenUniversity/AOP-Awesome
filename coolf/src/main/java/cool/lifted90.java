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

@SuppressWarnings("all") final class lifted90 extends Strategy 
{ 
  public static final lifted90 instance = new lifted90();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail276:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail276;
      if(true)
        return term;
    }
    return null;
  }
}