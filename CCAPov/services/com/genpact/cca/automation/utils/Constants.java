package com.genpact.cca.automation.utils;

public interface Constants {

	String CHROME_PATH = "\\resources\\drivers\\chromedriver.exe";
	String BASE_DIR = System.getProperty("user.dir");
	String CHROME_KEY = "webdriver.chrome.driver";
	long PAGE_LOAD_TIMEOUT = 60;
	long IMPLICIT_WAIT = 30;
	String EXTENT_CONFIG_PATH = ".\\resources\\Extent-Config.xml";
	String LOG4J_PATH = "file:\\\\" + BASE_DIR + "\\resources\\log4j.xml";
	String AZURE_YAML_PATH = "resources/remote.yaml";
	String LOG4J_KEY = "log4j.configurationFile";
}
