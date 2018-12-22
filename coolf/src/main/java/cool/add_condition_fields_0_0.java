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

@SuppressWarnings("all") public class add_condition_fields_0_0 extends Strategy 
{ 
  public static add_condition_fields_0_0 instance = new add_condition_fields_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("add_condition_fields_0_0");
    Fail220:
    { 
      IStrategoTerm a_51 = null;
      IStrategoTerm b_51 = null;
      IStrategoTerm e_51 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail220;
      a_51 = term.getSubterm(0);
      e_51 = term;
      IStrategoTerm term208 = term;
      Success166:
      { 
        Fail221:
        { 
          term = map_1_0.instance.invoke(context, a_51, lifted134.instance);
          if(term == null)
            break Fail221;
          b_51 = term;
          if(true)
            break Success166;
        }
        term = term208;
        IStrategoTerm g_51 = null;
        g_51 = term;
        term = report_with_failure_0_1.instance.invoke(context, g_51, cool.const75);
        if(term == null)
          break Fail220;
      }
      term = e_51;
      if(b_51 == null)
        break Fail220;
      term = b_51;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}