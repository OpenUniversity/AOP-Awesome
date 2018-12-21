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
    Fail227:
    { 
      IStrategoTerm i_52 = null;
      IStrategoTerm j_52 = null;
      IStrategoTerm m_52 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail227;
      i_52 = term.getSubterm(0);
      m_52 = term;
      IStrategoTerm term208 = term;
      Success166:
      { 
        Fail228:
        { 
          term = map_1_0.instance.invoke(context, i_52, lifted134.instance);
          if(term == null)
            break Fail228;
          j_52 = term;
          if(true)
            break Success166;
        }
        term = term208;
        IStrategoTerm o_52 = null;
        o_52 = term;
        term = report_with_failure_0_1.instance.invoke(context, o_52, cool.const79);
        if(term == null)
          break Fail227;
      }
      term = m_52;
      if(j_52 == null)
        break Fail227;
      term = j_52;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}