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
    Fail222:
    { 
      IStrategoTerm l_51 = null;
      IStrategoTerm m_51 = null;
      IStrategoTerm q_51 = null;
      l_51 = term;
      q_51 = term;
      IStrategoTerm term209 = term;
      Success167:
      { 
        Fail223:
        { 
          term = retain_all_1_0.instance.invoke(context, l_51, lifted135.instance);
          if(term == null)
            break Fail223;
          m_51 = term;
          if(true)
            break Success167;
        }
        term = term209;
        IStrategoTerm s_51 = null;
        s_51 = term;
        term = report_with_failure_0_1.instance.invoke(context, s_51, cool.const77);
        if(term == null)
          break Fail222;
      }
      term = q_51;
      if(m_51 == null)
        break Fail222;
      term = map_1_0.instance.invoke(context, m_51, lifted136.instance);
      if(term == null)
        break Fail222;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}