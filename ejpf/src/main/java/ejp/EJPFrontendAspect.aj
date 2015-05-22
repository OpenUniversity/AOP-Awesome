package ejp;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openu.awesome.frontend.FrontendAspect;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.TermFactory;
import org.strategoxt.lang.Context;

public aspect EJPFrontendAspect extends FrontendAspect {

	private static Logger logger = Logger.getLogger(EJPFrontendAspect.class.getName());

	@Override
	protected List<String> postfix() {
		return Arrays.asList("aj", "java");
	}

	@Override
	protected File convert2java(File input) throws Exception {
            Context context = transform.init();
	    context.setStandAlone(true);
	    IStrategoTerm result = null;
	    IStrategoTerm pathTerm = new TermFactory().makeString(input.getAbsolutePath());

	    try {
	    	result = transform_0_0.instance.invoke(context, pathTerm);
	    }
	    finally {
	    	context.setStandAlone(false);
	    	context.getIOAgent().closeAllFiles();
	    }

		String path = input.getPath();
		logger.info("input path: " + path);
		String outputPath = path.replaceFirst("src", "generated");
		logger.info("output path: " + outputPath);
		File output = new File(outputPath);
		if (output.exists())
			FileUtils.forceDelete(output);
		
		FileUtils.forceMkdir(output.getParentFile());
		output.createNewFile();
		FileUtils.writeStringToFile(output, aa(result.toString())); 
		
		return output;
	}

	private String aa(String  input) {
		return input.substring(1, input.length()-1).replaceAll("\\\\n", "\n").replaceAll("\\\\\"", ""+'"');
	}
}
