package closure;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.java_front.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class transform  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm const106;

  protected static IStrategoTerm const105;

  protected static IStrategoTerm const104;

  protected static IStrategoTerm const103;

  protected static IStrategoTerm const102;

  protected static IStrategoTerm const101;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constId4;

  protected static IStrategoTerm const100;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm constId3;

  protected static IStrategoTerm const99;

  protected static IStrategoTerm const98;

  protected static IStrategoTerm const97;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm constMarkerAnno0;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constVoid0;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm constClassOrInterfaceType1;

  protected static IStrategoTerm constTypeName2;

  protected static IStrategoTerm constId2;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm const87;

  protected static IStrategoTerm const86;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm constChar0;

  protected static IStrategoTerm constByte0;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm constClassOrInterfaceType0;

  protected static IStrategoTerm constTypeName1;

  protected static IStrategoTerm constId1;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm constDouble0;

  protected static IStrategoTerm constBoolean0;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm constClassBody0;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constRefTypePattern0;

  protected static IStrategoTerm constNamePattern0;

  protected static IStrategoTerm constModPattern0;

  protected static IStrategoTerm constAnnoPattern0;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constSimpleAnnoPatternExact0;

  protected static IStrategoTerm constTypeName0;

  protected static IStrategoTerm constId0;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm constStatic0;

  protected static IStrategoTerm constNone0;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constFBOX47;

  protected static IStrategoTerm constS64;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm constFBOX46;

  protected static IStrategoTerm constS63;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm constFBOX45;

  protected static IStrategoTerm constS62;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm constFBOX44;

  protected static IStrategoTerm constS61;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm constFBOX43;

  protected static IStrategoTerm constS60;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm constCons17;

  protected static IStrategoTerm constSOpt4;

  protected static IStrategoTerm constCons16;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm constSOpt3;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constIS0;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constFBOX42;

  protected static IStrategoTerm constS59;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constFBOX41;

  protected static IStrategoTerm constS58;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constFBOX40;

  protected static IStrategoTerm constS57;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm constFBOX39;

  protected static IStrategoTerm constS56;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm constFBOX38;

  protected static IStrategoTerm constS55;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm constFBOX37;

  protected static IStrategoTerm constS54;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constFBOX36;

  protected static IStrategoTerm constS53;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constFBOX35;

  protected static IStrategoTerm constS52;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constS51;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constS50;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constS49;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm constS48;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm constFBOX34;

  protected static IStrategoTerm constS47;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm constFBOX33;

  protected static IStrategoTerm constS46;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm constFBOX32;

  protected static IStrategoTerm constS45;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm constFBOX31;

  protected static IStrategoTerm constS44;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constFBOX30;

  protected static IStrategoTerm constS43;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm constFBOX29;

  protected static IStrategoTerm constS42;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm constFBOX28;

  protected static IStrategoTerm constS41;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constFBOX27;

  protected static IStrategoTerm constS40;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm constFBOX26;

  protected static IStrategoTerm constS39;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm constFBOX25;

  protected static IStrategoTerm constS38;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm constFBOX24;

  protected static IStrategoTerm constS37;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm constFBOX23;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constFBOX22;

  protected static IStrategoTerm constFBOX21;

  protected static IStrategoTerm constCons11;

  protected static IStrategoTerm constSOpt2;

  protected static IStrategoTerm constVS0;

  protected static IStrategoTerm constS36;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm constS35;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm constS34;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constFBOX20;

  protected static IStrategoTerm constS33;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constS32;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm constCons10;

  protected static IStrategoTerm constCons9;

  protected static IStrategoTerm constCons8;

  protected static IStrategoTerm constFBOX19;

  protected static IStrategoTerm constS31;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm constS30;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm constCons7;

  protected static IStrategoTerm constS29;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constFBOX18;

  protected static IStrategoTerm constS28;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm constFBOX17;

  protected static IStrategoTerm constCons6;

  protected static IStrategoTerm constS27;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm constFBOX16;

  protected static IStrategoTerm constS26;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm constCons5;

  protected static IStrategoTerm constS25;

  protected static IStrategoTerm const27;

  protected static IStrategoTerm constFBOX15;

  protected static IStrategoTerm constS24;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm constCons4;

  protected static IStrategoTerm constSOpt1;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm constS23;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm constS22;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm constS21;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm constS20;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm constS19;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm constS18;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm constS17;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm constFBOX14;

  protected static IStrategoTerm constS16;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm constFBOX13;

  protected static IStrategoTerm constS15;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm constFBOX12;

  protected static IStrategoTerm constS14;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm constFBOX11;

  protected static IStrategoTerm constS13;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm constFBOX10;

  protected static IStrategoTerm constS12;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm constFBOX9;

  protected static IStrategoTerm constS11;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm constFBOX8;

  protected static IStrategoTerm constS10;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm constFBOX7;

  protected static IStrategoTerm constS9;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm constH0;

  protected static IStrategoTerm constCons3;

  protected static IStrategoTerm constFBOX6;

  protected static IStrategoTerm constS8;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm constCons2;

  protected static IStrategoTerm constFBOX5;

  protected static IStrategoTerm constS7;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm constFBOX4;

  protected static IStrategoTerm constS6;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm constFBOX3;

  protected static IStrategoTerm constS5;

  protected static IStrategoTerm const6;

  protected static IStrategoTerm constFBOX2;

  protected static IStrategoTerm constS4;

  protected static IStrategoTerm const5;

  protected static IStrategoTerm constFBOX1;

  protected static IStrategoTerm constS3;

  protected static IStrategoTerm const4;

  protected static IStrategoTerm constFBOX0;

  protected static IStrategoTerm constS2;

  protected static IStrategoTerm const3;

  protected static IStrategoTerm constKW0;

  protected static IStrategoTerm constS1;

  protected static IStrategoTerm const2;

  protected static IStrategoTerm constCons1;

  protected static IStrategoTerm constS0;

  protected static IStrategoTerm const1;

  protected static IStrategoTerm constCons0;

  protected static IStrategoTerm constSOpt0;

  protected static IStrategoTerm const0;

  protected static IStrategoTerm constHS0;

  protected static IStrategoTerm constNil0;

  public static IStrategoConstructor _consConc_2;

  protected static IStrategoConstructor _consIS_0;

  protected static IStrategoConstructor _consVS_0;

  protected static IStrategoConstructor _consV_2;

  protected static IStrategoConstructor _consKW_0;

  protected static IStrategoConstructor _consFBOX_2;

  protected static IStrategoConstructor _consS_1;

  protected static IStrategoConstructor _consHS_0;

  protected static IStrategoConstructor _consSOpt_2;

  protected static IStrategoConstructor _consH_2;

  public static IStrategoConstructor _consClosureJoinpoints_4;

  public static IStrategoConstructor _consShortClosureJoinpoints_2;

  public static IStrategoConstructor _consDecError_2;

  public static IStrategoConstructor _consDecSoft_2;

  public static IStrategoConstructor _consCJPAdvice_4;

  public static IStrategoConstructor _consRegularTypePattern_1;

  public static IStrategoConstructor _consSimpleAnnoPatternValue_2;

  public static IStrategoConstructor _consJoinpointDeclaration_4;

  public static IStrategoConstructor _consCJPBefore_2;

  public static IStrategoConstructor _consCJPAfter_2;

  public static IStrategoConstructor _consCJPAround_3;

  public static IStrategoConstructor _consNil_0;

  public static IStrategoConstructor _consPackageName_1;

  public static IStrategoConstructor _consPackageDec_2;

  public static IStrategoConstructor _consTypeImportOnDemandDec_1;

  public static IStrategoConstructor _consCompilationUnit_3;

  public static IStrategoConstructor _consDeci_1;

  public static IStrategoConstructor _consFloat_1;

  public static IStrategoConstructor _consChar_1;

  public static IStrategoConstructor _consString_1;

  public static IStrategoConstructor _consExprName_1;

  public static IStrategoConstructor _consMethodName_1;

  public static IStrategoConstructor _consMethodName_2;

  public static IStrategoConstructor _consClassOrInterfaceType_2;

  public static IStrategoConstructor _consLit_1;

  public static IStrategoConstructor _consNewInstance_4;

  public static IStrategoConstructor _consInvoke_2;

  public static IStrategoConstructor _consPlus_1;

  public static IStrategoConstructor _consMinus_1;

  public static IStrategoConstructor _consMul_2;

  public static IStrategoConstructor _consDiv_2;

  public static IStrategoConstructor _consRemain_2;

  public static IStrategoConstructor _consPlus_2;

  public static IStrategoConstructor _consMinus_2;

  public static IStrategoConstructor _consEq_2;

  public static IStrategoConstructor _consNotEq_2;

  public static IStrategoConstructor _consAssign_2;

  public static IStrategoConstructor _consFieldDec_3;

  public static IStrategoConstructor _consVarDec_1;

  public static IStrategoConstructor _consVarDec_2;

  public static IStrategoConstructor _consLocalVarDecStm_1;

  public static IStrategoConstructor _consLocalVarDec_3;

  public static IStrategoConstructor _consExprStm_1;

  public static IStrategoConstructor _consIf_2;

  public static IStrategoConstructor _consIf_3;

  public static IStrategoConstructor _consWhile_2;

  public static IStrategoConstructor _consDoWhile_2;

  public static IStrategoConstructor _consFor_4;

  public static IStrategoConstructor _consForEach_3;

  public static IStrategoConstructor _consReturn_1;

  public static IStrategoConstructor _consBlock_1;

  public static IStrategoConstructor _consMethodDec_2;

  public static IStrategoConstructor _consMethodDecHead_6;

  public static IStrategoConstructor _consParam_3;

  public static IStrategoConstructor _consVarArityParam_3;

  public static IStrategoConstructor _consNoMethodBody_0;

  public static IStrategoConstructor _consClassDec_2;

  public static IStrategoConstructor _consClassBody_1;

  public static IStrategoConstructor _consMethod_3;

  public static IStrategoConstructor _consMarkerAnno_1;

  public static IStrategoConstructor _consId_1;

  public static IStrategoConstructor _consPublic_0;

  public static IStrategoConstructor _consStatic_0;

  public static IStrategoConstructor _consBoolean_0;

  public static IStrategoConstructor _consByte_0;

  public static IStrategoConstructor _consShort_0;

  public static IStrategoConstructor _consInt_0;

  public static IStrategoConstructor _consLong_0;

  public static IStrategoConstructor _consChar_0;

  public static IStrategoConstructor _consFloat_0;

  public static IStrategoConstructor _consDouble_0;

  public static IStrategoConstructor _consTypeName_1;

  public static IStrategoConstructor _consDecParent_3;

  public static IStrategoConstructor _consDecWarning_3;

  public static IStrategoConstructor _consDecPrecedence_2;

  public static IStrategoConstructor _consDecAnno_4;

  public static IStrategoConstructor _consDecAnnoType_0;

  public static IStrategoConstructor _consDecAnnoConstructor_0;

  public static IStrategoConstructor _consDecAnnoMethod_0;

  public static IStrategoConstructor _consDecAnnoField_0;

  public static IStrategoConstructor _consAdviceDec_5;

  public static IStrategoConstructor _consBefore_1;

  public static IStrategoConstructor _consAfter_2;

  public static IStrategoConstructor _consAround_2;

  public static IStrategoConstructor _consReturning_0;

  public static IStrategoConstructor _consReturning_1;

  public static IStrategoConstructor _consThrowing_0;

  public static IStrategoConstructor _consThrowing_1;

  public static IStrategoConstructor _consIntertypeMethodDec_2;

  public static IStrategoConstructor _consIntertypeConstrDec_2;

  public static IStrategoConstructor _consIntertypeFieldDec_5;

  public static IStrategoConstructor _consIntertypeMethodDecHead_8;

  public static IStrategoConstructor _consIntertypeConstrDecHead_6;

  public static IStrategoConstructor _consAspectDec_2;

  public static IStrategoConstructor _consAspectDecHead_6;

  public static IStrategoConstructor _consPerTarget_1;

  public static IStrategoConstructor _consPerThis_1;

  public static IStrategoConstructor _consPerCFlow_1;

  public static IStrategoConstructor _consPerCFlowBelow_1;

  public static IStrategoConstructor _consPerTypeWithin_1;

  public static IStrategoConstructor _consIsSingleton_0;

  public static IStrategoConstructor _consAspectBody_1;

  public static IStrategoConstructor _consPrivileged_0;

  public static IStrategoConstructor _consSimpleNamePattern_1;

  public static IStrategoConstructor _consFormalWildcard_0;

  public static IStrategoConstructor _consVarArityParamPattern_1;

  public static IStrategoConstructor _consVoid_0;

  public static IStrategoConstructor _consGenericTypePattern_2;

  public static IStrategoConstructor _consGenericSubtypePattern_2;

  public static IStrategoConstructor _consNamePattern_1;

  public static IStrategoConstructor _consNamePattern_2;

  public static IStrategoConstructor _consWildcardNamePattern_2;

  public static IStrategoConstructor _consRefTypePattern_1;

  public static IStrategoConstructor _consPrimTypePattern_1;

  public static IStrategoConstructor _consAnnoTypePattern_2;

  public static IStrategoConstructor _consMethodPattern_6;

  public static IStrategoConstructor _consConstrPattern_5;

  public static IStrategoConstructor _consFieldPattern_4;

  public static IStrategoConstructor _consMemberName_1;

  public static IStrategoConstructor _consMemberName_2;

  public static IStrategoConstructor _consWildcardMemberName_2;

  public static IStrategoConstructor _consConstrName_0;

  public static IStrategoConstructor _consConstrName_1;

  public static IStrategoConstructor _consWildcardConstrName_1;

  public static IStrategoConstructor _consModPattern_1;

  public static IStrategoConstructor _consThrowsPattern_1;

  public static IStrategoConstructor _consNotThrowsCondition_1;

  public static IStrategoConstructor _consThrowsCondition_1;

  public static IStrategoConstructor _consSimpleAnnoPattern_1;

  public static IStrategoConstructor _consSimpleAnnoPatternExact_1;

  public static IStrategoConstructor _consNot_1;

  public static IStrategoConstructor _consAnnoPattern_1;

  public static IStrategoConstructor _consPointcutDec_2;

  public static IStrategoConstructor _consPointcutDecHead_3;

  public static IStrategoConstructor _consPointcutBody_1;

  public static IStrategoConstructor _consNoPointcutBody_0;

  public static IStrategoConstructor _consNotComp_1;

  public static IStrategoConstructor _consAndComp_2;

  public static IStrategoConstructor _consOrComp_2;

  public static IStrategoConstructor _consCall_1;

  public static IStrategoConstructor _consExec_1;

  public static IStrategoConstructor _consInitExec_1;

  public static IStrategoConstructor _consPreInitExec_1;

  public static IStrategoConstructor _consStaticInitExec_1;

  public static IStrategoConstructor _consGetField_1;

  public static IStrategoConstructor _consSetField_1;

  public static IStrategoConstructor _consHandler_1;

  public static IStrategoConstructor _consAdviceExec_0;

  public static IStrategoConstructor _consWithin_1;

  public static IStrategoConstructor _consWithinCode_1;

  public static IStrategoConstructor _consCFlow_1;

  public static IStrategoConstructor _consCFlowBelow_1;

  public static IStrategoConstructor _consIf_1;

  public static IStrategoConstructor _consThis_1;

  public static IStrategoConstructor _consTarget_1;

  public static IStrategoConstructor _consArgs_1;

  public static IStrategoConstructor _consAtThis_1;

  public static IStrategoConstructor _consAtTarget_1;

  public static IStrategoConstructor _consAtWithin_1;

  public static IStrategoConstructor _consAtWithinCode_1;

  public static IStrategoConstructor _consAtAnno_1;

  public static IStrategoConstructor _consAtArgs_1;

  public static IStrategoConstructor _consNamedPointcut_2;

  public static IStrategoConstructor _consPointcutName_1;

  public static IStrategoConstructor _consPointcutName_2;

  public static IStrategoConstructor _consWildcard_0;

  public static IStrategoConstructor _consDotWildcard_0;

  public static IStrategoConstructor _consSubtype_1;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _consCons_2;

  public static IStrategoConstructor _consProceed_0;

  public static Context init(Context context)
  { 
    synchronized(transform.class)
    { 
      if(isIniting)
        return null;
      try
      { 
        isIniting = true;
        ITermFactory termFactory = context.getFactory();
        if(constantFactory == null)
        { 
          initConstructors(termFactory);
          initConstants(termFactory);
        }
        if(initedContext == null || initedContext.get() != context)
        { 
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.java_front.Main.init(context);
          org.strategoxt.stratego_gpp.Main.init(context);
          context.registerComponent("transform");
        }
        initedContext = new WeakReference<Context>(context);
        constantFactory = termFactory;
      }
      finally
      { 
        isIniting = false;
      }
      return context;
    }
  }

  public static Context init()
  { 
    return init(new Context());
  }

  public static void main(String args[])
  { 
    Context context = init();
    context.setStandAlone(true);
    try
    { 
      IStrategoTerm result;
      try
      { 
        result = context.invokeStrategyCLI(main_0_0.instance, "transform", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("transform" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
        context.printStackTrace();
        context.setStandAlone(false);
        System.exit(1);
      }
      else
      { 
        System.out.println(result);
        context.setStandAlone(false);
        System.exit(0);
      }
    }
    catch(StrategoExit exit)
    { 
      context.setStandAlone(false);
      System.exit(exit.getValue());
    }
  }

  public static IStrategoTerm mainNoExit(String ... args) throws StrategoExit
  { 
    return mainNoExit(new Context(), args);
  }

  public static IStrategoTerm mainNoExit(Context context, String ... args) throws StrategoExit
  { 
    try
    { 
      init(context);
      return context.invokeStrategyCLI(main_0_0.instance, "transform", args);
    }
    finally
    { 
      context.getIOAgent().closeAllFiles();
    }
  }

  public static Strategy getMainStrategy()
  { 
    return main_0_0.instance;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consIS_0 = termFactory.makeConstructor("IS", 0);
    _consVS_0 = termFactory.makeConstructor("VS", 0);
    _consV_2 = termFactory.makeConstructor("V", 2);
    _consKW_0 = termFactory.makeConstructor("KW", 0);
    _consFBOX_2 = termFactory.makeConstructor("FBOX", 2);
    _consS_1 = termFactory.makeConstructor("S", 1);
    _consHS_0 = termFactory.makeConstructor("HS", 0);
    _consSOpt_2 = termFactory.makeConstructor("SOpt", 2);
    _consH_2 = termFactory.makeConstructor("H", 2);
    _consClosureJoinpoints_4 = termFactory.makeConstructor("ClosureJoinpoints", 4);
    _consShortClosureJoinpoints_2 = termFactory.makeConstructor("ShortClosureJoinpoints", 2);
    _consDecError_2 = termFactory.makeConstructor("DecError", 2);
    _consDecSoft_2 = termFactory.makeConstructor("DecSoft", 2);
    _consCJPAdvice_4 = termFactory.makeConstructor("CJPAdvice", 4);
    _consRegularTypePattern_1 = termFactory.makeConstructor("RegularTypePattern", 1);
    _consSimpleAnnoPatternValue_2 = termFactory.makeConstructor("SimpleAnnoPatternValue", 2);
    _consJoinpointDeclaration_4 = termFactory.makeConstructor("JoinpointDeclaration", 4);
    _consCJPBefore_2 = termFactory.makeConstructor("CJPBefore", 2);
    _consCJPAfter_2 = termFactory.makeConstructor("CJPAfter", 2);
    _consCJPAround_3 = termFactory.makeConstructor("CJPAround", 3);
    _consNil_0 = termFactory.makeConstructor("Nil", 0);
    _consPackageName_1 = termFactory.makeConstructor("PackageName", 1);
    _consPackageDec_2 = termFactory.makeConstructor("PackageDec", 2);
    _consTypeImportOnDemandDec_1 = termFactory.makeConstructor("TypeImportOnDemandDec", 1);
    _consCompilationUnit_3 = termFactory.makeConstructor("CompilationUnit", 3);
    _consDeci_1 = termFactory.makeConstructor("Deci", 1);
    _consFloat_1 = termFactory.makeConstructor("Float", 1);
    _consChar_1 = termFactory.makeConstructor("Char", 1);
    _consString_1 = termFactory.makeConstructor("String", 1);
    _consExprName_1 = termFactory.makeConstructor("ExprName", 1);
    _consMethodName_1 = termFactory.makeConstructor("MethodName", 1);
    _consMethodName_2 = termFactory.makeConstructor("MethodName", 2);
    _consClassOrInterfaceType_2 = termFactory.makeConstructor("ClassOrInterfaceType", 2);
    _consLit_1 = termFactory.makeConstructor("Lit", 1);
    _consNewInstance_4 = termFactory.makeConstructor("NewInstance", 4);
    _consInvoke_2 = termFactory.makeConstructor("Invoke", 2);
    _consPlus_1 = termFactory.makeConstructor("Plus", 1);
    _consMinus_1 = termFactory.makeConstructor("Minus", 1);
    _consMul_2 = termFactory.makeConstructor("Mul", 2);
    _consDiv_2 = termFactory.makeConstructor("Div", 2);
    _consRemain_2 = termFactory.makeConstructor("Remain", 2);
    _consPlus_2 = termFactory.makeConstructor("Plus", 2);
    _consMinus_2 = termFactory.makeConstructor("Minus", 2);
    _consEq_2 = termFactory.makeConstructor("Eq", 2);
    _consNotEq_2 = termFactory.makeConstructor("NotEq", 2);
    _consAssign_2 = termFactory.makeConstructor("Assign", 2);
    _consFieldDec_3 = termFactory.makeConstructor("FieldDec", 3);
    _consVarDec_1 = termFactory.makeConstructor("VarDec", 1);
    _consVarDec_2 = termFactory.makeConstructor("VarDec", 2);
    _consLocalVarDecStm_1 = termFactory.makeConstructor("LocalVarDecStm", 1);
    _consLocalVarDec_3 = termFactory.makeConstructor("LocalVarDec", 3);
    _consExprStm_1 = termFactory.makeConstructor("ExprStm", 1);
    _consIf_2 = termFactory.makeConstructor("If", 2);
    _consIf_3 = termFactory.makeConstructor("If", 3);
    _consWhile_2 = termFactory.makeConstructor("While", 2);
    _consDoWhile_2 = termFactory.makeConstructor("DoWhile", 2);
    _consFor_4 = termFactory.makeConstructor("For", 4);
    _consForEach_3 = termFactory.makeConstructor("ForEach", 3);
    _consReturn_1 = termFactory.makeConstructor("Return", 1);
    _consBlock_1 = termFactory.makeConstructor("Block", 1);
    _consMethodDec_2 = termFactory.makeConstructor("MethodDec", 2);
    _consMethodDecHead_6 = termFactory.makeConstructor("MethodDecHead", 6);
    _consParam_3 = termFactory.makeConstructor("Param", 3);
    _consVarArityParam_3 = termFactory.makeConstructor("VarArityParam", 3);
    _consNoMethodBody_0 = termFactory.makeConstructor("NoMethodBody", 0);
    _consClassDec_2 = termFactory.makeConstructor("ClassDec", 2);
    _consClassBody_1 = termFactory.makeConstructor("ClassBody", 1);
    _consMethod_3 = termFactory.makeConstructor("Method", 3);
    _consMarkerAnno_1 = termFactory.makeConstructor("MarkerAnno", 1);
    _consId_1 = termFactory.makeConstructor("Id", 1);
    _consPublic_0 = termFactory.makeConstructor("Public", 0);
    _consStatic_0 = termFactory.makeConstructor("Static", 0);
    _consBoolean_0 = termFactory.makeConstructor("Boolean", 0);
    _consByte_0 = termFactory.makeConstructor("Byte", 0);
    _consShort_0 = termFactory.makeConstructor("Short", 0);
    _consInt_0 = termFactory.makeConstructor("Int", 0);
    _consLong_0 = termFactory.makeConstructor("Long", 0);
    _consChar_0 = termFactory.makeConstructor("Char", 0);
    _consFloat_0 = termFactory.makeConstructor("Float", 0);
    _consDouble_0 = termFactory.makeConstructor("Double", 0);
    _consTypeName_1 = termFactory.makeConstructor("TypeName", 1);
    _consDecParent_3 = termFactory.makeConstructor("DecParent", 3);
    _consDecWarning_3 = termFactory.makeConstructor("DecWarning", 3);
    _consDecPrecedence_2 = termFactory.makeConstructor("DecPrecedence", 2);
    _consDecAnno_4 = termFactory.makeConstructor("DecAnno", 4);
    _consDecAnnoType_0 = termFactory.makeConstructor("DecAnnoType", 0);
    _consDecAnnoConstructor_0 = termFactory.makeConstructor("DecAnnoConstructor", 0);
    _consDecAnnoMethod_0 = termFactory.makeConstructor("DecAnnoMethod", 0);
    _consDecAnnoField_0 = termFactory.makeConstructor("DecAnnoField", 0);
    _consAdviceDec_5 = termFactory.makeConstructor("AdviceDec", 5);
    _consBefore_1 = termFactory.makeConstructor("Before", 1);
    _consAfter_2 = termFactory.makeConstructor("After", 2);
    _consAround_2 = termFactory.makeConstructor("Around", 2);
    _consReturning_0 = termFactory.makeConstructor("Returning", 0);
    _consReturning_1 = termFactory.makeConstructor("Returning", 1);
    _consThrowing_0 = termFactory.makeConstructor("Throwing", 0);
    _consThrowing_1 = termFactory.makeConstructor("Throwing", 1);
    _consIntertypeMethodDec_2 = termFactory.makeConstructor("IntertypeMethodDec", 2);
    _consIntertypeConstrDec_2 = termFactory.makeConstructor("IntertypeConstrDec", 2);
    _consIntertypeFieldDec_5 = termFactory.makeConstructor("IntertypeFieldDec", 5);
    _consIntertypeMethodDecHead_8 = termFactory.makeConstructor("IntertypeMethodDecHead", 8);
    _consIntertypeConstrDecHead_6 = termFactory.makeConstructor("IntertypeConstrDecHead", 6);
    _consAspectDec_2 = termFactory.makeConstructor("AspectDec", 2);
    _consAspectDecHead_6 = termFactory.makeConstructor("AspectDecHead", 6);
    _consPerTarget_1 = termFactory.makeConstructor("PerTarget", 1);
    _consPerThis_1 = termFactory.makeConstructor("PerThis", 1);
    _consPerCFlow_1 = termFactory.makeConstructor("PerCFlow", 1);
    _consPerCFlowBelow_1 = termFactory.makeConstructor("PerCFlowBelow", 1);
    _consPerTypeWithin_1 = termFactory.makeConstructor("PerTypeWithin", 1);
    _consIsSingleton_0 = termFactory.makeConstructor("IsSingleton", 0);
    _consAspectBody_1 = termFactory.makeConstructor("AspectBody", 1);
    _consPrivileged_0 = termFactory.makeConstructor("Privileged", 0);
    _consSimpleNamePattern_1 = termFactory.makeConstructor("SimpleNamePattern", 1);
    _consFormalWildcard_0 = termFactory.makeConstructor("FormalWildcard", 0);
    _consVarArityParamPattern_1 = termFactory.makeConstructor("VarArityParamPattern", 1);
    _consVoid_0 = termFactory.makeConstructor("Void", 0);
    _consGenericTypePattern_2 = termFactory.makeConstructor("GenericTypePattern", 2);
    _consGenericSubtypePattern_2 = termFactory.makeConstructor("GenericSubtypePattern", 2);
    _consNamePattern_1 = termFactory.makeConstructor("NamePattern", 1);
    _consNamePattern_2 = termFactory.makeConstructor("NamePattern", 2);
    _consWildcardNamePattern_2 = termFactory.makeConstructor("WildcardNamePattern", 2);
    _consRefTypePattern_1 = termFactory.makeConstructor("RefTypePattern", 1);
    _consPrimTypePattern_1 = termFactory.makeConstructor("PrimTypePattern", 1);
    _consAnnoTypePattern_2 = termFactory.makeConstructor("AnnoTypePattern", 2);
    _consMethodPattern_6 = termFactory.makeConstructor("MethodPattern", 6);
    _consConstrPattern_5 = termFactory.makeConstructor("ConstrPattern", 5);
    _consFieldPattern_4 = termFactory.makeConstructor("FieldPattern", 4);
    _consMemberName_1 = termFactory.makeConstructor("MemberName", 1);
    _consMemberName_2 = termFactory.makeConstructor("MemberName", 2);
    _consWildcardMemberName_2 = termFactory.makeConstructor("WildcardMemberName", 2);
    _consConstrName_0 = termFactory.makeConstructor("ConstrName", 0);
    _consConstrName_1 = termFactory.makeConstructor("ConstrName", 1);
    _consWildcardConstrName_1 = termFactory.makeConstructor("WildcardConstrName", 1);
    _consModPattern_1 = termFactory.makeConstructor("ModPattern", 1);
    _consThrowsPattern_1 = termFactory.makeConstructor("ThrowsPattern", 1);
    _consNotThrowsCondition_1 = termFactory.makeConstructor("NotThrowsCondition", 1);
    _consThrowsCondition_1 = termFactory.makeConstructor("ThrowsCondition", 1);
    _consSimpleAnnoPattern_1 = termFactory.makeConstructor("SimpleAnnoPattern", 1);
    _consSimpleAnnoPatternExact_1 = termFactory.makeConstructor("SimpleAnnoPatternExact", 1);
    _consNot_1 = termFactory.makeConstructor("Not", 1);
    _consAnnoPattern_1 = termFactory.makeConstructor("AnnoPattern", 1);
    _consPointcutDec_2 = termFactory.makeConstructor("PointcutDec", 2);
    _consPointcutDecHead_3 = termFactory.makeConstructor("PointcutDecHead", 3);
    _consPointcutBody_1 = termFactory.makeConstructor("PointcutBody", 1);
    _consNoPointcutBody_0 = termFactory.makeConstructor("NoPointcutBody", 0);
    _consNotComp_1 = termFactory.makeConstructor("NotComp", 1);
    _consAndComp_2 = termFactory.makeConstructor("AndComp", 2);
    _consOrComp_2 = termFactory.makeConstructor("OrComp", 2);
    _consCall_1 = termFactory.makeConstructor("Call", 1);
    _consExec_1 = termFactory.makeConstructor("Exec", 1);
    _consInitExec_1 = termFactory.makeConstructor("InitExec", 1);
    _consPreInitExec_1 = termFactory.makeConstructor("PreInitExec", 1);
    _consStaticInitExec_1 = termFactory.makeConstructor("StaticInitExec", 1);
    _consGetField_1 = termFactory.makeConstructor("GetField", 1);
    _consSetField_1 = termFactory.makeConstructor("SetField", 1);
    _consHandler_1 = termFactory.makeConstructor("Handler", 1);
    _consAdviceExec_0 = termFactory.makeConstructor("AdviceExec", 0);
    _consWithin_1 = termFactory.makeConstructor("Within", 1);
    _consWithinCode_1 = termFactory.makeConstructor("WithinCode", 1);
    _consCFlow_1 = termFactory.makeConstructor("CFlow", 1);
    _consCFlowBelow_1 = termFactory.makeConstructor("CFlowBelow", 1);
    _consIf_1 = termFactory.makeConstructor("If", 1);
    _consThis_1 = termFactory.makeConstructor("This", 1);
    _consTarget_1 = termFactory.makeConstructor("Target", 1);
    _consArgs_1 = termFactory.makeConstructor("Args", 1);
    _consAtThis_1 = termFactory.makeConstructor("AtThis", 1);
    _consAtTarget_1 = termFactory.makeConstructor("AtTarget", 1);
    _consAtWithin_1 = termFactory.makeConstructor("AtWithin", 1);
    _consAtWithinCode_1 = termFactory.makeConstructor("AtWithinCode", 1);
    _consAtAnno_1 = termFactory.makeConstructor("AtAnno", 1);
    _consAtArgs_1 = termFactory.makeConstructor("AtArgs", 1);
    _consNamedPointcut_2 = termFactory.makeConstructor("NamedPointcut", 2);
    _consPointcutName_1 = termFactory.makeConstructor("PointcutName", 1);
    _consPointcutName_2 = termFactory.makeConstructor("PointcutName", 2);
    _consWildcard_0 = termFactory.makeConstructor("Wildcard", 0);
    _consDotWildcard_0 = termFactory.makeConstructor("DotWildcard", 0);
    _consSubtype_1 = termFactory.makeConstructor("Subtype", 1);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consCons_2 = termFactory.makeConstructor("Cons", 2);
    _consProceed_0 = termFactory.makeConstructor("Proceed", 0);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    constHS0 = termFactory.makeAppl(transform._consHS_0, NO_TERMS);
    const0 = termFactory.makeString("0");
    constSOpt0 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constHS0, transform.const0});
    constCons0 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt0, (IStrategoList)transform.constNil0);
    const1 = termFactory.makeString(")");
    constS0 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const1});
    constCons1 = (IStrategoTerm)termFactory.makeListCons(transform.constS0, (IStrategoList)transform.constNil0);
    const2 = termFactory.makeString("(");
    constS1 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const2});
    constKW0 = termFactory.makeAppl(transform._consKW_0, NO_TERMS);
    const3 = termFactory.makeString("initialization");
    constS2 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const3});
    constFBOX0 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS2});
    const4 = termFactory.makeString("preinitialization");
    constS3 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const4});
    constFBOX1 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS3});
    const5 = termFactory.makeString("staticinitialization");
    constS4 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const5});
    constFBOX2 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS4});
    const6 = termFactory.makeString("get");
    constS5 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const6});
    constFBOX3 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS5});
    const7 = termFactory.makeString("set");
    constS6 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const7});
    constFBOX4 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS6});
    const8 = termFactory.makeString("handler");
    constS7 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const8});
    constFBOX5 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS7});
    constCons2 = (IStrategoTerm)termFactory.makeListCons(transform.constS1, (IStrategoList)transform.constCons1);
    const9 = termFactory.makeString("adviceexecution");
    constS8 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const9});
    constFBOX6 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS8});
    constCons3 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX6, (IStrategoList)transform.constCons2);
    constH0 = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, transform.constCons3});
    const10 = termFactory.makeString("within");
    constS9 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const10});
    constFBOX7 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS9});
    const11 = termFactory.makeString("withincode");
    constS10 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const11});
    constFBOX8 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS10});
    const12 = termFactory.makeString("cflow");
    constS11 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const12});
    constFBOX9 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS11});
    const13 = termFactory.makeString("cflowbelow");
    constS12 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const13});
    constFBOX10 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS12});
    const14 = termFactory.makeString("if");
    constS13 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const14});
    constFBOX11 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS13});
    const15 = termFactory.makeString("this");
    constS14 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const15});
    constFBOX12 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS14});
    const16 = termFactory.makeString("target");
    constS15 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const16});
    constFBOX13 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS15});
    const17 = termFactory.makeString("args");
    constS16 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const17});
    constFBOX14 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS16});
    const18 = termFactory.makeString("@this");
    constS17 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const18});
    const19 = termFactory.makeString("@target");
    constS18 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const19});
    const20 = termFactory.makeString("@within");
    constS19 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const20});
    const21 = termFactory.makeString("@withincode");
    constS20 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const21});
    const22 = termFactory.makeString("@annotation");
    constS21 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const22});
    const23 = termFactory.makeString("@args");
    constS22 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const23});
    const24 = termFactory.makeString(".");
    constS23 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const24});
    const25 = termFactory.makeString("1");
    constSOpt1 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constHS0, transform.const25});
    constCons4 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt1, (IStrategoList)transform.constNil0);
    const26 = termFactory.makeString("pointcut");
    constS24 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const26});
    constFBOX15 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS24});
    const27 = termFactory.makeString(";");
    constS25 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const27});
    constCons5 = (IStrategoTerm)termFactory.makeListCons(transform.constS25, (IStrategoList)transform.constNil0);
    const28 = termFactory.makeString(":");
    constS26 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const28});
    constFBOX16 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS25});
    const29 = termFactory.makeString("+");
    constS27 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const29});
    constCons6 = (IStrategoTerm)termFactory.makeListCons(transform.constS27, (IStrategoList)transform.constNil0);
    constFBOX17 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS23});
    const30 = termFactory.makeString("..");
    constS28 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const30});
    constFBOX18 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS28});
    const31 = termFactory.makeString("...");
    constS29 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const31});
    constCons7 = (IStrategoTerm)termFactory.makeListCons(transform.constS29, (IStrategoList)transform.constNil0);
    const32 = termFactory.makeString("*");
    constS30 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const32});
    const33 = termFactory.makeString("new");
    constS31 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const33});
    constFBOX19 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS31});
    constCons8 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX19, (IStrategoList)transform.constNil0);
    constCons9 = (IStrategoTerm)termFactory.makeListCons(transform.constS23, (IStrategoList)transform.constCons8);
    constCons10 = (IStrategoTerm)termFactory.makeListCons(transform.constS28, (IStrategoList)transform.constCons8);
    const34 = termFactory.makeString("!");
    constS32 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const34});
    const35 = termFactory.makeString("throws");
    constS33 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const35});
    constFBOX20 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS33});
    const36 = termFactory.makeString("@");
    constS34 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const36});
    const37 = termFactory.makeString("&&");
    constS35 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const37});
    const38 = termFactory.makeString("||");
    constS36 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const38});
    constVS0 = termFactory.makeAppl(transform._consVS_0, NO_TERMS);
    constSOpt2 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constVS0, transform.const0});
    constCons11 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt2, (IStrategoList)transform.constNil0);
    constFBOX21 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS26});
    constFBOX22 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS0});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX22, (IStrategoList)transform.constNil0);
    constFBOX23 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS1});
    const39 = termFactory.makeString("before");
    constS37 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const39});
    constFBOX24 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS37});
    const40 = termFactory.makeString("after");
    constS38 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const40});
    constFBOX25 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS38});
    const41 = termFactory.makeString("around");
    constS39 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const41});
    constFBOX26 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS39});
    const42 = termFactory.makeString("returning");
    constS40 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const42});
    constFBOX27 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS40});
    const43 = termFactory.makeString("throwing");
    constS41 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const43});
    constFBOX28 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS41});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX16, (IStrategoList)transform.constNil0);
    const44 = termFactory.makeString("parents");
    constS42 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const44});
    constFBOX29 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS42});
    const45 = termFactory.makeString("declare");
    constS43 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const45});
    constFBOX30 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS43});
    const46 = termFactory.makeString("warning");
    constS44 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const46});
    constFBOX31 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS44});
    const47 = termFactory.makeString("error");
    constS45 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const47});
    constFBOX32 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS45});
    const48 = termFactory.makeString("soft");
    constS46 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const48});
    constFBOX33 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS46});
    const49 = termFactory.makeString("precedence");
    constS47 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const49});
    constFBOX34 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS47});
    const50 = termFactory.makeString("@type");
    constS48 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const50});
    const51 = termFactory.makeString("@constructor");
    constS49 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const51});
    const52 = termFactory.makeString("@method");
    constS50 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const52});
    const53 = termFactory.makeString("@field");
    constS51 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const53});
    const54 = termFactory.makeString("aspect");
    constS52 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const54});
    constFBOX35 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS52});
    const55 = termFactory.makeString("pertarget");
    constS53 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const55});
    constFBOX36 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS53});
    const56 = termFactory.makeString("perthis");
    constS54 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const56});
    constFBOX37 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS54});
    const57 = termFactory.makeString("percflow");
    constS55 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const57});
    constFBOX38 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS55});
    const58 = termFactory.makeString("percflowbelow");
    constS56 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const58});
    constFBOX39 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS56});
    const59 = termFactory.makeString("pertypewithin");
    constS57 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const59});
    constFBOX40 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS57});
    const60 = termFactory.makeString("issingleton");
    constS58 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const60});
    constFBOX41 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS58});
    const61 = termFactory.makeString("}");
    constS59 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const61});
    constFBOX42 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS59});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX42, (IStrategoList)transform.constNil0);
    constIS0 = termFactory.makeAppl(transform._consIS_0, NO_TERMS);
    const62 = termFactory.makeString("2");
    constSOpt3 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constIS0, transform.const62});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt3, (IStrategoList)transform.constNil0);
    constCons16 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt2, (IStrategoList)transform.constCons15);
    constSOpt4 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constVS0, transform.const25});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt4, (IStrategoList)transform.constNil0);
    const63 = termFactory.makeString("{");
    constS60 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const63});
    constFBOX43 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS60});
    const64 = termFactory.makeString("privileged");
    constS61 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const64});
    constFBOX44 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS61});
    const65 = termFactory.makeString("proceed");
    constS62 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const65});
    constFBOX45 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS62});
    const66 = termFactory.makeString("call");
    constS63 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const66});
    constFBOX46 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS63});
    const67 = termFactory.makeString("execution");
    constS64 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const67});
    constFBOX47 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS64});
    const68 = termFactory.makeInt(80);
    constNone0 = termFactory.makeAppl(transform._consNone_0, NO_TERMS);
    constStatic0 = termFactory.makeAppl(transform._consStatic_0, NO_TERMS);
    constCons18 = (IStrategoTerm)termFactory.makeListCons(transform.constStatic0, (IStrategoList)transform.constNil0);
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons19 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constCons18);
    constBlock0 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constNil0});
    const69 = termFactory.makeString("Closure");
    constId0 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const69});
    constTypeName0 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId0});
    constSimpleAnnoPatternExact0 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{transform.constTypeName0});
    constCons20 = (IStrategoTerm)termFactory.makeListCons(transform.constSimpleAnnoPatternExact0, (IStrategoList)transform.constNil0);
    constAnnoPattern0 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons20});
    constModPattern0 = termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{transform.constNil0});
    constNamePattern0 = termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{transform.const32});
    constRefTypePattern0 = termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{transform.constNamePattern0});
    const70 = termFactory.makeString("in replace");
    const71 = termFactory.makeString("in block");
    const72 = termFactory.makeString("LocalVarDecStm");
    const73 = termFactory.makeString("in methodDec");
    const74 = termFactory.makeString("in VarDec X 2");
    const75 = termFactory.makeString("short closure");
    const76 = termFactory.makeString("closure");
    const77 = termFactory.makeString("assign");
    const78 = termFactory.makeString("otherwise");
    constClassBody0 = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{transform.constNil0});
    const79 = termFactory.makeString("discover-return-type");
    const80 = termFactory.makeString("at discover-return-type-impl");
    constBoolean0 = termFactory.makeAppl(transform._consBoolean_0, NO_TERMS);
    constDouble0 = termFactory.makeAppl(transform._consDouble_0, NO_TERMS);
    const81 = termFactory.makeString("String");
    constId1 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const81});
    constTypeName1 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId1});
    constClassOrInterfaceType0 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName1, transform.constNone0});
    const82 = termFactory.makeString("at get-type-from-return-stmt#otherwise");
    constByte0 = termFactory.makeAppl(transform._consByte_0, NO_TERMS);
    constChar0 = termFactory.makeAppl(transform._consChar_0, NO_TERMS);
    const83 = termFactory.makeString("cast-return-type#otherwise");
    const84 = termFactory.makeString("1111");
    const85 = termFactory.makeString("22222");
    const86 = termFactory.makeString("3333");
    const87 = termFactory.makeString("4444");
    const88 = termFactory.makeString("Object");
    constId2 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const88});
    constTypeName2 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId2});
    constClassOrInterfaceType1 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName2, transform.constNone0});
    const89 = termFactory.makeString("5555");
    const90 = termFactory.makeString("66666");
    const91 = termFactory.makeString("7777");
    const92 = termFactory.makeString("8888");
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    const93 = termFactory.makeString("in closures..");
    constCons21 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constNil0);
    constMarkerAnno0 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName0});
    constCons22 = (IStrategoTerm)termFactory.makeListCons(transform.constMarkerAnno0, (IStrategoList)transform.constCons21);
    const94 = termFactory.makeString("in short closures..");
    const95 = termFactory.makeString("w");
    const96 = termFactory.makeString("bbb");
    const97 = termFactory.makeString("ccc");
    const98 = termFactory.makeString("dddd");
    const99 = termFactory.makeString("runtime");
    constId3 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const99});
    constCons23 = (IStrategoTerm)termFactory.makeListCons(transform.constId3, (IStrategoList)transform.constNil0);
    const100 = termFactory.makeString("closures");
    constId4 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const100});
    constCons24 = (IStrategoTerm)termFactory.makeListCons(transform.constId4, (IStrategoList)transform.constCons23);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons24});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName0});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec0, (IStrategoList)transform.constNil0);
    const101 = termFactory.makeString("eee");
    const102 = termFactory.makeString("fff");
    const103 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'closures-converter-compilation-unit'");
    const104 = termFactory.makeString("aaaa");
    const105 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'check-for-change-in-aspect-or-class'");
    const106 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'closures-converter-aspect-or-class'");
  }

  @SuppressWarnings("all") public static class aspectj_to_box_0_0_fragment_4 extends Strategy 
  { 
    public static aspectj_to_box_0_0_fragment_4 instance = new aspectj_to_box_0_0_fragment_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0_fragment_4");
      Fail0:
      { 
        IStrategoTerm term0 = term;
        IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success0:
        { 
          if(cons0 == transform._consInitExec_1)
          { 
            Fail1:
            { 
              IStrategoTerm a_21 = null;
              a_21 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX0, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(a_21, (IStrategoList)transform.constCons1)))});
              if(true)
                break Success0;
            }
            term = term0;
          }
          Success1:
          { 
            if(cons0 == transform._consPreInitExec_1)
            { 
              Fail2:
              { 
                IStrategoTerm z_20 = null;
                z_20 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX1, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(z_20, (IStrategoList)transform.constCons1)))});
                if(true)
                  break Success1;
              }
              term = term0;
            }
            Success2:
            { 
              if(cons0 == transform._consStaticInitExec_1)
              { 
                Fail3:
                { 
                  IStrategoTerm y_20 = null;
                  y_20 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX2, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(y_20, (IStrategoList)transform.constCons1)))});
                  if(true)
                    break Success2;
                }
                term = term0;
              }
              Success3:
              { 
                if(cons0 == transform._consGetField_1)
                { 
                  Fail4:
                  { 
                    IStrategoTerm x_20 = null;
                    x_20 = term.getSubterm(0);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX3, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(x_20, (IStrategoList)transform.constCons1)))});
                    if(true)
                      break Success3;
                  }
                  term = term0;
                }
                Success4:
                { 
                  if(cons0 == transform._consSetField_1)
                  { 
                    Fail5:
                    { 
                      IStrategoTerm w_20 = null;
                      w_20 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX4, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(w_20, (IStrategoList)transform.constCons1)))});
                      if(true)
                        break Success4;
                    }
                    term = term0;
                  }
                  Success5:
                  { 
                    if(cons0 == transform._consHandler_1)
                    { 
                      Fail6:
                      { 
                        IStrategoTerm v_20 = null;
                        v_20 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX5, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(v_20, (IStrategoList)transform.constCons1)))});
                        if(true)
                          break Success5;
                      }
                      term = term0;
                    }
                    Success6:
                    { 
                      if(cons0 == transform._consAdviceExec_0)
                      { 
                        Fail7:
                        { 
                          term = transform.constH0;
                          if(true)
                            break Success6;
                        }
                        term = term0;
                      }
                      Success7:
                      { 
                        if(cons0 == transform._consWithin_1)
                        { 
                          Fail8:
                          { 
                            IStrategoTerm u_20 = null;
                            u_20 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX7, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(u_20, (IStrategoList)transform.constCons1)))});
                            if(true)
                              break Success7;
                          }
                          term = term0;
                        }
                        Success8:
                        { 
                          if(cons0 == transform._consWithinCode_1)
                          { 
                            Fail9:
                            { 
                              IStrategoTerm t_20 = null;
                              t_20 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX8, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(t_20, (IStrategoList)transform.constCons1)))});
                              if(true)
                                break Success8;
                            }
                            term = term0;
                          }
                          Success9:
                          { 
                            if(cons0 == transform._consCFlow_1)
                            { 
                              Fail10:
                              { 
                                IStrategoTerm s_20 = null;
                                s_20 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX9, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(s_20, (IStrategoList)transform.constCons1)))});
                                if(true)
                                  break Success9;
                              }
                              term = term0;
                            }
                            Success10:
                            { 
                              if(cons0 == transform._consCFlowBelow_1)
                              { 
                                Fail11:
                                { 
                                  IStrategoTerm r_20 = null;
                                  r_20 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX10, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(r_20, (IStrategoList)transform.constCons1)))});
                                  if(true)
                                    break Success10;
                                }
                                term = term0;
                              }
                              Success11:
                              { 
                                if(cons0 == transform._consIf_1)
                                { 
                                  Fail12:
                                  { 
                                    IStrategoTerm q_20 = null;
                                    q_20 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX11, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(q_20, (IStrategoList)transform.constCons1)))});
                                    if(true)
                                      break Success11;
                                  }
                                  term = term0;
                                }
                                Success12:
                                { 
                                  if(cons0 == transform._consThis_1)
                                  { 
                                    Fail13:
                                    { 
                                      IStrategoTerm p_20 = null;
                                      p_20 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX12, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(p_20, (IStrategoList)transform.constCons1)))});
                                      if(true)
                                        break Success12;
                                    }
                                    term = term0;
                                  }
                                  Success13:
                                  { 
                                    if(cons0 == transform._consTarget_1)
                                    { 
                                      Fail14:
                                      { 
                                        IStrategoTerm o_20 = null;
                                        o_20 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX13, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(o_20, (IStrategoList)transform.constCons1)))});
                                        if(true)
                                          break Success13;
                                      }
                                      term = term0;
                                    }
                                    Success14:
                                    { 
                                      if(cons0 == transform._consArgs_1)
                                      { 
                                        Fail15:
                                        { 
                                          IStrategoTerm l_20 = null;
                                          l_20 = term.getSubterm(0);
                                          term = list_to_args_0_0.instance.invoke(context, l_20);
                                          if(term == null)
                                            break Fail15;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX14, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                          if(true)
                                            break Success14;
                                        }
                                        term = term0;
                                      }
                                      Success15:
                                      { 
                                        if(cons0 == transform._consNamedPointcut_2)
                                        { 
                                          Fail16:
                                          { 
                                            IStrategoTerm h_20 = null;
                                            IStrategoTerm i_20 = null;
                                            h_20 = term.getSubterm(0);
                                            i_20 = term.getSubterm(1);
                                            term = list_to_args_0_0.instance.invoke(context, i_20);
                                            if(term == null)
                                              break Fail16;
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(h_20, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                            if(true)
                                              break Success15;
                                          }
                                          term = term0;
                                        }
                                        Success16:
                                        { 
                                          if(cons0 == transform._consAtThis_1)
                                          { 
                                            Fail17:
                                            { 
                                              IStrategoTerm g_20 = null;
                                              g_20 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS17, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(g_20, (IStrategoList)transform.constCons1)))});
                                              if(true)
                                                break Success16;
                                            }
                                            term = term0;
                                          }
                                          Success17:
                                          { 
                                            if(cons0 == transform._consAtTarget_1)
                                            { 
                                              Fail18:
                                              { 
                                                IStrategoTerm f_20 = null;
                                                f_20 = term.getSubterm(0);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS18, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(f_20, (IStrategoList)transform.constCons1)))});
                                                if(true)
                                                  break Success17;
                                              }
                                              term = term0;
                                            }
                                            term = aspectj_to_box_0_0_fragment_3.instance.invoke(context, term);
                                            if(term == null)
                                              break Fail0;
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

  @SuppressWarnings("all") public static class aspectj_to_box_0_0_fragment_3 extends Strategy 
  { 
    public static aspectj_to_box_0_0_fragment_3 instance = new aspectj_to_box_0_0_fragment_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0_fragment_3");
      Fail19:
      { 
        IStrategoTerm term18 = term;
        IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success18:
        { 
          if(cons1 == transform._consAtWithin_1)
          { 
            Fail20:
            { 
              IStrategoTerm e_20 = null;
              e_20 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS19, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(e_20, (IStrategoList)transform.constCons1)))});
              if(true)
                break Success18;
            }
            term = term18;
          }
          Success19:
          { 
            if(cons1 == transform._consAtWithinCode_1)
            { 
              Fail21:
              { 
                IStrategoTerm d_20 = null;
                d_20 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS20, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(d_20, (IStrategoList)transform.constCons1)))});
                if(true)
                  break Success19;
              }
              term = term18;
            }
            Success20:
            { 
              if(cons1 == transform._consAtAnno_1)
              { 
                Fail22:
                { 
                  IStrategoTerm c_20 = null;
                  c_20 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS21, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(c_20, (IStrategoList)transform.constCons1)))});
                  if(true)
                    break Success20;
                }
                term = term18;
              }
              Success21:
              { 
                if(cons1 == transform._consAtArgs_1)
                { 
                  Fail23:
                  { 
                    IStrategoTerm z_19 = null;
                    z_19 = term.getSubterm(0);
                    term = list_to_args_0_0.instance.invoke(context, z_19);
                    if(term == null)
                      break Fail23;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS22, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                    if(true)
                      break Success21;
                  }
                  term = term18;
                }
                Success22:
                { 
                  if(cons1 == transform._consPointcutName_1)
                  { 
                    Fail24:
                    { 
                      IStrategoTerm y_19 = null;
                      y_19 = term.getSubterm(0);
                      term = y_19;
                      if(true)
                        break Success22;
                    }
                    term = term18;
                  }
                  Success23:
                  { 
                    if(cons1 == transform._consPointcutName_2)
                    { 
                      Fail25:
                      { 
                        IStrategoTerm w_19 = null;
                        IStrategoTerm x_19 = null;
                        w_19 = term.getSubterm(0);
                        x_19 = term.getSubterm(1);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(w_19, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(x_19, (IStrategoList)transform.constNil0)))});
                        if(true)
                          break Success23;
                      }
                      term = term18;
                    }
                    Success24:
                    { 
                      if(cons1 == transform._consPointcutDec_2)
                      { 
                        Fail26:
                        { 
                          IStrategoTerm t_19 = null;
                          IStrategoTerm u_19 = null;
                          t_19 = term.getSubterm(0);
                          u_19 = term.getSubterm(1);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(t_19, termFactory.makeListCons(u_19, (IStrategoList)transform.constNil0))});
                          if(true)
                            break Success24;
                        }
                        term = term18;
                      }
                      Success25:
                      { 
                        if(cons1 == transform._consPointcutDecHead_3)
                        { 
                          Fail27:
                          { 
                            IStrategoTerm m_19 = null;
                            IStrategoTerm n_19 = null;
                            IStrategoTerm o_19 = null;
                            IStrategoTerm p_19 = null;
                            m_19 = term.getSubterm(0);
                            n_19 = term.getSubterm(1);
                            o_19 = term.getSubterm(2);
                            term = list_to_args_0_0.instance.invoke(context, o_19);
                            if(term == null)
                              break Fail27;
                            p_19 = term;
                            term = termFactory.makeTuple(m_19, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX15, termFactory.makeListCons(n_19, termFactory.makeListCons(p_19, (IStrategoList)transform.constNil0))));
                            term = make$Conc_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail27;
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                            if(true)
                              break Success25;
                          }
                          term = term18;
                        }
                        Success26:
                        { 
                          if(cons1 == transform._consPointcutBody_1)
                          { 
                            Fail28:
                            { 
                              IStrategoTerm l_19 = null;
                              l_19 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS26, termFactory.makeListCons(l_19, (IStrategoList)transform.constCons5))});
                              if(true)
                                break Success26;
                            }
                            term = term18;
                          }
                          Success27:
                          { 
                            if(cons1 == transform._consNoPointcutBody_0)
                            { 
                              Fail29:
                              { 
                                term = transform.constFBOX16;
                                if(true)
                                  break Success27;
                              }
                              term = term18;
                            }
                            Success28:
                            { 
                              if(cons1 == transform._consRefTypePattern_1)
                              { 
                                Fail30:
                                { 
                                  IStrategoTerm k_19 = null;
                                  k_19 = term.getSubterm(0);
                                  term = k_19;
                                  if(true)
                                    break Success28;
                                }
                                term = term18;
                              }
                              Success29:
                              { 
                                if(cons1 == transform._consPrimTypePattern_1)
                                { 
                                  Fail31:
                                  { 
                                    IStrategoTerm h_19 = null;
                                    h_19 = term.getSubterm(0);
                                    term = h_19;
                                    if(true)
                                      break Success29;
                                  }
                                  term = term18;
                                }
                                Success30:
                                { 
                                  if(cons1 == transform._consSubtype_1)
                                  { 
                                    Fail32:
                                    { 
                                      IStrategoTerm g_19 = null;
                                      g_19 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(g_19, (IStrategoList)transform.constCons6)});
                                      if(true)
                                        break Success30;
                                    }
                                    term = term18;
                                  }
                                  Success31:
                                  { 
                                    if(cons1 == transform._consGenericTypePattern_2)
                                    { 
                                      Fail33:
                                      { 
                                        IStrategoTerm e_19 = null;
                                        IStrategoTerm f_19 = null;
                                        e_19 = term.getSubterm(0);
                                        f_19 = term.getSubterm(1);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(e_19, termFactory.makeListCons(f_19, (IStrategoList)transform.constNil0))});
                                        if(true)
                                          break Success31;
                                      }
                                      term = term18;
                                    }
                                    Success32:
                                    { 
                                      if(cons1 == transform._consGenericSubtypePattern_2)
                                      { 
                                        Fail34:
                                        { 
                                          IStrategoTerm b_19 = null;
                                          IStrategoTerm d_19 = null;
                                          b_19 = term.getSubterm(0);
                                          d_19 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(b_19, termFactory.makeListCons(d_19, (IStrategoList)transform.constCons6))});
                                          if(true)
                                            break Success32;
                                        }
                                        term = term18;
                                      }
                                      Success33:
                                      { 
                                        if(cons1 == transform._consAnnoTypePattern_2)
                                        { 
                                          Fail35:
                                          { 
                                            IStrategoTerm x_18 = null;
                                            IStrategoTerm y_18 = null;
                                            IStrategoTerm arg0 = term.getSubterm(0);
                                            if(arg0.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg0).getConstructor())
                                              break Fail35;
                                            x_18 = arg0.getSubterm(0);
                                            y_18 = term.getSubterm(1);
                                            term = termFactory.makeTuple(x_18, (IStrategoTerm)termFactory.makeListCons(y_18, (IStrategoList)transform.constNil0));
                                            term = make$Conc_0_0.instance.invoke(context, term);
                                            if(term == null)
                                              break Fail35;
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term}), (IStrategoList)transform.constNil0)});
                                            if(true)
                                              break Success33;
                                          }
                                          term = term18;
                                        }
                                        Success34:
                                        { 
                                          if(cons1 == transform._consNamePattern_1)
                                          { 
                                            Fail36:
                                            { 
                                              IStrategoTerm w_18 = null;
                                              w_18 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{w_18}), (IStrategoList)transform.constNil0)});
                                              if(true)
                                                break Success34;
                                            }
                                            term = term18;
                                          }
                                          Success35:
                                          { 
                                            if(cons1 == transform._consNamePattern_2)
                                            { 
                                              Fail37:
                                              { 
                                                IStrategoTerm u_18 = null;
                                                IStrategoTerm v_18 = null;
                                                u_18 = term.getSubterm(0);
                                                v_18 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(u_18, termFactory.makeListCons(transform.constFBOX17, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{v_18}), (IStrategoList)transform.constNil0)))});
                                                if(true)
                                                  break Success35;
                                              }
                                              term = term18;
                                            }
                                            Success36:
                                            { 
                                              if(cons1 == transform._consWildcardNamePattern_2)
                                              { 
                                                Fail38:
                                                { 
                                                  IStrategoTerm s_18 = null;
                                                  IStrategoTerm t_18 = null;
                                                  s_18 = term.getSubterm(0);
                                                  t_18 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(s_18, termFactory.makeListCons(transform.constFBOX18, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{t_18}), (IStrategoList)transform.constNil0)))});
                                                  if(true)
                                                    break Success36;
                                                }
                                                term = term18;
                                              }
                                              Success37:
                                              { 
                                                if(cons1 == transform._consFormalWildcard_0)
                                                { 
                                                  Fail39:
                                                  { 
                                                    term = transform.constS28;
                                                    if(true)
                                                      break Success37;
                                                  }
                                                  term = term18;
                                                }
                                                Success38:
                                                { 
                                                  if(cons1 == transform._consVarArityParamPattern_1)
                                                  { 
                                                    Fail40:
                                                    { 
                                                      IStrategoTerm r_18 = null;
                                                      r_18 = term.getSubterm(0);
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(r_18, (IStrategoList)transform.constCons7)});
                                                      if(true)
                                                        break Success38;
                                                    }
                                                    term = term18;
                                                  }
                                                  Success39:
                                                  { 
                                                    if(cons1 == transform._consRegularTypePattern_1)
                                                    { 
                                                      Fail41:
                                                      { 
                                                        IStrategoTerm q_18 = null;
                                                        q_18 = term.getSubterm(0);
                                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(q_18, (IStrategoList)transform.constNil0)});
                                                        if(true)
                                                          break Success39;
                                                      }
                                                      term = term18;
                                                    }
                                                    Success40:
                                                    { 
                                                      if(cons1 == transform._consWildcard_0)
                                                      { 
                                                        Fail42:
                                                        { 
                                                          term = transform.constS30;
                                                          if(true)
                                                            break Success40;
                                                        }
                                                        term = term18;
                                                      }
                                                      Success41:
                                                      { 
                                                        if(cons1 == transform._consDotWildcard_0)
                                                        { 
                                                          Fail43:
                                                          { 
                                                            term = transform.constS28;
                                                            if(true)
                                                              break Success41;
                                                          }
                                                          term = term18;
                                                        }
                                                        Success42:
                                                        { 
                                                          if(cons1 == transform._consSimpleNamePattern_1)
                                                          { 
                                                            Fail44:
                                                            { 
                                                              IStrategoTerm p_18 = null;
                                                              p_18 = term.getSubterm(0);
                                                              term = p_18;
                                                              if(true)
                                                                break Success42;
                                                            }
                                                            term = term18;
                                                          }
                                                          Success43:
                                                          { 
                                                            if(cons1 == transform._consMethodPattern_6)
                                                            { 
                                                              Fail45:
                                                              { 
                                                                IStrategoTerm b_18 = null;
                                                                IStrategoTerm c_18 = null;
                                                                IStrategoTerm d_18 = null;
                                                                IStrategoTerm e_18 = null;
                                                                IStrategoTerm f_18 = null;
                                                                IStrategoTerm g_18 = null;
                                                                IStrategoTerm j_18 = null;
                                                                IStrategoTerm k_18 = null;
                                                                IStrategoTerm l_18 = null;
                                                                IStrategoTerm m_18 = null;
                                                                IStrategoTerm arg1 = term.getSubterm(0);
                                                                if(arg1.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg1).getConstructor())
                                                                  break Fail45;
                                                                d_18 = arg1.getSubterm(0);
                                                                IStrategoTerm arg2 = term.getSubterm(1);
                                                                if(arg2.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg2).getConstructor())
                                                                  break Fail45;
                                                                e_18 = arg2.getSubterm(0);
                                                                b_18 = term.getSubterm(2);
                                                                c_18 = term.getSubterm(3);
                                                                g_18 = term.getSubterm(4);
                                                                k_18 = term.getSubterm(5);
                                                                m_18 = term;
                                                                term = termFactory.makeTuple(d_18, e_18);
                                                                term = conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail45;
                                                                f_18 = term;
                                                                term = list_to_args_0_0.instance.invoke(context, g_18);
                                                                if(term == null)
                                                                  break Fail45;
                                                                j_18 = term;
                                                                term = option_to_boxes_0_0.instance.invoke(context, k_18);
                                                                if(term == null)
                                                                  break Fail45;
                                                                l_18 = term;
                                                                term = m_18;
                                                                IStrategoList list0;
                                                                list0 = checkListTail(l_18);
                                                                if(list0 == null)
                                                                  break Fail45;
                                                                term = termFactory.makeTuple(f_18, (IStrategoTerm)termFactory.makeListCons(b_18, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(c_18, termFactory.makeListCons(j_18, (IStrategoList)transform.constNil0))}), list0)));
                                                                term = make$Conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail45;
                                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                                                                if(true)
                                                                  break Success43;
                                                              }
                                                              term = term18;
                                                            }
                                                            Success44:
                                                            { 
                                                              if(cons1 == transform._consConstrPattern_5)
                                                              { 
                                                                Fail46:
                                                                { 
                                                                  IStrategoTerm r_17 = null;
                                                                  IStrategoTerm s_17 = null;
                                                                  IStrategoTerm t_17 = null;
                                                                  IStrategoTerm u_17 = null;
                                                                  IStrategoTerm v_17 = null;
                                                                  IStrategoTerm w_17 = null;
                                                                  IStrategoTerm x_17 = null;
                                                                  IStrategoTerm arg3 = term.getSubterm(0);
                                                                  if(arg3.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg3).getConstructor())
                                                                    break Fail46;
                                                                  t_17 = arg3.getSubterm(0);
                                                                  IStrategoTerm arg4 = term.getSubterm(1);
                                                                  if(arg4.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg4).getConstructor())
                                                                    break Fail46;
                                                                  u_17 = arg4.getSubterm(0);
                                                                  r_17 = term.getSubterm(2);
                                                                  w_17 = term.getSubterm(3);
                                                                  s_17 = term.getSubterm(4);
                                                                  term = termFactory.makeTuple(t_17, u_17);
                                                                  term = conc_0_0.instance.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail46;
                                                                  v_17 = term;
                                                                  term = list_to_args_0_0.instance.invoke(context, w_17);
                                                                  if(term == null)
                                                                    break Fail46;
                                                                  x_17 = term;
                                                                  term = termFactory.makeTuple(v_17, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(r_17, termFactory.makeListCons(x_17, (IStrategoList)transform.constNil0))}), termFactory.makeListCons(s_17, (IStrategoList)transform.constNil0)));
                                                                  term = make$Conc_0_0.instance.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail46;
                                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                                                                  if(true)
                                                                    break Success44;
                                                                }
                                                                term = term18;
                                                              }
                                                              term = aspectj_to_box_0_0_fragment_2.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail19;
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

  @SuppressWarnings("all") public static class aspectj_to_box_0_0_fragment_2 extends Strategy 
  { 
    public static aspectj_to_box_0_0_fragment_2 instance = new aspectj_to_box_0_0_fragment_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0_fragment_2");
      Fail47:
      { 
        IStrategoTerm term45 = term;
        IStrategoConstructor cons2 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success45:
        { 
          if(cons2 == transform._consFieldPattern_4)
          { 
            Fail48:
            { 
              IStrategoTerm j_17 = null;
              IStrategoTerm k_17 = null;
              IStrategoTerm l_17 = null;
              IStrategoTerm m_17 = null;
              IStrategoTerm n_17 = null;
              IStrategoTerm arg5 = term.getSubterm(0);
              if(arg5.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg5).getConstructor())
                break Fail48;
              l_17 = arg5.getSubterm(0);
              IStrategoTerm arg6 = term.getSubterm(1);
              if(arg6.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg6).getConstructor())
                break Fail48;
              m_17 = arg6.getSubterm(0);
              j_17 = term.getSubterm(2);
              k_17 = term.getSubterm(3);
              term = termFactory.makeTuple(l_17, m_17);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail48;
              n_17 = term;
              term = termFactory.makeTuple(n_17, (IStrategoTerm)termFactory.makeListCons(j_17, termFactory.makeListCons(k_17, (IStrategoList)transform.constNil0)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail48;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
              if(true)
                break Success45;
            }
            term = term45;
          }
          Success46:
          { 
            if(cons2 == transform._consMemberName_1)
            { 
              Fail49:
              { 
                IStrategoTerm i_17 = null;
                i_17 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{i_17});
                if(true)
                  break Success46;
              }
              term = term45;
            }
            Success47:
            { 
              if(cons2 == transform._consMemberName_2)
              { 
                Fail50:
                { 
                  IStrategoTerm g_17 = null;
                  IStrategoTerm h_17 = null;
                  g_17 = term.getSubterm(0);
                  h_17 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(g_17, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{h_17}), (IStrategoList)transform.constNil0)))});
                  if(true)
                    break Success47;
                }
                term = term45;
              }
              Success48:
              { 
                if(cons2 == transform._consWildcardMemberName_2)
                { 
                  Fail51:
                  { 
                    IStrategoTerm d_17 = null;
                    IStrategoTerm e_17 = null;
                    d_17 = term.getSubterm(0);
                    e_17 = term.getSubterm(1);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(d_17, termFactory.makeListCons(transform.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{e_17}), (IStrategoList)transform.constNil0)))});
                    if(true)
                      break Success48;
                  }
                  term = term45;
                }
                Success49:
                { 
                  if(cons2 == transform._consConstrName_0)
                  { 
                    Fail52:
                    { 
                      term = transform.constFBOX19;
                      if(true)
                        break Success49;
                    }
                    term = term45;
                  }
                  Success50:
                  { 
                    if(cons2 == transform._consConstrName_1)
                    { 
                      Fail53:
                      { 
                        IStrategoTerm c_17 = null;
                        c_17 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(c_17, (IStrategoList)transform.constCons9)});
                        if(true)
                          break Success50;
                      }
                      term = term45;
                    }
                    Success51:
                    { 
                      if(cons2 == transform._consWildcardConstrName_1)
                      { 
                        Fail54:
                        { 
                          IStrategoTerm b_17 = null;
                          b_17 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(b_17, (IStrategoList)transform.constCons10)});
                          if(true)
                            break Success51;
                        }
                        term = term45;
                      }
                      Success52:
                      { 
                        if(cons2 == transform._consNot_1)
                        { 
                          Fail55:
                          { 
                            IStrategoTerm a_17 = null;
                            a_17 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(a_17, (IStrategoList)transform.constNil0))});
                            if(true)
                              break Success52;
                          }
                          term = term45;
                        }
                        Success53:
                        { 
                          if(cons2 == transform._consModPattern_1)
                          { 
                            Fail56:
                            { 
                              IStrategoTerm z_16 = null;
                              z_16 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, z_16});
                              if(true)
                                break Success53;
                            }
                            term = term45;
                          }
                          Success54:
                          { 
                            if(cons2 == transform._consThrowsPattern_1)
                            { 
                              Fail57:
                              { 
                                IStrategoTerm u_16 = null;
                                u_16 = term.getSubterm(0);
                                term = separate_by_comma_0_0.instance.invoke(context, u_16);
                                if(term == null)
                                  break Fail57;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX20, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                if(true)
                                  break Success54;
                              }
                              term = term45;
                            }
                            Success55:
                            { 
                              if(cons2 == transform._consNotThrowsCondition_1)
                              { 
                                Fail58:
                                { 
                                  IStrategoTerm s_16 = null;
                                  s_16 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(s_16, (IStrategoList)transform.constNil0))});
                                  if(true)
                                    break Success55;
                                }
                                term = term45;
                              }
                              Success56:
                              { 
                                if(cons2 == transform._consThrowsCondition_1)
                                { 
                                  Fail59:
                                  { 
                                    IStrategoTerm q_16 = null;
                                    q_16 = term.getSubterm(0);
                                    term = has_leftmost_not_0_0.instance.invoke(context, q_16);
                                    if(term == null)
                                      break Fail59;
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS1, termFactory.makeListCons(q_16, (IStrategoList)transform.constCons1))});
                                    if(true)
                                      break Success56;
                                  }
                                  term = term45;
                                }
                                Success57:
                                { 
                                  if(cons2 == transform._consThrowsCondition_1)
                                  { 
                                    Fail60:
                                    { 
                                      IStrategoTerm l_16 = null;
                                      l_16 = term.getSubterm(0);
                                      term = l_16;
                                      IStrategoTerm term58 = term;
                                      Success58:
                                      { 
                                        Fail61:
                                        { 
                                          term = has_leftmost_not_0_0.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail61;
                                          { 
                                            if(true)
                                              break Fail60;
                                            if(true)
                                              break Success58;
                                          }
                                        }
                                        term = term58;
                                      }
                                      term = l_16;
                                      if(true)
                                        break Success57;
                                    }
                                    term = term45;
                                  }
                                  Success59:
                                  { 
                                    if(cons2 == transform._consSimpleAnnoPatternExact_1)
                                    { 
                                      Fail62:
                                      { 
                                        IStrategoTerm k_16 = null;
                                        k_16 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(k_16, (IStrategoList)transform.constNil0))});
                                        if(true)
                                          break Success59;
                                      }
                                      term = term45;
                                    }
                                    Success60:
                                    { 
                                      if(cons2 == transform._consSimpleAnnoPattern_1)
                                      { 
                                        Fail63:
                                        { 
                                          IStrategoTerm j_16 = null;
                                          j_16 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(j_16, (IStrategoList)transform.constCons1)))});
                                          if(true)
                                            break Success60;
                                        }
                                        term = term45;
                                      }
                                      Success61:
                                      { 
                                        if(cons2 == transform._consSimpleAnnoPatternValue_2)
                                        { 
                                          Fail64:
                                          { 
                                            IStrategoTerm g_16 = null;
                                            IStrategoTerm h_16 = null;
                                            g_16 = term.getSubterm(0);
                                            h_16 = term.getSubterm(1);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(g_16, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(h_16, (IStrategoList)transform.constCons1))))});
                                            if(true)
                                              break Success61;
                                          }
                                          term = term45;
                                        }
                                        Success62:
                                        { 
                                          if(cons2 == transform._consNotComp_1)
                                          { 
                                            Fail65:
                                            { 
                                              IStrategoTerm f_16 = null;
                                              f_16 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(f_16, (IStrategoList)transform.constNil0))});
                                              if(true)
                                                break Success62;
                                            }
                                            term = term45;
                                          }
                                          Success63:
                                          { 
                                            if(cons2 == transform._consAndComp_2)
                                            { 
                                              Fail66:
                                              { 
                                                IStrategoTerm d_16 = null;
                                                IStrategoTerm e_16 = null;
                                                d_16 = term.getSubterm(0);
                                                e_16 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(d_16, termFactory.makeListCons(transform.constS35, termFactory.makeListCons(e_16, (IStrategoList)transform.constNil0)))});
                                                if(true)
                                                  break Success63;
                                              }
                                              term = term45;
                                            }
                                            Success64:
                                            { 
                                              if(cons2 == transform._consOrComp_2)
                                              { 
                                                Fail67:
                                                { 
                                                  IStrategoTerm z_15 = null;
                                                  IStrategoTerm c_16 = null;
                                                  z_15 = term.getSubterm(0);
                                                  c_16 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(z_15, termFactory.makeListCons(transform.constS36, termFactory.makeListCons(c_16, (IStrategoList)transform.constNil0)))});
                                                  if(true)
                                                    break Success64;
                                                }
                                                term = term45;
                                              }
                                              Success65:
                                              { 
                                                if(cons2 == transform._consIntertypeMethodDec_2)
                                                { 
                                                  Fail68:
                                                  { 
                                                    IStrategoTerm x_15 = null;
                                                    IStrategoTerm y_15 = null;
                                                    x_15 = term.getSubterm(0);
                                                    IStrategoTerm arg7 = term.getSubterm(1);
                                                    y_15 = arg7;
                                                    if(arg7.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg7).getConstructor())
                                                      break Fail68;
                                                    term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(x_15, termFactory.makeListCons(y_15, (IStrategoList)transform.constNil0))});
                                                    if(true)
                                                      break Success65;
                                                  }
                                                  term = term45;
                                                }
                                                Success66:
                                                { 
                                                  if(cons2 == transform._consIntertypeMethodDec_2)
                                                  { 
                                                    Fail69:
                                                    { 
                                                      IStrategoTerm w_15 = null;
                                                      w_15 = term.getSubterm(0);
                                                      IStrategoTerm arg9 = term.getSubterm(1);
                                                      if(arg9.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg9).getConstructor())
                                                        break Fail69;
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(w_15, (IStrategoList)transform.constCons5)});
                                                      if(true)
                                                        break Success66;
                                                    }
                                                    term = term45;
                                                  }
                                                  Success67:
                                                  { 
                                                    if(cons2 == transform._consIntertypeMethodDecHead_8)
                                                    { 
                                                      Fail70:
                                                      { 
                                                        IStrategoTerm x_14 = null;
                                                        IStrategoTerm y_14 = null;
                                                        IStrategoTerm z_14 = null;
                                                        IStrategoTerm a_15 = null;
                                                        IStrategoTerm b_15 = null;
                                                        IStrategoTerm c_15 = null;
                                                        IStrategoTerm d_15 = null;
                                                        IStrategoTerm f_15 = null;
                                                        IStrategoTerm g_15 = null;
                                                        IStrategoTerm h_15 = null;
                                                        IStrategoTerm i_15 = null;
                                                        IStrategoTerm o_15 = null;
                                                        IStrategoTerm p_15 = null;
                                                        IStrategoTerm q_15 = null;
                                                        IStrategoTerm t_15 = null;
                                                        IStrategoTerm u_15 = null;
                                                        i_15 = term.getSubterm(0);
                                                        c_15 = term.getSubterm(1);
                                                        x_14 = term.getSubterm(2);
                                                        y_14 = term.getSubterm(3);
                                                        d_15 = term.getSubterm(4);
                                                        IStrategoTerm arg10 = term.getSubterm(5);
                                                        if(arg10.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg10).getConstructor())
                                                          break Fail70;
                                                        z_14 = arg10.getSubterm(0);
                                                        a_15 = term.getSubterm(6);
                                                        g_15 = term.getSubterm(7);
                                                        q_15 = term;
                                                        term = list_to_args_0_0.instance.invoke(context, a_15);
                                                        if(term == null)
                                                          break Fail70;
                                                        b_15 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, c_15);
                                                        if(term == null)
                                                          break Fail70;
                                                        o_15 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, d_15);
                                                        if(term == null)
                                                          break Fail70;
                                                        f_15 = term;
                                                        term = option_to_boxes_0_0.instance.invoke(context, g_15);
                                                        if(term == null)
                                                          break Fail70;
                                                        h_15 = term;
                                                        term = termFactory.makeTuple(i_15, o_15);
                                                        term = conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail70;
                                                        p_15 = term;
                                                        term = q_15;
                                                        u_15 = term;
                                                        term = termFactory.makeTuple(f_15, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{z_14}), termFactory.makeListCons(b_15, (IStrategoList)transform.constNil0))));
                                                        term = make$Conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail70;
                                                        t_15 = term;
                                                        term = u_15;
                                                        IStrategoList list2;
                                                        IStrategoList list1;
                                                        list1 = checkListTail(h_15);
                                                        if(list1 == null)
                                                          break Fail70;
                                                        list2 = checkListTail(t_15);
                                                        if(list2 == null)
                                                          break Fail70;
                                                        term = termFactory.makeTuple(p_15, (IStrategoTerm)termFactory.makeListCons(x_14, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(y_14, list2)}), list1)));
                                                        term = make$Conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail70;
                                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                                                        if(true)
                                                          break Success67;
                                                      }
                                                      term = term45;
                                                    }
                                                    Success68:
                                                    { 
                                                      if(cons2 == transform._consIntertypeConstrDec_2)
                                                      { 
                                                        Fail71:
                                                        { 
                                                          IStrategoTerm v_14 = null;
                                                          IStrategoTerm w_14 = null;
                                                          v_14 = term.getSubterm(0);
                                                          w_14 = term.getSubterm(1);
                                                          term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(v_14, termFactory.makeListCons(w_14, (IStrategoList)transform.constNil0))});
                                                          if(true)
                                                            break Success68;
                                                        }
                                                        term = term45;
                                                      }
                                                      term = aspectj_to_box_0_0_fragment_1.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail47;
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

  @SuppressWarnings("all") public static class aspectj_to_box_0_0_fragment_1 extends Strategy 
  { 
    public static aspectj_to_box_0_0_fragment_1 instance = new aspectj_to_box_0_0_fragment_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0_fragment_1");
      Fail72:
      { 
        IStrategoTerm term69 = term;
        IStrategoConstructor cons3 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success69:
        { 
          if(cons3 == transform._consIntertypeConstrDecHead_6)
          { 
            Fail73:
            { 
              IStrategoTerm d_14 = null;
              IStrategoTerm e_14 = null;
              IStrategoTerm f_14 = null;
              IStrategoTerm g_14 = null;
              IStrategoTerm h_14 = null;
              IStrategoTerm i_14 = null;
              IStrategoTerm j_14 = null;
              IStrategoTerm k_14 = null;
              IStrategoTerm l_14 = null;
              IStrategoTerm m_14 = null;
              IStrategoTerm n_14 = null;
              IStrategoTerm o_14 = null;
              IStrategoTerm t_14 = null;
              IStrategoTerm u_14 = null;
              l_14 = term.getSubterm(0);
              g_14 = term.getSubterm(1);
              d_14 = term.getSubterm(2);
              h_14 = term.getSubterm(3);
              e_14 = term.getSubterm(4);
              j_14 = term.getSubterm(5);
              o_14 = term;
              term = list_to_args_0_0.instance.invoke(context, e_14);
              if(term == null)
                break Fail73;
              f_14 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, g_14);
              if(term == null)
                break Fail73;
              m_14 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, h_14);
              if(term == null)
                break Fail73;
              i_14 = term;
              term = option_to_boxes_0_0.instance.invoke(context, j_14);
              if(term == null)
                break Fail73;
              k_14 = term;
              term = termFactory.makeTuple(l_14, m_14);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail73;
              n_14 = term;
              term = o_14;
              u_14 = term;
              term = termFactory.makeTuple(i_14, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(transform.constFBOX19, termFactory.makeListCons(f_14, (IStrategoList)transform.constNil0))));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail73;
              t_14 = term;
              term = u_14;
              IStrategoList list4;
              IStrategoList list3;
              list3 = checkListTail(k_14);
              if(list3 == null)
                break Fail73;
              list4 = checkListTail(t_14);
              if(list4 == null)
                break Fail73;
              term = termFactory.makeTuple(n_14, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(d_14, list4)}), list3));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail73;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
              if(true)
                break Success69;
            }
            term = term69;
          }
          Success70:
          { 
            if(cons3 == transform._consIntertypeFieldDec_5)
            { 
              Fail74:
              { 
                IStrategoTerm p_13 = null;
                IStrategoTerm q_13 = null;
                IStrategoTerm r_13 = null;
                IStrategoTerm s_13 = null;
                IStrategoTerm t_13 = null;
                IStrategoTerm u_13 = null;
                IStrategoTerm y_13 = null;
                IStrategoTerm b_14 = null;
                IStrategoTerm c_14 = null;
                p_13 = term.getSubterm(0);
                q_13 = term.getSubterm(1);
                r_13 = term.getSubterm(2);
                t_13 = term.getSubterm(3);
                s_13 = term.getSubterm(4);
                y_13 = term;
                term = option_to_boxes_0_0.instance.invoke(context, t_13);
                if(term == null)
                  break Fail74;
                u_13 = term;
                term = y_13;
                c_14 = term;
                term = termFactory.makeTuple(u_13, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(s_13, (IStrategoList)transform.constCons5)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail74;
                b_14 = term;
                term = c_14;
                IStrategoList list5;
                list5 = checkListTail(b_14);
                if(list5 == null)
                  break Fail74;
                term = termFactory.makeTuple(p_13, (IStrategoTerm)termFactory.makeListCons(q_13, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(r_13, list5)}), (IStrategoList)transform.constNil0)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail74;
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                if(true)
                  break Success70;
              }
              term = term69;
            }
            Success71:
            { 
              if(cons3 == transform._consAdviceDec_5)
              { 
                Fail75:
                { 
                  IStrategoTerm y_12 = null;
                  IStrategoTerm z_12 = null;
                  IStrategoTerm a_13 = null;
                  IStrategoTerm e_13 = null;
                  IStrategoTerm f_13 = null;
                  IStrategoTerm g_13 = null;
                  IStrategoTerm h_13 = null;
                  IStrategoTerm n_13 = null;
                  IStrategoTerm o_13 = null;
                  y_12 = term.getSubterm(0);
                  z_12 = term.getSubterm(1);
                  f_13 = term.getSubterm(2);
                  a_13 = term.getSubterm(3);
                  e_13 = term.getSubterm(4);
                  h_13 = term;
                  term = option_to_boxes_0_0.instance.invoke(context, f_13);
                  if(term == null)
                    break Fail75;
                  g_13 = term;
                  term = h_13;
                  o_13 = term;
                  term = termFactory.makeTuple(g_13, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(a_13, (IStrategoList)transform.constNil0)));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75;
                  n_13 = term;
                  term = o_13;
                  IStrategoList list6;
                  list6 = checkListTail(n_13);
                  if(list6 == null)
                    break Fail75;
                  term = termFactory.makeTuple(y_12, (IStrategoTerm)termFactory.makeListCons(z_12, list6));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75;
                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term}), termFactory.makeListCons(e_13, (IStrategoList)transform.constNil0))});
                  if(true)
                    break Success71;
                }
                term = term69;
              }
              Success72:
              { 
                if(cons3 == transform._consBefore_1)
                { 
                  Fail76:
                  { 
                    IStrategoTerm v_12 = null;
                    v_12 = term.getSubterm(0);
                    term = separate_by_comma_0_0.instance.invoke(context, v_12);
                    if(term == null)
                      break Fail76;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX24, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons12)))});
                    if(true)
                      break Success72;
                  }
                  term = term69;
                }
                Success73:
                { 
                  if(cons3 == transform._consAfter_2)
                  { 
                    Fail77:
                    { 
                      IStrategoTerm r_12 = null;
                      IStrategoTerm s_12 = null;
                      s_12 = term.getSubterm(0);
                      r_12 = term.getSubterm(1);
                      term = separate_by_comma_0_0.instance.invoke(context, s_12);
                      if(term == null)
                        break Fail77;
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX25, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons12)))}), termFactory.makeListCons(r_12, (IStrategoList)transform.constNil0))});
                      if(true)
                        break Success73;
                    }
                    term = term69;
                  }
                  Success74:
                  { 
                    if(cons3 == transform._consAround_2)
                    { 
                      Fail78:
                      { 
                        IStrategoTerm n_12 = null;
                        IStrategoTerm o_12 = null;
                        n_12 = term.getSubterm(0);
                        o_12 = term.getSubterm(1);
                        term = separate_by_comma_0_0.instance.invoke(context, o_12);
                        if(term == null)
                          break Fail78;
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(n_12, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX26, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons12)))}), (IStrategoList)transform.constNil0))});
                        if(true)
                          break Success74;
                      }
                      term = term69;
                    }
                    Success75:
                    { 
                      if(cons3 == transform._consReturning_0)
                      { 
                        Fail79:
                        { 
                          term = transform.constFBOX27;
                          if(true)
                            break Success75;
                        }
                        term = term69;
                      }
                      Success76:
                      { 
                        if(cons3 == transform._consReturning_1)
                        { 
                          Fail80:
                          { 
                            IStrategoTerm m_12 = null;
                            m_12 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX27, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(m_12, (IStrategoList)transform.constCons12)))});
                            if(true)
                              break Success76;
                          }
                          term = term69;
                        }
                        Success77:
                        { 
                          if(cons3 == transform._consThrowing_0)
                          { 
                            Fail81:
                            { 
                              term = transform.constFBOX28;
                              if(true)
                                break Success77;
                            }
                            term = term69;
                          }
                          Success78:
                          { 
                            if(cons3 == transform._consThrowing_1)
                            { 
                              Fail82:
                              { 
                                IStrategoTerm l_12 = null;
                                l_12 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX28, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(l_12, (IStrategoList)transform.constCons12)))});
                                if(true)
                                  break Success78;
                              }
                              term = term69;
                            }
                            Success79:
                            { 
                              if(cons3 == transform._consDecParent_3)
                              { 
                                Fail83:
                                { 
                                  IStrategoTerm g_12 = null;
                                  IStrategoTerm h_12 = null;
                                  IStrategoTerm i_12 = null;
                                  g_12 = term.getSubterm(0);
                                  h_12 = term.getSubterm(1);
                                  i_12 = term.getSubterm(2);
                                  term = termFactory.makeTuple(g_12, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX29, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(h_12, termFactory.makeListCons(i_12, (IStrategoList)transform.constCons13))))));
                                  term = make$Conc_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail83;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                                  if(true)
                                    break Success79;
                                }
                                term = term69;
                              }
                              Success80:
                              { 
                                if(cons3 == transform._consDecWarning_3)
                                { 
                                  Fail84:
                                  { 
                                    IStrategoTerm b_12 = null;
                                    IStrategoTerm c_12 = null;
                                    IStrategoTerm d_12 = null;
                                    b_12 = term.getSubterm(0);
                                    c_12 = term.getSubterm(1);
                                    d_12 = term.getSubterm(2);
                                    term = termFactory.makeTuple(b_12, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX31, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(c_12, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(d_12, (IStrategoList)transform.constCons13)))))));
                                    term = make$Conc_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail84;
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                                    if(true)
                                      break Success80;
                                  }
                                  term = term69;
                                }
                                term = aspectj_to_box_0_0_fragment_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail72;
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

  @SuppressWarnings("all") public static class aspectj_to_box_0_0_fragment_0 extends Strategy 
  { 
    public static aspectj_to_box_0_0_fragment_0 instance = new aspectj_to_box_0_0_fragment_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0_fragment_0");
      Fail85:
      { 
        IStrategoTerm term81 = term;
        IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success81:
        { 
          if(cons4 == transform._consDecError_2)
          { 
            Fail86:
            { 
              IStrategoTerm z_11 = null;
              IStrategoTerm a_12 = null;
              z_11 = term.getSubterm(0);
              a_12 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX32, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(z_11, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(a_12, (IStrategoList)transform.constCons13))))))});
              if(true)
                break Success81;
            }
            term = term81;
          }
          Success82:
          { 
            if(cons4 == transform._consDecSoft_2)
            { 
              Fail87:
              { 
                IStrategoTerm x_11 = null;
                IStrategoTerm y_11 = null;
                x_11 = term.getSubterm(0);
                y_11 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX33, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(x_11, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(y_11, (IStrategoList)transform.constCons13))))))});
                if(true)
                  break Success82;
              }
              term = term81;
            }
            Success83:
            { 
              if(cons4 == transform._consDecPrecedence_2)
              { 
                Fail88:
                { 
                  IStrategoTerm r_11 = null;
                  IStrategoTerm s_11 = null;
                  IStrategoTerm t_11 = null;
                  r_11 = term.getSubterm(0);
                  s_11 = term.getSubterm(1);
                  term = separate_by_comma_0_0.instance.invoke(context, s_11);
                  if(term == null)
                    break Fail88;
                  t_11 = term;
                  term = termFactory.makeTuple(r_11, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX34, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(t_11, (IStrategoList)transform.constCons13)))));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail88;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                  if(true)
                    break Success83;
                }
                term = term81;
              }
              Success84:
              { 
                if(cons4 == transform._consDecAnno_4)
                { 
                  Fail89:
                  { 
                    IStrategoTerm l_11 = null;
                    IStrategoTerm m_11 = null;
                    IStrategoTerm n_11 = null;
                    IStrategoTerm o_11 = null;
                    l_11 = term.getSubterm(0);
                    m_11 = term.getSubterm(1);
                    n_11 = term.getSubterm(2);
                    o_11 = term.getSubterm(3);
                    term = termFactory.makeTuple(l_11, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(m_11, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(n_11, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(o_11, (IStrategoList)transform.constCons5)))))));
                    term = make$Conc_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail89;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                    if(true)
                      break Success84;
                  }
                  term = term81;
                }
                Success85:
                { 
                  if(cons4 == transform._consDecAnnoType_0)
                  { 
                    Fail90:
                    { 
                      term = transform.constS48;
                      if(true)
                        break Success85;
                    }
                    term = term81;
                  }
                  Success86:
                  { 
                    if(cons4 == transform._consDecAnnoConstructor_0)
                    { 
                      Fail91:
                      { 
                        term = transform.constS49;
                        if(true)
                          break Success86;
                      }
                      term = term81;
                    }
                    Success87:
                    { 
                      if(cons4 == transform._consDecAnnoMethod_0)
                      { 
                        Fail92:
                        { 
                          term = transform.constS50;
                          if(true)
                            break Success87;
                        }
                        term = term81;
                      }
                      Success88:
                      { 
                        if(cons4 == transform._consDecAnnoField_0)
                        { 
                          Fail93:
                          { 
                            term = transform.constS51;
                            if(true)
                              break Success88;
                          }
                          term = term81;
                        }
                        Success89:
                        { 
                          if(cons4 == transform._consAspectDec_2)
                          { 
                            Fail94:
                            { 
                              IStrategoTerm j_11 = null;
                              IStrategoTerm k_11 = null;
                              j_11 = term.getSubterm(0);
                              k_11 = term.getSubterm(1);
                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(j_11, termFactory.makeListCons(k_11, (IStrategoList)transform.constNil0))});
                              if(true)
                                break Success89;
                            }
                            term = term81;
                          }
                          Success90:
                          { 
                            if(cons4 == transform._consAspectDecHead_6)
                            { 
                              Fail95:
                              { 
                                IStrategoTerm m_10 = null;
                                IStrategoTerm n_10 = null;
                                IStrategoTerm o_10 = null;
                                IStrategoTerm t_10 = null;
                                IStrategoTerm u_10 = null;
                                IStrategoTerm v_10 = null;
                                IStrategoTerm w_10 = null;
                                IStrategoTerm x_10 = null;
                                IStrategoTerm y_10 = null;
                                IStrategoTerm z_10 = null;
                                IStrategoTerm a_11 = null;
                                IStrategoTerm d_11 = null;
                                IStrategoTerm e_11 = null;
                                m_10 = term.getSubterm(0);
                                n_10 = term.getSubterm(1);
                                o_10 = term.getSubterm(2);
                                u_10 = term.getSubterm(3);
                                w_10 = term.getSubterm(4);
                                y_10 = term.getSubterm(5);
                                a_11 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, o_10);
                                if(term == null)
                                  break Fail95;
                                t_10 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, u_10);
                                if(term == null)
                                  break Fail95;
                                v_10 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, w_10);
                                if(term == null)
                                  break Fail95;
                                x_10 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, y_10);
                                if(term == null)
                                  break Fail95;
                                z_10 = term;
                                term = a_11;
                                e_11 = term;
                                term = termFactory.makeTuple(x_10, z_10);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                term = termFactory.makeTuple(v_10, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                term = termFactory.makeTuple(t_10, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                d_11 = term;
                                term = e_11;
                                IStrategoList list7;
                                list7 = checkListTail(d_11);
                                if(list7 == null)
                                  break Fail95;
                                term = termFactory.makeTuple(m_10, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX35, termFactory.makeListCons(n_10, list7)));
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                                if(true)
                                  break Success90;
                              }
                              term = term81;
                            }
                            Success91:
                            { 
                              if(cons4 == transform._consPerTarget_1)
                              { 
                                Fail96:
                                { 
                                  IStrategoTerm l_10 = null;
                                  l_10 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX36, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(l_10, (IStrategoList)transform.constCons1)))});
                                  if(true)
                                    break Success91;
                                }
                                term = term81;
                              }
                              Success92:
                              { 
                                if(cons4 == transform._consPerThis_1)
                                { 
                                  Fail97:
                                  { 
                                    IStrategoTerm k_10 = null;
                                    k_10 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX37, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(k_10, (IStrategoList)transform.constCons1)))});
                                    if(true)
                                      break Success92;
                                  }
                                  term = term81;
                                }
                                Success93:
                                { 
                                  if(cons4 == transform._consPerCFlow_1)
                                  { 
                                    Fail98:
                                    { 
                                      IStrategoTerm j_10 = null;
                                      j_10 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX38, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(j_10, (IStrategoList)transform.constCons1)))});
                                      if(true)
                                        break Success93;
                                    }
                                    term = term81;
                                  }
                                  Success94:
                                  { 
                                    if(cons4 == transform._consPerCFlowBelow_1)
                                    { 
                                      Fail99:
                                      { 
                                        IStrategoTerm f_10 = null;
                                        f_10 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX39, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(f_10, (IStrategoList)transform.constCons1)))});
                                        if(true)
                                          break Success94;
                                      }
                                      term = term81;
                                    }
                                    Success95:
                                    { 
                                      if(cons4 == transform._consPerTypeWithin_1)
                                      { 
                                        Fail100:
                                        { 
                                          IStrategoTerm e_10 = null;
                                          e_10 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX40, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(e_10, (IStrategoList)transform.constCons1)))});
                                          if(true)
                                            break Success95;
                                        }
                                        term = term81;
                                      }
                                      Success96:
                                      { 
                                        if(cons4 == transform._consIsSingleton_0)
                                        { 
                                          Fail101:
                                          { 
                                            term = transform.constFBOX41;
                                            if(true)
                                              break Success96;
                                          }
                                          term = term81;
                                        }
                                        Success97:
                                        { 
                                          if(cons4 == transform._consAspectBody_1)
                                          { 
                                            Fail102:
                                            { 
                                              IStrategoTerm d_10 = null;
                                              d_10 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constNil0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons16, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX43, termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons17, d_10}), (IStrategoList)transform.constNil0))}), (IStrategoList)transform.constCons14)});
                                              if(true)
                                                break Success97;
                                            }
                                            term = term81;
                                          }
                                          Success98:
                                          { 
                                            if(cons4 == transform._consPrivileged_0)
                                            { 
                                              Fail103:
                                              { 
                                                term = transform.constFBOX44;
                                                if(true)
                                                  break Success98;
                                              }
                                              term = term81;
                                            }
                                            if(cons4 == transform._consProceed_0)
                                            { 
                                              term = transform.constFBOX45;
                                            }
                                            else
                                            { 
                                              break Fail85;
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

  @SuppressWarnings("all") public static class aspectj_to_box_0_0 extends Strategy 
  { 
    public static aspectj_to_box_0_0 instance = new aspectj_to_box_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0");
      Fail104:
      { 
        IStrategoTerm term99 = term;
        IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success99:
        { 
          if(cons5 == transform._consCall_1)
          { 
            Fail105:
            { 
              IStrategoTerm c_21 = null;
              c_21 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX46, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(c_21, (IStrategoList)transform.constCons1)))});
              if(true)
                break Success99;
            }
            term = term99;
          }
          Success100:
          { 
            if(cons5 == transform._consExec_1)
            { 
              Fail106:
              { 
                IStrategoTerm b_21 = null;
                b_21 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX47, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(b_21, (IStrategoList)transform.constCons1)))});
                if(true)
                  break Success100;
              }
              term = term99;
            }
            term = aspectj_to_box_0_0_fragment_4.instance.invoke(context, term);
            if(term == null)
              break Fail104;
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

  @SuppressWarnings("all") public static class has_leftmost_not_0_0 extends Strategy 
  { 
    public static has_leftmost_not_0_0 instance = new has_leftmost_not_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("has_leftmost_not_0_0");
      Fail107:
      { 
        term = d_21.instance.invoke(context, term);
        if(term == null)
          break Fail107;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class option_to_boxes_0_0 extends Strategy 
  { 
    public static option_to_boxes_0_0 instance = new option_to_boxes_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail108:
      { 
        IStrategoTerm term103 = term;
        IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success101:
        { 
          if(cons6 == transform._consSome_1)
          { 
            Fail109:
            { 
              IStrategoTerm e_21 = null;
              e_21 = term.getSubterm(0);
              term = e_21;
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0);
              if(true)
                break Success101;
            }
            term = term103;
          }
          if(cons6 == transform._consNone_0)
          { 
            term = transform.constNil0;
          }
          else
          { 
            break Fail108;
          }
        }
        if(true)
          return term;
      }
      context.push("option_to_boxes_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class pp_aspectj_string_0_0 extends Strategy 
  { 
    public static pp_aspectj_string_0_0 instance = new pp_aspectj_string_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("pp_aspectj_string_0_0");
      Fail110:
      { 
        IStrategoTerm i_21 = null;
        term = pp_java5_to_abox_1_0.instance.invoke(context, term, lifted3.instance);
        if(term == null)
          break Fail110;
        i_21 = term;
        term = box2text_string_0_1.instance.invoke(context, i_21, transform.const68);
        if(term == null)
          break Fail110;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class remove_closures_additions_0_0 extends Strategy 
  { 
    public static remove_closures_additions_0_0 instance = new remove_closures_additions_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail111:
      { 
        IStrategoTerm term105 = term;
        IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success102:
        { 
          if(cons7 == transform._consJoinpointDeclaration_4)
          { 
            Fail112:
            { 
              term = transform.constNone0;
              if(true)
                break Success102;
            }
            term = term105;
          }
          Success103:
          { 
            if(cons7 == transform._consShortClosureJoinpoints_2)
            { 
              Fail113:
              { 
                term = transform.constNone0;
                if(true)
                  break Success103;
              }
              term = term105;
            }
            if(cons7 == transform._consClosureJoinpoints_4)
            { 
              term = transform.constNone0;
            }
            else
            { 
              break Fail111;
            }
          }
        }
        if(true)
          return term;
      }
      context.push("remove_closures_additions_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class closures_to_ajc_0_1 extends Strategy 
  { 
    public static closures_to_ajc_0_1 instance = new closures_to_ajc_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_21)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference m_21 = new TermReference(ref_m_21);
      context.push("closures_to_ajc_0_1");
      Fail114:
      { 
        TermReference o_21 = new TermReference();
        TermReference p_21 = new TermReference();
        IStrategoTerm q_21 = null;
        IStrategoTerm r_21 = null;
        IStrategoTerm x_21 = null;
        IStrategoTerm z_21 = null;
        IStrategoTerm a_22 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail114;
        r_21 = term.getSubterm(0);
        IStrategoTerm arg21 = term.getSubterm(1);
        if(arg21.getTermType() != IStrategoTerm.APPL || transform._consAspectBody_1 != ((IStrategoAppl)arg21).getConstructor())
          break Fail114;
        q_21 = arg21.getSubterm(0);
        term = r_21;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDecHead_6 != ((IStrategoAppl)term).getConstructor())
          break Fail114;
        IStrategoTerm arg23 = term.getSubterm(1);
        if(arg23.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg23).getConstructor())
          break Fail114;
        if(p_21.value == null)
          p_21.value = arg23.getSubterm(0);
        else
          if(p_21.value != arg23.getSubterm(0) && !p_21.value.match(arg23.getSubterm(0)))
            break Fail114;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail114;
        if(o_21.value == null)
          o_21.value = term;
        else
          if(o_21.value != term && !o_21.value.match(term))
            break Fail114;
        term = q_21;
        lifted4 lifted410 = new lifted4();
        lifted410.o_21 = o_21;
        lifted410.m_21 = m_21;
        lifted410.p_21 = p_21;
        term = topdown_1_0.instance.invoke(context, term, lifted410);
        if(term == null)
          break Fail114;
        term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{r_21, termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term})});
        z_21 = term;
        x_21 = transform.constNone0;
        term = z_21;
        a_22 = z_21;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail114;
        term = replace_0_2.instance.invoke(context, a_22, x_21, term);
        if(term == null)
          break Fail114;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class closures_to_ajc_0_3 extends Strategy 
  { 
    public static closures_to_ajc_0_3 instance = new closures_to_ajc_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_46, IStrategoTerm l_46, IStrategoTerm m_46)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closures_to_ajc_0_3");
      Fail115:
      { 
        IStrategoTerm term107 = term;
        IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success104:
        { 
          if(cons8 == transform._consJoinpointDeclaration_4)
          { 
            Fail116:
            { 
              IStrategoTerm d_24 = null;
              IStrategoTerm e_24 = null;
              IStrategoTerm f_24 = null;
              IStrategoTerm g_24 = null;
              d_24 = term.getSubterm(0);
              e_24 = term.getSubterm(1);
              f_24 = term.getSubterm(2);
              g_24 = term.getSubterm(3);
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons19, transform.constNone0, d_24, e_24, f_24, g_24}), transform.constBlock0});
              if(true)
                break Success104;
            }
            term = term107;
          }
          Success105:
          { 
            if(cons8 == transform._consCJPAdvice_4)
            { 
              Fail117:
              { 
                IStrategoTerm n_23 = null;
                IStrategoTerm o_23 = null;
                IStrategoTerm p_23 = null;
                IStrategoTerm q_23 = null;
                IStrategoTerm r_23 = null;
                IStrategoTerm u_23 = null;
                n_23 = term.getSubterm(0);
                IStrategoTerm arg28 = term.getSubterm(1);
                if(arg28.getTermType() != IStrategoTerm.APPL || transform._consCJPAround_3 != ((IStrategoAppl)arg28).getConstructor())
                  break Fail117;
                o_23 = arg28.getSubterm(0);
                IStrategoTerm arg29 = arg28.getSubterm(1);
                if(arg29.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg29).getConstructor())
                  break Fail117;
                p_23 = arg29.getSubterm(0);
                q_23 = arg28.getSubterm(2);
                r_23 = term.getSubterm(3);
                term = map_1_0.instance.invoke(context, q_23, lifted6.instance);
                if(term == null)
                  break Fail117;
                u_23 = term;
                term = map_1_0.instance.invoke(context, q_23, lifted7.instance);
                if(term == null)
                  break Fail117;
                term = termFactory.makeAppl(transform._consAdviceDec_5, new IStrategoTerm[]{n_23, termFactory.makeAppl(transform._consAround_2, new IStrategoTerm[]{o_23, q_23}), transform.constNone0, termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{p_23}), u_23, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})}), r_23});
                if(true)
                  break Success105;
              }
              term = term107;
            }
            Success106:
            { 
              if(cons8 == transform._consCJPAdvice_4)
              { 
                Fail118:
                { 
                  IStrategoTerm x_22 = null;
                  IStrategoTerm y_22 = null;
                  IStrategoTerm z_22 = null;
                  IStrategoTerm a_23 = null;
                  IStrategoTerm d_23 = null;
                  x_22 = term.getSubterm(0);
                  IStrategoTerm arg35 = term.getSubterm(1);
                  if(arg35.getTermType() != IStrategoTerm.APPL || transform._consCJPBefore_2 != ((IStrategoAppl)arg35).getConstructor())
                    break Fail118;
                  IStrategoTerm arg36 = arg35.getSubterm(0);
                  if(arg36.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg36).getConstructor())
                    break Fail118;
                  y_22 = arg36.getSubterm(0);
                  z_22 = arg35.getSubterm(1);
                  a_23 = term.getSubterm(3);
                  term = map_1_0.instance.invoke(context, z_22, lifted8.instance);
                  if(term == null)
                    break Fail118;
                  d_23 = term;
                  term = map_1_0.instance.invoke(context, z_22, lifted9.instance);
                  if(term == null)
                    break Fail118;
                  term = termFactory.makeAppl(transform._consAdviceDec_5, new IStrategoTerm[]{x_22, termFactory.makeAppl(transform._consBefore_1, new IStrategoTerm[]{z_22}), transform.constNone0, termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{y_22}), d_23, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})}), a_23});
                  if(true)
                    break Success106;
                }
                term = term107;
              }
              if(cons8 == transform._consCJPAdvice_4)
              { 
                IStrategoTerm h_22 = null;
                IStrategoTerm i_22 = null;
                IStrategoTerm j_22 = null;
                IStrategoTerm k_22 = null;
                IStrategoTerm n_22 = null;
                h_22 = term.getSubterm(0);
                IStrategoTerm arg42 = term.getSubterm(1);
                if(arg42.getTermType() != IStrategoTerm.APPL || transform._consCJPAfter_2 != ((IStrategoAppl)arg42).getConstructor())
                  break Fail115;
                IStrategoTerm arg43 = arg42.getSubterm(0);
                if(arg43.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg43).getConstructor())
                  break Fail115;
                i_22 = arg43.getSubterm(0);
                j_22 = arg42.getSubterm(1);
                k_22 = term.getSubterm(3);
                term = map_1_0.instance.invoke(context, j_22, lifted10.instance);
                if(term == null)
                  break Fail115;
                n_22 = term;
                term = map_1_0.instance.invoke(context, j_22, lifted11.instance);
                if(term == null)
                  break Fail115;
                term = termFactory.makeAppl(transform._consAdviceDec_5, new IStrategoTerm[]{h_22, termFactory.makeAppl(transform._consAfter_2, new IStrategoTerm[]{j_22, transform.constNone0}), transform.constNone0, termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{i_22}), n_22, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})}), k_22});
              }
              else
              { 
                break Fail115;
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

  @SuppressWarnings("all") public static class replace_0_2 extends Strategy 
  { 
    public static replace_0_2 instance = new replace_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_24, IStrategoTerm ref_i_24)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference i_24 = new TermReference(ref_i_24);
      context.push("replace_0_2");
      Fail119:
      { 
        IStrategoTerm l_24 = null;
        IStrategoTerm m_24 = null;
        IStrategoTerm n_24 = null;
        TermReference o_24 = new TermReference();
        IStrategoTerm p_24 = null;
        IStrategoTerm q_24 = null;
        IStrategoTerm r_24 = null;
        IStrategoTerm s_24 = null;
        IStrategoTerm t_24 = null;
        TermReference u_24 = new TermReference();
        IStrategoTerm v_24 = null;
        IStrategoTerm w_24 = null;
        IStrategoTerm x_24 = null;
        IStrategoTerm y_24 = null;
        IStrategoTerm z_24 = null;
        IStrategoTerm a_25 = null;
        IStrategoTerm b_25 = null;
        IStrategoTerm c_25 = null;
        a_25 = term;
        term = debug_0_0.instance.invoke(context, transform.const70);
        if(term == null)
          break Fail119;
        term = debug_0_0.instance.invoke(context, a_25);
        if(term == null)
          break Fail119;
        c_25 = term;
        b_25 = term;
        term = c_25;
        IStrategoTerm term110 = term;
        Success107:
        { 
          Fail120:
          { 
            IStrategoTerm d_25 = null;
            d_25 = term;
            term = b_25;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
              break Fail120;
            q_24 = term.getSubterm(0);
            IStrategoTerm arg49 = term.getSubterm(1);
            if(arg49.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg49).getConstructor())
              break Fail120;
            l_24 = arg49.getSubterm(0);
            term = d_25;
            { 
              if(i_24.value == null)
                break Fail119;
              term = hashtable_copy_0_0.instance.invoke(context, i_24.value);
              if(term == null)
                break Fail119;
              if(u_24.value == null)
                u_24.value = term;
              else
                if(u_24.value != term && !u_24.value.match(term))
                  break Fail119;
              term = filter_1_0.instance.invoke(context, l_24, lifted12.instance);
              if(term == null)
                break Fail119;
              lifted13 lifted130 = new lifted13();
              lifted130.u_24 = u_24;
              term = map_1_0.instance.invoke(context, term, lifted130);
              if(term == null)
                break Fail119;
              term = l_24;
              lifted15 lifted150 = new lifted15();
              lifted150.u_24 = u_24;
              term = map_1_0.instance.invoke(context, term, lifted150);
              if(term == null)
                break Fail119;
              term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{q_24, termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term})});
              if(true)
                break Success107;
            }
          }
          term = term110;
          IStrategoTerm term111 = term;
          Success108:
          { 
            Fail121:
            { 
              IStrategoTerm g_25 = null;
              g_25 = term;
              term = b_25;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDec_2 != ((IStrategoAppl)term).getConstructor())
                break Fail121;
              q_24 = term.getSubterm(0);
              IStrategoTerm arg54 = term.getSubterm(1);
              if(arg54.getTermType() != IStrategoTerm.APPL || transform._consAspectBody_1 != ((IStrategoAppl)arg54).getConstructor())
                break Fail121;
              l_24 = arg54.getSubterm(0);
              term = g_25;
              { 
                if(i_24.value == null)
                  break Fail119;
                term = hashtable_copy_0_0.instance.invoke(context, i_24.value);
                if(term == null)
                  break Fail119;
                if(u_24.value == null)
                  u_24.value = term;
                else
                  if(u_24.value != term && !u_24.value.match(term))
                    break Fail119;
                term = filter_1_0.instance.invoke(context, l_24, lifted16.instance);
                if(term == null)
                  break Fail119;
                lifted17 lifted170 = new lifted17();
                lifted170.u_24 = u_24;
                term = map_1_0.instance.invoke(context, term, lifted170);
                if(term == null)
                  break Fail119;
                term = l_24;
                lifted19 lifted190 = new lifted19();
                lifted190.u_24 = u_24;
                term = map_1_0.instance.invoke(context, term, lifted190);
                if(term == null)
                  break Fail119;
                term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{q_24, termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term})});
                if(true)
                  break Success108;
              }
            }
            term = term111;
            IStrategoTerm term112 = term;
            Success109:
            { 
              Fail122:
              { 
                IStrategoTerm j_25 = null;
                j_25 = term;
                term = b_25;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail122;
                m_24 = term.getSubterm(0);
                term = j_25;
                { 
                  term = debug_0_0.instance.invoke(context, transform.const71);
                  if(term == null)
                    break Fail119;
                  if(i_24.value == null)
                    break Fail119;
                  term = hashtable_copy_0_0.instance.invoke(context, i_24.value);
                  if(term == null)
                    break Fail119;
                  if(u_24.value == null)
                    u_24.value = term;
                  else
                    if(u_24.value != term && !u_24.value.match(term))
                      break Fail119;
                  term = m_24;
                  lifted20 lifted200 = new lifted20();
                  lifted200.u_24 = u_24;
                  term = map_1_0.instance.invoke(context, term, lifted200);
                  if(term == null)
                    break Fail119;
                  term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success109;
                }
              }
              term = term112;
              IStrategoTerm term113 = term;
              Success110:
              { 
                Fail123:
                { 
                  IStrategoTerm k_25 = null;
                  k_25 = term;
                  term = b_25;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail123;
                  IStrategoTerm arg59 = term.getSubterm(0);
                  if(arg59.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg59).getConstructor())
                    break Fail123;
                  n_24 = arg59.getSubterm(0);
                  if(o_24.value == null)
                    o_24.value = arg59.getSubterm(1);
                  else
                    if(o_24.value != arg59.getSubterm(1) && !o_24.value.match(arg59.getSubterm(1)))
                      break Fail123;
                  p_24 = arg59.getSubterm(2);
                  term = k_25;
                  { 
                    IStrategoTerm i_26 = null;
                    IStrategoTerm j_26 = null;
                    term = debug_0_0.instance.invoke(context, transform.const72);
                    if(term == null)
                      break Fail119;
                    j_26 = term;
                    term = p_24;
                    lifted21 lifted210 = new lifted21();
                    lifted210.o_24 = o_24;
                    lifted210.i_24 = i_24;
                    term = map_1_0.instance.invoke(context, term, lifted210);
                    if(term == null)
                      break Fail119;
                    i_26 = term;
                    term = j_26;
                    if(o_24.value == null)
                      break Fail119;
                    term = termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{n_24, o_24.value, i_26})});
                    if(true)
                      break Success110;
                  }
                }
                term = term113;
                IStrategoTerm term114 = term;
                Success111:
                { 
                  Fail124:
                  { 
                    IStrategoTerm l_25 = null;
                    l_25 = term;
                    term = b_25;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
                      break Fail124;
                    q_24 = term.getSubterm(0);
                    r_24 = term.getSubterm(1);
                    term = l_25;
                    { 
                      IStrategoTerm n_26 = null;
                      term = debug_0_0.instance.invoke(context, transform.const73);
                      if(term == null)
                        break Fail119;
                      if(i_24.value == null)
                        break Fail119;
                      term = hashtable_copy_0_0.instance.invoke(context, i_24.value);
                      if(term == null)
                        break Fail119;
                      if(u_24.value == null)
                        u_24.value = term;
                      else
                        if(u_24.value != term && !u_24.value.match(term))
                          break Fail119;
                      term = q_24;
                      lifted22 lifted220 = new lifted22();
                      lifted220.u_24 = u_24;
                      term = topdown_1_0.instance.invoke(context, term, lifted220);
                      if(term == null)
                        break Fail119;
                      n_26 = r_24;
                      term = this.invoke(context, n_26, transform.constNone0, u_24.value);
                      if(term == null)
                        break Fail119;
                      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{q_24, term});
                      if(true)
                        break Success111;
                    }
                  }
                  term = term114;
                  IStrategoTerm term115 = term;
                  Success112:
                  { 
                    Fail125:
                    { 
                      IStrategoTerm m_25 = null;
                      m_25 = term;
                      term = b_25;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail125;
                      IStrategoTerm arg60 = term.getSubterm(0);
                      if(arg60.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg60).getConstructor())
                        break Fail125;
                      s_24 = arg60.getSubterm(0);
                      term = m_25;
                      { 
                        if(i_24.value == null)
                          break Fail119;
                        term = add_var_0_2.instance.invoke(context, i_24.value, s_24, h_24);
                        if(term == null)
                          break Fail119;
                        term = a_25;
                        if(true)
                          break Success112;
                      }
                    }
                    term = term115;
                    IStrategoTerm term116 = term;
                    Success113:
                    { 
                      Fail126:
                      { 
                        IStrategoTerm n_25 = null;
                        n_25 = term;
                        term = b_25;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
                          break Fail126;
                        IStrategoTerm arg61 = term.getSubterm(0);
                        if(arg61.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg61).getConstructor())
                          break Fail126;
                        s_24 = arg61.getSubterm(0);
                        x_24 = term.getSubterm(1);
                        term = n_25;
                        { 
                          term = debug_0_0.instance.invoke(context, transform.const74);
                          if(term == null)
                            break Fail119;
                          if(i_24.value == null)
                            break Fail119;
                          term = add_var_0_2.instance.invoke(context, i_24.value, s_24, h_24);
                          if(term == null)
                            break Fail119;
                          term = this.invoke(context, x_24, h_24, i_24.value);
                          if(term == null)
                            break Fail119;
                          term = termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{s_24}), term});
                          if(true)
                            break Success113;
                        }
                      }
                      term = term116;
                      IStrategoTerm term117 = term;
                      Success114:
                      { 
                        Fail127:
                        { 
                          IStrategoTerm o_25 = null;
                          o_25 = term;
                          term = b_25;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consShortClosureJoinpoints_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail127;
                          term = o_25;
                          { 
                            term = debug_0_0.instance.invoke(context, transform.const75);
                            if(term == null)
                              break Fail119;
                            term = closure_to_java_0_2.instance.invoke(context, a_25, h_24, i_24.value);
                            if(term == null)
                              break Fail119;
                            if(true)
                              break Success114;
                          }
                        }
                        term = term117;
                        IStrategoTerm term118 = term;
                        Success115:
                        { 
                          Fail128:
                          { 
                            IStrategoTerm r_25 = null;
                            r_25 = term;
                            term = b_25;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consClosureJoinpoints_4 != ((IStrategoAppl)term).getConstructor())
                              break Fail128;
                            s_24 = term.getSubterm(0);
                            t_24 = term.getSubterm(1);
                            v_24 = term.getSubterm(2);
                            w_24 = term.getSubterm(3);
                            term = r_25;
                            { 
                              IStrategoTerm w_26 = null;
                              term = debug_0_0.instance.invoke(context, transform.const76);
                              if(term == null)
                                break Fail119;
                              if(i_24.value == null)
                                break Fail119;
                              term = hashtable_copy_0_0.instance.invoke(context, i_24.value);
                              if(term == null)
                                break Fail119;
                              if(u_24.value == null)
                                u_24.value = term;
                              else
                                if(u_24.value != term && !u_24.value.match(term))
                                  break Fail119;
                              term = t_24;
                              lifted24 lifted240 = new lifted24();
                              lifted240.u_24 = u_24;
                              term = topdown_1_0.instance.invoke(context, term, lifted240);
                              if(term == null)
                                break Fail119;
                              w_26 = v_24;
                              term = this.invoke(context, w_26, transform.constNone0, u_24.value);
                              if(term == null)
                                break Fail119;
                              term = termFactory.makeAppl(transform._consClosureJoinpoints_4, new IStrategoTerm[]{s_24, t_24, term, w_24});
                              term = closure_to_java_0_2.instance.invoke(context, term, h_24, i_24.value);
                              if(term == null)
                                break Fail119;
                              if(true)
                                break Success115;
                            }
                          }
                          term = term118;
                          IStrategoTerm term119 = term;
                          Success116:
                          { 
                            Fail129:
                            { 
                              IStrategoTerm s_25 = null;
                              s_25 = term;
                              term = b_25;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
                                break Fail129;
                              x_24 = term.getSubterm(0);
                              term = s_25;
                              { 
                                IStrategoTerm c_27 = null;
                                c_27 = x_24;
                                term = this.invoke(context, c_27, transform.constNone0, i_24.value);
                                if(term == null)
                                  break Fail119;
                                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{term});
                                if(true)
                                  break Success116;
                              }
                            }
                            term = term119;
                            Success117:
                            { 
                              Fail130:
                              { 
                                IStrategoTerm t_25 = null;
                                t_25 = term;
                                term = b_25;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
                                  break Fail130;
                                y_24 = term.getSubterm(0);
                                z_24 = term.getSubterm(1);
                                term = t_25;
                                { 
                                  IStrategoTerm m_27 = null;
                                  term = debug_0_0.instance.invoke(context, transform.const77);
                                  if(term == null)
                                    break Fail119;
                                  m_27 = z_24;
                                  term = get_var_type_0_1.instance.invoke(context, y_24, i_24.value);
                                  if(term == null)
                                    break Fail119;
                                  term = this.invoke(context, m_27, term, i_24.value);
                                  if(term == null)
                                    break Fail119;
                                  term = termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{y_24, term});
                                  if(true)
                                    break Success117;
                                }
                              }
                              term = debug_0_0.instance.invoke(context, transform.const78);
                              if(term == null)
                                break Fail119;
                              term = debug_0_0.instance.invoke(context, a_25);
                              if(term == null)
                                break Fail119;
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

  @SuppressWarnings("all") public static class add_param_0_1 extends Strategy 
  { 
    public static add_param_0_1 instance = new add_param_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_27)
    { 
      context.push("add_param_0_1");
      Fail131:
      { 
        TermReference o_27 = new TermReference();
        TermReference p_27 = new TermReference();
        lifted27 lifted270 = new lifted27();
        lifted26 lifted260 = new lifted26();
        lifted270.p_27 = p_27;
        lifted270.o_27 = o_27;
        lifted260.p_27 = p_27;
        lifted260.o_27 = o_27;
        term = or_2_0.instance.invoke(context, term, lifted260, lifted270);
        if(term == null)
          break Fail131;
        term = add_var_0_2.instance.invoke(context, n_27, o_27.value, p_27.value);
        if(term == null)
          break Fail131;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_var_type_0_1 extends Strategy 
  { 
    public static get_var_type_0_1 instance = new get_var_type_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_27)
    { 
      context.push("get_var_type_0_1");
      Fail132:
      { 
        IStrategoTerm r_27 = null;
        Success118:
        { 
          Fail133:
          { 
            IStrategoTerm t_27 = null;
            t_27 = term;
            term = get_var_type_impl_0_1.instance.invoke(context, term, q_27);
            if(term == null)
              break Fail133;
            r_27 = term;
            term = t_27;
            { 
              term = r_27;
              if(true)
                break Success118;
            }
          }
          term = transform.constNone0;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_var_type_impl_0_1 extends Strategy 
  { 
    public static get_var_type_impl_0_1 instance = new get_var_type_impl_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_46)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("get_var_type_impl_0_1");
      Fail134:
      { 
        IStrategoTerm term122 = term;
        IStrategoConstructor cons9 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success119:
        { 
          if(cons9 == transform._consExprName_1)
          { 
            Fail135:
            { 
              IStrategoTerm c_28 = null;
              c_28 = term.getSubterm(0);
              term = get_var_type_0_1.instance.invoke(context, c_28, n_46);
              if(term == null)
                break Fail135;
              if(true)
                break Success119;
            }
            term = term122;
          }
          if(cons9 == transform._consId_1)
          { 
            IStrategoTerm x_27 = null;
            x_27 = term.getSubterm(0);
            IStrategoTerm term123 = term;
            Success120:
            { 
              Fail136:
              { 
                IStrategoTerm y_27 = null;
                y_27 = term;
                term = hashtable_keys_0_0.instance.invoke(context, n_46);
                if(term == null)
                  break Fail136;
                term = termFactory.makeTuple(x_27, term);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail136;
                term = y_27;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, n_46, x_27);
                  if(term == null)
                    break Fail134;
                  if(true)
                    break Success120;
                }
              }
              term = $None_0_0.instance.invoke(context, term123);
              if(term == null)
                break Fail134;
            }
          }
          else
          { 
            break Fail134;
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

  @SuppressWarnings("all") public static class add_var_0_2 extends Strategy 
  { 
    public static add_var_0_2 instance = new add_var_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_46, IStrategoTerm p_46)
    { 
      context.push("add_var_0_2");
      Fail137:
      { 
        IStrategoTerm term124 = term;
        Success121:
        { 
          Fail138:
          { 
            term = hashtable_put_0_2.instance.invoke(context, term, o_46, p_46);
            if(term == null)
              break Fail138;
            if(true)
              break Success121;
          }
          term = term124;
          TermReference f_28 = new TermReference();
          lifted29 lifted290 = new lifted29();
          lifted28 lifted280 = new lifted28();
          lifted290.f_28 = f_28;
          lifted280.f_28 = f_28;
          term = or_2_0.instance.invoke(context, term, lifted280, lifted290);
          if(term == null)
            break Fail137;
          term = this.invoke(context, p_46, f_28.value, o_46);
          if(term == null)
            break Fail137;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class discover_return_type_0_0 extends Strategy 
  { 
    public static discover_return_type_0_0 instance = new discover_return_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("discover_return_type_0_0");
      Fail139:
      { 
        IStrategoTerm l_28 = null;
        TermReference m_28 = new TermReference();
        term = topdown_1_0.instance.invoke(context, term, lifted30.instance);
        if(term == null)
          break Fail139;
        l_28 = term;
        term = debug_0_0.instance.invoke(context, transform.const79);
        if(term == null)
          break Fail139;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail139;
        if(m_28.value == null)
          m_28.value = term;
        else
          if(m_28.value != term && !m_28.value.match(term))
            break Fail139;
        term = l_28;
        lifted32 lifted320 = new lifted32();
        lifted320.m_28 = m_28;
        term = fetch_elem_1_0.instance.invoke(context, term, lifted320);
        if(term == null)
          break Fail139;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class discover_return_type_impl_0_1 extends Strategy 
  { 
    public static discover_return_type_impl_0_1 instance = new discover_return_type_impl_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_28)
    { 
      TermReference t_28 = new TermReference(ref_t_28);
      context.push("discover_return_type_impl_0_1");
      Fail140:
      { 
        IStrategoTerm u_28 = null;
        IStrategoTerm x_28 = null;
        IStrategoTerm y_28 = null;
        IStrategoTerm z_28 = null;
        TermReference a_29 = new TermReference();
        IStrategoTerm c_29 = null;
        IStrategoTerm e_29 = null;
        IStrategoTerm f_29 = null;
        IStrategoTerm g_29 = null;
        u_28 = term;
        term = debug_0_0.instance.invoke(context, transform.const80);
        if(term == null)
          break Fail140;
        term = debug_0_0.instance.invoke(context, u_28);
        if(term == null)
          break Fail140;
        g_29 = term;
        f_29 = term;
        term = g_29;
        IStrategoTerm term125 = term;
        Success122:
        { 
          Fail141:
          { 
            IStrategoTerm h_29 = null;
            h_29 = term;
            term = f_29;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
              break Fail141;
            y_28 = term.getSubterm(0);
            term = h_29;
            { 
              term = y_28;
              lifted33 lifted330 = new lifted33();
              lifted330.t_28 = t_28;
              term = fetch_elem_1_0.instance.invoke(context, term, lifted330);
              if(term == null)
                break Fail140;
              if(true)
                break Success122;
            }
          }
          term = term125;
          IStrategoTerm term126 = term;
          Success123:
          { 
            Fail142:
            { 
              IStrategoTerm i_29 = null;
              i_29 = term;
              term = f_29;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
                break Fail142;
              IStrategoTerm arg72 = term.getSubterm(0);
              if(arg72.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg72).getConstructor())
                break Fail142;
              if(a_29.value == null)
                a_29.value = arg72.getSubterm(1);
              else
                if(a_29.value != arg72.getSubterm(1) && !a_29.value.match(arg72.getSubterm(1)))
                  break Fail142;
              x_28 = arg72.getSubterm(2);
              term = i_29;
              { 
                term = x_28;
                lifted34 lifted340 = new lifted34();
                lifted340.a_29 = a_29;
                lifted340.t_28 = t_28;
                term = map_1_0.instance.invoke(context, term, lifted340);
                if(term == null)
                  break Fail140;
                if(true)
                  break Fail140;
                if(true)
                  break Success123;
              }
            }
            term = term126;
            IStrategoTerm term127 = term;
            Success124:
            { 
              Fail143:
              { 
                IStrategoTerm j_29 = null;
                j_29 = term;
                term = f_29;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_2 != ((IStrategoAppl)term).getConstructor())
                  break Fail143;
                y_28 = term.getSubterm(1);
                term = j_29;
                { 
                  IStrategoTerm w_29 = null;
                  term = debug_0_0.instance.invoke(context, y_28);
                  if(term == null)
                    break Fail140;
                  w_29 = term;
                  if(t_28.value == null)
                    break Fail140;
                  term = hashtable_copy_0_0.instance.invoke(context, t_28.value);
                  if(term == null)
                    break Fail140;
                  term = this.invoke(context, w_29, term);
                  if(term == null)
                    break Fail140;
                  if(true)
                    break Success124;
                }
              }
              term = term127;
              IStrategoTerm term128 = term;
              Success125:
              { 
                Fail144:
                { 
                  IStrategoTerm k_29 = null;
                  k_29 = term;
                  term = f_29;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_3 != ((IStrategoAppl)term).getConstructor())
                    break Fail144;
                  z_28 = term.getSubterm(1);
                  c_29 = term.getSubterm(2);
                  term = k_29;
                  { 
                    Success126:
                    { 
                      Fail145:
                      { 
                        IStrategoTerm l_29 = null;
                        IStrategoTerm z_29 = null;
                        l_29 = term;
                        term = z_28;
                        z_29 = z_28;
                        if(t_28.value == null)
                          break Fail145;
                        term = hashtable_copy_0_0.instance.invoke(context, t_28.value);
                        if(term == null)
                          break Fail145;
                        term = this.invoke(context, z_29, term);
                        if(term == null)
                          break Fail145;
                        if(a_29.value == null)
                          a_29.value = term;
                        else
                          if(a_29.value != term && !a_29.value.match(term))
                            break Fail145;
                        term = l_29;
                        { 
                          if(a_29.value == null)
                            break Fail140;
                          term = a_29.value;
                          if(true)
                            break Success126;
                        }
                      }
                      IStrategoTerm b_30 = null;
                      term = c_29;
                      b_30 = c_29;
                      if(t_28.value == null)
                        break Fail140;
                      term = hashtable_copy_0_0.instance.invoke(context, t_28.value);
                      if(term == null)
                        break Fail140;
                      term = this.invoke(context, b_30, term);
                      if(term == null)
                        break Fail140;
                    }
                    if(true)
                      break Success125;
                  }
                }
                term = term128;
                IStrategoTerm term130 = term;
                Success127:
                { 
                  Fail146:
                  { 
                    IStrategoTerm m_29 = null;
                    m_29 = term;
                    term = f_29;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                      break Fail146;
                    e_29 = term.getSubterm(3);
                    term = m_29;
                    { 
                      IStrategoTerm d_30 = null;
                      term = e_29;
                      d_30 = e_29;
                      if(t_28.value == null)
                        break Fail140;
                      term = hashtable_copy_0_0.instance.invoke(context, t_28.value);
                      if(term == null)
                        break Fail140;
                      term = this.invoke(context, d_30, term);
                      if(term == null)
                        break Fail140;
                      if(true)
                        break Success127;
                    }
                  }
                  term = term130;
                  IStrategoTerm term131 = term;
                  Success128:
                  { 
                    Fail147:
                    { 
                      IStrategoTerm n_29 = null;
                      n_29 = term;
                      term = f_29;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consForEach_3 != ((IStrategoAppl)term).getConstructor())
                        break Fail147;
                      e_29 = term.getSubterm(2);
                      term = n_29;
                      { 
                        IStrategoTerm j_30 = null;
                        term = e_29;
                        j_30 = e_29;
                        if(t_28.value == null)
                          break Fail140;
                        term = hashtable_copy_0_0.instance.invoke(context, t_28.value);
                        if(term == null)
                          break Fail140;
                        term = this.invoke(context, j_30, term);
                        if(term == null)
                          break Fail140;
                        if(true)
                          break Success128;
                      }
                    }
                    term = term131;
                    IStrategoTerm term132 = term;
                    Success129:
                    { 
                      Fail148:
                      { 
                        IStrategoTerm o_29 = null;
                        o_29 = term;
                        term = f_29;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consWhile_2 != ((IStrategoAppl)term).getConstructor())
                          break Fail148;
                        e_29 = term.getSubterm(1);
                        term = o_29;
                        { 
                          IStrategoTerm l_30 = null;
                          term = e_29;
                          l_30 = e_29;
                          if(t_28.value == null)
                            break Fail140;
                          term = hashtable_copy_0_0.instance.invoke(context, t_28.value);
                          if(term == null)
                            break Fail140;
                          term = this.invoke(context, l_30, term);
                          if(term == null)
                            break Fail140;
                          if(true)
                            break Success129;
                        }
                      }
                      term = term132;
                      Success130:
                      { 
                        Fail149:
                        { 
                          IStrategoTerm p_29 = null;
                          p_29 = term;
                          term = f_29;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail149;
                          e_29 = term.getSubterm(0);
                          term = p_29;
                          { 
                            IStrategoTerm e_31 = null;
                            term = e_29;
                            e_31 = e_29;
                            if(t_28.value == null)
                              break Fail140;
                            term = hashtable_copy_0_0.instance.invoke(context, t_28.value);
                            if(term == null)
                              break Fail140;
                            term = this.invoke(context, e_31, term);
                            if(term == null)
                              break Fail140;
                            if(true)
                              break Success130;
                          }
                        }
                        term = f_29;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consReturn_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail140;
                        IStrategoTerm arg83 = term.getSubterm(0);
                        if(arg83.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg83).getConstructor())
                          break Fail140;
                        e_29 = arg83.getSubterm(0);
                        term = get_type_from_return_stmt_0_1.instance.invoke(context, e_29, t_28.value);
                        if(term == null)
                          break Fail140;
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

  @SuppressWarnings("all") public static class get_type_from_return_stmt_0_1 extends Strategy 
  { 
    public static get_type_from_return_stmt_0_1 instance = new get_type_from_return_stmt_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_31)
    { 
      context.push("get_type_from_return_stmt_0_1");
      Fail150:
      { 
        IStrategoTerm n_31 = null;
        IStrategoTerm e_32 = null;
        IStrategoTerm f_32 = null;
        IStrategoTerm d_33 = null;
        d_33 = term;
        f_32 = term;
        term = d_33;
        IStrategoTerm term134 = term;
        Success131:
        { 
          Fail151:
          { 
            IStrategoTerm e_33 = null;
            e_33 = term;
            term = or_2_0.instance.invoke(context, f_32, lifted35.instance, lifted36.instance);
            if(term == null)
              break Fail151;
            term = e_33;
            { 
              term = transform.constBoolean0;
              if(true)
                break Success131;
            }
          }
          term = term134;
          IStrategoTerm term135 = term;
          Success132:
          { 
            Fail152:
            { 
              IStrategoTerm f_33 = null;
              f_33 = term;
              term = or_2_0.instance.invoke(context, f_32, lifted37.instance, lifted38.instance);
              if(term == null)
                break Fail152;
              term = f_33;
              { 
                term = transform.constDouble0;
                if(true)
                  break Success132;
              }
            }
            term = term135;
            IStrategoTerm term136 = term;
            Success133:
            { 
              Fail153:
              { 
                IStrategoTerm k_33 = null;
                k_33 = term;
                term = or_2_0.instance.invoke(context, f_32, lifted39.instance, lifted40.instance);
                if(term == null)
                  break Fail153;
                term = k_33;
                { 
                  term = transform.constClassOrInterfaceType0;
                  if(true)
                    break Success133;
                }
              }
              term = term136;
              IStrategoTerm term137 = term;
              Success134:
              { 
                Fail154:
                { 
                  IStrategoTerm l_33 = null;
                  l_33 = term;
                  term = or_2_0.instance.invoke(context, f_32, lifted41.instance, lifted44.instance);
                  if(term == null)
                    break Fail154;
                  term = l_33;
                  { 
                    term = transform.constDouble0;
                    if(true)
                      break Success134;
                  }
                }
                term = term137;
                IStrategoTerm term138 = term;
                Success135:
                { 
                  Fail155:
                  { 
                    IStrategoTerm m_33 = null;
                    m_33 = term;
                    term = f_32;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_2 != ((IStrategoAppl)term).getConstructor())
                      break Fail155;
                    term = m_33;
                    { 
                      term = transform.constDouble0;
                      if(true)
                        break Success135;
                    }
                  }
                  term = term138;
                  IStrategoTerm term139 = term;
                  Success136:
                  { 
                    Fail156:
                    { 
                      IStrategoTerm n_33 = null;
                      n_33 = term;
                      term = f_32;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consMul_2 != ((IStrategoAppl)term).getConstructor())
                        break Fail156;
                      term = n_33;
                      { 
                        term = transform.constDouble0;
                        if(true)
                          break Success136;
                      }
                    }
                    term = term139;
                    IStrategoTerm term140 = term;
                    Success137:
                    { 
                      Fail157:
                      { 
                        IStrategoTerm s_33 = null;
                        s_33 = term;
                        term = f_32;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consRemain_2 != ((IStrategoAppl)term).getConstructor())
                          break Fail157;
                        term = s_33;
                        { 
                          term = transform.constDouble0;
                          if(true)
                            break Success137;
                        }
                      }
                      term = term140;
                      IStrategoTerm term141 = term;
                      Success138:
                      { 
                        Fail158:
                        { 
                          IStrategoTerm t_33 = null;
                          t_33 = term;
                          term = f_32;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDiv_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail158;
                          term = t_33;
                          { 
                            term = transform.constDouble0;
                            if(true)
                              break Success138;
                          }
                        }
                        term = term141;
                        IStrategoTerm term142 = term;
                        Success139:
                        { 
                          Fail159:
                          { 
                            IStrategoTerm u_33 = null;
                            u_33 = term;
                            term = f_32;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)term).getConstructor())
                              break Fail159;
                            IStrategoTerm arg122 = term.getSubterm(0);
                            if(arg122.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg122).getConstructor())
                              break Fail159;
                            n_31 = arg122.getSubterm(0);
                            term = u_33;
                            { 
                              term = hashtable_get_0_1.instance.invoke(context, l_31, n_31);
                              if(term == null)
                                break Fail150;
                              if(true)
                                break Success139;
                            }
                          }
                          term = term142;
                          Success140:
                          { 
                            Fail160:
                            { 
                              IStrategoTerm v_33 = null;
                              v_33 = term;
                              term = f_32;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)term).getConstructor())
                                break Fail160;
                              e_32 = term.getSubterm(0);
                              term = v_33;
                              { 
                                term = cast_return_type_0_0.instance.invoke(context, e_32);
                                if(term == null)
                                  break Fail150;
                                if(true)
                                  break Success140;
                              }
                            }
                            term = debug_0_0.instance.invoke(context, transform.const82);
                            if(term == null)
                              break Fail150;
                            if(true)
                              break Fail150;
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

  @SuppressWarnings("all") public static class cast_return_type_0_0 extends Strategy 
  { 
    public static cast_return_type_0_0 instance = new cast_return_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("cast_return_type_0_0");
      Fail161:
      { 
        IStrategoTerm y_33 = null;
        IStrategoTerm z_33 = null;
        IStrategoTerm a_34 = null;
        y_33 = term;
        a_34 = term;
        z_33 = y_33;
        term = a_34;
        IStrategoTerm term144 = term;
        Success141:
        { 
          Fail162:
          { 
            IStrategoTerm b_34 = null;
            b_34 = term;
            term = z_33;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail162;
            term = b_34;
            { 
              term = transform.constByte0;
              if(true)
                break Success141;
            }
          }
          term = term144;
          IStrategoTerm term145 = term;
          Success142:
          { 
            Fail163:
            { 
              IStrategoTerm c_34 = null;
              c_34 = term;
              term = or_2_0.instance.invoke(context, z_33, lifted47.instance, lifted48.instance);
              if(term == null)
                break Fail163;
              term = c_34;
              { 
                term = transform.constChar0;
                if(true)
                  break Success142;
              }
            }
            term = term145;
            IStrategoTerm term146 = term;
            Success143:
            { 
              Fail164:
              { 
                IStrategoTerm d_34 = null;
                d_34 = term;
                term = z_33;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail164;
                term = d_34;
                { 
                  term = transform.constDouble0;
                  if(true)
                    break Success143;
                }
              }
              term = term146;
              IStrategoTerm term147 = term;
              Success144:
              { 
                Fail165:
                { 
                  IStrategoTerm e_34 = null;
                  e_34 = term;
                  term = z_33;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail165;
                  term = e_34;
                  { 
                    term = transform.constDouble0;
                    if(true)
                      break Success144;
                  }
                }
                term = term147;
                IStrategoTerm term148 = term;
                Success145:
                { 
                  Fail166:
                  { 
                    IStrategoTerm f_34 = null;
                    f_34 = term;
                    term = z_33;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail166;
                    term = f_34;
                    { 
                      term = transform.constDouble0;
                      if(true)
                        break Success145;
                    }
                  }
                  term = term148;
                  IStrategoTerm term149 = term;
                  Success146:
                  { 
                    Fail167:
                    { 
                      IStrategoTerm g_34 = null;
                      g_34 = term;
                      term = z_33;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail167;
                      term = g_34;
                      { 
                        term = transform.constDouble0;
                        if(true)
                          break Success146;
                      }
                    }
                    term = term149;
                    IStrategoTerm term150 = term;
                    Success147:
                    { 
                      Fail168:
                      { 
                        IStrategoTerm h_34 = null;
                        h_34 = term;
                        term = or_2_0.instance.invoke(context, z_33, lifted49.instance, lifted50.instance);
                        if(term == null)
                          break Fail168;
                        term = h_34;
                        { 
                          term = transform.constDouble0;
                          if(true)
                            break Success147;
                        }
                      }
                      term = term150;
                      IStrategoTerm term151 = term;
                      Success148:
                      { 
                        Fail169:
                        { 
                          IStrategoTerm i_34 = null;
                          i_34 = term;
                          term = z_33;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail169;
                          term = i_34;
                          { 
                            term = transform.constDouble0;
                            if(true)
                              break Success148;
                          }
                        }
                        term = term151;
                        Success149:
                        { 
                          Fail170:
                          { 
                            IStrategoTerm j_34 = null;
                            j_34 = term;
                            term = z_33;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consString_1 != ((IStrategoAppl)term).getConstructor())
                              break Fail170;
                            term = j_34;
                            { 
                              term = transform.constClassOrInterfaceType0;
                              if(true)
                                break Success149;
                            }
                          }
                          term = debug_0_0.instance.invoke(context, transform.const83);
                          if(term == null)
                            break Fail161;
                          term = debug_0_0.instance.invoke(context, y_33);
                          if(term == null)
                            break Fail161;
                          if(true)
                            break Fail161;
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

  @SuppressWarnings("all") public static class closures_to_java_0_0 extends Strategy 
  { 
    public static closures_to_java_0_0 instance = new closures_to_java_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("closures_to_java_0_0");
      Fail171:
      { 
        IStrategoTerm q_34 = null;
        IStrategoTerm s_34 = null;
        IStrategoTerm t_34 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail171;
        IStrategoTerm arg127 = term.getSubterm(1);
        if(arg127.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg127).getConstructor())
          break Fail171;
        s_34 = term;
        q_34 = transform.constNone0;
        term = s_34;
        t_34 = s_34;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail171;
        term = replace_0_2.instance.invoke(context, t_34, q_34, term);
        if(term == null)
          break Fail171;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class closure_to_java_0_2 extends Strategy 
  { 
    public static closure_to_java_0_2 instance = new closure_to_java_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_34, IStrategoTerm x_34)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closure_to_java_0_2");
      Fail172:
      { 
        TermReference y_34 = new TermReference();
        IStrategoTerm z_34 = null;
        IStrategoTerm a_35 = null;
        lifted52 lifted520 = new lifted52();
        lifted51 lifted511 = new lifted51();
        lifted520.y_34 = y_34;
        lifted511.y_34 = y_34;
        term = or_2_0.instance.invoke(context, term, lifted511, lifted520);
        if(term == null)
          break Fail172;
        a_35 = term;
        term = debug_0_0.instance.invoke(context, transform.const84);
        if(term == null)
          break Fail172;
        Success150:
        { 
          Fail173:
          { 
            IStrategoTerm b_35 = null;
            b_35 = term;
            term = termFactory.makeTuple(w_34, transform.constNone0);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail173;
            term = b_35;
            { 
              term = debug_0_0.instance.invoke(context, transform.const85);
              if(term == null)
                break Fail172;
              Success151:
              { 
                Fail174:
                { 
                  IStrategoTerm c_35 = null;
                  c_35 = term;
                  if(y_34.value == null)
                    break Fail174;
                  term = get_return_type_from_block_0_1.instance.invoke(context, y_34.value, x_34);
                  if(term == null)
                    break Fail174;
                  z_34 = term;
                  term = c_35;
                  { 
                    term = debug_0_0.instance.invoke(context, transform.const86);
                    if(term == null)
                      break Fail172;
                    term = closure_to_java_impl_0_1.instance.invoke(context, a_35, z_34);
                    if(term == null)
                      break Fail172;
                    if(true)
                      break Success151;
                  }
                }
                IStrategoTerm g_35 = null;
                term = debug_0_0.instance.invoke(context, transform.const87);
                if(term == null)
                  break Fail172;
                g_35 = a_35;
                term = closure_to_java_impl_0_1.instance.invoke(context, g_35, transform.constClassOrInterfaceType1);
                if(term == null)
                  break Fail172;
              }
              if(true)
                break Success150;
            }
          }
          term = debug_0_0.instance.invoke(context, transform.const89);
          if(term == null)
            break Fail172;
          term = closure_to_java_impl_0_1.instance.invoke(context, a_35, w_34);
          if(term == null)
            break Fail172;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_return_type_from_block_0_1 extends Strategy 
  { 
    public static get_return_type_from_block_0_1 instance = new get_return_type_from_block_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_35)
    { 
      context.push("get_return_type_from_block_0_1");
      Fail175:
      { 
        IStrategoTerm i_35 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
          break Fail175;
        i_35 = term.getSubterm(0);
        term = debug_0_0.instance.invoke(context, transform.const90);
        if(term == null)
          break Fail175;
        Success152:
        { 
          Fail176:
          { 
            IStrategoTerm j_35 = null;
            j_35 = term;
            term = is_return_stmt_exist_0_0.instance.invoke(context, i_35);
            if(term == null)
              break Fail176;
            term = j_35;
            { 
              term = debug_0_0.instance.invoke(context, transform.const91);
              if(term == null)
                break Fail175;
              term = discover_return_type_0_0.instance.invoke(context, i_35);
              if(term == null)
                break Fail175;
              term = debug_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail175;
              if(true)
                break Success152;
            }
          }
          term = debug_0_0.instance.invoke(context, transform.const92);
          if(term == null)
            break Fail175;
          term = transform.constVoid0;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class is_return_stmt_exist_0_0 extends Strategy 
  { 
    public static is_return_stmt_exist_0_0 instance = new is_return_stmt_exist_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("is_return_stmt_exist_0_0");
      Fail177:
      { 
        IStrategoTerm l_35 = null;
        IStrategoTerm n_35 = null;
        n_35 = term;
        term = topdown_1_0.instance.invoke(context, n_35, lifted53.instance);
        if(term == null)
          break Fail177;
        l_35 = term;
        IStrategoTerm term156 = term;
        Success153:
        { 
          Fail178:
          { 
            IStrategoTerm m_35 = null;
            m_35 = term;
            term = remove_return_decs_0_0.instance.invoke(context, l_35);
            if(term == null)
              break Fail178;
            term = termFactory.makeTuple(l_35, term);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail178;
            term = m_35;
            { 
              if(true)
                break Fail177;
              if(true)
                break Success153;
            }
          }
          term = term156;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class remove_return_decs_0_0 extends Strategy 
  { 
    public static remove_return_decs_0_0 instance = new remove_return_decs_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("remove_return_decs_0_0");
      Fail179:
      { 
        term = topdown_1_0.instance.invoke(context, term, lifted55.instance);
        if(term == null)
          break Fail179;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class closure_to_java_impl_0_1 extends Strategy 
  { 
    public static closure_to_java_impl_0_1 instance = new closure_to_java_impl_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_46)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closure_to_java_impl_0_1");
      Fail180:
      { 
        IStrategoTerm term157 = term;
        Success154:
        { 
          Fail181:
          { 
            IStrategoTerm y_35 = null;
            IStrategoTerm z_35 = null;
            TermReference a_36 = new TermReference();
            IStrategoTerm b_36 = null;
            IStrategoTerm c_36 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consClosureJoinpoints_4 != ((IStrategoAppl)term).getConstructor())
              break Fail181;
            c_36 = term.getSubterm(0);
            y_35 = term.getSubterm(1);
            z_35 = term.getSubterm(2);
            b_36 = term.getSubterm(3);
            term = c_36;
            lifted58 lifted580 = new lifted58();
            lifted57 lifted570 = new lifted57();
            lifted580.a_36 = a_36;
            lifted570.a_36 = a_36;
            term = or_2_0.instance.invoke(context, term, lifted570, lifted580);
            if(term == null)
              break Fail181;
            term = debug_0_0.instance.invoke(context, transform.const93);
            if(term == null)
              break Fail181;
            if(a_36.value == null)
              break Fail181;
            term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, transform.constClassOrInterfaceType1, transform.constNil0, termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons22, transform.constNone0, q_46, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{a_36.value}), y_35, transform.constNone0}), z_35}), (IStrategoList)transform.constNil0)})})}), transform.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{a_36.value})}), b_36});
            if(true)
              break Success154;
          }
          term = term157;
          IStrategoTerm u_35 = null;
          TermReference v_35 = new TermReference();
          IStrategoTerm w_35 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consShortClosureJoinpoints_2 != ((IStrategoAppl)term).getConstructor())
            break Fail180;
          w_35 = term.getSubterm(0);
          u_35 = term.getSubterm(1);
          term = w_35;
          lifted60 lifted600 = new lifted60();
          lifted59 lifted590 = new lifted59();
          lifted600.v_35 = v_35;
          lifted590.v_35 = v_35;
          term = or_2_0.instance.invoke(context, term, lifted590, lifted600);
          if(term == null)
            break Fail180;
          term = debug_0_0.instance.invoke(context, transform.const94);
          if(term == null)
            break Fail180;
          if(v_35.value == null)
            break Fail180;
          term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, transform.constClassOrInterfaceType1, transform.constNil0, termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons22, transform.constNone0, q_46, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{v_35.value}), transform.constNil0, transform.constNone0}), u_35}), (IStrategoList)transform.constNil0)})})}), transform.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{v_35.value})}), transform.constNil0});
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class main_0_0 extends Strategy 
  { 
    public static main_0_0 instance = new main_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("main_0_0");
      Fail182:
      { 
        term = handle_io_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail182;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class handle_io_0_0 extends Strategy 
  { 
    public static handle_io_0_0 instance = new handle_io_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("handle_io_0_0");
      Fail183:
      { 
        IStrategoTerm f_36 = null;
        IStrategoTerm g_36 = null;
        IStrategoTerm h_36 = null;
        IStrategoTerm i_36 = null;
        IStrategoTerm k_36 = null;
        IStrategoTerm p_36 = null;
        IStrategoTerm m_36 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail183;
        f_36 = ((IStrategoList)term).tail();
        term = debug_0_0.instance.invoke(context, f_36);
        if(term == null)
          break Fail183;
        term = f_36;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail183;
        k_36 = ((IStrategoList)term).head();
        term = k_36;
        term = $Read$From$File_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail183;
        g_36 = term;
        term = f_36;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail183;
        p_36 = ((IStrategoList)term).tail();
        term = p_36;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail183;
        m_36 = ((IStrategoList)term).head();
        h_36 = m_36;
        term = convert_0_0.instance.invoke(context, g_36);
        if(term == null)
          break Fail183;
        term = pp_aspectj_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail183;
        i_36 = term;
        term = termFactory.makeTuple(h_36, transform.const95);
        term = fopen_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail183;
        term = termFactory.makeTuple(i_36, term);
        term = fputs_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail183;
        term = fclose_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail183;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class convert_0_0 extends Strategy 
  { 
    public static convert_0_0 instance = new convert_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("convert_0_0");
      Fail184:
      { 
        term = try_1_0.instance.invoke(context, term, closures_converter_compilation_unit_0_0.instance);
        if(term == null)
          break Fail184;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class closures_converter_compilation_unit_0_0 extends Strategy 
  { 
    public static closures_converter_compilation_unit_0_0 instance = new closures_converter_compilation_unit_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closures_converter_compilation_unit_0_0");
      Fail185:
      { 
        IStrategoTerm w_36 = null;
        IStrategoTerm x_36 = null;
        IStrategoTerm y_36 = null;
        IStrategoTerm z_36 = null;
        TermReference a_37 = new TermReference();
        IStrategoTerm b_37 = null;
        IStrategoTerm c_37 = null;
        IStrategoTerm h_37 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
          break Fail185;
        x_36 = term.getSubterm(0);
        y_36 = term.getSubterm(1);
        b_37 = term.getSubterm(2);
        h_37 = term;
        IStrategoTerm term158 = term;
        Success155:
        { 
          Fail186:
          { 
            Success156:
            { 
              Fail187:
              { 
                IStrategoTerm d_37 = null;
                IStrategoTerm i_37 = null;
                d_37 = term;
                term = SRTS_all.instance.invoke(context, b_37, lifted62.instance);
                if(term == null)
                  break Fail187;
                i_37 = term;
                w_36 = b_37;
                term = i_37;
                if(term != w_36 && !w_36.match(term))
                  break Fail187;
                term = d_37;
                { 
                  term = debug_0_0.instance.invoke(context, transform.const96);
                  if(term == null)
                    break Fail186;
                  z_36 = y_36;
                  term = b_37;
                  c_37 = b_37;
                  if(true)
                    break Success156;
                }
              }
              term = debug_0_0.instance.invoke(context, transform.const97);
              if(term == null)
                break Fail186;
              Success157:
              { 
                Fail188:
                { 
                  IStrategoTerm e_37 = null;
                  e_37 = term;
                  term = x_36;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail188;
                  IStrategoTerm arg140 = term.getSubterm(0);
                  if(arg140.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg140).getConstructor())
                    break Fail188;
                  term = e_37;
                  { 
                    term = x_36;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail186;
                    IStrategoTerm arg143 = term.getSubterm(0);
                    if(arg143.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg143).getConstructor())
                      break Fail186;
                    if(a_37.value == null)
                      a_37.value = arg143.getSubterm(1);
                    else
                      if(a_37.value != arg143.getSubterm(1) && !a_37.value.match(arg143.getSubterm(1)))
                        break Fail186;
                    if(true)
                      break Success157;
                  }
                }
                term = transform.constNone0;
                if(a_37.value == null)
                  a_37.value = term;
                else
                  if(a_37.value != term && !a_37.value.match(term))
                    break Fail186;
              }
              term = debug_0_0.instance.invoke(context, transform.const98);
              if(term == null)
                break Fail186;
              term = termFactory.makeTuple(y_36, transform.constCons25);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail186;
              z_36 = term;
              term = debug_0_0.instance.invoke(context, transform.const101);
              if(term == null)
                break Fail186;
              term = debug_0_0.instance.invoke(context, b_37);
              if(term == null)
                break Fail186;
              lifted64 lifted640 = new lifted64();
              lifted640.a_37 = a_37;
              term = SRTS_all.instance.invoke(context, term, lifted640);
              if(term == null)
                break Fail186;
              c_37 = term;
              term = debug_0_0.instance.invoke(context, transform.const102);
              if(term == null)
                break Fail186;
            }
            if(true)
              break Success155;
          }
          term = term158;
          IStrategoTerm f_37 = null;
          IStrategoTerm g_37 = null;
          IStrategoTerm l_37 = null;
          f_37 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail185;
          g_37 = term;
          l_37 = f_37;
          term = report_with_failure_0_2.instance.invoke(context, l_37, transform.const103, g_37);
          if(term == null)
            break Fail185;
        }
        term = h_37;
        if(z_36 == null || c_37 == null)
          break Fail185;
        term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{x_36, z_36, c_37});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class check_for_change_in_aspect_or_class_0_0 extends Strategy 
  { 
    public static check_for_change_in_aspect_or_class_0_0 instance = new check_for_change_in_aspect_or_class_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("check_for_change_in_aspect_or_class_0_0");
      Fail189:
      { 
        IStrategoTerm term161 = term;
        IStrategoConstructor cons10 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success158:
        { 
          if(cons10 == transform._consClassDec_2)
          { 
            Fail190:
            { 
              IStrategoTerm y_37 = null;
              IStrategoTerm z_37 = null;
              IStrategoTerm a_38 = null;
              IStrategoTerm d_38 = null;
              y_37 = term.getSubterm(0);
              z_37 = term.getSubterm(1);
              d_38 = term;
              IStrategoTerm term162 = term;
              Success159:
              { 
                Fail191:
                { 
                  term = debug_0_0.instance.invoke(context, transform.const104);
                  if(term == null)
                    break Fail191;
                  term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{y_37, z_37});
                  term = topdown_1_0.instance.invoke(context, term, lifted66.instance);
                  if(term == null)
                    break Fail191;
                  term = debug_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail191;
                  a_38 = term;
                  if(true)
                    break Success159;
                }
                term = term162;
                IStrategoTerm b_38 = null;
                IStrategoTerm c_38 = null;
                IStrategoTerm f_38 = null;
                b_38 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail190;
                c_38 = term;
                f_38 = b_38;
                term = report_with_failure_0_2.instance.invoke(context, f_38, transform.const105, c_38);
                if(term == null)
                  break Fail190;
              }
              term = d_38;
              if(a_38 == null)
                break Fail190;
              term = a_38;
              if(true)
                break Success158;
            }
            term = term161;
          }
          if(cons10 == transform._consAspectDec_2)
          { 
            IStrategoTerm o_37 = null;
            IStrategoTerm p_37 = null;
            IStrategoTerm q_37 = null;
            IStrategoTerm t_37 = null;
            o_37 = term.getSubterm(0);
            p_37 = term.getSubterm(1);
            t_37 = term;
            IStrategoTerm term164 = term;
            Success160:
            { 
              Fail192:
              { 
                term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{o_37, p_37});
                term = topdown_1_0.instance.invoke(context, term, lifted68.instance);
                if(term == null)
                  break Fail192;
                q_37 = term;
                if(true)
                  break Success160;
              }
              term = term164;
              IStrategoTerm r_37 = null;
              IStrategoTerm s_37 = null;
              IStrategoTerm v_37 = null;
              r_37 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail189;
              s_37 = term;
              v_37 = r_37;
              term = report_with_failure_0_2.instance.invoke(context, v_37, transform.const105, s_37);
              if(term == null)
                break Fail189;
            }
            term = t_37;
            if(q_37 == null)
              break Fail189;
            term = q_37;
          }
          else
          { 
            break Fail189;
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

  @SuppressWarnings("all") public static class closures_converter_aspect_or_class_0_1 extends Strategy 
  { 
    public static closures_converter_aspect_or_class_0_1 instance = new closures_converter_aspect_or_class_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_46)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closures_converter_aspect_or_class_0_1");
      Fail193:
      { 
        IStrategoTerm term165 = term;
        IStrategoConstructor cons11 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success161:
        { 
          if(cons11 == transform._consAspectDec_2)
          { 
            Fail194:
            { 
              IStrategoTerm u_38 = null;
              IStrategoTerm v_38 = null;
              IStrategoTerm w_38 = null;
              IStrategoTerm z_38 = null;
              u_38 = term.getSubterm(0);
              v_38 = term.getSubterm(1);
              z_38 = term;
              IStrategoTerm term166 = term;
              Success162:
              { 
                Fail195:
                { 
                  term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{u_38, v_38});
                  term = closures_to_ajc_0_1.instance.invoke(context, term, r_46);
                  if(term == null)
                    break Fail195;
                  w_38 = term;
                  if(true)
                    break Success162;
                }
                term = term166;
                IStrategoTerm x_38 = null;
                IStrategoTerm y_38 = null;
                IStrategoTerm b_39 = null;
                x_38 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail194;
                y_38 = term;
                b_39 = x_38;
                term = report_with_failure_0_2.instance.invoke(context, b_39, transform.const106, y_38);
                if(term == null)
                  break Fail194;
              }
              term = z_38;
              if(w_38 == null)
                break Fail194;
              term = w_38;
              if(true)
                break Success161;
            }
            term = term165;
          }
          if(cons11 == transform._consClassDec_2)
          { 
            IStrategoTerm j_38 = null;
            IStrategoTerm k_38 = null;
            IStrategoTerm l_38 = null;
            IStrategoTerm o_38 = null;
            j_38 = term.getSubterm(0);
            k_38 = term.getSubterm(1);
            o_38 = term;
            IStrategoTerm term167 = term;
            Success163:
            { 
              Fail196:
              { 
                term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{j_38, k_38});
                term = closures_to_java_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail196;
                l_38 = term;
                if(true)
                  break Success163;
              }
              term = term167;
              IStrategoTerm m_38 = null;
              IStrategoTerm n_38 = null;
              IStrategoTerm q_38 = null;
              m_38 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail193;
              n_38 = term;
              q_38 = m_38;
              term = report_with_failure_0_2.instance.invoke(context, q_38, transform.const106, n_38);
              if(term == null)
                break Fail193;
            }
            term = o_38;
            if(l_38 == null)
              break Fail193;
            term = l_38;
          }
          else
          { 
            break Fail193;
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

  @SuppressWarnings("all") public static class $Or$Comp_2_0 extends Strategy 
  { 
    public static $Or$Comp_2_0 instance = new $Or$Comp_2_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_40, Strategy f_40)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("OrComp_2_0");
      Fail197:
      { 
        IStrategoTerm m_176 = null;
        IStrategoTerm k_176 = null;
        IStrategoTerm l_176 = null;
        IStrategoTerm n_176 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail197;
        k_176 = term.getSubterm(0);
        l_176 = term.getSubterm(1);
        IStrategoList annos0 = term.getAnnotations();
        m_176 = annos0;
        term = e_40.invoke(context, k_176);
        if(term == null)
          break Fail197;
        n_176 = term;
        term = f_40.invoke(context, l_176);
        if(term == null)
          break Fail197;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{n_176, term}), checkListAnnos(termFactory, m_176));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class $And$Comp_2_0 extends Strategy 
  { 
    public static $And$Comp_2_0 instance = new $And$Comp_2_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_40, Strategy h_40)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("AndComp_2_0");
      Fail198:
      { 
        IStrategoTerm r_176 = null;
        IStrategoTerm p_176 = null;
        IStrategoTerm q_176 = null;
        IStrategoTerm s_176 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail198;
        p_176 = term.getSubterm(0);
        q_176 = term.getSubterm(1);
        IStrategoList annos1 = term.getAnnotations();
        r_176 = annos1;
        term = g_40.invoke(context, p_176);
        if(term == null)
          break Fail198;
        s_176 = term;
        term = h_40.invoke(context, q_176);
        if(term == null)
          break Fail198;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{s_176, term}), checkListAnnos(termFactory, r_176));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class $Not$Comp_1_0 extends Strategy 
  { 
    public static $Not$Comp_1_0 instance = new $Not$Comp_1_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_40)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("NotComp_1_0");
      Fail199:
      { 
        IStrategoTerm v_176 = null;
        IStrategoTerm u_176 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotComp_1 != ((IStrategoAppl)term).getConstructor())
          break Fail199;
        u_176 = term.getSubterm(0);
        IStrategoList annos2 = term.getAnnotations();
        v_176 = annos2;
        term = i_40.invoke(context, u_176);
        if(term == null)
          break Fail199;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consNotComp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_176));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted68 extends Strategy 
  { 
    public static final lifted68 instance = new lifted68();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail200:
      { 
        term = try_1_0.instance.invoke(context, term, remove_closures_additions_0_0.instance);
        if(term == null)
          break Fail200;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted66 extends Strategy 
  { 
    public static final lifted66 instance = new lifted66();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail201:
      { 
        term = try_1_0.instance.invoke(context, term, lifted67.instance);
        if(term == null)
          break Fail201;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted67 extends Strategy 
  { 
    public static final lifted67 instance = new lifted67();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail202:
      { 
        IStrategoTerm term163 = term;
        IStrategoConstructor cons12 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success164:
        { 
          if(cons12 == transform._consShortClosureJoinpoints_2)
          { 
            Fail203:
            { 
              term = transform.constNone0;
              if(true)
                break Success164;
            }
            term = term163;
          }
          if(cons12 == transform._consClosureJoinpoints_4)
          { 
            term = transform.constNone0;
          }
          else
          { 
            break Fail202;
          }
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted64 extends Strategy 
  { 
    TermReference a_37;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail204:
      { 
        lifted65 lifted650 = new lifted65();
        lifted650.a_37 = a_37;
        term = try_1_0.instance.invoke(context, term, lifted650);
        if(term == null)
          break Fail204;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted65 extends Strategy 
  { 
    TermReference a_37;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail205:
      { 
        term = closures_converter_aspect_or_class_0_1.instance.invoke(context, term, a_37.value);
        if(term == null)
          break Fail205;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted62 extends Strategy 
  { 
    public static final lifted62 instance = new lifted62();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail206:
      { 
        term = try_1_0.instance.invoke(context, term, check_for_change_in_aspect_or_class_0_0.instance);
        if(term == null)
          break Fail206;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted60 extends Strategy 
  { 
    TermReference v_35;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail207:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
          break Fail207;
        IStrategoTerm arg139 = term.getSubterm(1);
        if(arg139.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg139).getConstructor())
          break Fail207;
        if(v_35.value == null)
          v_35.value = arg139.getSubterm(0);
        else
          if(v_35.value != arg139.getSubterm(0) && !v_35.value.match(arg139.getSubterm(0)))
            break Fail207;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted59 extends Strategy 
  { 
    TermReference v_35;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail208:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail208;
        IStrategoTerm arg137 = term.getSubterm(0);
        if(arg137.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg137).getConstructor())
          break Fail208;
        if(v_35.value == null)
          v_35.value = arg137.getSubterm(0);
        else
          if(v_35.value != arg137.getSubterm(0) && !v_35.value.match(arg137.getSubterm(0)))
            break Fail208;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted58 extends Strategy 
  { 
    TermReference a_36;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail209:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
          break Fail209;
        IStrategoTerm arg136 = term.getSubterm(1);
        if(arg136.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg136).getConstructor())
          break Fail209;
        if(a_36.value == null)
          a_36.value = arg136.getSubterm(0);
        else
          if(a_36.value != arg136.getSubterm(0) && !a_36.value.match(arg136.getSubterm(0)))
            break Fail209;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted57 extends Strategy 
  { 
    TermReference a_36;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail210:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail210;
        IStrategoTerm arg134 = term.getSubterm(0);
        if(arg134.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg134).getConstructor())
          break Fail210;
        if(a_36.value == null)
          a_36.value = arg134.getSubterm(0);
        else
          if(a_36.value != arg134.getSubterm(0) && !a_36.value.match(arg134.getSubterm(0)))
            break Fail210;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted55 extends Strategy 
  { 
    public static final lifted55 instance = new lifted55();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail211:
      { 
        term = try_1_0.instance.invoke(context, term, lifted56.instance);
        if(term == null)
          break Fail211;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted56 extends Strategy 
  { 
    public static final lifted56 instance = new lifted56();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail212:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consReturn_1 != ((IStrategoAppl)term).getConstructor())
          break Fail212;
        term = transform.constNone0;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted53 extends Strategy 
  { 
    public static final lifted53 instance = new lifted53();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail213:
      { 
        term = try_1_0.instance.invoke(context, term, lifted54.instance);
        if(term == null)
          break Fail213;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted54 extends Strategy 
  { 
    public static final lifted54 instance = new lifted54();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail214:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
          break Fail214;
        term = transform.constClassBody0;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted52 extends Strategy 
  { 
    TermReference y_34;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail215:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consShortClosureJoinpoints_2 != ((IStrategoAppl)term).getConstructor())
          break Fail215;
        if(y_34.value == null)
          y_34.value = term.getSubterm(1);
        else
          if(y_34.value != term.getSubterm(1) && !y_34.value.match(term.getSubterm(1)))
            break Fail215;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted51 extends Strategy 
  { 
    TermReference y_34;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail216:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClosureJoinpoints_4 != ((IStrategoAppl)term).getConstructor())
          break Fail216;
        if(y_34.value == null)
          y_34.value = term.getSubterm(2);
        else
          if(y_34.value != term.getSubterm(2) && !y_34.value.match(term.getSubterm(2)))
            break Fail216;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted50 extends Strategy 
  { 
    public static final lifted50 instance = new lifted50();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail217:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail217;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted49 extends Strategy 
  { 
    public static final lifted49 instance = new lifted49();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail218:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail218;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted48 extends Strategy 
  { 
    public static final lifted48 instance = new lifted48();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail219:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail219;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted47 extends Strategy 
  { 
    public static final lifted47 instance = new lifted47();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail220:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail220;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted44 extends Strategy 
  { 
    public static final lifted44 instance = new lifted44();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail221:
      { 
        term = or_2_0.instance.invoke(context, term, lifted45.instance, lifted46.instance);
        if(term == null)
          break Fail221;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted46 extends Strategy 
  { 
    public static final lifted46 instance = new lifted46();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail222:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail222;
        IStrategoTerm arg111 = term.getSubterm(1);
        if(arg111.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)arg111).getConstructor())
          break Fail222;
        IStrategoTerm arg112 = arg111.getSubterm(0);
        if(arg112.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)arg112).getConstructor())
          break Fail222;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted45 extends Strategy 
  { 
    public static final lifted45 instance = new lifted45();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail223:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail223;
        IStrategoTerm arg106 = term.getSubterm(0);
        if(arg106.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)arg106).getConstructor())
          break Fail223;
        IStrategoTerm arg107 = arg106.getSubterm(0);
        if(arg107.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)arg107).getConstructor())
          break Fail223;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted41 extends Strategy 
  { 
    public static final lifted41 instance = new lifted41();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail224:
      { 
        term = or_2_0.instance.invoke(context, term, lifted42.instance, lifted43.instance);
        if(term == null)
          break Fail224;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted43 extends Strategy 
  { 
    public static final lifted43 instance = new lifted43();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail225:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail225;
        IStrategoTerm arg103 = term.getSubterm(1);
        if(arg103.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)arg103).getConstructor())
          break Fail225;
        IStrategoTerm arg104 = arg103.getSubterm(0);
        if(arg104.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)arg104).getConstructor())
          break Fail225;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted42 extends Strategy 
  { 
    public static final lifted42 instance = new lifted42();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail226:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail226;
        IStrategoTerm arg98 = term.getSubterm(0);
        if(arg98.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)arg98).getConstructor())
          break Fail226;
        IStrategoTerm arg99 = arg98.getSubterm(0);
        if(arg99.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)arg99).getConstructor())
          break Fail226;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted40 extends Strategy 
  { 
    public static final lifted40 instance = new lifted40();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail227:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail227;
        IStrategoTerm arg95 = term.getSubterm(1);
        if(arg95.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)arg95).getConstructor())
          break Fail227;
        IStrategoTerm arg96 = arg95.getSubterm(0);
        if(arg96.getTermType() != IStrategoTerm.APPL || transform._consString_1 != ((IStrategoAppl)arg96).getConstructor())
          break Fail227;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted39 extends Strategy 
  { 
    public static final lifted39 instance = new lifted39();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail228:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail228;
        IStrategoTerm arg90 = term.getSubterm(0);
        if(arg90.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)arg90).getConstructor())
          break Fail228;
        IStrategoTerm arg91 = arg90.getSubterm(0);
        if(arg91.getTermType() != IStrategoTerm.APPL || transform._consString_1 != ((IStrategoAppl)arg91).getConstructor())
          break Fail228;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted38 extends Strategy 
  { 
    public static final lifted38 instance = new lifted38();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail229:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail229;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted37 extends Strategy 
  { 
    public static final lifted37 instance = new lifted37();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail230:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail230;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted36 extends Strategy 
  { 
    public static final lifted36 instance = new lifted36();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail231:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail231;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted35 extends Strategy 
  { 
    public static final lifted35 instance = new lifted35();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail232:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail232;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted34 extends Strategy 
  { 
    TermReference a_29;

    TermReference t_28;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail233:
      { 
        term = add_var_0_2.instance.invoke(context, term, a_29.value, t_28.value);
        if(term == null)
          break Fail233;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted33 extends Strategy 
  { 
    TermReference t_28;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail234:
      { 
        IStrategoTerm u_29 = null;
        u_29 = term;
        if(t_28.value == null)
          break Fail234;
        term = hashtable_copy_0_0.instance.invoke(context, t_28.value);
        if(term == null)
          break Fail234;
        term = discover_return_type_impl_0_1.instance.invoke(context, u_29, term);
        if(term == null)
          break Fail234;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted30 extends Strategy 
  { 
    public static final lifted30 instance = new lifted30();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail235:
      { 
        term = try_1_0.instance.invoke(context, term, lifted31.instance);
        if(term == null)
          break Fail235;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted31 extends Strategy 
  { 
    public static final lifted31 instance = new lifted31();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail236:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
          break Fail236;
        term = transform.constClassBody0;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted32 extends Strategy 
  { 
    TermReference m_28;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail237:
      { 
        term = discover_return_type_impl_0_1.instance.invoke(context, term, m_28.value);
        if(term == null)
          break Fail237;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted29 extends Strategy 
  { 
    TermReference f_28;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail238:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail238;
        IStrategoTerm arg69 = term.getSubterm(0);
        if(arg69.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg69).getConstructor())
          break Fail238;
        if(f_28.value == null)
          f_28.value = arg69.getSubterm(0);
        else
          if(f_28.value != arg69.getSubterm(0) && !f_28.value.match(arg69.getSubterm(0)))
            break Fail238;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted28 extends Strategy 
  { 
    TermReference f_28;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail239:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail239;
        IStrategoTerm arg68 = term.getSubterm(0);
        if(arg68.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg68).getConstructor())
          break Fail239;
        if(f_28.value == null)
          f_28.value = arg68.getSubterm(0);
        else
          if(f_28.value != arg68.getSubterm(0) && !f_28.value.match(arg68.getSubterm(0)))
            break Fail239;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted27 extends Strategy 
  { 
    TermReference p_27;

    TermReference o_27;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail240:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail240;
        if(p_27.value == null)
          p_27.value = term.getSubterm(1);
        else
          if(p_27.value != term.getSubterm(1) && !p_27.value.match(term.getSubterm(1)))
            break Fail240;
        IStrategoTerm arg67 = term.getSubterm(2);
        if(arg67.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg67).getConstructor())
          break Fail240;
        if(o_27.value == null)
          o_27.value = arg67.getSubterm(0);
        else
          if(o_27.value != arg67.getSubterm(0) && !o_27.value.match(arg67.getSubterm(0)))
            break Fail240;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted26 extends Strategy 
  { 
    TermReference p_27;

    TermReference o_27;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail241:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail241;
        if(p_27.value == null)
          p_27.value = term.getSubterm(1);
        else
          if(p_27.value != term.getSubterm(1) && !p_27.value.match(term.getSubterm(1)))
            break Fail241;
        IStrategoTerm arg65 = term.getSubterm(2);
        if(arg65.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg65).getConstructor())
          break Fail241;
        if(o_27.value == null)
          o_27.value = arg65.getSubterm(0);
        else
          if(o_27.value != arg65.getSubterm(0) && !o_27.value.match(arg65.getSubterm(0)))
            break Fail241;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted24 extends Strategy 
  { 
    TermReference u_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail242:
      { 
        lifted25 lifted250 = new lifted25();
        lifted250.u_24 = u_24;
        term = try_1_0.instance.invoke(context, term, lifted250);
        if(term == null)
          break Fail242;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted25 extends Strategy 
  { 
    TermReference u_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail243:
      { 
        term = add_param_0_1.instance.invoke(context, term, u_24.value);
        if(term == null)
          break Fail243;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted22 extends Strategy 
  { 
    TermReference u_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail244:
      { 
        lifted23 lifted230 = new lifted23();
        lifted230.u_24 = u_24;
        term = try_1_0.instance.invoke(context, term, lifted230);
        if(term == null)
          break Fail244;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted23 extends Strategy 
  { 
    TermReference u_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail245:
      { 
        term = add_param_0_1.instance.invoke(context, term, u_24.value);
        if(term == null)
          break Fail245;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted21 extends Strategy 
  { 
    TermReference o_24;

    TermReference i_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail246:
      { 
        term = replace_0_2.instance.invoke(context, term, o_24.value, i_24.value);
        if(term == null)
          break Fail246;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted20 extends Strategy 
  { 
    TermReference u_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail247:
      { 
        IStrategoTerm h_26 = null;
        h_26 = term;
        term = replace_0_2.instance.invoke(context, h_26, transform.constNone0, u_24.value);
        if(term == null)
          break Fail247;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted19 extends Strategy 
  { 
    TermReference u_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail248:
      { 
        IStrategoTerm d_26 = null;
        d_26 = term;
        term = replace_0_2.instance.invoke(context, d_26, transform.constNone0, u_24.value);
        if(term == null)
          break Fail248;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted17 extends Strategy 
  { 
    TermReference u_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail249:
      { 
        TermReference h_25 = new TermReference();
        IStrategoTerm i_25 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail249;
        if(h_25.value == null)
          h_25.value = term.getSubterm(1);
        else
          if(h_25.value != term.getSubterm(1) && !h_25.value.match(term.getSubterm(1)))
            break Fail249;
        i_25 = term.getSubterm(2);
        term = i_25;
        lifted18 lifted180 = new lifted18();
        lifted180.h_25 = h_25;
        lifted180.u_24 = u_24;
        term = map_1_0.instance.invoke(context, term, lifted180);
        if(term == null)
          break Fail249;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted18 extends Strategy 
  { 
    TermReference h_25;

    TermReference u_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail250:
      { 
        term = replace_0_2.instance.invoke(context, term, h_25.value, u_24.value);
        if(term == null)
          break Fail250;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted16 extends Strategy 
  { 
    public static final lifted16 instance = new lifted16();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail251:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail251;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted15 extends Strategy 
  { 
    TermReference u_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail252:
      { 
        IStrategoTerm z_25 = null;
        z_25 = term;
        term = replace_0_2.instance.invoke(context, z_25, transform.constNone0, u_24.value);
        if(term == null)
          break Fail252;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted13 extends Strategy 
  { 
    TermReference u_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail253:
      { 
        TermReference e_25 = new TermReference();
        IStrategoTerm f_25 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail253;
        if(e_25.value == null)
          e_25.value = term.getSubterm(1);
        else
          if(e_25.value != term.getSubterm(1) && !e_25.value.match(term.getSubterm(1)))
            break Fail253;
        f_25 = term.getSubterm(2);
        term = f_25;
        lifted14 lifted140 = new lifted14();
        lifted140.e_25 = e_25;
        lifted140.u_24 = u_24;
        term = map_1_0.instance.invoke(context, term, lifted140);
        if(term == null)
          break Fail253;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted14 extends Strategy 
  { 
    TermReference e_25;

    TermReference u_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail254:
      { 
        term = replace_0_2.instance.invoke(context, term, e_25.value, u_24.value);
        if(term == null)
          break Fail254;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted12 extends Strategy 
  { 
    public static final lifted12 instance = new lifted12();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail255:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail255;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted11 extends Strategy 
  { 
    public static final lifted11 instance = new lifted11();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail256:
      { 
        IStrategoTerm m_22 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail256;
        IStrategoTerm arg48 = term.getSubterm(2);
        if(arg48.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg48).getConstructor())
          break Fail256;
        m_22 = arg48.getSubterm(0);
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{m_22})}), transform.constNone0});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted10 extends Strategy 
  { 
    public static final lifted10 instance = new lifted10();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail257:
      { 
        IStrategoTerm l_22 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail257;
        l_22 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, l_22);
        if(term == null)
          break Fail257;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted9 extends Strategy 
  { 
    public static final lifted9 instance = new lifted9();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail258:
      { 
        IStrategoTerm c_23 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail258;
        IStrategoTerm arg41 = term.getSubterm(2);
        if(arg41.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg41).getConstructor())
          break Fail258;
        c_23 = arg41.getSubterm(0);
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{c_23})}), transform.constNone0});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted8 extends Strategy 
  { 
    public static final lifted8 instance = new lifted8();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail259:
      { 
        IStrategoTerm b_23 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail259;
        b_23 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, b_23);
        if(term == null)
          break Fail259;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted7 extends Strategy 
  { 
    public static final lifted7 instance = new lifted7();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail260:
      { 
        IStrategoTerm t_23 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail260;
        IStrategoTerm arg34 = term.getSubterm(2);
        if(arg34.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg34).getConstructor())
          break Fail260;
        t_23 = arg34.getSubterm(0);
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{t_23})}), transform.constNone0});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted6 extends Strategy 
  { 
    public static final lifted6 instance = new lifted6();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail261:
      { 
        IStrategoTerm s_23 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail261;
        s_23 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, s_23);
        if(term == null)
          break Fail261;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted4 extends Strategy 
  { 
    TermReference o_21;

    TermReference m_21;

    TermReference p_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail262:
      { 
        lifted5 lifted510 = new lifted5();
        lifted510.o_21 = o_21;
        lifted510.m_21 = m_21;
        lifted510.p_21 = p_21;
        term = try_1_0.instance.invoke(context, term, lifted510);
        if(term == null)
          break Fail262;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted5 extends Strategy 
  { 
    TermReference o_21;

    TermReference m_21;

    TermReference p_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail263:
      { 
        term = closures_to_ajc_0_3.instance.invoke(context, term, o_21.value, m_21.value, p_21.value);
        if(term == null)
          break Fail263;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted3 extends Strategy 
  { 
    public static final lifted3 instance = new lifted3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail264:
      { 
        IStrategoTerm term104 = term;
        Success165:
        { 
          Fail265:
          { 
            term = aspectj_to_box_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail265;
            if(true)
              break Success165;
          }
          term = java_to_box_0_0.instance.invoke(context, term104);
          if(term == null)
            break Fail264;
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class d_21 extends Strategy 
  { 
    public static final d_21 instance = new d_21();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail266:
      { 
        IStrategoTerm term101 = term;
        Success166:
        { 
          Fail267:
          { 
            term = $Not$Comp_1_0.instance.invoke(context, term, _Id.instance);
            if(term == null)
              break Fail267;
            if(true)
              break Success166;
          }
          term = term101;
          IStrategoTerm term102 = term;
          Success167:
          { 
            Fail268:
            { 
              term = $And$Comp_2_0.instance.invoke(context, term, this, _Id.instance);
              if(term == null)
                break Fail268;
              if(true)
                break Success167;
            }
            term = $Or$Comp_2_0.instance.invoke(context, term102, this, _Id.instance);
            if(term == null)
              break Fail266;
          }
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }

  @SuppressWarnings("unused") public static class InteropRegisterer extends org.strategoxt.lang.InteropRegisterer 
  { 
    @Override public void register(org.spoofax.interpreter.core.IContext context, Context compiledContext)
    { 
      register(context, compiledContext, context.getVarScope());
    }

    @Override public void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader)
    { 
      registerLazy(context, compiledContext, classLoader, context.getVarScope());
    }

    private void register(org.spoofax.interpreter.core.IContext context, Context compiledContext, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("transform");
      transform.init(compiledContext);
      varScope.addSVar("aspectj_to_box_0_0_fragment_4", new InteropSDefT(aspectj_to_box_0_0_fragment_4.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_3", new InteropSDefT(aspectj_to_box_0_0_fragment_3.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_2", new InteropSDefT(aspectj_to_box_0_0_fragment_2.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_1", new InteropSDefT(aspectj_to_box_0_0_fragment_1.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_0", new InteropSDefT(aspectj_to_box_0_0_fragment_0.instance, context));
      varScope.addSVar("aspectj_to_box_0_0", new InteropSDefT(aspectj_to_box_0_0.instance, context));
      varScope.addSVar("has_leftmost_not_0_0", new InteropSDefT(has_leftmost_not_0_0.instance, context));
      varScope.addSVar("option_to_boxes_0_0", new InteropSDefT(option_to_boxes_0_0.instance, context));
      varScope.addSVar("pp_aspectj_string_0_0", new InteropSDefT(pp_aspectj_string_0_0.instance, context));
      varScope.addSVar("remove_closures_additions_0_0", new InteropSDefT(remove_closures_additions_0_0.instance, context));
      varScope.addSVar("closures_to_ajc_0_1", new InteropSDefT(closures_to_ajc_0_1.instance, context));
      varScope.addSVar("closures_to_ajc_0_3", new InteropSDefT(closures_to_ajc_0_3.instance, context));
      varScope.addSVar("replace_0_2", new InteropSDefT(replace_0_2.instance, context));
      varScope.addSVar("add_param_0_1", new InteropSDefT(add_param_0_1.instance, context));
      varScope.addSVar("get_var_type_0_1", new InteropSDefT(get_var_type_0_1.instance, context));
      varScope.addSVar("get_var_type_impl_0_1", new InteropSDefT(get_var_type_impl_0_1.instance, context));
      varScope.addSVar("add_var_0_2", new InteropSDefT(add_var_0_2.instance, context));
      varScope.addSVar("discover_return_type_0_0", new InteropSDefT(discover_return_type_0_0.instance, context));
      varScope.addSVar("discover_return_type_impl_0_1", new InteropSDefT(discover_return_type_impl_0_1.instance, context));
      varScope.addSVar("get_type_from_return_stmt_0_1", new InteropSDefT(get_type_from_return_stmt_0_1.instance, context));
      varScope.addSVar("cast_return_type_0_0", new InteropSDefT(cast_return_type_0_0.instance, context));
      varScope.addSVar("closures_to_java_0_0", new InteropSDefT(closures_to_java_0_0.instance, context));
      varScope.addSVar("closure_to_java_0_2", new InteropSDefT(closure_to_java_0_2.instance, context));
      varScope.addSVar("get_return_type_from_block_0_1", new InteropSDefT(get_return_type_from_block_0_1.instance, context));
      varScope.addSVar("is_return_stmt_exist_0_0", new InteropSDefT(is_return_stmt_exist_0_0.instance, context));
      varScope.addSVar("remove_return_decs_0_0", new InteropSDefT(remove_return_decs_0_0.instance, context));
      varScope.addSVar("closure_to_java_impl_0_1", new InteropSDefT(closure_to_java_impl_0_1.instance, context));
      varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
      varScope.addSVar("handle_io_0_0", new InteropSDefT(handle_io_0_0.instance, context));
      varScope.addSVar("convert_0_0", new InteropSDefT(convert_0_0.instance, context));
      varScope.addSVar("closures_converter_compilation_unit_0_0", new InteropSDefT(closures_converter_compilation_unit_0_0.instance, context));
      varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(check_for_change_in_aspect_or_class_0_0.instance, context));
      varScope.addSVar("closures_converter_aspect_or_class_0_1", new InteropSDefT(closures_converter_aspect_or_class_0_1.instance, context));
      varScope.addSVar("OrComp_2_0", new InteropSDefT($Or$Comp_2_0.instance, context));
      varScope.addSVar("AndComp_2_0", new InteropSDefT($And$Comp_2_0.instance, context));
      varScope.addSVar("NotComp_1_0", new InteropSDefT($Not$Comp_1_0.instance, context));
    }

    private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("transform");
      transform.init(compiledContext);
      varScope.addSVar("aspectj_to_box_0_0_fragment_4", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_4", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_3", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_3", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_2", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_2", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_1", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_1", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_0", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_0", context));
      varScope.addSVar("aspectj_to_box_0_0", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0", context));
      varScope.addSVar("has_leftmost_not_0_0", new InteropSDefT(classLoader, "transform$has_leftmost_not_0_0", context));
      varScope.addSVar("option_to_boxes_0_0", new InteropSDefT(classLoader, "transform$option_to_boxes_0_0", context));
      varScope.addSVar("pp_aspectj_string_0_0", new InteropSDefT(classLoader, "transform$pp_aspectj_string_0_0", context));
      varScope.addSVar("remove_closures_additions_0_0", new InteropSDefT(classLoader, "transform$remove_closures_additions_0_0", context));
      varScope.addSVar("closures_to_ajc_0_1", new InteropSDefT(classLoader, "transform$closures_to_ajc_0_1", context));
      varScope.addSVar("closures_to_ajc_0_3", new InteropSDefT(classLoader, "transform$closures_to_ajc_0_3", context));
      varScope.addSVar("replace_0_2", new InteropSDefT(classLoader, "transform$replace_0_2", context));
      varScope.addSVar("add_param_0_1", new InteropSDefT(classLoader, "transform$add_param_0_1", context));
      varScope.addSVar("get_var_type_0_1", new InteropSDefT(classLoader, "transform$get_var_type_0_1", context));
      varScope.addSVar("get_var_type_impl_0_1", new InteropSDefT(classLoader, "transform$get_var_type_impl_0_1", context));
      varScope.addSVar("add_var_0_2", new InteropSDefT(classLoader, "transform$add_var_0_2", context));
      varScope.addSVar("discover_return_type_0_0", new InteropSDefT(classLoader, "transform$discover_return_type_0_0", context));
      varScope.addSVar("discover_return_type_impl_0_1", new InteropSDefT(classLoader, "transform$discover_return_type_impl_0_1", context));
      varScope.addSVar("get_type_from_return_stmt_0_1", new InteropSDefT(classLoader, "transform$get_type_from_return_stmt_0_1", context));
      varScope.addSVar("cast_return_type_0_0", new InteropSDefT(classLoader, "transform$cast_return_type_0_0", context));
      varScope.addSVar("closures_to_java_0_0", new InteropSDefT(classLoader, "transform$closures_to_java_0_0", context));
      varScope.addSVar("closure_to_java_0_2", new InteropSDefT(classLoader, "transform$closure_to_java_0_2", context));
      varScope.addSVar("get_return_type_from_block_0_1", new InteropSDefT(classLoader, "transform$get_return_type_from_block_0_1", context));
      varScope.addSVar("is_return_stmt_exist_0_0", new InteropSDefT(classLoader, "transform$is_return_stmt_exist_0_0", context));
      varScope.addSVar("remove_return_decs_0_0", new InteropSDefT(classLoader, "transform$remove_return_decs_0_0", context));
      varScope.addSVar("closure_to_java_impl_0_1", new InteropSDefT(classLoader, "transform$closure_to_java_impl_0_1", context));
      varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "transform$main_0_0", context));
      varScope.addSVar("handle_io_0_0", new InteropSDefT(classLoader, "transform$handle_io_0_0", context));
      varScope.addSVar("convert_0_0", new InteropSDefT(classLoader, "transform$convert_0_0", context));
      varScope.addSVar("closures_converter_compilation_unit_0_0", new InteropSDefT(classLoader, "transform$closures_converter_compilation_unit_0_0", context));
      varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(classLoader, "transform$check_for_change_in_aspect_or_class_0_0", context));
      varScope.addSVar("closures_converter_aspect_or_class_0_1", new InteropSDefT(classLoader, "transform$closures_converter_aspect_or_class_0_1", context));
      varScope.addSVar("OrComp_2_0", new InteropSDefT(classLoader, "transform$$Or$Comp_2_0", context));
      varScope.addSVar("AndComp_2_0", new InteropSDefT(classLoader, "transform$$And$Comp_2_0", context));
      varScope.addSVar("NotComp_1_0", new InteropSDefT(classLoader, "transform$$Not$Comp_1_0", context));
    }
  }
}