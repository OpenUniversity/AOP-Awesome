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

@SuppressWarnings("all") final class lifted3 extends Strategy 
{ 
  TermReference c_77;

  TermReference d_77;

  TermReference e_77;

  TermReference f_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail343:
    { 
      IStrategoTerm z_16 = null;
      z_16 = term;
      if(c_77.value == null)
        break Fail343;
      term = hashtable_copy_0_0.instance.invoke(context, c_77.value);
      if(term == null)
        break Fail343;
      term = ejp_to_java_0_4.instance.invoke(context, z_16, term, d_77.value, e_77.value, f_77.value);
      if(term == null)
        break Fail343;
      if(true)
        return term;
    }
    return null;
  }
}