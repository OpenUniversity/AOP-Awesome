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

@SuppressWarnings("all") public class closure_to_java_impl_0_0 extends Strategy 
{ 
  public static closure_to_java_impl_0_0 instance = new closure_to_java_impl_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("closure_to_java_impl_0_0");
    Fail135:
    { 
      IStrategoTerm term120 = term;
      Success117:
      { 
        Fail136:
        { 
          IStrategoTerm j_29 = null;
          IStrategoTerm k_29 = null;
          TermReference l_29 = new TermReference();
          IStrategoTerm m_29 = null;
          IStrategoTerm n_29 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consClosureJoinpoints_4 != ((IStrategoAppl)term).getConstructor())
            break Fail136;
          n_29 = term.getSubterm(0);
          j_29 = term.getSubterm(1);
          k_29 = term.getSubterm(2);
          m_29 = term.getSubterm(3);
          term = n_29;
          lifted27 lifted270 = new lifted27();
          lifted26 lifted260 = new lifted26();
          lifted270.l_29 = l_29;
          lifted260.l_29 = l_29;
          term = or_2_0.instance.invoke(context, term, lifted260, lifted270);
          if(term == null)
            break Fail136;
          term = debug_0_0.instance.invoke(context, cjp.const92);
          if(term == null)
            break Fail136;
          if(l_29.value == null)
            break Fail136;
          term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{cjp.constNone0, cjp.constClassOrInterfaceType10, cjp.constNil0, termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{cjp.constCons27, cjp.constNone0, cjp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{l_29.value}), j_29, cjp.constNone0}), k_29}), (IStrategoList)cjp.constNil0)})})}), cjp.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{l_29.value})}), m_29});
          if(true)
            break Success117;
        }
        term = term120;
        IStrategoTerm g_29 = null;
        TermReference h_29 = new TermReference();
        IStrategoTerm i_29 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consShortClosureJoinpoints_2 != ((IStrategoAppl)term).getConstructor())
          break Fail135;
        i_29 = term.getSubterm(0);
        g_29 = term.getSubterm(1);
        term = i_29;
        lifted29 lifted290 = new lifted29();
        lifted28 lifted280 = new lifted28();
        lifted290.h_29 = h_29;
        lifted280.h_29 = h_29;
        term = or_2_0.instance.invoke(context, term, lifted280, lifted290);
        if(term == null)
          break Fail135;
        if(h_29.value == null)
          break Fail135;
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{cjp.constNone0, cjp.constClassOrInterfaceType10, cjp.constNil0, termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{cjp.constCons27, cjp.constNone0, cjp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{h_29.value}), cjp.constNil0, cjp.constNone0}), g_29}), (IStrategoList)cjp.constNil0)})})}), cjp.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{h_29.value})}), cjp.constNil0});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}