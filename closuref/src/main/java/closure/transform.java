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

  protected static IStrategoTerm const103;

  protected static IStrategoTerm const102;

  protected static IStrategoTerm const101;

  protected static IStrategoTerm constCons39;

  protected static IStrategoTerm constTypeImportOnDemandDec2;

  protected static IStrategoTerm constPackageName2;

  protected static IStrategoTerm constCons38;

  protected static IStrategoTerm constId32;

  protected static IStrategoTerm const100;

  protected static IStrategoTerm constCons37;

  protected static IStrategoTerm constId31;

  protected static IStrategoTerm const99;

  protected static IStrategoTerm constCons36;

  protected static IStrategoTerm constTypeImportOnDemandDec1;

  protected static IStrategoTerm constPackageName1;

  protected static IStrategoTerm constCons35;

  protected static IStrategoTerm constCons34;

  protected static IStrategoTerm constCons33;

  protected static IStrategoTerm constCons32;

  protected static IStrategoTerm constId30;

  protected static IStrategoTerm const98;

  protected static IStrategoTerm constCons31;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons30;

  protected static IStrategoTerm constId29;

  protected static IStrategoTerm const97;

  protected static IStrategoTerm constCons29;

  protected static IStrategoTerm constId28;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm constCons28;

  protected static IStrategoTerm constId27;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constCons27;

  protected static IStrategoTerm constMarkerAnno1;

  protected static IStrategoTerm constClassOrInterfaceType10;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm constClassOrInterfaceType9;

  protected static IStrategoTerm constTypeName18;

  protected static IStrategoTerm constId26;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm constClassOrInterfaceType8;

  protected static IStrategoTerm constTypeName17;

  protected static IStrategoTerm constId25;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm constClassOrInterfaceType7;

  protected static IStrategoTerm constTypeName16;

  protected static IStrategoTerm constId24;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm constClassOrInterfaceType6;

  protected static IStrategoTerm constTypeName15;

  protected static IStrategoTerm constId23;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm constClassOrInterfaceType5;

  protected static IStrategoTerm constTypeName14;

  protected static IStrategoTerm constId22;

  protected static IStrategoTerm const87;

  protected static IStrategoTerm constClassOrInterfaceType4;

  protected static IStrategoTerm constTypeName13;

  protected static IStrategoTerm constId21;

  protected static IStrategoTerm const86;

  protected static IStrategoTerm constClassOrInterfaceType3;

  protected static IStrategoTerm constTypeName12;

  protected static IStrategoTerm constId20;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm constCons26;

  protected static IStrategoTerm constDim0;

  protected static IStrategoTerm constTypeName11;

  protected static IStrategoTerm constId19;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm constMethod0;

  protected static IStrategoTerm constMethodName0;

  protected static IStrategoTerm constId18;

  protected static IStrategoTerm constAmbName0;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm constTypeName10;

  protected static IStrategoTerm constId17;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm constTypeName9;

  protected static IStrategoTerm constId16;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm constParam1;

  protected static IStrategoTerm constId15;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm constClassOrInterfaceType2;

  protected static IStrategoTerm constTypeName8;

  protected static IStrategoTerm constId14;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constThrow0;

  protected static IStrategoTerm constNewInstance0;

  protected static IStrategoTerm constClassOrInterfaceType1;

  protected static IStrategoTerm constTypeName7;

  protected static IStrategoTerm constId13;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm constPrivate0;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm constStatic0;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm constMarkerAnno0;

  protected static IStrategoTerm constTypeName6;

  protected static IStrategoTerm constId12;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm constId11;

  protected static IStrategoTerm constTypeName5;

  protected static IStrategoTerm constId10;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm constId9;

  protected static IStrategoTerm constId8;

  protected static IStrategoTerm constTypeName4;

  protected static IStrategoTerm constId7;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm constVoid0;

  protected static IStrategoTerm constTypeName3;

  protected static IStrategoTerm constId6;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constId5;

  protected static IStrategoTerm constId4;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm constTypeName2;

  protected static IStrategoTerm constId3;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm constParam0;

  protected static IStrategoTerm constId2;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm constClassOrInterfaceType0;

  protected static IStrategoTerm constTypeName1;

  protected static IStrategoTerm constId1;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constRefTypePattern0;

  protected static IStrategoTerm constNamePattern0;

  protected static IStrategoTerm constModPattern0;

  protected static IStrategoTerm constAnnoPattern0;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm constSimpleAnnoPatternExact0;

  protected static IStrategoTerm constTypeName0;

  protected static IStrategoTerm constId0;

  protected static IStrategoTerm const69;

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

  public static IStrategoConstructor _consCJPAfterReturning_3;

  public static IStrategoConstructor _consCJPAfterThrowing_3;

  public static IStrategoConstructor _consCJPAround_3;

  public static IStrategoConstructor _consCJPSingleParam_1;

  public static IStrategoConstructor _consNil_0;

  public static IStrategoConstructor _consPackageName_1;

  public static IStrategoConstructor _consPackageDec_2;

  public static IStrategoConstructor _consTypeImportOnDemandDec_1;

  public static IStrategoConstructor _consCompilationUnit_3;

  public static IStrategoConstructor _consString_1;

  public static IStrategoConstructor _consChars_1;

  public static IStrategoConstructor _consAmbName_1;

  public static IStrategoConstructor _consMethodName_1;

  public static IStrategoConstructor _consMethodName_2;

  public static IStrategoConstructor _consClassOrInterfaceType_2;

  public static IStrategoConstructor _consLit_1;

  public static IStrategoConstructor _consNewInstance_4;

  public static IStrategoConstructor _consInvoke_2;

  public static IStrategoConstructor _consCastRef_2;

  public static IStrategoConstructor _consClass_1;

  public static IStrategoConstructor _consArrayInit_1;

  public static IStrategoConstructor _consDim_0;

  public static IStrategoConstructor _consThrow_1;

  public static IStrategoConstructor _consBlock_1;

  public static IStrategoConstructor _consMethodDec_2;

  public static IStrategoConstructor _consMethodDecHead_6;

  public static IStrategoConstructor _consParam_3;

  public static IStrategoConstructor _consNoMethodBody_0;

  public static IStrategoConstructor _consClassDec_2;

  public static IStrategoConstructor _consClassBody_1;

  public static IStrategoConstructor _consNewArray_3;

  public static IStrategoConstructor _consMethod_1;

  public static IStrategoConstructor _consMethod_3;

  public static IStrategoConstructor _consAnno_2;

  public static IStrategoConstructor _consSingleElemAnno_2;

  public static IStrategoConstructor _consMarkerAnno_1;

  public static IStrategoConstructor _consElemValPair_2;

  public static IStrategoConstructor _consElemValArrayInit_1;

  public static IStrategoConstructor _consId_1;

  public static IStrategoConstructor _consPublic_0;

  public static IStrategoConstructor _consPrivate_0;

  public static IStrategoConstructor _consStatic_0;

  public static IStrategoConstructor _consBoolean_0;

  public static IStrategoConstructor _consByte_0;

  public static IStrategoConstructor _consShort_0;

  public static IStrategoConstructor _consInt_0;

  public static IStrategoConstructor _consLong_0;

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
    _consCJPAfterReturning_3 = termFactory.makeConstructor("CJPAfterReturning", 3);
    _consCJPAfterThrowing_3 = termFactory.makeConstructor("CJPAfterThrowing", 3);
    _consCJPAround_3 = termFactory.makeConstructor("CJPAround", 3);
    _consCJPSingleParam_1 = termFactory.makeConstructor("CJPSingleParam", 1);
    _consNil_0 = termFactory.makeConstructor("Nil", 0);
    _consPackageName_1 = termFactory.makeConstructor("PackageName", 1);
    _consPackageDec_2 = termFactory.makeConstructor("PackageDec", 2);
    _consTypeImportOnDemandDec_1 = termFactory.makeConstructor("TypeImportOnDemandDec", 1);
    _consCompilationUnit_3 = termFactory.makeConstructor("CompilationUnit", 3);
    _consString_1 = termFactory.makeConstructor("String", 1);
    _consChars_1 = termFactory.makeConstructor("Chars", 1);
    _consAmbName_1 = termFactory.makeConstructor("AmbName", 1);
    _consMethodName_1 = termFactory.makeConstructor("MethodName", 1);
    _consMethodName_2 = termFactory.makeConstructor("MethodName", 2);
    _consClassOrInterfaceType_2 = termFactory.makeConstructor("ClassOrInterfaceType", 2);
    _consLit_1 = termFactory.makeConstructor("Lit", 1);
    _consNewInstance_4 = termFactory.makeConstructor("NewInstance", 4);
    _consInvoke_2 = termFactory.makeConstructor("Invoke", 2);
    _consCastRef_2 = termFactory.makeConstructor("CastRef", 2);
    _consClass_1 = termFactory.makeConstructor("Class", 1);
    _consArrayInit_1 = termFactory.makeConstructor("ArrayInit", 1);
    _consDim_0 = termFactory.makeConstructor("Dim", 0);
    _consThrow_1 = termFactory.makeConstructor("Throw", 1);
    _consBlock_1 = termFactory.makeConstructor("Block", 1);
    _consMethodDec_2 = termFactory.makeConstructor("MethodDec", 2);
    _consMethodDecHead_6 = termFactory.makeConstructor("MethodDecHead", 6);
    _consParam_3 = termFactory.makeConstructor("Param", 3);
    _consNoMethodBody_0 = termFactory.makeConstructor("NoMethodBody", 0);
    _consClassDec_2 = termFactory.makeConstructor("ClassDec", 2);
    _consClassBody_1 = termFactory.makeConstructor("ClassBody", 1);
    _consNewArray_3 = termFactory.makeConstructor("NewArray", 3);
    _consMethod_1 = termFactory.makeConstructor("Method", 1);
    _consMethod_3 = termFactory.makeConstructor("Method", 3);
    _consAnno_2 = termFactory.makeConstructor("Anno", 2);
    _consSingleElemAnno_2 = termFactory.makeConstructor("SingleElemAnno", 2);
    _consMarkerAnno_1 = termFactory.makeConstructor("MarkerAnno", 1);
    _consElemValPair_2 = termFactory.makeConstructor("ElemValPair", 2);
    _consElemValArrayInit_1 = termFactory.makeConstructor("ElemValArrayInit", 1);
    _consId_1 = termFactory.makeConstructor("Id", 1);
    _consPublic_0 = termFactory.makeConstructor("Public", 0);
    _consPrivate_0 = termFactory.makeConstructor("Private", 0);
    _consStatic_0 = termFactory.makeConstructor("Static", 0);
    _consBoolean_0 = termFactory.makeConstructor("Boolean", 0);
    _consByte_0 = termFactory.makeConstructor("Byte", 0);
    _consShort_0 = termFactory.makeConstructor("Short", 0);
    _consInt_0 = termFactory.makeConstructor("Int", 0);
    _consLong_0 = termFactory.makeConstructor("Long", 0);
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
    const69 = termFactory.makeString("Closure");
    constId0 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const69});
    constTypeName0 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId0});
    constSimpleAnnoPatternExact0 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{transform.constTypeName0});
    constCons18 = (IStrategoTerm)termFactory.makeListCons(transform.constSimpleAnnoPatternExact0, (IStrategoList)transform.constNil0);
    constAnnoPattern0 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons18});
    constModPattern0 = termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{transform.constNil0});
    constNamePattern0 = termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{transform.const32});
    constRefTypePattern0 = termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{transform.constNamePattern0});
    const70 = termFactory.makeString("JoinPoint");
    constId1 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const70});
    constTypeName1 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId1});
    constClassOrInterfaceType0 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName1, transform.constNone0});
    const71 = termFactory.makeString("thisJoinPoint");
    constId2 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const71});
    constParam0 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constClassOrInterfaceType0, transform.constId2});
    constCons19 = (IStrategoTerm)termFactory.makeListCons(transform.constParam0, (IStrategoList)transform.constNil0);
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons20 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constNil0);
    const72 = termFactory.makeString("JoinpointSignature");
    constId3 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const72});
    constTypeName2 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId3});
    const73 = termFactory.makeString("name");
    constId4 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const73});
    constId5 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const17});
    const74 = termFactory.makeString("After");
    constId6 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const74});
    constTypeName3 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId6});
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    const75 = termFactory.makeString("AfterReturning");
    constId7 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const75});
    constTypeName4 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId7});
    constId8 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const42});
    constId9 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const26});
    const76 = termFactory.makeString("AfterThrowing");
    constId10 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const76});
    constTypeName5 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId10});
    constId11 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const43});
    const77 = termFactory.makeString("Joinpoint");
    constId12 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const77});
    constTypeName6 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId12});
    constMarkerAnno0 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName6});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(transform.constMarkerAnno0, (IStrategoList)transform.constNil0);
    constStatic0 = termFactory.makeAppl(transform._consStatic_0, NO_TERMS);
    constCons22 = (IStrategoTerm)termFactory.makeListCons(transform.constStatic0, (IStrategoList)transform.constCons21);
    constPrivate0 = termFactory.makeAppl(transform._consPrivate_0, NO_TERMS);
    constCons23 = (IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, (IStrategoList)transform.constCons22);
    const78 = termFactory.makeString("UnsupportedOperationException");
    constId13 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const78});
    constTypeName7 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId13});
    constClassOrInterfaceType1 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName7, transform.constNone0});
    constNewInstance0 = termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, transform.constClassOrInterfaceType1, transform.constNil0, transform.constNone0});
    constThrow0 = termFactory.makeAppl(transform._consThrow_1, new IStrategoTerm[]{transform.constNewInstance0});
    constCons24 = (IStrategoTerm)termFactory.makeListCons(transform.constThrow0, (IStrategoList)transform.constNil0);
    constBlock0 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constCons24});
    const79 = termFactory.makeString("ProceedingJoinPoint");
    constId14 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const79});
    constTypeName8 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId14});
    constClassOrInterfaceType2 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName8, transform.constNone0});
    const80 = termFactory.makeString("pjp");
    constId15 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const80});
    constParam1 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constClassOrInterfaceType2, transform.constId15});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(transform.constParam1, (IStrategoList)transform.constCons19);
    const81 = termFactory.makeString("Around");
    constId16 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const81});
    constTypeName9 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId16});
    const82 = termFactory.makeString("Before");
    constId17 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const82});
    constTypeName10 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId17});
    const83 = termFactory.makeString(",");
    constAmbName0 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{transform.constId15});
    constId18 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const65});
    constMethodName0 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{transform.constAmbName0, transform.constId18});
    constMethod0 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName0});
    const84 = termFactory.makeString("Object");
    constId19 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const84});
    constTypeName11 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId19});
    constDim0 = termFactory.makeAppl(transform._consDim_0, NO_TERMS);
    constCons26 = (IStrategoTerm)termFactory.makeListCons(transform.constDim0, (IStrategoList)transform.constNil0);
    const85 = termFactory.makeString("Integer");
    constId20 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const85});
    constTypeName12 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId20});
    constClassOrInterfaceType3 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName12, transform.constNone0});
    const86 = termFactory.makeString("Long");
    constId21 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const86});
    constTypeName13 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId21});
    constClassOrInterfaceType4 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName13, transform.constNone0});
    const87 = termFactory.makeString("Short");
    constId22 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const87});
    constTypeName14 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId22});
    constClassOrInterfaceType5 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName14, transform.constNone0});
    const88 = termFactory.makeString("Byte");
    constId23 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const88});
    constTypeName15 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId23});
    constClassOrInterfaceType6 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName15, transform.constNone0});
    const89 = termFactory.makeString("Double");
    constId24 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const89});
    constTypeName16 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId24});
    constClassOrInterfaceType7 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName16, transform.constNone0});
    const90 = termFactory.makeString("Float");
    constId25 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const90});
    constTypeName17 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId25});
    constClassOrInterfaceType8 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName17, transform.constNone0});
    const91 = termFactory.makeString("Boolean");
    constId26 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const91});
    constTypeName18 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId26});
    constClassOrInterfaceType9 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName18, transform.constNone0});
    const92 = termFactory.makeString("in closures..");
    constClassOrInterfaceType10 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName11, transform.constNone0});
    constMarkerAnno1 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName0});
    constCons27 = (IStrategoTerm)termFactory.makeListCons(transform.constMarkerAnno1, (IStrategoList)transform.constCons20);
    const93 = termFactory.makeString("in short closures..");
    const94 = termFactory.makeString("w");
    const95 = termFactory.makeString("lang");
    constId27 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const95});
    constCons28 = (IStrategoTerm)termFactory.makeListCons(transform.constId27, (IStrategoList)transform.constNil0);
    const96 = termFactory.makeString("aspectj");
    constId28 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const96});
    constCons29 = (IStrategoTerm)termFactory.makeListCons(transform.constId28, (IStrategoList)transform.constCons28);
    const97 = termFactory.makeString("org");
    constId29 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const97});
    constCons30 = (IStrategoTerm)termFactory.makeListCons(transform.constId29, (IStrategoList)transform.constCons29);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons30});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName0});
    constCons31 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec0, (IStrategoList)transform.constNil0);
    const98 = termFactory.makeString("annotation");
    constId30 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const98});
    constCons32 = (IStrategoTerm)termFactory.makeListCons(transform.constId30, (IStrategoList)transform.constNil0);
    constCons33 = (IStrategoTerm)termFactory.makeListCons(transform.constId27, (IStrategoList)transform.constCons32);
    constCons34 = (IStrategoTerm)termFactory.makeListCons(transform.constId28, (IStrategoList)transform.constCons33);
    constCons35 = (IStrategoTerm)termFactory.makeListCons(transform.constId29, (IStrategoList)transform.constCons34);
    constPackageName1 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons35});
    constTypeImportOnDemandDec1 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName1});
    constCons36 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec1, (IStrategoList)transform.constCons31);
    const99 = termFactory.makeString("runtime");
    constId31 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const99});
    constCons37 = (IStrategoTerm)termFactory.makeListCons(transform.constId31, (IStrategoList)transform.constNil0);
    const100 = termFactory.makeString("closures");
    constId32 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const100});
    constCons38 = (IStrategoTerm)termFactory.makeListCons(transform.constId32, (IStrategoList)transform.constCons37);
    constPackageName2 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons38});
    constTypeImportOnDemandDec2 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName2});
    constCons39 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec2, (IStrategoList)transform.constCons36);
    const101 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'closures-converter-compilation-unit'");
    const102 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'check-for-change-in-aspect-or-class'");
    const103 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'closures-converter-aspect-or-class'");
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
              IStrategoTerm q_20 = null;
              q_20 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX0, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(q_20, (IStrategoList)transform.constCons1)))});
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
                IStrategoTerm p_20 = null;
                p_20 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX1, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(p_20, (IStrategoList)transform.constCons1)))});
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
                  IStrategoTerm o_20 = null;
                  o_20 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX2, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(o_20, (IStrategoList)transform.constCons1)))});
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
                    IStrategoTerm n_20 = null;
                    n_20 = term.getSubterm(0);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX3, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(n_20, (IStrategoList)transform.constCons1)))});
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
                      IStrategoTerm m_20 = null;
                      m_20 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX4, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(m_20, (IStrategoList)transform.constCons1)))});
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
                        IStrategoTerm l_20 = null;
                        l_20 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX5, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(l_20, (IStrategoList)transform.constCons1)))});
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
                            IStrategoTerm k_20 = null;
                            k_20 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX7, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(k_20, (IStrategoList)transform.constCons1)))});
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
                              IStrategoTerm j_20 = null;
                              j_20 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX8, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(j_20, (IStrategoList)transform.constCons1)))});
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
                                IStrategoTerm i_20 = null;
                                i_20 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX9, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(i_20, (IStrategoList)transform.constCons1)))});
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
                                  IStrategoTerm h_20 = null;
                                  h_20 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX10, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(h_20, (IStrategoList)transform.constCons1)))});
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
                                    IStrategoTerm g_20 = null;
                                    g_20 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX11, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(g_20, (IStrategoList)transform.constCons1)))});
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
                                      IStrategoTerm f_20 = null;
                                      f_20 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX12, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(f_20, (IStrategoList)transform.constCons1)))});
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
                                        IStrategoTerm e_20 = null;
                                        e_20 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX13, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(e_20, (IStrategoList)transform.constCons1)))});
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
                                          IStrategoTerm b_20 = null;
                                          b_20 = term.getSubterm(0);
                                          term = list_to_args_0_0.instance.invoke(context, b_20);
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
                                            IStrategoTerm x_19 = null;
                                            IStrategoTerm y_19 = null;
                                            x_19 = term.getSubterm(0);
                                            y_19 = term.getSubterm(1);
                                            term = list_to_args_0_0.instance.invoke(context, y_19);
                                            if(term == null)
                                              break Fail16;
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(x_19, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
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
                                              IStrategoTerm w_19 = null;
                                              w_19 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS17, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(w_19, (IStrategoList)transform.constCons1)))});
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
                                                IStrategoTerm u_19 = null;
                                                u_19 = term.getSubterm(0);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS18, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(u_19, (IStrategoList)transform.constCons1)))});
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
              IStrategoTerm t_19 = null;
              t_19 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS19, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(t_19, (IStrategoList)transform.constCons1)))});
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
                IStrategoTerm s_19 = null;
                s_19 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS20, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(s_19, (IStrategoList)transform.constCons1)))});
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
                  IStrategoTerm r_19 = null;
                  r_19 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS21, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(r_19, (IStrategoList)transform.constCons1)))});
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
                    IStrategoTerm o_19 = null;
                    o_19 = term.getSubterm(0);
                    term = list_to_args_0_0.instance.invoke(context, o_19);
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
                      IStrategoTerm n_19 = null;
                      n_19 = term.getSubterm(0);
                      term = n_19;
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
                        IStrategoTerm l_19 = null;
                        IStrategoTerm m_19 = null;
                        l_19 = term.getSubterm(0);
                        m_19 = term.getSubterm(1);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(l_19, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(m_19, (IStrategoList)transform.constNil0)))});
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
                          IStrategoTerm h_19 = null;
                          IStrategoTerm k_19 = null;
                          h_19 = term.getSubterm(0);
                          k_19 = term.getSubterm(1);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(h_19, termFactory.makeListCons(k_19, (IStrategoList)transform.constNil0))});
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
                            IStrategoTerm z_18 = null;
                            IStrategoTerm a_19 = null;
                            IStrategoTerm b_19 = null;
                            IStrategoTerm d_19 = null;
                            z_18 = term.getSubterm(0);
                            a_19 = term.getSubterm(1);
                            b_19 = term.getSubterm(2);
                            term = list_to_args_0_0.instance.invoke(context, b_19);
                            if(term == null)
                              break Fail27;
                            d_19 = term;
                            term = termFactory.makeTuple(z_18, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX15, termFactory.makeListCons(a_19, termFactory.makeListCons(d_19, (IStrategoList)transform.constNil0))));
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
                              IStrategoTerm y_18 = null;
                              y_18 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS26, termFactory.makeListCons(y_18, (IStrategoList)transform.constCons5))});
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
                                  IStrategoTerm x_18 = null;
                                  x_18 = term.getSubterm(0);
                                  term = x_18;
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
                                    IStrategoTerm w_18 = null;
                                    w_18 = term.getSubterm(0);
                                    term = w_18;
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
                                      IStrategoTerm v_18 = null;
                                      v_18 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(v_18, (IStrategoList)transform.constCons6)});
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
                                        IStrategoTerm t_18 = null;
                                        IStrategoTerm u_18 = null;
                                        t_18 = term.getSubterm(0);
                                        u_18 = term.getSubterm(1);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(t_18, termFactory.makeListCons(u_18, (IStrategoList)transform.constNil0))});
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
                                          IStrategoTerm r_18 = null;
                                          IStrategoTerm s_18 = null;
                                          r_18 = term.getSubterm(0);
                                          s_18 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(r_18, termFactory.makeListCons(s_18, (IStrategoList)transform.constCons6))});
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
                                            IStrategoTerm n_18 = null;
                                            IStrategoTerm o_18 = null;
                                            IStrategoTerm arg0 = term.getSubterm(0);
                                            if(arg0.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg0).getConstructor())
                                              break Fail35;
                                            n_18 = arg0.getSubterm(0);
                                            o_18 = term.getSubterm(1);
                                            term = termFactory.makeTuple(n_18, (IStrategoTerm)termFactory.makeListCons(o_18, (IStrategoList)transform.constNil0));
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
                                              IStrategoTerm m_18 = null;
                                              m_18 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{m_18}), (IStrategoList)transform.constNil0)});
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
                                                IStrategoTerm k_18 = null;
                                                IStrategoTerm l_18 = null;
                                                k_18 = term.getSubterm(0);
                                                l_18 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(k_18, termFactory.makeListCons(transform.constFBOX17, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{l_18}), (IStrategoList)transform.constNil0)))});
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
                                                  IStrategoTerm g_18 = null;
                                                  IStrategoTerm j_18 = null;
                                                  g_18 = term.getSubterm(0);
                                                  j_18 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(g_18, termFactory.makeListCons(transform.constFBOX18, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{j_18}), (IStrategoList)transform.constNil0)))});
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
                                                      IStrategoTerm f_18 = null;
                                                      f_18 = term.getSubterm(0);
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(f_18, (IStrategoList)transform.constCons7)});
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
                                                        IStrategoTerm e_18 = null;
                                                        e_18 = term.getSubterm(0);
                                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(e_18, (IStrategoList)transform.constNil0)});
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
                                                              IStrategoTerm d_18 = null;
                                                              d_18 = term.getSubterm(0);
                                                              term = d_18;
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
                                                                IStrategoTerm r_17 = null;
                                                                IStrategoTerm s_17 = null;
                                                                IStrategoTerm t_17 = null;
                                                                IStrategoTerm u_17 = null;
                                                                IStrategoTerm v_17 = null;
                                                                IStrategoTerm w_17 = null;
                                                                IStrategoTerm x_17 = null;
                                                                IStrategoTerm y_17 = null;
                                                                IStrategoTerm z_17 = null;
                                                                IStrategoTerm a_18 = null;
                                                                IStrategoTerm arg4 = term.getSubterm(0);
                                                                if(arg4.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg4).getConstructor())
                                                                  break Fail45;
                                                                t_17 = arg4.getSubterm(0);
                                                                IStrategoTerm arg5 = term.getSubterm(1);
                                                                if(arg5.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg5).getConstructor())
                                                                  break Fail45;
                                                                u_17 = arg5.getSubterm(0);
                                                                r_17 = term.getSubterm(2);
                                                                s_17 = term.getSubterm(3);
                                                                w_17 = term.getSubterm(4);
                                                                y_17 = term.getSubterm(5);
                                                                a_18 = term;
                                                                term = termFactory.makeTuple(t_17, u_17);
                                                                term = conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail45;
                                                                v_17 = term;
                                                                term = list_to_args_0_0.instance.invoke(context, w_17);
                                                                if(term == null)
                                                                  break Fail45;
                                                                x_17 = term;
                                                                term = option_to_boxes_0_0.instance.invoke(context, y_17);
                                                                if(term == null)
                                                                  break Fail45;
                                                                z_17 = term;
                                                                term = a_18;
                                                                IStrategoList list0;
                                                                list0 = checkListTail(z_17);
                                                                if(list0 == null)
                                                                  break Fail45;
                                                                term = termFactory.makeTuple(v_17, (IStrategoTerm)termFactory.makeListCons(r_17, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(s_17, termFactory.makeListCons(x_17, (IStrategoList)transform.constNil0))}), list0)));
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
                                                                  IStrategoTerm h_17 = null;
                                                                  IStrategoTerm i_17 = null;
                                                                  IStrategoTerm j_17 = null;
                                                                  IStrategoTerm k_17 = null;
                                                                  IStrategoTerm l_17 = null;
                                                                  IStrategoTerm m_17 = null;
                                                                  IStrategoTerm n_17 = null;
                                                                  IStrategoTerm arg6 = term.getSubterm(0);
                                                                  if(arg6.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg6).getConstructor())
                                                                    break Fail46;
                                                                  j_17 = arg6.getSubterm(0);
                                                                  IStrategoTerm arg7 = term.getSubterm(1);
                                                                  if(arg7.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg7).getConstructor())
                                                                    break Fail46;
                                                                  k_17 = arg7.getSubterm(0);
                                                                  h_17 = term.getSubterm(2);
                                                                  m_17 = term.getSubterm(3);
                                                                  i_17 = term.getSubterm(4);
                                                                  term = termFactory.makeTuple(j_17, k_17);
                                                                  term = conc_0_0.instance.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail46;
                                                                  l_17 = term;
                                                                  term = list_to_args_0_0.instance.invoke(context, m_17);
                                                                  if(term == null)
                                                                    break Fail46;
                                                                  n_17 = term;
                                                                  term = termFactory.makeTuple(l_17, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(h_17, termFactory.makeListCons(n_17, (IStrategoList)transform.constNil0))}), termFactory.makeListCons(i_17, (IStrategoList)transform.constNil0)));
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
              IStrategoTerm w_16 = null;
              IStrategoTerm z_16 = null;
              IStrategoTerm a_17 = null;
              IStrategoTerm b_17 = null;
              IStrategoTerm c_17 = null;
              IStrategoTerm arg8 = term.getSubterm(0);
              if(arg8.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg8).getConstructor())
                break Fail48;
              a_17 = arg8.getSubterm(0);
              IStrategoTerm arg9 = term.getSubterm(1);
              if(arg9.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg9).getConstructor())
                break Fail48;
              b_17 = arg9.getSubterm(0);
              w_16 = term.getSubterm(2);
              z_16 = term.getSubterm(3);
              term = termFactory.makeTuple(a_17, b_17);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail48;
              c_17 = term;
              term = termFactory.makeTuple(c_17, (IStrategoTerm)termFactory.makeListCons(w_16, termFactory.makeListCons(z_16, (IStrategoList)transform.constNil0)));
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
                IStrategoTerm v_16 = null;
                v_16 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{v_16});
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
                  IStrategoTerm s_16 = null;
                  IStrategoTerm u_16 = null;
                  s_16 = term.getSubterm(0);
                  u_16 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(s_16, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{u_16}), (IStrategoList)transform.constNil0)))});
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
                    IStrategoTerm q_16 = null;
                    IStrategoTerm r_16 = null;
                    q_16 = term.getSubterm(0);
                    r_16 = term.getSubterm(1);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(q_16, termFactory.makeListCons(transform.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{r_16}), (IStrategoList)transform.constNil0)))});
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
                        IStrategoTerm p_16 = null;
                        p_16 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(p_16, (IStrategoList)transform.constCons9)});
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
                          IStrategoTerm l_16 = null;
                          l_16 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(l_16, (IStrategoList)transform.constCons10)});
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
                            IStrategoTerm k_16 = null;
                            k_16 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(k_16, (IStrategoList)transform.constNil0))});
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
                              IStrategoTerm j_16 = null;
                              j_16 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, j_16});
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
                                IStrategoTerm f_16 = null;
                                f_16 = term.getSubterm(0);
                                term = separate_by_comma_0_0.instance.invoke(context, f_16);
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
                                  IStrategoTerm e_16 = null;
                                  e_16 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(e_16, (IStrategoList)transform.constNil0))});
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
                                    IStrategoTerm c_16 = null;
                                    c_16 = term.getSubterm(0);
                                    term = has_leftmost_not_0_0.instance.invoke(context, c_16);
                                    if(term == null)
                                      break Fail59;
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS1, termFactory.makeListCons(c_16, (IStrategoList)transform.constCons1))});
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
                                      IStrategoTerm y_15 = null;
                                      y_15 = term.getSubterm(0);
                                      term = y_15;
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
                                      term = y_15;
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
                                        IStrategoTerm x_15 = null;
                                        x_15 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(x_15, (IStrategoList)transform.constNil0))});
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
                                          IStrategoTerm w_15 = null;
                                          w_15 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(w_15, (IStrategoList)transform.constCons1)))});
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
                                            IStrategoTerm t_15 = null;
                                            IStrategoTerm u_15 = null;
                                            t_15 = term.getSubterm(0);
                                            u_15 = term.getSubterm(1);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(t_15, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(u_15, (IStrategoList)transform.constCons1))))});
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
                                              IStrategoTerm s_15 = null;
                                              s_15 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(s_15, (IStrategoList)transform.constNil0))});
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
                                                IStrategoTerm q_15 = null;
                                                IStrategoTerm r_15 = null;
                                                q_15 = term.getSubterm(0);
                                                r_15 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(q_15, termFactory.makeListCons(transform.constS35, termFactory.makeListCons(r_15, (IStrategoList)transform.constNil0)))});
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
                                                  IStrategoTerm o_15 = null;
                                                  IStrategoTerm p_15 = null;
                                                  o_15 = term.getSubterm(0);
                                                  p_15 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(o_15, termFactory.makeListCons(transform.constS36, termFactory.makeListCons(p_15, (IStrategoList)transform.constNil0)))});
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
                                                    IStrategoTerm h_15 = null;
                                                    IStrategoTerm i_15 = null;
                                                    h_15 = term.getSubterm(0);
                                                    IStrategoTerm arg10 = term.getSubterm(1);
                                                    i_15 = arg10;
                                                    if(arg10.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg10).getConstructor())
                                                      break Fail68;
                                                    term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(h_15, termFactory.makeListCons(i_15, (IStrategoList)transform.constNil0))});
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
                                                      IStrategoTerm g_15 = null;
                                                      g_15 = term.getSubterm(0);
                                                      IStrategoTerm arg12 = term.getSubterm(1);
                                                      if(arg12.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg12).getConstructor())
                                                        break Fail69;
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(g_15, (IStrategoList)transform.constCons5)});
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
                                                        IStrategoTerm l_14 = null;
                                                        IStrategoTerm m_14 = null;
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
                                                        l_14 = term.getSubterm(2);
                                                        m_14 = term.getSubterm(3);
                                                        t_14 = term.getSubterm(4);
                                                        IStrategoTerm arg13 = term.getSubterm(5);
                                                        if(arg13.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg13).getConstructor())
                                                          break Fail70;
                                                        n_14 = arg13.getSubterm(0);
                                                        o_14 = term.getSubterm(6);
                                                        v_14 = term.getSubterm(7);
                                                        a_15 = term;
                                                        term = list_to_args_0_0.instance.invoke(context, o_14);
                                                        if(term == null)
                                                          break Fail70;
                                                        p_14 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, s_14);
                                                        if(term == null)
                                                          break Fail70;
                                                        y_14 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, t_14);
                                                        if(term == null)
                                                          break Fail70;
                                                        u_14 = term;
                                                        term = option_to_boxes_0_0.instance.invoke(context, v_14);
                                                        if(term == null)
                                                          break Fail70;
                                                        w_14 = term;
                                                        term = termFactory.makeTuple(x_14, y_14);
                                                        term = conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail70;
                                                        z_14 = term;
                                                        term = a_15;
                                                        f_15 = term;
                                                        term = termFactory.makeTuple(u_14, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{n_14}), termFactory.makeListCons(p_14, (IStrategoList)transform.constNil0))));
                                                        term = make$Conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail70;
                                                        d_15 = term;
                                                        term = f_15;
                                                        IStrategoList list2;
                                                        IStrategoList list1;
                                                        list1 = checkListTail(w_14);
                                                        if(list1 == null)
                                                          break Fail70;
                                                        list2 = checkListTail(d_15);
                                                        if(list2 == null)
                                                          break Fail70;
                                                        term = termFactory.makeTuple(z_14, (IStrategoTerm)termFactory.makeListCons(l_14, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(m_14, list2)}), list1)));
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
                                                          IStrategoTerm j_14 = null;
                                                          IStrategoTerm k_14 = null;
                                                          j_14 = term.getSubterm(0);
                                                          k_14 = term.getSubterm(1);
                                                          term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(j_14, termFactory.makeListCons(k_14, (IStrategoList)transform.constNil0))});
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
              IStrategoTerm q_13 = null;
              IStrategoTerm r_13 = null;
              IStrategoTerm s_13 = null;
              IStrategoTerm t_13 = null;
              IStrategoTerm u_13 = null;
              IStrategoTerm y_13 = null;
              IStrategoTerm z_13 = null;
              IStrategoTerm a_14 = null;
              IStrategoTerm b_14 = null;
              IStrategoTerm c_14 = null;
              IStrategoTerm d_14 = null;
              IStrategoTerm e_14 = null;
              IStrategoTerm h_14 = null;
              IStrategoTerm i_14 = null;
              b_14 = term.getSubterm(0);
              t_13 = term.getSubterm(1);
              q_13 = term.getSubterm(2);
              u_13 = term.getSubterm(3);
              r_13 = term.getSubterm(4);
              z_13 = term.getSubterm(5);
              e_14 = term;
              term = list_to_args_0_0.instance.invoke(context, r_13);
              if(term == null)
                break Fail73;
              s_13 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, t_13);
              if(term == null)
                break Fail73;
              c_14 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, u_13);
              if(term == null)
                break Fail73;
              y_13 = term;
              term = option_to_boxes_0_0.instance.invoke(context, z_13);
              if(term == null)
                break Fail73;
              a_14 = term;
              term = termFactory.makeTuple(b_14, c_14);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail73;
              d_14 = term;
              term = e_14;
              i_14 = term;
              term = termFactory.makeTuple(y_13, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(transform.constFBOX19, termFactory.makeListCons(s_13, (IStrategoList)transform.constNil0))));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail73;
              h_14 = term;
              term = i_14;
              IStrategoList list4;
              IStrategoList list3;
              list3 = checkListTail(a_14);
              if(list3 == null)
                break Fail73;
              list4 = checkListTail(h_14);
              if(list4 == null)
                break Fail73;
              term = termFactory.makeTuple(d_14, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(q_13, list4)}), list3));
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
                IStrategoTerm z_12 = null;
                IStrategoTerm a_13 = null;
                IStrategoTerm e_13 = null;
                IStrategoTerm f_13 = null;
                IStrategoTerm g_13 = null;
                IStrategoTerm h_13 = null;
                IStrategoTerm i_13 = null;
                IStrategoTerm o_13 = null;
                IStrategoTerm p_13 = null;
                z_12 = term.getSubterm(0);
                a_13 = term.getSubterm(1);
                e_13 = term.getSubterm(2);
                g_13 = term.getSubterm(3);
                f_13 = term.getSubterm(4);
                i_13 = term;
                term = option_to_boxes_0_0.instance.invoke(context, g_13);
                if(term == null)
                  break Fail74;
                h_13 = term;
                term = i_13;
                p_13 = term;
                term = termFactory.makeTuple(h_13, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(f_13, (IStrategoList)transform.constCons5)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail74;
                o_13 = term;
                term = p_13;
                IStrategoList list5;
                list5 = checkListTail(o_13);
                if(list5 == null)
                  break Fail74;
                term = termFactory.makeTuple(z_12, (IStrategoTerm)termFactory.makeListCons(a_13, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(e_13, list5)}), (IStrategoList)transform.constNil0)));
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
                  IStrategoTerm o_12 = null;
                  IStrategoTerm p_12 = null;
                  IStrategoTerm q_12 = null;
                  IStrategoTerm r_12 = null;
                  IStrategoTerm s_12 = null;
                  IStrategoTerm t_12 = null;
                  IStrategoTerm u_12 = null;
                  IStrategoTerm x_12 = null;
                  IStrategoTerm y_12 = null;
                  o_12 = term.getSubterm(0);
                  p_12 = term.getSubterm(1);
                  s_12 = term.getSubterm(2);
                  q_12 = term.getSubterm(3);
                  r_12 = term.getSubterm(4);
                  u_12 = term;
                  term = option_to_boxes_0_0.instance.invoke(context, s_12);
                  if(term == null)
                    break Fail75;
                  t_12 = term;
                  term = u_12;
                  y_12 = term;
                  term = termFactory.makeTuple(t_12, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(q_12, (IStrategoList)transform.constNil0)));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75;
                  x_12 = term;
                  term = y_12;
                  IStrategoList list6;
                  list6 = checkListTail(x_12);
                  if(list6 == null)
                    break Fail75;
                  term = termFactory.makeTuple(o_12, (IStrategoTerm)termFactory.makeListCons(p_12, list6));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75;
                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term}), termFactory.makeListCons(r_12, (IStrategoList)transform.constNil0))});
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
                    IStrategoTerm l_12 = null;
                    l_12 = term.getSubterm(0);
                    term = separate_by_comma_0_0.instance.invoke(context, l_12);
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
                      IStrategoTerm h_12 = null;
                      IStrategoTerm i_12 = null;
                      i_12 = term.getSubterm(0);
                      h_12 = term.getSubterm(1);
                      term = separate_by_comma_0_0.instance.invoke(context, i_12);
                      if(term == null)
                        break Fail77;
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX25, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons12)))}), termFactory.makeListCons(h_12, (IStrategoList)transform.constNil0))});
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
                        IStrategoTerm d_12 = null;
                        IStrategoTerm e_12 = null;
                        d_12 = term.getSubterm(0);
                        e_12 = term.getSubterm(1);
                        term = separate_by_comma_0_0.instance.invoke(context, e_12);
                        if(term == null)
                          break Fail78;
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(d_12, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX26, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons12)))}), (IStrategoList)transform.constNil0))});
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
                            IStrategoTerm c_12 = null;
                            c_12 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX27, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(c_12, (IStrategoList)transform.constCons12)))});
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
                                IStrategoTerm b_12 = null;
                                b_12 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX28, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(b_12, (IStrategoList)transform.constCons12)))});
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
                                  IStrategoTerm w_11 = null;
                                  IStrategoTerm x_11 = null;
                                  IStrategoTerm y_11 = null;
                                  w_11 = term.getSubterm(0);
                                  x_11 = term.getSubterm(1);
                                  y_11 = term.getSubterm(2);
                                  term = termFactory.makeTuple(w_11, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX29, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(x_11, termFactory.makeListCons(y_11, (IStrategoList)transform.constCons13))))));
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
                                    IStrategoTerm r_11 = null;
                                    IStrategoTerm s_11 = null;
                                    IStrategoTerm t_11 = null;
                                    r_11 = term.getSubterm(0);
                                    s_11 = term.getSubterm(1);
                                    t_11 = term.getSubterm(2);
                                    term = termFactory.makeTuple(r_11, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX31, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(s_11, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(t_11, (IStrategoList)transform.constCons13)))))));
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
              IStrategoTerm p_11 = null;
              IStrategoTerm q_11 = null;
              p_11 = term.getSubterm(0);
              q_11 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX32, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(p_11, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(q_11, (IStrategoList)transform.constCons13))))))});
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
                IStrategoTerm n_11 = null;
                IStrategoTerm o_11 = null;
                n_11 = term.getSubterm(0);
                o_11 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX33, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(n_11, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(o_11, (IStrategoList)transform.constCons13))))))});
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
                  IStrategoTerm h_11 = null;
                  IStrategoTerm i_11 = null;
                  IStrategoTerm j_11 = null;
                  h_11 = term.getSubterm(0);
                  i_11 = term.getSubterm(1);
                  term = separate_by_comma_0_0.instance.invoke(context, i_11);
                  if(term == null)
                    break Fail88;
                  j_11 = term;
                  term = termFactory.makeTuple(h_11, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX34, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(j_11, (IStrategoList)transform.constCons13)))));
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
                    IStrategoTerm b_11 = null;
                    IStrategoTerm c_11 = null;
                    IStrategoTerm d_11 = null;
                    IStrategoTerm e_11 = null;
                    b_11 = term.getSubterm(0);
                    c_11 = term.getSubterm(1);
                    d_11 = term.getSubterm(2);
                    e_11 = term.getSubterm(3);
                    term = termFactory.makeTuple(b_11, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(c_11, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(d_11, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(e_11, (IStrategoList)transform.constCons5)))))));
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
                              IStrategoTerm z_10 = null;
                              IStrategoTerm a_11 = null;
                              z_10 = term.getSubterm(0);
                              a_11 = term.getSubterm(1);
                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(z_10, termFactory.makeListCons(a_11, (IStrategoList)transform.constNil0))});
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
                                IStrategoTerm z_9 = null;
                                IStrategoTerm a_10 = null;
                                IStrategoTerm b_10 = null;
                                IStrategoTerm c_10 = null;
                                IStrategoTerm d_10 = null;
                                IStrategoTerm e_10 = null;
                                IStrategoTerm f_10 = null;
                                IStrategoTerm j_10 = null;
                                IStrategoTerm k_10 = null;
                                IStrategoTerm l_10 = null;
                                IStrategoTerm m_10 = null;
                                IStrategoTerm t_10 = null;
                                IStrategoTerm u_10 = null;
                                z_9 = term.getSubterm(0);
                                a_10 = term.getSubterm(1);
                                b_10 = term.getSubterm(2);
                                d_10 = term.getSubterm(3);
                                f_10 = term.getSubterm(4);
                                k_10 = term.getSubterm(5);
                                m_10 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, b_10);
                                if(term == null)
                                  break Fail95;
                                c_10 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, d_10);
                                if(term == null)
                                  break Fail95;
                                e_10 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, f_10);
                                if(term == null)
                                  break Fail95;
                                j_10 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, k_10);
                                if(term == null)
                                  break Fail95;
                                l_10 = term;
                                term = m_10;
                                u_10 = term;
                                term = termFactory.makeTuple(j_10, l_10);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                term = termFactory.makeTuple(e_10, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                term = termFactory.makeTuple(c_10, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                t_10 = term;
                                term = u_10;
                                IStrategoList list7;
                                list7 = checkListTail(t_10);
                                if(list7 == null)
                                  break Fail95;
                                term = termFactory.makeTuple(z_9, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX35, termFactory.makeListCons(a_10, list7)));
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
                                  IStrategoTerm y_9 = null;
                                  y_9 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX36, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(y_9, (IStrategoList)transform.constCons1)))});
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
                                    IStrategoTerm x_9 = null;
                                    x_9 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX37, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(x_9, (IStrategoList)transform.constCons1)))});
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
                                      IStrategoTerm w_9 = null;
                                      w_9 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX38, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(w_9, (IStrategoList)transform.constCons1)))});
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
                                        IStrategoTerm v_9 = null;
                                        v_9 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX39, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(v_9, (IStrategoList)transform.constCons1)))});
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
                                          IStrategoTerm s_9 = null;
                                          s_9 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX40, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(s_9, (IStrategoList)transform.constCons1)))});
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
                                              IStrategoTerm r_9 = null;
                                              r_9 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constNil0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons16, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX43, termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons17, r_9}), (IStrategoList)transform.constNil0))}), (IStrategoList)transform.constCons14)});
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
              IStrategoTerm s_20 = null;
              s_20 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX46, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(s_20, (IStrategoList)transform.constCons1)))});
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
                IStrategoTerm r_20 = null;
                r_20 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX47, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(r_20, (IStrategoList)transform.constCons1)))});
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
        term = t_20.instance.invoke(context, term);
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
              IStrategoTerm u_20 = null;
              u_20 = term.getSubterm(0);
              term = u_20;
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
        IStrategoTerm y_20 = null;
        term = pp_java5_to_abox_1_0.instance.invoke(context, term, lifted3.instance);
        if(term == null)
          break Fail110;
        y_20 = term;
        term = box2text_string_0_1.instance.invoke(context, y_20, transform.const68);
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
            Success104:
            { 
              if(cons7 == transform._consClosureJoinpoints_4)
              { 
                Fail114:
                { 
                  term = transform.constNone0;
                  if(true)
                    break Success104;
                }
                term = term105;
              }
              if(cons7 == transform._consCJPAdvice_4)
              { 
                term = transform.constNone0;
              }
              else
              { 
                break Fail111;
              }
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_21)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference c_21 = new TermReference(ref_c_21);
      context.push("closures_to_ajc_0_1");
      Fail115:
      { 
        TermReference d_21 = new TermReference();
        IStrategoTerm e_21 = null;
        IStrategoTerm f_21 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail115;
        f_21 = term.getSubterm(0);
        IStrategoTerm arg28 = term.getSubterm(1);
        if(arg28.getTermType() != IStrategoTerm.APPL || transform._consAspectBody_1 != ((IStrategoAppl)arg28).getConstructor())
          break Fail115;
        e_21 = arg28.getSubterm(0);
        term = f_21;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDecHead_6 != ((IStrategoAppl)term).getConstructor())
          break Fail115;
        IStrategoTerm arg30 = term.getSubterm(1);
        if(arg30.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg30).getConstructor())
          break Fail115;
        if(d_21.value == null)
          d_21.value = arg30.getSubterm(0);
        else
          if(d_21.value != arg30.getSubterm(0) && !d_21.value.match(arg30.getSubterm(0)))
            break Fail115;
        term = e_21;
        lifted4 lifted40 = new lifted4();
        lifted40.c_21 = c_21;
        lifted40.d_21 = d_21;
        term = topdown_1_0.instance.invoke(context, term, lifted40);
        if(term == null)
          break Fail115;
        term = topdown_1_0.instance.invoke(context, term, lifted6.instance);
        if(term == null)
          break Fail115;
        term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{f_21, termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class closures_to_ajc_0_2_fragment_0 extends Strategy 
  { 
    public static closures_to_ajc_0_2_fragment_0 instance = new closures_to_ajc_0_2_fragment_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closures_to_ajc_0_2_fragment_0");
      Fail116:
      { 
        IStrategoTerm term108 = term;
        IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success105:
        { 
          if(cons8 == transform._consCJPAdvice_4)
          { 
            Fail117:
            { 
              IStrategoTerm m_23 = null;
              IStrategoTerm n_23 = null;
              IStrategoTerm o_23 = null;
              IStrategoTerm p_23 = null;
              IStrategoTerm t_23 = null;
              IStrategoTerm y_23 = null;
              IStrategoTerm u_23 = null;
              IStrategoTerm v_23 = null;
              IStrategoTerm arg35 = term.getSubterm(1);
              if(arg35.getTermType() != IStrategoTerm.APPL || transform._consCJPAfter_2 != ((IStrategoAppl)arg35).getConstructor())
                break Fail117;
              IStrategoTerm arg36 = arg35.getSubterm(0);
              if(arg36.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg36).getConstructor())
                break Fail117;
              m_23 = arg36.getSubterm(0);
              n_23 = arg35.getSubterm(1);
              o_23 = term.getSubterm(2);
              p_23 = term.getSubterm(3);
              term = map_1_0.instance.invoke(context, n_23, lifted8.instance);
              if(term == null)
                break Fail117;
              y_23 = term;
              term = map_1_0.instance.invoke(context, n_23, lifted9.instance);
              if(term == null)
                break Fail117;
              term = termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{m_23}), y_23, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})});
              term = pp_aspectj_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail117;
              t_23 = term;
              term = map_1_0.instance.invoke(context, n_23, lifted10.instance);
              if(term == null)
                break Fail117;
              u_23 = term;
              term = gen_synthetic_method_name_0_0.instance.invoke(context, m_23);
              if(term == null)
                break Fail117;
              v_23 = term;
              term = termFactory.makeTuple(n_23, transform.constCons19);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail117;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{t_23}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId5, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{u_23})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{m_23}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0))}), (IStrategoList)transform.constCons20)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{v_23}), term, o_23}), p_23});
              if(true)
                break Success105;
            }
            term = term108;
          }
          Success106:
          { 
            if(cons8 == transform._consCJPAdvice_4)
            { 
              Fail118:
              { 
                IStrategoTerm l_22 = null;
                IStrategoTerm m_22 = null;
                IStrategoTerm n_22 = null;
                IStrategoTerm o_22 = null;
                IStrategoTerm p_22 = null;
                IStrategoTerm t_22 = null;
                IStrategoTerm u_22 = null;
                IStrategoTerm r_22 = null;
                IStrategoTerm v_22 = null;
                IStrategoTerm arg43 = term.getSubterm(1);
                if(arg43.getTermType() != IStrategoTerm.APPL || transform._consCJPAfterReturning_3 != ((IStrategoAppl)arg43).getConstructor())
                  break Fail118;
                IStrategoTerm arg44 = arg43.getSubterm(0);
                if(arg44.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg44).getConstructor())
                  break Fail118;
                m_22 = arg44.getSubterm(0);
                l_22 = arg43.getSubterm(1);
                IStrategoTerm arg45 = arg43.getSubterm(2);
                if(arg45.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg45).getConstructor())
                  break Fail118;
                IStrategoTerm arg46 = arg45.getSubterm(0);
                if(arg46.getTermType() != IStrategoTerm.APPL || transform._consCJPSingleParam_1 != ((IStrategoAppl)arg46).getConstructor())
                  break Fail118;
                IStrategoTerm arg47 = arg46.getSubterm(0);
                if(arg47.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg47).getConstructor())
                  break Fail118;
                n_22 = arg47.getSubterm(0);
                o_22 = term.getSubterm(2);
                p_22 = term.getSubterm(3);
                term = map_1_0.instance.invoke(context, l_22, lifted11.instance);
                if(term == null)
                  break Fail118;
                term = termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{m_22}), term, transform.constNone0})});
                term = pp_aspectj_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail118;
                t_22 = term;
                term = n_22;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
                  break Fail118;
                r_22 = term.getSubterm(2);
                term = pp_java_string_0_0.instance.invoke(context, r_22);
                if(term == null)
                  break Fail118;
                term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
                u_22 = term;
                term = map_1_0.instance.invoke(context, l_22, lifted12.instance);
                if(term == null)
                  break Fail118;
                v_22 = term;
                term = gen_synthetic_method_name_0_0.instance.invoke(context, m_22);
                if(term == null)
                  break Fail118;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{t_22}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId8, u_22}), (IStrategoList)transform.constNil0))}), termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId5, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{v_22})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{m_22}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0))}), (IStrategoList)transform.constCons20)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), (IStrategoTerm)termFactory.makeListCons(n_22, (IStrategoList)transform.constNil0), o_22}), p_22});
                if(true)
                  break Success106;
              }
              term = term108;
            }
            if(cons8 == transform._consCJPAdvice_4)
            { 
              IStrategoTerm k_21 = null;
              IStrategoTerm l_21 = null;
              IStrategoTerm m_21 = null;
              IStrategoTerm n_21 = null;
              IStrategoTerm o_21 = null;
              IStrategoTerm s_21 = null;
              IStrategoTerm t_21 = null;
              IStrategoTerm q_21 = null;
              IStrategoTerm u_21 = null;
              IStrategoTerm arg54 = term.getSubterm(1);
              if(arg54.getTermType() != IStrategoTerm.APPL || transform._consCJPAfterThrowing_3 != ((IStrategoAppl)arg54).getConstructor())
                break Fail116;
              IStrategoTerm arg55 = arg54.getSubterm(0);
              if(arg55.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg55).getConstructor())
                break Fail116;
              l_21 = arg55.getSubterm(0);
              k_21 = arg54.getSubterm(1);
              IStrategoTerm arg56 = arg54.getSubterm(2);
              if(arg56.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg56).getConstructor())
                break Fail116;
              IStrategoTerm arg57 = arg56.getSubterm(0);
              if(arg57.getTermType() != IStrategoTerm.APPL || transform._consCJPSingleParam_1 != ((IStrategoAppl)arg57).getConstructor())
                break Fail116;
              IStrategoTerm arg58 = arg57.getSubterm(0);
              if(arg58.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg58).getConstructor())
                break Fail116;
              m_21 = arg58.getSubterm(0);
              n_21 = term.getSubterm(2);
              o_21 = term.getSubterm(3);
              term = map_1_0.instance.invoke(context, k_21, lifted13.instance);
              if(term == null)
                break Fail116;
              term = termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{l_21}), term, transform.constNone0})});
              term = pp_aspectj_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail116;
              s_21 = term;
              term = m_21;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
                break Fail116;
              q_21 = term.getSubterm(2);
              term = pp_java_string_0_0.instance.invoke(context, q_21);
              if(term == null)
                break Fail116;
              term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
              t_21 = term;
              term = map_1_0.instance.invoke(context, k_21, lifted14.instance);
              if(term == null)
                break Fail116;
              u_21 = term;
              term = gen_synthetic_method_name_0_0.instance.invoke(context, l_21);
              if(term == null)
                break Fail116;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{s_21}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId11, t_21}), (IStrategoList)transform.constNil0))}), termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId5, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{u_21})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{l_21}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0))}), (IStrategoList)transform.constCons20)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), (IStrategoTerm)termFactory.makeListCons(m_21, (IStrategoList)transform.constNil0), n_21}), o_21});
            }
            else
            { 
              break Fail116;
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

  @SuppressWarnings("all") public static class closures_to_ajc_0_2 extends Strategy 
  { 
    public static closures_to_ajc_0_2 instance = new closures_to_ajc_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_45, IStrategoTerm u_45)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closures_to_ajc_0_2");
      Fail119:
      { 
        IStrategoTerm term110 = term;
        Success107:
        { 
          Fail120:
          { 
            IStrategoTerm c_27 = null;
            IStrategoTerm e_27 = null;
            IStrategoTerm h_27 = null;
            IStrategoTerm l_27 = null;
            IStrategoTerm n_27 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consJoinpointDeclaration_4 != ((IStrategoAppl)term).getConstructor())
              break Fail120;
            c_27 = term.getSubterm(0);
            e_27 = term.getSubterm(1);
            h_27 = term.getSubterm(2);
            l_27 = term.getSubterm(3);
            n_27 = e_27;
            term = joinpoint_params_to_string_0_0.instance.invoke(context, h_27);
            if(term == null)
              break Fail120;
            term = joinpoint_0_3.instance.invoke(context, n_27, term, c_27, l_27);
            if(term == null)
              break Fail120;
            term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons23, transform.constNone0, c_27, e_27, h_27, l_27}), transform.constBlock0});
            if(true)
              break Success107;
          }
          term = term110;
          IStrategoTerm term111 = term;
          Success108:
          { 
            Fail121:
            { 
              IStrategoTerm t_25 = null;
              IStrategoTerm u_25 = null;
              IStrategoTerm v_25 = null;
              TermReference w_25 = new TermReference();
              IStrategoTerm x_25 = null;
              IStrategoTerm b_26 = null;
              IStrategoTerm g_26 = null;
              IStrategoTerm h_26 = null;
              IStrategoTerm c_26 = null;
              IStrategoTerm p_26 = null;
              IStrategoTerm d_26 = null;
              IStrategoTerm v_26 = null;
              IStrategoTerm e_26 = null;
              IStrategoTerm w_26 = null;
              IStrategoTerm f_26 = null;
              IStrategoTerm x_26 = null;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consCJPAdvice_4 != ((IStrategoAppl)term).getConstructor())
                break Fail121;
              IStrategoTerm arg65 = term.getSubterm(1);
              if(arg65.getTermType() != IStrategoTerm.APPL || transform._consCJPAround_3 != ((IStrategoAppl)arg65).getConstructor())
                break Fail121;
              if(w_25.value == null)
                w_25.value = arg65.getSubterm(0);
              else
                if(w_25.value != arg65.getSubterm(0) && !w_25.value.match(arg65.getSubterm(0)))
                  break Fail121;
              IStrategoTerm arg66 = arg65.getSubterm(1);
              if(arg66.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg66).getConstructor())
                break Fail121;
              t_25 = arg66.getSubterm(0);
              u_25 = arg65.getSubterm(2);
              v_25 = term.getSubterm(2);
              x_25 = term.getSubterm(3);
              g_26 = term;
              term = map_1_0.instance.invoke(context, u_25, lifted15.instance);
              if(term == null)
                break Fail121;
              h_26 = term;
              term = map_1_0.instance.invoke(context, u_25, lifted16.instance);
              if(term == null)
                break Fail121;
              term = termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{t_25}), h_26, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})});
              term = pp_aspectj_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail121;
              b_26 = term;
              p_26 = g_26;
              term = map_1_0.instance.invoke(context, u_25, lifted17.instance);
              if(term == null)
                break Fail121;
              c_26 = term;
              v_26 = p_26;
              term = gen_synthetic_method_name_0_0.instance.invoke(context, t_25);
              if(term == null)
                break Fail121;
              d_26 = term;
              w_26 = v_26;
              term = termFactory.makeTuple(u_25, transform.constCons25);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail121;
              e_26 = term;
              x_26 = w_26;
              term = x_25;
              lifted18 lifted180 = new lifted18();
              lifted180.w_25 = w_25;
              term = topdown_1_0.instance.invoke(context, term, lifted180);
              if(term == null)
                break Fail121;
              f_26 = term;
              term = x_26;
              if(w_25.value == null)
                break Fail121;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{b_26}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId5, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{c_26})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{t_25}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0))}), (IStrategoList)transform.constCons20)), transform.constNone0, w_25.value, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_26}), e_26, v_25}), f_26});
              if(true)
                break Success108;
            }
            term = term111;
            IStrategoTerm term112 = term;
            Success109:
            { 
              Fail122:
              { 
                IStrategoTerm p_24 = null;
                IStrategoTerm q_24 = null;
                IStrategoTerm r_24 = null;
                IStrategoTerm s_24 = null;
                IStrategoTerm w_24 = null;
                IStrategoTerm b_25 = null;
                IStrategoTerm x_24 = null;
                IStrategoTerm y_24 = null;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consCJPAdvice_4 != ((IStrategoAppl)term).getConstructor())
                  break Fail122;
                IStrategoTerm arg73 = term.getSubterm(1);
                if(arg73.getTermType() != IStrategoTerm.APPL || transform._consCJPBefore_2 != ((IStrategoAppl)arg73).getConstructor())
                  break Fail122;
                IStrategoTerm arg74 = arg73.getSubterm(0);
                if(arg74.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg74).getConstructor())
                  break Fail122;
                p_24 = arg74.getSubterm(0);
                q_24 = arg73.getSubterm(1);
                r_24 = term.getSubterm(2);
                s_24 = term.getSubterm(3);
                term = map_1_0.instance.invoke(context, q_24, lifted20.instance);
                if(term == null)
                  break Fail122;
                b_25 = term;
                term = map_1_0.instance.invoke(context, q_24, lifted21.instance);
                if(term == null)
                  break Fail122;
                term = termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{p_24}), b_25, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})});
                term = pp_aspectj_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail122;
                w_24 = term;
                term = map_1_0.instance.invoke(context, q_24, lifted22.instance);
                if(term == null)
                  break Fail122;
                x_24 = term;
                term = gen_synthetic_method_name_0_0.instance.invoke(context, p_24);
                if(term == null)
                  break Fail122;
                y_24 = term;
                term = termFactory.makeTuple(q_24, transform.constCons19);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail122;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName10, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{w_24}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId5, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{x_24})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{p_24}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0))}), (IStrategoList)transform.constCons20)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{y_24}), term, r_24}), s_24});
                if(true)
                  break Success109;
              }
              term = term112;
              term = closures_to_ajc_0_2_fragment_0.instance.invoke(context, term);
              if(term == null)
                break Fail119;
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

  @SuppressWarnings("all") public static class joinpoint_params_to_string_0_0 extends Strategy 
  { 
    public static joinpoint_params_to_string_0_0 instance = new joinpoint_params_to_string_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("joinpoint_params_to_string_0_0");
      Fail123:
      { 
        term = map_1_0.instance.invoke(context, term, lifted23.instance);
        if(term == null)
          break Fail123;
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail123;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class replace_proceed_calls_0_1 extends Strategy 
  { 
    public static replace_proceed_calls_0_1 instance = new replace_proceed_calls_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_27)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("replace_proceed_calls_0_1");
      Fail124:
      { 
        IStrategoTerm v_27 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consInvoke_2 != ((IStrategoAppl)term).getConstructor())
          break Fail124;
        IStrategoTerm arg83 = term.getSubterm(0);
        if(arg83.getTermType() != IStrategoTerm.APPL || transform._consMethod_1 != ((IStrategoAppl)arg83).getConstructor())
          break Fail124;
        IStrategoTerm arg84 = arg83.getSubterm(0);
        if(arg84.getTermType() != IStrategoTerm.APPL || transform._consMethodName_1 != ((IStrategoAppl)arg84).getConstructor())
          break Fail124;
        IStrategoTerm arg85 = arg84.getSubterm(0);
        if(arg85.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg85).getConstructor())
          break Fail124;
        IStrategoTerm arg86 = arg85.getSubterm(0);
        if(arg86.getTermType() != IStrategoTerm.STRING || !"proceed".equals(((IStrategoString)arg86).stringValue()))
          break Fail124;
        v_27 = term.getSubterm(1);
        term = primitive$To$Box$Object_0_0.instance.invoke(context, u_27);
        if(term == null)
          break Fail124;
        term = termFactory.makeAppl(transform._consCastRef_2, new IStrategoTerm[]{term, termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consNewArray_3, new IStrategoTerm[]{transform.constTypeName11, transform.constCons26, termFactory.makeAppl(transform._consArrayInit_1, new IStrategoTerm[]{v_27})}), (IStrategoList)transform.constNil0)})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class primitive$To$Box$Object_0_0 extends Strategy 
  { 
    public static primitive$To$Box$Object_0_0 instance = new primitive$To$Box$Object_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail125:
      { 
        IStrategoTerm y_27 = null;
        IStrategoTerm z_27 = null;
        IStrategoTerm a_28 = null;
        y_27 = term;
        a_28 = term;
        z_27 = y_27;
        term = a_28;
        IStrategoTerm term113 = term;
        Success110:
        { 
          Fail126:
          { 
            IStrategoTerm b_28 = null;
            b_28 = term;
            term = z_27;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
              break Fail126;
            term = b_28;
            { 
              term = transform.constClassOrInterfaceType3;
              if(true)
                break Success110;
            }
          }
          term = term113;
          IStrategoTerm term114 = term;
          Success111:
          { 
            Fail127:
            { 
              IStrategoTerm c_28 = null;
              c_28 = term;
              term = z_27;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                break Fail127;
              term = c_28;
              { 
                term = transform.constClassOrInterfaceType4;
                if(true)
                  break Success111;
              }
            }
            term = term114;
            IStrategoTerm term115 = term;
            Success112:
            { 
              Fail128:
              { 
                IStrategoTerm d_28 = null;
                d_28 = term;
                term = z_27;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail128;
                term = d_28;
                { 
                  term = transform.constClassOrInterfaceType5;
                  if(true)
                    break Success112;
                }
              }
              term = term115;
              IStrategoTerm term116 = term;
              Success113:
              { 
                Fail129:
                { 
                  IStrategoTerm e_28 = null;
                  e_28 = term;
                  term = z_27;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail129;
                  term = e_28;
                  { 
                    term = transform.constClassOrInterfaceType6;
                    if(true)
                      break Success113;
                  }
                }
                term = term116;
                IStrategoTerm term117 = term;
                Success114:
                { 
                  Fail130:
                  { 
                    IStrategoTerm f_28 = null;
                    f_28 = term;
                    term = z_27;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail130;
                    term = f_28;
                    { 
                      term = transform.constClassOrInterfaceType7;
                      if(true)
                        break Success114;
                    }
                  }
                  term = term117;
                  IStrategoTerm term118 = term;
                  Success115:
                  { 
                    Fail131:
                    { 
                      IStrategoTerm g_28 = null;
                      g_28 = term;
                      term = z_27;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail131;
                      term = g_28;
                      { 
                        term = transform.constClassOrInterfaceType8;
                        if(true)
                          break Success115;
                      }
                    }
                    term = term118;
                    Success116:
                    { 
                      Fail132:
                      { 
                        IStrategoTerm i_28 = null;
                        i_28 = term;
                        term = z_27;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail132;
                        term = i_28;
                        { 
                          term = transform.constClassOrInterfaceType9;
                          if(true)
                            break Success116;
                        }
                      }
                      term = y_27;
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
      context.push("primitiveToBoxObject_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_synthetic_method_name_0_0 extends Strategy 
  { 
    public static gen_synthetic_method_name_0_0 instance = new gen_synthetic_method_name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_synthetic_method_name_0_0");
      Fail133:
      { 
        IStrategoTerm l_28 = null;
        l_28 = term;
        term = next_random_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail133;
        term = abs_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail133;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail133;
        term = (IStrategoTerm)termFactory.makeListCons(l_28, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail133;
        term = debug_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail133;
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
      ITermFactory termFactory = context.getFactory();
      context.push("closures_to_java_0_0");
      Fail134:
      { 
        IStrategoTerm a_35 = null;
        IStrategoTerm b_35 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail134;
        a_35 = term.getSubterm(0);
        IStrategoTerm arg87 = term.getSubterm(1);
        if(arg87.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg87).getConstructor())
          break Fail134;
        b_35 = arg87.getSubterm(0);
        term = topdown_1_0.instance.invoke(context, b_35, lifted24.instance);
        if(term == null)
          break Fail134;
        term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{a_35, termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class closure_to_java_impl_0_0 extends Strategy 
  { 
    public static closure_to_java_impl_0_0 instance = new closure_to_java_impl_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closure_to_java_impl_0_0");
      Fail135:
      { 
        IStrategoTerm term120 = term;
        Success117:
        { 
          Fail136:
          { 
            IStrategoTerm h_35 = null;
            IStrategoTerm i_35 = null;
            TermReference j_35 = new TermReference();
            IStrategoTerm k_35 = null;
            IStrategoTerm l_35 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consClosureJoinpoints_4 != ((IStrategoAppl)term).getConstructor())
              break Fail136;
            l_35 = term.getSubterm(0);
            h_35 = term.getSubterm(1);
            i_35 = term.getSubterm(2);
            k_35 = term.getSubterm(3);
            term = l_35;
            lifted27 lifted270 = new lifted27();
            lifted26 lifted260 = new lifted26();
            lifted270.j_35 = j_35;
            lifted260.j_35 = j_35;
            term = or_2_0.instance.invoke(context, term, lifted260, lifted270);
            if(term == null)
              break Fail136;
            term = debug_0_0.instance.invoke(context, transform.const92);
            if(term == null)
              break Fail136;
            if(j_35.value == null)
              break Fail136;
            term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, transform.constClassOrInterfaceType10, transform.constNil0, termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons27, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{j_35.value}), h_35, transform.constNone0}), i_35}), (IStrategoList)transform.constNil0)})})}), transform.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{j_35.value})}), k_35});
            if(true)
              break Success117;
          }
          term = term120;
          IStrategoTerm e_35 = null;
          TermReference f_35 = new TermReference();
          IStrategoTerm g_35 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consShortClosureJoinpoints_2 != ((IStrategoAppl)term).getConstructor())
            break Fail135;
          g_35 = term.getSubterm(0);
          e_35 = term.getSubterm(1);
          term = g_35;
          lifted29 lifted290 = new lifted29();
          lifted28 lifted280 = new lifted28();
          lifted290.f_35 = f_35;
          lifted280.f_35 = f_35;
          term = or_2_0.instance.invoke(context, term, lifted280, lifted290);
          if(term == null)
            break Fail135;
          term = debug_0_0.instance.invoke(context, transform.const93);
          if(term == null)
            break Fail135;
          if(f_35.value == null)
            break Fail135;
          term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, transform.constClassOrInterfaceType10, transform.constNil0, termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons27, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{f_35.value}), transform.constNil0, transform.constNone0}), e_35}), (IStrategoList)transform.constNil0)})})}), transform.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{f_35.value})}), transform.constNil0});
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
      Fail137:
      { 
        term = handle_io_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail137;
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
      Fail138:
      { 
        IStrategoTerm o_35 = null;
        IStrategoTerm p_35 = null;
        IStrategoTerm q_35 = null;
        IStrategoTerm r_35 = null;
        IStrategoTerm t_35 = null;
        IStrategoTerm y_35 = null;
        IStrategoTerm v_35 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail138;
        o_35 = ((IStrategoList)term).tail();
        term = o_35;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail138;
        t_35 = ((IStrategoList)term).head();
        term = t_35;
        term = $Read$From$File_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail138;
        p_35 = term;
        term = o_35;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail138;
        y_35 = ((IStrategoList)term).tail();
        term = y_35;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail138;
        v_35 = ((IStrategoList)term).head();
        q_35 = v_35;
        term = convert_0_0.instance.invoke(context, p_35);
        if(term == null)
          break Fail138;
        term = pp_aspectj_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail138;
        r_35 = term;
        term = termFactory.makeTuple(q_35, transform.const94);
        term = fopen_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail138;
        term = termFactory.makeTuple(r_35, term);
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

  @SuppressWarnings("all") public static class convert_0_0 extends Strategy 
  { 
    public static convert_0_0 instance = new convert_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("convert_0_0");
      Fail139:
      { 
        term = try_1_0.instance.invoke(context, term, closures_converter_compilation_unit_0_0.instance);
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

  @SuppressWarnings("all") public static class closures_converter_compilation_unit_0_0 extends Strategy 
  { 
    public static closures_converter_compilation_unit_0_0 instance = new closures_converter_compilation_unit_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closures_converter_compilation_unit_0_0");
      Fail140:
      { 
        IStrategoTerm f_36 = null;
        IStrategoTerm g_36 = null;
        IStrategoTerm h_36 = null;
        IStrategoTerm i_36 = null;
        TermReference j_36 = new TermReference();
        IStrategoTerm k_36 = null;
        IStrategoTerm l_36 = null;
        IStrategoTerm q_36 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
          break Fail140;
        g_36 = term.getSubterm(0);
        h_36 = term.getSubterm(1);
        k_36 = term.getSubterm(2);
        q_36 = term;
        IStrategoTerm term121 = term;
        Success118:
        { 
          Fail141:
          { 
            IStrategoTerm term122 = term;
            Success119:
            { 
              Fail142:
              { 
                IStrategoTerm m_36 = null;
                IStrategoTerm r_36 = null;
                m_36 = term;
                term = SRTS_all.instance.invoke(context, k_36, lifted31.instance);
                if(term == null)
                  break Fail142;
                r_36 = term;
                f_36 = k_36;
                term = r_36;
                if(term != f_36 && !f_36.match(term))
                  break Fail142;
                term = m_36;
                { 
                  i_36 = h_36;
                  term = k_36;
                  l_36 = k_36;
                  if(true)
                    break Success119;
                }
              }
              term = term122;
              Success120:
              { 
                Fail143:
                { 
                  IStrategoTerm n_36 = null;
                  n_36 = term;
                  term = g_36;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail143;
                  IStrategoTerm arg94 = term.getSubterm(0);
                  if(arg94.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg94).getConstructor())
                    break Fail143;
                  term = n_36;
                  { 
                    term = g_36;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail141;
                    IStrategoTerm arg97 = term.getSubterm(0);
                    if(arg97.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg97).getConstructor())
                      break Fail141;
                    if(j_36.value == null)
                      j_36.value = arg97.getSubterm(1);
                    else
                      if(j_36.value != arg97.getSubterm(1) && !j_36.value.match(arg97.getSubterm(1)))
                        break Fail141;
                    if(true)
                      break Success120;
                  }
                }
                term = transform.constNone0;
                if(j_36.value == null)
                  j_36.value = term;
                else
                  if(j_36.value != term && !j_36.value.match(term))
                    break Fail141;
              }
              term = termFactory.makeTuple(h_36, transform.constCons39);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail141;
              i_36 = term;
              term = k_36;
              lifted33 lifted330 = new lifted33();
              lifted330.j_36 = j_36;
              term = SRTS_all.instance.invoke(context, term, lifted330);
              if(term == null)
                break Fail141;
              l_36 = term;
            }
            if(true)
              break Success118;
          }
          term = term121;
          IStrategoTerm o_36 = null;
          IStrategoTerm p_36 = null;
          IStrategoTerm u_36 = null;
          o_36 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail140;
          p_36 = term;
          u_36 = o_36;
          term = report_with_failure_0_2.instance.invoke(context, u_36, transform.const101, p_36);
          if(term == null)
            break Fail140;
        }
        term = q_36;
        if(i_36 == null || l_36 == null)
          break Fail140;
        term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{g_36, i_36, l_36});
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
      Fail144:
      { 
        IStrategoTerm term124 = term;
        IStrategoConstructor cons11 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success121:
        { 
          if(cons11 == transform._consClassDec_2)
          { 
            Fail145:
            { 
              IStrategoTerm h_37 = null;
              IStrategoTerm i_37 = null;
              IStrategoTerm j_37 = null;
              IStrategoTerm m_37 = null;
              h_37 = term.getSubterm(0);
              i_37 = term.getSubterm(1);
              m_37 = term;
              IStrategoTerm term125 = term;
              Success122:
              { 
                Fail146:
                { 
                  term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{h_37, i_37});
                  term = topdown_1_0.instance.invoke(context, term, lifted35.instance);
                  if(term == null)
                    break Fail146;
                  j_37 = term;
                  if(true)
                    break Success122;
                }
                term = term125;
                IStrategoTerm k_37 = null;
                IStrategoTerm l_37 = null;
                IStrategoTerm o_37 = null;
                k_37 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail145;
                l_37 = term;
                o_37 = k_37;
                term = report_with_failure_0_2.instance.invoke(context, o_37, transform.const102, l_37);
                if(term == null)
                  break Fail145;
              }
              term = m_37;
              if(j_37 == null)
                break Fail145;
              term = j_37;
              if(true)
                break Success121;
            }
            term = term124;
          }
          if(cons11 == transform._consAspectDec_2)
          { 
            IStrategoTerm x_36 = null;
            IStrategoTerm y_36 = null;
            IStrategoTerm z_36 = null;
            IStrategoTerm c_37 = null;
            x_36 = term.getSubterm(0);
            y_36 = term.getSubterm(1);
            c_37 = term;
            IStrategoTerm term127 = term;
            Success123:
            { 
              Fail147:
              { 
                term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{x_36, y_36});
                term = topdown_1_0.instance.invoke(context, term, lifted37.instance);
                if(term == null)
                  break Fail147;
                z_36 = term;
                if(true)
                  break Success123;
              }
              term = term127;
              IStrategoTerm a_37 = null;
              IStrategoTerm b_37 = null;
              IStrategoTerm e_37 = null;
              a_37 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail144;
              b_37 = term;
              e_37 = a_37;
              term = report_with_failure_0_2.instance.invoke(context, e_37, transform.const102, b_37);
              if(term == null)
                break Fail144;
            }
            term = c_37;
            if(z_36 == null)
              break Fail144;
            term = z_36;
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

  @SuppressWarnings("all") public static class closures_converter_aspect_or_class_0_1 extends Strategy 
  { 
    public static closures_converter_aspect_or_class_0_1 instance = new closures_converter_aspect_or_class_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_45)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closures_converter_aspect_or_class_0_1");
      Fail148:
      { 
        IStrategoTerm term128 = term;
        IStrategoConstructor cons12 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success124:
        { 
          if(cons12 == transform._consAspectDec_2)
          { 
            Fail149:
            { 
              IStrategoTerm d_38 = null;
              IStrategoTerm e_38 = null;
              IStrategoTerm f_38 = null;
              IStrategoTerm i_38 = null;
              d_38 = term.getSubterm(0);
              e_38 = term.getSubterm(1);
              i_38 = term;
              IStrategoTerm term129 = term;
              Success125:
              { 
                Fail150:
                { 
                  term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{d_38, e_38});
                  term = closures_to_ajc_0_1.instance.invoke(context, term, x_45);
                  if(term == null)
                    break Fail150;
                  f_38 = term;
                  if(true)
                    break Success125;
                }
                term = term129;
                IStrategoTerm g_38 = null;
                IStrategoTerm h_38 = null;
                IStrategoTerm k_38 = null;
                g_38 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail149;
                h_38 = term;
                k_38 = g_38;
                term = report_with_failure_0_2.instance.invoke(context, k_38, transform.const103, h_38);
                if(term == null)
                  break Fail149;
              }
              term = i_38;
              if(f_38 == null)
                break Fail149;
              term = f_38;
              if(true)
                break Success124;
            }
            term = term128;
          }
          if(cons12 == transform._consClassDec_2)
          { 
            IStrategoTerm s_37 = null;
            IStrategoTerm t_37 = null;
            IStrategoTerm u_37 = null;
            IStrategoTerm x_37 = null;
            s_37 = term.getSubterm(0);
            t_37 = term.getSubterm(1);
            x_37 = term;
            IStrategoTerm term130 = term;
            Success126:
            { 
              Fail151:
              { 
                term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{s_37, t_37});
                term = closures_to_java_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail151;
                u_37 = term;
                if(true)
                  break Success126;
              }
              term = term130;
              IStrategoTerm v_37 = null;
              IStrategoTerm w_37 = null;
              IStrategoTerm z_37 = null;
              v_37 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail148;
              w_37 = term;
              z_37 = v_37;
              term = report_with_failure_0_2.instance.invoke(context, z_37, transform.const103, w_37);
              if(term == null)
                break Fail148;
            }
            term = x_37;
            if(u_37 == null)
              break Fail148;
            term = u_37;
          }
          else
          { 
            break Fail148;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_39, Strategy o_39)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("OrComp_2_0");
      Fail152:
      { 
        IStrategoTerm v_175 = null;
        IStrategoTerm t_175 = null;
        IStrategoTerm u_175 = null;
        IStrategoTerm w_175 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail152;
        t_175 = term.getSubterm(0);
        u_175 = term.getSubterm(1);
        IStrategoList annos0 = term.getAnnotations();
        v_175 = annos0;
        term = n_39.invoke(context, t_175);
        if(term == null)
          break Fail152;
        w_175 = term;
        term = o_39.invoke(context, u_175);
        if(term == null)
          break Fail152;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{w_175, term}), checkListAnnos(termFactory, v_175));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_39, Strategy q_39)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("AndComp_2_0");
      Fail153:
      { 
        IStrategoTerm a_176 = null;
        IStrategoTerm y_175 = null;
        IStrategoTerm z_175 = null;
        IStrategoTerm b_176 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail153;
        y_175 = term.getSubterm(0);
        z_175 = term.getSubterm(1);
        IStrategoList annos1 = term.getAnnotations();
        a_176 = annos1;
        term = p_39.invoke(context, y_175);
        if(term == null)
          break Fail153;
        b_176 = term;
        term = q_39.invoke(context, z_175);
        if(term == null)
          break Fail153;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{b_176, term}), checkListAnnos(termFactory, a_176));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_39)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("NotComp_1_0");
      Fail154:
      { 
        IStrategoTerm e_176 = null;
        IStrategoTerm d_176 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotComp_1 != ((IStrategoAppl)term).getConstructor())
          break Fail154;
        d_176 = term.getSubterm(0);
        IStrategoList annos2 = term.getAnnotations();
        e_176 = annos2;
        term = r_39.invoke(context, d_176);
        if(term == null)
          break Fail154;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consNotComp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_176));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted37 extends Strategy 
  { 
    public static final lifted37 instance = new lifted37();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail155:
      { 
        term = try_1_0.instance.invoke(context, term, remove_closures_additions_0_0.instance);
        if(term == null)
          break Fail155;
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
      Fail156:
      { 
        term = try_1_0.instance.invoke(context, term, lifted36.instance);
        if(term == null)
          break Fail156;
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
      Fail157:
      { 
        IStrategoTerm term126 = term;
        IStrategoConstructor cons13 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success127:
        { 
          if(cons13 == transform._consShortClosureJoinpoints_2)
          { 
            Fail158:
            { 
              term = transform.constNone0;
              if(true)
                break Success127;
            }
            term = term126;
          }
          if(cons13 == transform._consClosureJoinpoints_4)
          { 
            term = transform.constNone0;
          }
          else
          { 
            break Fail157;
          }
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted33 extends Strategy 
  { 
    TermReference j_36;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail159:
      { 
        lifted34 lifted340 = new lifted34();
        lifted340.j_36 = j_36;
        term = try_1_0.instance.invoke(context, term, lifted340);
        if(term == null)
          break Fail159;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted34 extends Strategy 
  { 
    TermReference j_36;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail160:
      { 
        term = closures_converter_aspect_or_class_0_1.instance.invoke(context, term, j_36.value);
        if(term == null)
          break Fail160;
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
      Fail161:
      { 
        term = try_1_0.instance.invoke(context, term, check_for_change_in_aspect_or_class_0_0.instance);
        if(term == null)
          break Fail161;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted29 extends Strategy 
  { 
    TermReference f_35;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail162:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
          break Fail162;
        IStrategoTerm arg93 = term.getSubterm(1);
        if(arg93.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg93).getConstructor())
          break Fail162;
        if(f_35.value == null)
          f_35.value = arg93.getSubterm(0);
        else
          if(f_35.value != arg93.getSubterm(0) && !f_35.value.match(arg93.getSubterm(0)))
            break Fail162;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted28 extends Strategy 
  { 
    TermReference f_35;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail163:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail163;
        IStrategoTerm arg91 = term.getSubterm(0);
        if(arg91.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg91).getConstructor())
          break Fail163;
        if(f_35.value == null)
          f_35.value = arg91.getSubterm(0);
        else
          if(f_35.value != arg91.getSubterm(0) && !f_35.value.match(arg91.getSubterm(0)))
            break Fail163;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted27 extends Strategy 
  { 
    TermReference j_35;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail164:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
          break Fail164;
        IStrategoTerm arg90 = term.getSubterm(1);
        if(arg90.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg90).getConstructor())
          break Fail164;
        if(j_35.value == null)
          j_35.value = arg90.getSubterm(0);
        else
          if(j_35.value != arg90.getSubterm(0) && !j_35.value.match(arg90.getSubterm(0)))
            break Fail164;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted26 extends Strategy 
  { 
    TermReference j_35;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail165:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail165;
        IStrategoTerm arg88 = term.getSubterm(0);
        if(arg88.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg88).getConstructor())
          break Fail165;
        if(j_35.value == null)
          j_35.value = arg88.getSubterm(0);
        else
          if(j_35.value != arg88.getSubterm(0) && !j_35.value.match(arg88.getSubterm(0)))
            break Fail165;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted24 extends Strategy 
  { 
    public static final lifted24 instance = new lifted24();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail166:
      { 
        term = try_1_0.instance.invoke(context, term, closure_to_java_impl_0_0.instance);
        if(term == null)
          break Fail166;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted23 extends Strategy 
  { 
    public static final lifted23 instance = new lifted23();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail167:
      { 
        IStrategoTerm o_27 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail167;
        o_27 = term.getSubterm(1);
        term = pp_java5_to_string_0_0.instance.invoke(context, o_27);
        if(term == null)
          break Fail167;
        term = termFactory.makeTuple(transform.const83, term);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail167;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted22 extends Strategy 
  { 
    public static final lifted22 instance = new lifted22();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail168:
      { 
        IStrategoTerm v_24 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail168;
        v_24 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, v_24);
        if(term == null)
          break Fail168;
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClass_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted21 extends Strategy 
  { 
    public static final lifted21 instance = new lifted21();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail169:
      { 
        IStrategoTerm u_24 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail169;
        u_24 = term.getSubterm(2);
        term = pp_aspectj_string_0_0.instance.invoke(context, u_24);
        if(term == null)
          break Fail169;
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), transform.constNone0});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted20 extends Strategy 
  { 
    public static final lifted20 instance = new lifted20();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail170:
      { 
        IStrategoTerm t_24 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail170;
        t_24 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, t_24);
        if(term == null)
          break Fail170;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted18 extends Strategy 
  { 
    TermReference w_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail171:
      { 
        lifted19 lifted190 = new lifted19();
        lifted190.w_25 = w_25;
        term = try_1_0.instance.invoke(context, term, lifted190);
        if(term == null)
          break Fail171;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted19 extends Strategy 
  { 
    TermReference w_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail172:
      { 
        term = replace_proceed_calls_0_1.instance.invoke(context, term, w_25.value);
        if(term == null)
          break Fail172;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted17 extends Strategy 
  { 
    public static final lifted17 instance = new lifted17();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail173:
      { 
        IStrategoTerm a_26 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail173;
        a_26 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, a_26);
        if(term == null)
          break Fail173;
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClass_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})})})});
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
      ITermFactory termFactory = context.getFactory();
      Fail174:
      { 
        IStrategoTerm z_25 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail174;
        z_25 = term.getSubterm(2);
        term = pp_aspectj_string_0_0.instance.invoke(context, z_25);
        if(term == null)
          break Fail174;
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), transform.constNone0});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted15 extends Strategy 
  { 
    public static final lifted15 instance = new lifted15();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail175:
      { 
        IStrategoTerm y_25 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail175;
        y_25 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, y_25);
        if(term == null)
          break Fail175;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted14 extends Strategy 
  { 
    public static final lifted14 instance = new lifted14();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail176:
      { 
        IStrategoTerm r_21 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail176;
        r_21 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, r_21);
        if(term == null)
          break Fail176;
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClass_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted13 extends Strategy 
  { 
    public static final lifted13 instance = new lifted13();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail177:
      { 
        IStrategoTerm p_21 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail177;
        p_21 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, p_21);
        if(term == null)
          break Fail177;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
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
      ITermFactory termFactory = context.getFactory();
      Fail178:
      { 
        IStrategoTerm s_22 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail178;
        s_22 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, s_22);
        if(term == null)
          break Fail178;
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClass_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})})})});
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
      Fail179:
      { 
        IStrategoTerm q_22 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail179;
        q_22 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, q_22);
        if(term == null)
          break Fail179;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
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
      Fail180:
      { 
        IStrategoTerm s_23 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail180;
        s_23 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, s_23);
        if(term == null)
          break Fail180;
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClass_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})})})});
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
      Fail181:
      { 
        IStrategoTerm r_23 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail181;
        r_23 = term.getSubterm(2);
        term = pp_aspectj_string_0_0.instance.invoke(context, r_23);
        if(term == null)
          break Fail181;
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), transform.constNone0});
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
      Fail182:
      { 
        IStrategoTerm q_23 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail182;
        q_23 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, q_23);
        if(term == null)
          break Fail182;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
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
      Fail183:
      { 
        term = try_1_0.instance.invoke(context, term, closure_to_java_impl_0_0.instance);
        if(term == null)
          break Fail183;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted4 extends Strategy 
  { 
    TermReference c_21;

    TermReference d_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail184:
      { 
        lifted5 lifted50 = new lifted5();
        lifted50.c_21 = c_21;
        lifted50.d_21 = d_21;
        term = try_1_0.instance.invoke(context, term, lifted50);
        if(term == null)
          break Fail184;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted5 extends Strategy 
  { 
    TermReference c_21;

    TermReference d_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail185:
      { 
        term = closures_to_ajc_0_2.instance.invoke(context, term, c_21.value, d_21.value);
        if(term == null)
          break Fail185;
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
      Fail186:
      { 
        IStrategoTerm term104 = term;
        Success128:
        { 
          Fail187:
          { 
            term = aspectj_to_box_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail187;
            if(true)
              break Success128;
          }
          term = java_to_box_0_0.instance.invoke(context, term104);
          if(term == null)
            break Fail186;
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class t_20 extends Strategy 
  { 
    public static final t_20 instance = new t_20();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail188:
      { 
        IStrategoTerm term101 = term;
        Success129:
        { 
          Fail189:
          { 
            term = $Not$Comp_1_0.instance.invoke(context, term, _Id.instance);
            if(term == null)
              break Fail189;
            if(true)
              break Success129;
          }
          term = term101;
          IStrategoTerm term102 = term;
          Success130:
          { 
            Fail190:
            { 
              term = $And$Comp_2_0.instance.invoke(context, term, this, _Id.instance);
              if(term == null)
                break Fail190;
              if(true)
                break Success130;
            }
            term = $Or$Comp_2_0.instance.invoke(context, term102, this, _Id.instance);
            if(term == null)
              break Fail188;
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
      varScope.addSVar("closures_to_ajc_0_2_fragment_0", new InteropSDefT(closures_to_ajc_0_2_fragment_0.instance, context));
      varScope.addSVar("closures_to_ajc_0_2", new InteropSDefT(closures_to_ajc_0_2.instance, context));
      varScope.addSVar("joinpoint_params_to_string_0_0", new InteropSDefT(joinpoint_params_to_string_0_0.instance, context));
      varScope.addSVar("replace_proceed_calls_0_1", new InteropSDefT(replace_proceed_calls_0_1.instance, context));
      varScope.addSVar("primitiveToBoxObject_0_0", new InteropSDefT(primitive$To$Box$Object_0_0.instance, context));
      varScope.addSVar("gen_synthetic_method_name_0_0", new InteropSDefT(gen_synthetic_method_name_0_0.instance, context));
      varScope.addSVar("closures_to_java_0_0", new InteropSDefT(closures_to_java_0_0.instance, context));
      varScope.addSVar("closure_to_java_impl_0_0", new InteropSDefT(closure_to_java_impl_0_0.instance, context));
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
      varScope.addSVar("closures_to_ajc_0_2_fragment_0", new InteropSDefT(classLoader, "transform$closures_to_ajc_0_2_fragment_0", context));
      varScope.addSVar("closures_to_ajc_0_2", new InteropSDefT(classLoader, "transform$closures_to_ajc_0_2", context));
      varScope.addSVar("joinpoint_params_to_string_0_0", new InteropSDefT(classLoader, "transform$joinpoint_params_to_string_0_0", context));
      varScope.addSVar("replace_proceed_calls_0_1", new InteropSDefT(classLoader, "transform$replace_proceed_calls_0_1", context));
      varScope.addSVar("primitiveToBoxObject_0_0", new InteropSDefT(classLoader, "transform$primitive$To$Box$Object_0_0", context));
      varScope.addSVar("gen_synthetic_method_name_0_0", new InteropSDefT(classLoader, "transform$gen_synthetic_method_name_0_0", context));
      varScope.addSVar("closures_to_java_0_0", new InteropSDefT(classLoader, "transform$closures_to_java_0_0", context));
      varScope.addSVar("closure_to_java_impl_0_0", new InteropSDefT(classLoader, "transform$closure_to_java_impl_0_0", context));
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
