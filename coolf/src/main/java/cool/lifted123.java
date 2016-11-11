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

@SuppressWarnings("all") final class lifted123 extends Strategy 
{ 
  TermReference d_72;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail350:
    { 
      IStrategoTerm p_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail350;
      p_72 = term.getSubterm(0);
      if(d_72.value == null)
        break Fail350;
      term = hashtable_put_0_2.instance.invoke(context, d_72.value, p_72, p_72);
      if(term == null)
        break Fail350;
      if(true)
        return term;
    }
    return null;
  }
}