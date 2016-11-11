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

@SuppressWarnings("all") final class lifted137 extends Strategy 
{ 
  public static final lifted137 instance = new lifted137();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail338:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail338;
      if(true)
        return term;
    }
    return null;
  }
}