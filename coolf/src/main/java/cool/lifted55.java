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

@SuppressWarnings("all") final class lifted55 extends Strategy 
{ 
  public static final lifted55 instance = new lifted55();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail309:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
        break Fail309;
      IStrategoTerm arg51 = term.getSubterm(0);
      if(arg51.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg51).getConstructor())
        break Fail309;
      IStrategoTerm arg52 = arg51.getSubterm(0);
      if(arg52.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg52).getConstructor())
        break Fail309;
      IStrategoTerm arg53 = arg52.getSubterm(0);
      if(arg53.getTermType() != IStrategoTerm.STRING || !"COOLOnExit".equals(((IStrategoString)arg53).stringValue()))
        break Fail309;
      if(true)
        return term;
    }
    return null;
  }
}