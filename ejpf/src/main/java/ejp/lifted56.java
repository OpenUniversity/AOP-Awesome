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

@SuppressWarnings("all") final class lifted56 extends Strategy 
{ 
  TermReference y_29;

  TermReference z_29;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail292:
    { 
      term = my_hashtable_union_helper_0_2.instance.invoke(context, term, y_29.value, z_29.value);
      if(term == null)
        break Fail292;
      if(true)
        return term;
    }
    return null;
  }
}