package awesome.frontend;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.aspectj.ajdt.ajc.ConfigParser;

public abstract aspect FrontendAspect {

	private File outputDir;

	pointcut isSourceFile(String filename): call(boolean ConfigParser.isSourceFileName(String)) && args(filename);

	boolean around(String filename): isSourceFile(filename) {
//		System.out.println("calling isSourceFileName with: " + filename);
		return isSourceForThisMechanism(filename) ? true : proceed(filename);
	}

	pointcut addFile(File file): call(void ConfigParser.addFile(File)) && args(file);

	void around(File file): addFile(file) {
//		System.out.println("got: " + file.getName());
		try {
			proceed(isSourceForThisMechanism(file.getName()) ? convert2java(file) : file);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return;
		}
	}

	protected pointcut parseCommandLine(String[] args): call(void ConfigParser.parseCommandLine(String[])) && args(args);

	protected File getOutputDir() {
		if (outputDir == null) {
			final File defaultTempDir = FileUtils.getTempDirectory();
			try {
				outputDir = File.createTempFile("awesome", "", defaultTempDir);
				if (outputDir.exists()) {
					FileUtils.forceDelete(outputDir);
				}
				FileUtils.forceMkdir(outputDir);
				FileUtils.forceDeleteOnExit(outputDir);
			}
			catch (Exception ex) {
				ex.printStackTrace();
				outputDir = defaultTempDir;
			}
		}
		return outputDir;
	}

	protected boolean isSourceForThisMechanism(String filename) {
		for (String postfix : postfix())
			if (filename.endsWith(postfix))
				return true;
		return false;
	}

	abstract protected List<String> postfix();
	abstract protected File convert2java(File input) throws Exception;
}
