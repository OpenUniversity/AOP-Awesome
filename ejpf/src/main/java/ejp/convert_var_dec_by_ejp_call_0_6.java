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

@SuppressWarnings("all") public class convert_var_dec_by_ejp_call_0_6 extends Strategy 
{ 
  public static convert_var_dec_by_ejp_call_0_6 instance = new convert_var_dec_by_ejp_call_0_6();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_77, IStrategoTerm u_77, IStrategoTerm v_77, IStrategoTerm w_77, IStrategoTerm x_77, IStrategoTerm y_77)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("convert_var_dec_by_ejp_call_0_6");
    Fail21:
    { 
      IStrategoTerm term17 = term;
      IStrategoConstructor cons3 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success17:
      { 
        if(cons3 == transform._consVarDec_2)
        { 
          Fail22:
          { 
            IStrategoTerm l_18 = null;
            IStrategoTerm m_18 = null;
            IStrategoTerm n_18 = null;
            l_18 = term.getSubterm(0);
            IStrategoTerm arg28 = term.getSubterm(1);
            if(arg28.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg28).getConstructor())
              break Fail22;
            m_18 = arg28.getSubterm(0);
            n_18 = arg28.getSubterm(1);
            term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{m_18, n_18});
            term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, t_77, w_77, x_77, y_77);
            if(term == null)
              break Fail22;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{u_77, v_77, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{l_18, term}), (IStrategoList)ejp.constNil0)})}), (IStrategoList)ejp.constNil0);
            if(true)
              break Success17;
          }
          term = term17;
        }
        if(cons3 == transform._consVarDec_2)
        { 
          IStrategoTerm x_17 = null;
          IStrategoTerm y_17 = null;
          IStrategoTerm z_17 = null;
          IStrategoTerm a_18 = null;
          IStrategoTerm b_18 = null;
          x_17 = term.getSubterm(0);
          IStrategoTerm arg29 = term.getSubterm(1);
          if(arg29.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg29).getConstructor())
            break Fail21;
          y_17 = arg29.getSubterm(0);
          z_17 = arg29.getSubterm(1);
          IStrategoTerm arg30 = arg29.getSubterm(2);
          if(arg30.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg30).getConstructor())
            break Fail21;
          a_18 = arg30.getSubterm(0);
          term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{y_17, z_17});
          term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, t_77, w_77, x_77, y_77);
          if(term == null)
            break Fail21;
          b_18 = term;
          term = termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{y_17, z_17, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{a_18})});
          term = scoped_ejp_to_java_0_4.instance.invoke(context, term, t_77, w_77, x_77, y_77);
          if(term == null)
            break Fail21;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{u_77, v_77, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{x_17, b_18}), (IStrategoList)ejp.constNil0)})}), (IStrategoList)ejp.constNil0), term);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21;
        }
        else
        { 
          break Fail21;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 0 || targs.length != 6)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5]);
  }
}