package com.Genericlib.demoblaze;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base 
{
	public static WebDriver driver;
	public Filelib Fl=new Filelib();
	public CommonUtil cu=new CommonUtil();
	public static ExtentReports report;
	public static ExtentSparkReporter spark;
	public static ExtentTest test1;
	
	
	@BeforeTest
	public void configBT() throws IOException
	{
		report=new ExtentReports();
		spark=new ExtentSparkReporter("test-output/extent.html");
		report.attachReporter(spark);
		
		if(Fl.getdataFromproperties("browser").equals("firefox"))
		{
		driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(Fl.getdataFromproperties("URL"));
	}
	@BeforeMethod
	public void configBM() throws IOException
	{
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys(Fl.getdataFromproperties("username"));
		driver.findElement(By.id("loginpassword")).sendKeys(Fl.getdataFromproperties("password"));
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		
		
		
		
	}
	@AfterMethod
	public void configAM()
	{
		driver.findElement(By.id("logout2")).click();
		test1.pass("Logged out from app");
	}
	
	@AfterTest
	public void configAT()
	{
		driver.quit();
		test1.pass("clossed the browser");
		report.flush();
	}
	
	

}
