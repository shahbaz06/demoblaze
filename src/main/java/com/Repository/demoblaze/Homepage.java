package com.Repository.demoblaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {@FindBy(xpath="//a[.='Samsung galaxy s6']")
private WebElement SamsungGalaxys6;

@FindBy(xpath = "//a[.='Add to cart']")
private WebElement Addtocart;

@FindBy(id = "cartur")
private WebElement cart;

@FindBy(xpath = "//td[.='Samsung galaxy s6']")
private WebElement cartSamsungGalaxys6;

public WebElement getSamsungGalaxys6() {
	return SamsungGalaxys6;
}

public WebElement getAddtocart() {
	return Addtocart;
}

public WebElement getCart() {
	return cart;
}

public WebElement getCartSamsungGalaxys6() {
	return cartSamsungGalaxys6;
}
 

}
