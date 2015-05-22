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

@SuppressWarnings("all") public class closures_to_ajc_0_1 extends Strategy 
{ 
  public static closures_to_ajc_0_1 instance = new closures_to_ajc_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_18)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_18 = new TermReference(ref_x_18);
    context.push("closures_to_ajc_0_1");
    Fail115:
    { 
      TermReference y_18 = new TermReference();
      IStrategoTerm z_18 = null;
      IStrategoTerm a_19 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail115;
      a_19 = term.getSubterm(0);
      IStrategoTerm arg28 = term.getSubterm(1);
      if(arg28.getTermType() != IStrategoTerm.APPL || transform._consAspectBody_1 != ((IStrategoAppl)arg28).getConstructor())
        break Fail115;
      z_18 = arg28.getSubterm(0);
      term = a_19;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDecHead_6 != ((IStrategoAppl)term).getConstructor())
        break Fail115;
      IStrategoTerm arg30 = term.getSubterm(1);
      if(arg30.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg30).getConstructor())
        break Fail115;
      if(y_18.value == null)
        y_18.value = arg30.getSubterm(0);
      else
        if(y_18.value != arg30.getSubterm(0) && !y_18.value.match(arg30.getSubterm(0)))
          break Fail115;
      term = z_18;
      lifted4 lifted41 = new lifted4();
      lifted41.x_18 = x_18;
      lifted41.y_18 = y_18;
      term = topdown_1_0.instance.invoke(context, term, lifted41);
      if(term == null)
        break Fail115;
      term = topdown_1_0.instance.invoke(context, term, lifted6.instance);
      if(term == null)
        break Fail115;
      term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{a_19, termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}