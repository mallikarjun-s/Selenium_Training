package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.Webgenericutility;


public class NopCommerce_Jewelry {
	
	public NopCommerce_Jewelry(WebDriver driver){
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='products-orderby']")
	private WebElement sortDropdown_1;
	
	@FindBy(xpath="//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement jaddTocart;
	
	@FindBy(xpath="//p[@class='content']")
	private WebElement cartContent;
	
	@FindBy(xpath="//span[@class='close']")
	private WebElement cartContentclose;
	
	@FindBy(xpath="//span[@class='cart-label']")
	private WebElement addtoCartlabel;
	
	@FindBy(xpath="//input[@class='button-1 cart-button']")
	private WebElement goToCartButton;
	
	@FindBy(xpath="//a[@class='product-name'][contains(text(),'Vintage Style Engagement Ring')]")
	private WebElement jitemText2;
	
	
	public void JewelryHighestPrice()
	{
		Webgenericutility.selectDropdownByValue(sortDropdown_1, "Price: High to Low", 10);
	}
	
	public void JewelryAddToCart()
	{
		Webgenericutility.clickOn(jaddTocart, 10);
	}
	
	public void JewelryCartContent()
	{
		String jcart = Webgenericutility.getAttributeValue(cartContent, "The product has been added to your", 10);
		if(jcart.equalsIgnoreCase("The product has been added to your")){
			System.out.println("Cart Content Availabe");
		}
		else { System.out.println("Cart Content Not Availabe"); }
	}
	
	public void JewelryCartContentClose()
	{
		Webgenericutility.clickOn(cartContentclose, 10);
	}
	
	public void JewelryMouseHoverShoppingCart()
	{
		Webgenericutility.moveToElement(addtoCartlabel);
		goToCartButton.click();
	}
	
	public void JewelryShoppingCart()
	{
		System.out.println(jitemText2.getText());
	}
	
}
