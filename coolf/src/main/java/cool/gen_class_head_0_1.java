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

@SuppressWarnings("all") public class gen_class_head_0_1 extends Strategy 
{ 
  public static gen_class_head_0_1 instance = new gen_class_head_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_53)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_class_head_0_1");
    Fail295:
    { 
      IStrategoTerm p_53 = null;
      IStrategoTerm q_53 = null;
      term = fetch__class__name_0_0.instance.invoke(context, n_53);
      if(term == null)
        break Fail295;
      q_53 = term;
      term = fetch__full__class__name_0_0.instance.invoke(context, n_53);
      if(term == null)
        break Fail295;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId16, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)cool.constNil0)})})}), (IStrategoList)cool.constNil0)}), (IStrategoList)cool.constCons28);
      p_53 = term;
      term = (IStrategoTerm)termFactory.makeListCons(q_53, (IStrategoList)cool.constCons29);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail295;
      term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{p_53, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), cool.constNone0, cool.constNone0, cool.constNone0});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}