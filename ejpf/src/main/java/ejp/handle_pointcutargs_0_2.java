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

@SuppressWarnings("all") public class handle_pointcutargs_0_2 extends Strategy 
{ 
  public static handle_pointcutargs_0_2 instance = new handle_pointcutargs_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_25, IStrategoTerm ref_t_25)
  { 
    TermReference s_25 = new TermReference(ref_s_25);
    TermReference t_25 = new TermReference(ref_t_25);
    context.push("handle_pointcutargs_0_2");
    Fail42:
    { 
      IStrategoTerm u_25 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      IStrategoTerm arg60 = term.getSubterm(0);
      if(arg60.getTermType() != IStrategoTerm.APPL || transform._consPointcutargs_1 != ((IStrategoAppl)arg60).getConstructor())
        break Fail42;
      u_25 = arg60.getSubterm(0);
      term = u_25;
      lifted51 lifted511 = new lifted51();
      lifted511.t_25 = t_25;
      term = map_1_0.instance.invoke(context, term, lifted511);
      if(term == null)
        break Fail42;
      lifted52 lifted520 = new lifted52();
      lifted520.s_25 = s_25;
      term = map_1_0.instance.invoke(context, term, lifted520);
      if(term == null)
        break Fail42;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}