package com.vtigerv2.generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		String TestCaseName = result.getName();
		  TakesScreenshot t=(TakesScreenshot) driver;
		  File src = t.getScreenshotAs(OutputType.FILE);
		  File dest=new File("./ScreenShot/"+TestCaseName+".png");
		  try {
		   FileUtils.copyFile(src, dest);
		  } catch (IOException e) {
		   
		   e.printStackTrace();
		  }

		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}
