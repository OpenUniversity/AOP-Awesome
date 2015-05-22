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

@SuppressWarnings("all") public class gen_before_call_assignments_0_2 extends Strategy 
{ 
  public static gen_before_call_assignments_0_2 instance = new gen_before_call_assignments_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_20, IStrategoTerm ref_y_20)
  { 
    TermReference y_20 = new TermReference(ref_y_20);
    context.push("gen_before_call_assignments_0_2");
    Fail30:
    { 
      term = iset_elements_0_0.instance.invoke(context, x_20);
      if(term == null)
        break Fail30;
      lifted36 lifted360 = new lifted36();
      lifted360.y_20 = y_20;
      term = map_1_0.instance.invoke(context, term, lifted360);
      if(term == null)
        break Fail30;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}