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

@SuppressWarnings("all") final class lifted100 extends Strategy 
{ 
  TermReference e_49;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail369:
    { 
      lifted102 lifted1020 = new lifted102();
      lifted101 lifted1011 = new lifted101();
      lifted1020.e_49 = e_49;
      lifted1011.e_49 = e_49;
      term = or_2_0.instance.invoke(context, term, lifted1011, lifted1020);
      if(term == null)
        break Fail369;
      if(true)
        return term;
    }
    return null;
  }
}