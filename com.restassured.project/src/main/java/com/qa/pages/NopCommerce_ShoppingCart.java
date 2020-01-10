package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.Webgenericutility;


public class NopCommerce_ShoppingCart {

	public NopCommerce_ShoppingCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	
	
	@FindBy(xpath="//h2[@class='product-title']//a[contains(text(),'HTC One Mini Blue')]")
	public static WebElement citemText3;
	
	@FindBy(xpath="//h2[@class='product-title']//a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]")
	public static WebElement citemText4;
	
	@FindBy(xpath="//a[@class='product-name'][contains(text(),'Vintage Style Engagement Ring')]")
	public static WebElement jitemText2;
	
	@FindBy(className ="cart-total-right")
	public static WebElement subTotal;
	

	@FindBy(id ="itemquantity13138")
	public static WebElement qty;
	
	@FindBy(name ="updatecart")
	public static WebElement updateCartbutton;
	
	
	@FindBy(id ="checkout")
	public static WebElement checkoutButton;
	
	@FindBy(xpath ="//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']")
	public static WebElement closeTermspopup;
	
	
	@FindBy(id ="termsofservice")
	public static WebElement acceptCheckbox;
	
	
	public String getSubTotal()
	{
		return Webgenericutility.getText(subTotal, 3000);	
	}
	
	public String getItem1Text()
	{
		return Webgenericutility.getText(citemText3, 3000);
	}
	
	public String getItem2Text()
	{
		return Webgenericutility.getText(citemText4, 3000);
	}
	

	public String getItem3Text()
	{
		return Webgenericutility.getText(jitemText2, 3000);
	}
	
	public void updateJewelleryCount(String value)
	{
		Webgenericutility.sendKeyValue(qty, 1000, value);
	}
	
	public void clickUpdteShoppingCart()
	{
		Webgenericutility.clickOn(updateCartbutton, 1000);
		
	}
	
	public void clickCheckOutBtn()
	{
		Webgenericutility.clickOn(checkoutButton, 1000);
	}
	public void closePopUp()
	{
		Webgenericutility.clickOn(closeTermspopup, 1000);
		
	}
	
	public void acceptTerms()
	{
		Webgenericutility.clickOn(acceptCheckbox, 1000);
		
	}
	
}
