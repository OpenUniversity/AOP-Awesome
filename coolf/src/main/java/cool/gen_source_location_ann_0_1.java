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

@SuppressWarnings("all") public class gen_source_location_ann_0_1 extends Strategy 
{ 
  public static gen_source_location_ann_0_1 instance = new gen_source_location_ann_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_source_location_ann_0_1");
    Fail188:
    { 
      IStrategoTerm g_40 = null;
      IStrategoTerm h_40 = null;
      IStrategoTerm i_40 = null;
      IStrategoTerm j_40 = null;
      IStrategoTerm k_40 = null;
      g_40 = term;
      term = get_file_0_0.instance.invoke(context, g_40);
      if(term == null)
        break Fail188;
      h_40 = term;
      term = get_location_0_0.instance.invoke(context, g_40);
      if(term == null)
        break Fail188;
      term = get_start_line_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail188;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail188;
      i_40 = term;
      term = get_location_0_0.instance.invoke(context, g_40);
      if(term == null)
        break Fail188;
      term = get_end_line_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail188;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail188;
      j_40 = term;
      term = get_location_0_0.instance.invoke(context, g_40);
      if(term == null)
        break Fail188;
      term = get_column_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail188;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail188;
      k_40 = term;
      term = get_location_0_0.instance.invoke(context, g_40);
      if(term == null)
        break Fail188;
      term = get_offset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail188;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail188;
      term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{f_40})}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId24, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{h_40}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId23, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{i_40})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId22, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{j_40})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId21, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{k_40})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{term})})}), (IStrategoList)cool.constNil0)))))});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}