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

@SuppressWarnings("all") public class transform  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm const105;

  protected static IStrategoTerm const104;

  protected static IStrategoTerm const103;

  protected static IStrategoTerm constCons39;

  protected static IStrategoTerm constTypeImportOnDemandDec2;

  protected static IStrategoTerm constPackageName2;

  protected static IStrategoTerm constCons38;

  protected static IStrategoTerm constId33;

  protected static IStrategoTerm const102;

  protected static IStrategoTerm constCons37;

  protected static IStrategoTerm constId32;

  protected static IStrategoTerm const101;

  protected static IStrategoTerm constCons36;

  protected static IStrategoTerm constTypeImportOnDemandDec1;

  protected static IStrategoTerm constPackageName1;

  protected static IStrategoTerm constCons35;

  protected static IStrategoTerm constCons34;

  protected static IStrategoTerm constCons33;

  protected static IStrategoTerm constCons32;

  protected static IStrategoTerm constId31;

  protected static IStrategoTerm const100;

  protected static IStrategoTerm constCons31;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons30;

  protected static IStrategoTerm constId30;

  protected static IStrategoTerm const99;

  protected static IStrategoTerm constCons29;

  protected static IStrategoTerm constId29;

  protected static IStrategoTerm const98;

  protected static IStrategoTerm constCons28;

  protected static IStrategoTerm constId28;

  protected static IStrategoTerm const97;

  public static IStrategoTerm getCjpTbl()
  { 
    return constCjpTbl;
  }

  protected static ImportTerm constCjpTbl;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm constCons27;

  protected static IStrategoTerm constMarkerAnno1;

  protected static IStrategoTerm constClassOrInterfaceType10;

  protected static IStrategoTerm constTypeName19;

  protected static IStrategoTerm constId27;

  protected static IStrategoTerm const93;

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
          org.strategoxt.stratego_sglr.Main.init(context);
          context.registerComponent("cjp");
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
    catch(StrategoErrorExit exit)
    { 
      context.setStandAlone(false);
      System.err.println(exit.getLocalizedMessage());
      System.exit(exit.getValue());
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
    constSOpt0 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{cjp.constHS0, cjp.const0});
    constCons0 = (IStrategoTerm)termFactory.makeListCons(cjp.constSOpt0, (IStrategoList)cjp.constNil0);
    const1 = termFactory.makeString(")");
    constS0 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const1});
    constCons1 = (IStrategoTerm)termFactory.makeListCons(cjp.constS0, (IStrategoList)cjp.constNil0);
    const2 = termFactory.makeString("(");
    constS1 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const2});
    constKW0 = termFactory.makeAppl(transform._consKW_0, NO_TERMS);
    const3 = termFactory.makeString("initialization");
    constS2 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const3});
    constFBOX0 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS2});
    const4 = termFactory.makeString("preinitialization");
    constS3 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const4});
    constFBOX1 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS3});
    const5 = termFactory.makeString("staticinitialization");
    constS4 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const5});
    constFBOX2 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS4});
    const6 = termFactory.makeString("get");
    constS5 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const6});
    constFBOX3 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS5});
    const7 = termFactory.makeString("set");
    constS6 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const7});
    constFBOX4 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS6});
    const8 = termFactory.makeString("handler");
    constS7 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const8});
    constFBOX5 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS7});
    constCons2 = (IStrategoTerm)termFactory.makeListCons(cjp.constS1, (IStrategoList)cjp.constCons1);
    const9 = termFactory.makeString("adviceexecution");
    constS8 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const9});
    constFBOX6 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS8});
    constCons3 = (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX6, (IStrategoList)cjp.constCons2);
    constH0 = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, cjp.constCons3});
    const10 = termFactory.makeString("within");
    constS9 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const10});
    constFBOX7 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS9});
    const11 = termFactory.makeString("withincode");
    constS10 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const11});
    constFBOX8 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS10});
    const12 = termFactory.makeString("cflow");
    constS11 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const12});
    constFBOX9 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS11});
    const13 = termFactory.makeString("cflowbelow");
    constS12 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const13});
    constFBOX10 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS12});
    const14 = termFactory.makeString("if");
    constS13 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const14});
    constFBOX11 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS13});
    const15 = termFactory.makeString("this");
    constS14 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const15});
    constFBOX12 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS14});
    const16 = termFactory.makeString("target");
    constS15 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const16});
    constFBOX13 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS15});
    const17 = termFactory.makeString("args");
    constS16 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const17});
    constFBOX14 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS16});
    const18 = termFactory.makeString("@this");
    constS17 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const18});
    const19 = termFactory.makeString("@target");
    constS18 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const19});
    const20 = termFactory.makeString("@within");
    constS19 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const20});
    const21 = termFactory.makeString("@withincode");
    constS20 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const21});
    const22 = termFactory.makeString("@annotation");
    constS21 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const22});
    const23 = termFactory.makeString("@args");
    constS22 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const23});
    const24 = termFactory.makeString(".");
    constS23 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const24});
    const25 = termFactory.makeString("1");
    constSOpt1 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{cjp.constHS0, cjp.const25});
    constCons4 = (IStrategoTerm)termFactory.makeListCons(cjp.constSOpt1, (IStrategoList)cjp.constNil0);
    const26 = termFactory.makeString("pointcut");
    constS24 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const26});
    constFBOX15 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS24});
    const27 = termFactory.makeString(";");
    constS25 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const27});
    constCons5 = (IStrategoTerm)termFactory.makeListCons(cjp.constS25, (IStrategoList)cjp.constNil0);
    const28 = termFactory.makeString(":");
    constS26 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const28});
    constFBOX16 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS25});
    const29 = termFactory.makeString("+");
    constS27 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const29});
    constCons6 = (IStrategoTerm)termFactory.makeListCons(cjp.constS27, (IStrategoList)cjp.constNil0);
    constFBOX17 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS23});
    const30 = termFactory.makeString("..");
    constS28 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const30});
    constFBOX18 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS28});
    const31 = termFactory.makeString("...");
    constS29 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const31});
    constCons7 = (IStrategoTerm)termFactory.makeListCons(cjp.constS29, (IStrategoList)cjp.constNil0);
    const32 = termFactory.makeString("*");
    constS30 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const32});
    const33 = termFactory.makeString("new");
    constS31 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const33});
    constFBOX19 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS31});
    constCons8 = (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX19, (IStrategoList)cjp.constNil0);
    constCons9 = (IStrategoTerm)termFactory.makeListCons(cjp.constS23, (IStrategoList)cjp.constCons8);
    constCons10 = (IStrategoTerm)termFactory.makeListCons(cjp.constS28, (IStrategoList)cjp.constCons8);
    const34 = termFactory.makeString("!");
    constS32 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const34});
    const35 = termFactory.makeString("throws");
    constS33 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const35});
    constFBOX20 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS33});
    const36 = termFactory.makeString("@");
    constS34 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const36});
    const37 = termFactory.makeString("&&");
    constS35 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const37});
    const38 = termFactory.makeString("||");
    constS36 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const38});
    constVS0 = termFactory.makeAppl(transform._consVS_0, NO_TERMS);
    constSOpt2 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{cjp.constVS0, cjp.const0});
    constCons11 = (IStrategoTerm)termFactory.makeListCons(cjp.constSOpt2, (IStrategoList)cjp.constNil0);
    constFBOX21 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS26});
    constFBOX22 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS0});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX22, (IStrategoList)cjp.constNil0);
    constFBOX23 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS1});
    const39 = termFactory.makeString("before");
    constS37 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const39});
    constFBOX24 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS37});
    const40 = termFactory.makeString("after");
    constS38 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const40});
    constFBOX25 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS38});
    const41 = termFactory.makeString("around");
    constS39 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const41});
    constFBOX26 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS39});
    const42 = termFactory.makeString("returning");
    constS40 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const42});
    constFBOX27 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS40});
    const43 = termFactory.makeString("throwing");
    constS41 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const43});
    constFBOX28 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS41});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX16, (IStrategoList)cjp.constNil0);
    const44 = termFactory.makeString("parents");
    constS42 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const44});
    constFBOX29 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS42});
    const45 = termFactory.makeString("declare");
    constS43 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const45});
    constFBOX30 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS43});
    const46 = termFactory.makeString("warning");
    constS44 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const46});
    constFBOX31 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS44});
    const47 = termFactory.makeString("error");
    constS45 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const47});
    constFBOX32 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS45});
    const48 = termFactory.makeString("soft");
    constS46 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const48});
    constFBOX33 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS46});
    const49 = termFactory.makeString("precedence");
    constS47 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const49});
    constFBOX34 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS47});
    const50 = termFactory.makeString("@type");
    constS48 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const50});
    const51 = termFactory.makeString("@constructor");
    constS49 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const51});
    const52 = termFactory.makeString("@method");
    constS50 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const52});
    const53 = termFactory.makeString("@field");
    constS51 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const53});
    const54 = termFactory.makeString("aspect");
    constS52 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const54});
    constFBOX35 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS52});
    const55 = termFactory.makeString("pertarget");
    constS53 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const55});
    constFBOX36 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS53});
    const56 = termFactory.makeString("perthis");
    constS54 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const56});
    constFBOX37 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS54});
    const57 = termFactory.makeString("percflow");
    constS55 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const57});
    constFBOX38 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS55});
    const58 = termFactory.makeString("percflowbelow");
    constS56 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const58});
    constFBOX39 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS56});
    const59 = termFactory.makeString("pertypewithin");
    constS57 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const59});
    constFBOX40 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS57});
    const60 = termFactory.makeString("issingleton");
    constS58 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const60});
    constFBOX41 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS58});
    const61 = termFactory.makeString("}");
    constS59 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const61});
    constFBOX42 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS59});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX42, (IStrategoList)cjp.constNil0);
    constIS0 = termFactory.makeAppl(transform._consIS_0, NO_TERMS);
    const62 = termFactory.makeString("2");
    constSOpt3 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{cjp.constIS0, cjp.const62});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(cjp.constSOpt3, (IStrategoList)cjp.constNil0);
    constCons16 = (IStrategoTerm)termFactory.makeListCons(cjp.constSOpt2, (IStrategoList)cjp.constCons15);
    constSOpt4 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{cjp.constVS0, cjp.const25});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(cjp.constSOpt4, (IStrategoList)cjp.constNil0);
    const63 = termFactory.makeString("{");
    constS60 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const63});
    constFBOX43 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS60});
    const64 = termFactory.makeString("privileged");
    constS61 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const64});
    constFBOX44 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS61});
    const65 = termFactory.makeString("proceed");
    constS62 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const65});
    constFBOX45 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS62});
    const66 = termFactory.makeString("call");
    constS63 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const66});
    constFBOX46 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS63});
    const67 = termFactory.makeString("execution");
    constS64 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cjp.const67});
    constFBOX47 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cjp.constKW0, cjp.constS64});
    const68 = termFactory.makeInt(80);
    constNone0 = termFactory.makeAppl(transform._consNone_0, NO_TERMS);
    const69 = termFactory.makeString("Closure");
    constId0 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const69});
    constTypeName0 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId0});
    constSimpleAnnoPatternExact0 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{cjp.constTypeName0});
    constCons18 = (IStrategoTerm)termFactory.makeListCons(cjp.constSimpleAnnoPatternExact0, (IStrategoList)cjp.constNil0);
    constAnnoPattern0 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{cjp.constCons18});
    constModPattern0 = termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{cjp.constNil0});
    constNamePattern0 = termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{cjp.const32});
    constRefTypePattern0 = termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{cjp.constNamePattern0});
    const70 = termFactory.makeString("JoinPoint");
    constId1 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const70});
    constTypeName1 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId1});
    constClassOrInterfaceType0 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cjp.constTypeName1, cjp.constNone0});
    const71 = termFactory.makeString("thisJoinPoint");
    constId2 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const71});
    constParam0 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cjp.constNil0, cjp.constClassOrInterfaceType0, cjp.constId2});
    constCons19 = (IStrategoTerm)termFactory.makeListCons(cjp.constParam0, (IStrategoList)cjp.constNil0);
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons20 = (IStrategoTerm)termFactory.makeListCons(cjp.constPublic0, (IStrategoList)cjp.constNil0);
    const72 = termFactory.makeString("JoinpointSignature");
    constId3 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const72});
    constTypeName2 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId3});
    const73 = termFactory.makeString("name");
    constId4 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const73});
    constId5 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const17});
    const74 = termFactory.makeString("After");
    constId6 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const74});
    constTypeName3 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId6});
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    const75 = termFactory.makeString("AfterReturning");
    constId7 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const75});
    constTypeName4 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId7});
    constId8 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const42});
    constId9 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const26});
    const76 = termFactory.makeString("AfterThrowing");
    constId10 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const76});
    constTypeName5 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId10});
    constId11 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const43});
    const77 = termFactory.makeString("Joinpoint");
    constId12 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const77});
    constTypeName6 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId12});
    constMarkerAnno0 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{cjp.constTypeName6});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(cjp.constMarkerAnno0, (IStrategoList)cjp.constNil0);
    constStatic0 = termFactory.makeAppl(transform._consStatic_0, NO_TERMS);
    constCons22 = (IStrategoTerm)termFactory.makeListCons(cjp.constStatic0, (IStrategoList)cjp.constCons21);
    constPrivate0 = termFactory.makeAppl(transform._consPrivate_0, NO_TERMS);
    constCons23 = (IStrategoTerm)termFactory.makeListCons(cjp.constPrivate0, (IStrategoList)cjp.constCons22);
    const78 = termFactory.makeString("UnsupportedOperationException");
    constId13 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const78});
    constTypeName7 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId13});
    constClassOrInterfaceType1 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cjp.constTypeName7, cjp.constNone0});
    constNewInstance0 = termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{cjp.constNone0, cjp.constClassOrInterfaceType1, cjp.constNil0, cjp.constNone0});
    constThrow0 = termFactory.makeAppl(transform._consThrow_1, new IStrategoTerm[]{cjp.constNewInstance0});
    constCons24 = (IStrategoTerm)termFactory.makeListCons(cjp.constThrow0, (IStrategoList)cjp.constNil0);
    constBlock0 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{cjp.constCons24});
    const79 = termFactory.makeString("ProceedingJoinPoint");
    constId14 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const79});
    constTypeName8 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId14});
    constClassOrInterfaceType2 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cjp.constTypeName8, cjp.constNone0});
    const80 = termFactory.makeString("pjp");
    constId15 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const80});
    constParam1 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cjp.constNil0, cjp.constClassOrInterfaceType2, cjp.constId15});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(cjp.constParam1, (IStrategoList)cjp.constCons19);
    const81 = termFactory.makeString("Around");
    constId16 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const81});
    constTypeName9 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId16});
    const82 = termFactory.makeString("Before");
    constId17 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const82});
    constTypeName10 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId17});
    const83 = termFactory.makeString(",");
    constAmbName0 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{cjp.constId15});
    constId18 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const65});
    constMethodName0 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cjp.constAmbName0, cjp.constId18});
    constMethod0 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cjp.constMethodName0});
    const84 = termFactory.makeString("Object");
    constId19 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const84});
    constTypeName11 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId19});
    constDim0 = termFactory.makeAppl(transform._consDim_0, NO_TERMS);
    constCons26 = (IStrategoTerm)termFactory.makeListCons(cjp.constDim0, (IStrategoList)cjp.constNil0);
    const85 = termFactory.makeString("Integer");
    constId20 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const85});
    constTypeName12 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId20});
    constClassOrInterfaceType3 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cjp.constTypeName12, cjp.constNone0});
    const86 = termFactory.makeString("Long");
    constId21 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const86});
    constTypeName13 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId21});
    constClassOrInterfaceType4 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cjp.constTypeName13, cjp.constNone0});
    const87 = termFactory.makeString("Short");
    constId22 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const87});
    constTypeName14 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId22});
    constClassOrInterfaceType5 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cjp.constTypeName14, cjp.constNone0});
    const88 = termFactory.makeString("Byte");
    constId23 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const88});
    constTypeName15 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId23});
    constClassOrInterfaceType6 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cjp.constTypeName15, cjp.constNone0});
    const89 = termFactory.makeString("Double");
    constId24 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const89});
    constTypeName16 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId24});
    constClassOrInterfaceType7 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cjp.constTypeName16, cjp.constNone0});
    const90 = termFactory.makeString("Float");
    constId25 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const90});
    constTypeName17 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId25});
    constClassOrInterfaceType8 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cjp.constTypeName17, cjp.constNone0});
    const91 = termFactory.makeString("Boolean");
    constId26 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const91});
    constTypeName18 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId26});
    constClassOrInterfaceType9 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cjp.constTypeName18, cjp.constNone0});
    const92 = termFactory.makeString("in closures..");
    const93 = termFactory.makeString("JoinpointWrapper");
    constId27 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const93});
    constTypeName19 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cjp.constId27});
    constClassOrInterfaceType10 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cjp.constTypeName19, cjp.constNone0});
    constMarkerAnno1 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{cjp.constTypeName0});
    constCons27 = (IStrategoTerm)termFactory.makeListCons(cjp.constMarkerAnno1, (IStrategoList)cjp.constCons20);
    const94 = termFactory.makeString("src");
    const95 = termFactory.makeString("generated");
    const96 = termFactory.makeString("w");
    constCjpTbl = new ImportTerm(termFactory, cjp.class, "/cjp/", "cjp.tbl");
    const97 = termFactory.makeString("lang");
    constId28 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const97});
    constCons28 = (IStrategoTerm)termFactory.makeListCons(cjp.constId28, (IStrategoList)cjp.constNil0);
    const98 = termFactory.makeString("aspectj");
    constId29 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const98});
    constCons29 = (IStrategoTerm)termFactory.makeListCons(cjp.constId29, (IStrategoList)cjp.constCons28);
    const99 = termFactory.makeString("org");
    constId30 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const99});
    constCons30 = (IStrategoTerm)termFactory.makeListCons(cjp.constId30, (IStrategoList)cjp.constCons29);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{cjp.constCons30});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{cjp.constPackageName0});
    constCons31 = (IStrategoTerm)termFactory.makeListCons(cjp.constTypeImportOnDemandDec0, (IStrategoList)cjp.constNil0);
    const100 = termFactory.makeString("annotation");
    constId31 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const100});
    constCons32 = (IStrategoTerm)termFactory.makeListCons(cjp.constId31, (IStrategoList)cjp.constNil0);
    constCons33 = (IStrategoTerm)termFactory.makeListCons(cjp.constId28, (IStrategoList)cjp.constCons32);
    constCons34 = (IStrategoTerm)termFactory.makeListCons(cjp.constId29, (IStrategoList)cjp.constCons33);
    constCons35 = (IStrategoTerm)termFactory.makeListCons(cjp.constId30, (IStrategoList)cjp.constCons34);
    constPackageName1 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{cjp.constCons35});
    constTypeImportOnDemandDec1 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{cjp.constPackageName1});
    constCons36 = (IStrategoTerm)termFactory.makeListCons(cjp.constTypeImportOnDemandDec1, (IStrategoList)cjp.constCons31);
    const101 = termFactory.makeString("runtime");
    constId32 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const101});
    constCons37 = (IStrategoTerm)termFactory.makeListCons(cjp.constId32, (IStrategoList)cjp.constNil0);
    const102 = termFactory.makeString("cjp");
    constId33 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cjp.const102});
    constCons38 = (IStrategoTerm)termFactory.makeListCons(cjp.constId33, (IStrategoList)cjp.constCons37);
    constPackageName2 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{cjp.constCons38});
    constTypeImportOnDemandDec2 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{cjp.constPackageName2});
    constCons39 = (IStrategoTerm)termFactory.makeListCons(cjp.constTypeImportOnDemandDec2, (IStrategoList)cjp.constCons36);
    const103 = termFactory.makeString("'closures-converter-compilation-unit'");
    const104 = termFactory.makeString("'check-for-change-in-aspect-or-class'");
    const105 = termFactory.makeString("'closures-converter-aspect-or-class'");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}