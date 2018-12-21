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

@SuppressWarnings("all") public class handle_io_0_0 extends Strategy 
{ 
  public static handle_io_0_0 instance = new handle_io_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("handle_io_0_0");
    Fail170:
    { 
      IStrategoTerm c_35 = null;
      IStrategoTerm d_35 = null;
      IStrategoTerm f_35 = null;
      IStrategoTerm k_35 = null;
      IStrategoTerm l_35 = null;
      IStrategoTerm n_35 = null;
      IStrategoTerm s_35 = null;
      IStrategoTerm p_35 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail170;
      c_35 = ((IStrategoList)term).tail();
      term = debug_0_0.instance.invoke(context, cool.const25);
      if(term == null)
        break Fail170;
      term = debug_0_0.instance.invoke(context, c_35);
      if(term == null)
        break Fail170;
      term = c_35;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail170;
      n_35 = ((IStrategoList)term).head();
      term = n_35;
      f_35 = n_35;
      term = $Read$From$File_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail170;
      d_35 = term;
      term = c_35;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail170;
      s_35 = ((IStrategoList)term).tail();
      term = s_35;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail170;
      p_35 = ((IStrategoList)term).head();
      k_35 = p_35;
      term = transform_0_0.instance.invoke(context, d_35);
      if(term == null)
        break Fail170;
      l_35 = term;
      term = dirname_0_0.instance.invoke(context, f_35);
      if(term == null)
        break Fail170;
      term = base_filename_0_0.instance.invoke(context, f_35);
      if(term == null)
        break Fail170;
      term = remove_extension_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail170;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constCons3);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail170;
      term = termFactory.makeTuple(term, cool.const27);
      term = add_extension_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail170;
      term = termFactory.makeTuple(k_35, cool.const28);
      term = fopen_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail170;
      term = termFactory.makeTuple(l_35, term);
      term = fputs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail170;
      term = fclose_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail170;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}