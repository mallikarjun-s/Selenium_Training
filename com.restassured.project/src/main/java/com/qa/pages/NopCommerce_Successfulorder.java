package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.Webgenericutility;

public class NopCommerce_Successfulorder {

	
	@FindBy(xpath ="//strong[contains(text(),'Your order has been successfully processed!')]")
	public static WebElement successful_message;
	



public NopCommerce_Successfulorder(WebDriver driver){



	//This initElements method will create all WebElements

	PageFactory.initElements(driver, this);

}

public void successfullOrder(){
	
	String order_msg = Webgenericutility.getAttributeValue(successful_message, "Your order has been successfully processed!", 10);
	
	if(order_msg.equalsIgnoreCase(order_msg)){
		
		System.out.println("Order placed Successfully");
	}
	else
	{
		System.out.println("Order is not placed Successfully");
	}
}

}
