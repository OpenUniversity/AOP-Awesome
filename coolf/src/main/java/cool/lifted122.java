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

@SuppressWarnings("all") final class lifted122 extends Strategy 
{ 
  TermReference e_44;

  TermReference f_44;

  TermReference g_44;

  TermReference h_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail255:
    { 
      term = fill$Method$Maps_0_4.instance.invoke(context, term, e_44.value, f_44.value, g_44.value, h_44.value);
      if(term == null)
        break Fail255;
      if(true)
        return term;
    }
    return null;
  }
}