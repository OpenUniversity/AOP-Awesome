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

@SuppressWarnings("all") final class lifted89 extends Strategy 
{ 
  TermReference z_53;

  TermReference x_77;

  TermReference x_53;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail257:
    { 
      term = ejp_to_ajc_0_3.instance.invoke(context, term, z_53.value, x_77.value, x_53.value);
      if(term == null)
        break Fail257;
      if(true)
        return term;
    }
    return null;
  }
}