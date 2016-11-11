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

@SuppressWarnings("all") final class lifted138 extends Strategy 
{ 
  public static final lifted138 instance = new lifted138();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail339:
    { 
      IStrategoTerm v_80 = null;
      IStrategoTerm x_80 = null;
      IStrategoTerm y_80 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail339;
      v_80 = term.getSubterm(0);
      x_80 = term.getSubterm(1);
      y_80 = term.getSubterm(2);
      IStrategoList list9;
      list9 = checkListTail(v_80);
      if(list9 == null)
        break Fail339;
      term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(cool.constPrivate0, termFactory.makeListCons(cool.constMarkerAnno1, list9)), x_80, y_80});
      if(true)
        return term;
    }
    return null;
  }
}