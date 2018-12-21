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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_on_entry_method_name_0_1");
    Fail180:
    { 
      IStrategoTerm t_37 = null;
      IStrategoTerm u_37 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail180;
      IStrategoTerm arg134 = term.getSubterm(0);
      if(arg134.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg134).getConstructor())
        break Fail180;
      t_37 = arg134.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail180;
      u_37 = term;
      term = hashtable_get_0_1.instance.invoke(context, s_37, u_37);
      if(term == null)
        break Fail180;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail180;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const41, termFactory.makeListCons(t_37, termFactory.makeListCons(term, (IStrategoList)cool.constNil0)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail180;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}