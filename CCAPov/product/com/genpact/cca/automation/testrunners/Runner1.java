package com.genpact.cca.automation.testrunners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.genpact.cca.automation.testbase.BaseUI1;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features= {"C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\product\\com\\genpact\\cca\\automation\\features\\Samplelogin.feature"},
glue= {"com.genpact.cca.automation.steps"})

public class Runner1 extends BaseUI1{
	
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		// testbase.initialization();
	}

	@Test(groups = "Csafe_Cucumber_Reports", description = "Validation of DemandAllocation data", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}
	
	

    /*public static void main(String[] args) throws IOException 
    {
        NewExcel test = new NewExcel();
        test.setInputFile("D:/hellohowareyou.xls");
        test.read();
    }*/
	

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		//testbase.closeBrowser();
		testNGCucumberRunner.finish();
	}
	
	
}