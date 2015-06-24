package org.aspectj.weaver.bcel;

import org.aspectj.weaver.Member;

public class COOLLockEffect extends COOLCoordEffect {

	public COOLLockEffect(String aspectClassName, String aspectMethodName, Member target, String fieldName) {
		super (aspectClassName, aspectMethodName, target, fieldName);
	}
	
	public void transform(BcelShadow shadow) {
		//System.err.println("Weaving Lock advice!");
		shadow.getRange().insert(
	    		getAdviceInstructions(shadow),
		        Range.InsideBefore);
	}

}
