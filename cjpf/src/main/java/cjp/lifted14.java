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

@SuppressWarnings("all") final class lifted14 extends Strategy 
{ 
  public static final lifted14 instance = new lifted14();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail181:
    { 
      IStrategoTerm m_19 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail181;
      m_19 = term.getSubterm(1);
      term = pp_aspectj_string_0_0.instance.invoke(context, m_19);
      if(term == null)
        break Fail181;
      term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClass_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})})})});
      if(true)
        return term;
    }
    return null;
  }
}