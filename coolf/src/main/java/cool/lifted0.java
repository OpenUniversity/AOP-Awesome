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

@SuppressWarnings("all") final class lifted0 extends Strategy 
{ 
  TermReference t_8;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail407:
    { 
      lifted1 lifted137 = new lifted1();
      lifted137.t_8 = t_8;
      term = try_1_0.instance.invoke(context, term, lifted137);
      if(term == null)
        break Fail407;
      if(true)
        return term;
    }
    return null;
  }
}