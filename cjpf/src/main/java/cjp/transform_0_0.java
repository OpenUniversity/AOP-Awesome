package cjp;

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
    Fail139:
    { 
      IStrategoTerm o_30 = null;
      IStrategoTerm r_30 = null;
      IStrategoTerm s_30 = null;
      o_30 = term;
      r_30 = o_30;
      s_30 = cjp.constCjpTbl;
      term = parse_file_0_1.instance.invoke(context, r_30, s_30);
      if(term == null)
        break Fail139;
      term = topdown_1_0.instance.invoke(context, term, lifted30.instance);
      if(term == null)
        break Fail139;
      term = transform_ast_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail139;
      term = pp_aspectj_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail139;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}