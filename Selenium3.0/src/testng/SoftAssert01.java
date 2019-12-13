package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert01 {

	@Test
	public void softassert01Test() {

		SoftAssert softassert=new SoftAssert();
		
		System.out.println("TEsting Browser");
		softassert.assertEquals("a", "a");
		System.out.println("pass");
		
		softassert.assertEquals("pbrowser", "chrome");
		System.out.println("chrome");
		
		//SoftAssert softassert1=new SoftAssert();
		softassert.assertEquals("firefox", "firefox1");
		System.out.println("firefox");
		
		softassert.assertAll();
		
	}
}