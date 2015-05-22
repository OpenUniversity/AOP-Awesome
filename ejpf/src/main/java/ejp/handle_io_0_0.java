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

@SuppressWarnings("all") public class handle_io_0_0 extends Strategy 
{ 
  public static handle_io_0_0 instance = new handle_io_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("handle_io_0_0");
    Fail235:
    { 
      IStrategoTerm b_51 = null;
      IStrategoTerm c_51 = null;
      IStrategoTerm d_51 = null;
      IStrategoTerm e_51 = null;
      IStrategoTerm g_51 = null;
      IStrategoTerm l_51 = null;
      IStrategoTerm i_51 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail235;
      b_51 = ((IStrategoList)term).tail();
      term = debug_0_0.instance.invoke(context, b_51);
      if(term == null)
        break Fail235;
      term = b_51;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail235;
      g_51 = ((IStrategoList)term).head();
      term = g_51;
      term = $Read$From$File_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail235;
      c_51 = term;
      term = b_51;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail235;
      l_51 = ((IStrategoList)term).tail();
      term = l_51;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail235;
      i_51 = ((IStrategoList)term).head();
      d_51 = i_51;
      term = transform_0_0.instance.invoke(context, c_51);
      if(term == null)
        break Fail235;
      e_51 = term;
      term = termFactory.makeTuple(d_51, ejp.const108);
      term = fopen_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail235;
      term = termFactory.makeTuple(e_51, term);
      term = fputs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail235;
      term = fclose_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail235;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}