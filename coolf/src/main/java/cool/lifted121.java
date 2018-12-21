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
  TermReference i_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail246:
    { 
      IStrategoTerm t_44 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail246;
      t_44 = term.getSubterm(0);
      if(i_44.value == null)
        break Fail246;
      term = hashtable_put_0_2.instance.invoke(context, i_44.value, t_44, t_44);
      if(term == null)
        break Fail246;
      if(true)
        return term;
    }
    return null;
  }
}