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

@SuppressWarnings("all") public class get_column_0_0 extends Strategy 
{ 
  public static get_column_0_0 instance = new get_column_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail193:
    { 
      IStrategoTerm z_40 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
        break Fail193;
      z_40 = term.getSubterm(1);
      term = z_40;
      if(true)
        return term;
    }
    context.push("get_column_0_0");
    context.popOnFailure();
    return null;
  }
}