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

@SuppressWarnings("all") final class lifted57 extends Strategy 
{ 
  public static final lifted57 instance = new lifted57();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail415:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
        break Fail415;
      IStrategoTerm arg61 = term.getSubterm(0);
      if(arg61.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg61).getConstructor())
        break Fail415;
      IStrategoTerm arg62 = arg61.getSubterm(0);
      if(arg62.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg62).getConstructor())
        break Fail415;
      IStrategoTerm arg63 = arg62.getSubterm(0);
      if(arg63.getTermType() != IStrategoTerm.STRING || !"COOLOnEntry".equals(((IStrategoString)arg63).stringValue()))
        break Fail415;
      if(true)
        return term;
    }
    return null;
  }
}