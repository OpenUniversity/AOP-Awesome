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

@SuppressWarnings("all") final class lifted0 extends Strategy 
{ 
  TermReference j_11;

  TermReference m_11;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail344:
    { 
      lifted1 lifted110 = new lifted1();
      lifted110.j_11 = j_11;
      lifted110.m_11 = m_11;
      term = try_1_0.instance.invoke(context, term, lifted110);
      if(term == null)
        break Fail344;
      if(true)
        return term;
    }
    return null;
  }
}