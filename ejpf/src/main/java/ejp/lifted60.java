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

@SuppressWarnings("all") final class lifted60 extends Strategy 
{ 
  public static final lifted60 instance = new lifted60();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail289:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
        break Fail289;
      IStrategoTerm arg86 = term.getSubterm(0);
      if(arg86.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg86).getConstructor())
        break Fail289;
      if(true)
        return term;
    }
    return null;
  }
}