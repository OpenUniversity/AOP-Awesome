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

  protected static IStrategoTerm constSome2;

  protected static IStrategoTerm constLit2;

  protected static IStrategoTerm constNull0;

  protected static IStrategoTerm constSome1;

  protected static IStrategoTerm constLit1;

  protected static IStrategoTerm constFalse0;

  protected static IStrategoTerm constSome0;

  protected static IStrategoTerm constLit0;

  protected static IStrategoTerm constDeci0;

  protected static IStrategoTerm constRefTypePattern0;

  protected static IStrategoTerm constNamePattern0;

  protected static IStrategoTerm constModPattern0;

  protected static IStrategoTerm constAnnoPattern0;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constSimpleAnnoPatternExact0;

  protected static IStrategoTerm constTypeName0;

  protected static IStrategoTerm constId0;

  protected static IStrategoTerm const69;

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

  public static IStrategoConstructor _consFalse_0;

  public static IStrategoConstructor _consChar_1;

  public static IStrategoConstructor _consString_1;

  public static IStrategoConstructor _consNull_0;

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
    _consFalse_0 = termFactory.makeConstructor("False", 0);
    _consChar_1 = termFactory.makeConstructor("Char", 1);
    _consString_1 = termFactory.makeConstructor("String", 1);
    _consNull_0 = termFactory.makeConstructor("Null", 0);
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
    const69 = termFactory.makeString("Closure");
    constId0 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const69});
    constTypeName0 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId0});
    constSimpleAnnoPatternExact0 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{transform.constTypeName0});
    constCons20 = (IStrategoTerm)termFactory.makeListCons(transform.constSimpleAnnoPatternExact0, (IStrategoList)transform.constNil0);
    constAnnoPattern0 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons20});
    constModPattern0 = termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{transform.constNil0});
    constNamePattern0 = termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{transform.const32});
    constRefTypePattern0 = termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{transform.constNamePattern0});
    constDeci0 = termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{transform.const0});
    constLit0 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constDeci0});
    constSome0 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLit0});
    constFalse0 = termFactory.makeAppl(transform._consFalse_0, NO_TERMS);
    constLit1 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constFalse0});
    constSome1 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLit1});
    constNull0 = termFactory.makeAppl(transform._consNull_0, NO_TERMS);
    constLit2 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constNull0});
    constSome2 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLit2});
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
              IStrategoTerm k_21 = null;
              k_21 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX0, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(k_21, (IStrategoList)transform.constCons1)))});
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
                IStrategoTerm j_21 = null;
                j_21 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX1, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(j_21, (IStrategoList)transform.constCons1)))});
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
                  IStrategoTerm i_21 = null;
                  i_21 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX2, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(i_21, (IStrategoList)transform.constCons1)))});
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
                    IStrategoTerm h_21 = null;
                    h_21 = term.getSubterm(0);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX3, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(h_21, (IStrategoList)transform.constCons1)))});
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
                      IStrategoTerm g_21 = null;
                      g_21 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX4, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(g_21, (IStrategoList)transform.constCons1)))});
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
                        IStrategoTerm f_21 = null;
                        f_21 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX5, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(f_21, (IStrategoList)transform.constCons1)))});
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
                            IStrategoTerm e_21 = null;
                            e_21 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX7, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(e_21, (IStrategoList)transform.constCons1)))});
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
                              IStrategoTerm d_21 = null;
                              d_21 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX8, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(d_21, (IStrategoList)transform.constCons1)))});
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
                                IStrategoTerm c_21 = null;
                                c_21 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX9, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(c_21, (IStrategoList)transform.constCons1)))});
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
                                  IStrategoTerm b_21 = null;
                                  b_21 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX10, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(b_21, (IStrategoList)transform.constCons1)))});
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
                                    IStrategoTerm a_21 = null;
                                    a_21 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX11, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(a_21, (IStrategoList)transform.constCons1)))});
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
                                      IStrategoTerm z_20 = null;
                                      z_20 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX12, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(z_20, (IStrategoList)transform.constCons1)))});
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
                                        IStrategoTerm y_20 = null;
                                        y_20 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX13, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(y_20, (IStrategoList)transform.constCons1)))});
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
                                          IStrategoTerm v_20 = null;
                                          v_20 = term.getSubterm(0);
                                          term = list_to_args_0_0.instance.invoke(context, v_20);
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
                                            IStrategoTerm r_20 = null;
                                            IStrategoTerm s_20 = null;
                                            r_20 = term.getSubterm(0);
                                            s_20 = term.getSubterm(1);
                                            term = list_to_args_0_0.instance.invoke(context, s_20);
                                            if(term == null)
                                              break Fail16;
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(r_20, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
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
                                              IStrategoTerm q_20 = null;
                                              q_20 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS17, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(q_20, (IStrategoList)transform.constCons1)))});
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
                                                IStrategoTerm p_20 = null;
                                                p_20 = term.getSubterm(0);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS18, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(p_20, (IStrategoList)transform.constCons1)))});
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
              IStrategoTerm o_20 = null;
              o_20 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS19, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(o_20, (IStrategoList)transform.constCons1)))});
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
                IStrategoTerm n_20 = null;
                n_20 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS20, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(n_20, (IStrategoList)transform.constCons1)))});
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
                  IStrategoTerm m_20 = null;
                  m_20 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS21, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(m_20, (IStrategoList)transform.constCons1)))});
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
                    IStrategoTerm j_20 = null;
                    j_20 = term.getSubterm(0);
                    term = list_to_args_0_0.instance.invoke(context, j_20);
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
                      IStrategoTerm i_20 = null;
                      i_20 = term.getSubterm(0);
                      term = i_20;
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
                        IStrategoTerm g_20 = null;
                        IStrategoTerm h_20 = null;
                        g_20 = term.getSubterm(0);
                        h_20 = term.getSubterm(1);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(g_20, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(h_20, (IStrategoList)transform.constNil0)))});
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
                          IStrategoTerm e_20 = null;
                          IStrategoTerm f_20 = null;
                          e_20 = term.getSubterm(0);
                          f_20 = term.getSubterm(1);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(e_20, termFactory.makeListCons(f_20, (IStrategoList)transform.constNil0))});
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
                            IStrategoTerm x_19 = null;
                            IStrategoTerm y_19 = null;
                            IStrategoTerm z_19 = null;
                            IStrategoTerm a_20 = null;
                            x_19 = term.getSubterm(0);
                            y_19 = term.getSubterm(1);
                            z_19 = term.getSubterm(2);
                            term = list_to_args_0_0.instance.invoke(context, z_19);
                            if(term == null)
                              break Fail27;
                            a_20 = term;
                            term = termFactory.makeTuple(x_19, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX15, termFactory.makeListCons(y_19, termFactory.makeListCons(a_20, (IStrategoList)transform.constNil0))));
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
                              IStrategoTerm w_19 = null;
                              w_19 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS26, termFactory.makeListCons(w_19, (IStrategoList)transform.constCons5))});
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
                                  IStrategoTerm u_19 = null;
                                  u_19 = term.getSubterm(0);
                                  term = u_19;
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
                                    IStrategoTerm t_19 = null;
                                    t_19 = term.getSubterm(0);
                                    term = t_19;
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
                                      IStrategoTerm s_19 = null;
                                      s_19 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(s_19, (IStrategoList)transform.constCons6)});
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
                                        IStrategoTerm q_19 = null;
                                        IStrategoTerm r_19 = null;
                                        q_19 = term.getSubterm(0);
                                        r_19 = term.getSubterm(1);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(q_19, termFactory.makeListCons(r_19, (IStrategoList)transform.constNil0))});
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
                                          IStrategoTerm o_19 = null;
                                          IStrategoTerm p_19 = null;
                                          o_19 = term.getSubterm(0);
                                          p_19 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(o_19, termFactory.makeListCons(p_19, (IStrategoList)transform.constCons6))});
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
                                            IStrategoTerm k_19 = null;
                                            IStrategoTerm l_19 = null;
                                            IStrategoTerm arg0 = term.getSubterm(0);
                                            if(arg0.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg0).getConstructor())
                                              break Fail35;
                                            k_19 = arg0.getSubterm(0);
                                            l_19 = term.getSubterm(1);
                                            term = termFactory.makeTuple(k_19, (IStrategoTerm)termFactory.makeListCons(l_19, (IStrategoList)transform.constNil0));
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
                                              IStrategoTerm h_19 = null;
                                              h_19 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{h_19}), (IStrategoList)transform.constNil0)});
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
                                                IStrategoTerm f_19 = null;
                                                IStrategoTerm g_19 = null;
                                                f_19 = term.getSubterm(0);
                                                g_19 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(f_19, termFactory.makeListCons(transform.constFBOX17, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{g_19}), (IStrategoList)transform.constNil0)))});
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
                                                  IStrategoTerm d_19 = null;
                                                  IStrategoTerm e_19 = null;
                                                  d_19 = term.getSubterm(0);
                                                  e_19 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(d_19, termFactory.makeListCons(transform.constFBOX18, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{e_19}), (IStrategoList)transform.constNil0)))});
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
                                                      IStrategoTerm b_19 = null;
                                                      b_19 = term.getSubterm(0);
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(b_19, (IStrategoList)transform.constCons7)});
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
                                                        IStrategoTerm a_19 = null;
                                                        a_19 = term.getSubterm(0);
                                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(a_19, (IStrategoList)transform.constNil0)});
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
                                                              IStrategoTerm z_18 = null;
                                                              z_18 = term.getSubterm(0);
                                                              term = z_18;
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
                                                                IStrategoTerm n_18 = null;
                                                                IStrategoTerm o_18 = null;
                                                                IStrategoTerm p_18 = null;
                                                                IStrategoTerm q_18 = null;
                                                                IStrategoTerm r_18 = null;
                                                                IStrategoTerm s_18 = null;
                                                                IStrategoTerm t_18 = null;
                                                                IStrategoTerm u_18 = null;
                                                                IStrategoTerm v_18 = null;
                                                                IStrategoTerm w_18 = null;
                                                                IStrategoTerm arg1 = term.getSubterm(0);
                                                                if(arg1.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg1).getConstructor())
                                                                  break Fail45;
                                                                p_18 = arg1.getSubterm(0);
                                                                IStrategoTerm arg2 = term.getSubterm(1);
                                                                if(arg2.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg2).getConstructor())
                                                                  break Fail45;
                                                                q_18 = arg2.getSubterm(0);
                                                                n_18 = term.getSubterm(2);
                                                                o_18 = term.getSubterm(3);
                                                                s_18 = term.getSubterm(4);
                                                                u_18 = term.getSubterm(5);
                                                                w_18 = term;
                                                                term = termFactory.makeTuple(p_18, q_18);
                                                                term = conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail45;
                                                                r_18 = term;
                                                                term = list_to_args_0_0.instance.invoke(context, s_18);
                                                                if(term == null)
                                                                  break Fail45;
                                                                t_18 = term;
                                                                term = option_to_boxes_0_0.instance.invoke(context, u_18);
                                                                if(term == null)
                                                                  break Fail45;
                                                                v_18 = term;
                                                                term = w_18;
                                                                IStrategoList list0;
                                                                list0 = checkListTail(v_18);
                                                                if(list0 == null)
                                                                  break Fail45;
                                                                term = termFactory.makeTuple(r_18, (IStrategoTerm)termFactory.makeListCons(n_18, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(o_18, termFactory.makeListCons(t_18, (IStrategoList)transform.constNil0))}), list0)));
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
                                                                  IStrategoTerm b_18 = null;
                                                                  IStrategoTerm c_18 = null;
                                                                  IStrategoTerm d_18 = null;
                                                                  IStrategoTerm e_18 = null;
                                                                  IStrategoTerm f_18 = null;
                                                                  IStrategoTerm g_18 = null;
                                                                  IStrategoTerm j_18 = null;
                                                                  IStrategoTerm arg3 = term.getSubterm(0);
                                                                  if(arg3.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg3).getConstructor())
                                                                    break Fail46;
                                                                  d_18 = arg3.getSubterm(0);
                                                                  IStrategoTerm arg4 = term.getSubterm(1);
                                                                  if(arg4.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg4).getConstructor())
                                                                    break Fail46;
                                                                  e_18 = arg4.getSubterm(0);
                                                                  b_18 = term.getSubterm(2);
                                                                  g_18 = term.getSubterm(3);
                                                                  c_18 = term.getSubterm(4);
                                                                  term = termFactory.makeTuple(d_18, e_18);
                                                                  term = conc_0_0.instance.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail46;
                                                                  f_18 = term;
                                                                  term = list_to_args_0_0.instance.invoke(context, g_18);
                                                                  if(term == null)
                                                                    break Fail46;
                                                                  j_18 = term;
                                                                  term = termFactory.makeTuple(f_18, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(b_18, termFactory.makeListCons(j_18, (IStrategoList)transform.constNil0))}), termFactory.makeListCons(c_18, (IStrategoList)transform.constNil0)));
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
              IStrategoTerm t_17 = null;
              IStrategoTerm u_17 = null;
              IStrategoTerm v_17 = null;
              IStrategoTerm w_17 = null;
              IStrategoTerm x_17 = null;
              IStrategoTerm arg5 = term.getSubterm(0);
              if(arg5.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg5).getConstructor())
                break Fail48;
              v_17 = arg5.getSubterm(0);
              IStrategoTerm arg6 = term.getSubterm(1);
              if(arg6.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg6).getConstructor())
                break Fail48;
              w_17 = arg6.getSubterm(0);
              t_17 = term.getSubterm(2);
              u_17 = term.getSubterm(3);
              term = termFactory.makeTuple(v_17, w_17);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail48;
              x_17 = term;
              term = termFactory.makeTuple(x_17, (IStrategoTerm)termFactory.makeListCons(t_17, termFactory.makeListCons(u_17, (IStrategoList)transform.constNil0)));
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
                IStrategoTerm s_17 = null;
                s_17 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{s_17});
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
                  IStrategoTerm q_17 = null;
                  IStrategoTerm r_17 = null;
                  q_17 = term.getSubterm(0);
                  r_17 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(q_17, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{r_17}), (IStrategoList)transform.constNil0)))});
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
                    IStrategoTerm o_17 = null;
                    IStrategoTerm p_17 = null;
                    o_17 = term.getSubterm(0);
                    p_17 = term.getSubterm(1);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(o_17, termFactory.makeListCons(transform.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{p_17}), (IStrategoList)transform.constNil0)))});
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
                        IStrategoTerm n_17 = null;
                        n_17 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(n_17, (IStrategoList)transform.constCons9)});
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
                          IStrategoTerm m_17 = null;
                          m_17 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(m_17, (IStrategoList)transform.constCons10)});
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
                            IStrategoTerm l_17 = null;
                            l_17 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(l_17, (IStrategoList)transform.constNil0))});
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
                              IStrategoTerm k_17 = null;
                              k_17 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, k_17});
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
                                IStrategoTerm h_17 = null;
                                h_17 = term.getSubterm(0);
                                term = separate_by_comma_0_0.instance.invoke(context, h_17);
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
                                  IStrategoTerm g_17 = null;
                                  g_17 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(g_17, (IStrategoList)transform.constNil0))});
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
                                    IStrategoTerm d_17 = null;
                                    d_17 = term.getSubterm(0);
                                    term = has_leftmost_not_0_0.instance.invoke(context, d_17);
                                    if(term == null)
                                      break Fail59;
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS1, termFactory.makeListCons(d_17, (IStrategoList)transform.constCons1))});
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
                                      IStrategoTerm b_17 = null;
                                      b_17 = term.getSubterm(0);
                                      term = b_17;
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
                                      term = b_17;
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
                                        IStrategoTerm a_17 = null;
                                        a_17 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(a_17, (IStrategoList)transform.constNil0))});
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
                                          IStrategoTerm z_16 = null;
                                          z_16 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(z_16, (IStrategoList)transform.constCons1)))});
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
                                            IStrategoTerm v_16 = null;
                                            IStrategoTerm w_16 = null;
                                            v_16 = term.getSubterm(0);
                                            w_16 = term.getSubterm(1);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(v_16, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(w_16, (IStrategoList)transform.constCons1))))});
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
                                              IStrategoTerm u_16 = null;
                                              u_16 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(u_16, (IStrategoList)transform.constNil0))});
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
                                                IStrategoTerm r_16 = null;
                                                IStrategoTerm s_16 = null;
                                                r_16 = term.getSubterm(0);
                                                s_16 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(r_16, termFactory.makeListCons(transform.constS35, termFactory.makeListCons(s_16, (IStrategoList)transform.constNil0)))});
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
                                                  IStrategoTerm p_16 = null;
                                                  IStrategoTerm q_16 = null;
                                                  p_16 = term.getSubterm(0);
                                                  q_16 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(p_16, termFactory.makeListCons(transform.constS36, termFactory.makeListCons(q_16, (IStrategoList)transform.constNil0)))});
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
                                                    IStrategoTerm k_16 = null;
                                                    IStrategoTerm l_16 = null;
                                                    k_16 = term.getSubterm(0);
                                                    IStrategoTerm arg7 = term.getSubterm(1);
                                                    l_16 = arg7;
                                                    if(arg7.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg7).getConstructor())
                                                      break Fail68;
                                                    term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(k_16, termFactory.makeListCons(l_16, (IStrategoList)transform.constNil0))});
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
                                                      IStrategoTerm j_16 = null;
                                                      j_16 = term.getSubterm(0);
                                                      IStrategoTerm arg9 = term.getSubterm(1);
                                                      if(arg9.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg9).getConstructor())
                                                        break Fail69;
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(j_16, (IStrategoList)transform.constCons5)});
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
                                                        IStrategoTerm i_15 = null;
                                                        IStrategoTerm o_15 = null;
                                                        IStrategoTerm p_15 = null;
                                                        IStrategoTerm q_15 = null;
                                                        IStrategoTerm r_15 = null;
                                                        IStrategoTerm s_15 = null;
                                                        IStrategoTerm t_15 = null;
                                                        IStrategoTerm u_15 = null;
                                                        IStrategoTerm w_15 = null;
                                                        IStrategoTerm x_15 = null;
                                                        IStrategoTerm y_15 = null;
                                                        IStrategoTerm z_15 = null;
                                                        IStrategoTerm c_16 = null;
                                                        IStrategoTerm d_16 = null;
                                                        IStrategoTerm g_16 = null;
                                                        IStrategoTerm h_16 = null;
                                                        y_15 = term.getSubterm(0);
                                                        s_15 = term.getSubterm(1);
                                                        i_15 = term.getSubterm(2);
                                                        o_15 = term.getSubterm(3);
                                                        t_15 = term.getSubterm(4);
                                                        IStrategoTerm arg10 = term.getSubterm(5);
                                                        if(arg10.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg10).getConstructor())
                                                          break Fail70;
                                                        p_15 = arg10.getSubterm(0);
                                                        q_15 = term.getSubterm(6);
                                                        w_15 = term.getSubterm(7);
                                                        d_16 = term;
                                                        term = list_to_args_0_0.instance.invoke(context, q_15);
                                                        if(term == null)
                                                          break Fail70;
                                                        r_15 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, s_15);
                                                        if(term == null)
                                                          break Fail70;
                                                        z_15 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, t_15);
                                                        if(term == null)
                                                          break Fail70;
                                                        u_15 = term;
                                                        term = option_to_boxes_0_0.instance.invoke(context, w_15);
                                                        if(term == null)
                                                          break Fail70;
                                                        x_15 = term;
                                                        term = termFactory.makeTuple(y_15, z_15);
                                                        term = conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail70;
                                                        c_16 = term;
                                                        term = d_16;
                                                        h_16 = term;
                                                        term = termFactory.makeTuple(u_15, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{p_15}), termFactory.makeListCons(r_15, (IStrategoList)transform.constNil0))));
                                                        term = make$Conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail70;
                                                        g_16 = term;
                                                        term = h_16;
                                                        IStrategoList list2;
                                                        IStrategoList list1;
                                                        list1 = checkListTail(x_15);
                                                        if(list1 == null)
                                                          break Fail70;
                                                        list2 = checkListTail(g_16);
                                                        if(list2 == null)
                                                          break Fail70;
                                                        term = termFactory.makeTuple(c_16, (IStrategoTerm)termFactory.makeListCons(i_15, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(o_15, list2)}), list1)));
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
                                                          IStrategoTerm g_15 = null;
                                                          IStrategoTerm h_15 = null;
                                                          g_15 = term.getSubterm(0);
                                                          h_15 = term.getSubterm(1);
                                                          term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(g_15, termFactory.makeListCons(h_15, (IStrategoList)transform.constNil0))});
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
              IStrategoTerm n_14 = null;
              IStrategoTerm o_14 = null;
              IStrategoTerm p_14 = null;
              IStrategoTerm s_14 = null;
              IStrategoTerm t_14 = null;
              IStrategoTerm u_14 = null;
              IStrategoTerm v_14 = null;
              IStrategoTerm w_14 = null;
              IStrategoTerm x_14 = null;
              IStrategoTerm y_14 = null;
              IStrategoTerm z_14 = null;
              IStrategoTerm a_15 = null;
              IStrategoTerm d_15 = null;
              IStrategoTerm f_15 = null;
              x_14 = term.getSubterm(0);
              s_14 = term.getSubterm(1);
              n_14 = term.getSubterm(2);
              t_14 = term.getSubterm(3);
              o_14 = term.getSubterm(4);
              v_14 = term.getSubterm(5);
              a_15 = term;
              term = list_to_args_0_0.instance.invoke(context, o_14);
              if(term == null)
                break Fail73;
              p_14 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, s_14);
              if(term == null)
                break Fail73;
              y_14 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, t_14);
              if(term == null)
                break Fail73;
              u_14 = term;
              term = option_to_boxes_0_0.instance.invoke(context, v_14);
              if(term == null)
                break Fail73;
              w_14 = term;
              term = termFactory.makeTuple(x_14, y_14);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail73;
              z_14 = term;
              term = a_15;
              f_15 = term;
              term = termFactory.makeTuple(u_14, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(transform.constFBOX19, termFactory.makeListCons(p_14, (IStrategoList)transform.constNil0))));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail73;
              d_15 = term;
              term = f_15;
              IStrategoList list4;
              IStrategoList list3;
              list3 = checkListTail(w_14);
              if(list3 == null)
                break Fail73;
              list4 = checkListTail(d_15);
              if(list4 == null)
                break Fail73;
              term = termFactory.makeTuple(z_14, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(n_14, list4)}), list3));
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
                IStrategoTerm c_14 = null;
                IStrategoTerm d_14 = null;
                IStrategoTerm e_14 = null;
                IStrategoTerm f_14 = null;
                IStrategoTerm g_14 = null;
                IStrategoTerm h_14 = null;
                IStrategoTerm i_14 = null;
                IStrategoTerm l_14 = null;
                IStrategoTerm m_14 = null;
                c_14 = term.getSubterm(0);
                d_14 = term.getSubterm(1);
                e_14 = term.getSubterm(2);
                g_14 = term.getSubterm(3);
                f_14 = term.getSubterm(4);
                i_14 = term;
                term = option_to_boxes_0_0.instance.invoke(context, g_14);
                if(term == null)
                  break Fail74;
                h_14 = term;
                term = i_14;
                m_14 = term;
                term = termFactory.makeTuple(h_14, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(f_14, (IStrategoList)transform.constCons5)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail74;
                l_14 = term;
                term = m_14;
                IStrategoList list5;
                list5 = checkListTail(l_14);
                if(list5 == null)
                  break Fail74;
                term = termFactory.makeTuple(c_14, (IStrategoTerm)termFactory.makeListCons(d_14, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(e_14, list5)}), (IStrategoList)transform.constNil0)));
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
                  IStrategoTerm o_13 = null;
                  IStrategoTerm p_13 = null;
                  IStrategoTerm q_13 = null;
                  IStrategoTerm r_13 = null;
                  IStrategoTerm s_13 = null;
                  IStrategoTerm t_13 = null;
                  IStrategoTerm u_13 = null;
                  IStrategoTerm a_14 = null;
                  IStrategoTerm b_14 = null;
                  o_13 = term.getSubterm(0);
                  p_13 = term.getSubterm(1);
                  s_13 = term.getSubterm(2);
                  q_13 = term.getSubterm(3);
                  r_13 = term.getSubterm(4);
                  u_13 = term;
                  term = option_to_boxes_0_0.instance.invoke(context, s_13);
                  if(term == null)
                    break Fail75;
                  t_13 = term;
                  term = u_13;
                  b_14 = term;
                  term = termFactory.makeTuple(t_13, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(q_13, (IStrategoList)transform.constNil0)));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75;
                  a_14 = term;
                  term = b_14;
                  IStrategoList list6;
                  list6 = checkListTail(a_14);
                  if(list6 == null)
                    break Fail75;
                  term = termFactory.makeTuple(o_13, (IStrategoTerm)termFactory.makeListCons(p_13, list6));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75;
                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term}), termFactory.makeListCons(r_13, (IStrategoList)transform.constNil0))});
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
                    IStrategoTerm i_13 = null;
                    i_13 = term.getSubterm(0);
                    term = separate_by_comma_0_0.instance.invoke(context, i_13);
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
                      IStrategoTerm e_13 = null;
                      IStrategoTerm f_13 = null;
                      f_13 = term.getSubterm(0);
                      e_13 = term.getSubterm(1);
                      term = separate_by_comma_0_0.instance.invoke(context, f_13);
                      if(term == null)
                        break Fail77;
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX25, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons12)))}), termFactory.makeListCons(e_13, (IStrategoList)transform.constNil0))});
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
                        IStrategoTerm x_12 = null;
                        IStrategoTerm y_12 = null;
                        x_12 = term.getSubterm(0);
                        y_12 = term.getSubterm(1);
                        term = separate_by_comma_0_0.instance.invoke(context, y_12);
                        if(term == null)
                          break Fail78;
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(x_12, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX26, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons12)))}), (IStrategoList)transform.constNil0))});
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
                            IStrategoTerm w_12 = null;
                            w_12 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX27, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(w_12, (IStrategoList)transform.constCons12)))});
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
                                IStrategoTerm v_12 = null;
                                v_12 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX28, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(v_12, (IStrategoList)transform.constCons12)))});
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
                                  IStrategoTerm q_12 = null;
                                  IStrategoTerm r_12 = null;
                                  IStrategoTerm s_12 = null;
                                  q_12 = term.getSubterm(0);
                                  r_12 = term.getSubterm(1);
                                  s_12 = term.getSubterm(2);
                                  term = termFactory.makeTuple(q_12, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX29, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(r_12, termFactory.makeListCons(s_12, (IStrategoList)transform.constCons13))))));
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
                                    IStrategoTerm l_12 = null;
                                    IStrategoTerm m_12 = null;
                                    IStrategoTerm n_12 = null;
                                    l_12 = term.getSubterm(0);
                                    m_12 = term.getSubterm(1);
                                    n_12 = term.getSubterm(2);
                                    term = termFactory.makeTuple(l_12, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX31, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(m_12, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(n_12, (IStrategoList)transform.constCons13)))))));
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
              IStrategoTerm j_12 = null;
              IStrategoTerm k_12 = null;
              j_12 = term.getSubterm(0);
              k_12 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX32, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(j_12, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(k_12, (IStrategoList)transform.constCons13))))))});
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
                IStrategoTerm h_12 = null;
                IStrategoTerm i_12 = null;
                h_12 = term.getSubterm(0);
                i_12 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX33, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(h_12, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(i_12, (IStrategoList)transform.constCons13))))))});
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
                  IStrategoTerm b_12 = null;
                  IStrategoTerm c_12 = null;
                  IStrategoTerm d_12 = null;
                  b_12 = term.getSubterm(0);
                  c_12 = term.getSubterm(1);
                  term = separate_by_comma_0_0.instance.invoke(context, c_12);
                  if(term == null)
                    break Fail88;
                  d_12 = term;
                  term = termFactory.makeTuple(b_12, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX34, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(d_12, (IStrategoList)transform.constCons13)))));
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
                    IStrategoTerm v_11 = null;
                    IStrategoTerm w_11 = null;
                    IStrategoTerm x_11 = null;
                    IStrategoTerm y_11 = null;
                    v_11 = term.getSubterm(0);
                    w_11 = term.getSubterm(1);
                    x_11 = term.getSubterm(2);
                    y_11 = term.getSubterm(3);
                    term = termFactory.makeTuple(v_11, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(w_11, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(x_11, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(y_11, (IStrategoList)transform.constCons5)))))));
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
                              IStrategoTerm t_11 = null;
                              IStrategoTerm u_11 = null;
                              t_11 = term.getSubterm(0);
                              u_11 = term.getSubterm(1);
                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(t_11, termFactory.makeListCons(u_11, (IStrategoList)transform.constNil0))});
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
                                IStrategoTerm a_11 = null;
                                IStrategoTerm b_11 = null;
                                IStrategoTerm c_11 = null;
                                IStrategoTerm d_11 = null;
                                IStrategoTerm e_11 = null;
                                IStrategoTerm f_11 = null;
                                IStrategoTerm g_11 = null;
                                IStrategoTerm h_11 = null;
                                IStrategoTerm i_11 = null;
                                IStrategoTerm j_11 = null;
                                IStrategoTerm k_11 = null;
                                IStrategoTerm n_11 = null;
                                IStrategoTerm o_11 = null;
                                a_11 = term.getSubterm(0);
                                b_11 = term.getSubterm(1);
                                c_11 = term.getSubterm(2);
                                e_11 = term.getSubterm(3);
                                g_11 = term.getSubterm(4);
                                i_11 = term.getSubterm(5);
                                k_11 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, c_11);
                                if(term == null)
                                  break Fail95;
                                d_11 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, e_11);
                                if(term == null)
                                  break Fail95;
                                f_11 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, g_11);
                                if(term == null)
                                  break Fail95;
                                h_11 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, i_11);
                                if(term == null)
                                  break Fail95;
                                j_11 = term;
                                term = k_11;
                                o_11 = term;
                                term = termFactory.makeTuple(h_11, j_11);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                term = termFactory.makeTuple(f_11, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                term = termFactory.makeTuple(d_11, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                n_11 = term;
                                term = o_11;
                                IStrategoList list7;
                                list7 = checkListTail(n_11);
                                if(list7 == null)
                                  break Fail95;
                                term = termFactory.makeTuple(a_11, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX35, termFactory.makeListCons(b_11, list7)));
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
                                  IStrategoTerm z_10 = null;
                                  z_10 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX36, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(z_10, (IStrategoList)transform.constCons1)))});
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
                                    IStrategoTerm y_10 = null;
                                    y_10 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX37, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(y_10, (IStrategoList)transform.constCons1)))});
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
                                      IStrategoTerm x_10 = null;
                                      x_10 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX38, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(x_10, (IStrategoList)transform.constCons1)))});
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
                                        IStrategoTerm w_10 = null;
                                        w_10 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX39, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(w_10, (IStrategoList)transform.constCons1)))});
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
                                          IStrategoTerm v_10 = null;
                                          v_10 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX40, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(v_10, (IStrategoList)transform.constCons1)))});
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
                                              IStrategoTerm u_10 = null;
                                              u_10 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constNil0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons16, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX43, termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons17, u_10}), (IStrategoList)transform.constNil0))}), (IStrategoList)transform.constCons14)});
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
              IStrategoTerm m_21 = null;
              m_21 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX46, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(m_21, (IStrategoList)transform.constCons1)))});
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
                IStrategoTerm l_21 = null;
                l_21 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX47, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(l_21, (IStrategoList)transform.constCons1)))});
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
        term = n_21.instance.invoke(context, term);
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
              IStrategoTerm o_21 = null;
              o_21 = term.getSubterm(0);
              term = o_21;
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
        IStrategoTerm s_21 = null;
        term = pp_java5_to_abox_1_0.instance.invoke(context, term, lifted3.instance);
        if(term == null)
          break Fail110;
        s_21 = term;
        term = box2text_string_0_1.instance.invoke(context, s_21, transform.const68);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_21)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference w_21 = new TermReference(ref_w_21);
      context.push("closures_to_ajc_0_1");
      Fail114:
      { 
        TermReference y_21 = new TermReference();
        TermReference z_21 = new TermReference();
        IStrategoTerm a_22 = null;
        IStrategoTerm b_22 = null;
        IStrategoTerm h_22 = null;
        IStrategoTerm j_22 = null;
        IStrategoTerm k_22 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail114;
        b_22 = term.getSubterm(0);
        IStrategoTerm arg21 = term.getSubterm(1);
        if(arg21.getTermType() != IStrategoTerm.APPL || transform._consAspectBody_1 != ((IStrategoAppl)arg21).getConstructor())
          break Fail114;
        a_22 = arg21.getSubterm(0);
        term = b_22;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDecHead_6 != ((IStrategoAppl)term).getConstructor())
          break Fail114;
        IStrategoTerm arg23 = term.getSubterm(1);
        if(arg23.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg23).getConstructor())
          break Fail114;
        if(z_21.value == null)
          z_21.value = arg23.getSubterm(0);
        else
          if(z_21.value != arg23.getSubterm(0) && !z_21.value.match(arg23.getSubterm(0)))
            break Fail114;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail114;
        if(y_21.value == null)
          y_21.value = term;
        else
          if(y_21.value != term && !y_21.value.match(term))
            break Fail114;
        term = a_22;
        lifted4 lifted410 = new lifted4();
        lifted410.y_21 = y_21;
        lifted410.w_21 = w_21;
        lifted410.z_21 = z_21;
        term = topdown_1_0.instance.invoke(context, term, lifted410);
        if(term == null)
          break Fail114;
        term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{b_22, termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term})});
        j_22 = term;
        h_22 = transform.constNone0;
        term = j_22;
        k_22 = j_22;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail114;
        term = replace_0_2.instance.invoke(context, k_22, h_22, term);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_47, IStrategoTerm n_47, IStrategoTerm o_47)
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
              IStrategoTerm o_24 = null;
              IStrategoTerm p_24 = null;
              IStrategoTerm q_24 = null;
              IStrategoTerm r_24 = null;
              r_24 = term.getSubterm(0);
              o_24 = term.getSubterm(1);
              p_24 = term.getSubterm(2);
              q_24 = term.getSubterm(3);
              term = gen_joinpoint_body_0_1.instance.invoke(context, term, r_24);
              if(term == null)
                break Fail116;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons19, transform.constNone0, r_24, o_24, p_24, q_24}), term});
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
                IStrategoTerm x_23 = null;
                IStrategoTerm y_23 = null;
                IStrategoTerm z_23 = null;
                IStrategoTerm a_24 = null;
                IStrategoTerm b_24 = null;
                IStrategoTerm e_24 = null;
                x_23 = term.getSubterm(0);
                IStrategoTerm arg28 = term.getSubterm(1);
                if(arg28.getTermType() != IStrategoTerm.APPL || transform._consCJPAround_3 != ((IStrategoAppl)arg28).getConstructor())
                  break Fail117;
                y_23 = arg28.getSubterm(0);
                IStrategoTerm arg29 = arg28.getSubterm(1);
                if(arg29.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg29).getConstructor())
                  break Fail117;
                z_23 = arg29.getSubterm(0);
                a_24 = arg28.getSubterm(2);
                b_24 = term.getSubterm(3);
                term = map_1_0.instance.invoke(context, a_24, lifted6.instance);
                if(term == null)
                  break Fail117;
                e_24 = term;
                term = map_1_0.instance.invoke(context, a_24, lifted7.instance);
                if(term == null)
                  break Fail117;
                term = termFactory.makeAppl(transform._consAdviceDec_5, new IStrategoTerm[]{x_23, termFactory.makeAppl(transform._consAround_2, new IStrategoTerm[]{y_23, a_24}), transform.constNone0, termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{z_23}), e_24, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})}), b_24});
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
                  IStrategoTerm h_23 = null;
                  IStrategoTerm i_23 = null;
                  IStrategoTerm j_23 = null;
                  IStrategoTerm k_23 = null;
                  IStrategoTerm n_23 = null;
                  h_23 = term.getSubterm(0);
                  IStrategoTerm arg35 = term.getSubterm(1);
                  if(arg35.getTermType() != IStrategoTerm.APPL || transform._consCJPBefore_2 != ((IStrategoAppl)arg35).getConstructor())
                    break Fail118;
                  IStrategoTerm arg36 = arg35.getSubterm(0);
                  if(arg36.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg36).getConstructor())
                    break Fail118;
                  i_23 = arg36.getSubterm(0);
                  j_23 = arg35.getSubterm(1);
                  k_23 = term.getSubterm(3);
                  term = map_1_0.instance.invoke(context, j_23, lifted8.instance);
                  if(term == null)
                    break Fail118;
                  n_23 = term;
                  term = map_1_0.instance.invoke(context, j_23, lifted9.instance);
                  if(term == null)
                    break Fail118;
                  term = termFactory.makeAppl(transform._consAdviceDec_5, new IStrategoTerm[]{h_23, termFactory.makeAppl(transform._consBefore_1, new IStrategoTerm[]{j_23}), transform.constNone0, termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{i_23}), n_23, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})}), k_23});
                  if(true)
                    break Success106;
                }
                term = term107;
              }
              if(cons8 == transform._consCJPAdvice_4)
              { 
                IStrategoTerm r_22 = null;
                IStrategoTerm s_22 = null;
                IStrategoTerm t_22 = null;
                IStrategoTerm u_22 = null;
                IStrategoTerm x_22 = null;
                r_22 = term.getSubterm(0);
                IStrategoTerm arg42 = term.getSubterm(1);
                if(arg42.getTermType() != IStrategoTerm.APPL || transform._consCJPAfter_2 != ((IStrategoAppl)arg42).getConstructor())
                  break Fail115;
                IStrategoTerm arg43 = arg42.getSubterm(0);
                if(arg43.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg43).getConstructor())
                  break Fail115;
                s_22 = arg43.getSubterm(0);
                t_22 = arg42.getSubterm(1);
                u_22 = term.getSubterm(3);
                term = map_1_0.instance.invoke(context, t_22, lifted10.instance);
                if(term == null)
                  break Fail115;
                x_22 = term;
                term = map_1_0.instance.invoke(context, t_22, lifted11.instance);
                if(term == null)
                  break Fail115;
                term = termFactory.makeAppl(transform._consAdviceDec_5, new IStrategoTerm[]{r_22, termFactory.makeAppl(transform._consAfter_2, new IStrategoTerm[]{t_22, transform.constNone0}), transform.constNone0, termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{s_22}), x_22, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})}), u_22});
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

  @SuppressWarnings("all") public static class gen_joinpoint_body_0_1 extends Strategy 
  { 
    public static gen_joinpoint_body_0_1 instance = new gen_joinpoint_body_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_24)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_joinpoint_body_0_1");
      Fail119:
      { 
        term = get_default_return_value_for_return_type_0_0.instance.invoke(context, u_24);
        if(term == null)
          break Fail119;
        term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_default_return_value_for_return_type_0_0 extends Strategy 
  { 
    public static get_default_return_value_for_return_type_0_0 instance = new get_default_return_value_for_return_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail120:
      { 
        IStrategoTerm x_24 = null;
        IStrategoTerm y_24 = null;
        IStrategoTerm z_24 = null;
        x_24 = term;
        z_24 = term;
        y_24 = x_24;
        term = z_24;
        IStrategoTerm term110 = term;
        Success107:
        { 
          Fail121:
          { 
            IStrategoTerm a_25 = null;
            a_25 = term;
            term = y_24;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consVoid_0 != ((IStrategoAppl)term).getConstructor())
              break Fail121;
            term = a_25;
            { 
              term = transform.constNone0;
              if(true)
                break Success107;
            }
          }
          term = term110;
          IStrategoTerm term111 = term;
          Success108:
          { 
            Fail122:
            { 
              IStrategoTerm b_25 = null;
              b_25 = term;
              term = y_24;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail122;
              term = b_25;
              { 
                term = transform.constSome0;
                if(true)
                  break Success108;
              }
            }
            term = term111;
            IStrategoTerm term112 = term;
            Success109:
            { 
              Fail123:
              { 
                IStrategoTerm c_25 = null;
                c_25 = term;
                term = y_24;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail123;
                term = c_25;
                { 
                  term = transform.constSome0;
                  if(true)
                    break Success109;
                }
              }
              term = term112;
              IStrategoTerm term113 = term;
              Success110:
              { 
                Fail124:
                { 
                  IStrategoTerm d_25 = null;
                  d_25 = term;
                  term = y_24;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail124;
                  term = d_25;
                  { 
                    term = transform.constSome0;
                    if(true)
                      break Success110;
                  }
                }
                term = term113;
                IStrategoTerm term114 = term;
                Success111:
                { 
                  Fail125:
                  { 
                    IStrategoTerm e_25 = null;
                    e_25 = term;
                    term = y_24;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail125;
                    term = e_25;
                    { 
                      term = transform.constSome0;
                      if(true)
                        break Success111;
                    }
                  }
                  term = term114;
                  IStrategoTerm term115 = term;
                  Success112:
                  { 
                    Fail126:
                    { 
                      IStrategoTerm f_25 = null;
                      f_25 = term;
                      term = y_24;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail126;
                      term = f_25;
                      { 
                        term = transform.constSome0;
                        if(true)
                          break Success112;
                      }
                    }
                    term = term115;
                    IStrategoTerm term116 = term;
                    Success113:
                    { 
                      Fail127:
                      { 
                        IStrategoTerm g_25 = null;
                        g_25 = term;
                        term = y_24;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail127;
                        term = g_25;
                        { 
                          term = transform.constSome0;
                          if(true)
                            break Success113;
                        }
                      }
                      term = term116;
                      Success114:
                      { 
                        Fail128:
                        { 
                          IStrategoTerm h_25 = null;
                          h_25 = term;
                          term = y_24;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail128;
                          term = h_25;
                          { 
                            term = transform.constSome1;
                            if(true)
                              break Success114;
                          }
                        }
                        term = transform.constSome2;
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

  @SuppressWarnings("all") public static class replace_0_2 extends Strategy 
  { 
    public static replace_0_2 instance = new replace_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_25, IStrategoTerm ref_l_25)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference l_25 = new TermReference(ref_l_25);
      context.push("replace_0_2");
      Fail129:
      { 
        IStrategoTerm n_25 = null;
        IStrategoTerm o_25 = null;
        IStrategoTerm r_25 = null;
        TermReference s_25 = new TermReference();
        IStrategoTerm t_25 = null;
        IStrategoTerm u_25 = null;
        IStrategoTerm v_25 = null;
        IStrategoTerm w_25 = null;
        IStrategoTerm x_25 = null;
        TermReference y_25 = new TermReference();
        IStrategoTerm z_25 = null;
        IStrategoTerm a_26 = null;
        IStrategoTerm b_26 = null;
        IStrategoTerm c_26 = null;
        IStrategoTerm d_26 = null;
        IStrategoTerm e_26 = null;
        IStrategoTerm f_26 = null;
        IStrategoTerm g_26 = null;
        e_26 = term;
        term = debug_0_0.instance.invoke(context, transform.const70);
        if(term == null)
          break Fail129;
        term = debug_0_0.instance.invoke(context, e_26);
        if(term == null)
          break Fail129;
        g_26 = term;
        f_26 = term;
        term = g_26;
        IStrategoTerm term118 = term;
        Success115:
        { 
          Fail130:
          { 
            IStrategoTerm h_26 = null;
            h_26 = term;
            term = f_26;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
              break Fail130;
            u_25 = term.getSubterm(0);
            IStrategoTerm arg49 = term.getSubterm(1);
            if(arg49.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg49).getConstructor())
              break Fail130;
            n_25 = arg49.getSubterm(0);
            term = h_26;
            { 
              if(l_25.value == null)
                break Fail129;
              term = hashtable_copy_0_0.instance.invoke(context, l_25.value);
              if(term == null)
                break Fail129;
              if(y_25.value == null)
                y_25.value = term;
              else
                if(y_25.value != term && !y_25.value.match(term))
                  break Fail129;
              term = filter_1_0.instance.invoke(context, n_25, lifted12.instance);
              if(term == null)
                break Fail129;
              lifted13 lifted130 = new lifted13();
              lifted130.y_25 = y_25;
              term = map_1_0.instance.invoke(context, term, lifted130);
              if(term == null)
                break Fail129;
              term = n_25;
              lifted15 lifted150 = new lifted15();
              lifted150.y_25 = y_25;
              term = map_1_0.instance.invoke(context, term, lifted150);
              if(term == null)
                break Fail129;
              term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{u_25, termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term})});
              if(true)
                break Success115;
            }
          }
          term = term118;
          IStrategoTerm term119 = term;
          Success116:
          { 
            Fail131:
            { 
              IStrategoTerm k_26 = null;
              k_26 = term;
              term = f_26;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDec_2 != ((IStrategoAppl)term).getConstructor())
                break Fail131;
              u_25 = term.getSubterm(0);
              IStrategoTerm arg54 = term.getSubterm(1);
              if(arg54.getTermType() != IStrategoTerm.APPL || transform._consAspectBody_1 != ((IStrategoAppl)arg54).getConstructor())
                break Fail131;
              n_25 = arg54.getSubterm(0);
              term = k_26;
              { 
                if(l_25.value == null)
                  break Fail129;
                term = hashtable_copy_0_0.instance.invoke(context, l_25.value);
                if(term == null)
                  break Fail129;
                if(y_25.value == null)
                  y_25.value = term;
                else
                  if(y_25.value != term && !y_25.value.match(term))
                    break Fail129;
                term = filter_1_0.instance.invoke(context, n_25, lifted16.instance);
                if(term == null)
                  break Fail129;
                lifted17 lifted170 = new lifted17();
                lifted170.y_25 = y_25;
                term = map_1_0.instance.invoke(context, term, lifted170);
                if(term == null)
                  break Fail129;
                term = n_25;
                lifted19 lifted190 = new lifted19();
                lifted190.y_25 = y_25;
                term = map_1_0.instance.invoke(context, term, lifted190);
                if(term == null)
                  break Fail129;
                term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{u_25, termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term})});
                if(true)
                  break Success116;
              }
            }
            term = term119;
            IStrategoTerm term120 = term;
            Success117:
            { 
              Fail132:
              { 
                IStrategoTerm n_26 = null;
                n_26 = term;
                term = f_26;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail132;
                o_25 = term.getSubterm(0);
                term = n_26;
                { 
                  term = debug_0_0.instance.invoke(context, transform.const71);
                  if(term == null)
                    break Fail129;
                  if(l_25.value == null)
                    break Fail129;
                  term = hashtable_copy_0_0.instance.invoke(context, l_25.value);
                  if(term == null)
                    break Fail129;
                  if(y_25.value == null)
                    y_25.value = term;
                  else
                    if(y_25.value != term && !y_25.value.match(term))
                      break Fail129;
                  term = o_25;
                  lifted20 lifted200 = new lifted20();
                  lifted200.y_25 = y_25;
                  term = map_1_0.instance.invoke(context, term, lifted200);
                  if(term == null)
                    break Fail129;
                  term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success117;
                }
              }
              term = term120;
              IStrategoTerm term121 = term;
              Success118:
              { 
                Fail133:
                { 
                  IStrategoTerm o_26 = null;
                  o_26 = term;
                  term = f_26;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail133;
                  IStrategoTerm arg59 = term.getSubterm(0);
                  if(arg59.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg59).getConstructor())
                    break Fail133;
                  r_25 = arg59.getSubterm(0);
                  if(s_25.value == null)
                    s_25.value = arg59.getSubterm(1);
                  else
                    if(s_25.value != arg59.getSubterm(1) && !s_25.value.match(arg59.getSubterm(1)))
                      break Fail133;
                  t_25 = arg59.getSubterm(2);
                  term = o_26;
                  { 
                    IStrategoTerm w_27 = null;
                    IStrategoTerm x_27 = null;
                    term = debug_0_0.instance.invoke(context, transform.const72);
                    if(term == null)
                      break Fail129;
                    x_27 = term;
                    term = t_25;
                    lifted21 lifted210 = new lifted21();
                    lifted210.s_25 = s_25;
                    lifted210.l_25 = l_25;
                    term = map_1_0.instance.invoke(context, term, lifted210);
                    if(term == null)
                      break Fail129;
                    w_27 = term;
                    term = x_27;
                    if(s_25.value == null)
                      break Fail129;
                    term = termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{r_25, s_25.value, w_27})});
                    if(true)
                      break Success118;
                  }
                }
                term = term121;
                IStrategoTerm term122 = term;
                Success119:
                { 
                  Fail134:
                  { 
                    IStrategoTerm p_26 = null;
                    p_26 = term;
                    term = f_26;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
                      break Fail134;
                    u_25 = term.getSubterm(0);
                    v_25 = term.getSubterm(1);
                    term = p_26;
                    { 
                      IStrategoTerm b_28 = null;
                      term = debug_0_0.instance.invoke(context, transform.const73);
                      if(term == null)
                        break Fail129;
                      if(l_25.value == null)
                        break Fail129;
                      term = hashtable_copy_0_0.instance.invoke(context, l_25.value);
                      if(term == null)
                        break Fail129;
                      if(y_25.value == null)
                        y_25.value = term;
                      else
                        if(y_25.value != term && !y_25.value.match(term))
                          break Fail129;
                      term = u_25;
                      lifted22 lifted220 = new lifted22();
                      lifted220.y_25 = y_25;
                      term = topdown_1_0.instance.invoke(context, term, lifted220);
                      if(term == null)
                        break Fail129;
                      b_28 = v_25;
                      term = this.invoke(context, b_28, transform.constNone0, y_25.value);
                      if(term == null)
                        break Fail129;
                      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{u_25, term});
                      if(true)
                        break Success119;
                    }
                  }
                  term = term122;
                  IStrategoTerm term123 = term;
                  Success120:
                  { 
                    Fail135:
                    { 
                      IStrategoTerm s_26 = null;
                      s_26 = term;
                      term = f_26;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail135;
                      IStrategoTerm arg60 = term.getSubterm(0);
                      if(arg60.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg60).getConstructor())
                        break Fail135;
                      w_25 = arg60.getSubterm(0);
                      term = s_26;
                      { 
                        if(l_25.value == null)
                          break Fail129;
                        term = add_var_0_2.instance.invoke(context, l_25.value, w_25, k_25);
                        if(term == null)
                          break Fail129;
                        term = e_26;
                        if(true)
                          break Success120;
                      }
                    }
                    term = term123;
                    IStrategoTerm term124 = term;
                    Success121:
                    { 
                      Fail136:
                      { 
                        IStrategoTerm u_26 = null;
                        u_26 = term;
                        term = f_26;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
                          break Fail136;
                        IStrategoTerm arg61 = term.getSubterm(0);
                        if(arg61.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg61).getConstructor())
                          break Fail136;
                        w_25 = arg61.getSubterm(0);
                        b_26 = term.getSubterm(1);
                        term = u_26;
                        { 
                          term = debug_0_0.instance.invoke(context, transform.const74);
                          if(term == null)
                            break Fail129;
                          if(l_25.value == null)
                            break Fail129;
                          term = add_var_0_2.instance.invoke(context, l_25.value, w_25, k_25);
                          if(term == null)
                            break Fail129;
                          term = this.invoke(context, b_26, k_25, l_25.value);
                          if(term == null)
                            break Fail129;
                          term = termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{w_25}), term});
                          if(true)
                            break Success121;
                        }
                      }
                      term = term124;
                      IStrategoTerm term125 = term;
                      Success122:
                      { 
                        Fail137:
                        { 
                          IStrategoTerm v_26 = null;
                          v_26 = term;
                          term = f_26;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consShortClosureJoinpoints_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail137;
                          term = v_26;
                          { 
                            term = debug_0_0.instance.invoke(context, transform.const75);
                            if(term == null)
                              break Fail129;
                            term = closure_to_java_0_2.instance.invoke(context, e_26, k_25, l_25.value);
                            if(term == null)
                              break Fail129;
                            if(true)
                              break Success122;
                          }
                        }
                        term = term125;
                        IStrategoTerm term126 = term;
                        Success123:
                        { 
                          Fail138:
                          { 
                            IStrategoTerm w_26 = null;
                            w_26 = term;
                            term = f_26;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consClosureJoinpoints_4 != ((IStrategoAppl)term).getConstructor())
                              break Fail138;
                            w_25 = term.getSubterm(0);
                            x_25 = term.getSubterm(1);
                            z_25 = term.getSubterm(2);
                            a_26 = term.getSubterm(3);
                            term = w_26;
                            { 
                              IStrategoTerm i_28 = null;
                              term = debug_0_0.instance.invoke(context, transform.const76);
                              if(term == null)
                                break Fail129;
                              if(l_25.value == null)
                                break Fail129;
                              term = hashtable_copy_0_0.instance.invoke(context, l_25.value);
                              if(term == null)
                                break Fail129;
                              if(y_25.value == null)
                                y_25.value = term;
                              else
                                if(y_25.value != term && !y_25.value.match(term))
                                  break Fail129;
                              term = x_25;
                              lifted24 lifted240 = new lifted24();
                              lifted240.y_25 = y_25;
                              term = topdown_1_0.instance.invoke(context, term, lifted240);
                              if(term == null)
                                break Fail129;
                              i_28 = z_25;
                              term = this.invoke(context, i_28, transform.constNone0, y_25.value);
                              if(term == null)
                                break Fail129;
                              term = termFactory.makeAppl(transform._consClosureJoinpoints_4, new IStrategoTerm[]{w_25, x_25, term, a_26});
                              term = closure_to_java_0_2.instance.invoke(context, term, k_25, l_25.value);
                              if(term == null)
                                break Fail129;
                              if(true)
                                break Success123;
                            }
                          }
                          term = term126;
                          IStrategoTerm term127 = term;
                          Success124:
                          { 
                            Fail139:
                            { 
                              IStrategoTerm x_26 = null;
                              x_26 = term;
                              term = f_26;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
                                break Fail139;
                              b_26 = term.getSubterm(0);
                              term = x_26;
                              { 
                                IStrategoTerm m_28 = null;
                                m_28 = b_26;
                                term = this.invoke(context, m_28, transform.constNone0, l_25.value);
                                if(term == null)
                                  break Fail129;
                                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{term});
                                if(true)
                                  break Success124;
                              }
                            }
                            term = term127;
                            Success125:
                            { 
                              Fail140:
                              { 
                                IStrategoTerm z_26 = null;
                                z_26 = term;
                                term = f_26;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
                                  break Fail140;
                                c_26 = term.getSubterm(0);
                                d_26 = term.getSubterm(1);
                                term = z_26;
                                { 
                                  IStrategoTerm s_28 = null;
                                  term = debug_0_0.instance.invoke(context, transform.const77);
                                  if(term == null)
                                    break Fail129;
                                  s_28 = d_26;
                                  term = get_var_type_0_1.instance.invoke(context, c_26, l_25.value);
                                  if(term == null)
                                    break Fail129;
                                  term = this.invoke(context, s_28, term, l_25.value);
                                  if(term == null)
                                    break Fail129;
                                  term = termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{c_26, term});
                                  if(true)
                                    break Success125;
                                }
                              }
                              term = debug_0_0.instance.invoke(context, transform.const78);
                              if(term == null)
                                break Fail129;
                              term = debug_0_0.instance.invoke(context, e_26);
                              if(term == null)
                                break Fail129;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_28)
    { 
      context.push("add_param_0_1");
      Fail141:
      { 
        TermReference u_28 = new TermReference();
        TermReference x_28 = new TermReference();
        lifted27 lifted270 = new lifted27();
        lifted26 lifted260 = new lifted26();
        lifted270.x_28 = x_28;
        lifted270.u_28 = u_28;
        lifted260.x_28 = x_28;
        lifted260.u_28 = u_28;
        term = or_2_0.instance.invoke(context, term, lifted260, lifted270);
        if(term == null)
          break Fail141;
        term = add_var_0_2.instance.invoke(context, t_28, u_28.value, x_28.value);
        if(term == null)
          break Fail141;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_28)
    { 
      context.push("get_var_type_0_1");
      Fail142:
      { 
        IStrategoTerm z_28 = null;
        Success126:
        { 
          Fail143:
          { 
            IStrategoTerm a_29 = null;
            a_29 = term;
            term = get_var_type_impl_0_1.instance.invoke(context, term, y_28);
            if(term == null)
              break Fail143;
            z_28 = term;
            term = a_29;
            { 
              term = z_28;
              if(true)
                break Success126;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_47)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("get_var_type_impl_0_1");
      Fail144:
      { 
        IStrategoTerm term130 = term;
        IStrategoConstructor cons9 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success127:
        { 
          if(cons9 == transform._consExprName_1)
          { 
            Fail145:
            { 
              IStrategoTerm l_29 = null;
              l_29 = term.getSubterm(0);
              term = get_var_type_0_1.instance.invoke(context, l_29, p_47);
              if(term == null)
                break Fail145;
              if(true)
                break Success127;
            }
            term = term130;
          }
          if(cons9 == transform._consId_1)
          { 
            IStrategoTerm g_29 = null;
            g_29 = term.getSubterm(0);
            IStrategoTerm term131 = term;
            Success128:
            { 
              Fail146:
              { 
                IStrategoTerm h_29 = null;
                h_29 = term;
                term = hashtable_keys_0_0.instance.invoke(context, p_47);
                if(term == null)
                  break Fail146;
                term = termFactory.makeTuple(g_29, term);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail146;
                term = h_29;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, p_47, g_29);
                  if(term == null)
                    break Fail144;
                  if(true)
                    break Success128;
                }
              }
              term = $None_0_0.instance.invoke(context, term131);
              if(term == null)
                break Fail144;
            }
          }
          else
          { 
            break Fail144;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_47, IStrategoTerm r_47)
    { 
      context.push("add_var_0_2");
      Fail147:
      { 
        IStrategoTerm term132 = term;
        Success129:
        { 
          Fail148:
          { 
            term = hashtable_put_0_2.instance.invoke(context, term, q_47, r_47);
            if(term == null)
              break Fail148;
            if(true)
              break Success129;
          }
          term = term132;
          TermReference o_29 = new TermReference();
          lifted29 lifted290 = new lifted29();
          lifted28 lifted280 = new lifted28();
          lifted290.o_29 = o_29;
          lifted280.o_29 = o_29;
          term = or_2_0.instance.invoke(context, term, lifted280, lifted290);
          if(term == null)
            break Fail147;
          term = this.invoke(context, r_47, o_29.value, q_47);
          if(term == null)
            break Fail147;
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
      Fail149:
      { 
        IStrategoTerm t_29 = null;
        TermReference u_29 = new TermReference();
        term = topdown_1_0.instance.invoke(context, term, lifted30.instance);
        if(term == null)
          break Fail149;
        t_29 = term;
        term = debug_0_0.instance.invoke(context, transform.const79);
        if(term == null)
          break Fail149;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail149;
        if(u_29.value == null)
          u_29.value = term;
        else
          if(u_29.value != term && !u_29.value.match(term))
            break Fail149;
        term = t_29;
        lifted32 lifted320 = new lifted32();
        lifted320.u_29 = u_29;
        term = fetch_elem_1_0.instance.invoke(context, term, lifted320);
        if(term == null)
          break Fail149;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_30)
    { 
      TermReference a_30 = new TermReference(ref_a_30);
      context.push("discover_return_type_impl_0_1");
      Fail150:
      { 
        IStrategoTerm b_30 = null;
        IStrategoTerm c_30 = null;
        IStrategoTerm d_30 = null;
        IStrategoTerm e_30 = null;
        TermReference j_30 = new TermReference();
        IStrategoTerm k_30 = null;
        IStrategoTerm l_30 = null;
        IStrategoTerm m_30 = null;
        IStrategoTerm e_31 = null;
        b_30 = term;
        term = debug_0_0.instance.invoke(context, transform.const80);
        if(term == null)
          break Fail150;
        term = debug_0_0.instance.invoke(context, b_30);
        if(term == null)
          break Fail150;
        e_31 = term;
        m_30 = term;
        term = e_31;
        IStrategoTerm term133 = term;
        Success130:
        { 
          Fail151:
          { 
            IStrategoTerm l_31 = null;
            l_31 = term;
            term = m_30;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
              break Fail151;
            d_30 = term.getSubterm(0);
            term = l_31;
            { 
              term = d_30;
              lifted33 lifted330 = new lifted33();
              lifted330.a_30 = a_30;
              term = fetch_elem_1_0.instance.invoke(context, term, lifted330);
              if(term == null)
                break Fail150;
              if(true)
                break Success130;
            }
          }
          term = term133;
          IStrategoTerm term134 = term;
          Success131:
          { 
            Fail152:
            { 
              IStrategoTerm m_31 = null;
              m_31 = term;
              term = m_30;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
                break Fail152;
              IStrategoTerm arg72 = term.getSubterm(0);
              if(arg72.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg72).getConstructor())
                break Fail152;
              if(j_30.value == null)
                j_30.value = arg72.getSubterm(1);
              else
                if(j_30.value != arg72.getSubterm(1) && !j_30.value.match(arg72.getSubterm(1)))
                  break Fail152;
              c_30 = arg72.getSubterm(2);
              term = m_31;
              { 
                term = c_30;
                lifted34 lifted340 = new lifted34();
                lifted340.j_30 = j_30;
                lifted340.a_30 = a_30;
                term = map_1_0.instance.invoke(context, term, lifted340);
                if(term == null)
                  break Fail150;
                if(true)
                  break Fail150;
                if(true)
                  break Success131;
              }
            }
            term = term134;
            IStrategoTerm term135 = term;
            Success132:
            { 
              Fail153:
              { 
                IStrategoTerm n_31 = null;
                n_31 = term;
                term = m_30;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_2 != ((IStrategoAppl)term).getConstructor())
                  break Fail153;
                d_30 = term.getSubterm(1);
                term = n_31;
                { 
                  IStrategoTerm v_33 = null;
                  term = debug_0_0.instance.invoke(context, d_30);
                  if(term == null)
                    break Fail150;
                  v_33 = term;
                  if(a_30.value == null)
                    break Fail150;
                  term = hashtable_copy_0_0.instance.invoke(context, a_30.value);
                  if(term == null)
                    break Fail150;
                  term = this.invoke(context, v_33, term);
                  if(term == null)
                    break Fail150;
                  if(true)
                    break Success132;
                }
              }
              term = term135;
              IStrategoTerm term136 = term;
              Success133:
              { 
                Fail154:
                { 
                  IStrategoTerm e_32 = null;
                  e_32 = term;
                  term = m_30;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_3 != ((IStrategoAppl)term).getConstructor())
                    break Fail154;
                  e_30 = term.getSubterm(1);
                  k_30 = term.getSubterm(2);
                  term = e_32;
                  { 
                    Success134:
                    { 
                      Fail155:
                      { 
                        IStrategoTerm f_32 = null;
                        IStrategoTerm x_33 = null;
                        f_32 = term;
                        term = e_30;
                        x_33 = e_30;
                        if(a_30.value == null)
                          break Fail155;
                        term = hashtable_copy_0_0.instance.invoke(context, a_30.value);
                        if(term == null)
                          break Fail155;
                        term = this.invoke(context, x_33, term);
                        if(term == null)
                          break Fail155;
                        if(j_30.value == null)
                          j_30.value = term;
                        else
                          if(j_30.value != term && !j_30.value.match(term))
                            break Fail155;
                        term = f_32;
                        { 
                          if(j_30.value == null)
                            break Fail150;
                          term = j_30.value;
                          if(true)
                            break Success134;
                        }
                      }
                      IStrategoTerm z_33 = null;
                      term = k_30;
                      z_33 = k_30;
                      if(a_30.value == null)
                        break Fail150;
                      term = hashtable_copy_0_0.instance.invoke(context, a_30.value);
                      if(term == null)
                        break Fail150;
                      term = this.invoke(context, z_33, term);
                      if(term == null)
                        break Fail150;
                    }
                    if(true)
                      break Success133;
                  }
                }
                term = term136;
                IStrategoTerm term138 = term;
                Success135:
                { 
                  Fail156:
                  { 
                    IStrategoTerm d_33 = null;
                    d_33 = term;
                    term = m_30;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                      break Fail156;
                    l_30 = term.getSubterm(3);
                    term = d_33;
                    { 
                      IStrategoTerm b_34 = null;
                      term = l_30;
                      b_34 = l_30;
                      if(a_30.value == null)
                        break Fail150;
                      term = hashtable_copy_0_0.instance.invoke(context, a_30.value);
                      if(term == null)
                        break Fail150;
                      term = this.invoke(context, b_34, term);
                      if(term == null)
                        break Fail150;
                      if(true)
                        break Success135;
                    }
                  }
                  term = term138;
                  IStrategoTerm term139 = term;
                  Success136:
                  { 
                    Fail157:
                    { 
                      IStrategoTerm e_33 = null;
                      e_33 = term;
                      term = m_30;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consForEach_3 != ((IStrategoAppl)term).getConstructor())
                        break Fail157;
                      l_30 = term.getSubterm(2);
                      term = e_33;
                      { 
                        IStrategoTerm d_34 = null;
                        term = l_30;
                        d_34 = l_30;
                        if(a_30.value == null)
                          break Fail150;
                        term = hashtable_copy_0_0.instance.invoke(context, a_30.value);
                        if(term == null)
                          break Fail150;
                        term = this.invoke(context, d_34, term);
                        if(term == null)
                          break Fail150;
                        if(true)
                          break Success136;
                      }
                    }
                    term = term139;
                    IStrategoTerm term140 = term;
                    Success137:
                    { 
                      Fail158:
                      { 
                        IStrategoTerm f_33 = null;
                        f_33 = term;
                        term = m_30;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consWhile_2 != ((IStrategoAppl)term).getConstructor())
                          break Fail158;
                        l_30 = term.getSubterm(1);
                        term = f_33;
                        { 
                          IStrategoTerm f_34 = null;
                          term = l_30;
                          f_34 = l_30;
                          if(a_30.value == null)
                            break Fail150;
                          term = hashtable_copy_0_0.instance.invoke(context, a_30.value);
                          if(term == null)
                            break Fail150;
                          term = this.invoke(context, f_34, term);
                          if(term == null)
                            break Fail150;
                          if(true)
                            break Success137;
                        }
                      }
                      term = term140;
                      Success138:
                      { 
                        Fail159:
                        { 
                          IStrategoTerm k_33 = null;
                          k_33 = term;
                          term = m_30;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail159;
                          l_30 = term.getSubterm(0);
                          term = k_33;
                          { 
                            IStrategoTerm h_34 = null;
                            term = l_30;
                            h_34 = l_30;
                            if(a_30.value == null)
                              break Fail150;
                            term = hashtable_copy_0_0.instance.invoke(context, a_30.value);
                            if(term == null)
                              break Fail150;
                            term = this.invoke(context, h_34, term);
                            if(term == null)
                              break Fail150;
                            if(true)
                              break Success138;
                          }
                        }
                        term = m_30;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consReturn_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail150;
                        IStrategoTerm arg83 = term.getSubterm(0);
                        if(arg83.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg83).getConstructor())
                          break Fail150;
                        l_30 = arg83.getSubterm(0);
                        term = get_type_from_return_stmt_0_1.instance.invoke(context, l_30, a_30.value);
                        if(term == null)
                          break Fail150;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_34)
    { 
      context.push("get_type_from_return_stmt_0_1");
      Fail160:
      { 
        IStrategoTerm k_34 = null;
        IStrategoTerm l_34 = null;
        IStrategoTerm m_34 = null;
        IStrategoTerm n_34 = null;
        n_34 = term;
        m_34 = term;
        term = n_34;
        IStrategoTerm term142 = term;
        Success139:
        { 
          Fail161:
          { 
            IStrategoTerm o_34 = null;
            o_34 = term;
            term = or_2_0.instance.invoke(context, m_34, lifted35.instance, lifted36.instance);
            if(term == null)
              break Fail161;
            term = o_34;
            { 
              term = transform.constBoolean0;
              if(true)
                break Success139;
            }
          }
          term = term142;
          IStrategoTerm term143 = term;
          Success140:
          { 
            Fail162:
            { 
              IStrategoTerm p_34 = null;
              p_34 = term;
              term = or_2_0.instance.invoke(context, m_34, lifted37.instance, lifted38.instance);
              if(term == null)
                break Fail162;
              term = p_34;
              { 
                term = transform.constDouble0;
                if(true)
                  break Success140;
              }
            }
            term = term143;
            IStrategoTerm term144 = term;
            Success141:
            { 
              Fail163:
              { 
                IStrategoTerm q_34 = null;
                q_34 = term;
                term = or_2_0.instance.invoke(context, m_34, lifted39.instance, lifted40.instance);
                if(term == null)
                  break Fail163;
                term = q_34;
                { 
                  term = transform.constClassOrInterfaceType0;
                  if(true)
                    break Success141;
                }
              }
              term = term144;
              IStrategoTerm term145 = term;
              Success142:
              { 
                Fail164:
                { 
                  IStrategoTerm r_34 = null;
                  r_34 = term;
                  term = or_2_0.instance.invoke(context, m_34, lifted41.instance, lifted44.instance);
                  if(term == null)
                    break Fail164;
                  term = r_34;
                  { 
                    term = transform.constDouble0;
                    if(true)
                      break Success142;
                  }
                }
                term = term145;
                IStrategoTerm term146 = term;
                Success143:
                { 
                  Fail165:
                  { 
                    IStrategoTerm s_34 = null;
                    s_34 = term;
                    term = m_34;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_2 != ((IStrategoAppl)term).getConstructor())
                      break Fail165;
                    term = s_34;
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
                    Fail166:
                    { 
                      IStrategoTerm t_34 = null;
                      t_34 = term;
                      term = m_34;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consMul_2 != ((IStrategoAppl)term).getConstructor())
                        break Fail166;
                      term = t_34;
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
                      Fail167:
                      { 
                        IStrategoTerm u_34 = null;
                        u_34 = term;
                        term = m_34;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consRemain_2 != ((IStrategoAppl)term).getConstructor())
                          break Fail167;
                        term = u_34;
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
                        Fail168:
                        { 
                          IStrategoTerm v_34 = null;
                          v_34 = term;
                          term = m_34;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDiv_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail168;
                          term = v_34;
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
                          Fail169:
                          { 
                            IStrategoTerm w_34 = null;
                            w_34 = term;
                            term = m_34;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)term).getConstructor())
                              break Fail169;
                            IStrategoTerm arg122 = term.getSubterm(0);
                            if(arg122.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg122).getConstructor())
                              break Fail169;
                            k_34 = arg122.getSubterm(0);
                            term = w_34;
                            { 
                              term = hashtable_get_0_1.instance.invoke(context, i_34, k_34);
                              if(term == null)
                                break Fail160;
                              if(true)
                                break Success147;
                            }
                          }
                          term = term150;
                          Success148:
                          { 
                            Fail170:
                            { 
                              IStrategoTerm x_34 = null;
                              x_34 = term;
                              term = m_34;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)term).getConstructor())
                                break Fail170;
                              l_34 = term.getSubterm(0);
                              term = x_34;
                              { 
                                term = cast_return_type_0_0.instance.invoke(context, l_34);
                                if(term == null)
                                  break Fail160;
                                if(true)
                                  break Success148;
                              }
                            }
                            term = debug_0_0.instance.invoke(context, transform.const82);
                            if(term == null)
                              break Fail160;
                            if(true)
                              break Fail160;
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
      Fail171:
      { 
        IStrategoTerm a_35 = null;
        IStrategoTerm b_35 = null;
        IStrategoTerm c_35 = null;
        a_35 = term;
        c_35 = term;
        b_35 = a_35;
        term = c_35;
        IStrategoTerm term152 = term;
        Success149:
        { 
          Fail172:
          { 
            IStrategoTerm d_35 = null;
            d_35 = term;
            term = b_35;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail172;
            term = d_35;
            { 
              term = transform.constByte0;
              if(true)
                break Success149;
            }
          }
          term = term152;
          IStrategoTerm term153 = term;
          Success150:
          { 
            Fail173:
            { 
              IStrategoTerm e_35 = null;
              e_35 = term;
              term = or_2_0.instance.invoke(context, b_35, lifted47.instance, lifted48.instance);
              if(term == null)
                break Fail173;
              term = e_35;
              { 
                term = transform.constChar0;
                if(true)
                  break Success150;
              }
            }
            term = term153;
            IStrategoTerm term154 = term;
            Success151:
            { 
              Fail174:
              { 
                IStrategoTerm f_35 = null;
                f_35 = term;
                term = b_35;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail174;
                term = f_35;
                { 
                  term = transform.constDouble0;
                  if(true)
                    break Success151;
                }
              }
              term = term154;
              IStrategoTerm term155 = term;
              Success152:
              { 
                Fail175:
                { 
                  IStrategoTerm g_35 = null;
                  g_35 = term;
                  term = b_35;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail175;
                  term = g_35;
                  { 
                    term = transform.constDouble0;
                    if(true)
                      break Success152;
                  }
                }
                term = term155;
                IStrategoTerm term156 = term;
                Success153:
                { 
                  Fail176:
                  { 
                    IStrategoTerm h_35 = null;
                    h_35 = term;
                    term = b_35;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail176;
                    term = h_35;
                    { 
                      term = transform.constDouble0;
                      if(true)
                        break Success153;
                    }
                  }
                  term = term156;
                  IStrategoTerm term157 = term;
                  Success154:
                  { 
                    Fail177:
                    { 
                      IStrategoTerm i_35 = null;
                      i_35 = term;
                      term = b_35;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail177;
                      term = i_35;
                      { 
                        term = transform.constDouble0;
                        if(true)
                          break Success154;
                      }
                    }
                    term = term157;
                    IStrategoTerm term158 = term;
                    Success155:
                    { 
                      Fail178:
                      { 
                        IStrategoTerm j_35 = null;
                        j_35 = term;
                        term = or_2_0.instance.invoke(context, b_35, lifted49.instance, lifted50.instance);
                        if(term == null)
                          break Fail178;
                        term = j_35;
                        { 
                          term = transform.constDouble0;
                          if(true)
                            break Success155;
                        }
                      }
                      term = term158;
                      IStrategoTerm term159 = term;
                      Success156:
                      { 
                        Fail179:
                        { 
                          IStrategoTerm k_35 = null;
                          k_35 = term;
                          term = b_35;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail179;
                          term = k_35;
                          { 
                            term = transform.constDouble0;
                            if(true)
                              break Success156;
                          }
                        }
                        term = term159;
                        Success157:
                        { 
                          Fail180:
                          { 
                            IStrategoTerm l_35 = null;
                            l_35 = term;
                            term = b_35;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consString_1 != ((IStrategoAppl)term).getConstructor())
                              break Fail180;
                            term = l_35;
                            { 
                              term = transform.constClassOrInterfaceType0;
                              if(true)
                                break Success157;
                            }
                          }
                          term = debug_0_0.instance.invoke(context, transform.const83);
                          if(term == null)
                            break Fail171;
                          term = debug_0_0.instance.invoke(context, a_35);
                          if(term == null)
                            break Fail171;
                          if(true)
                            break Fail171;
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
      Fail181:
      { 
        IStrategoTerm s_35 = null;
        IStrategoTerm u_35 = null;
        IStrategoTerm v_35 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail181;
        IStrategoTerm arg127 = term.getSubterm(1);
        if(arg127.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg127).getConstructor())
          break Fail181;
        u_35 = term;
        s_35 = transform.constNone0;
        term = u_35;
        v_35 = u_35;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail181;
        term = replace_0_2.instance.invoke(context, v_35, s_35, term);
        if(term == null)
          break Fail181;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_35, IStrategoTerm z_35)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closure_to_java_0_2");
      Fail182:
      { 
        TermReference a_36 = new TermReference();
        IStrategoTerm b_36 = null;
        IStrategoTerm c_36 = null;
        lifted52 lifted520 = new lifted52();
        lifted51 lifted511 = new lifted51();
        lifted520.a_36 = a_36;
        lifted511.a_36 = a_36;
        term = or_2_0.instance.invoke(context, term, lifted511, lifted520);
        if(term == null)
          break Fail182;
        c_36 = term;
        term = debug_0_0.instance.invoke(context, transform.const84);
        if(term == null)
          break Fail182;
        Success158:
        { 
          Fail183:
          { 
            IStrategoTerm d_36 = null;
            d_36 = term;
            term = termFactory.makeTuple(y_35, transform.constNone0);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail183;
            term = d_36;
            { 
              term = debug_0_0.instance.invoke(context, transform.const85);
              if(term == null)
                break Fail182;
              Success159:
              { 
                Fail184:
                { 
                  IStrategoTerm e_36 = null;
                  e_36 = term;
                  if(a_36.value == null)
                    break Fail184;
                  term = get_return_type_from_block_0_1.instance.invoke(context, a_36.value, z_35);
                  if(term == null)
                    break Fail184;
                  b_36 = term;
                  term = e_36;
                  { 
                    term = debug_0_0.instance.invoke(context, transform.const86);
                    if(term == null)
                      break Fail182;
                    term = closure_to_java_impl_0_1.instance.invoke(context, c_36, b_36);
                    if(term == null)
                      break Fail182;
                    if(true)
                      break Success159;
                  }
                }
                IStrategoTerm i_36 = null;
                term = debug_0_0.instance.invoke(context, transform.const87);
                if(term == null)
                  break Fail182;
                i_36 = c_36;
                term = closure_to_java_impl_0_1.instance.invoke(context, i_36, transform.constClassOrInterfaceType1);
                if(term == null)
                  break Fail182;
              }
              if(true)
                break Success158;
            }
          }
          term = debug_0_0.instance.invoke(context, transform.const89);
          if(term == null)
            break Fail182;
          term = closure_to_java_impl_0_1.instance.invoke(context, c_36, y_35);
          if(term == null)
            break Fail182;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_36)
    { 
      context.push("get_return_type_from_block_0_1");
      Fail185:
      { 
        IStrategoTerm k_36 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
          break Fail185;
        k_36 = term.getSubterm(0);
        term = debug_0_0.instance.invoke(context, transform.const90);
        if(term == null)
          break Fail185;
        Success160:
        { 
          Fail186:
          { 
            IStrategoTerm l_36 = null;
            l_36 = term;
            term = is_return_stmt_exist_0_0.instance.invoke(context, k_36);
            if(term == null)
              break Fail186;
            term = l_36;
            { 
              term = debug_0_0.instance.invoke(context, transform.const91);
              if(term == null)
                break Fail185;
              term = discover_return_type_0_0.instance.invoke(context, k_36);
              if(term == null)
                break Fail185;
              term = debug_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail185;
              if(true)
                break Success160;
            }
          }
          term = debug_0_0.instance.invoke(context, transform.const92);
          if(term == null)
            break Fail185;
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
      Fail187:
      { 
        IStrategoTerm n_36 = null;
        IStrategoTerm p_36 = null;
        p_36 = term;
        term = topdown_1_0.instance.invoke(context, p_36, lifted53.instance);
        if(term == null)
          break Fail187;
        n_36 = term;
        IStrategoTerm term164 = term;
        Success161:
        { 
          Fail188:
          { 
            IStrategoTerm o_36 = null;
            o_36 = term;
            term = remove_return_decs_0_0.instance.invoke(context, n_36);
            if(term == null)
              break Fail188;
            term = termFactory.makeTuple(n_36, term);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail188;
            term = o_36;
            { 
              if(true)
                break Fail187;
              if(true)
                break Success161;
            }
          }
          term = term164;
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
      Fail189:
      { 
        term = topdown_1_0.instance.invoke(context, term, lifted55.instance);
        if(term == null)
          break Fail189;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_47)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closure_to_java_impl_0_1");
      Fail190:
      { 
        IStrategoTerm term165 = term;
        Success162:
        { 
          Fail191:
          { 
            IStrategoTerm a_37 = null;
            IStrategoTerm b_37 = null;
            TermReference c_37 = new TermReference();
            IStrategoTerm d_37 = null;
            IStrategoTerm e_37 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consClosureJoinpoints_4 != ((IStrategoAppl)term).getConstructor())
              break Fail191;
            e_37 = term.getSubterm(0);
            a_37 = term.getSubterm(1);
            b_37 = term.getSubterm(2);
            d_37 = term.getSubterm(3);
            term = e_37;
            lifted58 lifted580 = new lifted58();
            lifted57 lifted570 = new lifted57();
            lifted580.c_37 = c_37;
            lifted570.c_37 = c_37;
            term = or_2_0.instance.invoke(context, term, lifted570, lifted580);
            if(term == null)
              break Fail191;
            term = debug_0_0.instance.invoke(context, transform.const93);
            if(term == null)
              break Fail191;
            if(c_37.value == null)
              break Fail191;
            term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, transform.constClassOrInterfaceType1, transform.constNil0, termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons22, transform.constNone0, s_47, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{c_37.value}), a_37, transform.constNone0}), b_37}), (IStrategoList)transform.constNil0)})})}), transform.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{c_37.value})}), d_37});
            if(true)
              break Success162;
          }
          term = term165;
          IStrategoTerm w_36 = null;
          TermReference x_36 = new TermReference();
          IStrategoTerm y_36 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consShortClosureJoinpoints_2 != ((IStrategoAppl)term).getConstructor())
            break Fail190;
          y_36 = term.getSubterm(0);
          w_36 = term.getSubterm(1);
          term = y_36;
          lifted60 lifted600 = new lifted60();
          lifted59 lifted590 = new lifted59();
          lifted600.x_36 = x_36;
          lifted590.x_36 = x_36;
          term = or_2_0.instance.invoke(context, term, lifted590, lifted600);
          if(term == null)
            break Fail190;
          term = debug_0_0.instance.invoke(context, transform.const94);
          if(term == null)
            break Fail190;
          if(x_36.value == null)
            break Fail190;
          term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, transform.constClassOrInterfaceType1, transform.constNil0, termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons22, transform.constNone0, s_47, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{x_36.value}), transform.constNil0, transform.constNone0}), w_36}), (IStrategoList)transform.constNil0)})})}), transform.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{x_36.value})}), transform.constNil0});
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
      Fail192:
      { 
        term = handle_io_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail192;
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
      Fail193:
      { 
        IStrategoTerm h_37 = null;
        IStrategoTerm i_37 = null;
        IStrategoTerm j_37 = null;
        IStrategoTerm k_37 = null;
        IStrategoTerm m_37 = null;
        IStrategoTerm r_37 = null;
        IStrategoTerm o_37 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail193;
        h_37 = ((IStrategoList)term).tail();
        term = debug_0_0.instance.invoke(context, h_37);
        if(term == null)
          break Fail193;
        term = h_37;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail193;
        m_37 = ((IStrategoList)term).head();
        term = m_37;
        term = $Read$From$File_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail193;
        i_37 = term;
        term = h_37;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail193;
        r_37 = ((IStrategoList)term).tail();
        term = r_37;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail193;
        o_37 = ((IStrategoList)term).head();
        j_37 = o_37;
        term = convert_0_0.instance.invoke(context, i_37);
        if(term == null)
          break Fail193;
        term = pp_aspectj_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail193;
        k_37 = term;
        term = termFactory.makeTuple(j_37, transform.const95);
        term = fopen_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail193;
        term = termFactory.makeTuple(k_37, term);
        term = fputs_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail193;
        term = fclose_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail193;
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
      Fail194:
      { 
        term = try_1_0.instance.invoke(context, term, closures_converter_compilation_unit_0_0.instance);
        if(term == null)
          break Fail194;
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
      Fail195:
      { 
        IStrategoTerm y_37 = null;
        IStrategoTerm z_37 = null;
        IStrategoTerm a_38 = null;
        IStrategoTerm b_38 = null;
        TermReference c_38 = new TermReference();
        IStrategoTerm d_38 = null;
        IStrategoTerm e_38 = null;
        IStrategoTerm j_38 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
          break Fail195;
        z_37 = term.getSubterm(0);
        a_38 = term.getSubterm(1);
        d_38 = term.getSubterm(2);
        j_38 = term;
        IStrategoTerm term166 = term;
        Success163:
        { 
          Fail196:
          { 
            Success164:
            { 
              Fail197:
              { 
                IStrategoTerm f_38 = null;
                IStrategoTerm k_38 = null;
                f_38 = term;
                term = SRTS_all.instance.invoke(context, d_38, lifted62.instance);
                if(term == null)
                  break Fail197;
                k_38 = term;
                y_37 = d_38;
                term = k_38;
                if(term != y_37 && !y_37.match(term))
                  break Fail197;
                term = f_38;
                { 
                  term = debug_0_0.instance.invoke(context, transform.const96);
                  if(term == null)
                    break Fail196;
                  b_38 = a_38;
                  term = d_38;
                  e_38 = d_38;
                  if(true)
                    break Success164;
                }
              }
              term = debug_0_0.instance.invoke(context, transform.const97);
              if(term == null)
                break Fail196;
              Success165:
              { 
                Fail198:
                { 
                  IStrategoTerm g_38 = null;
                  g_38 = term;
                  term = z_37;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail198;
                  IStrategoTerm arg140 = term.getSubterm(0);
                  if(arg140.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg140).getConstructor())
                    break Fail198;
                  term = g_38;
                  { 
                    term = z_37;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail196;
                    IStrategoTerm arg143 = term.getSubterm(0);
                    if(arg143.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg143).getConstructor())
                      break Fail196;
                    if(c_38.value == null)
                      c_38.value = arg143.getSubterm(1);
                    else
                      if(c_38.value != arg143.getSubterm(1) && !c_38.value.match(arg143.getSubterm(1)))
                        break Fail196;
                    if(true)
                      break Success165;
                  }
                }
                term = transform.constNone0;
                if(c_38.value == null)
                  c_38.value = term;
                else
                  if(c_38.value != term && !c_38.value.match(term))
                    break Fail196;
              }
              term = debug_0_0.instance.invoke(context, transform.const98);
              if(term == null)
                break Fail196;
              term = termFactory.makeTuple(a_38, transform.constCons25);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail196;
              b_38 = term;
              term = debug_0_0.instance.invoke(context, transform.const101);
              if(term == null)
                break Fail196;
              term = debug_0_0.instance.invoke(context, d_38);
              if(term == null)
                break Fail196;
              lifted64 lifted640 = new lifted64();
              lifted640.c_38 = c_38;
              term = SRTS_all.instance.invoke(context, term, lifted640);
              if(term == null)
                break Fail196;
              e_38 = term;
              term = debug_0_0.instance.invoke(context, transform.const102);
              if(term == null)
                break Fail196;
            }
            if(true)
              break Success163;
          }
          term = term166;
          IStrategoTerm h_38 = null;
          IStrategoTerm i_38 = null;
          IStrategoTerm n_38 = null;
          h_38 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail195;
          i_38 = term;
          n_38 = h_38;
          term = report_with_failure_0_2.instance.invoke(context, n_38, transform.const103, i_38);
          if(term == null)
            break Fail195;
        }
        term = j_38;
        if(b_38 == null || e_38 == null)
          break Fail195;
        term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{z_37, b_38, e_38});
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
      Fail199:
      { 
        IStrategoTerm term169 = term;
        IStrategoConstructor cons10 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success166:
        { 
          if(cons10 == transform._consClassDec_2)
          { 
            Fail200:
            { 
              IStrategoTerm a_39 = null;
              IStrategoTerm b_39 = null;
              IStrategoTerm c_39 = null;
              IStrategoTerm f_39 = null;
              a_39 = term.getSubterm(0);
              b_39 = term.getSubterm(1);
              f_39 = term;
              IStrategoTerm term170 = term;
              Success167:
              { 
                Fail201:
                { 
                  term = debug_0_0.instance.invoke(context, transform.const104);
                  if(term == null)
                    break Fail201;
                  term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{a_39, b_39});
                  term = topdown_1_0.instance.invoke(context, term, lifted66.instance);
                  if(term == null)
                    break Fail201;
                  term = debug_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail201;
                  c_39 = term;
                  if(true)
                    break Success167;
                }
                term = term170;
                IStrategoTerm d_39 = null;
                IStrategoTerm e_39 = null;
                IStrategoTerm h_39 = null;
                d_39 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail200;
                e_39 = term;
                h_39 = d_39;
                term = report_with_failure_0_2.instance.invoke(context, h_39, transform.const105, e_39);
                if(term == null)
                  break Fail200;
              }
              term = f_39;
              if(c_39 == null)
                break Fail200;
              term = c_39;
              if(true)
                break Success166;
            }
            term = term169;
          }
          if(cons10 == transform._consAspectDec_2)
          { 
            IStrategoTerm q_38 = null;
            IStrategoTerm r_38 = null;
            IStrategoTerm s_38 = null;
            IStrategoTerm v_38 = null;
            q_38 = term.getSubterm(0);
            r_38 = term.getSubterm(1);
            v_38 = term;
            IStrategoTerm term172 = term;
            Success168:
            { 
              Fail202:
              { 
                term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{q_38, r_38});
                term = topdown_1_0.instance.invoke(context, term, lifted68.instance);
                if(term == null)
                  break Fail202;
                s_38 = term;
                if(true)
                  break Success168;
              }
              term = term172;
              IStrategoTerm t_38 = null;
              IStrategoTerm u_38 = null;
              IStrategoTerm x_38 = null;
              t_38 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail199;
              u_38 = term;
              x_38 = t_38;
              term = report_with_failure_0_2.instance.invoke(context, x_38, transform.const105, u_38);
              if(term == null)
                break Fail199;
            }
            term = v_38;
            if(s_38 == null)
              break Fail199;
            term = s_38;
          }
          else
          { 
            break Fail199;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_47)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closures_converter_aspect_or_class_0_1");
      Fail203:
      { 
        IStrategoTerm term173 = term;
        IStrategoConstructor cons11 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success169:
        { 
          if(cons11 == transform._consAspectDec_2)
          { 
            Fail204:
            { 
              IStrategoTerm w_39 = null;
              IStrategoTerm x_39 = null;
              IStrategoTerm y_39 = null;
              IStrategoTerm b_40 = null;
              w_39 = term.getSubterm(0);
              x_39 = term.getSubterm(1);
              b_40 = term;
              IStrategoTerm term174 = term;
              Success170:
              { 
                Fail205:
                { 
                  term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{w_39, x_39});
                  term = closures_to_ajc_0_1.instance.invoke(context, term, t_47);
                  if(term == null)
                    break Fail205;
                  y_39 = term;
                  if(true)
                    break Success170;
                }
                term = term174;
                IStrategoTerm z_39 = null;
                IStrategoTerm a_40 = null;
                IStrategoTerm d_40 = null;
                z_39 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail204;
                a_40 = term;
                d_40 = z_39;
                term = report_with_failure_0_2.instance.invoke(context, d_40, transform.const106, a_40);
                if(term == null)
                  break Fail204;
              }
              term = b_40;
              if(y_39 == null)
                break Fail204;
              term = y_39;
              if(true)
                break Success169;
            }
            term = term173;
          }
          if(cons11 == transform._consClassDec_2)
          { 
            IStrategoTerm l_39 = null;
            IStrategoTerm m_39 = null;
            IStrategoTerm n_39 = null;
            IStrategoTerm q_39 = null;
            l_39 = term.getSubterm(0);
            m_39 = term.getSubterm(1);
            q_39 = term;
            IStrategoTerm term175 = term;
            Success171:
            { 
              Fail206:
              { 
                term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{l_39, m_39});
                term = closures_to_java_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail206;
                n_39 = term;
                if(true)
                  break Success171;
              }
              term = term175;
              IStrategoTerm o_39 = null;
              IStrategoTerm p_39 = null;
              IStrategoTerm s_39 = null;
              o_39 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail203;
              p_39 = term;
              s_39 = o_39;
              term = report_with_failure_0_2.instance.invoke(context, s_39, transform.const106, p_39);
              if(term == null)
                break Fail203;
            }
            term = q_39;
            if(n_39 == null)
              break Fail203;
            term = n_39;
          }
          else
          { 
            break Fail203;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_41, Strategy h_41)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("OrComp_2_0");
      Fail207:
      { 
        IStrategoTerm x_177 = null;
        IStrategoTerm v_177 = null;
        IStrategoTerm w_177 = null;
        IStrategoTerm y_177 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail207;
        v_177 = term.getSubterm(0);
        w_177 = term.getSubterm(1);
        IStrategoList annos0 = term.getAnnotations();
        x_177 = annos0;
        term = g_41.invoke(context, v_177);
        if(term == null)
          break Fail207;
        y_177 = term;
        term = h_41.invoke(context, w_177);
        if(term == null)
          break Fail207;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{y_177, term}), checkListAnnos(termFactory, x_177));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_41, Strategy j_41)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("AndComp_2_0");
      Fail208:
      { 
        IStrategoTerm c_178 = null;
        IStrategoTerm a_178 = null;
        IStrategoTerm b_178 = null;
        IStrategoTerm d_178 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail208;
        a_178 = term.getSubterm(0);
        b_178 = term.getSubterm(1);
        IStrategoList annos1 = term.getAnnotations();
        c_178 = annos1;
        term = i_41.invoke(context, a_178);
        if(term == null)
          break Fail208;
        d_178 = term;
        term = j_41.invoke(context, b_178);
        if(term == null)
          break Fail208;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{d_178, term}), checkListAnnos(termFactory, c_178));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_41)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("NotComp_1_0");
      Fail209:
      { 
        IStrategoTerm g_178 = null;
        IStrategoTerm f_178 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotComp_1 != ((IStrategoAppl)term).getConstructor())
          break Fail209;
        f_178 = term.getSubterm(0);
        IStrategoList annos2 = term.getAnnotations();
        g_178 = annos2;
        term = k_41.invoke(context, f_178);
        if(term == null)
          break Fail209;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consNotComp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_178));
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
      Fail210:
      { 
        term = try_1_0.instance.invoke(context, term, remove_closures_additions_0_0.instance);
        if(term == null)
          break Fail210;
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
      Fail211:
      { 
        term = try_1_0.instance.invoke(context, term, lifted67.instance);
        if(term == null)
          break Fail211;
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
      Fail212:
      { 
        IStrategoTerm term171 = term;
        IStrategoConstructor cons12 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success172:
        { 
          if(cons12 == transform._consShortClosureJoinpoints_2)
          { 
            Fail213:
            { 
              term = transform.constNone0;
              if(true)
                break Success172;
            }
            term = term171;
          }
          if(cons12 == transform._consClosureJoinpoints_4)
          { 
            term = transform.constNone0;
          }
          else
          { 
            break Fail212;
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
    TermReference c_38;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail214:
      { 
        lifted65 lifted650 = new lifted65();
        lifted650.c_38 = c_38;
        term = try_1_0.instance.invoke(context, term, lifted650);
        if(term == null)
          break Fail214;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted65 extends Strategy 
  { 
    TermReference c_38;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail215:
      { 
        term = closures_converter_aspect_or_class_0_1.instance.invoke(context, term, c_38.value);
        if(term == null)
          break Fail215;
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
      Fail216:
      { 
        term = try_1_0.instance.invoke(context, term, check_for_change_in_aspect_or_class_0_0.instance);
        if(term == null)
          break Fail216;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted60 extends Strategy 
  { 
    TermReference x_36;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail217:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
          break Fail217;
        IStrategoTerm arg139 = term.getSubterm(1);
        if(arg139.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg139).getConstructor())
          break Fail217;
        if(x_36.value == null)
          x_36.value = arg139.getSubterm(0);
        else
          if(x_36.value != arg139.getSubterm(0) && !x_36.value.match(arg139.getSubterm(0)))
            break Fail217;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted59 extends Strategy 
  { 
    TermReference x_36;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail218:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail218;
        IStrategoTerm arg137 = term.getSubterm(0);
        if(arg137.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg137).getConstructor())
          break Fail218;
        if(x_36.value == null)
          x_36.value = arg137.getSubterm(0);
        else
          if(x_36.value != arg137.getSubterm(0) && !x_36.value.match(arg137.getSubterm(0)))
            break Fail218;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted58 extends Strategy 
  { 
    TermReference c_37;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail219:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
          break Fail219;
        IStrategoTerm arg136 = term.getSubterm(1);
        if(arg136.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg136).getConstructor())
          break Fail219;
        if(c_37.value == null)
          c_37.value = arg136.getSubterm(0);
        else
          if(c_37.value != arg136.getSubterm(0) && !c_37.value.match(arg136.getSubterm(0)))
            break Fail219;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted57 extends Strategy 
  { 
    TermReference c_37;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail220:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail220;
        IStrategoTerm arg134 = term.getSubterm(0);
        if(arg134.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg134).getConstructor())
          break Fail220;
        if(c_37.value == null)
          c_37.value = arg134.getSubterm(0);
        else
          if(c_37.value != arg134.getSubterm(0) && !c_37.value.match(arg134.getSubterm(0)))
            break Fail220;
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
      Fail221:
      { 
        term = try_1_0.instance.invoke(context, term, lifted56.instance);
        if(term == null)
          break Fail221;
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
      Fail222:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consReturn_1 != ((IStrategoAppl)term).getConstructor())
          break Fail222;
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
      Fail223:
      { 
        term = try_1_0.instance.invoke(context, term, lifted54.instance);
        if(term == null)
          break Fail223;
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
      Fail224:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
          break Fail224;
        term = transform.constClassBody0;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted52 extends Strategy 
  { 
    TermReference a_36;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail225:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consShortClosureJoinpoints_2 != ((IStrategoAppl)term).getConstructor())
          break Fail225;
        if(a_36.value == null)
          a_36.value = term.getSubterm(1);
        else
          if(a_36.value != term.getSubterm(1) && !a_36.value.match(term.getSubterm(1)))
            break Fail225;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted51 extends Strategy 
  { 
    TermReference a_36;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail226:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClosureJoinpoints_4 != ((IStrategoAppl)term).getConstructor())
          break Fail226;
        if(a_36.value == null)
          a_36.value = term.getSubterm(2);
        else
          if(a_36.value != term.getSubterm(2) && !a_36.value.match(term.getSubterm(2)))
            break Fail226;
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
      Fail227:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail227;
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
      Fail228:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail228;
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
      Fail229:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail229;
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
      Fail230:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail230;
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
      Fail231:
      { 
        term = or_2_0.instance.invoke(context, term, lifted45.instance, lifted46.instance);
        if(term == null)
          break Fail231;
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
      Fail232:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail232;
        IStrategoTerm arg111 = term.getSubterm(1);
        if(arg111.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)arg111).getConstructor())
          break Fail232;
        IStrategoTerm arg112 = arg111.getSubterm(0);
        if(arg112.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)arg112).getConstructor())
          break Fail232;
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
      Fail233:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail233;
        IStrategoTerm arg106 = term.getSubterm(0);
        if(arg106.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)arg106).getConstructor())
          break Fail233;
        IStrategoTerm arg107 = arg106.getSubterm(0);
        if(arg107.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)arg107).getConstructor())
          break Fail233;
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
      Fail234:
      { 
        term = or_2_0.instance.invoke(context, term, lifted42.instance, lifted43.instance);
        if(term == null)
          break Fail234;
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
      Fail235:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail235;
        IStrategoTerm arg103 = term.getSubterm(1);
        if(arg103.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)arg103).getConstructor())
          break Fail235;
        IStrategoTerm arg104 = arg103.getSubterm(0);
        if(arg104.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)arg104).getConstructor())
          break Fail235;
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
      Fail236:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail236;
        IStrategoTerm arg98 = term.getSubterm(0);
        if(arg98.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)arg98).getConstructor())
          break Fail236;
        IStrategoTerm arg99 = arg98.getSubterm(0);
        if(arg99.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)arg99).getConstructor())
          break Fail236;
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
      Fail237:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail237;
        IStrategoTerm arg95 = term.getSubterm(1);
        if(arg95.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)arg95).getConstructor())
          break Fail237;
        IStrategoTerm arg96 = arg95.getSubterm(0);
        if(arg96.getTermType() != IStrategoTerm.APPL || transform._consString_1 != ((IStrategoAppl)arg96).getConstructor())
          break Fail237;
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
      Fail238:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail238;
        IStrategoTerm arg90 = term.getSubterm(0);
        if(arg90.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)arg90).getConstructor())
          break Fail238;
        IStrategoTerm arg91 = arg90.getSubterm(0);
        if(arg91.getTermType() != IStrategoTerm.APPL || transform._consString_1 != ((IStrategoAppl)arg91).getConstructor())
          break Fail238;
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
      Fail239:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail239;
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
      Fail240:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail240;
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
      Fail241:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail241;
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
      Fail242:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail242;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted34 extends Strategy 
  { 
    TermReference j_30;

    TermReference a_30;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail243:
      { 
        term = add_var_0_2.instance.invoke(context, term, j_30.value, a_30.value);
        if(term == null)
          break Fail243;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted33 extends Strategy 
  { 
    TermReference a_30;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail244:
      { 
        IStrategoTerm t_33 = null;
        t_33 = term;
        if(a_30.value == null)
          break Fail244;
        term = hashtable_copy_0_0.instance.invoke(context, a_30.value);
        if(term == null)
          break Fail244;
        term = discover_return_type_impl_0_1.instance.invoke(context, t_33, term);
        if(term == null)
          break Fail244;
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
      Fail245:
      { 
        term = try_1_0.instance.invoke(context, term, lifted31.instance);
        if(term == null)
          break Fail245;
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
      Fail246:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
          break Fail246;
        term = transform.constClassBody0;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted32 extends Strategy 
  { 
    TermReference u_29;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail247:
      { 
        term = discover_return_type_impl_0_1.instance.invoke(context, term, u_29.value);
        if(term == null)
          break Fail247;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted29 extends Strategy 
  { 
    TermReference o_29;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail248:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail248;
        IStrategoTerm arg69 = term.getSubterm(0);
        if(arg69.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg69).getConstructor())
          break Fail248;
        if(o_29.value == null)
          o_29.value = arg69.getSubterm(0);
        else
          if(o_29.value != arg69.getSubterm(0) && !o_29.value.match(arg69.getSubterm(0)))
            break Fail248;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted28 extends Strategy 
  { 
    TermReference o_29;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail249:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail249;
        IStrategoTerm arg68 = term.getSubterm(0);
        if(arg68.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg68).getConstructor())
          break Fail249;
        if(o_29.value == null)
          o_29.value = arg68.getSubterm(0);
        else
          if(o_29.value != arg68.getSubterm(0) && !o_29.value.match(arg68.getSubterm(0)))
            break Fail249;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted27 extends Strategy 
  { 
    TermReference x_28;

    TermReference u_28;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail250:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail250;
        if(x_28.value == null)
          x_28.value = term.getSubterm(1);
        else
          if(x_28.value != term.getSubterm(1) && !x_28.value.match(term.getSubterm(1)))
            break Fail250;
        IStrategoTerm arg67 = term.getSubterm(2);
        if(arg67.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg67).getConstructor())
          break Fail250;
        if(u_28.value == null)
          u_28.value = arg67.getSubterm(0);
        else
          if(u_28.value != arg67.getSubterm(0) && !u_28.value.match(arg67.getSubterm(0)))
            break Fail250;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted26 extends Strategy 
  { 
    TermReference x_28;

    TermReference u_28;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail251:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail251;
        if(x_28.value == null)
          x_28.value = term.getSubterm(1);
        else
          if(x_28.value != term.getSubterm(1) && !x_28.value.match(term.getSubterm(1)))
            break Fail251;
        IStrategoTerm arg65 = term.getSubterm(2);
        if(arg65.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg65).getConstructor())
          break Fail251;
        if(u_28.value == null)
          u_28.value = arg65.getSubterm(0);
        else
          if(u_28.value != arg65.getSubterm(0) && !u_28.value.match(arg65.getSubterm(0)))
            break Fail251;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted24 extends Strategy 
  { 
    TermReference y_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail252:
      { 
        lifted25 lifted250 = new lifted25();
        lifted250.y_25 = y_25;
        term = try_1_0.instance.invoke(context, term, lifted250);
        if(term == null)
          break Fail252;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted25 extends Strategy 
  { 
    TermReference y_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail253:
      { 
        term = add_param_0_1.instance.invoke(context, term, y_25.value);
        if(term == null)
          break Fail253;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted22 extends Strategy 
  { 
    TermReference y_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail254:
      { 
        lifted23 lifted230 = new lifted23();
        lifted230.y_25 = y_25;
        term = try_1_0.instance.invoke(context, term, lifted230);
        if(term == null)
          break Fail254;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted23 extends Strategy 
  { 
    TermReference y_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail255:
      { 
        term = add_param_0_1.instance.invoke(context, term, y_25.value);
        if(term == null)
          break Fail255;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted21 extends Strategy 
  { 
    TermReference s_25;

    TermReference l_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail256:
      { 
        term = replace_0_2.instance.invoke(context, term, s_25.value, l_25.value);
        if(term == null)
          break Fail256;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted20 extends Strategy 
  { 
    TermReference y_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail257:
      { 
        IStrategoTerm v_27 = null;
        v_27 = term;
        term = replace_0_2.instance.invoke(context, v_27, transform.constNone0, y_25.value);
        if(term == null)
          break Fail257;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted19 extends Strategy 
  { 
    TermReference y_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail258:
      { 
        IStrategoTerm q_27 = null;
        q_27 = term;
        term = replace_0_2.instance.invoke(context, q_27, transform.constNone0, y_25.value);
        if(term == null)
          break Fail258;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted17 extends Strategy 
  { 
    TermReference y_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail259:
      { 
        TermReference l_26 = new TermReference();
        IStrategoTerm m_26 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail259;
        if(l_26.value == null)
          l_26.value = term.getSubterm(1);
        else
          if(l_26.value != term.getSubterm(1) && !l_26.value.match(term.getSubterm(1)))
            break Fail259;
        m_26 = term.getSubterm(2);
        term = m_26;
        lifted18 lifted180 = new lifted18();
        lifted180.l_26 = l_26;
        lifted180.y_25 = y_25;
        term = map_1_0.instance.invoke(context, term, lifted180);
        if(term == null)
          break Fail259;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted18 extends Strategy 
  { 
    TermReference l_26;

    TermReference y_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail260:
      { 
        term = replace_0_2.instance.invoke(context, term, l_26.value, y_25.value);
        if(term == null)
          break Fail260;
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
      Fail261:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail261;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted15 extends Strategy 
  { 
    TermReference y_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail262:
      { 
        IStrategoTerm m_27 = null;
        m_27 = term;
        term = replace_0_2.instance.invoke(context, m_27, transform.constNone0, y_25.value);
        if(term == null)
          break Fail262;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted13 extends Strategy 
  { 
    TermReference y_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail263:
      { 
        TermReference i_26 = new TermReference();
        IStrategoTerm j_26 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail263;
        if(i_26.value == null)
          i_26.value = term.getSubterm(1);
        else
          if(i_26.value != term.getSubterm(1) && !i_26.value.match(term.getSubterm(1)))
            break Fail263;
        j_26 = term.getSubterm(2);
        term = j_26;
        lifted14 lifted140 = new lifted14();
        lifted140.i_26 = i_26;
        lifted140.y_25 = y_25;
        term = map_1_0.instance.invoke(context, term, lifted140);
        if(term == null)
          break Fail263;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted14 extends Strategy 
  { 
    TermReference i_26;

    TermReference y_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail264:
      { 
        term = replace_0_2.instance.invoke(context, term, i_26.value, y_25.value);
        if(term == null)
          break Fail264;
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
      Fail265:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail265;
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
      Fail266:
      { 
        IStrategoTerm w_22 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail266;
        IStrategoTerm arg48 = term.getSubterm(2);
        if(arg48.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg48).getConstructor())
          break Fail266;
        w_22 = arg48.getSubterm(0);
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{w_22})}), transform.constNone0});
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
      Fail267:
      { 
        IStrategoTerm v_22 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail267;
        v_22 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, v_22);
        if(term == null)
          break Fail267;
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
      Fail268:
      { 
        IStrategoTerm m_23 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail268;
        IStrategoTerm arg41 = term.getSubterm(2);
        if(arg41.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg41).getConstructor())
          break Fail268;
        m_23 = arg41.getSubterm(0);
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{m_23})}), transform.constNone0});
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
      Fail269:
      { 
        IStrategoTerm l_23 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail269;
        l_23 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, l_23);
        if(term == null)
          break Fail269;
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
      Fail270:
      { 
        IStrategoTerm d_24 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail270;
        IStrategoTerm arg34 = term.getSubterm(2);
        if(arg34.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg34).getConstructor())
          break Fail270;
        d_24 = arg34.getSubterm(0);
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_24})}), transform.constNone0});
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
      Fail271:
      { 
        IStrategoTerm c_24 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail271;
        c_24 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, c_24);
        if(term == null)
          break Fail271;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted4 extends Strategy 
  { 
    TermReference y_21;

    TermReference w_21;

    TermReference z_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail272:
      { 
        lifted5 lifted510 = new lifted5();
        lifted510.y_21 = y_21;
        lifted510.w_21 = w_21;
        lifted510.z_21 = z_21;
        term = try_1_0.instance.invoke(context, term, lifted510);
        if(term == null)
          break Fail272;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted5 extends Strategy 
  { 
    TermReference y_21;

    TermReference w_21;

    TermReference z_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail273:
      { 
        term = closures_to_ajc_0_3.instance.invoke(context, term, y_21.value, w_21.value, z_21.value);
        if(term == null)
          break Fail273;
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
      Fail274:
      { 
        IStrategoTerm term104 = term;
        Success173:
        { 
          Fail275:
          { 
            term = aspectj_to_box_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail275;
            if(true)
              break Success173;
          }
          term = java_to_box_0_0.instance.invoke(context, term104);
          if(term == null)
            break Fail274;
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class n_21 extends Strategy 
  { 
    public static final n_21 instance = new n_21();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail276:
      { 
        IStrategoTerm term101 = term;
        Success174:
        { 
          Fail277:
          { 
            term = $Not$Comp_1_0.instance.invoke(context, term, _Id.instance);
            if(term == null)
              break Fail277;
            if(true)
              break Success174;
          }
          term = term101;
          IStrategoTerm term102 = term;
          Success175:
          { 
            Fail278:
            { 
              term = $And$Comp_2_0.instance.invoke(context, term, this, _Id.instance);
              if(term == null)
                break Fail278;
              if(true)
                break Success175;
            }
            term = $Or$Comp_2_0.instance.invoke(context, term102, this, _Id.instance);
            if(term == null)
              break Fail276;
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
      varScope.addSVar("gen_joinpoint_body_0_1", new InteropSDefT(gen_joinpoint_body_0_1.instance, context));
      varScope.addSVar("get_default_return_value_for_return_type_0_0", new InteropSDefT(get_default_return_value_for_return_type_0_0.instance, context));
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
      varScope.addSVar("gen_joinpoint_body_0_1", new InteropSDefT(classLoader, "transform$gen_joinpoint_body_0_1", context));
      varScope.addSVar("get_default_return_value_for_return_type_0_0", new InteropSDefT(classLoader, "transform$get_default_return_value_for_return_type_0_0", context));
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
