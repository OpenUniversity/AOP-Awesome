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

@SuppressWarnings("all") public class gen__ejpscope__method__name__helper_0_0 extends Strategy 
{ 
  public static gen__ejpscope__method__name__helper_0_0 instance = new gen__ejpscope__method__name__helper_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen__ejpscope__method__name__helper_0_0");
    Fail66:
    { 
      IStrategoTerm term34 = term;
      IStrategoConstructor cons10 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success34:
      { 
        if(cons10 == transform._consId_1)
        { 
          Fail67:
          { 
            IStrategoTerm j_29 = null;
            j_29 = term.getSubterm(0);
            term = j_29;
            if(true)
              break Success34;
          }
          term = term34;
        }
        Success35:
        { 
          if(cons10 == transform._consTypeName_1)
          { 
            Fail68:
            { 
              IStrategoTerm i_29 = null;
              IStrategoTerm arg73 = term.getSubterm(0);
              if(arg73.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg73).getConstructor())
                break Fail68;
              i_29 = arg73.getSubterm(0);
              term = i_29;
              if(true)
                break Success35;
            }
            term = term34;
          }
          Success36:
          { 
            if(cons10 == transform._consTypeName_2)
            { 
              Fail69:
              { 
                IStrategoTerm e_29 = null;
                IStrategoTerm f_29 = null;
                e_29 = term.getSubterm(0);
                IStrategoTerm arg74 = term.getSubterm(1);
                if(arg74.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg74).getConstructor())
                  break Fail69;
                f_29 = arg74.getSubterm(0);
                term = this.invoke(context, e_29);
                if(term == null)
                  break Fail69;
                term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(ejp.const19, termFactory.makeListCons(f_29, (IStrategoList)ejp.constNil0)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail69;
                if(true)
                  break Success36;
              }
              term = term34;
            }
            Success37:
            { 
              if(cons10 == transform._consPackageOrTypeName_2)
              { 
                Fail70:
                { 
                  IStrategoTerm a_29 = null;
                  IStrategoTerm b_29 = null;
                  a_29 = term.getSubterm(0);
                  IStrategoTerm arg75 = term.getSubterm(1);
                  if(arg75.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg75).getConstructor())
                    break Fail70;
                  b_29 = arg75.getSubterm(0);
                  term = this.invoke(context, a_29);
                  if(term == null)
                    break Fail70;
                  term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(ejp.const19, termFactory.makeListCons(b_29, (IStrategoList)ejp.constNil0)));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail70;
                  if(true)
                    break Success37;
                }
                term = term34;
              }
              Success38:
              { 
                if(cons10 == transform._consPackageOrTypeName_1)
                { 
                  Fail71:
                  { 
                    IStrategoTerm z_28 = null;
                    IStrategoTerm arg76 = term.getSubterm(0);
                    if(arg76.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg76).getConstructor())
                      break Fail71;
                    z_28 = arg76.getSubterm(0);
                    term = z_28;
                    if(true)
                      break Success38;
                  }
                  term = term34;
                }
                Success39:
                { 
                  if(cons10 == transform._consNamePattern_1)
                  { 
                    Fail72:
                    { 
                      IStrategoTerm y_28 = null;
                      y_28 = term.getSubterm(0);
                      term = y_28;
                      if(true)
                        break Success39;
                    }
                    term = term34;
                  }
                  if(cons10 == transform._consNamePattern_2)
                  { 
                    IStrategoTerm u_28 = null;
                    IStrategoTerm v_28 = null;
                    u_28 = term.getSubterm(0);
                    v_28 = term.getSubterm(1);
                    term = this.invoke(context, u_28);
                    if(term == null)
                      break Fail66;
                    term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(ejp.const19, termFactory.makeListCons(v_28, (IStrategoList)ejp.constNil0)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail66;
                  }
                  else
                  { 
                    break Fail66;
                  }
                }
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}