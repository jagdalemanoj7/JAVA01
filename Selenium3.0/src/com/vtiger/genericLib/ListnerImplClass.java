package com.vtiger.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		String curr_date=new Date().toString().replace(":", "_".replace(" ", "_"));
		String failedTcName=result.getMethod().getMethodName();
		System.out.println("Failed Test Case Name is:" +failedTcName);
		
		EventFiringWebDriver edr=new EventFiringWebDriver(BaseClass.dr);
		File srcFile = edr.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File("../Selenium3.0/Screenshot/"+failedTcName+"_"+curr_date+".png");
		try {
				FileUtils.copyFile(srcFile, destFile);
				Reporter.log("Screenshot taken Successfully..",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block		
		}
		
		
	}

	
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}