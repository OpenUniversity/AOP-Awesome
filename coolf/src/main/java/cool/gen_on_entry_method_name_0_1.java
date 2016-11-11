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

@SuppressWarnings("all") public class gen_on_entry_method_name_0_1 extends Strategy 
{ 
  public static gen_on_entry_method_name_0_1 instance = new gen_on_entry_method_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_52)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_on_entry_method_name_0_1");
    Fail289:
    { 
      IStrategoTerm k_52 = null;
      IStrategoTerm l_52 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail289;
      IStrategoTerm arg148 = term.getSubterm(0);
      if(arg148.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg148).getConstructor())
        break Fail289;
      k_52 = arg148.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail289;
      l_52 = term;
      term = hashtable_get_0_1.instance.invoke(context, j_52, l_52);
      if(term == null)
        break Fail289;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail289;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const103, termFactory.makeListCons(k_52, termFactory.makeListCons(term, (IStrategoList)cool.constNil0)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail289;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}