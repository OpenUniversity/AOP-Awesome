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

@SuppressWarnings("all") public class transform_0_0 extends Strategy 
{ 
  public static transform_0_0 instance = new transform_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("transform_0_0");
    Fail283:
    { 
      IStrategoTerm g_51 = null;
      IStrategoTerm j_51 = null;
      IStrategoTerm k_51 = null;
      g_51 = term;
      j_51 = g_51;
      k_51 = cool.constCoolTbl;
      term = parse_file_0_1.instance.invoke(context, j_51, k_51);
      if(term == null)
        break Fail283;
      term = transform_ast_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail283;
      term = pp_aspectj_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail283;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}