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

@SuppressWarnings("all") final class lifted27 extends Strategy 
{ 
  public static final lifted27 instance = new lifted27();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail382:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consGt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail382;
      if(true)
        return term;
    }
    return null;
  }
}