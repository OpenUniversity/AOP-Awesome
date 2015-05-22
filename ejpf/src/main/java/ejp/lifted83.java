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

@SuppressWarnings("all") final class lifted83 extends Strategy 
{ 
  TermReference k_52;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail263:
    { 
      term = ejp_converter_aspect_or_class_0_1.instance.invoke(context, term, k_52.value);
      if(term == null)
        break Fail263;
      if(true)
        return term;
    }
    return null;
  }
}