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

@SuppressWarnings("all") final class lifted125 extends Strategy 
{ 
  TermReference g_44;

  TermReference p_43;

  TermReference s_43;

  TermReference h_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail242:
    { 
      term = make_on_entry_method_0_4.instance.invoke(context, term, g_44.value, p_43.value, s_43.value, h_44.value);
      if(term == null)
        break Fail242;
      if(true)
        return term;
    }
    return null;
  }
}