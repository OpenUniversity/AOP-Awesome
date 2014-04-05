package awesome.platform;
import java.util.*;

import org.aspectj.weaver.IClassFileProvider;
import org.aspectj.weaver.ResolvedType;
import org.aspectj.weaver.bcel.BcelShadow;

public interface IMechanism {	
	public void setInputFiles(IClassFileProvider input);
	public List<IEffect> match(BcelShadow shadow);
	public List<IEffect> order(BcelShadow shadow, List<IEffect> effects);
	public void setInputFilesPreWeaving(List<ResolvedType> fiels);
}
