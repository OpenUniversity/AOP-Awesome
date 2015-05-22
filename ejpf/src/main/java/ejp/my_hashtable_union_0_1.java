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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_29)
  { 
    TermReference y_29 = new TermReference(ref_y_29);
    context.push("my_hashtable_union_0_1");
    Fail76:
    { 
      TermReference z_29 = new TermReference();
      if(z_29.value == null)
        z_29.value = term;
      else
        if(z_29.value != term && !z_29.value.match(term))
          break Fail76;
      if(y_29.value == null)
        break Fail76;
      term = hashtable_keys_0_0.instance.invoke(context, y_29.value);
      if(term == null)
        break Fail76;
      lifted56 lifted560 = new lifted56();
      lifted560.y_29 = y_29;
      lifted560.z_29 = z_29;
      term = map_1_0.instance.invoke(context, term, lifted560);
      if(term == null)
        break Fail76;
      if(z_29.value == null)
        break Fail76;
      term = z_29.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}