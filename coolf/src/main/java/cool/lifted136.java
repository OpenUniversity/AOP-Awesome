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

@SuppressWarnings("all") final class lifted136 extends Strategy 
{ 
  public static final lifted136 instance = new lifted136();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail235:
    { 
      IStrategoTerm v_52 = null;
      IStrategoTerm w_52 = null;
      IStrategoTerm x_52 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail235;
      v_52 = term.getSubterm(0);
      w_52 = term.getSubterm(1);
      x_52 = term.getSubterm(2);
      IStrategoList list1;
      list1 = checkListTail(v_52);
      if(list1 == null)
        break Fail235;
      term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(cool.constPrivate0, termFactory.makeListCons(cool.constMarkerAnno1, list1)), w_52, x_52});
      if(true)
        return term;
    }
    return null;
  }
}