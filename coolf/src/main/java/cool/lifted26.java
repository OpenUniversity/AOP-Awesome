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

@SuppressWarnings("all") final class lifted26 extends Strategy 
{ 
  public static final lifted26 instance = new lifted26();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail379:
    { 
      term = or_2_0.instance.invoke(context, term, lifted27.instance, lifted28.instance);
      if(term == null)
        break Fail379;
      if(true)
        return term;
    }
    return null;
  }
}