package cjp;

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

@SuppressWarnings("all") final class o_18 extends Strategy 
{ 
  public static final o_18 instance = new o_18();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail193:
    { 
      IStrategoTerm term101 = term;
      Success129:
      { 
        Fail194:
        { 
          term = $Not$Comp_1_0.instance.invoke(context, term, _Id.instance);
          if(term == null)
            break Fail194;
          if(true)
            break Success129;
        }
        term = term101;
        IStrategoTerm term102 = term;
        Success130:
        { 
          Fail195:
          { 
            term = $And$Comp_2_0.instance.invoke(context, term, this, _Id.instance);
            if(term == null)
              break Fail195;
            if(true)
              break Success130;
          }
          term = $Or$Comp_2_0.instance.invoke(context, term102, this, _Id.instance);
          if(term == null)
            break Fail193;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}