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
  TermReference l_54;

  TermReference j_78;

  TermReference j_54;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail256:
    { 
      lifted89 lifted890 = new lifted89();
      lifted890.l_54 = l_54;
      lifted890.j_78 = j_78;
      lifted890.j_54 = j_54;
      term = try_1_0.instance.invoke(context, term, lifted890);
      if(term == null)
        break Fail256;
      if(true)
        return term;
    }
    return null;
  }
}