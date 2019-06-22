package com.genpact.cca.automation.testrunners;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.genpact.cca.automation.testbase.UIBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(features = {
".//product//com//genpact//cca//automation//features//Angular.feature" }, glue = {
"com.genpact.cca.automation.steps" }, tags = {
"@PoC" }, monochrome = true, dryRun = false, plugin = { "pretty",
		"html:target/cucumber-createConnection",
		"json:target/CucumberTestCreateConnection.json", "rerun:target/rerun.txt",
"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/CCA_Automation_Report.html" })

public class Angulartr extends UIBase{

	private TestNGCucumberRunner testNGCucumberRunner;
	UIBase testbase = new UIBase();

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception{
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "CCA", description = "Angular paths test", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testbase.createReport();
		testNGCucumberRunner.finish();
	}

}
