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

@SuppressWarnings("all") final class lifted46 extends Strategy 
{ 
  TermReference s_23;

  TermReference c_23;

  TermReference d_23;

  TermReference e_23;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail301:
    { 
      term = ejp_to_java_0_4.instance.invoke(context, term, s_23.value, c_23.value, d_23.value, e_23.value);
      if(term == null)
        break Fail301;
      if(true)
        return term;
    }
    return null;
  }
}