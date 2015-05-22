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

@SuppressWarnings("all") final class lifted53 extends Strategy 
{ 
  public static final lifted53 instance = new lifted53();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail311:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
        break Fail311;
      IStrategoTerm arg47 = term.getSubterm(0);
      if(arg47.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg47).getConstructor())
        break Fail311;
      IStrategoTerm arg48 = arg47.getSubterm(0);
      if(arg48.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg48).getConstructor())
        break Fail311;
      IStrategoTerm arg49 = arg48.getSubterm(0);
      if(arg49.getTermType() != IStrategoTerm.STRING || !"COOLOnEntry".equals(((IStrategoString)arg49).stringValue()))
        break Fail311;
      if(true)
        return term;
    }
    return null;
  }
}