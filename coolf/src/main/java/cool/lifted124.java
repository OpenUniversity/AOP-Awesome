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

@SuppressWarnings("all") final class lifted124 extends Strategy 
{ 
  TermReference f_72;

  TermReference g_72;

  TermReference h_72;

  TermReference j_72;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail360:
    { 
      term = fill$Method$Maps_0_4.instance.invoke(context, term, f_72.value, g_72.value, h_72.value, j_72.value);
      if(term == null)
        break Fail360;
      if(true)
        return term;
    }
    return null;
  }
}