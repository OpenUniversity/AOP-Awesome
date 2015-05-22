package cjp;

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

@SuppressWarnings("all") final class lifted36 extends Strategy 
{ 
  TermReference r_31;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail164:
    { 
      term = closures_converter_aspect_or_class_0_1.instance.invoke(context, term, r_31.value);
      if(term == null)
        break Fail164;
      if(true)
        return term;
    }
    return null;
  }
}