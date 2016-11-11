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

@SuppressWarnings("all") final class lifted83 extends Strategy 
{ 
  public static final lifted83 instance = new lifted83();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail388:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
        break Fail388;
      if(true)
        return term;
    }
    return null;
  }
}