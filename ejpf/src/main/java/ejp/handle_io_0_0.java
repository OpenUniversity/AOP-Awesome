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
      IStrategoTerm o_50 = null;
      IStrategoTerm p_50 = null;
      IStrategoTerm q_50 = null;
      IStrategoTerm r_50 = null;
      IStrategoTerm t_50 = null;
      IStrategoTerm z_50 = null;
      IStrategoTerm v_50 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail235;
      o_50 = ((IStrategoList)term).tail();
      term = debug_0_0.instance.invoke(context, o_50);
      if(term == null)
        break Fail235;
      term = o_50;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail235;
      t_50 = ((IStrategoList)term).head();
      term = t_50;
      term = $Read$From$File_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail235;
      p_50 = term;
      term = o_50;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail235;
      z_50 = ((IStrategoList)term).tail();
      term = z_50;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail235;
      v_50 = ((IStrategoList)term).head();
      q_50 = v_50;
      term = transform_0_0.instance.invoke(context, p_50);
      if(term == null)
        break Fail235;
      r_50 = term;
      term = termFactory.makeTuple(q_50, ejp.const108);
      term = fopen_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail235;
      term = termFactory.makeTuple(r_50, term);
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