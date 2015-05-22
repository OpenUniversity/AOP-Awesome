package ejp;

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

@SuppressWarnings("all") public class create_method_invokation_0_2 extends Strategy 
{ 
  public static create_method_invokation_0_2 instance = new create_method_invokation_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_21, IStrategoTerm t_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_method_invokation_0_2");
    Fail33:
    { 
      term = t_21;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      term = gen__ejpscope__method__name_0_0.instance.invoke(context, t_21);
      if(term == null)
        break Fail33;
      term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{s_21})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), ejp.constNil0});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}