package com.Testscript.demoblaze;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Genericlib.demoblaze.Base;
import com.Repository.demoblaze.Homepage;

public class AddToCart extends Base {
	@Test
	public void AddToCartTest() throws InterruptedException, IOException
	{
		test1=report.createTest("Add To Cart");
		test1.pass("Logged in to the app as "+Fl.getdataFromproperties("username"));
		Homepage hp=PageFactory.initElements(driver, Homepage.class);
		test1.pass("navigated to home page");
		cu.handleStaleReflementException(hp.getSamsungGalaxys6());
		test1.pass("handled the exception");
		hp.getAddtocart().click();
		test1.pass("handled alert");
		Thread.sleep(2000);
		cu.acceptAlert(driver);
		hp.getCart().click();
		test1.pass("navigate to cart");
		Assert.assertTrue(hp.getCartSamsungGalaxys6().isDisplayed());
		test1.pass("Product has verified in the cart");
	}

}
