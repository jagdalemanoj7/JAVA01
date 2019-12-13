package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerTest {

	@Test(groups= {"SmokeTest"})
	public void createCustomerTest() {
		Reporter.log("createCustomerTest()-smoke",true);
	}
	
	@Test(groups= {"RegressionTest"})
	public void modifyCustomerTest() {
		Reporter.log("modifyCustomerTest()-reg",true);
	}
	
	@Test(groups= {"RegressionTest"})
	public void deleteCustomerTest() {
		Reporter.log("deleteCustomerTest()-reg",true);
	}
	
}