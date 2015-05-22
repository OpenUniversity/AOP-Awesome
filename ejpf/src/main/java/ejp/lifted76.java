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

@SuppressWarnings("all") final class lifted76 extends Strategy 
{ 
  public static final lifted76 instance = new lifted76();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail266:
    { 
      IStrategoTerm term179 = term;
      Success182:
      { 
        Fail267:
        { 
          term = aspectj_to_box_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail267;
          if(true)
            break Success182;
        }
        term = java_to_box_0_0.instance.invoke(context, term179);
        if(term == null)
          break Fail266;
      }
      if(true)
        return term;
    }
    return null;
  }
}