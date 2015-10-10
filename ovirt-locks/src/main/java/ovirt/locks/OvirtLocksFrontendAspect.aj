package ovirt.locks;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openu.awesome.frontend.FrontendAspect;
import org.ovirt.engine.locks.generator.Main;

public aspect OvirtLocksFrontendAspect extends FrontendAspect {

	private static Logger logger = Logger.getLogger(OvirtLocksFrontendAspect.class.getName());

	@Override
	protected List<String> postfix() {
		return Collections.singletonList("locks");
	}

	@Override
	protected File convert2java(File input) throws Exception {
		logger.info("input: " + FileUtils.readFileToString(input));
		Main.main(new String[] { input.getPath() });
		File output = new File("src-gen/org/ovirt/engine/core/bll/Locks.aj");
		logger.info("output: " + FileUtils.readFileToString(output));
		return output;
	}
}
