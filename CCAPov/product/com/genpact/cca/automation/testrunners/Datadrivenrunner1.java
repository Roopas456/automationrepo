package com.genpact.cca.automation.testrunners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
@CucumberOptions(features= {"C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\product\\com\\genpact\\cca\\automation\\features\\datadriven.feature"},
glue= {"com.genpact.cca.automation.steps"}
)
public class Datadrivenrunner1 {
	
private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "Login", description = "Login", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	
	  @DataProvider public Object[][] features() { return
	  testNGCucumberRunner.provideFeatures(); }
	 

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
	}

}
