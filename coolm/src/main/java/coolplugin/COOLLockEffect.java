package coolplugin;

import org.aspectj.bridge.IMessage;
import org.aspectj.bridge.ISourceLocation;
import org.aspectj.weaver.AdviceKind;
import org.aspectj.weaver.Member;
import org.aspectj.weaver.bcel.BcelShadow;
import org.aspectj.weaver.bcel.BcelWorld;
import org.aspectj.weaver.bcel.Range;

public class COOLLockEffect extends COOLCoordEffect {

	private ISourceLocation[] sourceLocations;

	public COOLLockEffect(String aspectClassName, String aspectMethodName, Member target, String fieldName) {
		super (aspectClassName, aspectMethodName, target, fieldName);
	}

	public void setSourceLocations(ISourceLocation[] sourceLocations) {
		this.sourceLocations = sourceLocations;
	}
	
	public void transform(BcelShadow shadow) {
		//System.err.println("Weaving Lock advice!");
		shadow.getRange().insert(
	    		getAdviceInstructions(shadow),
		        Range.InsideBefore);

		reportAfterWeaving(shadow);
	}

	private void reportAfterWeaving(BcelShadow shadow) {
		BcelWorld world = shadow.getWorld();
		if (world.getCrossReferenceHandler() != null && sourceLocations != null) {
			for (ISourceLocation sourceLocation : sourceLocations)
				world.getCrossReferenceHandler().addCrossReference(
						sourceLocation, // What is being applied
						shadow.getSourceLocation(), // Where is it being												// applied
						AdviceKind.After.getName(), // What kind of advice?
						false // Is a runtime test being stuffed in the code?
						);
		}

		// TAG: WeavingMessage
		if (!world.getMessageHandler().isIgnoring(
				IMessage.WEAVEINFO)) {
//			reportWeavingMessage(shadow);
		}

		if (world.getModel() != null) {
			// System.err.println("munger: " + munger + " on " + this);
//			AsmRelationshipProvider.addAdvisedRelationship(world.getModelAsAsmManager(), shadow, this);
		}

    }
}
