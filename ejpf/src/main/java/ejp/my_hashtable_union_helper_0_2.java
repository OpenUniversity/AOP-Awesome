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

@SuppressWarnings("all") public class my_hashtable_union_helper_0_2 extends Strategy 
{ 
  public static my_hashtable_union_helper_0_2 instance = new my_hashtable_union_helper_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_30, IStrategoTerm e_30)
  { 
    context.push("my_hashtable_union_helper_0_2");
    Fail77:
    { 
      IStrategoTerm f_30 = null;
      IStrategoTerm j_30 = null;
      f_30 = term;
      term = hashtable_remove_0_1.instance.invoke(context, e_30, term);
      if(term == null)
        break Fail77;
      j_30 = e_30;
      term = hashtable_get_0_1.instance.invoke(context, d_30, f_30);
      if(term == null)
        break Fail77;
      term = hashtable_put_0_2.instance.invoke(context, j_30, f_30, term);
      if(term == null)
        break Fail77;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}