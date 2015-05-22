package cjp;

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

@SuppressWarnings("all") final class lifted20 extends Strategy 
{ 
  public static final lifted20 instance = new lifted20();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail175:
    { 
      IStrategoTerm n_22 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail175;
      n_22 = term.getSubterm(1);
      term = pp_aspectj_string_0_0.instance.invoke(context, n_22);
      if(term == null)
        break Fail175;
      term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
      if(true)
        return term;
    }
    return null;
  }
}