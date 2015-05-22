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

@SuppressWarnings("all") final class lifted121 extends Strategy 
{ 
  TermReference c_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail245:
    { 
      IStrategoTerm n_44 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail245;
      n_44 = term.getSubterm(0);
      if(c_44.value == null)
        break Fail245;
      term = hashtable_put_0_2.instance.invoke(context, c_44.value, n_44, n_44);
      if(term == null)
        break Fail245;
      if(true)
        return term;
    }
    return null;
  }
}