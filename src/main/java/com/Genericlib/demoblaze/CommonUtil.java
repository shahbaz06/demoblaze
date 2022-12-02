package com.Genericlib.demoblaze;

import org.openqa.selenium.Alert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtil {
	public void acceptAlert(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public void dismisAlert(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	public void handleStaleReflementException(WebElement e)
	{
		 for(int i=0;i<3;i++)
		 {
			 try
			 {
				 e.click();
				 break;
			 }
			 catch(StaleElementReferenceException ex)
			 {
				 
			 }
		 }
	}
}
