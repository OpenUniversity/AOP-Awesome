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

@SuppressWarnings("all") public class transform  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm const113;

  protected static IStrategoTerm const112;

  protected static IStrategoTerm const111;

  protected static IStrategoTerm constCons45;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons44;

  protected static IStrategoTerm constId26;

  protected static IStrategoTerm const110;

  protected static IStrategoTerm constCons43;

  protected static IStrategoTerm constId25;

  protected static IStrategoTerm const109;

  public static IStrategoTerm getEjpTbl()
  { 
    return constEjpTbl;
  }

  protected static ImportTerm constEjpTbl;

  protected static IStrategoTerm const108;

  protected static IStrategoTerm const107;

  protected static IStrategoTerm constFBOX47;

  protected static IStrategoTerm constS64;

  protected static IStrategoTerm const106;

  protected static IStrategoTerm constFBOX46;

  protected static IStrategoTerm constS63;

  protected static IStrategoTerm const105;

  protected static IStrategoTerm constFBOX45;

  protected static IStrategoTerm constS62;

  protected static IStrategoTerm const104;

  protected static IStrategoTerm constFBOX44;

  protected static IStrategoTerm constS61;

  protected static IStrategoTerm const103;

  protected static IStrategoTerm constFBOX43;

  protected static IStrategoTerm constS60;

  protected static IStrategoTerm const102;

  protected static IStrategoTerm constCons42;

  protected static IStrategoTerm constSOpt4;

  protected static IStrategoTerm constCons41;

  protected static IStrategoTerm constCons40;

  protected static IStrategoTerm constSOpt3;

  protected static IStrategoTerm const101;

  protected static IStrategoTerm constIS0;

  protected static IStrategoTerm constCons39;

  protected static IStrategoTerm constFBOX42;

  protected static IStrategoTerm constS59;

  protected static IStrategoTerm const100;

  protected static IStrategoTerm constFBOX41;

  protected static IStrategoTerm constS58;

  protected static IStrategoTerm const99;

  protected static IStrategoTerm constFBOX40;

  protected static IStrategoTerm constS57;

  protected static IStrategoTerm const98;

  protected static IStrategoTerm constFBOX39;

  protected static IStrategoTerm constS56;

  protected static IStrategoTerm const97;

  protected static IStrategoTerm constFBOX38;

  protected static IStrategoTerm constS55;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm constFBOX37;

  protected static IStrategoTerm constS54;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm constFBOX36;

  protected static IStrategoTerm constS53;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm constFBOX35;

  protected static IStrategoTerm constS52;

  protected static IStrategoTerm constS51;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constS50;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm constS49;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm constS48;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm constFBOX34;

  protected static IStrategoTerm constS47;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm constFBOX33;

  protected static IStrategoTerm constS46;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm constFBOX32;

  protected static IStrategoTerm constS45;

  protected static IStrategoTerm constFBOX31;

  protected static IStrategoTerm constS44;

  protected static IStrategoTerm const87;

  protected static IStrategoTerm constFBOX30;

  protected static IStrategoTerm constS43;

  protected static IStrategoTerm const86;

  protected static IStrategoTerm constFBOX29;

  protected static IStrategoTerm constS42;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm constCons38;

  protected static IStrategoTerm constFBOX28;

  protected static IStrategoTerm constS41;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm constFBOX27;

  protected static IStrategoTerm constS40;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm constFBOX26;

  protected static IStrategoTerm constS39;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm constFBOX25;

  protected static IStrategoTerm constS38;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm constFBOX24;

  protected static IStrategoTerm constS37;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm constFBOX23;

  protected static IStrategoTerm constCons37;

  protected static IStrategoTerm constFBOX22;

  protected static IStrategoTerm constFBOX21;

  protected static IStrategoTerm constCons36;

  protected static IStrategoTerm constSOpt2;

  protected static IStrategoTerm constVS0;

  protected static IStrategoTerm constS36;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm constS35;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm constS34;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm constFBOX20;

  protected static IStrategoTerm constS33;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm constS32;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm constCons35;

  protected static IStrategoTerm constCons34;

  protected static IStrategoTerm constCons33;

  protected static IStrategoTerm constFBOX19;

  protected static IStrategoTerm constS31;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constS30;

  protected static IStrategoTerm constCons32;

  protected static IStrategoTerm constS29;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm constFBOX18;

  protected static IStrategoTerm constS28;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm constFBOX17;

  protected static IStrategoTerm constCons31;

  protected static IStrategoTerm constS27;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm constFBOX16;

  protected static IStrategoTerm constS26;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constCons30;

  protected static IStrategoTerm constS25;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm constFBOX15;

  protected static IStrategoTerm constS24;

  protected static IStrategoTerm constCons29;

  protected static IStrategoTerm constSOpt1;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constS23;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm constS22;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm constS21;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm constS20;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm constS19;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm constS18;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constS17;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constFBOX14;

  protected static IStrategoTerm constS16;

  protected static IStrategoTerm constFBOX13;

  protected static IStrategoTerm constS15;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constFBOX12;

  protected static IStrategoTerm constS14;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm constFBOX11;

  protected static IStrategoTerm constS13;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm constFBOX10;

  protected static IStrategoTerm constS12;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm constFBOX9;

  protected static IStrategoTerm constS11;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constFBOX8;

  protected static IStrategoTerm constS10;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constFBOX7;

  protected static IStrategoTerm constS9;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constH0;

  protected static IStrategoTerm constCons28;

  protected static IStrategoTerm constFBOX6;

  protected static IStrategoTerm constS8;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constCons27;

  protected static IStrategoTerm constFBOX5;

  protected static IStrategoTerm constS7;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constFBOX4;

  protected static IStrategoTerm constS6;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm constFBOX3;

  protected static IStrategoTerm constS5;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm constFBOX2;

  protected static IStrategoTerm constS4;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm constFBOX1;

  protected static IStrategoTerm constS3;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm constFBOX0;

  protected static IStrategoTerm constS2;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm constKW0;

  protected static IStrategoTerm constS1;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constCons26;

  protected static IStrategoTerm constS0;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm constSOpt0;

  protected static IStrategoTerm constHS0;

  protected static IStrategoTerm constSome2;

  protected static IStrategoTerm constLit8;

  protected static IStrategoTerm constNull0;

  protected static IStrategoTerm constSome1;

  protected static IStrategoTerm constLit7;

  protected static IStrategoTerm constFalse0;

  protected static IStrategoTerm constSome0;

  protected static IStrategoTerm constLit6;

  protected static IStrategoTerm constDeci0;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constId24;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constNoPointcutBody0;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm constElemValPair3;

  protected static IStrategoTerm constLit5;

  protected static IStrategoTerm constString5;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constChars5;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm constParam1;

  protected static IStrategoTerm constId23;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm constClassOrInterfaceType1;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm constElemValPair2;

  protected static IStrategoTerm constLit4;

  protected static IStrategoTerm constString4;

  protected static IStrategoTerm constCons17;

  protected static IStrategoTerm constChars4;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm constCons16;

  protected static IStrategoTerm constElemValPair1;

  protected static IStrategoTerm constLit3;

  protected static IStrategoTerm constString3;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm constChars3;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constParam0;

  protected static IStrategoTerm constId22;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constClassOrInterfaceType0;

  protected static IStrategoTerm constTypeName10;

  protected static IStrategoTerm constId21;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm constId20;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm constElemValPair0;

  protected static IStrategoTerm constLit2;

  protected static IStrategoTerm constString2;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constChars2;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm constId19;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constTypeName9;

  protected static IStrategoTerm constId18;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm constTypeName8;

  protected static IStrategoTerm constId17;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm constPackageOrTypeName3;

  protected static IStrategoTerm constId16;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm constPackageOrTypeName2;

  protected static IStrategoTerm constId15;

  protected static IStrategoTerm const27;

  protected static IStrategoTerm constPackageOrTypeName1;

  protected static IStrategoTerm constId14;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm constPackageOrTypeName0;

  protected static IStrategoTerm constId13;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm constCons11;

  protected static IStrategoTerm constPrivate0;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm constAnnoPattern3;

  protected static IStrategoTerm constCons10;

  protected static IStrategoTerm constNot1;

  protected static IStrategoTerm constAnnoPattern2;

  protected static IStrategoTerm constCons9;

  protected static IStrategoTerm constSimpleAnnoPatternExact1;

  protected static IStrategoTerm constAnnoPattern1;

  protected static IStrategoTerm constCons8;

  protected static IStrategoTerm constNot0;

  protected static IStrategoTerm constAnnoPattern0;

  protected static IStrategoTerm constCons7;

  protected static IStrategoTerm constStatic0;

  protected static IStrategoTerm constCons6;

  protected static IStrategoTerm constSimpleAnnoPatternExact0;

  protected static IStrategoTerm constTypeName7;

  protected static IStrategoTerm constId12;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm constLit1;

  protected static IStrategoTerm constString1;

  protected static IStrategoTerm constCons5;

  protected static IStrategoTerm constChars1;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm constLit0;

  protected static IStrategoTerm constString0;

  protected static IStrategoTerm constCons4;

  protected static IStrategoTerm constChars0;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm constCons3;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm constTypeName6;

  protected static IStrategoTerm constId11;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm constCons2;

  protected static IStrategoTerm constFormalWildcard0;

  protected static IStrategoTerm constMemberName0;

  protected static IStrategoTerm constModPattern0;

  protected static IStrategoTerm constTypeName5;

  protected static IStrategoTerm constId10;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm constRefTypePattern0;

  protected static IStrategoTerm constNamePattern0;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm constTypeName4;

  protected static IStrategoTerm constId9;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constId8;

  protected static IStrategoTerm constId7;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm constTypeName3;

  protected static IStrategoTerm constId6;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm constCons1;

  protected static IStrategoTerm constFinal0;

  protected static IStrategoTerm constCons0;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm constId5;

  protected static IStrategoTerm const6;

  protected static IStrategoTerm constId4;

  protected static IStrategoTerm const5;

  protected static IStrategoTerm constId3;

  protected static IStrategoTerm const4;

  protected static IStrategoTerm constTypeName2;

  protected static IStrategoTerm constId2;

  protected static IStrategoTerm const3;

  protected static IStrategoTerm constVoid0;

  protected static IStrategoTerm constTypeName1;

  protected static IStrategoTerm constId1;

  protected static IStrategoTerm const2;

  protected static IStrategoTerm const1;

  protected static IStrategoTerm constNone0;

  protected static IStrategoTerm constTypeName0;

  protected static IStrategoTerm constId0;

  protected static IStrategoTerm const0;

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

  public static IStrategoConstructor _consEJPCall_2;

  public static IStrategoConstructor _consScopedEJPCall_3;

  public static IStrategoConstructor _consDecError_2;

  public static IStrategoConstructor _consDecSoft_2;

  public static IStrategoConstructor _consDecNoMatch_4;

  public static IStrategoConstructor _consRegularTypePattern_1;

  public static IStrategoConstructor _consSimpleAnnoPatternValue_2;

  public static IStrategoConstructor _consExplicitJoinPoint_3;

  public static IStrategoConstructor _consPointcutargs_1;

  public static IStrategoConstructor _consPointcutarg_3;

  public static IStrategoConstructor _consExplicitJoinPointDeclaration_5;

  public static IStrategoConstructor _consScopedExplicitJoinPointPHeader_2;

  public static IStrategoConstructor _consNonScopedExplicitJoinPointPHeader_2;

  public static IStrategoConstructor _consExplicitJoinPointDeclarator_3;

  public static IStrategoConstructor _consPointcutargsDec_1;

  public static IStrategoConstructor _consPointcutargDec_2;

  public static IStrategoConstructor _consHandles_1;

  public static IStrategoConstructor _consExplicitJoinPointInitializer_1;

  public static IStrategoConstructor _consExplicitJoinPointPattern_1;

  public static IStrategoConstructor _consNotExplicitJoinPointPattern_1;

  public static IStrategoConstructor _consExplicitJoinPointScopePattern_1;

  public static IStrategoConstructor _consNotExplicitJoinPointScopePattern_1;

  public static IStrategoConstructor _consThisClass_0;

  public static IStrategoConstructor _consThisMethod_0;

  public static IStrategoConstructor _consThisBlock_0;

  public static IStrategoConstructor _consByPackageGranularity_0;

  public static IStrategoConstructor _consByClassGranularity_0;

  public static IStrategoConstructor _consByMethodGranularity_0;

  public static IStrategoConstructor _consByEjpGranularity_0;

  public static IStrategoConstructor _consPackageName_1;

  public static IStrategoConstructor _consPackageDec_2;

  public static IStrategoConstructor _consTypeImportOnDemandDec_1;

  public static IStrategoConstructor _consCompilationUnit_3;

  public static IStrategoConstructor _consDeci_1;

  public static IStrategoConstructor _consFalse_0;

  public static IStrategoConstructor _consChar_1;

  public static IStrategoConstructor _consString_1;

  public static IStrategoConstructor _consChars_1;

  public static IStrategoConstructor _consNull_0;

  public static IStrategoConstructor _consAmbName_1;

  public static IStrategoConstructor _consAmbName_2;

  public static IStrategoConstructor _consExprName_1;

  public static IStrategoConstructor _consExprName_2;

  public static IStrategoConstructor _consMethodName_2;

  public static IStrategoConstructor _consClassOrInterfaceType_2;

  public static IStrategoConstructor _consClassType_2;

  public static IStrategoConstructor _consLit_1;

  public static IStrategoConstructor _consNewInstance_4;

  public static IStrategoConstructor _consInvoke_2;

  public static IStrategoConstructor _consAssign_2;

  public static IStrategoConstructor _consFieldDec_3;

  public static IStrategoConstructor _consVarDec_1;

  public static IStrategoConstructor _consVarDec_2;

  public static IStrategoConstructor _consLocalVarDecStm_1;

  public static IStrategoConstructor _consLocalVarDec_3;

  public static IStrategoConstructor _consExprStm_1;

  public static IStrategoConstructor _consReturn_1;

  public static IStrategoConstructor _consBlock_1;

  public static IStrategoConstructor _consClassDecStm_1;

  public static IStrategoConstructor _consMethodDec_2;

  public static IStrategoConstructor _consMethodDecHead_6;

  public static IStrategoConstructor _consParam_3;

  public static IStrategoConstructor _consVarArityParam_3;

  public static IStrategoConstructor _consNoMethodBody_0;

  public static IStrategoConstructor _consInstanceInit_1;

  public static IStrategoConstructor _consStaticInit_1;

  public static IStrategoConstructor _consClassDec_2;

  public static IStrategoConstructor _consClassBody_1;

  public static IStrategoConstructor _consClassDecHead_5;

  public static IStrategoConstructor _consMethod_1;

  public static IStrategoConstructor _consSingleElemAnno_2;

  public static IStrategoConstructor _consElemValPair_2;

  public static IStrategoConstructor _consElemValArrayInit_1;

  public static IStrategoConstructor _consId_1;

  public static IStrategoConstructor _consPublic_0;

  public static IStrategoConstructor _consPrivate_0;

  public static IStrategoConstructor _consFinal_0;

  public static IStrategoConstructor _consStatic_0;

  public static IStrategoConstructor _consBoolean_0;

  public static IStrategoConstructor _consByte_0;

  public static IStrategoConstructor _consShort_0;

  public static IStrategoConstructor _consInt_0;

  public static IStrategoConstructor _consLong_0;

  public static IStrategoConstructor _consFloat_0;

  public static IStrategoConstructor _consDouble_0;

  public static IStrategoConstructor _consTypeName_1;

  public static IStrategoConstructor _consTypeName_2;

  public static IStrategoConstructor _consPackageOrTypeName_1;

  public static IStrategoConstructor _consPackageOrTypeName_2;

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

  public static IStrategoConstructor _consProceed_0;

  public static IStrategoConstructor _consCons_2;

  public static IStrategoConstructor _consNil_0;

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consAnno_2;

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
          context.registerComponent("ejp");
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
    _consEJPCall_2 = termFactory.makeConstructor("EJPCall", 2);
    _consScopedEJPCall_3 = termFactory.makeConstructor("ScopedEJPCall", 3);
    _consDecError_2 = termFactory.makeConstructor("DecError", 2);
    _consDecSoft_2 = termFactory.makeConstructor("DecSoft", 2);
    _consDecNoMatch_4 = termFactory.makeConstructor("DecNoMatch", 4);
    _consRegularTypePattern_1 = termFactory.makeConstructor("RegularTypePattern", 1);
    _consSimpleAnnoPatternValue_2 = termFactory.makeConstructor("SimpleAnnoPatternValue", 2);
    _consExplicitJoinPoint_3 = termFactory.makeConstructor("ExplicitJoinPoint", 3);
    _consPointcutargs_1 = termFactory.makeConstructor("Pointcutargs", 1);
    _consPointcutarg_3 = termFactory.makeConstructor("Pointcutarg", 3);
    _consExplicitJoinPointDeclaration_5 = termFactory.makeConstructor("ExplicitJoinPointDeclaration", 5);
    _consScopedExplicitJoinPointPHeader_2 = termFactory.makeConstructor("ScopedExplicitJoinPointPHeader", 2);
    _consNonScopedExplicitJoinPointPHeader_2 = termFactory.makeConstructor("NonScopedExplicitJoinPointPHeader", 2);
    _consExplicitJoinPointDeclarator_3 = termFactory.makeConstructor("ExplicitJoinPointDeclarator", 3);
    _consPointcutargsDec_1 = termFactory.makeConstructor("PointcutargsDec", 1);
    _consPointcutargDec_2 = termFactory.makeConstructor("PointcutargDec", 2);
    _consHandles_1 = termFactory.makeConstructor("Handles", 1);
    _consExplicitJoinPointInitializer_1 = termFactory.makeConstructor("ExplicitJoinPointInitializer", 1);
    _consExplicitJoinPointPattern_1 = termFactory.makeConstructor("ExplicitJoinPointPattern", 1);
    _consNotExplicitJoinPointPattern_1 = termFactory.makeConstructor("NotExplicitJoinPointPattern", 1);
    _consExplicitJoinPointScopePattern_1 = termFactory.makeConstructor("ExplicitJoinPointScopePattern", 1);
    _consNotExplicitJoinPointScopePattern_1 = termFactory.makeConstructor("NotExplicitJoinPointScopePattern", 1);
    _consThisClass_0 = termFactory.makeConstructor("ThisClass", 0);
    _consThisMethod_0 = termFactory.makeConstructor("ThisMethod", 0);
    _consThisBlock_0 = termFactory.makeConstructor("ThisBlock", 0);
    _consByPackageGranularity_0 = termFactory.makeConstructor("ByPackageGranularity", 0);
    _consByClassGranularity_0 = termFactory.makeConstructor("ByClassGranularity", 0);
    _consByMethodGranularity_0 = termFactory.makeConstructor("ByMethodGranularity", 0);
    _consByEjpGranularity_0 = termFactory.makeConstructor("ByEjpGranularity", 0);
    _consPackageName_1 = termFactory.makeConstructor("PackageName", 1);
    _consPackageDec_2 = termFactory.makeConstructor("PackageDec", 2);
    _consTypeImportOnDemandDec_1 = termFactory.makeConstructor("TypeImportOnDemandDec", 1);
    _consCompilationUnit_3 = termFactory.makeConstructor("CompilationUnit", 3);
    _consDeci_1 = termFactory.makeConstructor("Deci", 1);
    _consFalse_0 = termFactory.makeConstructor("False", 0);
    _consChar_1 = termFactory.makeConstructor("Char", 1);
    _consString_1 = termFactory.makeConstructor("String", 1);
    _consChars_1 = termFactory.makeConstructor("Chars", 1);
    _consNull_0 = termFactory.makeConstructor("Null", 0);
    _consAmbName_1 = termFactory.makeConstructor("AmbName", 1);
    _consAmbName_2 = termFactory.makeConstructor("AmbName", 2);
    _consExprName_1 = termFactory.makeConstructor("ExprName", 1);
    _consExprName_2 = termFactory.makeConstructor("ExprName", 2);
    _consMethodName_2 = termFactory.makeConstructor("MethodName", 2);
    _consClassOrInterfaceType_2 = termFactory.makeConstructor("ClassOrInterfaceType", 2);
    _consClassType_2 = termFactory.makeConstructor("ClassType", 2);
    _consLit_1 = termFactory.makeConstructor("Lit", 1);
    _consNewInstance_4 = termFactory.makeConstructor("NewInstance", 4);
    _consInvoke_2 = termFactory.makeConstructor("Invoke", 2);
    _consAssign_2 = termFactory.makeConstructor("Assign", 2);
    _consFieldDec_3 = termFactory.makeConstructor("FieldDec", 3);
    _consVarDec_1 = termFactory.makeConstructor("VarDec", 1);
    _consVarDec_2 = termFactory.makeConstructor("VarDec", 2);
    _consLocalVarDecStm_1 = termFactory.makeConstructor("LocalVarDecStm", 1);
    _consLocalVarDec_3 = termFactory.makeConstructor("LocalVarDec", 3);
    _consExprStm_1 = termFactory.makeConstructor("ExprStm", 1);
    _consReturn_1 = termFactory.makeConstructor("Return", 1);
    _consBlock_1 = termFactory.makeConstructor("Block", 1);
    _consClassDecStm_1 = termFactory.makeConstructor("ClassDecStm", 1);
    _consMethodDec_2 = termFactory.makeConstructor("MethodDec", 2);
    _consMethodDecHead_6 = termFactory.makeConstructor("MethodDecHead", 6);
    _consParam_3 = termFactory.makeConstructor("Param", 3);
    _consVarArityParam_3 = termFactory.makeConstructor("VarArityParam", 3);
    _consNoMethodBody_0 = termFactory.makeConstructor("NoMethodBody", 0);
    _consInstanceInit_1 = termFactory.makeConstructor("InstanceInit", 1);
    _consStaticInit_1 = termFactory.makeConstructor("StaticInit", 1);
    _consClassDec_2 = termFactory.makeConstructor("ClassDec", 2);
    _consClassBody_1 = termFactory.makeConstructor("ClassBody", 1);
    _consClassDecHead_5 = termFactory.makeConstructor("ClassDecHead", 5);
    _consMethod_1 = termFactory.makeConstructor("Method", 1);
    _consSingleElemAnno_2 = termFactory.makeConstructor("SingleElemAnno", 2);
    _consElemValPair_2 = termFactory.makeConstructor("ElemValPair", 2);
    _consElemValArrayInit_1 = termFactory.makeConstructor("ElemValArrayInit", 1);
    _consId_1 = termFactory.makeConstructor("Id", 1);
    _consPublic_0 = termFactory.makeConstructor("Public", 0);
    _consPrivate_0 = termFactory.makeConstructor("Private", 0);
    _consFinal_0 = termFactory.makeConstructor("Final", 0);
    _consStatic_0 = termFactory.makeConstructor("Static", 0);
    _consBoolean_0 = termFactory.makeConstructor("Boolean", 0);
    _consByte_0 = termFactory.makeConstructor("Byte", 0);
    _consShort_0 = termFactory.makeConstructor("Short", 0);
    _consInt_0 = termFactory.makeConstructor("Int", 0);
    _consLong_0 = termFactory.makeConstructor("Long", 0);
    _consFloat_0 = termFactory.makeConstructor("Float", 0);
    _consDouble_0 = termFactory.makeConstructor("Double", 0);
    _consTypeName_1 = termFactory.makeConstructor("TypeName", 1);
    _consTypeName_2 = termFactory.makeConstructor("TypeName", 2);
    _consPackageOrTypeName_1 = termFactory.makeConstructor("PackageOrTypeName", 1);
    _consPackageOrTypeName_2 = termFactory.makeConstructor("PackageOrTypeName", 2);
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
    _consProceed_0 = termFactory.makeConstructor("Proceed", 0);
    _consCons_2 = termFactory.makeConstructor("Cons", 2);
    _consNil_0 = termFactory.makeConstructor("Nil", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consAnno_2 = termFactory.makeConstructor("Anno", 2);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    const0 = termFactory.makeString("ClassAnno");
    constId0 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const0});
    constTypeName0 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{ejp.constId0});
    constNone0 = termFactory.makeAppl(transform._consNone_0, NO_TERMS);
    const1 = termFactory.makeString("ejpScopedInner");
    const2 = termFactory.makeString("MethodAnno");
    constId1 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const2});
    constTypeName1 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{ejp.constId1});
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    const3 = termFactory.makeString("ExplicitScopedJoinPoint");
    constId2 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const3});
    constTypeName2 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{ejp.constId2});
    const4 = termFactory.makeString("joinpoint");
    constId3 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const4});
    const5 = termFactory.makeString("aspect");
    constId4 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const5});
    const6 = termFactory.makeString("args");
    constId5 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const6});
    const7 = termFactory.makeString("'ejp-call-to-method-invokation'");
    const8 = termFactory.makeString("_instance");
    constCons0 = (IStrategoTerm)termFactory.makeListCons(ejp.const8, (IStrategoList)ejp.constNil0);
    constFinal0 = termFactory.makeAppl(transform._consFinal_0, NO_TERMS);
    constCons1 = (IStrategoTerm)termFactory.makeListCons(ejp.constFinal0, (IStrategoList)ejp.constNil0);
    const9 = termFactory.makeString("'scoped-ejp-to-java'");
    const10 = termFactory.makeString("pointcut");
    const11 = termFactory.makeString("Pointcutargs");
    constId6 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const11});
    constTypeName3 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{ejp.constId6});
    const12 = termFactory.makeString("expr");
    constId7 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const12});
    constId8 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const10});
    constBlock0 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{ejp.constNil0});
    const13 = termFactory.makeString("'remove-vars-decs-from-local-var-dec-stm'");
    const14 = termFactory.makeString("ejps.runtime.ClassAnno");
    constId9 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const14});
    constTypeName4 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{ejp.constId9});
    const15 = termFactory.makeString("*");
    constNamePattern0 = termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{ejp.const15});
    constRefTypePattern0 = termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{ejp.constNamePattern0});
    const16 = termFactory.makeString("ejps.runtime.MethodAnno");
    constId10 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const16});
    constTypeName5 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{ejp.constId10});
    constModPattern0 = termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{ejp.constNil0});
    constMemberName0 = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{ejp.const15});
    constFormalWildcard0 = termFactory.makeAppl(transform._consFormalWildcard_0, NO_TERMS);
    constCons2 = (IStrategoTerm)termFactory.makeListCons(ejp.constFormalWildcard0, (IStrategoList)ejp.constNil0);
    const17 = termFactory.makeString("ejps.runtime.EjpBlockAnno");
    constId11 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const17});
    constTypeName6 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{ejp.constId11});
    const18 = termFactory.makeString("nomatch$");
    const19 = termFactory.makeString("$");
    const20 = termFactory.makeString("ejp$");
    constCons3 = (IStrategoTerm)termFactory.makeListCons(ejp.const19, (IStrategoList)ejp.constNil0);
    const21 = termFactory.makeString("String");
    constChars0 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{ejp.const21});
    constCons4 = (IStrategoTerm)termFactory.makeListCons(ejp.constChars0, (IStrategoList)ejp.constNil0);
    constString0 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{ejp.constCons4});
    constLit0 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{ejp.constString0});
    const22 = termFactory.makeString("char");
    constChars1 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{ejp.const22});
    constCons5 = (IStrategoTerm)termFactory.makeListCons(ejp.constChars1, (IStrategoList)ejp.constNil0);
    constString1 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{ejp.constCons5});
    constLit1 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{ejp.constString1});
    const23 = termFactory.makeString("ExplicitJoinPoint");
    constId12 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const23});
    constTypeName7 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{ejp.constId12});
    constSimpleAnnoPatternExact0 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{ejp.constTypeName7});
    constCons6 = (IStrategoTerm)termFactory.makeListCons(ejp.constSimpleAnnoPatternExact0, (IStrategoList)ejp.constNil0);
    constStatic0 = termFactory.makeAppl(transform._consStatic_0, NO_TERMS);
    constCons7 = (IStrategoTerm)termFactory.makeListCons(ejp.constStatic0, (IStrategoList)ejp.constCons1);
    constAnnoPattern0 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{ejp.constCons6});
    constNot0 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{ejp.constSimpleAnnoPatternExact0});
    constCons8 = (IStrategoTerm)termFactory.makeListCons(ejp.constNot0, (IStrategoList)ejp.constNil0);
    constAnnoPattern1 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{ejp.constCons8});
    constSimpleAnnoPatternExact1 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{ejp.constTypeName2});
    constCons9 = (IStrategoTerm)termFactory.makeListCons(ejp.constSimpleAnnoPatternExact1, (IStrategoList)ejp.constNil0);
    constAnnoPattern2 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{ejp.constCons9});
    constNot1 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{ejp.constSimpleAnnoPatternExact1});
    constCons10 = (IStrategoTerm)termFactory.makeListCons(ejp.constNot1, (IStrategoList)ejp.constNil0);
    constAnnoPattern3 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{ejp.constCons10});
    const24 = termFactory.makeString("this(obj) && ");
    constPrivate0 = termFactory.makeAppl(transform._consPrivate_0, NO_TERMS);
    constCons11 = (IStrategoTerm)termFactory.makeListCons(ejp.constPrivate0, (IStrategoList)ejp.constNil0);
    const25 = termFactory.makeString("org");
    constId13 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const25});
    constPackageOrTypeName0 = termFactory.makeAppl(transform._consPackageOrTypeName_1, new IStrategoTerm[]{ejp.constId13});
    const26 = termFactory.makeString("aspectj");
    constId14 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const26});
    constPackageOrTypeName1 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{ejp.constPackageOrTypeName0, ejp.constId14});
    const27 = termFactory.makeString("lang");
    constId15 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const27});
    constPackageOrTypeName2 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{ejp.constPackageOrTypeName1, ejp.constId15});
    const28 = termFactory.makeString("annotation");
    constId16 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const28});
    constPackageOrTypeName3 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{ejp.constPackageOrTypeName2, ejp.constId16});
    const29 = termFactory.makeString("Pointcut");
    constId17 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const29});
    constTypeName8 = termFactory.makeAppl(transform._consTypeName_2, new IStrategoTerm[]{ejp.constPackageOrTypeName3, ejp.constId17});
    const30 = termFactory.makeString("NoMatch");
    constId18 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const30});
    constTypeName9 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{ejp.constId18});
    const31 = termFactory.makeString("granularity");
    constId19 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const31});
    const32 = termFactory.makeString("package");
    constChars2 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{ejp.const32});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(ejp.constChars2, (IStrategoList)ejp.constNil0);
    constString2 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{ejp.constCons12});
    constLit2 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{ejp.constString2});
    constElemValPair0 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId19, ejp.constLit2});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(ejp.constElemValPair0, (IStrategoList)ejp.constNil0);
    const33 = termFactory.makeString("error");
    constId20 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const33});
    const34 = termFactory.makeString("Object");
    constId21 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const34});
    constTypeName10 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{ejp.constId21});
    constClassOrInterfaceType0 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{ejp.constTypeName10, ejp.constNone0});
    const35 = termFactory.makeString("obj");
    constId22 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const35});
    constParam0 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{ejp.constNil0, ejp.constClassOrInterfaceType0, ejp.constId22});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(ejp.constParam0, (IStrategoList)ejp.constNil0);
    const36 = termFactory.makeString("class");
    constChars3 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{ejp.const36});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(ejp.constChars3, (IStrategoList)ejp.constNil0);
    constString3 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{ejp.constCons15});
    constLit3 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{ejp.constString3});
    constElemValPair1 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId19, ejp.constLit3});
    constCons16 = (IStrategoTerm)termFactory.makeListCons(ejp.constElemValPair1, (IStrategoList)ejp.constNil0);
    const37 = termFactory.makeString("@withincode(anno) && @withincode(ejps.runtime.ExplicitScopedJoinPoint) && ");
    const38 = termFactory.makeString("ejp");
    constChars4 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{ejp.const38});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(ejp.constChars4, (IStrategoList)ejp.constNil0);
    constString4 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{ejp.constCons17});
    constLit4 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{ejp.constString4});
    constElemValPair2 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId19, ejp.constLit4});
    constCons18 = (IStrategoTerm)termFactory.makeListCons(ejp.constElemValPair2, (IStrategoList)ejp.constNil0);
    constClassOrInterfaceType1 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{ejp.constTypeName1, ejp.constNone0});
    const39 = termFactory.makeString("anno");
    constId23 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const39});
    constParam1 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{ejp.constNil0, ejp.constClassOrInterfaceType1, ejp.constId23});
    constCons19 = (IStrategoTerm)termFactory.makeListCons(ejp.constParam1, (IStrategoList)ejp.constNil0);
    const40 = termFactory.makeString("@withincode(anno) && !@withincode(ejps.runtime.ExplicitScopedJoinPoint) && ");
    const41 = termFactory.makeString("method");
    constChars5 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{ejp.const41});
    constCons20 = (IStrategoTerm)termFactory.makeListCons(ejp.constChars5, (IStrategoList)ejp.constNil0);
    constString5 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{ejp.constCons20});
    constLit5 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{ejp.constString5});
    constElemValPair3 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId19, ejp.constLit5});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(ejp.constElemValPair3, (IStrategoList)ejp.constNil0);
    const42 = termFactory.makeString("'ejp-to-ajc'");
    constCons22 = (IStrategoTerm)termFactory.makeListCons(ejp.constStatic0, (IStrategoList)ejp.constNil0);
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons23 = (IStrategoTerm)termFactory.makeListCons(ejp.constPublic0, (IStrategoList)ejp.constCons22);
    constCons24 = (IStrategoTerm)termFactory.makeListCons(ejp.constPublic0, (IStrategoList)ejp.constNil0);
    constNoPointcutBody0 = termFactory.makeAppl(transform._consNoPointcutBody_0, NO_TERMS);
    const43 = termFactory.makeString("handles");
    constId24 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const43});
    const44 = termFactory.makeString("0");
    constDeci0 = termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{ejp.const44});
    constLit6 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{ejp.constDeci0});
    constSome0 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{ejp.constLit6});
    constFalse0 = termFactory.makeAppl(transform._consFalse_0, NO_TERMS);
    constLit7 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{ejp.constFalse0});
    constSome1 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{ejp.constLit7});
    constNull0 = termFactory.makeAppl(transform._consNull_0, NO_TERMS);
    constLit8 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{ejp.constNull0});
    constSome2 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{ejp.constLit8});
    constHS0 = termFactory.makeAppl(transform._consHS_0, NO_TERMS);
    constSOpt0 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{ejp.constHS0, ejp.const44});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(ejp.constSOpt0, (IStrategoList)ejp.constNil0);
    const45 = termFactory.makeString(")");
    constS0 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const45});
    constCons26 = (IStrategoTerm)termFactory.makeListCons(ejp.constS0, (IStrategoList)ejp.constNil0);
    const46 = termFactory.makeString("(");
    constS1 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const46});
    constKW0 = termFactory.makeAppl(transform._consKW_0, NO_TERMS);
    const47 = termFactory.makeString("initialization");
    constS2 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const47});
    constFBOX0 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS2});
    const48 = termFactory.makeString("preinitialization");
    constS3 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const48});
    constFBOX1 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS3});
    const49 = termFactory.makeString("staticinitialization");
    constS4 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const49});
    constFBOX2 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS4});
    const50 = termFactory.makeString("get");
    constS5 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const50});
    constFBOX3 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS5});
    const51 = termFactory.makeString("set");
    constS6 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const51});
    constFBOX4 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS6});
    const52 = termFactory.makeString("handler");
    constS7 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const52});
    constFBOX5 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS7});
    constCons27 = (IStrategoTerm)termFactory.makeListCons(ejp.constS1, (IStrategoList)ejp.constCons26);
    const53 = termFactory.makeString("adviceexecution");
    constS8 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const53});
    constFBOX6 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS8});
    constCons28 = (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX6, (IStrategoList)ejp.constCons27);
    constH0 = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, ejp.constCons28});
    const54 = termFactory.makeString("within");
    constS9 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const54});
    constFBOX7 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS9});
    const55 = termFactory.makeString("withincode");
    constS10 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const55});
    constFBOX8 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS10});
    const56 = termFactory.makeString("cflow");
    constS11 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const56});
    constFBOX9 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS11});
    const57 = termFactory.makeString("cflowbelow");
    constS12 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const57});
    constFBOX10 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS12});
    const58 = termFactory.makeString("if");
    constS13 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const58});
    constFBOX11 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS13});
    const59 = termFactory.makeString("this");
    constS14 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const59});
    constFBOX12 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS14});
    const60 = termFactory.makeString("target");
    constS15 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const60});
    constFBOX13 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS15});
    constS16 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const6});
    constFBOX14 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS16});
    const61 = termFactory.makeString("@this");
    constS17 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const61});
    const62 = termFactory.makeString("@target");
    constS18 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const62});
    const63 = termFactory.makeString("@within");
    constS19 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const63});
    const64 = termFactory.makeString("@withincode");
    constS20 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const64});
    const65 = termFactory.makeString("@annotation");
    constS21 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const65});
    const66 = termFactory.makeString("@args");
    constS22 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const66});
    const67 = termFactory.makeString(".");
    constS23 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const67});
    const68 = termFactory.makeString("1");
    constSOpt1 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{ejp.constHS0, ejp.const68});
    constCons29 = (IStrategoTerm)termFactory.makeListCons(ejp.constSOpt1, (IStrategoList)ejp.constNil0);
    constS24 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const10});
    constFBOX15 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS24});
    const69 = termFactory.makeString(";");
    constS25 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const69});
    constCons30 = (IStrategoTerm)termFactory.makeListCons(ejp.constS25, (IStrategoList)ejp.constNil0);
    const70 = termFactory.makeString(":");
    constS26 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const70});
    constFBOX16 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS25});
    const71 = termFactory.makeString("+");
    constS27 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const71});
    constCons31 = (IStrategoTerm)termFactory.makeListCons(ejp.constS27, (IStrategoList)ejp.constNil0);
    constFBOX17 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS23});
    const72 = termFactory.makeString("..");
    constS28 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const72});
    constFBOX18 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS28});
    const73 = termFactory.makeString("...");
    constS29 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const73});
    constCons32 = (IStrategoTerm)termFactory.makeListCons(ejp.constS29, (IStrategoList)ejp.constNil0);
    constS30 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const15});
    const74 = termFactory.makeString("new");
    constS31 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const74});
    constFBOX19 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS31});
    constCons33 = (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX19, (IStrategoList)ejp.constNil0);
    constCons34 = (IStrategoTerm)termFactory.makeListCons(ejp.constS23, (IStrategoList)ejp.constCons33);
    constCons35 = (IStrategoTerm)termFactory.makeListCons(ejp.constS28, (IStrategoList)ejp.constCons33);
    const75 = termFactory.makeString("!");
    constS32 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const75});
    const76 = termFactory.makeString("throws");
    constS33 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const76});
    constFBOX20 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS33});
    const77 = termFactory.makeString("@");
    constS34 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const77});
    const78 = termFactory.makeString("&&");
    constS35 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const78});
    const79 = termFactory.makeString("||");
    constS36 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const79});
    constVS0 = termFactory.makeAppl(transform._consVS_0, NO_TERMS);
    constSOpt2 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{ejp.constVS0, ejp.const44});
    constCons36 = (IStrategoTerm)termFactory.makeListCons(ejp.constSOpt2, (IStrategoList)ejp.constNil0);
    constFBOX21 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS26});
    constFBOX22 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS0});
    constCons37 = (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX22, (IStrategoList)ejp.constNil0);
    constFBOX23 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS1});
    const80 = termFactory.makeString("before");
    constS37 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const80});
    constFBOX24 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS37});
    const81 = termFactory.makeString("after");
    constS38 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const81});
    constFBOX25 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS38});
    const82 = termFactory.makeString("around");
    constS39 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const82});
    constFBOX26 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS39});
    const83 = termFactory.makeString("returning");
    constS40 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const83});
    constFBOX27 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS40});
    const84 = termFactory.makeString("throwing");
    constS41 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const84});
    constFBOX28 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS41});
    constCons38 = (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX16, (IStrategoList)ejp.constNil0);
    const85 = termFactory.makeString("parents");
    constS42 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const85});
    constFBOX29 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS42});
    const86 = termFactory.makeString("declare");
    constS43 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const86});
    constFBOX30 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS43});
    const87 = termFactory.makeString("warning");
    constS44 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const87});
    constFBOX31 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS44});
    constS45 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const33});
    constFBOX32 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS45});
    const88 = termFactory.makeString("soft");
    constS46 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const88});
    constFBOX33 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS46});
    const89 = termFactory.makeString("precedence");
    constS47 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const89});
    constFBOX34 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS47});
    const90 = termFactory.makeString("@type");
    constS48 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const90});
    const91 = termFactory.makeString("@constructor");
    constS49 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const91});
    const92 = termFactory.makeString("@method");
    constS50 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const92});
    const93 = termFactory.makeString("@field");
    constS51 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const93});
    constS52 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const5});
    constFBOX35 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS52});
    const94 = termFactory.makeString("pertarget");
    constS53 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const94});
    constFBOX36 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS53});
    const95 = termFactory.makeString("perthis");
    constS54 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const95});
    constFBOX37 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS54});
    const96 = termFactory.makeString("percflow");
    constS55 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const96});
    constFBOX38 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS55});
    const97 = termFactory.makeString("percflowbelow");
    constS56 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const97});
    constFBOX39 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS56});
    const98 = termFactory.makeString("pertypewithin");
    constS57 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const98});
    constFBOX40 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS57});
    const99 = termFactory.makeString("issingleton");
    constS58 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const99});
    constFBOX41 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS58});
    const100 = termFactory.makeString("}");
    constS59 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const100});
    constFBOX42 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS59});
    constCons39 = (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX42, (IStrategoList)ejp.constNil0);
    constIS0 = termFactory.makeAppl(transform._consIS_0, NO_TERMS);
    const101 = termFactory.makeString("2");
    constSOpt3 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{ejp.constIS0, ejp.const101});
    constCons40 = (IStrategoTerm)termFactory.makeListCons(ejp.constSOpt3, (IStrategoList)ejp.constNil0);
    constCons41 = (IStrategoTerm)termFactory.makeListCons(ejp.constSOpt2, (IStrategoList)ejp.constCons40);
    constSOpt4 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{ejp.constVS0, ejp.const68});
    constCons42 = (IStrategoTerm)termFactory.makeListCons(ejp.constSOpt4, (IStrategoList)ejp.constNil0);
    const102 = termFactory.makeString("{");
    constS60 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const102});
    constFBOX43 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS60});
    const103 = termFactory.makeString("privileged");
    constS61 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const103});
    constFBOX44 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS61});
    const104 = termFactory.makeString("proceed");
    constS62 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const104});
    constFBOX45 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS62});
    const105 = termFactory.makeString("call");
    constS63 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const105});
    constFBOX46 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS63});
    const106 = termFactory.makeString("execution");
    constS64 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{ejp.const106});
    constFBOX47 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{ejp.constKW0, ejp.constS64});
    const107 = termFactory.makeInt(80);
    const108 = termFactory.makeString("w");
    constEjpTbl = new ImportTerm(termFactory, ejp.class, "/ejp/", "ejp.tbl");
    const109 = termFactory.makeString("runtime");
    constId25 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const109});
    constCons43 = (IStrategoTerm)termFactory.makeListCons(ejp.constId25, (IStrategoList)ejp.constNil0);
    const110 = termFactory.makeString("ejps");
    constId26 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{ejp.const110});
    constCons44 = (IStrategoTerm)termFactory.makeListCons(ejp.constId26, (IStrategoList)ejp.constCons43);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{ejp.constCons44});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{ejp.constPackageName0});
    constCons45 = (IStrategoTerm)termFactory.makeListCons(ejp.constTypeImportOnDemandDec0, (IStrategoList)ejp.constNil0);
    const111 = termFactory.makeString("'ejp-converter-compilation-unit'");
    const112 = termFactory.makeString("'check-for-change-in-aspect-or-class'");
    const113 = termFactory.makeString("'ejp-converter-aspect-or-class'");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}