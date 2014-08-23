package closuresplugin;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.aspectj.weaver.AnnotationAJ;
import org.aspectj.weaver.ResolvedMember;
import org.aspectj.weaver.ResolvedMemberImpl;
import org.aspectj.weaver.ResolvedType;
import org.aspectj.weaver.bcel.BcelShadow;

import awesome.platform.AbstractWeaver;
import awesome.platform.IEffect;
import closures.runtime.Joinpoint;


public aspect ClosuresWeaver extends AbstractWeaver {

	public List<IEffect> match(BcelShadow shadow) {
		return Collections.emptyList();
	}

	public List<IEffect> order(BcelShadow shadow, List<IEffect> effects) {
		return effects;
	}

	@Override
	public void setInputFilesPreWeaving(List<ResolvedType> files) {
		for (ResolvedType resolvedType : files) {
			for (Iterator<ResolvedMember> iter = resolvedType.getMethods(true, true); iter.hasNext(); ) {
				ResolvedMember methodGen = iter.next();

				ResolvedMemberImpl bcelMethod = (ResolvedMemberImpl)methodGen;
				for (AnnotationAJ annotation : bcelMethod.getAnnotations()) {
					if (Joinpoint.class.getName().equals(annotation.getTypeName())) {
						System.out.println("saw joinpoint:" + bcelMethod.toDebugString());
					}
				}
			}
		}
	}
}
