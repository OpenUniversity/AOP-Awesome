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

@SuppressWarnings("all") final class lifted92 extends Strategy 
{ 
  TermReference e_34;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail270:
    { 
      lifted94 lifted940 = new lifted94();
      lifted93 lifted930 = new lifted93();
      lifted940.e_34 = e_34;
      lifted930.e_34 = e_34;
      term = or_2_0.instance.invoke(context, term, lifted930, lifted940);
      if(term == null)
        break Fail270;
      if(true)
        return term;
    }
    return null;
  }
}