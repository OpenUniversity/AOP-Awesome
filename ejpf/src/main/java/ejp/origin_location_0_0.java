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

@SuppressWarnings("all") public class origin_location_0_0 extends Strategy 
{ 
  public static origin_location_0_0 instance = new origin_location_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail239:
    { 
      IStrategoTerm j_52 = null;
      j_52 = term;
      term = context.invokePrimitive("SSL_EXT_origin_location", j_52, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail239;
      if(true)
        return term;
    }
    context.push("origin_location_0_0");
    context.popOnFailure();
    return null;
  }
}