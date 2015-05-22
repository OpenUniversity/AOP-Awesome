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

@SuppressWarnings("all") public class get_default_return_value_for_return_type_0_0 extends Strategy 
{ 
  public static get_default_return_value_for_return_type_0_0 instance = new get_default_return_value_for_return_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail104:
    { 
      IStrategoTerm b_40 = null;
      IStrategoTerm c_40 = null;
      IStrategoTerm d_40 = null;
      b_40 = term;
      d_40 = term;
      c_40 = b_40;
      term = d_40;
      IStrategoTerm term60 = term;
      Success55:
      { 
        Fail105:
        { 
          IStrategoTerm e_40 = null;
          e_40 = term;
          term = c_40;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consVoid_0 != ((IStrategoAppl)term).getConstructor())
            break Fail105;
          term = e_40;
          { 
            term = ejp.constNone0;
            if(true)
              break Success55;
          }
        }
        term = term60;
        IStrategoTerm term61 = term;
        Success56:
        { 
          Fail106:
          { 
            IStrategoTerm f_40 = null;
            f_40 = term;
            term = c_40;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
              break Fail106;
            term = f_40;
            { 
              term = ejp.constSome0;
              if(true)
                break Success56;
            }
          }
          term = term61;
          IStrategoTerm term62 = term;
          Success57:
          { 
            Fail107:
            { 
              IStrategoTerm g_40 = null;
              g_40 = term;
              term = c_40;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                break Fail107;
              term = g_40;
              { 
                term = ejp.constSome0;
                if(true)
                  break Success57;
              }
            }
            term = term62;
            IStrategoTerm term63 = term;
            Success58:
            { 
              Fail108:
              { 
                IStrategoTerm h_40 = null;
                h_40 = term;
                term = c_40;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail108;
                term = h_40;
                { 
                  term = ejp.constSome0;
                  if(true)
                    break Success58;
                }
              }
              term = term63;
              IStrategoTerm term64 = term;
              Success59:
              { 
                Fail109:
                { 
                  IStrategoTerm i_40 = null;
                  i_40 = term;
                  term = c_40;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail109;
                  term = i_40;
                  { 
                    term = ejp.constSome0;
                    if(true)
                      break Success59;
                  }
                }
                term = term64;
                IStrategoTerm term65 = term;
                Success60:
                { 
                  Fail110:
                  { 
                    IStrategoTerm j_40 = null;
                    j_40 = term;
                    term = c_40;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail110;
                    term = j_40;
                    { 
                      term = ejp.constSome0;
                      if(true)
                        break Success60;
                    }
                  }
                  term = term65;
                  IStrategoTerm term66 = term;
                  Success61:
                  { 
                    Fail111:
                    { 
                      IStrategoTerm k_40 = null;
                      k_40 = term;
                      term = c_40;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail111;
                      term = k_40;
                      { 
                        term = ejp.constSome0;
                        if(true)
                          break Success61;
                      }
                    }
                    term = term66;
                    Success62:
                    { 
                      Fail112:
                      { 
                        IStrategoTerm l_40 = null;
                        l_40 = term;
                        term = c_40;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail112;
                        term = l_40;
                        { 
                          term = ejp.constSome1;
                          if(true)
                            break Success62;
                        }
                      }
                      term = ejp.constSome2;
                    }
                  }
                }
              }
            }
          }
        }
      }
      if(true)
        return term;
    }
    context.push("get_default_return_value_for_return_type_0_0");
    context.popOnFailure();
    return null;
  }
}