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

@SuppressWarnings("all") final class lifted50 extends Strategy 
{ 
  public static final lifted50 instance = new lifted50();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail465:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consLazyAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail465;
      if(true)
        return term;
    }
    return null;
  }
}