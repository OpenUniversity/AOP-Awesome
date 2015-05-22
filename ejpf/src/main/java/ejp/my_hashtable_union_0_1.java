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

@SuppressWarnings("all") public class my_hashtable_union_0_1 extends Strategy 
{ 
  public static my_hashtable_union_0_1 instance = new my_hashtable_union_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_30)
  { 
    TermReference i_30 = new TermReference(ref_i_30);
    context.push("my_hashtable_union_0_1");
    Fail76:
    { 
      TermReference j_30 = new TermReference();
      if(j_30.value == null)
        j_30.value = term;
      else
        if(j_30.value != term && !j_30.value.match(term))
          break Fail76;
      if(i_30.value == null)
        break Fail76;
      term = hashtable_keys_0_0.instance.invoke(context, i_30.value);
      if(term == null)
        break Fail76;
      lifted56 lifted560 = new lifted56();
      lifted560.i_30 = i_30;
      lifted560.j_30 = j_30;
      term = map_1_0.instance.invoke(context, term, lifted560);
      if(term == null)
        break Fail76;
      if(j_30.value == null)
        break Fail76;
      term = j_30.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}