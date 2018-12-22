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

@SuppressWarnings("all") final class lifted118 extends Strategy 
{ 
  public static final lifted118 instance = new lifted118();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail246:
    { 
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail246;
      if(true)
        return term;
    }
    return null;
  }
}