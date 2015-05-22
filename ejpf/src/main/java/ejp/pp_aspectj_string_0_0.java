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

@SuppressWarnings("all") public class pp_aspectj_string_0_0 extends Strategy 
{ 
  public static pp_aspectj_string_0_0 instance = new pp_aspectj_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("pp_aspectj_string_0_0");
    Fail233:
    { 
      IStrategoTerm h_50 = null;
      term = pp_java5_to_abox_1_0.instance.invoke(context, term, lifted76.instance);
      if(term == null)
        break Fail233;
      h_50 = term;
      term = box2text_string_0_1.instance.invoke(context, h_50, ejp.const107);
      if(term == null)
        break Fail233;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}