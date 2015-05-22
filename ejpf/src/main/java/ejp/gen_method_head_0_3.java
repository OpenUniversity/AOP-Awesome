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

@SuppressWarnings("all") public class gen_method_head_0_3 extends Strategy 
{ 
  public static gen_method_head_0_3 instance = new gen_method_head_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_39, IStrategoTerm e_39, IStrategoTerm f_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_method_head_0_3");
    Fail100:
    { 
      TermReference g_39 = new TermReference();
      IStrategoTerm h_39 = null;
      TermReference i_39 = new TermReference();
      IStrategoTerm j_39 = null;
      IStrategoTerm k_39 = null;
      IStrategoTerm l_39 = null;
      term = d_39;
      lifted71 lifted711 = new lifted71();
      lifted70 lifted700 = new lifted70();
      lifted711.i_39 = i_39;
      lifted711.g_39 = g_39;
      lifted700.i_39 = i_39;
      lifted700.g_39 = g_39;
      term = or_2_0.instance.invoke(context, term, lifted700, lifted711);
      if(term == null)
        break Fail100;
      if(g_39.value == null)
        break Fail100;
      term = g_39.value;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointDeclarator_3 != ((IStrategoAppl)term).getConstructor())
        break Fail100;
      j_39 = term.getSubterm(0);
      k_39 = term.getSubterm(1);
      l_39 = term.getSubterm(2);
      term = gen_ejp_annotation_0_1.instance.invoke(context, term, e_39);
      if(term == null)
        break Fail100;
      h_39 = term;
      if(i_39.value == null)
        break Fail100;
      term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(h_39, termFactory.makeListCons(i_39.value, (IStrategoList)ejp.constCons7)), ejp.constNone0, j_39, k_39, l_39, f_39});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}