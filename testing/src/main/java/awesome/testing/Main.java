package awesome.testing;

import java.io.File;
import java.io.IOException;
import java.security.Permission;
import java.util.LinkedList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.beust.jcommander.JCommander;

public class Main {
	public static final String TESTS = "suite";
	public static final String TEST = "ajc-test";
	public static final String NUM = "num";
	public static final String DIR = "dir";
	public static final String TITLE = "title";
	public static final String KEYWORDS = "keywords";
	public static final String COMPILE = "compile";
	public static final String RUN = "run";
	public static final String FILES = "files";
	public static final String CLASS = "class";
	public static final String OPTIONS = "options";
	public static final String CLASSPATH = "classpath";
	public static final String MESSAGE = "message";

	public static void main(String[] args) {
		System.out.println("testing");

		Params parameters = getParameters(args);

		List<Test> tests;
		try {
			tests = getTests(new File(parameters.file.get(0)));
		} catch (SAXException e) {
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			return;
		}

		if (parameters.range != null) {
			runTests(tests, parameters);
		}
	}

	private static void runTests(List<Test> tests, Params parameters) {
		System.out.println("running tests: " + parameters.range.from + "-" + parameters.range.to + " size = " + tests.size());
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				throw new SecurityException(Integer.toString(status));
			}
			@Override
			public void checkPermission(Permission perm) {
			}
			@Override
			public void checkPermission(Permission perm, Object context) {
			}
		});
		for (Test test : tests) {
			System.out.println("check test: " + test.getNum());
			if (test.getNum() >= parameters.range.from && test.getNum() <= parameters.range.to)
				runTest(test, parameters.classpath, parameters.getArguments());
		}
	}

	private static void runTest(Test test, String classpath, String arguments) {
		System.out.println("compiling test: " + test.getNum());
		try {
			String command =
					String.format("-cp %s %s -outjar woven.jar %s",
							classpath + File.pathSeparator + new File(test.getDir()).getAbsolutePath(),
							arguments,
							test.getCompile().getFiles());
			System.out.println("command* = " + command);
			org.aspectj.tools.ajc.Main.main(command.split(" "));
			System.out.println("after command = " + test.getNum());

		} catch (SecurityException e) {
			System.out.println("return value = " + e.getMessage() + " num-of-errs = " + test.getCompile().getNumOfErrorMessages());
			if (Integer.parseInt(e.getMessage()) != test.getCompile().getNumOfErrorMessages())
				System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Params getParameters(String[] args) {
		Params parameters = new Params();
		JCommander jc = new JCommander(parameters, args);
		if (parameters.file == null) {
			jc.usage();
			throw new IllegalArgumentException();
		}
		return parameters;
	}

	private static List<Test> getTests(File spec) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(spec);

		List<Test> tests = new LinkedList<Test>();

		NodeList nodeList = document.getDocumentElement().getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);

			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element testElement = (Element) node;

				Test test = new Test()
				.setNum(Integer.parseInt(node.getAttributes().getNamedItem(NUM).getNodeValue()))
				.setDir(node.getAttributes().getNamedItem(DIR).getNodeValue())
				.setTitle(node.getAttributes().getNamedItem(TITLE).getNodeValue());

				if (testElement.getElementsByTagName(COMPILE).getLength() > 0) {
					Element compileElement = (Element) testElement.getElementsByTagName(COMPILE).item(0);

					if (compileElement.getAttributes().getNamedItem(FILES) == null)
						continue;

					test.getCompile()
					.setFiles(compileElement.getAttributes().getNamedItem(FILES).getNodeValue());

//					System.out.println("num of messages = " + compileElement.getElementsByTagName(MESSAGE).getLength() + " t_num = " + test.getNum());
					for (int j = 0; j < compileElement.getElementsByTagName(MESSAGE).getLength(); ++j) {
						Element messageElement = (Element) compileElement.getElementsByTagName(MESSAGE).item(j);

						Node lineNode = messageElement.getAttributes().getNamedItem("line");
						test.getCompile().addMessage(test.getCompile().new Message()
						  .setKind(messageElement.getAttributes().getNamedItem("kind").getNodeValue())
						  .setLine(lineNode != null ? lineNode.getNodeValue() : "-"));
					}
				}

				if (testElement.getElementsByTagName(RUN).getLength() > 0) {
					Element runElement = (Element) testElement.getElementsByTagName(RUN).item(0);
					
					test.initRun()
					.setClazz(runElement.getAttributes().getNamedItem(CLASS).getNodeValue());
				}

				tests.add(test);
			}
		}

		return tests;
	}
}
