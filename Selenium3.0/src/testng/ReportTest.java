package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest {
	@Test(groups= {"SmokeTest"})
	public void createReportTest() {
		Reporter.log("createReportTest()-smoke",true);
	}
	
	@Test(groups= {"RegressionTest"})
	public void modifyReportTest() {
		Reporter.log("modifyReportTest()-reg",true);
	}
	
	@Test(groups= {"RegressionTest"})
	public void deleteReportTest() {
		Reporter.log("deleteReportTest()-reg",true);
	}
}
