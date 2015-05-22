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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_method_state_0_1");
    Fail177:
    { 
      IStrategoTerm z_36 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail177;
      IStrategoTerm arg128 = term.getSubterm(0);
      if(arg128.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg128).getConstructor())
        break Fail177;
      z_36 = term;
      term = gen_method_state_name_0_1.instance.invoke(context, z_36, x_36);
      if(term == null)
        break Fail177;
      term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{cool.constCons2, cool.constClassOrInterfaceType1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), cool.constInvoke2}), (IStrategoList)cool.constNil0)});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}