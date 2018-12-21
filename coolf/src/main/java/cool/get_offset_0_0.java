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

@SuppressWarnings("all") public class get_offset_0_0 extends Strategy 
{ 
  public static get_offset_0_0 instance = new get_offset_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail194:
    { 
      IStrategoTerm a_41 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
        break Fail194;
      a_41 = term.getSubterm(3);
      term = a_41;
      if(true)
        return term;
    }
    context.push("get_offset_0_0");
    context.popOnFailure();
    return null;
  }
}