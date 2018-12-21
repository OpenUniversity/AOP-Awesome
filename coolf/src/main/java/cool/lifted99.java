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

@SuppressWarnings("all") final class lifted99 extends Strategy 
{ 
  TermReference f_33;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail263:
    { 
      lifted101 lifted1011 = new lifted101();
      lifted100 lifted1000 = new lifted100();
      lifted1011.f_33 = f_33;
      lifted1000.f_33 = f_33;
      term = or_2_0.instance.invoke(context, term, lifted1000, lifted1011);
      if(term == null)
        break Fail263;
      if(true)
        return term;
    }
    return null;
  }
}