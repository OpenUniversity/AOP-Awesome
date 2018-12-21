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

@SuppressWarnings("all") public class add_coordinator_fields_0_0 extends Strategy 
{ 
  public static add_coordinator_fields_0_0 instance = new add_coordinator_fields_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("add_coordinator_fields_0_0");
    Fail229:
    { 
      IStrategoTerm t_52 = null;
      IStrategoTerm u_52 = null;
      IStrategoTerm y_52 = null;
      t_52 = term;
      y_52 = term;
      IStrategoTerm term209 = term;
      Success167:
      { 
        Fail230:
        { 
          term = retain_all_1_0.instance.invoke(context, t_52, lifted135.instance);
          if(term == null)
            break Fail230;
          u_52 = term;
          if(true)
            break Success167;
        }
        term = term209;
        IStrategoTerm a_53 = null;
        a_53 = term;
        term = report_with_failure_0_1.instance.invoke(context, a_53, cool.const81);
        if(term == null)
          break Fail229;
      }
      term = y_52;
      if(u_52 == null)
        break Fail229;
      term = map_1_0.instance.invoke(context, u_52, lifted136.instance);
      if(term == null)
        break Fail229;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}