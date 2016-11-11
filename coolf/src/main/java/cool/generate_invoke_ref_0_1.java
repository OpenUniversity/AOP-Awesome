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

@SuppressWarnings("all") public class generate_invoke_ref_0_1 extends Strategy 
{ 
  public static generate_invoke_ref_0_1 instance = new generate_invoke_ref_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_42)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail216:
    { 
      term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{q_42})})}), cool.constCons19});
      if(true)
        return term;
    }
    context.push("generate_invoke_ref_0_1");
    context.popOnFailure();
    return null;
  }
}