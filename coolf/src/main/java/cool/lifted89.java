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

@SuppressWarnings("all") final class lifted89 extends Strategy 
{ 
  public static final lifted89 instance = new lifted89();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail381:
    { 
      term = or_2_0.instance.invoke(context, term, lifted90.instance, lifted91.instance);
      if(term == null)
        break Fail381;
      if(true)
        return term;
    }
    return null;
  }
}