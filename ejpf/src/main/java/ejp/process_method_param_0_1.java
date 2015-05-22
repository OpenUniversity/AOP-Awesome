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

@SuppressWarnings("all") public class process_method_param_0_1 extends Strategy 
{ 
  public static process_method_param_0_1 instance = new process_method_param_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_19)
  { 
    context.push("process_method_param_0_1");
    Fail26:
    { 
      TermReference g_19 = new TermReference();
      TermReference h_19 = new TermReference();
      IStrategoTerm i_19 = null;
      lifted31 lifted311 = new lifted31();
      lifted30 lifted300 = new lifted30();
      lifted311.h_19 = h_19;
      lifted311.g_19 = g_19;
      lifted300.h_19 = h_19;
      lifted300.g_19 = g_19;
      term = or_2_0.instance.invoke(context, term, lifted300, lifted311);
      if(term == null)
        break Fail26;
      i_19 = term;
      term = hashtable_put_0_2.instance.invoke(context, f_19, g_19.value, h_19.value);
      if(term == null)
        break Fail26;
      term = i_19;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}