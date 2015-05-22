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

@SuppressWarnings("all") public class closures_to_java_0_0 extends Strategy 
{ 
  public static closures_to_java_0_0 instance = new closures_to_java_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("closures_to_java_0_0");
    Fail134:
    { 
      IStrategoTerm c_29 = null;
      IStrategoTerm d_29 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail134;
      c_29 = term.getSubterm(0);
      IStrategoTerm arg87 = term.getSubterm(1);
      if(arg87.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg87).getConstructor())
        break Fail134;
      d_29 = arg87.getSubterm(0);
      term = topdown_1_0.instance.invoke(context, d_29, lifted24.instance);
      if(term == null)
        break Fail134;
      term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{c_29, termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}