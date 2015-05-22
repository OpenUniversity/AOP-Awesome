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

@SuppressWarnings("all") public class gen_after_call_assignments_with_declarations_0_2 extends Strategy 
{ 
  public static gen_after_call_assignments_with_declarations_0_2 instance = new gen_after_call_assignments_with_declarations_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_21, IStrategoTerm ref_e_21)
  { 
    TermReference d_21 = new TermReference(ref_d_21);
    TermReference e_21 = new TermReference(ref_e_21);
    context.push("gen_after_call_assignments_with_declarations_0_2");
    Fail32:
    { 
      if(d_21.value == null)
        break Fail32;
      term = hashtable_keys_0_0.instance.invoke(context, d_21.value);
      if(term == null)
        break Fail32;
      lifted38 lifted380 = new lifted38();
      lifted380.d_21 = d_21;
      lifted380.e_21 = e_21;
      term = map_1_0.instance.invoke(context, term, lifted380);
      if(term == null)
        break Fail32;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}