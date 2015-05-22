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

@SuppressWarnings("all") final class lifted88 extends Strategy 
{ 
  TermReference z_53;

  TermReference x_77;

  TermReference x_53;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail256:
    { 
      lifted89 lifted890 = new lifted89();
      lifted890.z_53 = z_53;
      lifted890.x_77 = x_77;
      lifted890.x_53 = x_53;
      term = try_1_0.instance.invoke(context, term, lifted890);
      if(term == null)
        break Fail256;
      if(true)
        return term;
    }
    return null;
  }
}