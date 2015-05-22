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

@SuppressWarnings("all") final class lifted19 extends Strategy 
{ 
  public static final lifted19 instance = new lifted19();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail326:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail326;
      if(true)
        return term;
    }
    return null;
  }
}