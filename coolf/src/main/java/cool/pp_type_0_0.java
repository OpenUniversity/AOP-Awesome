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

@SuppressWarnings("all") public class pp_type_0_0 extends Strategy 
{ 
  public static pp_type_0_0 instance = new pp_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pp_type_0_0");
    Fail4:
    { 
      IStrategoTerm term3 = term;
      Success3:
      { 
        Fail5:
        { 
          IStrategoTerm c_8 = null;
          IStrategoTerm d_8 = null;
          IStrategoTerm e_8 = null;
          c_8 = term;
          e_8 = term;
          d_8 = c_8;
          term = e_8;
          IStrategoTerm term4 = term;
          Success4:
          { 
            Fail6:
            { 
              IStrategoTerm f_8 = null;
              f_8 = term;
              term = d_8;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                break Fail6;
              term = f_8;
              { 
                term = cool.const1;
                if(true)
                  break Success4;
              }
            }
            term = term4;
            IStrategoTerm term5 = term;
            Success5:
            { 
              Fail7:
              { 
                IStrategoTerm g_8 = null;
                g_8 = term;
                term = d_8;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail7;
                term = g_8;
                { 
                  term = cool.const2;
                  if(true)
                    break Success5;
                }
              }
              term = term5;
              IStrategoTerm term6 = term;
              Success6:
              { 
                Fail8:
                { 
                  IStrategoTerm h_8 = null;
                  h_8 = term;
                  term = d_8;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail8;
                  term = h_8;
                  { 
                    term = cool.const3;
                    if(true)
                      break Success6;
                  }
                }
                term = term6;
                IStrategoTerm term7 = term;
                Success7:
                { 
                  Fail9:
                  { 
                    IStrategoTerm i_8 = null;
                    i_8 = term;
                    term = d_8;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail9;
                    term = i_8;
                    { 
                      term = cool.const4;
                      if(true)
                        break Success7;
                    }
                  }
                  term = term7;
                  IStrategoTerm term8 = term;
                  Success8:
                  { 
                    Fail10:
                    { 
                      IStrategoTerm j_8 = null;
                      j_8 = term;
                      term = d_8;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail10;
                      term = j_8;
                      { 
                        term = cool.const5;
                        if(true)
                          break Success8;
                      }
                    }
                    term = term8;
                    IStrategoTerm term9 = term;
                    Success9:
                    { 
                      Fail11:
                      { 
                        IStrategoTerm k_8 = null;
                        k_8 = term;
                        term = d_8;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail11;
                        term = k_8;
                        { 
                          term = cool.const6;
                          if(true)
                            break Success9;
                        }
                      }
                      term = term9;
                      IStrategoTerm term10 = term;
                      Success10:
                      { 
                        Fail12:
                        { 
                          IStrategoTerm l_8 = null;
                          l_8 = term;
                          term = d_8;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail12;
                          term = l_8;
                          { 
                            term = cool.const7;
                            if(true)
                              break Success10;
                          }
                        }
                        term = term10;
                        Success11:
                        { 
                          Fail13:
                          { 
                            IStrategoTerm m_8 = null;
                            m_8 = term;
                            term = d_8;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                              break Fail13;
                            term = m_8;
                            { 
                              term = cool.const8;
                              if(true)
                                break Success11;
                            }
                          }
                          term = cool.const9;
                          if(true)
                            break Fail5;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if(true)
            break Success3;
        }
        term = term3;
        IStrategoTerm term12 = term;
        IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success12:
        { 
          if(cons1 == transform._consArrayType_1)
          { 
            Fail14:
            { 
              IStrategoTerm z_7 = null;
              z_7 = term.getSubterm(0);
              term = this.invoke(context, z_7);
              if(term == null)
                break Fail14;
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constCons0);
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail14;
              if(true)
                break Success12;
            }
            term = term12;
          }
          Success13:
          { 
            if(cons1 == transform._consClassOrInterfaceType_2)
            { 
              Fail15:
              { 
                IStrategoTerm y_7 = null;
                IStrategoTerm arg4 = term.getSubterm(0);
                if(arg4.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg4).getConstructor())
                  break Fail15;
                IStrategoTerm arg5 = arg4.getSubterm(0);
                if(arg5.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg5).getConstructor())
                  break Fail15;
                y_7 = arg5.getSubterm(0);
                term = y_7;
                if(true)
                  break Success13;
              }
              term = term12;
            }
            Success14:
            { 
              if(cons1 == transform._consClassOrInterfaceType_2)
              { 
                Fail16:
                { 
                  IStrategoTerm u_7 = null;
                  IStrategoTerm v_7 = null;
                  IStrategoTerm arg7 = term.getSubterm(0);
                  if(arg7.getTermType() != IStrategoTerm.APPL || transform._consTypeName_2 != ((IStrategoAppl)arg7).getConstructor())
                    break Fail16;
                  u_7 = arg7.getSubterm(0);
                  IStrategoTerm arg8 = arg7.getSubterm(1);
                  if(arg8.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg8).getConstructor())
                    break Fail16;
                  v_7 = arg8.getSubterm(0);
                  term = this.invoke(context, u_7);
                  if(term == null)
                    break Fail16;
                  term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(cool.const0, termFactory.makeListCons(v_7, (IStrategoList)cool.constNil0)));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail16;
                  if(true)
                    break Success14;
                }
                term = term12;
              }
              Success15:
              { 
                if(cons1 == transform._consPackageOrTypeName_1)
                { 
                  Fail17:
                  { 
                    IStrategoTerm t_7 = null;
                    IStrategoTerm arg10 = term.getSubterm(0);
                    if(arg10.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg10).getConstructor())
                      break Fail17;
                    t_7 = arg10.getSubterm(0);
                    term = t_7;
                    if(true)
                      break Success15;
                  }
                  term = term12;
                }
                if(cons1 == transform._consPackageOrTypeName_2)
                { 
                  IStrategoTerm p_7 = null;
                  IStrategoTerm q_7 = null;
                  p_7 = term.getSubterm(0);
                  IStrategoTerm arg11 = term.getSubterm(1);
                  if(arg11.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg11).getConstructor())
                    break Fail4;
                  q_7 = arg11.getSubterm(0);
                  term = this.invoke(context, p_7);
                  if(term == null)
                    break Fail4;
                  term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(cool.const0, termFactory.makeListCons(q_7, (IStrategoList)cool.constNil0)));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4;
                }
                else
                { 
                  break Fail4;
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