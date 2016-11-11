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

@SuppressWarnings("all") final class lifted128 extends Strategy 
{ 
  TermReference g_72;

  TermReference z_57;

  TermReference o_71;

  TermReference j_72;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail346:
    { 
      term = make_on_exit_method_0_4.instance.invoke(context, term, g_72.value, z_57.value, o_71.value, j_72.value);
      if(term == null)
        break Fail346;
      if(true)
        return term;
    }
    return null;
  }
}