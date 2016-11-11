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
    Fail327:
    { 
      IStrategoTerm c_80 = null;
      IStrategoTerm d_80 = null;
      IStrategoTerm i_80 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail327;
      c_80 = term.getSubterm(0);
      i_80 = term;
      IStrategoTerm term311 = term;
      Success266:
      { 
        Fail328:
        { 
          term = map_1_0.instance.invoke(context, c_80, lifted136.instance);
          if(term == null)
            break Fail328;
          d_80 = term;
          if(true)
            break Success266;
        }
        term = term311;
        IStrategoTerm n_80 = null;
        n_80 = term;
        term = report_with_failure_0_1.instance.invoke(context, n_80, cool.const135);
        if(term == null)
          break Fail327;
      }
      term = i_80;
      if(d_80 == null)
        break Fail327;
      term = d_80;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}