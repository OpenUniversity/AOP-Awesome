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

@SuppressWarnings("all") final class lifted18 extends Strategy 
{ 
  public static final lifted18 instance = new lifted18();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail327:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)term).getConstructor())
        break Fail327;
      if(true)
        return term;
    }
    return null;
  }
}