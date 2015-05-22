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
    Fail228:
    { 
      IStrategoTerm f_52 = null;
      IStrategoTerm g_52 = null;
      IStrategoTerm k_52 = null;
      f_52 = term;
      k_52 = term;
      IStrategoTerm term208 = term;
      Success166:
      { 
        Fail229:
        { 
          term = retain_all_1_0.instance.invoke(context, f_52, lifted135.instance);
          if(term == null)
            break Fail229;
          g_52 = term;
          if(true)
            break Success166;
        }
        term = term208;
        IStrategoTerm m_52 = null;
        m_52 = term;
        term = report_with_failure_0_1.instance.invoke(context, m_52, cool.const78);
        if(term == null)
          break Fail228;
      }
      term = k_52;
      if(g_52 == null)
        break Fail228;
      term = map_1_0.instance.invoke(context, g_52, lifted136.instance);
      if(term == null)
        break Fail228;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}