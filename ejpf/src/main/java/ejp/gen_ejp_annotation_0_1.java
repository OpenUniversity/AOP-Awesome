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

@SuppressWarnings("all") public class gen_ejp_annotation_0_1 extends Strategy 
{ 
  public static gen_ejp_annotation_0_1 instance = new gen_ejp_annotation_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_ejp_annotation_0_1");
    Fail101:
    { 
      term = fetch_handles_list_0_0.instance.invoke(context, o_39);
      if(term == null)
        break Fail101;
      term = map_1_0.instance.invoke(context, term, lifted72.instance);
      if(term == null)
        break Fail101;
      term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{ejp.constTypeName7, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId24, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)ejp.constNil0)});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}