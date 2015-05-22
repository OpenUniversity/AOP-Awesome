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

@SuppressWarnings("all") final class lifted8 extends Strategy 
{ 
  public static final lifted8 instance = new lifted8();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail337:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
        break Fail337;
      IStrategoTerm arg8 = term.getSubterm(0);
      if(arg8.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg8).getConstructor())
        break Fail337;
      IStrategoTerm arg9 = arg8.getSubterm(0);
      if(arg9.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg9).getConstructor())
        break Fail337;
      IStrategoTerm arg10 = arg9.getSubterm(0);
      if(arg10.getTermType() != IStrategoTerm.STRING || !"ExplicitScopedJoinPoint".equals(((IStrategoString)arg10).stringValue()))
        break Fail337;
      if(true)
        return term;
    }
    return null;
  }
}