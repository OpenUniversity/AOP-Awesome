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

@SuppressWarnings("all") public class gen_compact_var_declaration_0_2 extends Strategy 
{ 
  public static gen_compact_var_declaration_0_2 instance = new gen_compact_var_declaration_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_20, IStrategoTerm ref_m_20)
  { 
    TermReference m_20 = new TermReference(ref_m_20);
    context.push("gen_compact_var_declaration_0_2");
    Fail29:
    { 
      TermReference n_20 = new TermReference();
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail29;
      if(n_20.value == null)
        n_20.value = term;
      else
        if(n_20.value != term && !n_20.value.match(term))
          break Fail29;
      term = iset_elements_0_0.instance.invoke(context, l_20);
      if(term == null)
        break Fail29;
      lifted33 lifted330 = new lifted33();
      lifted330.n_20 = n_20;
      lifted330.m_20 = m_20;
      term = map_1_0.instance.invoke(context, term, lifted330);
      if(term == null)
        break Fail29;
      if(n_20.value == null)
        break Fail29;
      term = hashtable_keys_0_0.instance.invoke(context, n_20.value);
      if(term == null)
        break Fail29;
      lifted34 lifted340 = new lifted34();
      lifted340.n_20 = n_20;
      term = map_1_0.instance.invoke(context, term, lifted340);
      if(term == null)
        break Fail29;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}