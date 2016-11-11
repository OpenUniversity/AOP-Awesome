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

@SuppressWarnings("all") public class gen_method_state_0_1 extends Strategy 
{ 
  public static gen_method_state_0_1 instance = new gen_method_state_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_51)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_method_state_0_1");
    Fail286:
    { 
      IStrategoTerm q_51 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail286;
      IStrategoTerm arg142 = term.getSubterm(0);
      if(arg142.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg142).getConstructor())
        break Fail286;
      q_51 = term;
      term = gen_method_state_name_0_1.instance.invoke(context, q_51, o_51);
      if(term == null)
        break Fail286;
      term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{cool.constCons20, cool.constClassOrInterfaceType1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), cool.constInvoke3}), (IStrategoList)cool.constNil0)});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}