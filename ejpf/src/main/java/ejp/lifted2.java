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

@SuppressWarnings("all") final class lifted2 extends Strategy 
{ 
  TermReference c_77;

  TermReference d_77;

  TermReference e_77;

  TermReference f_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail342:
    { 
      lifted3 lifted310 = new lifted3();
      lifted310.c_77 = c_77;
      lifted310.d_77 = d_77;
      lifted310.e_77 = e_77;
      lifted310.f_77 = f_77;
      term = try_1_0.instance.invoke(context, term, lifted310);
      if(term == null)
        break Fail342;
      if(true)
        return term;
    }
    return null;
  }
}