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

@SuppressWarnings("all") public class handle_io_0_0 extends Strategy 
{ 
  public static handle_io_0_0 instance = new handle_io_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("handle_io_0_0");
    Fail138:
    { 
      IStrategoTerm q_29 = null;
      IStrategoTerm s_29 = null;
      IStrategoTerm t_29 = null;
      IStrategoTerm v_29 = null;
      IStrategoTerm a_30 = null;
      IStrategoTerm f_30 = null;
      IStrategoTerm h_30 = null;
      IStrategoTerm i_30 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail138;
      q_29 = ((IStrategoList)term).tail();
      term = q_29;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail138;
      v_29 = ((IStrategoList)term).head();
      term = v_29;
      s_29 = v_29;
      term = $Read$From$File_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail138;
      term = q_29;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail138;
      a_30 = ((IStrategoList)term).tail();
      term = a_30;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail138;
      term = transform_0_0.instance.invoke(context, s_29);
      if(term == null)
        break Fail138;
      t_29 = term;
      h_30 = s_29;
      f_30 = cjp.const94;
      i_30 = h_30;
      term = string_replace_0_2.instance.invoke(context, i_30, f_30, cjp.const95);
      if(term == null)
        break Fail138;
      term = termFactory.makeTuple(term, cjp.const96);
      term = fopen_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail138;
      term = termFactory.makeTuple(t_29, term);
      term = fputs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail138;
      term = fclose_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail138;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}