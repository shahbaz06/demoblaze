package com.Genericlib.demoblaze;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;

public class Eventlist implements ITestListener{

	public void onTestFailure(ITestResult result) {
		File src=((TakesScreenshot)(Base.driver)).getScreenshotAs(OutputType.FILE);
		File dst=new File("Screenshots/" +System.currentTimeMillis()+".png");
		String path=dst.getAbsolutePath();
		try
		{
			FileUtils.copyFile(src, dst);
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
		Base.test1.fail(result.getThrowable(),MediaEntityBuilder.createScreenCaptureFromPath(path).build());
	}
	

}
