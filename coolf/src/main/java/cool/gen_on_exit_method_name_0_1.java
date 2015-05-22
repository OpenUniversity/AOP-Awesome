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

@SuppressWarnings("all") public class gen_on_exit_method_name_0_1 extends Strategy 
{ 
  public static gen_on_exit_method_name_0_1 instance = new gen_on_exit_method_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_on_exit_method_name_0_1");
    Fail181:
    { 
      IStrategoTerm a_38 = null;
      IStrategoTerm b_38 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail181;
      IStrategoTerm arg136 = term.getSubterm(0);
      if(arg136.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg136).getConstructor())
        break Fail181;
      a_38 = arg136.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail181;
      b_38 = term;
      term = hashtable_get_0_1.instance.invoke(context, z_37, b_38);
      if(term == null)
        break Fail181;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail181;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const41, termFactory.makeListCons(a_38, termFactory.makeListCons(term, (IStrategoList)cool.constNil0)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail181;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}