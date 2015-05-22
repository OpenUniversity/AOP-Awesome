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

@SuppressWarnings("all") final class lifted77 extends Strategy 
{ 
  public static final lifted77 instance = new lifted77();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail286:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
        break Fail286;
      if(true)
        return term;
    }
    return null;
  }
}