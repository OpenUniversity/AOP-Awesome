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
    Fail226:
    { 
      IStrategoTerm u_51 = null;
      IStrategoTerm v_51 = null;
      IStrategoTerm y_51 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail226;
      u_51 = term.getSubterm(0);
      y_51 = term;
      IStrategoTerm term207 = term;
      Success165:
      { 
        Fail227:
        { 
          term = map_1_0.instance.invoke(context, u_51, lifted134.instance);
          if(term == null)
            break Fail227;
          v_51 = term;
          if(true)
            break Success165;
        }
        term = term207;
        IStrategoTerm a_52 = null;
        a_52 = term;
        term = report_with_failure_0_1.instance.invoke(context, a_52, cool.const76);
        if(term == null)
          break Fail226;
      }
      term = y_51;
      if(v_51 == null)
        break Fail226;
      term = v_51;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}