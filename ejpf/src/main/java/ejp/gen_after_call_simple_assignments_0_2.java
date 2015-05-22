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

@SuppressWarnings("all") public class gen_after_call_simple_assignments_0_2 extends Strategy 
{ 
  public static gen_after_call_simple_assignments_0_2 instance = new gen_after_call_simple_assignments_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_21, IStrategoTerm ref_b_21)
  { 
    TermReference b_21 = new TermReference(ref_b_21);
    context.push("gen_after_call_simple_assignments_0_2");
    Fail31:
    { 
      term = iset_elements_0_0.instance.invoke(context, a_21);
      if(term == null)
        break Fail31;
      lifted37 lifted370 = new lifted37();
      lifted370.b_21 = b_21;
      term = map_1_0.instance.invoke(context, term, lifted370);
      if(term == null)
        break Fail31;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}