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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_1 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_1 instance = new aspectj_to_box_0_0_fragment_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_1");
    Fail195:
    { 
      IStrategoTerm term144 = term;
      IStrategoConstructor cons21 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success139:
      { 
        if(cons21 == transform._consIntertypeConstrDecHead_6)
        { 
          Fail196:
          { 
            IStrategoTerm a_44 = null;
            IStrategoTerm b_44 = null;
            IStrategoTerm c_44 = null;
            IStrategoTerm d_44 = null;
            IStrategoTerm e_44 = null;
            IStrategoTerm f_44 = null;
            IStrategoTerm g_44 = null;
            IStrategoTerm h_44 = null;
            IStrategoTerm i_44 = null;
            IStrategoTerm j_44 = null;
            IStrategoTerm k_44 = null;
            IStrategoTerm l_44 = null;
            IStrategoTerm o_44 = null;
            IStrategoTerm p_44 = null;
            i_44 = term.getSubterm(0);
            d_44 = term.getSubterm(1);
            a_44 = term.getSubterm(2);
            e_44 = term.getSubterm(3);
            b_44 = term.getSubterm(4);
            g_44 = term.getSubterm(5);
            l_44 = term;
            term = list_to_args_0_0.instance.invoke(context, b_44);
            if(term == null)
              break Fail196;
            c_44 = term;
            term = type_params_to_boxes_0_0.instance.invoke(context, d_44);
            if(term == null)
              break Fail196;
            j_44 = term;
            term = type_params_to_boxes_0_0.instance.invoke(context, e_44);
            if(term == null)
              break Fail196;
            f_44 = term;
            term = option_to_boxes_0_0.instance.invoke(context, g_44);
            if(term == null)
              break Fail196;
            h_44 = term;
            term = termFactory.makeTuple(i_44, j_44);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail196;
            k_44 = term;
            term = l_44;
            p_44 = term;
            term = termFactory.makeTuple(f_44, (IStrategoTerm)termFactory.makeListCons(ejp.constS23, termFactory.makeListCons(ejp.constFBOX19, termFactory.makeListCons(c_44, (IStrategoList)ejp.constNil0))));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail196;
            o_44 = term;
            term = p_44;
            IStrategoList list6;
            IStrategoList list5;
            list5 = checkListTail(h_44);
            if(list5 == null)
              break Fail196;
            list6 = checkListTail(o_44);
            if(list6 == null)
              break Fail196;
            term = termFactory.makeTuple(k_44, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(a_44, list6)}), list5));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail196;
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term});
            if(true)
              break Success139;
          }
          term = term144;
        }
        Success140:
        { 
          if(cons21 == transform._consIntertypeFieldDec_5)
          { 
            Fail197:
            { 
              IStrategoTerm p_43 = null;
              IStrategoTerm q_43 = null;
              IStrategoTerm r_43 = null;
              IStrategoTerm s_43 = null;
              IStrategoTerm t_43 = null;
              IStrategoTerm u_43 = null;
              IStrategoTerm v_43 = null;
              IStrategoTerm y_43 = null;
              IStrategoTerm z_43 = null;
              p_43 = term.getSubterm(0);
              q_43 = term.getSubterm(1);
              r_43 = term.getSubterm(2);
              t_43 = term.getSubterm(3);
              s_43 = term.getSubterm(4);
              v_43 = term;
              term = option_to_boxes_0_0.instance.invoke(context, t_43);
              if(term == null)
                break Fail197;
              u_43 = term;
              term = v_43;
              z_43 = term;
              term = termFactory.makeTuple(u_43, (IStrategoTerm)termFactory.makeListCons(ejp.constS23, termFactory.makeListCons(s_43, (IStrategoList)ejp.constCons30)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail197;
              y_43 = term;
              term = z_43;
              IStrategoList list7;
              list7 = checkListTail(y_43);
              if(list7 == null)
                break Fail197;
              term = termFactory.makeTuple(p_43, (IStrategoTerm)termFactory.makeListCons(q_43, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(r_43, list7)}), (IStrategoList)ejp.constNil0)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail197;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term});
              if(true)
                break Success140;
            }
            term = term144;
          }
          Success141:
          { 
            if(cons21 == transform._consAdviceDec_5)
            { 
              Fail198:
              { 
                IStrategoTerm e_43 = null;
                IStrategoTerm f_43 = null;
                IStrategoTerm g_43 = null;
                IStrategoTerm h_43 = null;
                IStrategoTerm i_43 = null;
                IStrategoTerm j_43 = null;
                IStrategoTerm k_43 = null;
                IStrategoTerm n_43 = null;
                IStrategoTerm o_43 = null;
                e_43 = term.getSubterm(0);
                f_43 = term.getSubterm(1);
                i_43 = term.getSubterm(2);
                g_43 = term.getSubterm(3);
                h_43 = term.getSubterm(4);
                k_43 = term;
                term = option_to_boxes_0_0.instance.invoke(context, i_43);
                if(term == null)
                  break Fail198;
                j_43 = term;
                term = k_43;
                o_43 = term;
                term = termFactory.makeTuple(j_43, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX21, termFactory.makeListCons(g_43, (IStrategoList)ejp.constNil0)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail198;
                n_43 = term;
                term = o_43;
                IStrategoList list8;
                list8 = checkListTail(n_43);
                if(list8 == null)
                  break Fail198;
                term = termFactory.makeTuple(e_43, (IStrategoTerm)termFactory.makeListCons(f_43, list8));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail198;
                term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{ejp.constCons36, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term}), termFactory.makeListCons(h_43, (IStrategoList)ejp.constNil0))});
                if(true)
                  break Success141;
              }
              term = term144;
            }
            Success142:
            { 
              if(cons21 == transform._consBefore_1)
              { 
                Fail199:
                { 
                  IStrategoTerm b_43 = null;
                  b_43 = term.getSubterm(0);
                  term = separate_by_comma_0_0.instance.invoke(context, b_43);
                  if(term == null)
                    break Fail199;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX24, termFactory.makeListCons(ejp.constFBOX23, termFactory.makeListCons(term, (IStrategoList)ejp.constCons37)))});
                  if(true)
                    break Success142;
                }
                term = term144;
              }
              Success143:
              { 
                if(cons21 == transform._consAfter_2)
                { 
                  Fail200:
                  { 
                    IStrategoTerm x_42 = null;
                    IStrategoTerm y_42 = null;
                    y_42 = term.getSubterm(0);
                    x_42 = term.getSubterm(1);
                    term = separate_by_comma_0_0.instance.invoke(context, y_42);
                    if(term == null)
                      break Fail200;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX25, termFactory.makeListCons(ejp.constFBOX23, termFactory.makeListCons(term, (IStrategoList)ejp.constCons37)))}), termFactory.makeListCons(x_42, (IStrategoList)ejp.constNil0))});
                    if(true)
                      break Success143;
                  }
                  term = term144;
                }
                Success144:
                { 
                  if(cons21 == transform._consAround_2)
                  { 
                    Fail201:
                    { 
                      IStrategoTerm t_42 = null;
                      IStrategoTerm u_42 = null;
                      t_42 = term.getSubterm(0);
                      u_42 = term.getSubterm(1);
                      term = separate_by_comma_0_0.instance.invoke(context, u_42);
                      if(term == null)
                        break Fail201;
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(t_42, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX26, termFactory.makeListCons(ejp.constFBOX23, termFactory.makeListCons(term, (IStrategoList)ejp.constCons37)))}), (IStrategoList)ejp.constNil0))});
                      if(true)
                        break Success144;
                    }
                    term = term144;
                  }
                  Success145:
                  { 
                    if(cons21 == transform._consReturning_0)
                    { 
                      Fail202:
                      { 
                        term = ejp.constFBOX27;
                        if(true)
                          break Success145;
                      }
                      term = term144;
                    }
                    Success146:
                    { 
                      if(cons21 == transform._consReturning_1)
                      { 
                        Fail203:
                        { 
                          IStrategoTerm s_42 = null;
                          s_42 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX27, termFactory.makeListCons(ejp.constFBOX23, termFactory.makeListCons(s_42, (IStrategoList)ejp.constCons37)))});
                          if(true)
                            break Success146;
                        }
                        term = term144;
                      }
                      Success147:
                      { 
                        if(cons21 == transform._consThrowing_0)
                        { 
                          Fail204:
                          { 
                            term = ejp.constFBOX28;
                            if(true)
                              break Success147;
                          }
                          term = term144;
                        }
                        Success148:
                        { 
                          if(cons21 == transform._consThrowing_1)
                          { 
                            Fail205:
                            { 
                              IStrategoTerm r_42 = null;
                              r_42 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX28, termFactory.makeListCons(ejp.constFBOX23, termFactory.makeListCons(r_42, (IStrategoList)ejp.constCons37)))});
                              if(true)
                                break Success148;
                            }
                            term = term144;
                          }
                          Success149:
                          { 
                            if(cons21 == transform._consDecParent_3)
                            { 
                              Fail206:
                              { 
                                IStrategoTerm m_42 = null;
                                IStrategoTerm n_42 = null;
                                IStrategoTerm o_42 = null;
                                m_42 = term.getSubterm(0);
                                n_42 = term.getSubterm(1);
                                o_42 = term.getSubterm(2);
                                term = termFactory.makeTuple(m_42, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX30, termFactory.makeListCons(ejp.constFBOX29, termFactory.makeListCons(ejp.constFBOX21, termFactory.makeListCons(n_42, termFactory.makeListCons(o_42, (IStrategoList)ejp.constCons38))))));
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail206;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term});
                                if(true)
                                  break Success149;
                              }
                              term = term144;
                            }
                            Success150:
                            { 
                              if(cons21 == transform._consDecWarning_3)
                              { 
                                Fail207:
                                { 
                                  IStrategoTerm h_42 = null;
                                  IStrategoTerm i_42 = null;
                                  IStrategoTerm j_42 = null;
                                  h_42 = term.getSubterm(0);
                                  i_42 = term.getSubterm(1);
                                  j_42 = term.getSubterm(2);
                                  term = termFactory.makeTuple(h_42, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX30, termFactory.makeListCons(ejp.constFBOX31, termFactory.makeListCons(ejp.constFBOX21, termFactory.makeListCons(i_42, termFactory.makeListCons(ejp.constFBOX21, termFactory.makeListCons(j_42, (IStrategoList)ejp.constCons38)))))));
                                  term = make$Conc_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail207;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term});
                                  if(true)
                                    break Success150;
                                }
                                term = term144;
                              }
                              term = aspectj_to_box_0_0_fragment_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail195;
                            }
                          }
                        }
                      }
                    }
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