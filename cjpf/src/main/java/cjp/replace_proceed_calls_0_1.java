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

@SuppressWarnings("all") public class replace_proceed_calls_0_1 extends Strategy 
{ 
  public static replace_proceed_calls_0_1 instance = new replace_proceed_calls_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("replace_proceed_calls_0_1");
    Fail124:
    { 
      IStrategoTerm b_25 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consInvoke_2 != ((IStrategoAppl)term).getConstructor())
        break Fail124;
      IStrategoTerm arg83 = term.getSubterm(0);
      if(arg83.getTermType() != IStrategoTerm.APPL || transform._consMethod_1 != ((IStrategoAppl)arg83).getConstructor())
        break Fail124;
      IStrategoTerm arg84 = arg83.getSubterm(0);
      if(arg84.getTermType() != IStrategoTerm.APPL || transform._consMethodName_1 != ((IStrategoAppl)arg84).getConstructor())
        break Fail124;
      IStrategoTerm arg85 = arg84.getSubterm(0);
      if(arg85.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg85).getConstructor())
        break Fail124;
      IStrategoTerm arg86 = arg85.getSubterm(0);
      if(arg86.getTermType() != IStrategoTerm.STRING || !"proceed".equals(((IStrategoString)arg86).stringValue()))
        break Fail124;
      b_25 = term.getSubterm(1);
      term = primitive$To$Box$Object_0_0.instance.invoke(context, a_25);
      if(term == null)
        break Fail124;
      term = termFactory.makeAppl(transform._consCastRef_2, new IStrategoTerm[]{term, termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cjp.constMethod0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consNewArray_3, new IStrategoTerm[]{cjp.constTypeName11, cjp.constCons26, termFactory.makeAppl(transform._consArrayInit_1, new IStrategoTerm[]{b_25})}), (IStrategoList)cjp.constNil0)})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}