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

@SuppressWarnings("all") final class lifted16 extends Strategy 
{ 
  public static final lifted16 instance = new lifted16();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail179:
    { 
      IStrategoTerm r_23 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail179;
      r_23 = term.getSubterm(2);
      term = pp_aspectj_string_0_0.instance.invoke(context, r_23);
      if(term == null)
        break Fail179;
      term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cjp.constNone0});
      if(true)
        return term;
    }
    return null;
  }
}