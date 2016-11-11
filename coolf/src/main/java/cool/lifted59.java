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

@SuppressWarnings("all") final class lifted59 extends Strategy 
{ 
  public static final lifted59 instance = new lifted59();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail413:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
        break Fail413;
      IStrategoTerm arg65 = term.getSubterm(0);
      if(arg65.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg65).getConstructor())
        break Fail413;
      IStrategoTerm arg66 = arg65.getSubterm(0);
      if(arg66.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg66).getConstructor())
        break Fail413;
      IStrategoTerm arg67 = arg66.getSubterm(0);
      if(arg67.getTermType() != IStrategoTerm.STRING || !"COOLOnExit".equals(((IStrategoString)arg67).stringValue()))
        break Fail413;
      if(true)
        return term;
    }
    return null;
  }
}