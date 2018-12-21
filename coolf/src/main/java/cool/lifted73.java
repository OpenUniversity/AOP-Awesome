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

@SuppressWarnings("all") final class lifted73 extends Strategy 
{ 
  public static final lifted73 instance = new lifted73();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail291:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
        break Fail291;
      if(true)
        return term;
    }
    return null;
  }
}