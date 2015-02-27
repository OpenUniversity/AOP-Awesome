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

  protected static IStrategoTerm const118;

  protected static IStrategoTerm const117;

  protected static IStrategoTerm const116;

  protected static IStrategoTerm constCons45;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons44;

  protected static IStrategoTerm constId29;

  protected static IStrategoTerm const115;

  protected static IStrategoTerm constCons43;

  protected static IStrategoTerm constId28;

  protected static IStrategoTerm const114;

  public static IStrategoTerm getEjpTbl()
  { 
    return constEjpTbl;
  }

  protected static ImportTerm constEjpTbl;

  protected static IStrategoTerm const113;

  protected static IStrategoTerm const112;

  protected static IStrategoTerm const111;

  protected static IStrategoTerm const110;

  protected static IStrategoTerm constFBOX47;

  protected static IStrategoTerm constS64;

  protected static IStrategoTerm const109;

  protected static IStrategoTerm constFBOX46;

  protected static IStrategoTerm constS63;

  protected static IStrategoTerm const108;

  protected static IStrategoTerm constFBOX45;

  protected static IStrategoTerm constS62;

  protected static IStrategoTerm const107;

  protected static IStrategoTerm constFBOX44;

  protected static IStrategoTerm constS61;

  protected static IStrategoTerm const106;

  protected static IStrategoTerm constFBOX43;

  protected static IStrategoTerm constS60;

  protected static IStrategoTerm const105;

  protected static IStrategoTerm constCons42;

  protected static IStrategoTerm constSOpt4;

  protected static IStrategoTerm constCons41;

  protected static IStrategoTerm constCons40;

  protected static IStrategoTerm constSOpt3;

  protected static IStrategoTerm const104;

  protected static IStrategoTerm constIS0;

  protected static IStrategoTerm constCons39;

  protected static IStrategoTerm constFBOX42;

  protected static IStrategoTerm constS59;

  protected static IStrategoTerm const103;

  protected static IStrategoTerm constFBOX41;

  protected static IStrategoTerm constS58;

  protected static IStrategoTerm const102;

  protected static IStrategoTerm constFBOX40;

  protected static IStrategoTerm constS57;

  protected static IStrategoTerm const101;

  protected static IStrategoTerm constFBOX39;

  protected static IStrategoTerm constS56;

  protected static IStrategoTerm const100;

  protected static IStrategoTerm constFBOX38;

  protected static IStrategoTerm constS55;

  protected static IStrategoTerm const99;

  protected static IStrategoTerm constFBOX37;

  protected static IStrategoTerm constS54;

  protected static IStrategoTerm const98;

  protected static IStrategoTerm constFBOX36;

  protected static IStrategoTerm constS53;

  protected static IStrategoTerm const97;

  protected static IStrategoTerm constFBOX35;

  protected static IStrategoTerm constS52;

  protected static IStrategoTerm constS51;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm constS50;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm constS49;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm constS48;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constFBOX34;

  protected static IStrategoTerm constS47;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm constFBOX33;

  protected static IStrategoTerm constS46;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm constFBOX32;

  protected static IStrategoTerm constS45;

  protected static IStrategoTerm constFBOX31;

  protected static IStrategoTerm constS44;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm constFBOX30;

  protected static IStrategoTerm constS43;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm constFBOX29;

  protected static IStrategoTerm constS42;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm constCons38;

  protected static IStrategoTerm constFBOX28;

  protected static IStrategoTerm constS41;

  protected static IStrategoTerm const87;

  protected static IStrategoTerm constFBOX27;

  protected static IStrategoTerm constS40;

  protected static IStrategoTerm const86;

  protected static IStrategoTerm constFBOX26;

  protected static IStrategoTerm constS39;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm constFBOX25;

  protected static IStrategoTerm constS38;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm constFBOX24;

  protected static IStrategoTerm constS37;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm constFBOX23;

  protected static IStrategoTerm constCons37;

  protected static IStrategoTerm constFBOX22;

  protected static IStrategoTerm constFBOX21;

  protected static IStrategoTerm constCons36;

  protected static IStrategoTerm constSOpt2;

  protected static IStrategoTerm constVS0;

  protected static IStrategoTerm constS36;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm constS35;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm constS34;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm constFBOX20;

  protected static IStrategoTerm constS33;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm constS32;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm constCons35;

  protected static IStrategoTerm constCons34;

  protected static IStrategoTerm constCons33;

  protected static IStrategoTerm constFBOX19;

  protected static IStrategoTerm constS31;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm constS30;

  protected static IStrategoTerm constCons32;

  protected static IStrategoTerm constS29;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm constFBOX18;

  protected static IStrategoTerm constS28;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm constFBOX17;

  protected static IStrategoTerm constCons31;

  protected static IStrategoTerm constS27;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constFBOX16;

  protected static IStrategoTerm constS26;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm constCons30;

  protected static IStrategoTerm constS25;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm constFBOX15;

  protected static IStrategoTerm constS24;

  protected static IStrategoTerm constCons29;

  protected static IStrategoTerm constSOpt1;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm constS23;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constS22;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm constS21;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constS20;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm constS19;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm constS18;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm constS17;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm constFBOX14;

  protected static IStrategoTerm constS16;

  protected static IStrategoTerm constFBOX13;

  protected static IStrategoTerm constS15;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm constFBOX12;

  protected static IStrategoTerm constS14;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constFBOX11;

  protected static IStrategoTerm constS13;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constFBOX10;

  protected static IStrategoTerm constS12;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constFBOX9;

  protected static IStrategoTerm constS11;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm constFBOX8;

  protected static IStrategoTerm constS10;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm constFBOX7;

  protected static IStrategoTerm constS9;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm constH0;

  protected static IStrategoTerm constCons28;

  protected static IStrategoTerm constFBOX6;

  protected static IStrategoTerm constS8;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constCons27;

  protected static IStrategoTerm constFBOX5;

  protected static IStrategoTerm constS7;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constFBOX4;

  protected static IStrategoTerm constS6;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constFBOX3;

  protected static IStrategoTerm constS5;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constFBOX2;

  protected static IStrategoTerm constS4;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constFBOX1;

  protected static IStrategoTerm constS3;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm constFBOX0;

  protected static IStrategoTerm constS2;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm constKW0;

  protected static IStrategoTerm constS1;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm constCons26;

  protected static IStrategoTerm constS0;

  protected static IStrategoTerm const48;

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

  protected static IStrategoTerm const47;

  protected static IStrategoTerm constId27;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constNoPointcutBody0;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm constElemValPair3;

  protected static IStrategoTerm constLit5;

  protected static IStrategoTerm constString5;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constChars5;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm constParam1;

  protected static IStrategoTerm constId26;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm constClassOrInterfaceType1;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm constElemValPair2;

  protected static IStrategoTerm constLit4;

  protected static IStrategoTerm constString4;

  protected static IStrategoTerm constCons17;

  protected static IStrategoTerm constChars4;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm constCons16;

  protected static IStrategoTerm constElemValPair1;

  protected static IStrategoTerm constLit3;

  protected static IStrategoTerm constString3;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm constChars3;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constParam0;

  protected static IStrategoTerm constId25;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm constClassOrInterfaceType0;

  protected static IStrategoTerm constTypeName11;

  protected static IStrategoTerm constId24;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm constId23;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm constElemValPair0;

  protected static IStrategoTerm constLit2;

  protected static IStrategoTerm constString2;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constChars2;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constId22;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm constTypeName10;

  protected static IStrategoTerm constId21;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm constTypeName9;

  protected static IStrategoTerm constId20;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm constPackageOrTypeName3;

  protected static IStrategoTerm constId19;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constPackageOrTypeName2;

  protected static IStrategoTerm constId18;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm constPackageOrTypeName1;

  protected static IStrategoTerm constId17;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm constPackageOrTypeName0;

  protected static IStrategoTerm constId16;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm constCons11;

  protected static IStrategoTerm constPrivate0;

  protected static IStrategoTerm const27;

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

  protected static IStrategoTerm constTypeName8;

  protected static IStrategoTerm constId15;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm constLit1;

  protected static IStrategoTerm constString1;

  protected static IStrategoTerm constCons5;

  protected static IStrategoTerm constChars1;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm constLit0;

  protected static IStrategoTerm constString0;

  protected static IStrategoTerm constCons4;

  protected static IStrategoTerm constChars0;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm constCons3;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm constTypeName7;

  protected static IStrategoTerm constId14;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm constCons2;

  protected static IStrategoTerm constFormalWildcard0;

  protected static IStrategoTerm constMemberName0;

  protected static IStrategoTerm constModPattern0;

  protected static IStrategoTerm constTypeName6;

  protected static IStrategoTerm constId13;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm constRefTypePattern0;

  protected static IStrategoTerm constNamePattern0;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm constTypeName5;

  protected static IStrategoTerm constId12;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constId11;

  protected static IStrategoTerm constId10;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm constTypeName4;

  protected static IStrategoTerm constId9;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm constCons1;

  protected static IStrategoTerm constFinal0;

  protected static IStrategoTerm constCons0;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm constId8;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm constId7;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm constId6;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm constTypeName3;

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

  protected static IStrategoConstructor _consSome_1;

  protected static IStrategoConstructor _consAnno_2;

  protected static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consRegularTypePattern_1;

  public static IStrategoConstructor _consEJPCall_2;

  public static IStrategoConstructor _consScopedEJPCall_3;

  public static IStrategoConstructor _consExplicitJoinPoint_3;

  public static IStrategoConstructor _consPointcutargs_1;

  public static IStrategoConstructor _consPointcutarg_3;

  public static IStrategoConstructor _consDecError_2;

  public static IStrategoConstructor _consDecSoft_2;

  public static IStrategoConstructor _consDecNoMatch_4;

  public static IStrategoConstructor _consSimpleAnnoPatternValue_2;

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
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consAnno_2 = termFactory.makeConstructor("Anno", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consRegularTypePattern_1 = termFactory.makeConstructor("RegularTypePattern", 1);
    _consEJPCall_2 = termFactory.makeConstructor("EJPCall", 2);
    _consScopedEJPCall_3 = termFactory.makeConstructor("ScopedEJPCall", 3);
    _consExplicitJoinPoint_3 = termFactory.makeConstructor("ExplicitJoinPoint", 3);
    _consPointcutargs_1 = termFactory.makeConstructor("Pointcutargs", 1);
    _consPointcutarg_3 = termFactory.makeConstructor("Pointcutarg", 3);
    _consDecError_2 = termFactory.makeConstructor("DecError", 2);
    _consDecSoft_2 = termFactory.makeConstructor("DecSoft", 2);
    _consDecNoMatch_4 = termFactory.makeConstructor("DecNoMatch", 4);
    _consSimpleAnnoPatternValue_2 = termFactory.makeConstructor("SimpleAnnoPatternValue", 2);
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
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    const0 = termFactory.makeString("ClassAnno");
    constId0 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const0});
    constTypeName0 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId0});
    constNone0 = termFactory.makeAppl(transform._consNone_0, NO_TERMS);
    const1 = termFactory.makeString("ejpScopedInner");
    const2 = termFactory.makeString("MethodAnno");
    constId1 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const2});
    constTypeName1 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId1});
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    const3 = termFactory.makeString("SourceLocation");
    constId2 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const3});
    constTypeName2 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId2});
    const4 = termFactory.makeString("line");
    constId3 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const4});
    const5 = termFactory.makeString("file");
    constId4 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const5});
    const6 = termFactory.makeString("ExplicitScopedJoinPoint");
    constId5 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const6});
    constTypeName3 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId5});
    const7 = termFactory.makeString("joinpoint");
    constId6 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const7});
    const8 = termFactory.makeString("aspect");
    constId7 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const8});
    const9 = termFactory.makeString("args");
    constId8 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const9});
    const10 = termFactory.makeString("'ejp-call-to-method-invokation'");
    const11 = termFactory.makeString("_instance");
    constCons0 = (IStrategoTerm)termFactory.makeListCons(transform.const11, (IStrategoList)transform.constNil0);
    constFinal0 = termFactory.makeAppl(transform._consFinal_0, NO_TERMS);
    constCons1 = (IStrategoTerm)termFactory.makeListCons(transform.constFinal0, (IStrategoList)transform.constNil0);
    const12 = termFactory.makeString("'scoped-ejp-to-java'");
    const13 = termFactory.makeString("pointcut");
    const14 = termFactory.makeString("Pointcutargs");
    constId9 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const14});
    constTypeName4 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId9});
    const15 = termFactory.makeString("expr");
    constId10 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const15});
    constId11 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const13});
    constBlock0 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constNil0});
    const16 = termFactory.makeString("'remove-vars-decs-from-local-var-dec-stm'");
    const17 = termFactory.makeString("ejps.runtime.ClassAnno");
    constId12 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const17});
    constTypeName5 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId12});
    const18 = termFactory.makeString("*");
    constNamePattern0 = termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{transform.const18});
    constRefTypePattern0 = termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{transform.constNamePattern0});
    const19 = termFactory.makeString("ejps.runtime.MethodAnno");
    constId13 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const19});
    constTypeName6 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId13});
    constModPattern0 = termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{transform.constNil0});
    constMemberName0 = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{transform.const18});
    constFormalWildcard0 = termFactory.makeAppl(transform._consFormalWildcard_0, NO_TERMS);
    constCons2 = (IStrategoTerm)termFactory.makeListCons(transform.constFormalWildcard0, (IStrategoList)transform.constNil0);
    const20 = termFactory.makeString("ejps.runtime.EjpBlockAnno");
    constId14 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const20});
    constTypeName7 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId14});
    const21 = termFactory.makeString("nomatch$");
    const22 = termFactory.makeString("$");
    const23 = termFactory.makeString("ejp$");
    constCons3 = (IStrategoTerm)termFactory.makeListCons(transform.const22, (IStrategoList)transform.constNil0);
    const24 = termFactory.makeString("String");
    constChars0 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const24});
    constCons4 = (IStrategoTerm)termFactory.makeListCons(transform.constChars0, (IStrategoList)transform.constNil0);
    constString0 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons4});
    constLit0 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString0});
    const25 = termFactory.makeString("char");
    constChars1 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const25});
    constCons5 = (IStrategoTerm)termFactory.makeListCons(transform.constChars1, (IStrategoList)transform.constNil0);
    constString1 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons5});
    constLit1 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString1});
    const26 = termFactory.makeString("ExplicitJoinPoint");
    constId15 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const26});
    constTypeName8 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId15});
    constSimpleAnnoPatternExact0 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{transform.constTypeName8});
    constCons6 = (IStrategoTerm)termFactory.makeListCons(transform.constSimpleAnnoPatternExact0, (IStrategoList)transform.constNil0);
    constStatic0 = termFactory.makeAppl(transform._consStatic_0, NO_TERMS);
    constCons7 = (IStrategoTerm)termFactory.makeListCons(transform.constStatic0, (IStrategoList)transform.constCons1);
    constAnnoPattern0 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons6});
    constNot0 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{transform.constSimpleAnnoPatternExact0});
    constCons8 = (IStrategoTerm)termFactory.makeListCons(transform.constNot0, (IStrategoList)transform.constNil0);
    constAnnoPattern1 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons8});
    constSimpleAnnoPatternExact1 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{transform.constTypeName3});
    constCons9 = (IStrategoTerm)termFactory.makeListCons(transform.constSimpleAnnoPatternExact1, (IStrategoList)transform.constNil0);
    constAnnoPattern2 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons9});
    constNot1 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{transform.constSimpleAnnoPatternExact1});
    constCons10 = (IStrategoTerm)termFactory.makeListCons(transform.constNot1, (IStrategoList)transform.constNil0);
    constAnnoPattern3 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons10});
    const27 = termFactory.makeString("this(obj) && ");
    constPrivate0 = termFactory.makeAppl(transform._consPrivate_0, NO_TERMS);
    constCons11 = (IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, (IStrategoList)transform.constNil0);
    const28 = termFactory.makeString("org");
    constId16 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const28});
    constPackageOrTypeName0 = termFactory.makeAppl(transform._consPackageOrTypeName_1, new IStrategoTerm[]{transform.constId16});
    const29 = termFactory.makeString("aspectj");
    constId17 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const29});
    constPackageOrTypeName1 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName0, transform.constId17});
    const30 = termFactory.makeString("lang");
    constId18 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const30});
    constPackageOrTypeName2 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName1, transform.constId18});
    const31 = termFactory.makeString("annotation");
    constId19 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const31});
    constPackageOrTypeName3 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName2, transform.constId19});
    const32 = termFactory.makeString("Pointcut");
    constId20 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const32});
    constTypeName9 = termFactory.makeAppl(transform._consTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName3, transform.constId20});
    const33 = termFactory.makeString("NoMatch");
    constId21 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const33});
    constTypeName10 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId21});
    const34 = termFactory.makeString("granularity");
    constId22 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const34});
    const35 = termFactory.makeString("package");
    constChars2 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const35});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(transform.constChars2, (IStrategoList)transform.constNil0);
    constString2 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons12});
    constLit2 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString2});
    constElemValPair0 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId22, transform.constLit2});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair0, (IStrategoList)transform.constNil0);
    const36 = termFactory.makeString("error");
    constId23 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const36});
    const37 = termFactory.makeString("Object");
    constId24 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const37});
    constTypeName11 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId24});
    constClassOrInterfaceType0 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName11, transform.constNone0});
    const38 = termFactory.makeString("obj");
    constId25 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const38});
    constParam0 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constClassOrInterfaceType0, transform.constId25});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(transform.constParam0, (IStrategoList)transform.constNil0);
    const39 = termFactory.makeString("class");
    constChars3 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const39});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(transform.constChars3, (IStrategoList)transform.constNil0);
    constString3 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons15});
    constLit3 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString3});
    constElemValPair1 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId22, transform.constLit3});
    constCons16 = (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair1, (IStrategoList)transform.constNil0);
    const40 = termFactory.makeString("@withincode(anno) && @withincode(ejps.runtime.ExplicitScopedJoinPoint) && ");
    const41 = termFactory.makeString("ejp");
    constChars4 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const41});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(transform.constChars4, (IStrategoList)transform.constNil0);
    constString4 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons17});
    constLit4 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString4});
    constElemValPair2 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId22, transform.constLit4});
    constCons18 = (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair2, (IStrategoList)transform.constNil0);
    constClassOrInterfaceType1 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName1, transform.constNone0});
    const42 = termFactory.makeString("anno");
    constId26 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const42});
    constParam1 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constClassOrInterfaceType1, transform.constId26});
    constCons19 = (IStrategoTerm)termFactory.makeListCons(transform.constParam1, (IStrategoList)transform.constNil0);
    const43 = termFactory.makeString("@withincode(anno) && !@withincode(ejps.runtime.ExplicitScopedJoinPoint) && ");
    const44 = termFactory.makeString("method");
    constChars5 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const44});
    constCons20 = (IStrategoTerm)termFactory.makeListCons(transform.constChars5, (IStrategoList)transform.constNil0);
    constString5 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons20});
    constLit5 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString5});
    constElemValPair3 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId22, transform.constLit5});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair3, (IStrategoList)transform.constNil0);
    const45 = termFactory.makeString("'ejp-to-ajc'");
    constCons22 = (IStrategoTerm)termFactory.makeListCons(transform.constStatic0, (IStrategoList)transform.constNil0);
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons23 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constCons22);
    constCons24 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constNil0);
    constNoPointcutBody0 = termFactory.makeAppl(transform._consNoPointcutBody_0, NO_TERMS);
    const46 = termFactory.makeString("handles");
    constId27 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const46});
    const47 = termFactory.makeString("0");
    constDeci0 = termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{transform.const47});
    constLit6 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constDeci0});
    constSome0 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLit6});
    constFalse0 = termFactory.makeAppl(transform._consFalse_0, NO_TERMS);
    constLit7 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constFalse0});
    constSome1 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLit7});
    constNull0 = termFactory.makeAppl(transform._consNull_0, NO_TERMS);
    constLit8 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constNull0});
    constSome2 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLit8});
    constHS0 = termFactory.makeAppl(transform._consHS_0, NO_TERMS);
    constSOpt0 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constHS0, transform.const47});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt0, (IStrategoList)transform.constNil0);
    const48 = termFactory.makeString(")");
    constS0 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const48});
    constCons26 = (IStrategoTerm)termFactory.makeListCons(transform.constS0, (IStrategoList)transform.constNil0);
    const49 = termFactory.makeString("(");
    constS1 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const49});
    constKW0 = termFactory.makeAppl(transform._consKW_0, NO_TERMS);
    const50 = termFactory.makeString("initialization");
    constS2 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const50});
    constFBOX0 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS2});
    const51 = termFactory.makeString("preinitialization");
    constS3 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const51});
    constFBOX1 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS3});
    const52 = termFactory.makeString("staticinitialization");
    constS4 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const52});
    constFBOX2 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS4});
    const53 = termFactory.makeString("get");
    constS5 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const53});
    constFBOX3 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS5});
    const54 = termFactory.makeString("set");
    constS6 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const54});
    constFBOX4 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS6});
    const55 = termFactory.makeString("handler");
    constS7 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const55});
    constFBOX5 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS7});
    constCons27 = (IStrategoTerm)termFactory.makeListCons(transform.constS1, (IStrategoList)transform.constCons26);
    const56 = termFactory.makeString("adviceexecution");
    constS8 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const56});
    constFBOX6 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS8});
    constCons28 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX6, (IStrategoList)transform.constCons27);
    constH0 = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, transform.constCons28});
    const57 = termFactory.makeString("within");
    constS9 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const57});
    constFBOX7 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS9});
    const58 = termFactory.makeString("withincode");
    constS10 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const58});
    constFBOX8 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS10});
    const59 = termFactory.makeString("cflow");
    constS11 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const59});
    constFBOX9 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS11});
    const60 = termFactory.makeString("cflowbelow");
    constS12 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const60});
    constFBOX10 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS12});
    const61 = termFactory.makeString("if");
    constS13 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const61});
    constFBOX11 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS13});
    const62 = termFactory.makeString("this");
    constS14 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const62});
    constFBOX12 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS14});
    const63 = termFactory.makeString("target");
    constS15 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const63});
    constFBOX13 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS15});
    constS16 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const9});
    constFBOX14 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS16});
    const64 = termFactory.makeString("@this");
    constS17 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const64});
    const65 = termFactory.makeString("@target");
    constS18 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const65});
    const66 = termFactory.makeString("@within");
    constS19 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const66});
    const67 = termFactory.makeString("@withincode");
    constS20 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const67});
    const68 = termFactory.makeString("@annotation");
    constS21 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const68});
    const69 = termFactory.makeString("@args");
    constS22 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const69});
    const70 = termFactory.makeString(".");
    constS23 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const70});
    const71 = termFactory.makeString("1");
    constSOpt1 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constHS0, transform.const71});
    constCons29 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt1, (IStrategoList)transform.constNil0);
    constS24 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const13});
    constFBOX15 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS24});
    const72 = termFactory.makeString(";");
    constS25 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const72});
    constCons30 = (IStrategoTerm)termFactory.makeListCons(transform.constS25, (IStrategoList)transform.constNil0);
    const73 = termFactory.makeString(":");
    constS26 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const73});
    constFBOX16 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS25});
    const74 = termFactory.makeString("+");
    constS27 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const74});
    constCons31 = (IStrategoTerm)termFactory.makeListCons(transform.constS27, (IStrategoList)transform.constNil0);
    constFBOX17 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS23});
    const75 = termFactory.makeString("..");
    constS28 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const75});
    constFBOX18 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS28});
    const76 = termFactory.makeString("...");
    constS29 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const76});
    constCons32 = (IStrategoTerm)termFactory.makeListCons(transform.constS29, (IStrategoList)transform.constNil0);
    constS30 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const18});
    const77 = termFactory.makeString("new");
    constS31 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const77});
    constFBOX19 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS31});
    constCons33 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX19, (IStrategoList)transform.constNil0);
    constCons34 = (IStrategoTerm)termFactory.makeListCons(transform.constS23, (IStrategoList)transform.constCons33);
    constCons35 = (IStrategoTerm)termFactory.makeListCons(transform.constS28, (IStrategoList)transform.constCons33);
    const78 = termFactory.makeString("!");
    constS32 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const78});
    const79 = termFactory.makeString("throws");
    constS33 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const79});
    constFBOX20 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS33});
    const80 = termFactory.makeString("@");
    constS34 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const80});
    const81 = termFactory.makeString("&&");
    constS35 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const81});
    const82 = termFactory.makeString("||");
    constS36 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const82});
    constVS0 = termFactory.makeAppl(transform._consVS_0, NO_TERMS);
    constSOpt2 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constVS0, transform.const47});
    constCons36 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt2, (IStrategoList)transform.constNil0);
    constFBOX21 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS26});
    constFBOX22 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS0});
    constCons37 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX22, (IStrategoList)transform.constNil0);
    constFBOX23 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS1});
    const83 = termFactory.makeString("before");
    constS37 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const83});
    constFBOX24 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS37});
    const84 = termFactory.makeString("after");
    constS38 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const84});
    constFBOX25 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS38});
    const85 = termFactory.makeString("around");
    constS39 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const85});
    constFBOX26 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS39});
    const86 = termFactory.makeString("returning");
    constS40 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const86});
    constFBOX27 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS40});
    const87 = termFactory.makeString("throwing");
    constS41 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const87});
    constFBOX28 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS41});
    constCons38 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX16, (IStrategoList)transform.constNil0);
    const88 = termFactory.makeString("parents");
    constS42 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const88});
    constFBOX29 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS42});
    const89 = termFactory.makeString("declare");
    constS43 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const89});
    constFBOX30 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS43});
    const90 = termFactory.makeString("warning");
    constS44 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const90});
    constFBOX31 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS44});
    constS45 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const36});
    constFBOX32 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS45});
    const91 = termFactory.makeString("soft");
    constS46 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const91});
    constFBOX33 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS46});
    const92 = termFactory.makeString("precedence");
    constS47 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const92});
    constFBOX34 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS47});
    const93 = termFactory.makeString("@type");
    constS48 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const93});
    const94 = termFactory.makeString("@constructor");
    constS49 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const94});
    const95 = termFactory.makeString("@method");
    constS50 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const95});
    const96 = termFactory.makeString("@field");
    constS51 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const96});
    constS52 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const8});
    constFBOX35 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS52});
    const97 = termFactory.makeString("pertarget");
    constS53 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const97});
    constFBOX36 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS53});
    const98 = termFactory.makeString("perthis");
    constS54 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const98});
    constFBOX37 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS54});
    const99 = termFactory.makeString("percflow");
    constS55 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const99});
    constFBOX38 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS55});
    const100 = termFactory.makeString("percflowbelow");
    constS56 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const100});
    constFBOX39 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS56});
    const101 = termFactory.makeString("pertypewithin");
    constS57 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const101});
    constFBOX40 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS57});
    const102 = termFactory.makeString("issingleton");
    constS58 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const102});
    constFBOX41 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS58});
    const103 = termFactory.makeString("}");
    constS59 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const103});
    constFBOX42 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS59});
    constCons39 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX42, (IStrategoList)transform.constNil0);
    constIS0 = termFactory.makeAppl(transform._consIS_0, NO_TERMS);
    const104 = termFactory.makeString("2");
    constSOpt3 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constIS0, transform.const104});
    constCons40 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt3, (IStrategoList)transform.constNil0);
    constCons41 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt2, (IStrategoList)transform.constCons40);
    constSOpt4 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constVS0, transform.const71});
    constCons42 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt4, (IStrategoList)transform.constNil0);
    const105 = termFactory.makeString("{");
    constS60 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const105});
    constFBOX43 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS60});
    const106 = termFactory.makeString("privileged");
    constS61 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const106});
    constFBOX44 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS61});
    const107 = termFactory.makeString("proceed");
    constS62 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const107});
    constFBOX45 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS62});
    const108 = termFactory.makeString("call");
    constS63 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const108});
    constFBOX46 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS63});
    const109 = termFactory.makeString("execution");
    constS64 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const109});
    constFBOX47 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS64});
    const110 = termFactory.makeInt(80);
    const111 = termFactory.makeString("src");
    const112 = termFactory.makeString("generated");
    const113 = termFactory.makeString("w");
    constEjpTbl = new ImportTerm(termFactory, transform.class, "//", "ejp.tbl");
    const114 = termFactory.makeString("runtime");
    constId28 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const114});
    constCons43 = (IStrategoTerm)termFactory.makeListCons(transform.constId28, (IStrategoList)transform.constNil0);
    const115 = termFactory.makeString("ejps");
    constId29 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const115});
    constCons44 = (IStrategoTerm)termFactory.makeListCons(transform.constId29, (IStrategoList)transform.constCons43);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons44});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName0});
    constCons45 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec0, (IStrategoList)transform.constNil0);
    const116 = termFactory.makeString("'ejp-converter-compilation-unit'");
    const117 = termFactory.makeString("'check-for-change-in-aspect-or-class'");
    const118 = termFactory.makeString("'ejp-converter-aspect-or-class'");
  }

  @SuppressWarnings("all") public static class fetch_0_1 extends Strategy 
  { 
    public static fetch_0_1 instance = new fetch_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_78)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fetch_0_1");
      Fail0:
      { 
        IStrategoTerm term0 = term;
        IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success0:
        { 
          if(cons0 == transform._consMethodName_2)
          { 
            Fail1:
            { 
              IStrategoTerm c_11 = null;
              c_11 = term.getSubterm(0);
              term = this.invoke(context, c_11, d_78);
              if(term == null)
                break Fail1;
              if(true)
                break Success0;
            }
            term = term0;
          }
          Success1:
          { 
            if(cons0 == transform._consExprName_1)
            { 
              Fail2:
              { 
                IStrategoTerm a_11 = null;
                a_11 = term.getSubterm(0);
                term = this.invoke(context, a_11, d_78);
                if(term == null)
                  break Fail2;
                if(true)
                  break Success1;
              }
              term = term0;
            }
            Success2:
            { 
              if(cons0 == transform._consExprName_2)
              { 
                Fail3:
                { 
                  IStrategoTerm x_10 = null;
                  IStrategoTerm y_10 = null;
                  x_10 = term.getSubterm(0);
                  y_10 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{x_10, y_10});
                  term = this.invoke(context, term, d_78);
                  if(term == null)
                    break Fail3;
                  if(true)
                    break Success2;
                }
                term = term0;
              }
              Success3:
              { 
                if(cons0 == transform._consAmbName_2)
                { 
                  Fail4:
                  { 
                    IStrategoTerm v_10 = null;
                    v_10 = term.getSubterm(0);
                    IStrategoTerm arg1 = term.getSubterm(1);
                    if(arg1.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg1).getConstructor())
                      break Fail4;
                    term = this.invoke(context, v_10, d_78);
                    if(term == null)
                      break Fail4;
                    if(true)
                      break Success3;
                  }
                  term = term0;
                }
                Success4:
                { 
                  if(cons0 == transform._consAmbName_1)
                  { 
                    Fail5:
                    { 
                      IStrategoTerm s_10 = null;
                      s_10 = term.getSubterm(0);
                      term = this.invoke(context, s_10, d_78);
                      if(term == null)
                        break Fail5;
                      if(true)
                        break Success4;
                    }
                    term = term0;
                  }
                  if(cons0 == transform._consId_1)
                  { 
                    IStrategoTerm q_10 = null;
                    q_10 = term.getSubterm(0);
                    term = iset_add_0_1.instance.invoke(context, d_78, q_10);
                    if(term == null)
                      break Fail0;
                  }
                  else
                  { 
                    break Fail0;
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

  @SuppressWarnings("all") public static class ejp_to_java2_0_0 extends Strategy 
  { 
    public static ejp_to_java2_0_0 instance = new ejp_to_java2_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("ejp_to_java2_0_0");
      Fail6:
      { 
        IStrategoTerm d_11 = null;
        IStrategoTerm f_11 = null;
        IStrategoTerm g_11 = null;
        IStrategoTerm h_11 = null;
        IStrategoTerm i_11 = null;
        TermReference j_11 = new TermReference();
        IStrategoTerm k_11 = null;
        IStrategoTerm l_11 = null;
        TermReference m_11 = new TermReference();
        IStrategoTerm n_11 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail6;
        IStrategoTerm arg2 = term.getSubterm(0);
        if(arg2.getTermType() != IStrategoTerm.APPL || transform._consClassDecHead_5 != ((IStrategoAppl)arg2).getConstructor())
          break Fail6;
        d_11 = arg2.getSubterm(0);
        f_11 = arg2.getSubterm(1);
        g_11 = arg2.getSubterm(2);
        h_11 = arg2.getSubterm(3);
        i_11 = arg2.getSubterm(4);
        IStrategoTerm arg3 = term.getSubterm(1);
        if(arg3.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg3).getConstructor())
          break Fail6;
        k_11 = arg3.getSubterm(0);
        term = random_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail6;
        if(j_11.value == null)
          j_11.value = term;
        else
          if(j_11.value != term && !j_11.value.match(term))
            break Fail6;
        if(j_11.value == null)
          break Fail6;
        term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName0, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{j_11.value})})}), (IStrategoList)transform.constNil0), d_11);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail6;
        term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{term, f_11, g_11, h_11, i_11});
        n_11 = term;
        term = new_iset_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail6;
        if(m_11.value == null)
          m_11.value = term;
        else
          if(m_11.value != term && !m_11.value.match(term))
            break Fail6;
        term = k_11;
        lifted0 lifted00 = new lifted0();
        lifted00.j_11 = j_11;
        lifted00.m_11 = m_11;
        term = SRTS_all.instance.invoke(context, term, lifted00);
        if(term == null)
          break Fail6;
        l_11 = term;
        if(m_11.value == null)
          break Fail6;
        term = iset_elements_0_0.instance.invoke(context, m_11.value);
        if(term == null)
          break Fail6;
        term = termFactory.makeTuple(l_11, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail6;
        term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
        term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{n_11, term});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class ejp_to_java_0_4 extends Strategy 
  { 
    public static ejp_to_java_0_4 instance = new ejp_to_java_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_78, IStrategoTerm ref_f_78, IStrategoTerm ref_g_78, IStrategoTerm ref_h_78)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference e_78 = new TermReference(ref_e_78);
      TermReference f_78 = new TermReference(ref_f_78);
      TermReference g_78 = new TermReference(ref_g_78);
      TermReference h_78 = new TermReference(ref_h_78);
      context.push("ejp_to_java_0_4");
      Fail7:
      { 
        IStrategoTerm term5 = term;
        Success5:
        { 
          Fail8:
          { 
            IStrategoTerm j_16 = null;
            IStrategoTerm l_16 = null;
            IStrategoTerm m_16 = null;
            IStrategoTerm n_16 = null;
            IStrategoTerm o_16 = null;
            TermReference p_16 = new TermReference();
            IStrategoTerm q_16 = null;
            IStrategoTerm r_16 = null;
            IStrategoTerm s_16 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
              break Fail8;
            IStrategoTerm arg4 = term.getSubterm(0);
            if(arg4.getTermType() != IStrategoTerm.APPL || transform._consClassDecHead_5 != ((IStrategoAppl)arg4).getConstructor())
              break Fail8;
            j_16 = arg4.getSubterm(0);
            l_16 = arg4.getSubterm(1);
            m_16 = arg4.getSubterm(2);
            n_16 = arg4.getSubterm(3);
            o_16 = arg4.getSubterm(4);
            IStrategoTerm arg5 = term.getSubterm(1);
            if(arg5.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg5).getConstructor())
              break Fail8;
            q_16 = arg5.getSubterm(0);
            IStrategoTerm term6 = term;
            Success6:
            { 
              Fail9:
              { 
                IStrategoTerm t_16 = null;
                IStrategoTerm u_16 = null;
                IStrategoTerm w_16 = null;
                t_16 = term;
                term = l_16;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail9;
                u_16 = term.getSubterm(0);
                w_16 = u_16;
                term = string_starts_with_0_1.instance.invoke(context, w_16, transform.const1);
                if(term == null)
                  break Fail9;
                term = t_16;
                { 
                  term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{j_16, l_16, m_16, n_16, o_16});
                  r_16 = term;
                  term = q_16;
                  lifted2 lifted210 = new lifted2();
                  lifted210.e_78 = e_78;
                  lifted210.f_78 = f_78;
                  lifted210.g_78 = g_78;
                  lifted210.h_78 = h_78;
                  term = SRTS_all.instance.invoke(context, term, lifted210);
                  if(term == null)
                    break Fail8;
                  term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
                  s_16 = term;
                  if(true)
                    break Success6;
                }
              }
              term = term6;
              term = random_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail8;
              if(p_16.value == null)
                p_16.value = term;
              else
                if(p_16.value != term && !p_16.value.match(term))
                  break Fail8;
              if(p_16.value == null)
                break Fail8;
              term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName0, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{p_16.value})})}), (IStrategoList)transform.constNil0), j_16);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail8;
              term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{term, l_16, m_16, n_16, o_16});
              r_16 = term;
              term = q_16;
              lifted4 lifted410 = new lifted4();
              lifted410.e_78 = e_78;
              lifted410.p_16 = p_16;
              lifted410.g_78 = g_78;
              lifted410.h_78 = h_78;
              term = SRTS_all.instance.invoke(context, term, lifted410);
              if(term == null)
                break Fail8;
              term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
              s_16 = term;
            }
            term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{r_16, s_16});
            if(true)
              break Success5;
          }
          term = term5;
          IStrategoTerm term7 = term;
          Success7:
          { 
            Fail10:
            { 
              IStrategoTerm n_15 = null;
              IStrategoTerm p_15 = null;
              IStrategoTerm q_15 = null;
              IStrategoTerm r_15 = null;
              IStrategoTerm s_15 = null;
              IStrategoTerm t_15 = null;
              TermReference u_15 = new TermReference();
              IStrategoTerm v_15 = null;
              IStrategoTerm w_15 = null;
              IStrategoTerm x_15 = null;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
                break Fail10;
              IStrategoTerm arg6 = term.getSubterm(0);
              if(arg6.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)arg6).getConstructor())
                break Fail10;
              n_15 = arg6.getSubterm(0);
              p_15 = arg6.getSubterm(1);
              q_15 = arg6.getSubterm(2);
              r_15 = arg6.getSubterm(3);
              s_15 = arg6.getSubterm(4);
              t_15 = arg6.getSubterm(5);
              IStrategoTerm arg7 = term.getSubterm(1);
              if(arg7.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg7).getConstructor())
                break Fail10;
              v_15 = arg7.getSubterm(0);
              term = s_15;
              lifted6 lifted610 = new lifted6();
              lifted610.e_78 = e_78;
              term = SRTS_all.instance.invoke(context, term, lifted610);
              if(term == null)
                break Fail10;
              IStrategoTerm term8 = term;
              Success8:
              { 
                Fail11:
                { 
                  IStrategoTerm y_15 = null;
                  y_15 = term;
                  term = fetch_1_0.instance.invoke(context, n_15, lifted8.instance);
                  if(term == null)
                    break Fail11;
                  term = y_15;
                  { 
                    term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{n_15, p_15, q_15, r_15, s_15, t_15});
                    w_15 = term;
                    lifted9 lifted90 = new lifted9();
                    lifted90.e_78 = e_78;
                    lifted90.f_78 = f_78;
                    lifted90.g_78 = g_78;
                    lifted90.h_78 = h_78;
                    term = allow_extends_1_1.instance.invoke(context, term, lifted90, v_15);
                    if(term == null)
                      break Fail10;
                    term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term});
                    x_15 = term;
                    if(true)
                      break Success8;
                  }
                }
                term = term8;
                term = random_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail10;
                if(u_15.value == null)
                  u_15.value = term;
                else
                  if(u_15.value != term && !u_15.value.match(term))
                    break Fail10;
                if(u_15.value == null)
                  break Fail10;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName1, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{u_15.value})})}), (IStrategoList)transform.constNil0), n_15);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail10;
                term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{term, p_15, q_15, r_15, s_15, t_15});
                w_15 = term;
                lifted10 lifted100 = new lifted10();
                lifted100.e_78 = e_78;
                lifted100.f_78 = f_78;
                lifted100.u_15 = u_15;
                lifted100.h_78 = h_78;
                term = allow_extends_1_1.instance.invoke(context, term, lifted100, v_15);
                if(term == null)
                  break Fail10;
                term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term});
                x_15 = term;
              }
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{w_15, x_15});
              if(true)
                break Success7;
            }
            term = term7;
            IStrategoTerm term9 = term;
            Success9:
            { 
              Fail12:
              { 
                IStrategoTerm g_15 = null;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail12;
                g_15 = term.getSubterm(0);
                term = g_15;
                lifted11 lifted111 = new lifted11();
                lifted111.e_78 = e_78;
                lifted111.f_78 = f_78;
                lifted111.g_78 = g_78;
                lifted111.h_78 = h_78;
                term = SRTS_all.instance.invoke(context, term, lifted111);
                if(term == null)
                  break Fail12;
                if(true)
                  break Success9;
              }
              term = term9;
              IStrategoTerm term10 = term;
              Success10:
              { 
                Fail13:
                { 
                  TermReference y_14 = new TermReference();
                  TermReference z_14 = new TermReference();
                  IStrategoTerm a_15 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail13;
                  IStrategoTerm arg12 = term.getSubterm(0);
                  if(arg12.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg12).getConstructor())
                    break Fail13;
                  if(y_14.value == null)
                    y_14.value = arg12.getSubterm(0);
                  else
                    if(y_14.value != arg12.getSubterm(0) && !y_14.value.match(arg12.getSubterm(0)))
                      break Fail13;
                  if(z_14.value == null)
                    z_14.value = arg12.getSubterm(1);
                  else
                    if(z_14.value != arg12.getSubterm(1) && !z_14.value.match(arg12.getSubterm(1)))
                      break Fail13;
                  a_15 = arg12.getSubterm(2);
                  term = a_15;
                  lifted13 lifted130 = new lifted13();
                  lifted130.e_78 = e_78;
                  lifted130.y_14 = y_14;
                  lifted130.z_14 = z_14;
                  lifted130.f_78 = f_78;
                  lifted130.g_78 = g_78;
                  lifted130.h_78 = h_78;
                  term = map_1_0.instance.invoke(context, term, lifted130);
                  if(term == null)
                    break Fail13;
                  term = concat_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail13;
                  if(true)
                    break Success10;
                }
                term = term10;
                IStrategoTerm term11 = term;
                Success11:
                { 
                  Fail14:
                  { 
                    TermReference k_14 = new TermReference();
                    IStrategoTerm l_14 = null;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consInstanceInit_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail14;
                    IStrategoTerm arg13 = term.getSubterm(0);
                    if(arg13.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg13).getConstructor())
                      break Fail14;
                    l_14 = arg13.getSubterm(0);
                    term = new_hashtable_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail14;
                    if(k_14.value == null)
                      k_14.value = term;
                    else
                      if(k_14.value != term && !k_14.value.match(term))
                        break Fail14;
                    term = l_14;
                    lifted14 lifted140 = new lifted14();
                    lifted140.k_14 = k_14;
                    lifted140.h_78 = h_78;
                    term = SRTS_all.instance.invoke(context, term, lifted140);
                    if(term == null)
                      break Fail14;
                    term = termFactory.makeAppl(transform._consInstanceInit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term})});
                    if(true)
                      break Success11;
                  }
                  term = term11;
                  IStrategoTerm term12 = term;
                  Success12:
                  { 
                    Fail15:
                    { 
                      TermReference w_13 = new TermReference();
                      IStrategoTerm x_13 = null;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consStaticInit_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail15;
                      IStrategoTerm arg14 = term.getSubterm(0);
                      if(arg14.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg14).getConstructor())
                        break Fail15;
                      x_13 = arg14.getSubterm(0);
                      term = new_hashtable_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail15;
                      if(w_13.value == null)
                        w_13.value = term;
                      else
                        if(w_13.value != term && !w_13.value.match(term))
                          break Fail15;
                      term = x_13;
                      lifted16 lifted160 = new lifted16();
                      lifted160.w_13 = w_13;
                      lifted160.h_78 = h_78;
                      term = SRTS_all.instance.invoke(context, term, lifted160);
                      if(term == null)
                        break Fail15;
                      term = termFactory.makeAppl(transform._consStaticInit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term})});
                      if(true)
                        break Success12;
                    }
                    term = term12;
                    IStrategoTerm term13 = term;
                    IStrategoConstructor cons2 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                    Success13:
                    { 
                      if(cons2 == transform._consExprStm_1)
                      { 
                        Fail16:
                        { 
                          IStrategoTerm n_13 = null;
                          IStrategoTerm o_13 = null;
                          IStrategoTerm p_13 = null;
                          IStrategoTerm arg15 = term.getSubterm(0);
                          if(arg15.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg15).getConstructor())
                            break Fail16;
                          n_13 = arg15.getSubterm(0);
                          IStrategoTerm arg16 = arg15.getSubterm(1);
                          if(arg16.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg16).getConstructor())
                            break Fail16;
                          o_13 = arg16.getSubterm(0);
                          p_13 = arg16.getSubterm(1);
                          term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{o_13, p_13});
                          term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, e_78.value, f_78.value, g_78.value, h_78.value);
                          if(term == null)
                            break Fail16;
                          term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{n_13, term})});
                          if(true)
                            break Success13;
                        }
                        term = term13;
                      }
                      Success14:
                      { 
                        if(cons2 == transform._consExprStm_1)
                        { 
                          Fail17:
                          { 
                            IStrategoTerm f_13 = null;
                            IStrategoTerm g_13 = null;
                            IStrategoTerm arg17 = term.getSubterm(0);
                            if(arg17.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg17).getConstructor())
                              break Fail17;
                            f_13 = arg17.getSubterm(0);
                            g_13 = arg17.getSubterm(1);
                            term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{f_13, g_13});
                            term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, e_78.value, f_78.value, g_78.value, h_78.value);
                            if(term == null)
                              break Fail17;
                            term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{term});
                            if(true)
                              break Success14;
                          }
                          term = term13;
                        }
                        Success15:
                        { 
                          if(cons2 == transform._consExprStm_1)
                          { 
                            Fail18:
                            { 
                              IStrategoTerm t_12 = null;
                              IStrategoTerm u_12 = null;
                              IStrategoTerm v_12 = null;
                              IStrategoTerm w_12 = null;
                              IStrategoTerm x_12 = null;
                              IStrategoTerm arg18 = term.getSubterm(0);
                              if(arg18.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg18).getConstructor())
                                break Fail18;
                              t_12 = arg18.getSubterm(0);
                              u_12 = arg18.getSubterm(1);
                              IStrategoTerm arg19 = arg18.getSubterm(2);
                              if(arg19.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg19).getConstructor())
                                break Fail18;
                              v_12 = arg19.getSubterm(0);
                              IStrategoList annos0 = arg18.getAnnotations();
                              if(annos0.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos0).isEmpty())
                                break Fail18;
                              w_12 = ((IStrategoList)annos0).head();
                              IStrategoTerm arg20 = ((IStrategoList)annos0).tail();
                              if(arg20.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg20).isEmpty())
                                break Fail18;
                              term = create_method_invokation_0_1.instance.invoke(context, term, t_12);
                              if(term == null)
                                break Fail18;
                              x_12 = term;
                              term = termFactory.annotateTerm(termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{t_12, u_12, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{v_12})}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(w_12, (IStrategoList)transform.constNil0)));
                              term = scoped_ejp_to_java_0_4.instance.invoke(context, term, e_78.value, f_78.value, g_78.value, h_78.value);
                              if(term == null)
                                break Fail18;
                              term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{x_12}), (IStrategoList)transform.constNil0), term);
                              term = conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail18;
                              if(true)
                                break Success15;
                            }
                            term = term13;
                          }
                          if(cons2 == transform._consExprStm_1)
                          { 
                            IStrategoTerm h_12 = null;
                            IStrategoTerm i_12 = null;
                            IStrategoTerm j_12 = null;
                            IStrategoTerm k_12 = null;
                            IStrategoTerm l_12 = null;
                            IStrategoTerm arg21 = term.getSubterm(0);
                            if(arg21.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg21).getConstructor())
                              break Fail7;
                            h_12 = arg21.getSubterm(0);
                            IStrategoTerm arg22 = arg21.getSubterm(1);
                            if(arg22.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg22).getConstructor())
                              break Fail7;
                            i_12 = arg22.getSubterm(0);
                            j_12 = arg22.getSubterm(1);
                            IStrategoTerm arg23 = arg22.getSubterm(2);
                            if(arg23.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg23).getConstructor())
                              break Fail7;
                            k_12 = arg23.getSubterm(0);
                            term = create_method_invokation_0_1.instance.invoke(context, term, i_12);
                            if(term == null)
                              break Fail7;
                            l_12 = term;
                            term = termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{i_12, j_12, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{k_12})});
                            term = scoped_ejp_to_java_0_4.instance.invoke(context, term, e_78.value, f_78.value, g_78.value, h_78.value);
                            if(term == null)
                              break Fail7;
                            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{h_12, l_12})}), (IStrategoList)transform.constNil0), term);
                            term = conc_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail7;
                          }
                          else
                          { 
                            break Fail7;
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

  @SuppressWarnings("all") public static class convert_one_var_dec_0_6 extends Strategy 
  { 
    public static convert_one_var_dec_0_6 instance = new convert_one_var_dec_0_6();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_17, IStrategoTerm i_17, IStrategoTerm j_17, IStrategoTerm k_17, IStrategoTerm l_17, IStrategoTerm m_17)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("convert_one_var_dec_0_6");
      Fail19:
      { 
        IStrategoTerm n_17 = null;
        IStrategoTerm o_17 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail19;
        n_17 = term.getSubterm(0);
        o_17 = term.getSubterm(1);
        term = termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{n_17, transform.constNone0});
        term = add_local_var_0_2.instance.invoke(context, term, h_17, j_17);
        if(term == null)
          break Fail19;
        Success16:
        { 
          Fail20:
          { 
            IStrategoTerm p_17 = null;
            p_17 = term;
            term = or_2_0.instance.invoke(context, o_17, lifted18.instance, lifted19.instance);
            if(term == null)
              break Fail20;
            term = p_17;
            { 
              term = termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{n_17, o_17});
              term = convert_var_dec_by_ejp_call_0_6.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{h_17, i_17, j_17, k_17, l_17, m_17});
              if(term == null)
                break Fail19;
              if(true)
                break Success16;
            }
          }
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{i_17, j_17, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{n_17, o_17}), (IStrategoList)transform.constNil0)})}), (IStrategoList)transform.constNil0);
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

  @SuppressWarnings("all") public static class convert_var_dec_by_ejp_call_0_6 extends Strategy 
  { 
    public static convert_var_dec_by_ejp_call_0_6 instance = new convert_var_dec_by_ejp_call_0_6();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_78, IStrategoTerm j_78, IStrategoTerm k_78, IStrategoTerm l_78, IStrategoTerm m_78, IStrategoTerm n_78)
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
              IStrategoTerm k_18 = null;
              IStrategoTerm l_18 = null;
              IStrategoTerm m_18 = null;
              k_18 = term.getSubterm(0);
              IStrategoTerm arg29 = term.getSubterm(1);
              if(arg29.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg29).getConstructor())
                break Fail22;
              l_18 = arg29.getSubterm(0);
              m_18 = arg29.getSubterm(1);
              term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{l_18, m_18});
              term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, i_78, l_78, m_78, n_78);
              if(term == null)
                break Fail22;
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{j_78, k_78, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{k_18, term}), (IStrategoList)transform.constNil0)})}), (IStrategoList)transform.constNil0);
              if(true)
                break Success17;
            }
            term = term17;
          }
          if(cons3 == transform._consVarDec_2)
          { 
            IStrategoTerm w_17 = null;
            IStrategoTerm x_17 = null;
            IStrategoTerm y_17 = null;
            IStrategoTerm z_17 = null;
            IStrategoTerm a_18 = null;
            w_17 = term.getSubterm(0);
            IStrategoTerm arg30 = term.getSubterm(1);
            if(arg30.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg30).getConstructor())
              break Fail21;
            x_17 = arg30.getSubterm(0);
            y_17 = arg30.getSubterm(1);
            IStrategoTerm arg31 = arg30.getSubterm(2);
            if(arg31.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg31).getConstructor())
              break Fail21;
            z_17 = arg31.getSubterm(0);
            term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{x_17, y_17});
            term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, i_78, l_78, m_78, n_78);
            if(term == null)
              break Fail21;
            a_18 = term;
            term = termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{x_17, y_17, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{z_17})});
            term = scoped_ejp_to_java_0_4.instance.invoke(context, term, i_78, l_78, m_78, n_78);
            if(term == null)
              break Fail21;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{j_78, k_78, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{w_17, a_18}), (IStrategoList)transform.constNil0)})}), (IStrategoList)transform.constNil0), term);
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

  @SuppressWarnings("all") public static class add_local_vars_0_1 extends Strategy 
  { 
    public static add_local_vars_0_1 instance = new add_local_vars_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_78)
    { 
      TermReference o_78 = new TermReference(ref_o_78);
      context.push("add_local_vars_0_1");
      Fail23:
      { 
        IStrategoTerm term18 = term;
        Success18:
        { 
          Fail24:
          { 
            IStrategoTerm v_18 = null;
            TermReference w_18 = new TermReference();
            IStrategoTerm x_18 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
              break Fail24;
            IStrategoTerm arg32 = term.getSubterm(0);
            if(arg32.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg32).getConstructor())
              break Fail24;
            if(w_18.value == null)
              w_18.value = arg32.getSubterm(1);
            else
              if(w_18.value != arg32.getSubterm(1) && !w_18.value.match(arg32.getSubterm(1)))
                break Fail24;
            v_18 = arg32.getSubterm(2);
            x_18 = term;
            term = v_18;
            lifted20 lifted200 = new lifted20();
            lifted200.o_78 = o_78;
            lifted200.w_18 = w_18;
            term = SRTS_all.instance.invoke(context, term, lifted200);
            if(term == null)
              break Fail24;
            term = x_18;
            if(true)
              break Success18;
          }
          term = term18;
          TermReference q_18 = new TermReference();
          IStrategoTerm r_18 = null;
          lifted25 lifted250 = new lifted25();
          lifted22 lifted220 = new lifted22();
          lifted250.q_18 = q_18;
          lifted220.q_18 = q_18;
          term = or_2_0.instance.invoke(context, term, lifted220, lifted250);
          if(term == null)
            break Fail23;
          r_18 = term;
          if(q_18.value == null)
            break Fail23;
          term = q_18.value;
          lifted26 lifted260 = new lifted26();
          lifted260.o_78 = o_78;
          term = SRTS_all.instance.invoke(context, term, lifted260);
          if(term == null)
            break Fail23;
          term = r_18;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add_local_var_0_2 extends Strategy 
  { 
    public static add_local_var_0_2 instance = new add_local_var_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_19, IStrategoTerm b_19)
    { 
      context.push("add_local_var_0_2");
      Fail25:
      { 
        TermReference c_19 = new TermReference();
        IStrategoTerm d_19 = null;
        lifted29 lifted290 = new lifted29();
        lifted28 lifted280 = new lifted28();
        lifted290.c_19 = c_19;
        lifted280.c_19 = c_19;
        term = or_2_0.instance.invoke(context, term, lifted280, lifted290);
        if(term == null)
          break Fail25;
        d_19 = term;
        term = hashtable_remove_0_1.instance.invoke(context, a_19, c_19.value);
        if(term == null)
          break Fail25;
        term = hashtable_put_0_2.instance.invoke(context, a_19, c_19.value, b_19);
        if(term == null)
          break Fail25;
        term = d_19;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class process_method_param_0_1 extends Strategy 
  { 
    public static process_method_param_0_1 instance = new process_method_param_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_19)
    { 
      context.push("process_method_param_0_1");
      Fail26:
      { 
        TermReference h_19 = new TermReference();
        TermReference i_19 = new TermReference();
        IStrategoTerm j_19 = null;
        lifted31 lifted311 = new lifted31();
        lifted30 lifted300 = new lifted30();
        lifted311.i_19 = i_19;
        lifted311.h_19 = h_19;
        lifted300.i_19 = i_19;
        lifted300.h_19 = h_19;
        term = or_2_0.instance.invoke(context, term, lifted300, lifted311);
        if(term == null)
          break Fail26;
        j_19 = term;
        term = hashtable_put_0_2.instance.invoke(context, g_19, h_19.value, i_19.value);
        if(term == null)
          break Fail26;
        term = j_19;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_auxilery_class_0_6 extends Strategy 
  { 
    public static gen_auxilery_class_0_6 instance = new gen_auxilery_class_0_6();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_19, IStrategoTerm n_19, IStrategoTerm o_19, IStrategoTerm p_19, IStrategoTerm q_19, IStrategoTerm r_19)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_auxilery_class_0_6");
      Fail27:
      { 
        IStrategoTerm v_19 = null;
        IStrategoTerm a_20 = null;
        IStrategoTerm b_20 = null;
        IStrategoTerm c_20 = null;
        v_19 = term;
        term = o_19;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail27;
        term = gen_compact_var_declaration_0_2.instance.invoke(context, term, m_19, n_19);
        if(term == null)
          break Fail27;
        a_20 = term;
        term = gen_method_annotation_0_0.instance.invoke(context, o_19);
        if(term == null)
          break Fail27;
        b_20 = term;
        term = debug_0_0.instance.invoke(context, r_19);
        if(term == null)
          break Fail27;
        term = gen_source_location_ann_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail27;
        c_20 = term;
        term = gen__ejpscope__method__name_0_0.instance.invoke(context, o_19);
        if(term == null)
          break Fail27;
        term = (IStrategoTerm)termFactory.makeListCons(a_20, termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName1, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{q_19})})}), termFactory.makeListCons(b_20, termFactory.makeListCons(c_20, (IStrategoList)transform.constNil0))), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constNil0, transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{v_19})}), (IStrategoList)transform.constNil0), (IStrategoList)transform.constNil0));
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail27;
        term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{p_19}), transform.constNone0, transform.constNone0, transform.constNone0}), termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term})});
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

  @SuppressWarnings("all") public static class gen_source_location_ann_0_0 extends Strategy 
  { 
    public static gen_source_location_ann_0_0 instance = new gen_source_location_ann_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_source_location_ann_0_0");
      Fail28:
      { 
        IStrategoTerm i_20 = null;
        IStrategoTerm j_20 = null;
        i_20 = term;
        term = get_file_0_0.instance.invoke(context, i_20);
        if(term == null)
          break Fail28;
        j_20 = term;
        term = get_location_0_0.instance.invoke(context, i_20);
        if(term == null)
          break Fail28;
        term = get_line_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28;
        term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{j_20}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{term})})}), (IStrategoList)transform.constNil0))});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_location_0_0 extends Strategy 
  { 
    public static get_location_0_0 instance = new get_location_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail29:
      { 
        IStrategoTerm p_20 = null;
        IStrategoList annos1 = term.getAnnotations();
        if(annos1.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos1).isEmpty())
          break Fail29;
        IStrategoTerm arg56 = ((IStrategoList)annos1).head();
        if(arg56.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg56).isEmpty())
          break Fail29;
        p_20 = ((IStrategoList)arg56).head();
        IStrategoTerm arg57 = ((IStrategoList)annos1).tail();
        if(arg57.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg57).isEmpty())
          break Fail29;
        term = p_20;
        if(true)
          return term;
      }
      context.push("get_location_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_file_0_0 extends Strategy 
  { 
    public static get_file_0_0 instance = new get_file_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail30:
      { 
        IStrategoTerm s_20 = null;
        IStrategoList annos2 = term.getAnnotations();
        if(annos2.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos2).isEmpty())
          break Fail30;
        IStrategoTerm arg58 = ((IStrategoList)annos2).head();
        if(arg58.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg58).isEmpty())
          break Fail30;
        IStrategoTerm arg59 = ((IStrategoList)arg58).tail();
        if(arg59.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg59).isEmpty())
          break Fail30;
        s_20 = ((IStrategoList)arg59).head();
        IStrategoTerm arg60 = ((IStrategoList)arg59).tail();
        if(arg60.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg60).isEmpty())
          break Fail30;
        IStrategoTerm arg61 = ((IStrategoList)annos2).tail();
        if(arg61.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg61).isEmpty())
          break Fail30;
        term = s_20;
        if(true)
          return term;
      }
      context.push("get_file_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_line_0_0 extends Strategy 
  { 
    public static get_line_0_0 instance = new get_line_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail31:
      { 
        IStrategoTerm t_20 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
          break Fail31;
        t_20 = term.getSubterm(0);
        term = t_20;
        if(true)
          return term;
      }
      context.push("get_line_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_method_annotation_0_0 extends Strategy 
  { 
    public static gen_method_annotation_0_0 instance = new gen_method_annotation_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_annotation_0_0");
      Fail32:
      { 
        IStrategoTerm u_20 = null;
        IStrategoTerm v_20 = null;
        IStrategoTerm w_20 = null;
        IStrategoTerm x_20 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail32;
        v_20 = term.getSubterm(0);
        IStrategoTerm arg65 = term.getSubterm(1);
        if(arg65.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg65).getConstructor())
          break Fail32;
        w_20 = arg65.getSubterm(0);
        u_20 = term.getSubterm(2);
        term = map_1_0.instance.invoke(context, u_20, fetch_type_0_0.instance);
        if(term == null)
          break Fail32;
        x_20 = term;
        term = pp_aspectj_string_0_0.instance.invoke(context, v_20);
        if(term == null)
          break Fail32;
        term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName3, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId8, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{x_20})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId6, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{w_20}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0)))});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_compact_var_declaration_0_2 extends Strategy 
  { 
    public static gen_compact_var_declaration_0_2 instance = new gen_compact_var_declaration_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_21, IStrategoTerm ref_c_21)
    { 
      TermReference c_21 = new TermReference(ref_c_21);
      context.push("gen_compact_var_declaration_0_2");
      Fail33:
      { 
        TermReference d_21 = new TermReference();
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail33;
        if(d_21.value == null)
          d_21.value = term;
        else
          if(d_21.value != term && !d_21.value.match(term))
            break Fail33;
        term = iset_elements_0_0.instance.invoke(context, b_21);
        if(term == null)
          break Fail33;
        lifted33 lifted330 = new lifted33();
        lifted330.d_21 = d_21;
        lifted330.c_21 = c_21;
        term = map_1_0.instance.invoke(context, term, lifted330);
        if(term == null)
          break Fail33;
        if(d_21.value == null)
          break Fail33;
        term = hashtable_keys_0_0.instance.invoke(context, d_21.value);
        if(term == null)
          break Fail33;
        lifted34 lifted340 = new lifted34();
        lifted340.d_21 = d_21;
        term = map_1_0.instance.invoke(context, term, lifted340);
        if(term == null)
          break Fail33;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_before_call_assignments_0_2 extends Strategy 
  { 
    public static gen_before_call_assignments_0_2 instance = new gen_before_call_assignments_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_21, IStrategoTerm ref_o_21)
    { 
      TermReference o_21 = new TermReference(ref_o_21);
      context.push("gen_before_call_assignments_0_2");
      Fail34:
      { 
        term = iset_elements_0_0.instance.invoke(context, n_21);
        if(term == null)
          break Fail34;
        lifted36 lifted360 = new lifted36();
        lifted360.o_21 = o_21;
        term = map_1_0.instance.invoke(context, term, lifted360);
        if(term == null)
          break Fail34;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_after_call_simple_assignments_0_2 extends Strategy 
  { 
    public static gen_after_call_simple_assignments_0_2 instance = new gen_after_call_simple_assignments_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_21, IStrategoTerm ref_r_21)
    { 
      TermReference r_21 = new TermReference(ref_r_21);
      context.push("gen_after_call_simple_assignments_0_2");
      Fail35:
      { 
        term = iset_elements_0_0.instance.invoke(context, q_21);
        if(term == null)
          break Fail35;
        lifted37 lifted370 = new lifted37();
        lifted370.r_21 = r_21;
        term = map_1_0.instance.invoke(context, term, lifted370);
        if(term == null)
          break Fail35;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_after_call_assignments_with_declarations_0_2 extends Strategy 
  { 
    public static gen_after_call_assignments_with_declarations_0_2 instance = new gen_after_call_assignments_with_declarations_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_21, IStrategoTerm ref_u_21)
    { 
      TermReference t_21 = new TermReference(ref_t_21);
      TermReference u_21 = new TermReference(ref_u_21);
      context.push("gen_after_call_assignments_with_declarations_0_2");
      Fail36:
      { 
        if(t_21.value == null)
          break Fail36;
        term = hashtable_keys_0_0.instance.invoke(context, t_21.value);
        if(term == null)
          break Fail36;
        lifted38 lifted380 = new lifted38();
        lifted380.t_21 = t_21;
        lifted380.u_21 = u_21;
        term = map_1_0.instance.invoke(context, term, lifted380);
        if(term == null)
          break Fail36;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class create_method_invokation_0_2 extends Strategy 
  { 
    public static create_method_invokation_0_2 instance = new create_method_invokation_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_21, IStrategoTerm z_21)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("create_method_invokation_0_2");
      Fail37:
      { 
        term = z_21;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail37;
        term = gen__ejpscope__method__name_0_0.instance.invoke(context, z_21);
        if(term == null)
          break Fail37;
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{y_21})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constNil0});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class create_method_invokation_0_1 extends Strategy 
  { 
    public static create_method_invokation_0_1 instance = new create_method_invokation_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_22)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("create_method_invokation_0_1");
      Fail38:
      { 
        IStrategoTerm d_22 = null;
        IStrategoTerm e_22 = null;
        IStrategoTerm f_22 = null;
        term = c_22;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail38;
        d_22 = term.getSubterm(0);
        e_22 = term.getSubterm(1);
        f_22 = term.getSubterm(2);
        term = typename__2__ambname_0_0.instance.invoke(context, d_22);
        if(term == null)
          break Fail38;
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{term, e_22})}), f_22});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class remove_scoped_ejp_var_decs_0_0 extends Strategy 
  { 
    public static remove_scoped_ejp_var_decs_0_0 instance = new remove_scoped_ejp_var_decs_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("remove_scoped_ejp_var_decs_0_0");
      Fail39:
      { 
        IStrategoTerm i_22 = null;
        i_22 = term;
        term = allow_extends_1_1.instance.invoke(context, term, remove_vars_decs_from_local_var_dec_stm_0_0.instance, i_22);
        if(term == null)
          break Fail39;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class ejp_call_to_method_invokation_0_4 extends Strategy 
  { 
    public static ejp_call_to_method_invokation_0_4 instance = new ejp_call_to_method_invokation_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_22, IStrategoTerm ref_q_22, IStrategoTerm ref_r_22, IStrategoTerm ref_s_22)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference q_22 = new TermReference(ref_q_22);
      TermReference r_22 = new TermReference(ref_r_22);
      TermReference s_22 = new TermReference(ref_s_22);
      context.push("ejp_call_to_method_invokation_0_4");
      Fail40:
      { 
        TermReference t_22 = new TermReference();
        IStrategoTerm u_22 = null;
        TermReference w_22 = new TermReference();
        IStrategoTerm x_22 = null;
        IStrategoTerm y_22 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)term).getConstructor())
          break Fail40;
        if(w_22.value == null)
          w_22.value = term.getSubterm(0);
        else
          if(w_22.value != term.getSubterm(0) && !w_22.value.match(term.getSubterm(0)))
            break Fail40;
        u_22 = term.getSubterm(1);
        y_22 = term;
        IStrategoTerm term19 = term;
        Success19:
        { 
          Fail41:
          { 
            term = random_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail41;
            if(t_22.value == null)
              t_22.value = term;
            else
              if(t_22.value != term && !t_22.value.match(term))
                break Fail41;
            term = u_22;
            lifted40 lifted400 = new lifted40();
            lifted400.q_22 = q_22;
            lifted400.r_22 = r_22;
            lifted400.t_22 = t_22;
            term = topdown_1_0.instance.invoke(context, term, lifted400);
            if(term == null)
              break Fail41;
            term = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term});
            lifted42 lifted420 = new lifted42();
            lifted420.s_22 = s_22;
            lifted420.w_22 = w_22;
            term = try_1_0.instance.invoke(context, term, lifted420);
            if(term == null)
              break Fail41;
            term = create_method_invokation_0_1.instance.invoke(context, term, w_22.value);
            if(term == null)
              break Fail41;
            x_22 = term;
            if(true)
              break Success19;
          }
          term = term19;
          IStrategoTerm e_23 = null;
          e_23 = term;
          term = report_with_failure_0_1.instance.invoke(context, e_23, transform.const10);
          if(term == null)
            break Fail40;
        }
        term = y_22;
        if(x_22 == null)
          break Fail40;
        term = x_22;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class scoped_ejp_to_java_0_4 extends Strategy 
  { 
    public static scoped_ejp_to_java_0_4 instance = new scoped_ejp_to_java_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_23, IStrategoTerm ref_i_23, IStrategoTerm ref_j_23, IStrategoTerm ref_k_23)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference i_23 = new TermReference(ref_i_23);
      TermReference j_23 = new TermReference(ref_j_23);
      TermReference k_23 = new TermReference(ref_k_23);
      context.push("scoped_ejp_to_java_0_4");
      Fail42:
      { 
        IStrategoTerm l_23 = null;
        IStrategoTerm n_23 = null;
        IStrategoTerm o_23 = null;
        IStrategoTerm p_23 = null;
        TermReference q_23 = new TermReference();
        IStrategoTerm r_23 = null;
        IStrategoTerm t_23 = null;
        IStrategoTerm u_23 = null;
        IStrategoTerm v_23 = null;
        IStrategoTerm w_23 = null;
        IStrategoTerm x_23 = null;
        IStrategoTerm y_23 = null;
        TermReference z_23 = new TermReference();
        IStrategoTerm a_24 = null;
        IStrategoTerm b_24 = null;
        TermReference c_24 = new TermReference();
        IStrategoTerm d_24 = null;
        IStrategoTerm e_24 = null;
        IStrategoTerm l_25 = null;
        IStrategoTerm m_25 = null;
        IStrategoTerm n_25 = null;
        IStrategoTerm o_25 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)term).getConstructor())
          break Fail42;
        if(c_24.value == null)
          c_24.value = term.getSubterm(0);
        else
          if(c_24.value != term.getSubterm(0) && !c_24.value.match(term.getSubterm(0)))
            break Fail42;
        l_23 = term.getSubterm(1);
        IStrategoTerm arg69 = term.getSubterm(2);
        if(arg69.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg69).getConstructor())
          break Fail42;
        o_23 = arg69.getSubterm(0);
        e_24 = term;
        IStrategoTerm term20 = term;
        Success20:
        { 
          Fail43:
          { 
            IStrategoTerm m_24 = null;
            IStrategoTerm n_24 = null;
            IStrategoTerm q_24 = null;
            IStrategoTerm s_24 = null;
            IStrategoTerm v_24 = null;
            IStrategoTerm x_24 = null;
            IStrategoTerm y_24 = null;
            IStrategoTerm g_25 = null;
            r_23 = term;
            term = random_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail43;
            if(q_23.value == null)
              q_23.value = term;
            else
              if(q_23.value != term && !q_23.value.match(term))
                break Fail43;
            term = l_23;
            lifted43 lifted430 = new lifted43();
            lifted430.i_23 = i_23;
            lifted430.j_23 = j_23;
            lifted430.q_23 = q_23;
            term = topdown_1_0.instance.invoke(context, term, lifted430);
            if(term == null)
              break Fail43;
            lifted45 lifted450 = new lifted45();
            lifted450.k_23 = k_23;
            lifted450.c_24 = c_24;
            term = try_1_0.instance.invoke(context, term, lifted450);
            if(term == null)
              break Fail43;
            term = get_vars_in_block_0_0.instance.invoke(context, o_23);
            if(term == null)
              break Fail43;
            n_23 = term;
            term = get_inner_scoped_vars_0_0.instance.invoke(context, o_23);
            if(term == null)
              break Fail43;
            if(z_23.value == null)
              z_23.value = term;
            else
              if(z_23.value != term && !z_23.value.match(term))
                break Fail43;
            term = new_iset_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail43;
            m_24 = term;
            term = hashtable_keys_0_0.instance.invoke(context, h_23);
            if(term == null)
              break Fail43;
            term = iset_addlist_0_1.instance.invoke(context, m_24, term);
            if(term == null)
              break Fail43;
            term = iset_isect_0_1.instance.invoke(context, term, n_23);
            if(term == null)
              break Fail43;
            y_23 = term;
            term = new_iset_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail43;
            n_24 = term;
            p_23 = term;
            q_24 = n_24;
            term = iset_elements_0_0.instance.invoke(context, y_23);
            if(term == null)
              break Fail43;
            term = iset_addlist_0_1.instance.invoke(context, q_24, term);
            if(term == null)
              break Fail43;
            term = p_23;
            s_24 = p_23;
            if(z_23.value == null)
              break Fail43;
            term = hashtable_keys_0_0.instance.invoke(context, z_23.value);
            if(term == null)
              break Fail43;
            term = iset_addlist_0_1.instance.invoke(context, s_24, term);
            if(term == null)
              break Fail43;
            term = gen_auxilary_class_name_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail43;
            u_23 = term;
            term = my_hashtable_union_0_1.instance.invoke(context, h_23, z_23.value);
            if(term == null)
              break Fail43;
            y_24 = term;
            term = remove_scoped_ejp_var_decs_0_0.instance.invoke(context, o_23);
            if(term == null)
              break Fail43;
            x_24 = term;
            term = y_24;
            lifted46 lifted460 = new lifted46();
            lifted460.z_23 = z_23;
            lifted460.i_23 = i_23;
            lifted460.j_23 = j_23;
            lifted460.k_23 = k_23;
            term = allow_extends_1_1.instance.invoke(context, term, lifted460, x_24);
            if(term == null)
              break Fail43;
            v_24 = term;
            term = gen_auxilery_class_0_6.instance.invokeDynamic(context, v_24, NO_STRATEGIES, new IStrategoTerm[]{p_23, h_23, c_24.value, u_23, q_23.value, r_23});
            if(term == null)
              break Fail43;
            t_23 = term;
            term = (IStrategoTerm)termFactory.makeListCons(u_23, (IStrategoList)transform.constCons0);
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail43;
            b_24 = term;
            term = termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{transform.constCons1, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{u_23})}), transform.constNone0}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{u_23})}), transform.constNone0}), transform.constNil0, transform.constNone0})}), (IStrategoList)transform.constNil0)})});
            v_23 = term;
            term = gen_before_call_assignments_0_2.instance.invoke(context, term, y_23, b_24);
            if(term == null)
              break Fail43;
            w_23 = term;
            term = gen_after_call_simple_assignments_0_2.instance.invoke(context, term, y_23, b_24);
            if(term == null)
              break Fail43;
            x_23 = term;
            g_25 = term;
            if(z_23.value == null)
              break Fail43;
            term = my_hashtable_remove_0_1.instance.invoke(context, z_23.value, y_23);
            if(term == null)
              break Fail43;
            term = gen_after_call_assignments_with_declarations_0_2.instance.invoke(context, g_25, term, b_24);
            if(term == null)
              break Fail43;
            a_24 = term;
            term = create_method_invokation_0_2.instance.invoke(context, term, b_24, c_24.value);
            if(term == null)
              break Fail43;
            d_24 = term;
            if(true)
              break Success20;
          }
          term = term20;
          IStrategoTerm k_25 = null;
          k_25 = term;
          term = report_with_failure_0_1.instance.invoke(context, k_25, transform.const12);
          if(term == null)
            break Fail42;
        }
        term = e_24;
        m_25 = e_24;
        o_25 = term;
        if(x_23 == null || a_24 == null)
          break Fail42;
        term = termFactory.makeTuple(x_23, termFactory.annotateTerm(a_24, checkListAnnos(termFactory, transform.constNil0)));
        term = make$Conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail42;
        n_25 = term;
        term = o_25;
        if(w_23 == null || d_24 == null)
          break Fail42;
        IStrategoList list0;
        list0 = checkListTail(n_25);
        if(list0 == null)
          break Fail42;
        term = termFactory.makeTuple(w_23, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{d_24}), list0));
        term = make$Conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail42;
        l_25 = term;
        term = m_25;
        if(t_23 == null || v_23 == null)
          break Fail42;
        IStrategoList list1;
        list1 = checkListTail(l_25);
        if(list1 == null)
          break Fail42;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consClassDecStm_1, new IStrategoTerm[]{t_23}), termFactory.makeListCons(v_23, list1));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_vars_in_block_0_0 extends Strategy 
  { 
    public static get_vars_in_block_0_0 instance = new get_vars_in_block_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("get_vars_in_block_0_0");
      Fail44:
      { 
        IStrategoTerm p_25 = null;
        TermReference q_25 = new TermReference();
        p_25 = term;
        term = new_iset_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail44;
        if(q_25.value == null)
          q_25.value = term;
        else
          if(q_25.value != term && !q_25.value.match(term))
            break Fail44;
        term = p_25;
        lifted47 lifted470 = new lifted47();
        lifted470.q_25 = q_25;
        term = topdown_1_0.instance.invoke(context, term, lifted470);
        if(term == null)
          break Fail44;
        if(q_25.value == null)
          break Fail44;
        term = q_25.value;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_inner_scoped_vars_0_0 extends Strategy 
  { 
    public static get_inner_scoped_vars_0_0 instance = new get_inner_scoped_vars_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("get_inner_scoped_vars_0_0");
      Fail45:
      { 
        IStrategoTerm v_25 = null;
        TermReference w_25 = new TermReference();
        v_25 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail45;
        if(w_25.value == null)
          w_25.value = term;
        else
          if(w_25.value != term && !w_25.value.match(term))
            break Fail45;
        term = v_25;
        lifted49 lifted490 = new lifted49();
        lifted490.w_25 = w_25;
        term = SRTS_all.instance.invoke(context, term, lifted490);
        if(term == null)
          break Fail45;
        if(w_25.value == null)
          break Fail45;
        term = w_25.value;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class handle_pointcutargs_0_2 extends Strategy 
  { 
    public static handle_pointcutargs_0_2 instance = new handle_pointcutargs_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_26, IStrategoTerm ref_c_26)
    { 
      TermReference b_26 = new TermReference(ref_b_26);
      TermReference c_26 = new TermReference(ref_c_26);
      context.push("handle_pointcutargs_0_2");
      Fail46:
      { 
        IStrategoTerm d_26 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
          break Fail46;
        IStrategoTerm arg70 = term.getSubterm(0);
        if(arg70.getTermType() != IStrategoTerm.APPL || transform._consPointcutargs_1 != ((IStrategoAppl)arg70).getConstructor())
          break Fail46;
        d_26 = arg70.getSubterm(0);
        term = d_26;
        lifted51 lifted511 = new lifted51();
        lifted511.c_26 = c_26;
        term = map_1_0.instance.invoke(context, term, lifted511);
        if(term == null)
          break Fail46;
        lifted52 lifted520 = new lifted52();
        lifted520.b_26 = b_26;
        term = map_1_0.instance.invoke(context, term, lifted520);
        if(term == null)
          break Fail46;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class handle_pointcutarg_helper_0_1 extends Strategy 
  { 
    public static handle_pointcutarg_helper_0_1 instance = new handle_pointcutarg_helper_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_26)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("handle_pointcutarg_helper_0_1");
      Fail47:
      { 
        IStrategoTerm h_26 = null;
        IStrategoTerm i_26 = null;
        IStrategoTerm j_26 = null;
        IStrategoTerm k_26 = null;
        IStrategoTerm l_26 = null;
        IStrategoTerm m_26 = null;
        IStrategoTerm p_26 = null;
        IStrategoTerm n_26 = null;
        IStrategoTerm q_26 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPointcutarg_3 != ((IStrategoAppl)term).getConstructor())
          break Fail47;
        IStrategoTerm arg71 = term.getSubterm(0);
        if(arg71.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg71).getConstructor())
          break Fail47;
        j_26 = arg71.getSubterm(0);
        l_26 = term.getSubterm(1);
        k_26 = term.getSubterm(2);
        term = f_26;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail47;
        h_26 = term.getSubterm(0);
        IStrategoTerm arg72 = term.getSubterm(1);
        if(arg72.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg72).getConstructor())
          break Fail47;
        i_26 = arg72.getSubterm(0);
        p_26 = term;
        term = pp_aspectj_string_0_0.instance.invoke(context, h_26);
        if(term == null)
          break Fail47;
        m_26 = term;
        q_26 = p_26;
        term = pp_aspectj_string_0_0.instance.invoke(context, k_26);
        if(term == null)
          break Fail47;
        n_26 = term;
        term = q_26;
        term = random_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail47;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const13, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail47;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{m_26}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId6, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{i_26}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId11, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{j_26}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId10, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{n_26}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0))))}), (IStrategoList)transform.constNil0), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), l_26, transform.constNone0}), transform.constBlock0});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class remove_vars_decs_from_local_var_dec_stm_0_0 extends Strategy 
  { 
    public static remove_vars_decs_from_local_var_dec_stm_0_0 instance = new remove_vars_decs_from_local_var_dec_stm_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("remove_vars_decs_from_local_var_dec_stm_0_0");
      Fail48:
      { 
        IStrategoTerm w_26 = null;
        IStrategoTerm x_26 = null;
        IStrategoTerm y_26 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
          break Fail48;
        IStrategoTerm arg73 = term.getSubterm(0);
        if(arg73.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg73).getConstructor())
          break Fail48;
        w_26 = arg73.getSubterm(2);
        y_26 = term;
        IStrategoTerm term21 = term;
        Success21:
        { 
          Fail49:
          { 
            term = allow_extends_1_1.instance.invoke(context, term, remove_var_dec_0_0.instance, w_26);
            if(term == null)
              break Fail49;
            x_26 = term;
            if(true)
              break Success21;
          }
          term = term21;
          IStrategoTerm c_27 = null;
          c_27 = term;
          term = report_with_failure_0_1.instance.invoke(context, c_27, transform.const16);
          if(term == null)
            break Fail48;
        }
        term = y_26;
        if(x_26 == null)
          break Fail48;
        term = x_26;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class remove_var_dec_0_0 extends Strategy 
  { 
    public static remove_var_dec_0_0 instance = new remove_var_dec_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail50:
      { 
        IStrategoTerm term22 = term;
        IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success22:
        { 
          if(cons4 == transform._consVarDec_1)
          { 
            Fail51:
            { 
              term = transform.constNone0;
              if(true)
                break Success22;
            }
            term = term22;
          }
          if(cons4 == transform._consVarDec_2)
          { 
            IStrategoTerm d_27 = null;
            IStrategoTerm e_27 = null;
            d_27 = term.getSubterm(0);
            e_27 = term.getSubterm(1);
            term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{d_27}), e_27})});
          }
          else
          { 
            break Fail50;
          }
        }
        if(true)
          return term;
      }
      context.push("remove_var_dec_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class pointcutarg_0_3 extends Strategy 
  { 
    public static pointcutarg_0_3 instance = new pointcutarg_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_78, IStrategoTerm q_78, IStrategoTerm r_78)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail52:
      { 
        IStrategoTerm term23 = term;
        IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success23:
        { 
          if(cons5 == transform._consThisClass_0)
          { 
            Fail53:
            { 
              term = termFactory.makeAppl(transform._consWithin_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoTypePattern_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSimpleAnnoPatternValue_2, new IStrategoTerm[]{transform.constTypeName5, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{p_78})})}), (IStrategoList)transform.constNil0)}), transform.constRefTypePattern0})});
              if(true)
                break Success23;
            }
            term = term23;
          }
          Success24:
          { 
            if(cons5 == transform._consThisMethod_0)
            { 
              Fail54:
              { 
                term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSimpleAnnoPatternValue_2, new IStrategoTerm[]{transform.constTypeName6, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{q_78})})}), (IStrategoList)transform.constNil0)}), transform.constModPattern0, transform.constRefTypePattern0, transform.constMemberName0, transform.constCons2, transform.constNone0});
                if(true)
                  break Success24;
              }
              term = term23;
            }
            if(cons5 == transform._consThisBlock_0)
            { 
              term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSimpleAnnoPatternValue_2, new IStrategoTerm[]{transform.constTypeName7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{r_78})})}), (IStrategoList)transform.constNil0)}), transform.constModPattern0, transform.constRefTypePattern0, transform.constMemberName0, transform.constCons2, transform.constNone0});
            }
            else
            { 
              break Fail52;
            }
          }
        }
        if(true)
          return term;
      }
      context.push("pointcutarg_0_3");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen__ejp__name_0_0 extends Strategy 
  { 
    public static gen__ejp__name_0_0 instance = new gen__ejp__name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen__ejp__name_0_0");
      Fail55:
      { 
        IStrategoTerm term25 = term;
        IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success25:
        { 
          if(cons6 == transform._consMemberName_1)
          { 
            Fail56:
            { 
              if(true)
                break Success25;
            }
            term = term25;
          }
          if(cons6 == transform._consMemberName_2)
          { 
            IStrategoTerm o_27 = null;
            IStrategoTerm p_27 = null;
            IStrategoTerm arg77 = term.getSubterm(0);
            if(arg77.getTermType() != IStrategoTerm.APPL || transform._consRefTypePattern_1 != ((IStrategoAppl)arg77).getConstructor())
              break Fail55;
            o_27 = arg77.getSubterm(0);
            p_27 = term.getSubterm(1);
            Success26:
            { 
              Fail57:
              { 
                IStrategoTerm q_27 = null;
                q_27 = term;
                term = termFactory.makeTuple(transform.constNamePattern0, o_27);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail57;
                term = q_27;
                { 
                  term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{p_27});
                  if(true)
                    break Success26;
                }
              }
              term = termFactory.makeAppl(transform._consMemberName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{o_27}), p_27});
              term = pp_aspectj_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail55;
              term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{term});
            }
          }
          else
          { 
            break Fail55;
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

  @SuppressWarnings("all") public static class typename__2__ambname_0_0 extends Strategy 
  { 
    public static typename__2__ambname_0_0 instance = new typename__2__ambname_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("typename__2__ambname_0_0");
      Fail58:
      { 
        IStrategoTerm term27 = term;
        IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success27:
        { 
          if(cons7 == transform._consTypeName_1)
          { 
            Fail59:
            { 
              IStrategoTerm k_28 = null;
              k_28 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{k_28});
              if(true)
                break Success27;
            }
            term = term27;
          }
          Success28:
          { 
            if(cons7 == transform._consTypeName_2)
            { 
              Fail60:
              { 
                IStrategoTerm g_28 = null;
                IStrategoTerm h_28 = null;
                g_28 = term.getSubterm(0);
                h_28 = term.getSubterm(1);
                term = this.invoke(context, g_28);
                if(term == null)
                  break Fail60;
                term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{term, h_28});
                if(true)
                  break Success28;
              }
              term = term27;
            }
            Success29:
            { 
              if(cons7 == transform._consPackageOrTypeName_1)
              { 
                Fail61:
                { 
                  IStrategoTerm f_28 = null;
                  f_28 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{f_28});
                  if(true)
                    break Success29;
                }
                term = term27;
              }
              if(cons7 == transform._consPackageOrTypeName_2)
              { 
                IStrategoTerm b_28 = null;
                IStrategoTerm c_28 = null;
                b_28 = term.getSubterm(0);
                c_28 = term.getSubterm(1);
                term = this.invoke(context, b_28);
                if(term == null)
                  break Fail58;
                term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{term, c_28});
              }
              else
              { 
                break Fail58;
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

  @SuppressWarnings("all") public static class gen__nomatch__pointcut__name_0_0 extends Strategy 
  { 
    public static gen__nomatch__pointcut__name_0_0 instance = new gen__nomatch__pointcut__name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen__nomatch__pointcut__name_0_0");
      Fail62:
      { 
        term = random_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail62;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const21, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail62;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen__ejpscope__method__name_0_2 extends Strategy 
  { 
    public static gen__ejpscope__method__name_0_2 instance = new gen__ejpscope__method__name_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_78, IStrategoTerm t_78)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen__ejpscope__method__name_0_2");
      Fail63:
      { 
        IStrategoTerm term30 = term;
        IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success30:
        { 
          if(cons8 == transform._consMemberName_1)
          { 
            Fail64:
            { 
              IStrategoTerm t_28 = null;
              IStrategoTerm u_28 = null;
              t_28 = term.getSubterm(0);
              Success31:
              { 
                Fail65:
                { 
                  IStrategoTerm v_28 = null;
                  v_28 = term;
                  term = s_78;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consNone_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail65;
                  term = v_28;
                  { 
                    term = (IStrategoTerm)termFactory.makeListCons(transform.const23, termFactory.makeListCons(t_78, termFactory.makeListCons(transform.const22, termFactory.makeListCons(t_28, (IStrategoList)transform.constNil0))));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail64;
                    u_28 = term;
                    if(true)
                      break Success31;
                  }
                }
                term = convert_package_name_0_0.instance.invoke(context, s_78);
                if(term == null)
                  break Fail64;
                term = (IStrategoTerm)termFactory.makeListCons(transform.const23, termFactory.makeListCons(term, termFactory.makeListCons(t_78, termFactory.makeListCons(transform.const22, termFactory.makeListCons(t_28, (IStrategoList)transform.constNil0)))));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail64;
                u_28 = term;
              }
              term = termFactory.makeAppl(transform._consMemberName_2, new IStrategoTerm[]{transform.constRefTypePattern0, u_28});
              if(true)
                break Success30;
            }
            term = term30;
          }
          if(cons8 == transform._consMemberName_2)
          { 
            term = gen__ejpscope__method__name_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail63;
          }
          else
          { 
            break Fail63;
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

  @SuppressWarnings("all") public static class convert_package_name_0_0 extends Strategy 
  { 
    public static convert_package_name_0_0 instance = new convert_package_name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("convert_package_name_0_0");
      Fail66:
      { 
        IStrategoTerm y_28 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPackageName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail66;
        y_28 = term.getSubterm(0);
        term = map_1_0.instance.invoke(context, y_28, lifted54.instance);
        if(term == null)
          break Fail66;
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail66;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen__ejpscope__method__name_0_0 extends Strategy 
  { 
    public static gen__ejpscope__method__name_0_0 instance = new gen__ejpscope__method__name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen__ejpscope__method__name_0_0");
      Fail67:
      { 
        IStrategoTerm term32 = term;
        IStrategoConstructor cons9 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success32:
        { 
          if(cons9 == transform._consExplicitJoinPoint_3)
          { 
            Fail68:
            { 
              IStrategoTerm j_29 = null;
              IStrategoTerm k_29 = null;
              j_29 = term.getSubterm(0);
              IStrategoTerm arg80 = term.getSubterm(1);
              if(arg80.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg80).getConstructor())
                break Fail68;
              k_29 = arg80.getSubterm(0);
              term = gen__ejpscope__method__name__helper_0_0.instance.invoke(context, j_29);
              if(term == null)
                break Fail68;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const23, termFactory.makeListCons(term, termFactory.makeListCons(transform.const22, termFactory.makeListCons(k_29, (IStrategoList)transform.constNil0))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail68;
              if(true)
                break Success32;
            }
            term = term32;
          }
          if(cons9 == transform._consMemberName_2)
          { 
            IStrategoTerm a_29 = null;
            IStrategoTerm b_29 = null;
            IStrategoTerm arg82 = term.getSubterm(0);
            if(arg82.getTermType() != IStrategoTerm.APPL || transform._consRefTypePattern_1 != ((IStrategoAppl)arg82).getConstructor())
              break Fail67;
            a_29 = arg82.getSubterm(0);
            b_29 = term.getSubterm(1);
            Success33:
            { 
              Fail69:
              { 
                IStrategoTerm c_29 = null;
                c_29 = term;
                term = termFactory.makeTuple(transform.constNamePattern0, a_29);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail69;
                term = c_29;
                { 
                  term = (IStrategoTerm)termFactory.makeListCons(transform.const23, termFactory.makeListCons(b_29, (IStrategoList)transform.constNil0));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail67;
                  term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success33;
                }
              }
              term = gen__ejpscope__method__name__helper_0_0.instance.invoke(context, a_29);
              if(term == null)
                break Fail67;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const23, termFactory.makeListCons(term, termFactory.makeListCons(transform.const22, termFactory.makeListCons(b_29, (IStrategoList)transform.constNil0))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail67;
              term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{term});
            }
          }
          else
          { 
            break Fail67;
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

  @SuppressWarnings("all") public static class gen__ejpscope__method__name__helper_0_0 extends Strategy 
  { 
    public static gen__ejpscope__method__name__helper_0_0 instance = new gen__ejpscope__method__name__helper_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen__ejpscope__method__name__helper_0_0");
      Fail70:
      { 
        IStrategoTerm term34 = term;
        IStrategoConstructor cons10 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success34:
        { 
          if(cons10 == transform._consId_1)
          { 
            Fail71:
            { 
              IStrategoTerm c_30 = null;
              c_30 = term.getSubterm(0);
              term = c_30;
              if(true)
                break Success34;
            }
            term = term34;
          }
          Success35:
          { 
            if(cons10 == transform._consTypeName_1)
            { 
              Fail72:
              { 
                IStrategoTerm b_30 = null;
                IStrategoTerm arg83 = term.getSubterm(0);
                if(arg83.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg83).getConstructor())
                  break Fail72;
                b_30 = arg83.getSubterm(0);
                term = b_30;
                if(true)
                  break Success35;
              }
              term = term34;
            }
            Success36:
            { 
              if(cons10 == transform._consTypeName_2)
              { 
                Fail73:
                { 
                  IStrategoTerm x_29 = null;
                  IStrategoTerm y_29 = null;
                  x_29 = term.getSubterm(0);
                  IStrategoTerm arg84 = term.getSubterm(1);
                  if(arg84.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg84).getConstructor())
                    break Fail73;
                  y_29 = arg84.getSubterm(0);
                  term = this.invoke(context, x_29);
                  if(term == null)
                    break Fail73;
                  term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const22, termFactory.makeListCons(y_29, (IStrategoList)transform.constNil0)));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail73;
                  if(true)
                    break Success36;
                }
                term = term34;
              }
              Success37:
              { 
                if(cons10 == transform._consPackageOrTypeName_2)
                { 
                  Fail74:
                  { 
                    IStrategoTerm t_29 = null;
                    IStrategoTerm u_29 = null;
                    t_29 = term.getSubterm(0);
                    IStrategoTerm arg85 = term.getSubterm(1);
                    if(arg85.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg85).getConstructor())
                      break Fail74;
                    u_29 = arg85.getSubterm(0);
                    term = this.invoke(context, t_29);
                    if(term == null)
                      break Fail74;
                    term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const22, termFactory.makeListCons(u_29, (IStrategoList)transform.constNil0)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail74;
                    if(true)
                      break Success37;
                  }
                  term = term34;
                }
                Success38:
                { 
                  if(cons10 == transform._consPackageOrTypeName_1)
                  { 
                    Fail75:
                    { 
                      IStrategoTerm s_29 = null;
                      IStrategoTerm arg86 = term.getSubterm(0);
                      if(arg86.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg86).getConstructor())
                        break Fail75;
                      s_29 = arg86.getSubterm(0);
                      term = s_29;
                      if(true)
                        break Success38;
                    }
                    term = term34;
                  }
                  Success39:
                  { 
                    if(cons10 == transform._consNamePattern_1)
                    { 
                      Fail76:
                      { 
                        IStrategoTerm r_29 = null;
                        r_29 = term.getSubterm(0);
                        term = r_29;
                        if(true)
                          break Success39;
                      }
                      term = term34;
                    }
                    if(cons10 == transform._consNamePattern_2)
                    { 
                      IStrategoTerm n_29 = null;
                      IStrategoTerm o_29 = null;
                      n_29 = term.getSubterm(0);
                      o_29 = term.getSubterm(1);
                      term = this.invoke(context, n_29);
                      if(term == null)
                        break Fail70;
                      term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const22, termFactory.makeListCons(o_29, (IStrategoList)transform.constNil0)));
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail70;
                    }
                    else
                    { 
                      break Fail70;
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

  @SuppressWarnings("all") public static class random_string_0_0 extends Strategy 
  { 
    public static random_string_0_0 instance = new random_string_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("random_string_0_0");
      Fail77:
      { 
        term = next_random_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail77;
        term = abs_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail77;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail77;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_auxilary_class_name_0_0 extends Strategy 
  { 
    public static gen_auxilary_class_name_0_0 instance = new gen_auxilary_class_name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_auxilary_class_name_0_0");
      Fail78:
      { 
        term = random_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail78;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const1, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail78;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class my_hashtable_remove_0_1 extends Strategy 
  { 
    public static my_hashtable_remove_0_1 instance = new my_hashtable_remove_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_30)
    { 
      context.push("my_hashtable_remove_0_1");
      Fail79:
      { 
        TermReference n_30 = new TermReference();
        if(n_30.value == null)
          n_30.value = term;
        else
          if(n_30.value != term && !n_30.value.match(term))
            break Fail79;
        term = iset_elements_0_0.instance.invoke(context, m_30);
        if(term == null)
          break Fail79;
        lifted55 lifted550 = new lifted55();
        lifted550.n_30 = n_30;
        term = map_1_0.instance.invoke(context, term, lifted550);
        if(term == null)
          break Fail79;
        if(n_30.value == null)
          break Fail79;
        term = n_30.value;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class my_hashtable_union_0_1 extends Strategy 
  { 
    public static my_hashtable_union_0_1 instance = new my_hashtable_union_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_30)
    { 
      TermReference r_30 = new TermReference(ref_r_30);
      context.push("my_hashtable_union_0_1");
      Fail80:
      { 
        TermReference s_30 = new TermReference();
        if(s_30.value == null)
          s_30.value = term;
        else
          if(s_30.value != term && !s_30.value.match(term))
            break Fail80;
        if(r_30.value == null)
          break Fail80;
        term = hashtable_keys_0_0.instance.invoke(context, r_30.value);
        if(term == null)
          break Fail80;
        lifted56 lifted560 = new lifted56();
        lifted560.r_30 = r_30;
        lifted560.s_30 = s_30;
        term = map_1_0.instance.invoke(context, term, lifted560);
        if(term == null)
          break Fail80;
        if(s_30.value == null)
          break Fail80;
        term = s_30.value;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class my_hashtable_union_helper_0_2 extends Strategy 
  { 
    public static my_hashtable_union_helper_0_2 instance = new my_hashtable_union_helper_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_30, IStrategoTerm x_30)
    { 
      context.push("my_hashtable_union_helper_0_2");
      Fail81:
      { 
        IStrategoTerm y_30 = null;
        IStrategoTerm c_31 = null;
        y_30 = term;
        term = hashtable_remove_0_1.instance.invoke(context, x_30, term);
        if(term == null)
          break Fail81;
        c_31 = x_30;
        term = hashtable_get_0_1.instance.invoke(context, w_30, y_30);
        if(term == null)
          break Fail81;
        term = hashtable_put_0_2.instance.invoke(context, c_31, y_30, term);
        if(term == null)
          break Fail81;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add_key_to_multiple_values_table_0_2 extends Strategy 
  { 
    public static add_key_to_multiple_values_table_0_2 instance = new add_key_to_multiple_values_table_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_31, IStrategoTerm e_31)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("add_key_to_multiple_values_table_0_2");
      Fail82:
      { 
        IStrategoTerm f_31 = null;
        f_31 = term;
        Success40:
        { 
          Fail83:
          { 
            IStrategoTerm g_31 = null;
            g_31 = term;
            term = hashtable_keys_0_0.instance.invoke(context, f_31);
            if(term == null)
              break Fail83;
            term = termFactory.makeTuple(d_31, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail83;
            term = g_31;
            { 
              IStrategoTerm m_31 = null;
              m_31 = f_31;
              term = hashtable_get_0_1.instance.invoke(context, f_31, d_31);
              if(term == null)
                break Fail82;
              term = termFactory.makeTuple(term, (IStrategoTerm)termFactory.makeListCons(e_31, (IStrategoList)transform.constNil0));
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail82;
              term = hashtable_put_0_2.instance.invoke(context, m_31, d_31, term);
              if(term == null)
                break Fail82;
              if(true)
                break Success40;
            }
          }
          IStrategoTerm q_31 = null;
          q_31 = f_31;
          term = (IStrategoTerm)termFactory.makeListCons(e_31, (IStrategoList)transform.constNil0);
          term = hashtable_put_0_2.instance.invoke(context, q_31, d_31, term);
          if(term == null)
            break Fail82;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class allow_extends_1_1 extends Strategy 
  { 
    public static allow_extends_1_1 instance = new allow_extends_1_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_31, IStrategoTerm r_31)
    { 
      context.push("allow_extends_1_1");
      Fail84:
      { 
        term = allow_extends_2_1.instance.invoke(context, term, s_31, _Id.instance, r_31);
        if(term == null)
          break Fail84;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class allow_extends_2_1 extends Strategy 
  { 
    public static allow_extends_2_1 instance = new allow_extends_2_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_31, Strategy x_31, IStrategoTerm v_31)
    { 
      context.push("allow_extends_2_1");
      Fail85:
      { 
        term = v_31;
        lifted58 lifted580 = new lifted58();
        lifted580.w_31 = w_31;
        lifted580.x_31 = x_31;
        term = SRTS_all.instance.invoke(context, term, lifted580);
        if(term == null)
          break Fail85;
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail85;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class allow_extends_helper_2_0 extends Strategy 
  { 
    public static allow_extends_helper_2_0 instance = new allow_extends_helper_2_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_32, Strategy d_32)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("allow_extends_helper_2_0");
      Fail86:
      { 
        IStrategoTerm y_31 = null;
        IStrategoTerm z_31 = null;
        z_31 = term;
        Success41:
        { 
          Fail87:
          { 
            IStrategoTerm a_32 = null;
            a_32 = term;
            term = c_32.invoke(context, z_31);
            if(term == null)
              break Fail87;
            y_31 = term;
            term = a_32;
            { 
              Success42:
              { 
                Fail88:
                { 
                  IStrategoTerm b_32 = null;
                  b_32 = term;
                  term = is_list_0_0.instance.invoke(context, y_31);
                  if(term == null)
                    break Fail88;
                  term = b_32;
                  { 
                    term = y_31;
                    if(true)
                      break Success42;
                  }
                }
                term = (IStrategoTerm)termFactory.makeListCons(y_31, (IStrategoList)transform.constNil0);
              }
              if(true)
                break Success41;
            }
          }
          term = d_32.invoke(context, z_31);
          if(term == null)
            break Fail86;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0);
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class fetch_type_0_0 extends Strategy 
  { 
    public static fetch_type_0_0 instance = new fetch_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fetch_type_0_0");
      Fail89:
      { 
        IStrategoTerm i_32 = null;
        IStrategoTerm j_32 = null;
        IStrategoTerm k_32 = null;
        i_32 = term;
        k_32 = term;
        j_32 = term;
        term = k_32;
        IStrategoTerm term43 = term;
        Success43:
        { 
          Fail90:
          { 
            IStrategoTerm l_32 = null;
            l_32 = term;
            term = j_32;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)term).getConstructor())
              break Fail90;
            IStrategoTerm arg87 = term.getSubterm(0);
            if(arg87.getTermType() != IStrategoTerm.APPL || transform._consString_1 != ((IStrategoAppl)arg87).getConstructor())
              break Fail90;
            term = l_32;
            { 
              term = transform.constLit0;
              if(true)
                break Success43;
            }
          }
          term = term43;
          Success44:
          { 
            Fail91:
            { 
              IStrategoTerm m_32 = null;
              m_32 = term;
              term = j_32;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)term).getConstructor())
                break Fail91;
              IStrategoTerm arg89 = term.getSubterm(0);
              if(arg89.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)arg89).getConstructor())
                break Fail91;
              term = m_32;
              { 
                term = transform.constLit1;
                if(true)
                  break Success44;
              }
            }
            term = pp_java5_to_string_0_0.instance.invoke(context, i_32);
            if(term == null)
              break Fail89;
            term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
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

  @SuppressWarnings("all") public static class ejp_to_ajc_0_3 extends Strategy 
  { 
    public static ejp_to_ajc_0_3 instance = new ejp_to_ajc_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_78, IStrategoTerm v_78, IStrategoTerm w_78)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference u_78 = new TermReference(ref_u_78);
      context.push("ejp_to_ajc_0_3");
      Fail92:
      { 
        IStrategoTerm term45 = term;
        Success45:
        { 
          Fail93:
          { 
            IStrategoTerm x_38 = null;
            IStrategoTerm y_38 = null;
            IStrategoTerm z_38 = null;
            IStrategoTerm a_39 = null;
            IStrategoTerm b_39 = null;
            IStrategoTerm c_39 = null;
            IStrategoTerm d_39 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
              break Fail93;
            IStrategoTerm arg91 = term.getSubterm(0);
            if(arg91.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg91).getConstructor())
              break Fail93;
            IStrategoTerm arg92 = arg91.getSubterm(0);
            if(arg92.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg92).getConstructor())
              break Fail93;
            x_38 = arg92.getSubterm(0);
            IStrategoTerm arg93 = arg91.getSubterm(1);
            if(arg93.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg93).getConstructor())
              break Fail93;
            y_38 = arg93.getSubterm(0);
            z_38 = arg91.getSubterm(2);
            a_39 = arg91.getSubterm(3);
            b_39 = arg91.getSubterm(4);
            c_39 = arg91.getSubterm(5);
            term = termFactory.makeTuple(x_38, transform.constCons6);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail93;
            d_39 = term;
            term = termFactory.makeTuple(y_38, transform.constCons7);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail93;
            term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{d_39}), termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{term}), z_38, a_39, b_39, c_39});
            if(true)
              break Success45;
          }
          term = term45;
          IStrategoTerm term46 = term;
          Success46:
          { 
            Fail94:
            { 
              IStrategoTerm o_38 = null;
              IStrategoTerm p_38 = null;
              IStrategoTerm q_38 = null;
              q_38 = term;
              o_38 = term;
              term = or_2_0.instance.invoke(context, q_38, lifted59.instance, lifted60.instance);
              if(term == null)
                break Fail94;
              term = o_38;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                break Fail94;
              p_38 = term.getSubterm(0);
              term = gen__ejp__name_0_0.instance.invoke(context, p_38);
              if(term == null)
                break Fail94;
              term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, term, transform.constCons2, transform.constNone0});
              if(true)
                break Success46;
            }
            term = term46;
            IStrategoTerm term47 = term;
            Success47:
            { 
              Fail95:
              { 
                IStrategoTerm b_38 = null;
                IStrategoTerm c_38 = null;
                IStrategoTerm d_38 = null;
                IStrategoTerm e_38 = null;
                IStrategoTerm f_38 = null;
                IStrategoTerm g_38 = null;
                IStrategoTerm h_38 = null;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail95;
                IStrategoTerm arg99 = term.getSubterm(0);
                if(arg99.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg99).getConstructor())
                  break Fail95;
                IStrategoTerm arg100 = arg99.getSubterm(0);
                if(arg100.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg100).getConstructor())
                  break Fail95;
                b_38 = arg100.getSubterm(0);
                IStrategoTerm arg101 = arg99.getSubterm(1);
                if(arg101.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg101).getConstructor())
                  break Fail95;
                c_38 = arg101.getSubterm(0);
                d_38 = arg99.getSubterm(2);
                e_38 = arg99.getSubterm(3);
                f_38 = arg99.getSubterm(4);
                g_38 = arg99.getSubterm(5);
                term = termFactory.makeTuple(b_38, transform.constCons8);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail95;
                h_38 = term;
                term = termFactory.makeTuple(c_38, transform.constCons7);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail95;
                term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{h_38}), termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{term}), d_38, e_38, f_38, g_38});
                if(true)
                  break Success47;
              }
              term = term47;
              IStrategoTerm term48 = term;
              Success48:
              { 
                Fail96:
                { 
                  IStrategoTerm s_37 = null;
                  IStrategoTerm t_37 = null;
                  IStrategoTerm u_37 = null;
                  u_37 = term;
                  s_37 = term;
                  term = or_2_0.instance.invoke(context, u_37, lifted61.instance, lifted62.instance);
                  if(term == null)
                    break Fail96;
                  term = s_37;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail96;
                  t_37 = term.getSubterm(0);
                  term = gen__ejp__name_0_0.instance.invoke(context, t_37);
                  if(term == null)
                    break Fail96;
                  term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern1, transform.constModPattern0, transform.constRefTypePattern0, term, transform.constCons2, transform.constNone0});
                  if(true)
                    break Success48;
                }
                term = term48;
                IStrategoTerm term49 = term;
                Success49:
                { 
                  Fail97:
                  { 
                    IStrategoTerm f_37 = null;
                    IStrategoTerm g_37 = null;
                    IStrategoTerm h_37 = null;
                    IStrategoTerm i_37 = null;
                    IStrategoTerm j_37 = null;
                    IStrategoTerm k_37 = null;
                    IStrategoTerm l_37 = null;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail97;
                    IStrategoTerm arg107 = term.getSubterm(0);
                    if(arg107.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg107).getConstructor())
                      break Fail97;
                    IStrategoTerm arg108 = arg107.getSubterm(0);
                    if(arg108.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg108).getConstructor())
                      break Fail97;
                    f_37 = arg108.getSubterm(0);
                    g_37 = arg107.getSubterm(1);
                    h_37 = arg107.getSubterm(2);
                    i_37 = arg107.getSubterm(3);
                    j_37 = arg107.getSubterm(4);
                    k_37 = arg107.getSubterm(5);
                    term = termFactory.makeTuple(f_37, transform.constCons9);
                    term = conc_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail97;
                    l_37 = term;
                    term = gen__ejpscope__method__name_0_2.instance.invoke(context, i_37, v_78, w_78);
                    if(term == null)
                      break Fail97;
                    term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{l_37}), g_37, h_37, term, j_37, k_37});
                    if(true)
                      break Success49;
                  }
                  term = term49;
                  IStrategoTerm term50 = term;
                  Success50:
                  { 
                    Fail98:
                    { 
                      IStrategoTerm w_36 = null;
                      IStrategoTerm x_36 = null;
                      IStrategoTerm y_36 = null;
                      y_36 = term;
                      w_36 = term;
                      term = or_2_0.instance.invoke(context, y_36, lifted63.instance, lifted64.instance);
                      if(term == null)
                        break Fail98;
                      term = w_36;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail98;
                      x_36 = term.getSubterm(0);
                      term = gen__ejpscope__method__name_0_2.instance.invoke(context, x_36, v_78, w_78);
                      if(term == null)
                        break Fail98;
                      term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern2, transform.constModPattern0, transform.constRefTypePattern0, term, transform.constCons2, transform.constNone0});
                      if(true)
                        break Success50;
                    }
                    term = term50;
                    IStrategoTerm term51 = term;
                    Success51:
                    { 
                      Fail99:
                      { 
                        IStrategoTerm j_36 = null;
                        IStrategoTerm k_36 = null;
                        IStrategoTerm l_36 = null;
                        IStrategoTerm m_36 = null;
                        IStrategoTerm n_36 = null;
                        IStrategoTerm o_36 = null;
                        IStrategoTerm p_36 = null;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail99;
                        IStrategoTerm arg114 = term.getSubterm(0);
                        if(arg114.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg114).getConstructor())
                          break Fail99;
                        IStrategoTerm arg115 = arg114.getSubterm(0);
                        if(arg115.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg115).getConstructor())
                          break Fail99;
                        j_36 = arg115.getSubterm(0);
                        k_36 = arg114.getSubterm(1);
                        l_36 = arg114.getSubterm(2);
                        m_36 = arg114.getSubterm(3);
                        n_36 = arg114.getSubterm(4);
                        o_36 = arg114.getSubterm(5);
                        term = termFactory.makeTuple(j_36, transform.constCons10);
                        term = conc_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail99;
                        p_36 = term;
                        term = gen__ejpscope__method__name_0_2.instance.invoke(context, m_36, v_78, w_78);
                        if(term == null)
                          break Fail99;
                        term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{p_36}), k_36, l_36, term, n_36, o_36});
                        if(true)
                          break Success51;
                      }
                      term = term51;
                      IStrategoTerm term52 = term;
                      Success52:
                      { 
                        Fail100:
                        { 
                          IStrategoTerm a_36 = null;
                          IStrategoTerm b_36 = null;
                          IStrategoTerm c_36 = null;
                          c_36 = term;
                          a_36 = term;
                          term = or_2_0.instance.invoke(context, c_36, lifted65.instance, lifted66.instance);
                          if(term == null)
                            break Fail100;
                          term = a_36;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                            break Fail100;
                          b_36 = term.getSubterm(0);
                          term = gen__ejpscope__method__name_0_2.instance.invoke(context, b_36, v_78, w_78);
                          if(term == null)
                            break Fail100;
                          term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern3, transform.constModPattern0, transform.constRefTypePattern0, term, transform.constCons2, transform.constNone0});
                          if(true)
                            break Success52;
                        }
                        term = term52;
                        ejp_to_ajc_0_3_fragment_0 ejp_to_ajc_0_3_fragment_00 = new ejp_to_ajc_0_3_fragment_0();
                        ejp_to_ajc_0_3_fragment_00.u_78 = u_78;
                        term = ejp_to_ajc_0_3_fragment_00.invoke(context, term);
                        if(term == null)
                          break Fail92;
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

  @SuppressWarnings("all") public static class gen_pointcutargs_pointcuts_0_1 extends Strategy 
  { 
    public static gen_pointcutargs_pointcuts_0_1 instance = new gen_pointcutargs_pointcuts_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_78)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_pointcutargs_pointcuts_0_1");
      Fail101:
      { 
        IStrategoTerm term58 = term;
        Success53:
        { 
          Fail102:
          { 
            TermReference j_39 = new TermReference();
            IStrategoTerm k_39 = null;
            IStrategoTerm n_39 = null;
            IStrategoTerm p_39 = null;
            IStrategoTerm q_39 = null;
            IStrategoTerm l_39 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail102;
            IStrategoTerm arg130 = term.getSubterm(0);
            if(arg130.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg130).getConstructor())
              break Fail102;
            IStrategoTerm arg131 = arg130.getSubterm(0);
            if(arg131.getTermType() != IStrategoTerm.APPL || transform._consPointcutargsDec_1 != ((IStrategoAppl)arg131).getConstructor())
              break Fail102;
            k_39 = arg131.getSubterm(0);
            n_39 = term.getSubterm(1);
            term = n_39;
            lifted68 lifted680 = new lifted68();
            lifted67 lifted670 = new lifted67();
            lifted680.j_39 = j_39;
            lifted670.j_39 = j_39;
            term = or_2_0.instance.invoke(context, term, lifted670, lifted680);
            if(term == null)
              break Fail102;
            term = x_78;
            p_39 = x_78;
            if(j_39.value == null)
              break Fail102;
            term = j_39.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointDeclarator_3 != ((IStrategoAppl)term).getConstructor())
              break Fail102;
            IStrategoTerm arg135 = term.getSubterm(1);
            if(arg135.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg135).getConstructor())
              break Fail102;
            l_39 = arg135.getSubterm(0);
            q_39 = l_39;
            term = map_1_0.instance.invoke(context, k_39, lifted69.instance);
            if(term == null)
              break Fail102;
            term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAspectDecHead_6, new IStrategoTerm[]{transform.constCons23, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{q_39}), transform.constNone0, transform.constNone0, transform.constNone0, transform.constNone0}), termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term})});
            term = iset_add_0_1.instance.invoke(context, p_39, term);
            if(term == null)
              break Fail102;
            if(true)
              break Success53;
          }
          term = term58;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail101;
          IStrategoTerm arg137 = term.getSubterm(0);
          if(arg137.getTermType() != IStrategoTerm.APPL || transform._consNone_0 != ((IStrategoAppl)arg137).getConstructor())
            break Fail101;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class convet_pointcutarg_to_pointcut_0_0 extends Strategy 
  { 
    public static convet_pointcutarg_to_pointcut_0_0 instance = new convet_pointcutarg_to_pointcut_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail103:
      { 
        IStrategoTerm u_39 = null;
        IStrategoTerm v_39 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPointcutargDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail103;
        u_39 = term.getSubterm(0);
        v_39 = term.getSubterm(1);
        term = termFactory.makeAppl(transform._consPointcutDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consPointcutDecHead_3, new IStrategoTerm[]{transform.constCons24, u_39, v_39}), transform.constNoPointcutBody0});
        if(true)
          return term;
      }
      context.push("convet_pointcutarg_to_pointcut_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_method_head_0_3 extends Strategy 
  { 
    public static gen_method_head_0_3 instance = new gen_method_head_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_39, IStrategoTerm x_39, IStrategoTerm y_39)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_head_0_3");
      Fail104:
      { 
        TermReference z_39 = new TermReference();
        IStrategoTerm a_40 = null;
        TermReference b_40 = new TermReference();
        IStrategoTerm c_40 = null;
        IStrategoTerm d_40 = null;
        IStrategoTerm e_40 = null;
        term = w_39;
        lifted71 lifted711 = new lifted71();
        lifted70 lifted700 = new lifted70();
        lifted711.b_40 = b_40;
        lifted711.z_39 = z_39;
        lifted700.b_40 = b_40;
        lifted700.z_39 = z_39;
        term = or_2_0.instance.invoke(context, term, lifted700, lifted711);
        if(term == null)
          break Fail104;
        if(z_39.value == null)
          break Fail104;
        term = z_39.value;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointDeclarator_3 != ((IStrategoAppl)term).getConstructor())
          break Fail104;
        c_40 = term.getSubterm(0);
        d_40 = term.getSubterm(1);
        e_40 = term.getSubterm(2);
        term = gen_ejp_annotation_0_1.instance.invoke(context, term, x_39);
        if(term == null)
          break Fail104;
        a_40 = term;
        if(b_40.value == null)
          break Fail104;
        term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(a_40, termFactory.makeListCons(b_40.value, (IStrategoList)transform.constCons7)), transform.constNone0, c_40, d_40, e_40, y_39});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_ejp_annotation_0_1 extends Strategy 
  { 
    public static gen_ejp_annotation_0_1 instance = new gen_ejp_annotation_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_40)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_ejp_annotation_0_1");
      Fail105:
      { 
        term = fetch_handles_list_0_0.instance.invoke(context, h_40);
        if(term == null)
          break Fail105;
        term = map_1_0.instance.invoke(context, term, lifted72.instance);
        if(term == null)
          break Fail105;
        term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName8, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId27, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_method_body_0_2 extends Strategy 
  { 
    public static gen_method_body_0_2 instance = new gen_method_body_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_40, IStrategoTerm o_40)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_body_0_2");
      Fail106:
      { 
        Success54:
        { 
          Fail107:
          { 
            IStrategoTerm p_40 = null;
            p_40 = term;
            term = strip_annos_0_0.instance.invoke(context, n_40);
            if(term == null)
              break Fail107;
            term = termFactory.makeTuple(term, transform.constNone0);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail107;
            term = p_40;
            { 
              term = get_default_return_value_for_return_type_0_0.instance.invoke(context, o_40);
              if(term == null)
                break Fail106;
              term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)});
              if(true)
                break Success54;
            }
          }
          term = fetch_default_value_0_0.instance.invoke(context, n_40);
          if(term == null)
            break Fail106;
          term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)});
        }
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
      Fail108:
      { 
        IStrategoTerm w_40 = null;
        IStrategoTerm x_40 = null;
        IStrategoTerm y_40 = null;
        w_40 = term;
        y_40 = term;
        x_40 = w_40;
        term = y_40;
        IStrategoTerm term60 = term;
        Success55:
        { 
          Fail109:
          { 
            IStrategoTerm z_40 = null;
            z_40 = term;
            term = x_40;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consVoid_0 != ((IStrategoAppl)term).getConstructor())
              break Fail109;
            term = z_40;
            { 
              term = transform.constNone0;
              if(true)
                break Success55;
            }
          }
          term = term60;
          IStrategoTerm term61 = term;
          Success56:
          { 
            Fail110:
            { 
              IStrategoTerm a_41 = null;
              a_41 = term;
              term = x_40;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail110;
              term = a_41;
              { 
                term = transform.constSome0;
                if(true)
                  break Success56;
              }
            }
            term = term61;
            IStrategoTerm term62 = term;
            Success57:
            { 
              Fail111:
              { 
                IStrategoTerm b_41 = null;
                b_41 = term;
                term = x_40;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail111;
                term = b_41;
                { 
                  term = transform.constSome0;
                  if(true)
                    break Success57;
                }
              }
              term = term62;
              IStrategoTerm term63 = term;
              Success58:
              { 
                Fail112:
                { 
                  IStrategoTerm c_41 = null;
                  c_41 = term;
                  term = x_40;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail112;
                  term = c_41;
                  { 
                    term = transform.constSome0;
                    if(true)
                      break Success58;
                  }
                }
                term = term63;
                IStrategoTerm term64 = term;
                Success59:
                { 
                  Fail113:
                  { 
                    IStrategoTerm d_41 = null;
                    d_41 = term;
                    term = x_40;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail113;
                    term = d_41;
                    { 
                      term = transform.constSome0;
                      if(true)
                        break Success59;
                    }
                  }
                  term = term64;
                  IStrategoTerm term65 = term;
                  Success60:
                  { 
                    Fail114:
                    { 
                      IStrategoTerm e_41 = null;
                      e_41 = term;
                      term = x_40;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail114;
                      term = e_41;
                      { 
                        term = transform.constSome0;
                        if(true)
                          break Success60;
                      }
                    }
                    term = term65;
                    IStrategoTerm term66 = term;
                    Success61:
                    { 
                      Fail115:
                      { 
                        IStrategoTerm f_41 = null;
                        f_41 = term;
                        term = x_40;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail115;
                        term = f_41;
                        { 
                          term = transform.constSome0;
                          if(true)
                            break Success61;
                        }
                      }
                      term = term66;
                      Success62:
                      { 
                        Fail116:
                        { 
                          IStrategoTerm g_41 = null;
                          g_41 = term;
                          term = x_40;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail116;
                          term = g_41;
                          { 
                            term = transform.constSome1;
                            if(true)
                              break Success62;
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

  @SuppressWarnings("all") public static class fetch_default_value_0_0 extends Strategy 
  { 
    public static fetch_default_value_0_0 instance = new fetch_default_value_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail117:
      { 
        IStrategoTerm term68 = term;
        IStrategoConstructor cons15 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success63:
        { 
          if(cons15 == transform._consSome_1)
          { 
            Fail118:
            { 
              IStrategoTerm j_41 = null;
              IStrategoTerm arg140 = term.getSubterm(0);
              if(arg140.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointInitializer_1 != ((IStrategoAppl)arg140).getConstructor())
                break Fail118;
              j_41 = arg140.getSubterm(0);
              term = j_41;
              if(true)
                break Success63;
            }
            term = term68;
          }
          if(cons15 == transform._consNone_0)
          { 
            term = transform.constNone0;
          }
          else
          { 
            break Fail117;
          }
        }
        if(true)
          return term;
      }
      context.push("fetch_default_value_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class fetch_handles_list_0_0 extends Strategy 
  { 
    public static fetch_handles_list_0_0 instance = new fetch_handles_list_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail119:
      { 
        IStrategoTerm term69 = term;
        IStrategoConstructor cons16 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success64:
        { 
          if(cons16 == transform._consSome_1)
          { 
            Fail120:
            { 
              IStrategoTerm k_41 = null;
              IStrategoTerm arg141 = term.getSubterm(0);
              if(arg141.getTermType() != IStrategoTerm.APPL || transform._consHandles_1 != ((IStrategoAppl)arg141).getConstructor())
                break Fail120;
              k_41 = arg141.getSubterm(0);
              term = k_41;
              if(true)
                break Success64;
            }
            term = term69;
          }
          if(cons16 == transform._consNone_0)
          { 
            term = transform.constNil0;
          }
          else
          { 
            break Fail119;
          }
        }
        if(true)
          return term;
      }
      context.push("fetch_handles_list_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class remove_ejp_decs_0_0 extends Strategy 
  { 
    public static remove_ejp_decs_0_0 instance = new remove_ejp_decs_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail121:
      { 
        IStrategoTerm term70 = term;
        IStrategoConstructor cons17 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success65:
        { 
          if(cons17 == transform._consExplicitJoinPointDeclaration_5)
          { 
            Fail122:
            { 
              term = transform.constNone0;
              if(true)
                break Success65;
            }
            term = term70;
          }
          Success66:
          { 
            if(cons17 == transform._consDecNoMatch_4)
            { 
              Fail123:
              { 
                term = transform.constNone0;
                if(true)
                  break Success66;
              }
              term = term70;
            }
            Success67:
            { 
              if(cons17 == transform._consExplicitJoinPointPattern_1)
              { 
                Fail124:
                { 
                  term = transform.constNone0;
                  if(true)
                    break Success67;
                }
                term = term70;
              }
              Success68:
              { 
                if(cons17 == transform._consNotExplicitJoinPointPattern_1)
                { 
                  Fail125:
                  { 
                    term = transform.constNone0;
                    if(true)
                      break Success68;
                  }
                  term = term70;
                }
                Success69:
                { 
                  if(cons17 == transform._consExplicitJoinPointScopePattern_1)
                  { 
                    Fail126:
                    { 
                      term = transform.constNone0;
                      if(true)
                        break Success69;
                    }
                    term = term70;
                  }
                  if(cons17 == transform._consNotExplicitJoinPointScopePattern_1)
                  { 
                    term = transform.constNone0;
                  }
                  else
                  { 
                    break Fail121;
                  }
                }
              }
            }
          }
        }
        if(true)
          return term;
      }
      context.push("remove_ejp_decs_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class aspectj_to_box_0_0_fragment_4 extends Strategy 
  { 
    public static aspectj_to_box_0_0_fragment_4 instance = new aspectj_to_box_0_0_fragment_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0_fragment_4");
      Fail127:
      { 
        IStrategoTerm term75 = term;
        IStrategoConstructor cons18 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success70:
        { 
          if(cons18 == transform._consInitExec_1)
          { 
            Fail128:
            { 
              IStrategoTerm v_50 = null;
              v_50 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX0, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(v_50, (IStrategoList)transform.constCons26)))});
              if(true)
                break Success70;
            }
            term = term75;
          }
          Success71:
          { 
            if(cons18 == transform._consPreInitExec_1)
            { 
              Fail129:
              { 
                IStrategoTerm u_50 = null;
                u_50 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX1, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(u_50, (IStrategoList)transform.constCons26)))});
                if(true)
                  break Success71;
              }
              term = term75;
            }
            Success72:
            { 
              if(cons18 == transform._consStaticInitExec_1)
              { 
                Fail130:
                { 
                  IStrategoTerm t_50 = null;
                  t_50 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX2, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(t_50, (IStrategoList)transform.constCons26)))});
                  if(true)
                    break Success72;
                }
                term = term75;
              }
              Success73:
              { 
                if(cons18 == transform._consGetField_1)
                { 
                  Fail131:
                  { 
                    IStrategoTerm s_50 = null;
                    s_50 = term.getSubterm(0);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX3, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(s_50, (IStrategoList)transform.constCons26)))});
                    if(true)
                      break Success73;
                  }
                  term = term75;
                }
                Success74:
                { 
                  if(cons18 == transform._consSetField_1)
                  { 
                    Fail132:
                    { 
                      IStrategoTerm r_50 = null;
                      r_50 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX4, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(r_50, (IStrategoList)transform.constCons26)))});
                      if(true)
                        break Success74;
                    }
                    term = term75;
                  }
                  Success75:
                  { 
                    if(cons18 == transform._consHandler_1)
                    { 
                      Fail133:
                      { 
                        IStrategoTerm q_50 = null;
                        q_50 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX5, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(q_50, (IStrategoList)transform.constCons26)))});
                        if(true)
                          break Success75;
                      }
                      term = term75;
                    }
                    Success76:
                    { 
                      if(cons18 == transform._consAdviceExec_0)
                      { 
                        Fail134:
                        { 
                          term = transform.constH0;
                          if(true)
                            break Success76;
                        }
                        term = term75;
                      }
                      Success77:
                      { 
                        if(cons18 == transform._consWithin_1)
                        { 
                          Fail135:
                          { 
                            IStrategoTerm p_50 = null;
                            p_50 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX7, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(p_50, (IStrategoList)transform.constCons26)))});
                            if(true)
                              break Success77;
                          }
                          term = term75;
                        }
                        Success78:
                        { 
                          if(cons18 == transform._consWithinCode_1)
                          { 
                            Fail136:
                            { 
                              IStrategoTerm o_50 = null;
                              o_50 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX8, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(o_50, (IStrategoList)transform.constCons26)))});
                              if(true)
                                break Success78;
                            }
                            term = term75;
                          }
                          Success79:
                          { 
                            if(cons18 == transform._consCFlow_1)
                            { 
                              Fail137:
                              { 
                                IStrategoTerm n_50 = null;
                                n_50 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX9, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(n_50, (IStrategoList)transform.constCons26)))});
                                if(true)
                                  break Success79;
                              }
                              term = term75;
                            }
                            Success80:
                            { 
                              if(cons18 == transform._consCFlowBelow_1)
                              { 
                                Fail138:
                                { 
                                  IStrategoTerm l_50 = null;
                                  l_50 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX10, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(l_50, (IStrategoList)transform.constCons26)))});
                                  if(true)
                                    break Success80;
                                }
                                term = term75;
                              }
                              Success81:
                              { 
                                if(cons18 == transform._consIf_1)
                                { 
                                  Fail139:
                                  { 
                                    IStrategoTerm k_50 = null;
                                    k_50 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX11, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(k_50, (IStrategoList)transform.constCons26)))});
                                    if(true)
                                      break Success81;
                                  }
                                  term = term75;
                                }
                                Success82:
                                { 
                                  if(cons18 == transform._consThis_1)
                                  { 
                                    Fail140:
                                    { 
                                      IStrategoTerm j_50 = null;
                                      j_50 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX12, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(j_50, (IStrategoList)transform.constCons26)))});
                                      if(true)
                                        break Success82;
                                    }
                                    term = term75;
                                  }
                                  Success83:
                                  { 
                                    if(cons18 == transform._consTarget_1)
                                    { 
                                      Fail141:
                                      { 
                                        IStrategoTerm i_50 = null;
                                        i_50 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX13, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(i_50, (IStrategoList)transform.constCons26)))});
                                        if(true)
                                          break Success83;
                                      }
                                      term = term75;
                                    }
                                    Success84:
                                    { 
                                      if(cons18 == transform._consArgs_1)
                                      { 
                                        Fail142:
                                        { 
                                          IStrategoTerm f_50 = null;
                                          f_50 = term.getSubterm(0);
                                          term = list_to_args_0_0.instance.invoke(context, f_50);
                                          if(term == null)
                                            break Fail142;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX14, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                          if(true)
                                            break Success84;
                                        }
                                        term = term75;
                                      }
                                      Success85:
                                      { 
                                        if(cons18 == transform._consNamedPointcut_2)
                                        { 
                                          Fail143:
                                          { 
                                            IStrategoTerm a_50 = null;
                                            IStrategoTerm b_50 = null;
                                            a_50 = term.getSubterm(0);
                                            b_50 = term.getSubterm(1);
                                            term = list_to_args_0_0.instance.invoke(context, b_50);
                                            if(term == null)
                                              break Fail143;
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(a_50, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                            if(true)
                                              break Success85;
                                          }
                                          term = term75;
                                        }
                                        Success86:
                                        { 
                                          if(cons18 == transform._consAtThis_1)
                                          { 
                                            Fail144:
                                            { 
                                              IStrategoTerm z_49 = null;
                                              z_49 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS17, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(z_49, (IStrategoList)transform.constCons26)))});
                                              if(true)
                                                break Success86;
                                            }
                                            term = term75;
                                          }
                                          Success87:
                                          { 
                                            if(cons18 == transform._consAtTarget_1)
                                            { 
                                              Fail145:
                                              { 
                                                IStrategoTerm y_49 = null;
                                                y_49 = term.getSubterm(0);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS18, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(y_49, (IStrategoList)transform.constCons26)))});
                                                if(true)
                                                  break Success87;
                                              }
                                              term = term75;
                                            }
                                            term = aspectj_to_box_0_0_fragment_3.instance.invoke(context, term);
                                            if(term == null)
                                              break Fail127;
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
      Fail146:
      { 
        IStrategoTerm term93 = term;
        IStrategoConstructor cons19 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success88:
        { 
          if(cons19 == transform._consAtWithin_1)
          { 
            Fail147:
            { 
              IStrategoTerm x_49 = null;
              x_49 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS19, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(x_49, (IStrategoList)transform.constCons26)))});
              if(true)
                break Success88;
            }
            term = term93;
          }
          Success89:
          { 
            if(cons19 == transform._consAtWithinCode_1)
            { 
              Fail148:
              { 
                IStrategoTerm w_49 = null;
                w_49 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS20, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(w_49, (IStrategoList)transform.constCons26)))});
                if(true)
                  break Success89;
              }
              term = term93;
            }
            Success90:
            { 
              if(cons19 == transform._consAtAnno_1)
              { 
                Fail149:
                { 
                  IStrategoTerm v_49 = null;
                  v_49 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS21, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(v_49, (IStrategoList)transform.constCons26)))});
                  if(true)
                    break Success90;
                }
                term = term93;
              }
              Success91:
              { 
                if(cons19 == transform._consAtArgs_1)
                { 
                  Fail150:
                  { 
                    IStrategoTerm s_49 = null;
                    s_49 = term.getSubterm(0);
                    term = list_to_args_0_0.instance.invoke(context, s_49);
                    if(term == null)
                      break Fail150;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS22, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                    if(true)
                      break Success91;
                  }
                  term = term93;
                }
                Success92:
                { 
                  if(cons19 == transform._consPointcutName_1)
                  { 
                    Fail151:
                    { 
                      IStrategoTerm r_49 = null;
                      r_49 = term.getSubterm(0);
                      term = r_49;
                      if(true)
                        break Success92;
                    }
                    term = term93;
                  }
                  Success93:
                  { 
                    if(cons19 == transform._consPointcutName_2)
                    { 
                      Fail152:
                      { 
                        IStrategoTerm p_49 = null;
                        IStrategoTerm q_49 = null;
                        p_49 = term.getSubterm(0);
                        q_49 = term.getSubterm(1);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(p_49, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(q_49, (IStrategoList)transform.constNil0)))});
                        if(true)
                          break Success93;
                      }
                      term = term93;
                    }
                    Success94:
                    { 
                      if(cons19 == transform._consPointcutDec_2)
                      { 
                        Fail153:
                        { 
                          IStrategoTerm n_49 = null;
                          IStrategoTerm o_49 = null;
                          n_49 = term.getSubterm(0);
                          o_49 = term.getSubterm(1);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(n_49, termFactory.makeListCons(o_49, (IStrategoList)transform.constNil0))});
                          if(true)
                            break Success94;
                        }
                        term = term93;
                      }
                      Success95:
                      { 
                        if(cons19 == transform._consPointcutDecHead_3)
                        { 
                          Fail154:
                          { 
                            IStrategoTerm g_49 = null;
                            IStrategoTerm h_49 = null;
                            IStrategoTerm i_49 = null;
                            IStrategoTerm j_49 = null;
                            g_49 = term.getSubterm(0);
                            h_49 = term.getSubterm(1);
                            i_49 = term.getSubterm(2);
                            term = list_to_args_0_0.instance.invoke(context, i_49);
                            if(term == null)
                              break Fail154;
                            j_49 = term;
                            term = termFactory.makeTuple(g_49, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX15, termFactory.makeListCons(h_49, termFactory.makeListCons(j_49, (IStrategoList)transform.constNil0))));
                            term = make$Conc_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail154;
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                            if(true)
                              break Success95;
                          }
                          term = term93;
                        }
                        Success96:
                        { 
                          if(cons19 == transform._consPointcutBody_1)
                          { 
                            Fail155:
                            { 
                              IStrategoTerm f_49 = null;
                              f_49 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS26, termFactory.makeListCons(f_49, (IStrategoList)transform.constCons30))});
                              if(true)
                                break Success96;
                            }
                            term = term93;
                          }
                          Success97:
                          { 
                            if(cons19 == transform._consNoPointcutBody_0)
                            { 
                              Fail156:
                              { 
                                term = transform.constFBOX16;
                                if(true)
                                  break Success97;
                              }
                              term = term93;
                            }
                            Success98:
                            { 
                              if(cons19 == transform._consRefTypePattern_1)
                              { 
                                Fail157:
                                { 
                                  IStrategoTerm e_49 = null;
                                  e_49 = term.getSubterm(0);
                                  term = e_49;
                                  if(true)
                                    break Success98;
                                }
                                term = term93;
                              }
                              Success99:
                              { 
                                if(cons19 == transform._consPrimTypePattern_1)
                                { 
                                  Fail158:
                                  { 
                                    IStrategoTerm d_49 = null;
                                    d_49 = term.getSubterm(0);
                                    term = d_49;
                                    if(true)
                                      break Success99;
                                  }
                                  term = term93;
                                }
                                Success100:
                                { 
                                  if(cons19 == transform._consSubtype_1)
                                  { 
                                    Fail159:
                                    { 
                                      IStrategoTerm c_49 = null;
                                      c_49 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(c_49, (IStrategoList)transform.constCons31)});
                                      if(true)
                                        break Success100;
                                    }
                                    term = term93;
                                  }
                                  Success101:
                                  { 
                                    if(cons19 == transform._consGenericTypePattern_2)
                                    { 
                                      Fail160:
                                      { 
                                        IStrategoTerm a_49 = null;
                                        IStrategoTerm b_49 = null;
                                        a_49 = term.getSubterm(0);
                                        b_49 = term.getSubterm(1);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(a_49, termFactory.makeListCons(b_49, (IStrategoList)transform.constNil0))});
                                        if(true)
                                          break Success101;
                                      }
                                      term = term93;
                                    }
                                    Success102:
                                    { 
                                      if(cons19 == transform._consGenericSubtypePattern_2)
                                      { 
                                        Fail161:
                                        { 
                                          IStrategoTerm y_48 = null;
                                          IStrategoTerm z_48 = null;
                                          y_48 = term.getSubterm(0);
                                          z_48 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(y_48, termFactory.makeListCons(z_48, (IStrategoList)transform.constCons31))});
                                          if(true)
                                            break Success102;
                                        }
                                        term = term93;
                                      }
                                      Success103:
                                      { 
                                        if(cons19 == transform._consAnnoTypePattern_2)
                                        { 
                                          Fail162:
                                          { 
                                            IStrategoTerm u_48 = null;
                                            IStrategoTerm v_48 = null;
                                            IStrategoTerm arg155 = term.getSubterm(0);
                                            if(arg155.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg155).getConstructor())
                                              break Fail162;
                                            u_48 = arg155.getSubterm(0);
                                            v_48 = term.getSubterm(1);
                                            term = termFactory.makeTuple(u_48, (IStrategoTerm)termFactory.makeListCons(v_48, (IStrategoList)transform.constNil0));
                                            term = make$Conc_0_0.instance.invoke(context, term);
                                            if(term == null)
                                              break Fail162;
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term}), (IStrategoList)transform.constNil0)});
                                            if(true)
                                              break Success103;
                                          }
                                          term = term93;
                                        }
                                        Success104:
                                        { 
                                          if(cons19 == transform._consNamePattern_1)
                                          { 
                                            Fail163:
                                            { 
                                              IStrategoTerm t_48 = null;
                                              t_48 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{t_48}), (IStrategoList)transform.constNil0)});
                                              if(true)
                                                break Success104;
                                            }
                                            term = term93;
                                          }
                                          Success105:
                                          { 
                                            if(cons19 == transform._consNamePattern_2)
                                            { 
                                              Fail164:
                                              { 
                                                IStrategoTerm r_48 = null;
                                                IStrategoTerm s_48 = null;
                                                r_48 = term.getSubterm(0);
                                                s_48 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(r_48, termFactory.makeListCons(transform.constFBOX17, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{s_48}), (IStrategoList)transform.constNil0)))});
                                                if(true)
                                                  break Success105;
                                              }
                                              term = term93;
                                            }
                                            Success106:
                                            { 
                                              if(cons19 == transform._consWildcardNamePattern_2)
                                              { 
                                                Fail165:
                                                { 
                                                  IStrategoTerm p_48 = null;
                                                  IStrategoTerm q_48 = null;
                                                  p_48 = term.getSubterm(0);
                                                  q_48 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(p_48, termFactory.makeListCons(transform.constFBOX18, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{q_48}), (IStrategoList)transform.constNil0)))});
                                                  if(true)
                                                    break Success106;
                                                }
                                                term = term93;
                                              }
                                              Success107:
                                              { 
                                                if(cons19 == transform._consFormalWildcard_0)
                                                { 
                                                  Fail166:
                                                  { 
                                                    term = transform.constS28;
                                                    if(true)
                                                      break Success107;
                                                  }
                                                  term = term93;
                                                }
                                                Success108:
                                                { 
                                                  if(cons19 == transform._consVarArityParamPattern_1)
                                                  { 
                                                    Fail167:
                                                    { 
                                                      IStrategoTerm o_48 = null;
                                                      o_48 = term.getSubterm(0);
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(o_48, (IStrategoList)transform.constCons32)});
                                                      if(true)
                                                        break Success108;
                                                    }
                                                    term = term93;
                                                  }
                                                  Success109:
                                                  { 
                                                    if(cons19 == transform._consRegularTypePattern_1)
                                                    { 
                                                      Fail168:
                                                      { 
                                                        IStrategoTerm n_48 = null;
                                                        n_48 = term.getSubterm(0);
                                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(n_48, (IStrategoList)transform.constNil0)});
                                                        if(true)
                                                          break Success109;
                                                      }
                                                      term = term93;
                                                    }
                                                    Success110:
                                                    { 
                                                      if(cons19 == transform._consWildcard_0)
                                                      { 
                                                        Fail169:
                                                        { 
                                                          term = transform.constS30;
                                                          if(true)
                                                            break Success110;
                                                        }
                                                        term = term93;
                                                      }
                                                      Success111:
                                                      { 
                                                        if(cons19 == transform._consDotWildcard_0)
                                                        { 
                                                          Fail170:
                                                          { 
                                                            term = transform.constS28;
                                                            if(true)
                                                              break Success111;
                                                          }
                                                          term = term93;
                                                        }
                                                        Success112:
                                                        { 
                                                          if(cons19 == transform._consSimpleNamePattern_1)
                                                          { 
                                                            Fail171:
                                                            { 
                                                              IStrategoTerm m_48 = null;
                                                              m_48 = term.getSubterm(0);
                                                              term = m_48;
                                                              if(true)
                                                                break Success112;
                                                            }
                                                            term = term93;
                                                          }
                                                          Success113:
                                                          { 
                                                            if(cons19 == transform._consMethodPattern_6)
                                                            { 
                                                              Fail172:
                                                              { 
                                                                IStrategoTerm a_48 = null;
                                                                IStrategoTerm b_48 = null;
                                                                IStrategoTerm c_48 = null;
                                                                IStrategoTerm d_48 = null;
                                                                IStrategoTerm e_48 = null;
                                                                IStrategoTerm f_48 = null;
                                                                IStrategoTerm g_48 = null;
                                                                IStrategoTerm h_48 = null;
                                                                IStrategoTerm i_48 = null;
                                                                IStrategoTerm j_48 = null;
                                                                IStrategoTerm arg156 = term.getSubterm(0);
                                                                if(arg156.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg156).getConstructor())
                                                                  break Fail172;
                                                                c_48 = arg156.getSubterm(0);
                                                                IStrategoTerm arg157 = term.getSubterm(1);
                                                                if(arg157.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg157).getConstructor())
                                                                  break Fail172;
                                                                d_48 = arg157.getSubterm(0);
                                                                a_48 = term.getSubterm(2);
                                                                b_48 = term.getSubterm(3);
                                                                f_48 = term.getSubterm(4);
                                                                h_48 = term.getSubterm(5);
                                                                j_48 = term;
                                                                term = termFactory.makeTuple(c_48, d_48);
                                                                term = conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail172;
                                                                e_48 = term;
                                                                term = list_to_args_0_0.instance.invoke(context, f_48);
                                                                if(term == null)
                                                                  break Fail172;
                                                                g_48 = term;
                                                                term = option_to_boxes_0_0.instance.invoke(context, h_48);
                                                                if(term == null)
                                                                  break Fail172;
                                                                i_48 = term;
                                                                term = j_48;
                                                                IStrategoList list2;
                                                                list2 = checkListTail(i_48);
                                                                if(list2 == null)
                                                                  break Fail172;
                                                                term = termFactory.makeTuple(e_48, (IStrategoTerm)termFactory.makeListCons(a_48, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(b_48, termFactory.makeListCons(g_48, (IStrategoList)transform.constNil0))}), list2)));
                                                                term = make$Conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail172;
                                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                                                                if(true)
                                                                  break Success113;
                                                              }
                                                              term = term93;
                                                            }
                                                            Success114:
                                                            { 
                                                              if(cons19 == transform._consConstrPattern_5)
                                                              { 
                                                                Fail173:
                                                                { 
                                                                  IStrategoTerm q_47 = null;
                                                                  IStrategoTerm r_47 = null;
                                                                  IStrategoTerm s_47 = null;
                                                                  IStrategoTerm t_47 = null;
                                                                  IStrategoTerm u_47 = null;
                                                                  IStrategoTerm v_47 = null;
                                                                  IStrategoTerm w_47 = null;
                                                                  IStrategoTerm arg158 = term.getSubterm(0);
                                                                  if(arg158.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg158).getConstructor())
                                                                    break Fail173;
                                                                  s_47 = arg158.getSubterm(0);
                                                                  IStrategoTerm arg159 = term.getSubterm(1);
                                                                  if(arg159.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg159).getConstructor())
                                                                    break Fail173;
                                                                  t_47 = arg159.getSubterm(0);
                                                                  q_47 = term.getSubterm(2);
                                                                  v_47 = term.getSubterm(3);
                                                                  r_47 = term.getSubterm(4);
                                                                  term = termFactory.makeTuple(s_47, t_47);
                                                                  term = conc_0_0.instance.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail173;
                                                                  u_47 = term;
                                                                  term = list_to_args_0_0.instance.invoke(context, v_47);
                                                                  if(term == null)
                                                                    break Fail173;
                                                                  w_47 = term;
                                                                  term = termFactory.makeTuple(u_47, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(q_47, termFactory.makeListCons(w_47, (IStrategoList)transform.constNil0))}), termFactory.makeListCons(r_47, (IStrategoList)transform.constNil0)));
                                                                  term = make$Conc_0_0.instance.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail173;
                                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                                                                  if(true)
                                                                    break Success114;
                                                                }
                                                                term = term93;
                                                              }
                                                              term = aspectj_to_box_0_0_fragment_2.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail146;
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
      Fail174:
      { 
        IStrategoTerm term120 = term;
        IStrategoConstructor cons20 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success115:
        { 
          if(cons20 == transform._consFieldPattern_4)
          { 
            Fail175:
            { 
              IStrategoTerm i_47 = null;
              IStrategoTerm j_47 = null;
              IStrategoTerm k_47 = null;
              IStrategoTerm l_47 = null;
              IStrategoTerm m_47 = null;
              IStrategoTerm arg160 = term.getSubterm(0);
              if(arg160.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg160).getConstructor())
                break Fail175;
              k_47 = arg160.getSubterm(0);
              IStrategoTerm arg161 = term.getSubterm(1);
              if(arg161.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg161).getConstructor())
                break Fail175;
              l_47 = arg161.getSubterm(0);
              i_47 = term.getSubterm(2);
              j_47 = term.getSubterm(3);
              term = termFactory.makeTuple(k_47, l_47);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail175;
              m_47 = term;
              term = termFactory.makeTuple(m_47, (IStrategoTerm)termFactory.makeListCons(i_47, termFactory.makeListCons(j_47, (IStrategoList)transform.constNil0)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail175;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
              if(true)
                break Success115;
            }
            term = term120;
          }
          Success116:
          { 
            if(cons20 == transform._consMemberName_1)
            { 
              Fail176:
              { 
                IStrategoTerm h_47 = null;
                h_47 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{h_47});
                if(true)
                  break Success116;
              }
              term = term120;
            }
            Success117:
            { 
              if(cons20 == transform._consMemberName_2)
              { 
                Fail177:
                { 
                  IStrategoTerm f_47 = null;
                  IStrategoTerm g_47 = null;
                  f_47 = term.getSubterm(0);
                  g_47 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(f_47, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{g_47}), (IStrategoList)transform.constNil0)))});
                  if(true)
                    break Success117;
                }
                term = term120;
              }
              Success118:
              { 
                if(cons20 == transform._consWildcardMemberName_2)
                { 
                  Fail178:
                  { 
                    IStrategoTerm d_47 = null;
                    IStrategoTerm e_47 = null;
                    d_47 = term.getSubterm(0);
                    e_47 = term.getSubterm(1);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(d_47, termFactory.makeListCons(transform.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{e_47}), (IStrategoList)transform.constNil0)))});
                    if(true)
                      break Success118;
                  }
                  term = term120;
                }
                Success119:
                { 
                  if(cons20 == transform._consConstrName_0)
                  { 
                    Fail179:
                    { 
                      term = transform.constFBOX19;
                      if(true)
                        break Success119;
                    }
                    term = term120;
                  }
                  Success120:
                  { 
                    if(cons20 == transform._consConstrName_1)
                    { 
                      Fail180:
                      { 
                        IStrategoTerm c_47 = null;
                        c_47 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(c_47, (IStrategoList)transform.constCons34)});
                        if(true)
                          break Success120;
                      }
                      term = term120;
                    }
                    Success121:
                    { 
                      if(cons20 == transform._consWildcardConstrName_1)
                      { 
                        Fail181:
                        { 
                          IStrategoTerm b_47 = null;
                          b_47 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(b_47, (IStrategoList)transform.constCons35)});
                          if(true)
                            break Success121;
                        }
                        term = term120;
                      }
                      Success122:
                      { 
                        if(cons20 == transform._consNot_1)
                        { 
                          Fail182:
                          { 
                            IStrategoTerm a_47 = null;
                            a_47 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(a_47, (IStrategoList)transform.constNil0))});
                            if(true)
                              break Success122;
                          }
                          term = term120;
                        }
                        Success123:
                        { 
                          if(cons20 == transform._consModPattern_1)
                          { 
                            Fail183:
                            { 
                              IStrategoTerm z_46 = null;
                              z_46 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, z_46});
                              if(true)
                                break Success123;
                            }
                            term = term120;
                          }
                          Success124:
                          { 
                            if(cons20 == transform._consThrowsPattern_1)
                            { 
                              Fail184:
                              { 
                                IStrategoTerm w_46 = null;
                                w_46 = term.getSubterm(0);
                                term = separate_by_comma_0_0.instance.invoke(context, w_46);
                                if(term == null)
                                  break Fail184;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX20, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                if(true)
                                  break Success124;
                              }
                              term = term120;
                            }
                            Success125:
                            { 
                              if(cons20 == transform._consNotThrowsCondition_1)
                              { 
                                Fail185:
                                { 
                                  IStrategoTerm v_46 = null;
                                  v_46 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(v_46, (IStrategoList)transform.constNil0))});
                                  if(true)
                                    break Success125;
                                }
                                term = term120;
                              }
                              Success126:
                              { 
                                if(cons20 == transform._consThrowsCondition_1)
                                { 
                                  Fail186:
                                  { 
                                    IStrategoTerm t_46 = null;
                                    t_46 = term.getSubterm(0);
                                    term = has_leftmost_not_0_0.instance.invoke(context, t_46);
                                    if(term == null)
                                      break Fail186;
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS1, termFactory.makeListCons(t_46, (IStrategoList)transform.constCons26))});
                                    if(true)
                                      break Success126;
                                  }
                                  term = term120;
                                }
                                Success127:
                                { 
                                  if(cons20 == transform._consThrowsCondition_1)
                                  { 
                                    Fail187:
                                    { 
                                      IStrategoTerm r_46 = null;
                                      r_46 = term.getSubterm(0);
                                      term = r_46;
                                      IStrategoTerm term133 = term;
                                      Success128:
                                      { 
                                        Fail188:
                                        { 
                                          term = has_leftmost_not_0_0.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail188;
                                          { 
                                            if(true)
                                              break Fail187;
                                            if(true)
                                              break Success128;
                                          }
                                        }
                                        term = term133;
                                      }
                                      term = r_46;
                                      if(true)
                                        break Success127;
                                    }
                                    term = term120;
                                  }
                                  Success129:
                                  { 
                                    if(cons20 == transform._consSimpleAnnoPatternExact_1)
                                    { 
                                      Fail189:
                                      { 
                                        IStrategoTerm q_46 = null;
                                        q_46 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(q_46, (IStrategoList)transform.constNil0))});
                                        if(true)
                                          break Success129;
                                      }
                                      term = term120;
                                    }
                                    Success130:
                                    { 
                                      if(cons20 == transform._consSimpleAnnoPattern_1)
                                      { 
                                        Fail190:
                                        { 
                                          IStrategoTerm p_46 = null;
                                          p_46 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(p_46, (IStrategoList)transform.constCons26)))});
                                          if(true)
                                            break Success130;
                                        }
                                        term = term120;
                                      }
                                      Success131:
                                      { 
                                        if(cons20 == transform._consSimpleAnnoPatternValue_2)
                                        { 
                                          Fail191:
                                          { 
                                            IStrategoTerm n_46 = null;
                                            IStrategoTerm o_46 = null;
                                            n_46 = term.getSubterm(0);
                                            o_46 = term.getSubterm(1);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(n_46, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(o_46, (IStrategoList)transform.constCons26))))});
                                            if(true)
                                              break Success131;
                                          }
                                          term = term120;
                                        }
                                        Success132:
                                        { 
                                          if(cons20 == transform._consNotComp_1)
                                          { 
                                            Fail192:
                                            { 
                                              IStrategoTerm m_46 = null;
                                              m_46 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(m_46, (IStrategoList)transform.constNil0))});
                                              if(true)
                                                break Success132;
                                            }
                                            term = term120;
                                          }
                                          Success133:
                                          { 
                                            if(cons20 == transform._consAndComp_2)
                                            { 
                                              Fail193:
                                              { 
                                                IStrategoTerm k_46 = null;
                                                IStrategoTerm l_46 = null;
                                                k_46 = term.getSubterm(0);
                                                l_46 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(k_46, termFactory.makeListCons(transform.constS35, termFactory.makeListCons(l_46, (IStrategoList)transform.constNil0)))});
                                                if(true)
                                                  break Success133;
                                              }
                                              term = term120;
                                            }
                                            Success134:
                                            { 
                                              if(cons20 == transform._consOrComp_2)
                                              { 
                                                Fail194:
                                                { 
                                                  IStrategoTerm i_46 = null;
                                                  IStrategoTerm j_46 = null;
                                                  i_46 = term.getSubterm(0);
                                                  j_46 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(i_46, termFactory.makeListCons(transform.constS36, termFactory.makeListCons(j_46, (IStrategoList)transform.constNil0)))});
                                                  if(true)
                                                    break Success134;
                                                }
                                                term = term120;
                                              }
                                              Success135:
                                              { 
                                                if(cons20 == transform._consIntertypeMethodDec_2)
                                                { 
                                                  Fail195:
                                                  { 
                                                    IStrategoTerm g_46 = null;
                                                    IStrategoTerm h_46 = null;
                                                    g_46 = term.getSubterm(0);
                                                    IStrategoTerm arg162 = term.getSubterm(1);
                                                    h_46 = arg162;
                                                    if(arg162.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg162).getConstructor())
                                                      break Fail195;
                                                    term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons36, (IStrategoTerm)termFactory.makeListCons(g_46, termFactory.makeListCons(h_46, (IStrategoList)transform.constNil0))});
                                                    if(true)
                                                      break Success135;
                                                  }
                                                  term = term120;
                                                }
                                                Success136:
                                                { 
                                                  if(cons20 == transform._consIntertypeMethodDec_2)
                                                  { 
                                                    Fail196:
                                                    { 
                                                      IStrategoTerm f_46 = null;
                                                      f_46 = term.getSubterm(0);
                                                      IStrategoTerm arg164 = term.getSubterm(1);
                                                      if(arg164.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg164).getConstructor())
                                                        break Fail196;
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(f_46, (IStrategoList)transform.constCons30)});
                                                      if(true)
                                                        break Success136;
                                                    }
                                                    term = term120;
                                                  }
                                                  Success137:
                                                  { 
                                                    if(cons20 == transform._consIntertypeMethodDecHead_8)
                                                    { 
                                                      Fail197:
                                                      { 
                                                        IStrategoTerm n_45 = null;
                                                        IStrategoTerm o_45 = null;
                                                        IStrategoTerm p_45 = null;
                                                        IStrategoTerm q_45 = null;
                                                        IStrategoTerm r_45 = null;
                                                        IStrategoTerm s_45 = null;
                                                        IStrategoTerm t_45 = null;
                                                        IStrategoTerm u_45 = null;
                                                        IStrategoTerm v_45 = null;
                                                        IStrategoTerm w_45 = null;
                                                        IStrategoTerm x_45 = null;
                                                        IStrategoTerm y_45 = null;
                                                        IStrategoTerm z_45 = null;
                                                        IStrategoTerm a_46 = null;
                                                        IStrategoTerm d_46 = null;
                                                        IStrategoTerm e_46 = null;
                                                        x_45 = term.getSubterm(0);
                                                        s_45 = term.getSubterm(1);
                                                        n_45 = term.getSubterm(2);
                                                        o_45 = term.getSubterm(3);
                                                        t_45 = term.getSubterm(4);
                                                        IStrategoTerm arg165 = term.getSubterm(5);
                                                        if(arg165.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg165).getConstructor())
                                                          break Fail197;
                                                        p_45 = arg165.getSubterm(0);
                                                        q_45 = term.getSubterm(6);
                                                        v_45 = term.getSubterm(7);
                                                        a_46 = term;
                                                        term = list_to_args_0_0.instance.invoke(context, q_45);
                                                        if(term == null)
                                                          break Fail197;
                                                        r_45 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, s_45);
                                                        if(term == null)
                                                          break Fail197;
                                                        y_45 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, t_45);
                                                        if(term == null)
                                                          break Fail197;
                                                        u_45 = term;
                                                        term = option_to_boxes_0_0.instance.invoke(context, v_45);
                                                        if(term == null)
                                                          break Fail197;
                                                        w_45 = term;
                                                        term = termFactory.makeTuple(x_45, y_45);
                                                        term = conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail197;
                                                        z_45 = term;
                                                        term = a_46;
                                                        e_46 = term;
                                                        term = termFactory.makeTuple(u_45, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{p_45}), termFactory.makeListCons(r_45, (IStrategoList)transform.constNil0))));
                                                        term = make$Conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail197;
                                                        d_46 = term;
                                                        term = e_46;
                                                        IStrategoList list4;
                                                        IStrategoList list3;
                                                        list3 = checkListTail(w_45);
                                                        if(list3 == null)
                                                          break Fail197;
                                                        list4 = checkListTail(d_46);
                                                        if(list4 == null)
                                                          break Fail197;
                                                        term = termFactory.makeTuple(z_45, (IStrategoTerm)termFactory.makeListCons(n_45, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(o_45, list4)}), list3)));
                                                        term = make$Conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail197;
                                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                                                        if(true)
                                                          break Success137;
                                                      }
                                                      term = term120;
                                                    }
                                                    Success138:
                                                    { 
                                                      if(cons20 == transform._consIntertypeConstrDec_2)
                                                      { 
                                                        Fail198:
                                                        { 
                                                          IStrategoTerm l_45 = null;
                                                          IStrategoTerm m_45 = null;
                                                          l_45 = term.getSubterm(0);
                                                          m_45 = term.getSubterm(1);
                                                          term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons36, (IStrategoTerm)termFactory.makeListCons(l_45, termFactory.makeListCons(m_45, (IStrategoList)transform.constNil0))});
                                                          if(true)
                                                            break Success138;
                                                        }
                                                        term = term120;
                                                      }
                                                      term = aspectj_to_box_0_0_fragment_1.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail174;
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
      Fail199:
      { 
        IStrategoTerm term144 = term;
        IStrategoConstructor cons21 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success139:
        { 
          if(cons21 == transform._consIntertypeConstrDecHead_6)
          { 
            Fail200:
            { 
              IStrategoTerm v_44 = null;
              IStrategoTerm w_44 = null;
              IStrategoTerm x_44 = null;
              IStrategoTerm y_44 = null;
              IStrategoTerm z_44 = null;
              IStrategoTerm a_45 = null;
              IStrategoTerm b_45 = null;
              IStrategoTerm c_45 = null;
              IStrategoTerm d_45 = null;
              IStrategoTerm e_45 = null;
              IStrategoTerm f_45 = null;
              IStrategoTerm g_45 = null;
              IStrategoTerm j_45 = null;
              IStrategoTerm k_45 = null;
              d_45 = term.getSubterm(0);
              y_44 = term.getSubterm(1);
              v_44 = term.getSubterm(2);
              z_44 = term.getSubterm(3);
              w_44 = term.getSubterm(4);
              b_45 = term.getSubterm(5);
              g_45 = term;
              term = list_to_args_0_0.instance.invoke(context, w_44);
              if(term == null)
                break Fail200;
              x_44 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, y_44);
              if(term == null)
                break Fail200;
              e_45 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, z_44);
              if(term == null)
                break Fail200;
              a_45 = term;
              term = option_to_boxes_0_0.instance.invoke(context, b_45);
              if(term == null)
                break Fail200;
              c_45 = term;
              term = termFactory.makeTuple(d_45, e_45);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail200;
              f_45 = term;
              term = g_45;
              k_45 = term;
              term = termFactory.makeTuple(a_45, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(transform.constFBOX19, termFactory.makeListCons(x_44, (IStrategoList)transform.constNil0))));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail200;
              j_45 = term;
              term = k_45;
              IStrategoList list6;
              IStrategoList list5;
              list5 = checkListTail(c_45);
              if(list5 == null)
                break Fail200;
              list6 = checkListTail(j_45);
              if(list6 == null)
                break Fail200;
              term = termFactory.makeTuple(f_45, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(v_44, list6)}), list5));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail200;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
              if(true)
                break Success139;
            }
            term = term144;
          }
          Success140:
          { 
            if(cons21 == transform._consIntertypeFieldDec_5)
            { 
              Fail201:
              { 
                IStrategoTerm k_44 = null;
                IStrategoTerm l_44 = null;
                IStrategoTerm m_44 = null;
                IStrategoTerm n_44 = null;
                IStrategoTerm o_44 = null;
                IStrategoTerm p_44 = null;
                IStrategoTerm q_44 = null;
                IStrategoTerm t_44 = null;
                IStrategoTerm u_44 = null;
                k_44 = term.getSubterm(0);
                l_44 = term.getSubterm(1);
                m_44 = term.getSubterm(2);
                o_44 = term.getSubterm(3);
                n_44 = term.getSubterm(4);
                q_44 = term;
                term = option_to_boxes_0_0.instance.invoke(context, o_44);
                if(term == null)
                  break Fail201;
                p_44 = term;
                term = q_44;
                u_44 = term;
                term = termFactory.makeTuple(p_44, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(n_44, (IStrategoList)transform.constCons30)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail201;
                t_44 = term;
                term = u_44;
                IStrategoList list7;
                list7 = checkListTail(t_44);
                if(list7 == null)
                  break Fail201;
                term = termFactory.makeTuple(k_44, (IStrategoTerm)termFactory.makeListCons(l_44, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(m_44, list7)}), (IStrategoList)transform.constNil0)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail201;
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                if(true)
                  break Success140;
              }
              term = term144;
            }
            Success141:
            { 
              if(cons21 == transform._consAdviceDec_5)
              { 
                Fail202:
                { 
                  IStrategoTerm z_43 = null;
                  IStrategoTerm a_44 = null;
                  IStrategoTerm b_44 = null;
                  IStrategoTerm c_44 = null;
                  IStrategoTerm d_44 = null;
                  IStrategoTerm e_44 = null;
                  IStrategoTerm f_44 = null;
                  IStrategoTerm i_44 = null;
                  IStrategoTerm j_44 = null;
                  z_43 = term.getSubterm(0);
                  a_44 = term.getSubterm(1);
                  d_44 = term.getSubterm(2);
                  b_44 = term.getSubterm(3);
                  c_44 = term.getSubterm(4);
                  f_44 = term;
                  term = option_to_boxes_0_0.instance.invoke(context, d_44);
                  if(term == null)
                    break Fail202;
                  e_44 = term;
                  term = f_44;
                  j_44 = term;
                  term = termFactory.makeTuple(e_44, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(b_44, (IStrategoList)transform.constNil0)));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail202;
                  i_44 = term;
                  term = j_44;
                  IStrategoList list8;
                  list8 = checkListTail(i_44);
                  if(list8 == null)
                    break Fail202;
                  term = termFactory.makeTuple(z_43, (IStrategoTerm)termFactory.makeListCons(a_44, list8));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail202;
                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons36, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term}), termFactory.makeListCons(c_44, (IStrategoList)transform.constNil0))});
                  if(true)
                    break Success141;
                }
                term = term144;
              }
              Success142:
              { 
                if(cons21 == transform._consBefore_1)
                { 
                  Fail203:
                  { 
                    IStrategoTerm w_43 = null;
                    w_43 = term.getSubterm(0);
                    term = separate_by_comma_0_0.instance.invoke(context, w_43);
                    if(term == null)
                      break Fail203;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX24, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons37)))});
                    if(true)
                      break Success142;
                  }
                  term = term144;
                }
                Success143:
                { 
                  if(cons21 == transform._consAfter_2)
                  { 
                    Fail204:
                    { 
                      IStrategoTerm s_43 = null;
                      IStrategoTerm t_43 = null;
                      t_43 = term.getSubterm(0);
                      s_43 = term.getSubterm(1);
                      term = separate_by_comma_0_0.instance.invoke(context, t_43);
                      if(term == null)
                        break Fail204;
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX25, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons37)))}), termFactory.makeListCons(s_43, (IStrategoList)transform.constNil0))});
                      if(true)
                        break Success143;
                    }
                    term = term144;
                  }
                  Success144:
                  { 
                    if(cons21 == transform._consAround_2)
                    { 
                      Fail205:
                      { 
                        IStrategoTerm o_43 = null;
                        IStrategoTerm p_43 = null;
                        o_43 = term.getSubterm(0);
                        p_43 = term.getSubterm(1);
                        term = separate_by_comma_0_0.instance.invoke(context, p_43);
                        if(term == null)
                          break Fail205;
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(o_43, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX26, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons37)))}), (IStrategoList)transform.constNil0))});
                        if(true)
                          break Success144;
                      }
                      term = term144;
                    }
                    Success145:
                    { 
                      if(cons21 == transform._consReturning_0)
                      { 
                        Fail206:
                        { 
                          term = transform.constFBOX27;
                          if(true)
                            break Success145;
                        }
                        term = term144;
                      }
                      Success146:
                      { 
                        if(cons21 == transform._consReturning_1)
                        { 
                          Fail207:
                          { 
                            IStrategoTerm n_43 = null;
                            n_43 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX27, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(n_43, (IStrategoList)transform.constCons37)))});
                            if(true)
                              break Success146;
                          }
                          term = term144;
                        }
                        Success147:
                        { 
                          if(cons21 == transform._consThrowing_0)
                          { 
                            Fail208:
                            { 
                              term = transform.constFBOX28;
                              if(true)
                                break Success147;
                            }
                            term = term144;
                          }
                          Success148:
                          { 
                            if(cons21 == transform._consThrowing_1)
                            { 
                              Fail209:
                              { 
                                IStrategoTerm m_43 = null;
                                m_43 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX28, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(m_43, (IStrategoList)transform.constCons37)))});
                                if(true)
                                  break Success148;
                              }
                              term = term144;
                            }
                            Success149:
                            { 
                              if(cons21 == transform._consDecParent_3)
                              { 
                                Fail210:
                                { 
                                  IStrategoTerm h_43 = null;
                                  IStrategoTerm i_43 = null;
                                  IStrategoTerm j_43 = null;
                                  h_43 = term.getSubterm(0);
                                  i_43 = term.getSubterm(1);
                                  j_43 = term.getSubterm(2);
                                  term = termFactory.makeTuple(h_43, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX29, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(i_43, termFactory.makeListCons(j_43, (IStrategoList)transform.constCons38))))));
                                  term = make$Conc_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail210;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                                  if(true)
                                    break Success149;
                                }
                                term = term144;
                              }
                              Success150:
                              { 
                                if(cons21 == transform._consDecWarning_3)
                                { 
                                  Fail211:
                                  { 
                                    IStrategoTerm c_43 = null;
                                    IStrategoTerm d_43 = null;
                                    IStrategoTerm e_43 = null;
                                    c_43 = term.getSubterm(0);
                                    d_43 = term.getSubterm(1);
                                    e_43 = term.getSubterm(2);
                                    term = termFactory.makeTuple(c_43, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX31, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(d_43, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(e_43, (IStrategoList)transform.constCons38)))))));
                                    term = make$Conc_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail211;
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                                    if(true)
                                      break Success150;
                                  }
                                  term = term144;
                                }
                                term = aspectj_to_box_0_0_fragment_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail199;
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
      Fail212:
      { 
        IStrategoTerm term156 = term;
        IStrategoConstructor cons22 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success151:
        { 
          if(cons22 == transform._consDecError_2)
          { 
            Fail213:
            { 
              IStrategoTerm a_43 = null;
              IStrategoTerm b_43 = null;
              a_43 = term.getSubterm(0);
              b_43 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX32, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(a_43, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(b_43, (IStrategoList)transform.constCons38))))))});
              if(true)
                break Success151;
            }
            term = term156;
          }
          Success152:
          { 
            if(cons22 == transform._consDecSoft_2)
            { 
              Fail214:
              { 
                IStrategoTerm y_42 = null;
                IStrategoTerm z_42 = null;
                y_42 = term.getSubterm(0);
                z_42 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX33, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(y_42, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(z_42, (IStrategoList)transform.constCons38))))))});
                if(true)
                  break Success152;
              }
              term = term156;
            }
            Success153:
            { 
              if(cons22 == transform._consDecPrecedence_2)
              { 
                Fail215:
                { 
                  IStrategoTerm s_42 = null;
                  IStrategoTerm t_42 = null;
                  IStrategoTerm u_42 = null;
                  s_42 = term.getSubterm(0);
                  t_42 = term.getSubterm(1);
                  term = separate_by_comma_0_0.instance.invoke(context, t_42);
                  if(term == null)
                    break Fail215;
                  u_42 = term;
                  term = termFactory.makeTuple(s_42, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX34, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(u_42, (IStrategoList)transform.constCons38)))));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail215;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                  if(true)
                    break Success153;
                }
                term = term156;
              }
              Success154:
              { 
                if(cons22 == transform._consDecAnno_4)
                { 
                  Fail216:
                  { 
                    IStrategoTerm m_42 = null;
                    IStrategoTerm n_42 = null;
                    IStrategoTerm o_42 = null;
                    IStrategoTerm p_42 = null;
                    m_42 = term.getSubterm(0);
                    n_42 = term.getSubterm(1);
                    o_42 = term.getSubterm(2);
                    p_42 = term.getSubterm(3);
                    term = termFactory.makeTuple(m_42, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(n_42, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(o_42, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(p_42, (IStrategoList)transform.constCons30)))))));
                    term = make$Conc_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail216;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                    if(true)
                      break Success154;
                  }
                  term = term156;
                }
                Success155:
                { 
                  if(cons22 == transform._consDecAnnoType_0)
                  { 
                    Fail217:
                    { 
                      term = transform.constS48;
                      if(true)
                        break Success155;
                    }
                    term = term156;
                  }
                  Success156:
                  { 
                    if(cons22 == transform._consDecAnnoConstructor_0)
                    { 
                      Fail218:
                      { 
                        term = transform.constS49;
                        if(true)
                          break Success156;
                      }
                      term = term156;
                    }
                    Success157:
                    { 
                      if(cons22 == transform._consDecAnnoMethod_0)
                      { 
                        Fail219:
                        { 
                          term = transform.constS50;
                          if(true)
                            break Success157;
                        }
                        term = term156;
                      }
                      Success158:
                      { 
                        if(cons22 == transform._consDecAnnoField_0)
                        { 
                          Fail220:
                          { 
                            term = transform.constS51;
                            if(true)
                              break Success158;
                          }
                          term = term156;
                        }
                        Success159:
                        { 
                          if(cons22 == transform._consAspectDec_2)
                          { 
                            Fail221:
                            { 
                              IStrategoTerm k_42 = null;
                              IStrategoTerm l_42 = null;
                              k_42 = term.getSubterm(0);
                              l_42 = term.getSubterm(1);
                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons36, (IStrategoTerm)termFactory.makeListCons(k_42, termFactory.makeListCons(l_42, (IStrategoList)transform.constNil0))});
                              if(true)
                                break Success159;
                            }
                            term = term156;
                          }
                          Success160:
                          { 
                            if(cons22 == transform._consAspectDecHead_6)
                            { 
                              Fail222:
                              { 
                                IStrategoTerm r_41 = null;
                                IStrategoTerm s_41 = null;
                                IStrategoTerm t_41 = null;
                                IStrategoTerm u_41 = null;
                                IStrategoTerm v_41 = null;
                                IStrategoTerm w_41 = null;
                                IStrategoTerm x_41 = null;
                                IStrategoTerm y_41 = null;
                                IStrategoTerm z_41 = null;
                                IStrategoTerm a_42 = null;
                                IStrategoTerm b_42 = null;
                                IStrategoTerm e_42 = null;
                                IStrategoTerm f_42 = null;
                                r_41 = term.getSubterm(0);
                                s_41 = term.getSubterm(1);
                                t_41 = term.getSubterm(2);
                                v_41 = term.getSubterm(3);
                                x_41 = term.getSubterm(4);
                                z_41 = term.getSubterm(5);
                                b_42 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, t_41);
                                if(term == null)
                                  break Fail222;
                                u_41 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, v_41);
                                if(term == null)
                                  break Fail222;
                                w_41 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, x_41);
                                if(term == null)
                                  break Fail222;
                                y_41 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, z_41);
                                if(term == null)
                                  break Fail222;
                                a_42 = term;
                                term = b_42;
                                f_42 = term;
                                term = termFactory.makeTuple(y_41, a_42);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail222;
                                term = termFactory.makeTuple(w_41, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail222;
                                term = termFactory.makeTuple(u_41, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail222;
                                e_42 = term;
                                term = f_42;
                                IStrategoList list9;
                                list9 = checkListTail(e_42);
                                if(list9 == null)
                                  break Fail222;
                                term = termFactory.makeTuple(r_41, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX35, termFactory.makeListCons(s_41, list9)));
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail222;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                                if(true)
                                  break Success160;
                              }
                              term = term156;
                            }
                            Success161:
                            { 
                              if(cons22 == transform._consPerTarget_1)
                              { 
                                Fail223:
                                { 
                                  IStrategoTerm q_41 = null;
                                  q_41 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX36, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(q_41, (IStrategoList)transform.constCons26)))});
                                  if(true)
                                    break Success161;
                                }
                                term = term156;
                              }
                              Success162:
                              { 
                                if(cons22 == transform._consPerThis_1)
                                { 
                                  Fail224:
                                  { 
                                    IStrategoTerm p_41 = null;
                                    p_41 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX37, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(p_41, (IStrategoList)transform.constCons26)))});
                                    if(true)
                                      break Success162;
                                  }
                                  term = term156;
                                }
                                Success163:
                                { 
                                  if(cons22 == transform._consPerCFlow_1)
                                  { 
                                    Fail225:
                                    { 
                                      IStrategoTerm o_41 = null;
                                      o_41 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX38, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(o_41, (IStrategoList)transform.constCons26)))});
                                      if(true)
                                        break Success163;
                                    }
                                    term = term156;
                                  }
                                  Success164:
                                  { 
                                    if(cons22 == transform._consPerCFlowBelow_1)
                                    { 
                                      Fail226:
                                      { 
                                        IStrategoTerm n_41 = null;
                                        n_41 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX39, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(n_41, (IStrategoList)transform.constCons26)))});
                                        if(true)
                                          break Success164;
                                      }
                                      term = term156;
                                    }
                                    Success165:
                                    { 
                                      if(cons22 == transform._consPerTypeWithin_1)
                                      { 
                                        Fail227:
                                        { 
                                          IStrategoTerm m_41 = null;
                                          m_41 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX40, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(m_41, (IStrategoList)transform.constCons26)))});
                                          if(true)
                                            break Success165;
                                        }
                                        term = term156;
                                      }
                                      Success166:
                                      { 
                                        if(cons22 == transform._consIsSingleton_0)
                                        { 
                                          Fail228:
                                          { 
                                            term = transform.constFBOX41;
                                            if(true)
                                              break Success166;
                                          }
                                          term = term156;
                                        }
                                        Success167:
                                        { 
                                          if(cons22 == transform._consAspectBody_1)
                                          { 
                                            Fail229:
                                            { 
                                              IStrategoTerm l_41 = null;
                                              l_41 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constNil0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons41, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX43, termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons42, l_41}), (IStrategoList)transform.constNil0))}), (IStrategoList)transform.constCons39)});
                                              if(true)
                                                break Success167;
                                            }
                                            term = term156;
                                          }
                                          Success168:
                                          { 
                                            if(cons22 == transform._consPrivileged_0)
                                            { 
                                              Fail230:
                                              { 
                                                term = transform.constFBOX44;
                                                if(true)
                                                  break Success168;
                                              }
                                              term = term156;
                                            }
                                            if(cons22 == transform._consProceed_0)
                                            { 
                                              term = transform.constFBOX45;
                                            }
                                            else
                                            { 
                                              break Fail212;
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
      Fail231:
      { 
        IStrategoTerm term174 = term;
        IStrategoConstructor cons23 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success169:
        { 
          if(cons23 == transform._consCall_1)
          { 
            Fail232:
            { 
              IStrategoTerm x_50 = null;
              x_50 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX46, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(x_50, (IStrategoList)transform.constCons26)))});
              if(true)
                break Success169;
            }
            term = term174;
          }
          Success170:
          { 
            if(cons23 == transform._consExec_1)
            { 
              Fail233:
              { 
                IStrategoTerm w_50 = null;
                w_50 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX47, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(w_50, (IStrategoList)transform.constCons26)))});
                if(true)
                  break Success170;
              }
              term = term174;
            }
            term = aspectj_to_box_0_0_fragment_4.instance.invoke(context, term);
            if(term == null)
              break Fail231;
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
      Fail234:
      { 
        term = z_50.instance.invoke(context, term);
        if(term == null)
          break Fail234;
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
      Fail235:
      { 
        IStrategoTerm term178 = term;
        IStrategoConstructor cons24 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success171:
        { 
          if(cons24 == transform._consSome_1)
          { 
            Fail236:
            { 
              IStrategoTerm a_51 = null;
              a_51 = term.getSubterm(0);
              term = a_51;
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0);
              if(true)
                break Success171;
            }
            term = term178;
          }
          if(cons24 == transform._consNone_0)
          { 
            term = transform.constNil0;
          }
          else
          { 
            break Fail235;
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
      Fail237:
      { 
        IStrategoTerm e_51 = null;
        term = pp_java5_to_abox_1_0.instance.invoke(context, term, lifted76.instance);
        if(term == null)
          break Fail237;
        e_51 = term;
        term = box2text_string_0_1.instance.invoke(context, e_51, transform.const110);
        if(term == null)
          break Fail237;
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
      Fail238:
      { 
        term = handle_io_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail238;
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
      Fail239:
      { 
        IStrategoTerm k_51 = null;
        IStrategoTerm m_51 = null;
        IStrategoTerm n_51 = null;
        IStrategoTerm p_51 = null;
        IStrategoTerm u_51 = null;
        IStrategoTerm z_51 = null;
        IStrategoTerm b_52 = null;
        IStrategoTerm c_52 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail239;
        k_51 = ((IStrategoList)term).tail();
        term = debug_0_0.instance.invoke(context, k_51);
        if(term == null)
          break Fail239;
        term = k_51;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail239;
        p_51 = ((IStrategoList)term).head();
        term = p_51;
        m_51 = p_51;
        term = $Read$From$File_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail239;
        term = k_51;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail239;
        u_51 = ((IStrategoList)term).tail();
        term = u_51;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail239;
        term = transform_0_0.instance.invoke(context, m_51);
        if(term == null)
          break Fail239;
        n_51 = term;
        b_52 = m_51;
        z_51 = transform.const111;
        c_52 = b_52;
        term = string_replace_0_2.instance.invoke(context, c_52, z_51, transform.const112);
        if(term == null)
          break Fail239;
        term = termFactory.makeTuple(term, transform.const113);
        term = fopen_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail239;
        term = termFactory.makeTuple(n_51, term);
        term = fputs_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail239;
        term = fclose_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail239;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class transform_0_0 extends Strategy 
  { 
    public static transform_0_0 instance = new transform_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("transform_0_0");
      Fail240:
      { 
        IStrategoTerm i_52 = null;
        IStrategoTerm l_52 = null;
        IStrategoTerm m_52 = null;
        i_52 = term;
        l_52 = i_52;
        m_52 = transform.constEjpTbl;
        term = parse_file_0_1.instance.invoke(context, l_52, m_52);
        if(term == null)
          break Fail240;
        term = topdown_1_0.instance.invoke(context, term, lifted77.instance);
        if(term == null)
          break Fail240;
        term = transform_ast_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail240;
        term = pp_aspectj_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail240;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class transform_ast_0_0 extends Strategy 
  { 
    public static transform_ast_0_0 instance = new transform_ast_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("transform_ast_0_0");
      Fail241:
      { 
        term = try_1_0.instance.invoke(context, term, ejp_converter_compilation_unit_0_0.instance);
        if(term == null)
          break Fail241;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_source_location_0_0 extends Strategy 
  { 
    public static gen_source_location_0_0 instance = new gen_source_location_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_source_location_0_0");
      Fail242:
      { 
        IStrategoTerm s_52 = null;
        IStrategoTerm t_52 = null;
        s_52 = term;
        term = origin_location_0_0.instance.invoke(context, s_52);
        if(term == null)
          break Fail242;
        t_52 = term;
        term = origin_file_0_0.instance.invoke(context, s_52);
        if(term == null)
          break Fail242;
        term = (IStrategoTerm)termFactory.makeListCons(t_52, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class origin_location_0_0 extends Strategy 
  { 
    public static origin_location_0_0 instance = new origin_location_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail243:
      { 
        IStrategoTerm y_52 = null;
        y_52 = term;
        term = context.invokePrimitive("SSL_EXT_origin_location", y_52, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(term == null)
          break Fail243;
        if(true)
          return term;
      }
      context.push("origin_location_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class origin_file_0_0 extends Strategy 
  { 
    public static origin_file_0_0 instance = new origin_file_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail244:
      { 
        IStrategoTerm c_53 = null;
        c_53 = term;
        term = context.invokePrimitive("SSL_EXT_origin_file", c_53, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(term == null)
          break Fail244;
        if(true)
          return term;
      }
      context.push("origin_file_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class ejp_converter_compilation_unit_0_0 extends Strategy 
  { 
    public static ejp_converter_compilation_unit_0_0 instance = new ejp_converter_compilation_unit_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("ejp_converter_compilation_unit_0_0");
      Fail245:
      { 
        IStrategoTerm h_53 = null;
        IStrategoTerm i_53 = null;
        IStrategoTerm j_53 = null;
        IStrategoTerm k_53 = null;
        TermReference l_53 = new TermReference();
        IStrategoTerm m_53 = null;
        IStrategoTerm n_53 = null;
        IStrategoTerm q_53 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
          break Fail245;
        i_53 = term.getSubterm(0);
        j_53 = term.getSubterm(1);
        m_53 = term.getSubterm(2);
        q_53 = term;
        IStrategoTerm term180 = term;
        Success172:
        { 
          Fail246:
          { 
            IStrategoTerm term181 = term;
            Success173:
            { 
              Fail247:
              { 
                IStrategoTerm o_53 = null;
                IStrategoTerm r_53 = null;
                o_53 = term;
                term = SRTS_all.instance.invoke(context, m_53, lifted80.instance);
                if(term == null)
                  break Fail247;
                r_53 = term;
                h_53 = m_53;
                term = r_53;
                if(term != h_53 && !h_53.match(term))
                  break Fail247;
                term = o_53;
                { 
                  k_53 = j_53;
                  term = m_53;
                  n_53 = m_53;
                  if(true)
                    break Success173;
                }
              }
              term = term181;
              Success174:
              { 
                Fail248:
                { 
                  IStrategoTerm p_53 = null;
                  p_53 = term;
                  term = i_53;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail248;
                  IStrategoTerm arg166 = term.getSubterm(0);
                  if(arg166.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg166).getConstructor())
                    break Fail248;
                  term = p_53;
                  { 
                    term = i_53;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail246;
                    IStrategoTerm arg169 = term.getSubterm(0);
                    if(arg169.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg169).getConstructor())
                      break Fail246;
                    if(l_53.value == null)
                      l_53.value = arg169.getSubterm(1);
                    else
                      if(l_53.value != arg169.getSubterm(1) && !l_53.value.match(arg169.getSubterm(1)))
                        break Fail246;
                    if(true)
                      break Success174;
                  }
                }
                term = transform.constNone0;
                if(l_53.value == null)
                  l_53.value = term;
                else
                  if(l_53.value != term && !l_53.value.match(term))
                    break Fail246;
              }
              term = termFactory.makeTuple(j_53, transform.constCons45);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail246;
              k_53 = term;
              term = m_53;
              lifted82 lifted820 = new lifted82();
              lifted820.l_53 = l_53;
              term = SRTS_all.instance.invoke(context, term, lifted820);
              if(term == null)
                break Fail246;
              n_53 = term;
            }
            if(true)
              break Success172;
          }
          term = term180;
          IStrategoTerm u_53 = null;
          u_53 = term;
          term = report_with_failure_0_1.instance.invoke(context, u_53, transform.const116);
          if(term == null)
            break Fail245;
        }
        term = q_53;
        if(k_53 == null || n_53 == null)
          break Fail245;
        term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{i_53, k_53, n_53});
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
      Fail249:
      { 
        IStrategoTerm term183 = term;
        IStrategoConstructor cons25 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success175:
        { 
          if(cons25 == transform._consClassDec_2)
          { 
            Fail250:
            { 
              IStrategoTerm f_54 = null;
              IStrategoTerm g_54 = null;
              IStrategoTerm h_54 = null;
              IStrategoTerm i_54 = null;
              f_54 = term.getSubterm(0);
              g_54 = term.getSubterm(1);
              i_54 = term;
              IStrategoTerm term184 = term;
              Success176:
              { 
                Fail251:
                { 
                  term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{f_54, g_54});
                  term = topdown_1_0.instance.invoke(context, term, lifted84.instance);
                  if(term == null)
                    break Fail251;
                  h_54 = term;
                  if(true)
                    break Success176;
                }
                term = term184;
                IStrategoTerm k_54 = null;
                k_54 = term;
                term = report_with_failure_0_1.instance.invoke(context, k_54, transform.const117);
                if(term == null)
                  break Fail250;
              }
              term = i_54;
              if(h_54 == null)
                break Fail250;
              term = h_54;
              if(true)
                break Success175;
            }
            term = term183;
          }
          if(cons25 == transform._consAspectDec_2)
          { 
            IStrategoTerm x_53 = null;
            IStrategoTerm y_53 = null;
            IStrategoTerm z_53 = null;
            IStrategoTerm a_54 = null;
            x_53 = term.getSubterm(0);
            y_53 = term.getSubterm(1);
            a_54 = term;
            IStrategoTerm term186 = term;
            Success177:
            { 
              Fail252:
              { 
                term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{x_53, y_53});
                term = topdown_1_0.instance.invoke(context, term, lifted86.instance);
                if(term == null)
                  break Fail252;
                z_53 = term;
                if(true)
                  break Success177;
              }
              term = term186;
              IStrategoTerm c_54 = null;
              c_54 = term;
              term = report_with_failure_0_1.instance.invoke(context, c_54, transform.const117);
              if(term == null)
                break Fail249;
            }
            term = a_54;
            if(z_53 == null)
              break Fail249;
            term = z_53;
          }
          else
          { 
            break Fail249;
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

  @SuppressWarnings("all") public static class ejp_converter_aspect_or_class_0_1 extends Strategy 
  { 
    public static ejp_converter_aspect_or_class_0_1 instance = new ejp_converter_aspect_or_class_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_78)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference y_78 = new TermReference(ref_y_78);
      context.push("ejp_converter_aspect_or_class_0_1");
      Fail253:
      { 
        IStrategoTerm term187 = term;
        Success178:
        { 
          Fail254:
          { 
            IStrategoTerm x_54 = null;
            TermReference y_54 = new TermReference();
            IStrategoTerm z_54 = null;
            TermReference a_55 = new TermReference();
            IStrategoTerm b_55 = null;
            IStrategoTerm c_55 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDec_2 != ((IStrategoAppl)term).getConstructor())
              break Fail254;
            x_54 = term.getSubterm(0);
            IStrategoTerm arg176 = term.getSubterm(1);
            if(arg176.getTermType() != IStrategoTerm.APPL || transform._consAspectBody_1 != ((IStrategoAppl)arg176).getConstructor())
              break Fail254;
            z_54 = arg176.getSubterm(0);
            c_55 = term;
            IStrategoTerm term188 = term;
            Success179:
            { 
              Fail255:
              { 
                IStrategoTerm h_55 = null;
                IStrategoTerm j_55 = null;
                term = x_54;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDecHead_6 != ((IStrategoAppl)term).getConstructor())
                  break Fail255;
                IStrategoTerm arg178 = term.getSubterm(1);
                if(arg178.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg178).getConstructor())
                  break Fail255;
                if(y_54.value == null)
                  y_54.value = arg178.getSubterm(0);
                else
                  if(y_54.value != arg178.getSubterm(0) && !y_54.value.match(arg178.getSubterm(0)))
                    break Fail255;
                term = new_iset_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail255;
                if(a_55.value == null)
                  a_55.value = term;
                else
                  if(a_55.value != term && !a_55.value.match(term))
                    break Fail255;
                j_55 = term;
                term = z_54;
                lifted88 lifted880 = new lifted88();
                lifted880.a_55 = a_55;
                lifted880.y_78 = y_78;
                lifted880.y_54 = y_54;
                term = topdown_1_0.instance.invoke(context, term, lifted880);
                if(term == null)
                  break Fail255;
                h_55 = term;
                term = j_55;
                if(a_55.value == null)
                  break Fail255;
                term = iset_elements_0_0.instance.invoke(context, a_55.value);
                if(term == null)
                  break Fail255;
                term = termFactory.makeTuple(h_55, term);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail255;
                term = termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term});
                b_55 = term;
                if(true)
                  break Success179;
              }
              term = term188;
              IStrategoTerm m_55 = null;
              m_55 = term;
              term = report_with_failure_0_1.instance.invoke(context, m_55, transform.const118);
              if(term == null)
                break Fail254;
            }
            term = c_55;
            if(b_55 == null)
              break Fail254;
            term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{x_54, b_55});
            if(true)
              break Success178;
          }
          term = term187;
          IStrategoTerm o_54 = null;
          IStrategoTerm p_54 = null;
          IStrategoTerm q_54 = null;
          IStrategoTerm r_54 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
            break Fail253;
          o_54 = term.getSubterm(0);
          p_54 = term.getSubterm(1);
          r_54 = term;
          IStrategoTerm term189 = term;
          Success180:
          { 
            Fail256:
            { 
              term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{o_54, p_54});
              term = ejp_to_java2_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail256;
              q_54 = term;
              if(true)
                break Success180;
            }
            term = term189;
            IStrategoTerm t_54 = null;
            t_54 = term;
            term = report_with_failure_0_1.instance.invoke(context, t_54, transform.const118);
            if(term == null)
              break Fail253;
          }
          term = r_54;
          if(q_54 == null)
            break Fail253;
          term = q_54;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_57, Strategy i_57)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("OrComp_2_0");
      Fail257:
      { 
        IStrategoTerm s_183 = null;
        IStrategoTerm q_183 = null;
        IStrategoTerm r_183 = null;
        IStrategoTerm t_183 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail257;
        q_183 = term.getSubterm(0);
        r_183 = term.getSubterm(1);
        IStrategoList annos3 = term.getAnnotations();
        s_183 = annos3;
        term = h_57.invoke(context, q_183);
        if(term == null)
          break Fail257;
        t_183 = term;
        term = i_57.invoke(context, r_183);
        if(term == null)
          break Fail257;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{t_183, term}), checkListAnnos(termFactory, s_183));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_57, Strategy m_57)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("AndComp_2_0");
      Fail258:
      { 
        IStrategoTerm x_183 = null;
        IStrategoTerm v_183 = null;
        IStrategoTerm w_183 = null;
        IStrategoTerm y_183 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail258;
        v_183 = term.getSubterm(0);
        w_183 = term.getSubterm(1);
        IStrategoList annos4 = term.getAnnotations();
        x_183 = annos4;
        term = k_57.invoke(context, v_183);
        if(term == null)
          break Fail258;
        y_183 = term;
        term = m_57.invoke(context, w_183);
        if(term == null)
          break Fail258;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{y_183, term}), checkListAnnos(termFactory, x_183));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_57)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("NotComp_1_0");
      Fail259:
      { 
        IStrategoTerm b_184 = null;
        IStrategoTerm a_184 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotComp_1 != ((IStrategoAppl)term).getConstructor())
          break Fail259;
        a_184 = term.getSubterm(0);
        IStrategoList annos5 = term.getAnnotations();
        b_184 = annos5;
        term = n_57.invoke(context, a_184);
        if(term == null)
          break Fail259;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consNotComp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_184));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted88 extends Strategy 
  { 
    TermReference a_55;

    TermReference y_78;

    TermReference y_54;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail260:
      { 
        lifted89 lifted890 = new lifted89();
        lifted890.a_55 = a_55;
        lifted890.y_78 = y_78;
        lifted890.y_54 = y_54;
        term = try_1_0.instance.invoke(context, term, lifted890);
        if(term == null)
          break Fail260;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted89 extends Strategy 
  { 
    TermReference a_55;

    TermReference y_78;

    TermReference y_54;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail261:
      { 
        term = ejp_to_ajc_0_3.instance.invoke(context, term, a_55.value, y_78.value, y_54.value);
        if(term == null)
          break Fail261;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted86 extends Strategy 
  { 
    public static final lifted86 instance = new lifted86();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail262:
      { 
        term = try_1_0.instance.invoke(context, term, remove_ejp_decs_0_0.instance);
        if(term == null)
          break Fail262;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted84 extends Strategy 
  { 
    public static final lifted84 instance = new lifted84();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail263:
      { 
        term = try_1_0.instance.invoke(context, term, lifted85.instance);
        if(term == null)
          break Fail263;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted85 extends Strategy 
  { 
    public static final lifted85 instance = new lifted85();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail264:
      { 
        IStrategoTerm term185 = term;
        IStrategoConstructor cons26 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success181:
        { 
          if(cons26 == transform._consScopedEJPCall_3)
          { 
            Fail265:
            { 
              term = transform.constNone0;
              if(true)
                break Success181;
            }
            term = term185;
          }
          if(cons26 == transform._consEJPCall_2)
          { 
            term = transform.constNone0;
          }
          else
          { 
            break Fail264;
          }
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted82 extends Strategy 
  { 
    TermReference l_53;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail266:
      { 
        lifted83 lifted830 = new lifted83();
        lifted830.l_53 = l_53;
        term = try_1_0.instance.invoke(context, term, lifted830);
        if(term == null)
          break Fail266;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted83 extends Strategy 
  { 
    TermReference l_53;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail267:
      { 
        term = ejp_converter_aspect_or_class_0_1.instance.invoke(context, term, l_53.value);
        if(term == null)
          break Fail267;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted80 extends Strategy 
  { 
    public static final lifted80 instance = new lifted80();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail268:
      { 
        term = try_1_0.instance.invoke(context, term, check_for_change_in_aspect_or_class_0_0.instance);
        if(term == null)
          break Fail268;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted77 extends Strategy 
  { 
    public static final lifted77 instance = new lifted77();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail269:
      { 
        IStrategoTerm h_52 = null;
        h_52 = term;
        term = try_1_0.instance.invoke(context, term, gen_source_location_0_0.instance);
        if(term == null)
          break Fail269;
        term = termFactory.annotateTerm(h_52, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted76 extends Strategy 
  { 
    public static final lifted76 instance = new lifted76();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail270:
      { 
        IStrategoTerm term179 = term;
        Success182:
        { 
          Fail271:
          { 
            term = aspectj_to_box_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail271;
            if(true)
              break Success182;
          }
          term = java_to_box_0_0.instance.invoke(context, term179);
          if(term == null)
            break Fail270;
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class z_50 extends Strategy 
  { 
    public static final z_50 instance = new z_50();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail272:
      { 
        IStrategoTerm term176 = term;
        Success183:
        { 
          Fail273:
          { 
            term = $Not$Comp_1_0.instance.invoke(context, term, _Id.instance);
            if(term == null)
              break Fail273;
            if(true)
              break Success183;
          }
          term = term176;
          IStrategoTerm term177 = term;
          Success184:
          { 
            Fail274:
            { 
              term = $And$Comp_2_0.instance.invoke(context, term, this, _Id.instance);
              if(term == null)
                break Fail274;
              if(true)
                break Success184;
            }
            term = $Or$Comp_2_0.instance.invoke(context, term177, this, _Id.instance);
            if(term == null)
              break Fail272;
          }
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted72 extends Strategy 
  { 
    public static final lifted72 instance = new lifted72();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail275:
      { 
        IStrategoTerm i_40 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassType_2 != ((IStrategoAppl)term).getConstructor())
          break Fail275;
        i_40 = term.getSubterm(0);
        term = pp_aspectj_string_0_0.instance.invoke(context, i_40);
        if(term == null)
          break Fail275;
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted71 extends Strategy 
  { 
    TermReference b_40;

    TermReference z_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail276:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
          break Fail276;
        if(b_40.value == null)
          b_40.value = term.getSubterm(0);
        else
          if(b_40.value != term.getSubterm(0) && !b_40.value.match(term.getSubterm(0)))
            break Fail276;
        if(z_39.value == null)
          z_39.value = term.getSubterm(1);
        else
          if(z_39.value != term.getSubterm(1) && !z_39.value.match(term.getSubterm(1)))
            break Fail276;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted70 extends Strategy 
  { 
    TermReference b_40;

    TermReference z_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail277:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNonScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
          break Fail277;
        if(b_40.value == null)
          b_40.value = term.getSubterm(0);
        else
          if(b_40.value != term.getSubterm(0) && !b_40.value.match(term.getSubterm(0)))
            break Fail277;
        if(z_39.value == null)
          z_39.value = term.getSubterm(1);
        else
          if(z_39.value != term.getSubterm(1) && !z_39.value.match(term.getSubterm(1)))
            break Fail277;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted69 extends Strategy 
  { 
    public static final lifted69 instance = new lifted69();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail278:
      { 
        term = convet_pointcutarg_to_pointcut_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail278;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted68 extends Strategy 
  { 
    TermReference j_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail279:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
          break Fail279;
        if(j_39.value == null)
          j_39.value = term.getSubterm(1);
        else
          if(j_39.value != term.getSubterm(1) && !j_39.value.match(term.getSubterm(1)))
            break Fail279;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted67 extends Strategy 
  { 
    TermReference j_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail280:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNonScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
          break Fail280;
        if(j_39.value == null)
          j_39.value = term.getSubterm(1);
        else
          if(j_39.value != term.getSubterm(1) && !j_39.value.match(term.getSubterm(1)))
            break Fail280;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class ejp_to_ajc_0_3_fragment_0 extends Strategy 
  { 
    TermReference u_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail281:
      { 
        IStrategoTerm term53 = term;
        IStrategoConstructor cons27 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success185:
        { 
          if(cons27 == transform._consDecNoMatch_4)
          { 
            Fail282:
            { 
              IStrategoTerm m_35 = null;
              IStrategoTerm n_35 = null;
              IStrategoTerm o_35 = null;
              IStrategoTerm p_35 = null;
              IStrategoTerm s_35 = null;
              IStrategoTerm q_35 = null;
              IStrategoTerm t_35 = null;
              IStrategoTerm arg121 = term.getSubterm(0);
              if(arg121.getTermType() != IStrategoTerm.APPL || transform._consByPackageGranularity_0 != ((IStrategoAppl)arg121).getConstructor())
                break Fail282;
              o_35 = term.getSubterm(1);
              m_35 = term.getSubterm(2);
              n_35 = term.getSubterm(3);
              s_35 = term;
              term = pp_aspectj_string_0_0.instance.invoke(context, m_35);
              if(term == null)
                break Fail282;
              p_35 = term;
              t_35 = s_35;
              term = pp_aspectj_string_0_0.instance.invoke(context, o_35);
              if(term == null)
                break Fail282;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const27, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail282;
              q_35 = term;
              term = t_35;
              term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail282;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName10, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId10, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{p_35}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId23, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{n_35})}), (IStrategoList)transform.constCons13))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{q_35}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constCons11)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constCons14, transform.constNone0}), transform.constBlock0});
              if(true)
                break Success185;
            }
            term = term53;
          }
          Success186:
          { 
            if(cons27 == transform._consDecNoMatch_4)
            { 
              Fail283:
              { 
                IStrategoTerm y_34 = null;
                IStrategoTerm z_34 = null;
                IStrategoTerm a_35 = null;
                IStrategoTerm b_35 = null;
                IStrategoTerm e_35 = null;
                IStrategoTerm c_35 = null;
                IStrategoTerm f_35 = null;
                IStrategoTerm arg122 = term.getSubterm(0);
                if(arg122.getTermType() != IStrategoTerm.APPL || transform._consByClassGranularity_0 != ((IStrategoAppl)arg122).getConstructor())
                  break Fail283;
                a_35 = term.getSubterm(1);
                y_34 = term.getSubterm(2);
                z_34 = term.getSubterm(3);
                e_35 = term;
                term = pp_aspectj_string_0_0.instance.invoke(context, y_34);
                if(term == null)
                  break Fail283;
                b_35 = term;
                f_35 = e_35;
                term = pp_aspectj_string_0_0.instance.invoke(context, a_35);
                if(term == null)
                  break Fail283;
                term = (IStrategoTerm)termFactory.makeListCons(transform.const27, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail283;
                c_35 = term;
                term = f_35;
                term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail283;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName10, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId10, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{b_35}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId23, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{z_34})}), (IStrategoList)transform.constCons16))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{c_35}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constCons11)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constCons14, transform.constNone0}), transform.constBlock0});
                if(true)
                  break Success186;
              }
              term = term53;
            }
            Success187:
            { 
              if(cons27 == transform._consDecNoMatch_4)
              { 
                Fail284:
                { 
                  IStrategoTerm k_34 = null;
                  IStrategoTerm l_34 = null;
                  IStrategoTerm m_34 = null;
                  IStrategoTerm n_34 = null;
                  IStrategoTerm q_34 = null;
                  IStrategoTerm o_34 = null;
                  IStrategoTerm r_34 = null;
                  IStrategoTerm arg123 = term.getSubterm(0);
                  if(arg123.getTermType() != IStrategoTerm.APPL || transform._consByEjpGranularity_0 != ((IStrategoAppl)arg123).getConstructor())
                    break Fail284;
                  m_34 = term.getSubterm(1);
                  k_34 = term.getSubterm(2);
                  l_34 = term.getSubterm(3);
                  q_34 = term;
                  term = pp_aspectj_string_0_0.instance.invoke(context, k_34);
                  if(term == null)
                    break Fail284;
                  n_34 = term;
                  r_34 = q_34;
                  term = pp_aspectj_string_0_0.instance.invoke(context, m_34);
                  if(term == null)
                    break Fail284;
                  term = (IStrategoTerm)termFactory.makeListCons(transform.const40, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail284;
                  o_34 = term;
                  term = r_34;
                  term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail284;
                  term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName10, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId10, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{n_34}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId23, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{l_34})}), (IStrategoList)transform.constCons18))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{o_34}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constCons11)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constCons19, transform.constNone0}), transform.constBlock0});
                  if(true)
                    break Success187;
                }
                term = term53;
              }
              Success188:
              { 
                if(cons27 == transform._consDecNoMatch_4)
                { 
                  Fail285:
                  { 
                    IStrategoTerm w_33 = null;
                    IStrategoTerm x_33 = null;
                    IStrategoTerm y_33 = null;
                    IStrategoTerm z_33 = null;
                    IStrategoTerm c_34 = null;
                    IStrategoTerm a_34 = null;
                    IStrategoTerm d_34 = null;
                    IStrategoTerm arg124 = term.getSubterm(0);
                    if(arg124.getTermType() != IStrategoTerm.APPL || transform._consByMethodGranularity_0 != ((IStrategoAppl)arg124).getConstructor())
                      break Fail285;
                    y_33 = term.getSubterm(1);
                    w_33 = term.getSubterm(2);
                    x_33 = term.getSubterm(3);
                    c_34 = term;
                    term = pp_aspectj_string_0_0.instance.invoke(context, w_33);
                    if(term == null)
                      break Fail285;
                    z_33 = term;
                    d_34 = c_34;
                    term = pp_aspectj_string_0_0.instance.invoke(context, y_33);
                    if(term == null)
                      break Fail285;
                    term = (IStrategoTerm)termFactory.makeListCons(transform.const43, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail285;
                    a_34 = term;
                    term = d_34;
                    term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail285;
                    term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName10, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId10, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{z_33}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId23, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{x_33})}), (IStrategoList)transform.constCons21))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{a_34}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constCons11)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constCons19, transform.constNone0}), transform.constBlock0});
                    if(true)
                      break Success188;
                  }
                  term = term53;
                }
                if(cons27 == transform._consExplicitJoinPointDeclaration_5)
                { 
                  IStrategoTerm e_33 = null;
                  IStrategoTerm f_33 = null;
                  IStrategoTerm g_33 = null;
                  IStrategoTerm h_33 = null;
                  IStrategoTerm i_33 = null;
                  IStrategoTerm j_33 = null;
                  IStrategoTerm k_33 = null;
                  IStrategoTerm l_33 = null;
                  IStrategoTerm m_33 = null;
                  f_33 = term.getSubterm(0);
                  e_33 = term.getSubterm(1);
                  g_33 = term.getSubterm(2);
                  h_33 = term.getSubterm(3);
                  j_33 = term.getSubterm(4);
                  m_33 = term;
                  IStrategoTerm term57 = term;
                  Success189:
                  { 
                    Fail286:
                    { 
                      IStrategoTerm n_33 = null;
                      term = termFactory.makeTuple(e_33, f_33);
                      term = gen_pointcutargs_pointcuts_0_1.instance.invoke(context, term, u_78.value);
                      if(term == null)
                        break Fail286;
                      term = gen_method_head_0_3.instance.invoke(context, term, f_33, g_33, h_33);
                      if(term == null)
                        break Fail286;
                      n_33 = term;
                      i_33 = term;
                      term = n_33;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
                        break Fail286;
                      k_33 = term.getSubterm(2);
                      term = gen_method_body_0_2.instance.invoke(context, term, j_33, k_33);
                      if(term == null)
                        break Fail286;
                      l_33 = term;
                      if(true)
                        break Success189;
                    }
                    term = term57;
                    IStrategoTerm s_33 = null;
                    s_33 = term;
                    term = report_with_failure_0_1.instance.invoke(context, s_33, transform.const45);
                    if(term == null)
                      break Fail281;
                  }
                  term = m_33;
                  if(i_33 == null || l_33 == null)
                    break Fail281;
                  term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{i_33, l_33});
                }
                else
                { 
                  break Fail281;
                }
              }
            }
          }
        }
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
      Fail287:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail287;
        IStrategoTerm arg118 = term.getSubterm(0);
        if(arg118.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg118).getConstructor())
          break Fail287;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted65 extends Strategy 
  { 
    public static final lifted65 instance = new lifted65();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail288:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail288;
        IStrategoTerm arg116 = term.getSubterm(0);
        if(arg116.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg116).getConstructor())
          break Fail288;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted64 extends Strategy 
  { 
    public static final lifted64 instance = new lifted64();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail289:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail289;
        IStrategoTerm arg111 = term.getSubterm(0);
        if(arg111.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg111).getConstructor())
          break Fail289;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted63 extends Strategy 
  { 
    public static final lifted63 instance = new lifted63();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail290:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail290;
        IStrategoTerm arg109 = term.getSubterm(0);
        if(arg109.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg109).getConstructor())
          break Fail290;
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
      Fail291:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail291;
        IStrategoTerm arg104 = term.getSubterm(0);
        if(arg104.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg104).getConstructor())
          break Fail291;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted61 extends Strategy 
  { 
    public static final lifted61 instance = new lifted61();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail292:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail292;
        IStrategoTerm arg102 = term.getSubterm(0);
        if(arg102.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg102).getConstructor())
          break Fail292;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted60 extends Strategy 
  { 
    public static final lifted60 instance = new lifted60();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail293:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail293;
        IStrategoTerm arg96 = term.getSubterm(0);
        if(arg96.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg96).getConstructor())
          break Fail293;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted59 extends Strategy 
  { 
    public static final lifted59 instance = new lifted59();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail294:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail294;
        IStrategoTerm arg94 = term.getSubterm(0);
        if(arg94.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg94).getConstructor())
          break Fail294;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted58 extends Strategy 
  { 
    Strategy w_31;

    Strategy x_31;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail295:
      { 
        term = allow_extends_helper_2_0.instance.invoke(context, term, w_31, x_31);
        if(term == null)
          break Fail295;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted56 extends Strategy 
  { 
    TermReference r_30;

    TermReference s_30;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail296:
      { 
        term = my_hashtable_union_helper_0_2.instance.invoke(context, term, r_30.value, s_30.value);
        if(term == null)
          break Fail296;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted55 extends Strategy 
  { 
    TermReference n_30;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail297:
      { 
        IStrategoTerm o_30 = null;
        o_30 = term;
        if(n_30.value == null)
          break Fail297;
        term = hashtable_remove_0_1.instance.invoke(context, n_30.value, o_30);
        if(term == null)
          break Fail297;
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
      ITermFactory termFactory = context.getFactory();
      Fail298:
      { 
        IStrategoTerm z_28 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)term).getConstructor())
          break Fail298;
        z_28 = term.getSubterm(0);
        term = (IStrategoTerm)termFactory.makeListCons(z_28, (IStrategoList)transform.constCons3);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail298;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted51 extends Strategy 
  { 
    TermReference c_26;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail299:
      { 
        term = handle_pointcutarg_helper_0_1.instance.invoke(context, term, c_26.value);
        if(term == null)
          break Fail299;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted52 extends Strategy 
  { 
    TermReference b_26;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail300:
      { 
        IStrategoTerm e_26 = null;
        e_26 = term;
        if(b_26.value == null)
          break Fail300;
        term = iset_add_0_1.instance.invoke(context, b_26.value, e_26);
        if(term == null)
          break Fail300;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted49 extends Strategy 
  { 
    TermReference w_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail301:
      { 
        lifted50 lifted500 = new lifted50();
        lifted500.w_25 = w_25;
        term = try_1_0.instance.invoke(context, term, lifted500);
        if(term == null)
          break Fail301;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted50 extends Strategy 
  { 
    TermReference w_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail302:
      { 
        term = add_local_vars_0_1.instance.invoke(context, term, w_25.value);
        if(term == null)
          break Fail302;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted47 extends Strategy 
  { 
    TermReference q_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail303:
      { 
        lifted48 lifted480 = new lifted48();
        lifted480.q_25 = q_25;
        term = try_1_0.instance.invoke(context, term, lifted480);
        if(term == null)
          break Fail303;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted48 extends Strategy 
  { 
    TermReference q_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail304:
      { 
        term = fetch_0_1.instance.invoke(context, term, q_25.value);
        if(term == null)
          break Fail304;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted46 extends Strategy 
  { 
    TermReference z_23;

    TermReference i_23;

    TermReference j_23;

    TermReference k_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail305:
      { 
        term = ejp_to_java_0_4.instance.invoke(context, term, z_23.value, i_23.value, j_23.value, k_23.value);
        if(term == null)
          break Fail305;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted45 extends Strategy 
  { 
    TermReference k_23;

    TermReference c_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail306:
      { 
        term = handle_pointcutargs_0_2.instance.invoke(context, term, k_23.value, c_24.value);
        if(term == null)
          break Fail306;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted43 extends Strategy 
  { 
    TermReference i_23;

    TermReference j_23;

    TermReference q_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail307:
      { 
        lifted44 lifted440 = new lifted44();
        lifted440.i_23 = i_23;
        lifted440.j_23 = j_23;
        lifted440.q_23 = q_23;
        term = try_1_0.instance.invoke(context, term, lifted440);
        if(term == null)
          break Fail307;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted44 extends Strategy 
  { 
    TermReference i_23;

    TermReference j_23;

    TermReference q_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail308:
      { 
        term = pointcutarg_0_3.instance.invoke(context, term, i_23.value, j_23.value, q_23.value);
        if(term == null)
          break Fail308;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted42 extends Strategy 
  { 
    TermReference s_22;

    TermReference w_22;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail309:
      { 
        term = handle_pointcutargs_0_2.instance.invoke(context, term, s_22.value, w_22.value);
        if(term == null)
          break Fail309;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted40 extends Strategy 
  { 
    TermReference q_22;

    TermReference r_22;

    TermReference t_22;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail310:
      { 
        lifted41 lifted411 = new lifted41();
        lifted411.q_22 = q_22;
        lifted411.r_22 = r_22;
        lifted411.t_22 = t_22;
        term = try_1_0.instance.invoke(context, term, lifted411);
        if(term == null)
          break Fail310;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted41 extends Strategy 
  { 
    TermReference q_22;

    TermReference r_22;

    TermReference t_22;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail311:
      { 
        term = pointcutarg_0_3.instance.invoke(context, term, q_22.value, r_22.value, t_22.value);
        if(term == null)
          break Fail311;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted38 extends Strategy 
  { 
    TermReference t_21;

    TermReference u_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail312:
      { 
        IStrategoTerm v_21 = null;
        IStrategoTerm w_21 = null;
        IStrategoTerm x_21 = null;
        v_21 = term;
        x_21 = term;
        if(t_21.value == null)
          break Fail312;
        term = hashtable_get_0_1.instance.invoke(context, t_21.value, v_21);
        if(term == null)
          break Fail312;
        w_21 = term;
        term = x_21;
        if(u_21.value == null)
          break Fail312;
        term = termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{transform.constNil0, w_21, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{v_21}), termFactory.makeAppl(transform._consExprName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{u_21.value})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{v_21})})}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted37 extends Strategy 
  { 
    TermReference r_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail313:
      { 
        IStrategoTerm s_21 = null;
        s_21 = term;
        if(r_21.value == null)
          break Fail313;
        term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{s_21})}), termFactory.makeAppl(transform._consExprName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{r_21.value})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{s_21})})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted36 extends Strategy 
  { 
    TermReference o_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail314:
      { 
        IStrategoTerm p_21 = null;
        p_21 = term;
        if(o_21.value == null)
          break Fail314;
        term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consExprName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{o_21.value})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{p_21})}), termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{p_21})})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted33 extends Strategy 
  { 
    TermReference d_21;

    TermReference c_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail315:
      { 
        IStrategoTerm e_21 = null;
        IStrategoTerm k_21 = null;
        e_21 = term;
        if(d_21.value == null)
          break Fail315;
        term = d_21.value;
        k_21 = d_21.value;
        if(c_21.value == null)
          break Fail315;
        term = hashtable_get_0_1.instance.invoke(context, c_21.value, e_21);
        if(term == null)
          break Fail315;
        term = add_key_to_multiple_values_table_0_2.instance.invoke(context, k_21, term, e_21);
        if(term == null)
          break Fail315;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted34 extends Strategy 
  { 
    TermReference d_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail316:
      { 
        IStrategoTerm f_21 = null;
        f_21 = term;
        if(d_21.value == null)
          break Fail316;
        term = hashtable_get_0_1.instance.invoke(context, d_21.value, f_21);
        if(term == null)
          break Fail316;
        term = map_1_0.instance.invoke(context, term, lifted35.instance);
        if(term == null)
          break Fail316;
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{transform.constNil0, f_21, term});
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
      ITermFactory termFactory = context.getFactory();
      Fail317:
      { 
        term = termFactory.makeAppl(transform._consVarDec_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted31 extends Strategy 
  { 
    TermReference i_19;

    TermReference h_19;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail318:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail318;
        if(i_19.value == null)
          i_19.value = term.getSubterm(1);
        else
          if(i_19.value != term.getSubterm(1) && !i_19.value.match(term.getSubterm(1)))
            break Fail318;
        IStrategoTerm arg55 = term.getSubterm(2);
        if(arg55.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg55).getConstructor())
          break Fail318;
        if(h_19.value == null)
          h_19.value = arg55.getSubterm(0);
        else
          if(h_19.value != arg55.getSubterm(0) && !h_19.value.match(arg55.getSubterm(0)))
            break Fail318;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted30 extends Strategy 
  { 
    TermReference i_19;

    TermReference h_19;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail319:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail319;
        if(i_19.value == null)
          i_19.value = term.getSubterm(1);
        else
          if(i_19.value != term.getSubterm(1) && !i_19.value.match(term.getSubterm(1)))
            break Fail319;
        IStrategoTerm arg53 = term.getSubterm(2);
        if(arg53.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg53).getConstructor())
          break Fail319;
        if(h_19.value == null)
          h_19.value = arg53.getSubterm(0);
        else
          if(h_19.value != arg53.getSubterm(0) && !h_19.value.match(arg53.getSubterm(0)))
            break Fail319;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted29 extends Strategy 
  { 
    TermReference c_19;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail320:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail320;
        IStrategoTerm arg50 = term.getSubterm(0);
        if(arg50.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg50).getConstructor())
          break Fail320;
        if(c_19.value == null)
          c_19.value = arg50.getSubterm(0);
        else
          if(c_19.value != arg50.getSubterm(0) && !c_19.value.match(arg50.getSubterm(0)))
            break Fail320;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted28 extends Strategy 
  { 
    TermReference c_19;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail321:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail321;
        IStrategoTerm arg49 = term.getSubterm(0);
        if(arg49.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg49).getConstructor())
          break Fail321;
        if(c_19.value == null)
          c_19.value = arg49.getSubterm(0);
        else
          if(c_19.value != arg49.getSubterm(0) && !c_19.value.match(arg49.getSubterm(0)))
            break Fail321;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted26 extends Strategy 
  { 
    TermReference o_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail322:
      { 
        lifted27 lifted270 = new lifted27();
        lifted270.o_78 = o_78;
        term = try_1_0.instance.invoke(context, term, lifted270);
        if(term == null)
          break Fail322;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted27 extends Strategy 
  { 
    TermReference o_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail323:
      { 
        term = add_local_vars_0_1.instance.invoke(context, term, o_78.value);
        if(term == null)
          break Fail323;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted25 extends Strategy 
  { 
    TermReference q_18;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail324:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail324;
        IStrategoTerm arg45 = term.getSubterm(1);
        if(arg45.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg45).getConstructor())
          break Fail324;
        IStrategoTerm arg48 = arg45.getSubterm(2);
        if(arg48.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg48).getConstructor())
          break Fail324;
        if(q_18.value == null)
          q_18.value = arg48.getSubterm(0);
        else
          if(q_18.value != arg48.getSubterm(0) && !q_18.value.match(arg48.getSubterm(0)))
            break Fail324;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted22 extends Strategy 
  { 
    TermReference q_18;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail325:
      { 
        lifted24 lifted240 = new lifted24();
        lifted23 lifted230 = new lifted23();
        lifted240.q_18 = q_18;
        lifted230.q_18 = q_18;
        term = or_2_0.instance.invoke(context, term, lifted230, lifted240);
        if(term == null)
          break Fail325;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted24 extends Strategy 
  { 
    TermReference q_18;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail326:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
          break Fail326;
        IStrategoTerm arg38 = term.getSubterm(0);
        if(arg38.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg38).getConstructor())
          break Fail326;
        IStrategoTerm arg40 = arg38.getSubterm(1);
        if(arg40.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg40).getConstructor())
          break Fail326;
        IStrategoTerm arg43 = arg40.getSubterm(2);
        if(arg43.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg43).getConstructor())
          break Fail326;
        if(q_18.value == null)
          q_18.value = arg43.getSubterm(0);
        else
          if(q_18.value != arg43.getSubterm(0) && !q_18.value.match(arg43.getSubterm(0)))
            break Fail326;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted23 extends Strategy 
  { 
    TermReference q_18;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail327:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
          break Fail327;
        IStrategoTerm arg34 = term.getSubterm(0);
        if(arg34.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg34).getConstructor())
          break Fail327;
        IStrategoTerm arg37 = arg34.getSubterm(2);
        if(arg37.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg37).getConstructor())
          break Fail327;
        if(q_18.value == null)
          q_18.value = arg37.getSubterm(0);
        else
          if(q_18.value != arg37.getSubterm(0) && !q_18.value.match(arg37.getSubterm(0)))
            break Fail327;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted20 extends Strategy 
  { 
    TermReference o_78;

    TermReference w_18;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail328:
      { 
        lifted21 lifted211 = new lifted21();
        lifted211.o_78 = o_78;
        lifted211.w_18 = w_18;
        term = try_1_0.instance.invoke(context, term, lifted211);
        if(term == null)
          break Fail328;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted21 extends Strategy 
  { 
    TermReference o_78;

    TermReference w_18;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail329:
      { 
        term = add_local_var_0_2.instance.invoke(context, term, o_78.value, w_18.value);
        if(term == null)
          break Fail329;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted19 extends Strategy 
  { 
    public static final lifted19 instance = new lifted19();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail330:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)term).getConstructor())
          break Fail330;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted18 extends Strategy 
  { 
    public static final lifted18 instance = new lifted18();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail331:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)term).getConstructor())
          break Fail331;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted16 extends Strategy 
  { 
    TermReference w_13;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail332:
      { 
        lifted17 lifted170 = new lifted17();
        lifted170.w_13 = w_13;
        lifted170.h_78 = h_78;
        term = try_1_0.instance.invoke(context, term, lifted170);
        if(term == null)
          break Fail332;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted17 extends Strategy 
  { 
    TermReference w_13;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail333:
      { 
        IStrategoTerm c_14 = null;
        IStrategoTerm e_14 = null;
        IStrategoTerm f_14 = null;
        e_14 = term;
        c_14 = transform.constNone0;
        f_14 = e_14;
        term = ejp_to_java_0_4.instance.invoke(context, f_14, w_13.value, c_14, transform.constNone0, h_78.value);
        if(term == null)
          break Fail333;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted14 extends Strategy 
  { 
    TermReference k_14;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail334:
      { 
        lifted15 lifted150 = new lifted15();
        lifted150.k_14 = k_14;
        lifted150.h_78 = h_78;
        term = try_1_0.instance.invoke(context, term, lifted150);
        if(term == null)
          break Fail334;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted15 extends Strategy 
  { 
    TermReference k_14;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail335:
      { 
        IStrategoTerm q_14 = null;
        IStrategoTerm s_14 = null;
        IStrategoTerm t_14 = null;
        s_14 = term;
        q_14 = transform.constNone0;
        t_14 = s_14;
        term = ejp_to_java_0_4.instance.invoke(context, t_14, k_14.value, q_14, transform.constNone0, h_78.value);
        if(term == null)
          break Fail335;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted13 extends Strategy 
  { 
    TermReference e_78;

    TermReference y_14;

    TermReference z_14;

    TermReference f_78;

    TermReference g_78;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail336:
      { 
        term = convert_one_var_dec_0_6.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{e_78.value, y_14.value, z_14.value, f_78.value, g_78.value, h_78.value});
        if(term == null)
          break Fail336;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted11 extends Strategy 
  { 
    TermReference e_78;

    TermReference f_78;

    TermReference g_78;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail337:
      { 
        lifted12 lifted120 = new lifted12();
        lifted120.e_78 = e_78;
        lifted120.f_78 = f_78;
        lifted120.g_78 = g_78;
        lifted120.h_78 = h_78;
        term = try_1_0.instance.invoke(context, term, lifted120);
        if(term == null)
          break Fail337;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted12 extends Strategy 
  { 
    TermReference e_78;

    TermReference f_78;

    TermReference g_78;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail338:
      { 
        IStrategoTerm i_15 = null;
        i_15 = term;
        if(e_78.value == null)
          break Fail338;
        term = hashtable_copy_0_0.instance.invoke(context, e_78.value);
        if(term == null)
          break Fail338;
        term = ejp_to_java_0_4.instance.invoke(context, i_15, term, f_78.value, g_78.value, h_78.value);
        if(term == null)
          break Fail338;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted10 extends Strategy 
  { 
    TermReference e_78;

    TermReference f_78;

    TermReference u_15;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail339:
      { 
        term = ejp_to_java_0_4.instance.invoke(context, term, e_78.value, f_78.value, u_15.value, h_78.value);
        if(term == null)
          break Fail339;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted9 extends Strategy 
  { 
    TermReference e_78;

    TermReference f_78;

    TermReference g_78;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail340:
      { 
        term = ejp_to_java_0_4.instance.invoke(context, term, e_78.value, f_78.value, g_78.value, h_78.value);
        if(term == null)
          break Fail340;
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
      Fail341:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
          break Fail341;
        IStrategoTerm arg8 = term.getSubterm(0);
        if(arg8.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg8).getConstructor())
          break Fail341;
        IStrategoTerm arg9 = arg8.getSubterm(0);
        if(arg9.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg9).getConstructor())
          break Fail341;
        IStrategoTerm arg10 = arg9.getSubterm(0);
        if(arg10.getTermType() != IStrategoTerm.STRING || !"ExplicitScopedJoinPoint".equals(((IStrategoString)arg10).stringValue()))
          break Fail341;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted6 extends Strategy 
  { 
    TermReference e_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail342:
      { 
        lifted7 lifted710 = new lifted7();
        lifted710.e_78 = e_78;
        term = try_1_0.instance.invoke(context, term, lifted710);
        if(term == null)
          break Fail342;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted7 extends Strategy 
  { 
    TermReference e_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail343:
      { 
        term = process_method_param_0_1.instance.invoke(context, term, e_78.value);
        if(term == null)
          break Fail343;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted4 extends Strategy 
  { 
    TermReference e_78;

    TermReference p_16;

    TermReference g_78;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail344:
      { 
        lifted5 lifted510 = new lifted5();
        lifted510.e_78 = e_78;
        lifted510.p_16 = p_16;
        lifted510.g_78 = g_78;
        lifted510.h_78 = h_78;
        term = try_1_0.instance.invoke(context, term, lifted510);
        if(term == null)
          break Fail344;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted5 extends Strategy 
  { 
    TermReference e_78;

    TermReference p_16;

    TermReference g_78;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail345:
      { 
        IStrategoTerm g_17 = null;
        g_17 = term;
        if(e_78.value == null)
          break Fail345;
        term = hashtable_copy_0_0.instance.invoke(context, e_78.value);
        if(term == null)
          break Fail345;
        term = ejp_to_java_0_4.instance.invoke(context, g_17, term, p_16.value, g_78.value, h_78.value);
        if(term == null)
          break Fail345;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted2 extends Strategy 
  { 
    TermReference e_78;

    TermReference f_78;

    TermReference g_78;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail346:
      { 
        lifted3 lifted310 = new lifted3();
        lifted310.e_78 = e_78;
        lifted310.f_78 = f_78;
        lifted310.g_78 = g_78;
        lifted310.h_78 = h_78;
        term = try_1_0.instance.invoke(context, term, lifted310);
        if(term == null)
          break Fail346;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted3 extends Strategy 
  { 
    TermReference e_78;

    TermReference f_78;

    TermReference g_78;

    TermReference h_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail347:
      { 
        IStrategoTerm a_17 = null;
        a_17 = term;
        if(e_78.value == null)
          break Fail347;
        term = hashtable_copy_0_0.instance.invoke(context, e_78.value);
        if(term == null)
          break Fail347;
        term = ejp_to_java_0_4.instance.invoke(context, a_17, term, f_78.value, g_78.value, h_78.value);
        if(term == null)
          break Fail347;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted0 extends Strategy 
  { 
    TermReference j_11;

    TermReference m_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail348:
      { 
        lifted1 lifted110 = new lifted1();
        lifted110.j_11 = j_11;
        lifted110.m_11 = m_11;
        term = try_1_0.instance.invoke(context, term, lifted110);
        if(term == null)
          break Fail348;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted1 extends Strategy 
  { 
    TermReference j_11;

    TermReference m_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail349:
      { 
        IStrategoTerm t_11 = null;
        IStrategoTerm v_11 = null;
        IStrategoTerm y_11 = null;
        v_11 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail349;
        t_11 = term;
        y_11 = v_11;
        term = ejp_to_java_0_4.instance.invoke(context, y_11, t_11, j_11.value, transform.constNone0, m_11.value);
        if(term == null)
          break Fail349;
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
      varScope.addSVar("fetch_0_1", new InteropSDefT(fetch_0_1.instance, context));
      varScope.addSVar("ejp_to_java2_0_0", new InteropSDefT(ejp_to_java2_0_0.instance, context));
      varScope.addSVar("ejp_to_java_0_4", new InteropSDefT(ejp_to_java_0_4.instance, context));
      varScope.addSVar("convert_one_var_dec_0_6", new InteropSDefT(convert_one_var_dec_0_6.instance, context));
      varScope.addSVar("convert_var_dec_by_ejp_call_0_6", new InteropSDefT(convert_var_dec_by_ejp_call_0_6.instance, context));
      varScope.addSVar("add_local_vars_0_1", new InteropSDefT(add_local_vars_0_1.instance, context));
      varScope.addSVar("add_local_var_0_2", new InteropSDefT(add_local_var_0_2.instance, context));
      varScope.addSVar("process_method_param_0_1", new InteropSDefT(process_method_param_0_1.instance, context));
      varScope.addSVar("gen_auxilery_class_0_6", new InteropSDefT(gen_auxilery_class_0_6.instance, context));
      varScope.addSVar("gen_source_location_ann_0_0", new InteropSDefT(gen_source_location_ann_0_0.instance, context));
      varScope.addSVar("get_location_0_0", new InteropSDefT(get_location_0_0.instance, context));
      varScope.addSVar("get_file_0_0", new InteropSDefT(get_file_0_0.instance, context));
      varScope.addSVar("get_line_0_0", new InteropSDefT(get_line_0_0.instance, context));
      varScope.addSVar("gen_method_annotation_0_0", new InteropSDefT(gen_method_annotation_0_0.instance, context));
      varScope.addSVar("gen_compact_var_declaration_0_2", new InteropSDefT(gen_compact_var_declaration_0_2.instance, context));
      varScope.addSVar("gen_before_call_assignments_0_2", new InteropSDefT(gen_before_call_assignments_0_2.instance, context));
      varScope.addSVar("gen_after_call_simple_assignments_0_2", new InteropSDefT(gen_after_call_simple_assignments_0_2.instance, context));
      varScope.addSVar("gen_after_call_assignments_with_declarations_0_2", new InteropSDefT(gen_after_call_assignments_with_declarations_0_2.instance, context));
      varScope.addSVar("create_method_invokation_0_2", new InteropSDefT(create_method_invokation_0_2.instance, context));
      varScope.addSVar("create_method_invokation_0_1", new InteropSDefT(create_method_invokation_0_1.instance, context));
      varScope.addSVar("remove_scoped_ejp_var_decs_0_0", new InteropSDefT(remove_scoped_ejp_var_decs_0_0.instance, context));
      varScope.addSVar("ejp_call_to_method_invokation_0_4", new InteropSDefT(ejp_call_to_method_invokation_0_4.instance, context));
      varScope.addSVar("scoped_ejp_to_java_0_4", new InteropSDefT(scoped_ejp_to_java_0_4.instance, context));
      varScope.addSVar("get_vars_in_block_0_0", new InteropSDefT(get_vars_in_block_0_0.instance, context));
      varScope.addSVar("get_inner_scoped_vars_0_0", new InteropSDefT(get_inner_scoped_vars_0_0.instance, context));
      varScope.addSVar("handle_pointcutargs_0_2", new InteropSDefT(handle_pointcutargs_0_2.instance, context));
      varScope.addSVar("handle_pointcutarg_helper_0_1", new InteropSDefT(handle_pointcutarg_helper_0_1.instance, context));
      varScope.addSVar("remove_vars_decs_from_local_var_dec_stm_0_0", new InteropSDefT(remove_vars_decs_from_local_var_dec_stm_0_0.instance, context));
      varScope.addSVar("remove_var_dec_0_0", new InteropSDefT(remove_var_dec_0_0.instance, context));
      varScope.addSVar("pointcutarg_0_3", new InteropSDefT(pointcutarg_0_3.instance, context));
      varScope.addSVar("gen__ejp__name_0_0", new InteropSDefT(gen__ejp__name_0_0.instance, context));
      varScope.addSVar("typename__2__ambname_0_0", new InteropSDefT(typename__2__ambname_0_0.instance, context));
      varScope.addSVar("gen__nomatch__pointcut__name_0_0", new InteropSDefT(gen__nomatch__pointcut__name_0_0.instance, context));
      varScope.addSVar("gen__ejpscope__method__name_0_2", new InteropSDefT(gen__ejpscope__method__name_0_2.instance, context));
      varScope.addSVar("convert_package_name_0_0", new InteropSDefT(convert_package_name_0_0.instance, context));
      varScope.addSVar("gen__ejpscope__method__name_0_0", new InteropSDefT(gen__ejpscope__method__name_0_0.instance, context));
      varScope.addSVar("gen__ejpscope__method__name__helper_0_0", new InteropSDefT(gen__ejpscope__method__name__helper_0_0.instance, context));
      varScope.addSVar("random_string_0_0", new InteropSDefT(random_string_0_0.instance, context));
      varScope.addSVar("gen_auxilary_class_name_0_0", new InteropSDefT(gen_auxilary_class_name_0_0.instance, context));
      varScope.addSVar("my_hashtable_remove_0_1", new InteropSDefT(my_hashtable_remove_0_1.instance, context));
      varScope.addSVar("my_hashtable_union_0_1", new InteropSDefT(my_hashtable_union_0_1.instance, context));
      varScope.addSVar("my_hashtable_union_helper_0_2", new InteropSDefT(my_hashtable_union_helper_0_2.instance, context));
      varScope.addSVar("add_key_to_multiple_values_table_0_2", new InteropSDefT(add_key_to_multiple_values_table_0_2.instance, context));
      varScope.addSVar("allow_extends_1_1", new InteropSDefT(allow_extends_1_1.instance, context));
      varScope.addSVar("allow_extends_2_1", new InteropSDefT(allow_extends_2_1.instance, context));
      varScope.addSVar("allow_extends_helper_2_0", new InteropSDefT(allow_extends_helper_2_0.instance, context));
      varScope.addSVar("fetch_type_0_0", new InteropSDefT(fetch_type_0_0.instance, context));
      varScope.addSVar("ejp_to_ajc_0_3", new InteropSDefT(ejp_to_ajc_0_3.instance, context));
      varScope.addSVar("gen_pointcutargs_pointcuts_0_1", new InteropSDefT(gen_pointcutargs_pointcuts_0_1.instance, context));
      varScope.addSVar("convet_pointcutarg_to_pointcut_0_0", new InteropSDefT(convet_pointcutarg_to_pointcut_0_0.instance, context));
      varScope.addSVar("gen_method_head_0_3", new InteropSDefT(gen_method_head_0_3.instance, context));
      varScope.addSVar("gen_ejp_annotation_0_1", new InteropSDefT(gen_ejp_annotation_0_1.instance, context));
      varScope.addSVar("gen_method_body_0_2", new InteropSDefT(gen_method_body_0_2.instance, context));
      varScope.addSVar("get_default_return_value_for_return_type_0_0", new InteropSDefT(get_default_return_value_for_return_type_0_0.instance, context));
      varScope.addSVar("fetch_default_value_0_0", new InteropSDefT(fetch_default_value_0_0.instance, context));
      varScope.addSVar("fetch_handles_list_0_0", new InteropSDefT(fetch_handles_list_0_0.instance, context));
      varScope.addSVar("remove_ejp_decs_0_0", new InteropSDefT(remove_ejp_decs_0_0.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_4", new InteropSDefT(aspectj_to_box_0_0_fragment_4.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_3", new InteropSDefT(aspectj_to_box_0_0_fragment_3.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_2", new InteropSDefT(aspectj_to_box_0_0_fragment_2.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_1", new InteropSDefT(aspectj_to_box_0_0_fragment_1.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_0", new InteropSDefT(aspectj_to_box_0_0_fragment_0.instance, context));
      varScope.addSVar("aspectj_to_box_0_0", new InteropSDefT(aspectj_to_box_0_0.instance, context));
      varScope.addSVar("has_leftmost_not_0_0", new InteropSDefT(has_leftmost_not_0_0.instance, context));
      varScope.addSVar("option_to_boxes_0_0", new InteropSDefT(option_to_boxes_0_0.instance, context));
      varScope.addSVar("pp_aspectj_string_0_0", new InteropSDefT(pp_aspectj_string_0_0.instance, context));
      varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
      varScope.addSVar("handle_io_0_0", new InteropSDefT(handle_io_0_0.instance, context));
      varScope.addSVar("transform_0_0", new InteropSDefT(transform_0_0.instance, context));
      varScope.addSVar("transform_ast_0_0", new InteropSDefT(transform_ast_0_0.instance, context));
      varScope.addSVar("gen_source_location_0_0", new InteropSDefT(gen_source_location_0_0.instance, context));
      varScope.addSVar("origin_location_0_0", new InteropSDefT(origin_location_0_0.instance, context));
      varScope.addSVar("origin_file_0_0", new InteropSDefT(origin_file_0_0.instance, context));
      varScope.addSVar("ejp_converter_compilation_unit_0_0", new InteropSDefT(ejp_converter_compilation_unit_0_0.instance, context));
      varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(check_for_change_in_aspect_or_class_0_0.instance, context));
      varScope.addSVar("ejp_converter_aspect_or_class_0_1", new InteropSDefT(ejp_converter_aspect_or_class_0_1.instance, context));
      varScope.addSVar("OrComp_2_0", new InteropSDefT($Or$Comp_2_0.instance, context));
      varScope.addSVar("AndComp_2_0", new InteropSDefT($And$Comp_2_0.instance, context));
      varScope.addSVar("NotComp_1_0", new InteropSDefT($Not$Comp_1_0.instance, context));
    }

    private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("transform");
      transform.init(compiledContext);
      varScope.addSVar("fetch_0_1", new InteropSDefT(classLoader, "transform$fetch_0_1", context));
      varScope.addSVar("ejp_to_java2_0_0", new InteropSDefT(classLoader, "transform$ejp_to_java2_0_0", context));
      varScope.addSVar("ejp_to_java_0_4", new InteropSDefT(classLoader, "transform$ejp_to_java_0_4", context));
      varScope.addSVar("convert_one_var_dec_0_6", new InteropSDefT(classLoader, "transform$convert_one_var_dec_0_6", context));
      varScope.addSVar("convert_var_dec_by_ejp_call_0_6", new InteropSDefT(classLoader, "transform$convert_var_dec_by_ejp_call_0_6", context));
      varScope.addSVar("add_local_vars_0_1", new InteropSDefT(classLoader, "transform$add_local_vars_0_1", context));
      varScope.addSVar("add_local_var_0_2", new InteropSDefT(classLoader, "transform$add_local_var_0_2", context));
      varScope.addSVar("process_method_param_0_1", new InteropSDefT(classLoader, "transform$process_method_param_0_1", context));
      varScope.addSVar("gen_auxilery_class_0_6", new InteropSDefT(classLoader, "transform$gen_auxilery_class_0_6", context));
      varScope.addSVar("gen_source_location_ann_0_0", new InteropSDefT(classLoader, "transform$gen_source_location_ann_0_0", context));
      varScope.addSVar("get_location_0_0", new InteropSDefT(classLoader, "transform$get_location_0_0", context));
      varScope.addSVar("get_file_0_0", new InteropSDefT(classLoader, "transform$get_file_0_0", context));
      varScope.addSVar("get_line_0_0", new InteropSDefT(classLoader, "transform$get_line_0_0", context));
      varScope.addSVar("gen_method_annotation_0_0", new InteropSDefT(classLoader, "transform$gen_method_annotation_0_0", context));
      varScope.addSVar("gen_compact_var_declaration_0_2", new InteropSDefT(classLoader, "transform$gen_compact_var_declaration_0_2", context));
      varScope.addSVar("gen_before_call_assignments_0_2", new InteropSDefT(classLoader, "transform$gen_before_call_assignments_0_2", context));
      varScope.addSVar("gen_after_call_simple_assignments_0_2", new InteropSDefT(classLoader, "transform$gen_after_call_simple_assignments_0_2", context));
      varScope.addSVar("gen_after_call_assignments_with_declarations_0_2", new InteropSDefT(classLoader, "transform$gen_after_call_assignments_with_declarations_0_2", context));
      varScope.addSVar("create_method_invokation_0_2", new InteropSDefT(classLoader, "transform$create_method_invokation_0_2", context));
      varScope.addSVar("create_method_invokation_0_1", new InteropSDefT(classLoader, "transform$create_method_invokation_0_1", context));
      varScope.addSVar("remove_scoped_ejp_var_decs_0_0", new InteropSDefT(classLoader, "transform$remove_scoped_ejp_var_decs_0_0", context));
      varScope.addSVar("ejp_call_to_method_invokation_0_4", new InteropSDefT(classLoader, "transform$ejp_call_to_method_invokation_0_4", context));
      varScope.addSVar("scoped_ejp_to_java_0_4", new InteropSDefT(classLoader, "transform$scoped_ejp_to_java_0_4", context));
      varScope.addSVar("get_vars_in_block_0_0", new InteropSDefT(classLoader, "transform$get_vars_in_block_0_0", context));
      varScope.addSVar("get_inner_scoped_vars_0_0", new InteropSDefT(classLoader, "transform$get_inner_scoped_vars_0_0", context));
      varScope.addSVar("handle_pointcutargs_0_2", new InteropSDefT(classLoader, "transform$handle_pointcutargs_0_2", context));
      varScope.addSVar("handle_pointcutarg_helper_0_1", new InteropSDefT(classLoader, "transform$handle_pointcutarg_helper_0_1", context));
      varScope.addSVar("remove_vars_decs_from_local_var_dec_stm_0_0", new InteropSDefT(classLoader, "transform$remove_vars_decs_from_local_var_dec_stm_0_0", context));
      varScope.addSVar("remove_var_dec_0_0", new InteropSDefT(classLoader, "transform$remove_var_dec_0_0", context));
      varScope.addSVar("pointcutarg_0_3", new InteropSDefT(classLoader, "transform$pointcutarg_0_3", context));
      varScope.addSVar("gen__ejp__name_0_0", new InteropSDefT(classLoader, "transform$gen__ejp__name_0_0", context));
      varScope.addSVar("typename__2__ambname_0_0", new InteropSDefT(classLoader, "transform$typename__2__ambname_0_0", context));
      varScope.addSVar("gen__nomatch__pointcut__name_0_0", new InteropSDefT(classLoader, "transform$gen__nomatch__pointcut__name_0_0", context));
      varScope.addSVar("gen__ejpscope__method__name_0_2", new InteropSDefT(classLoader, "transform$gen__ejpscope__method__name_0_2", context));
      varScope.addSVar("convert_package_name_0_0", new InteropSDefT(classLoader, "transform$convert_package_name_0_0", context));
      varScope.addSVar("gen__ejpscope__method__name_0_0", new InteropSDefT(classLoader, "transform$gen__ejpscope__method__name_0_0", context));
      varScope.addSVar("gen__ejpscope__method__name__helper_0_0", new InteropSDefT(classLoader, "transform$gen__ejpscope__method__name__helper_0_0", context));
      varScope.addSVar("random_string_0_0", new InteropSDefT(classLoader, "transform$random_string_0_0", context));
      varScope.addSVar("gen_auxilary_class_name_0_0", new InteropSDefT(classLoader, "transform$gen_auxilary_class_name_0_0", context));
      varScope.addSVar("my_hashtable_remove_0_1", new InteropSDefT(classLoader, "transform$my_hashtable_remove_0_1", context));
      varScope.addSVar("my_hashtable_union_0_1", new InteropSDefT(classLoader, "transform$my_hashtable_union_0_1", context));
      varScope.addSVar("my_hashtable_union_helper_0_2", new InteropSDefT(classLoader, "transform$my_hashtable_union_helper_0_2", context));
      varScope.addSVar("add_key_to_multiple_values_table_0_2", new InteropSDefT(classLoader, "transform$add_key_to_multiple_values_table_0_2", context));
      varScope.addSVar("allow_extends_1_1", new InteropSDefT(classLoader, "transform$allow_extends_1_1", context));
      varScope.addSVar("allow_extends_2_1", new InteropSDefT(classLoader, "transform$allow_extends_2_1", context));
      varScope.addSVar("allow_extends_helper_2_0", new InteropSDefT(classLoader, "transform$allow_extends_helper_2_0", context));
      varScope.addSVar("fetch_type_0_0", new InteropSDefT(classLoader, "transform$fetch_type_0_0", context));
      varScope.addSVar("ejp_to_ajc_0_3", new InteropSDefT(classLoader, "transform$ejp_to_ajc_0_3", context));
      varScope.addSVar("gen_pointcutargs_pointcuts_0_1", new InteropSDefT(classLoader, "transform$gen_pointcutargs_pointcuts_0_1", context));
      varScope.addSVar("convet_pointcutarg_to_pointcut_0_0", new InteropSDefT(classLoader, "transform$convet_pointcutarg_to_pointcut_0_0", context));
      varScope.addSVar("gen_method_head_0_3", new InteropSDefT(classLoader, "transform$gen_method_head_0_3", context));
      varScope.addSVar("gen_ejp_annotation_0_1", new InteropSDefT(classLoader, "transform$gen_ejp_annotation_0_1", context));
      varScope.addSVar("gen_method_body_0_2", new InteropSDefT(classLoader, "transform$gen_method_body_0_2", context));
      varScope.addSVar("get_default_return_value_for_return_type_0_0", new InteropSDefT(classLoader, "transform$get_default_return_value_for_return_type_0_0", context));
      varScope.addSVar("fetch_default_value_0_0", new InteropSDefT(classLoader, "transform$fetch_default_value_0_0", context));
      varScope.addSVar("fetch_handles_list_0_0", new InteropSDefT(classLoader, "transform$fetch_handles_list_0_0", context));
      varScope.addSVar("remove_ejp_decs_0_0", new InteropSDefT(classLoader, "transform$remove_ejp_decs_0_0", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_4", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_4", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_3", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_3", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_2", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_2", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_1", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_1", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_0", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_0", context));
      varScope.addSVar("aspectj_to_box_0_0", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0", context));
      varScope.addSVar("has_leftmost_not_0_0", new InteropSDefT(classLoader, "transform$has_leftmost_not_0_0", context));
      varScope.addSVar("option_to_boxes_0_0", new InteropSDefT(classLoader, "transform$option_to_boxes_0_0", context));
      varScope.addSVar("pp_aspectj_string_0_0", new InteropSDefT(classLoader, "transform$pp_aspectj_string_0_0", context));
      varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "transform$main_0_0", context));
      varScope.addSVar("handle_io_0_0", new InteropSDefT(classLoader, "transform$handle_io_0_0", context));
      varScope.addSVar("transform_0_0", new InteropSDefT(classLoader, "transform$transform_0_0", context));
      varScope.addSVar("transform_ast_0_0", new InteropSDefT(classLoader, "transform$transform_ast_0_0", context));
      varScope.addSVar("gen_source_location_0_0", new InteropSDefT(classLoader, "transform$gen_source_location_0_0", context));
      varScope.addSVar("origin_location_0_0", new InteropSDefT(classLoader, "transform$origin_location_0_0", context));
      varScope.addSVar("origin_file_0_0", new InteropSDefT(classLoader, "transform$origin_file_0_0", context));
      varScope.addSVar("ejp_converter_compilation_unit_0_0", new InteropSDefT(classLoader, "transform$ejp_converter_compilation_unit_0_0", context));
      varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(classLoader, "transform$check_for_change_in_aspect_or_class_0_0", context));
      varScope.addSVar("ejp_converter_aspect_or_class_0_1", new InteropSDefT(classLoader, "transform$ejp_converter_aspect_or_class_0_1", context));
      varScope.addSVar("OrComp_2_0", new InteropSDefT(classLoader, "transform$$Or$Comp_2_0", context));
      varScope.addSVar("AndComp_2_0", new InteropSDefT(classLoader, "transform$$And$Comp_2_0", context));
      varScope.addSVar("NotComp_1_0", new InteropSDefT(classLoader, "transform$$Not$Comp_1_0", context));
    }
  }
}
