package ejp;

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
    Fail236:
    { 
      IStrategoTerm t_51 = null;
      IStrategoTerm w_51 = null;
      IStrategoTerm x_51 = null;
      t_51 = term;
      w_51 = t_51;
      x_51 = ejp.constEjpTbl;
      term = parse_file_0_1.instance.invoke(context, w_51, x_51);
      if(term == null)
        break Fail236;
      term = topdown_1_0.instance.invoke(context, term, lifted77.instance);
      if(term == null)
        break Fail236;
      term = transform_ast_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail236;
      term = pp_aspectj_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail236;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}