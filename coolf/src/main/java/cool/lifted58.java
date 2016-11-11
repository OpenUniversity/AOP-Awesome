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

@SuppressWarnings("all") final class lifted58 extends Strategy 
{ 
  TermReference l_37;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail412:
    { 
      if(l_37.value == null)
        break Fail412;
      term = fetch_1_0.instance.invoke(context, l_37.value, lifted59.instance);
      if(term == null)
        break Fail412;
      if(true)
        return term;
    }
    return null;
  }
}