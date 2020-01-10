package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.Webgenericutility;

public class NopCommerce_Signin {
	
	@FindBy(xpath ="//input[@class='button-1 checkout-as-guest-button']")
	public static WebElement chechoutAsGuestbutton;
	



public NopCommerce_Signin(WebDriver driver){



	//This initElements method will create all WebElements

	PageFactory.initElements(driver, this);

}


public void checkoutAsGuest(){
	
	Webgenericutility.clickOn(chechoutAsGuestbutton, 10);
}
}
