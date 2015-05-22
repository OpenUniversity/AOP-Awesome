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

@SuppressWarnings("all") public class create_method_invokation_0_1 extends Strategy 
{ 
  public static create_method_invokation_0_1 instance = new create_method_invokation_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_method_invokation_0_1");
    Fail34:
    { 
      IStrategoTerm n_21 = null;
      IStrategoTerm o_21 = null;
      IStrategoTerm p_21 = null;
      term = m_21;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      n_21 = term.getSubterm(0);
      o_21 = term.getSubterm(1);
      p_21 = term.getSubterm(2);
      term = typename__2__ambname_0_0.instance.invoke(context, n_21);
      if(term == null)
        break Fail34;
      term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{term, o_21})}), p_21});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}