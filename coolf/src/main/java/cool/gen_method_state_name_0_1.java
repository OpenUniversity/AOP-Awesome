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

@SuppressWarnings("all") public class gen_method_state_name_0_1 extends Strategy 
{ 
  public static gen_method_state_name_0_1 instance = new gen_method_state_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_method_state_name_0_1");
    Fail178:
    { 
      IStrategoTerm f_37 = null;
      IStrategoTerm g_37 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail178;
      IStrategoTerm arg130 = term.getSubterm(0);
      if(arg130.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg130).getConstructor())
        break Fail178;
      f_37 = arg130.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail178;
      g_37 = term;
      term = hashtable_get_0_1.instance.invoke(context, e_37, g_37);
      if(term == null)
        break Fail178;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail178;
      term = (IStrategoTerm)termFactory.makeListCons(f_37, termFactory.makeListCons(term, (IStrategoList)cool.constCons10));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail178;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}