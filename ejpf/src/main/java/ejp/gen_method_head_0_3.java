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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_39, IStrategoTerm o_39, IStrategoTerm p_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_method_head_0_3");
    Fail100:
    { 
      TermReference q_39 = new TermReference();
      IStrategoTerm r_39 = null;
      TermReference s_39 = new TermReference();
      IStrategoTerm t_39 = null;
      IStrategoTerm u_39 = null;
      IStrategoTerm v_39 = null;
      term = n_39;
      lifted71 lifted711 = new lifted71();
      lifted70 lifted700 = new lifted70();
      lifted711.s_39 = s_39;
      lifted711.q_39 = q_39;
      lifted700.s_39 = s_39;
      lifted700.q_39 = q_39;
      term = or_2_0.instance.invoke(context, term, lifted700, lifted711);
      if(term == null)
        break Fail100;
      if(q_39.value == null)
        break Fail100;
      term = q_39.value;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointDeclarator_3 != ((IStrategoAppl)term).getConstructor())
        break Fail100;
      t_39 = term.getSubterm(0);
      u_39 = term.getSubterm(1);
      v_39 = term.getSubterm(2);
      term = gen_ejp_annotation_0_1.instance.invoke(context, term, o_39);
      if(term == null)
        break Fail100;
      r_39 = term;
      if(s_39.value == null)
        break Fail100;
      term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(r_39, termFactory.makeListCons(s_39.value, (IStrategoList)ejp.constCons7)), ejp.constNone0, t_39, u_39, v_39, p_39});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}