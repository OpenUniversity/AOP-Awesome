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
  TermReference l_54;

  TermReference j_78;

  TermReference j_54;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail257:
    { 
      term = ejp_to_ajc_0_3.instance.invoke(context, term, l_54.value, j_78.value, j_54.value);
      if(term == null)
        break Fail257;
      if(true)
        return term;
    }
    return null;
  }
}