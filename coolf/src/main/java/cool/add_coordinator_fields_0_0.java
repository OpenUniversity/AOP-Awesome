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
    Fail329:
    { 
      IStrategoTerm t_80 = null;
      IStrategoTerm u_80 = null;
      IStrategoTerm z_80 = null;
      t_80 = term;
      z_80 = term;
      IStrategoTerm term312 = term;
      Success267:
      { 
        Fail330:
        { 
          term = retain_all_1_0.instance.invoke(context, t_80, lifted137.instance);
          if(term == null)
            break Fail330;
          u_80 = term;
          if(true)
            break Success267;
        }
        term = term312;
        IStrategoTerm b_81 = null;
        b_81 = term;
        term = report_with_failure_0_1.instance.invoke(context, b_81, cool.const137);
        if(term == null)
          break Fail329;
      }
      term = z_80;
      if(u_80 == null)
        break Fail329;
      term = map_1_0.instance.invoke(context, u_80, lifted138.instance);
      if(term == null)
        break Fail329;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}