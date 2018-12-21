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
    Fail171:
    { 
      IStrategoTerm a_36 = null;
      IStrategoTerm d_36 = null;
      IStrategoTerm e_36 = null;
      a_36 = term;
      d_36 = a_36;
      e_36 = cool.constCoolTbl;
      term = parse_file_0_1.instance.invoke(context, d_36, e_36);
      if(term == null)
        break Fail171;
      term = topdown_1_0.instance.invoke(context, term, lifted102.instance);
      if(term == null)
        break Fail171;
      term = transform_ast_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail171;
      term = pp_java5_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail171;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}