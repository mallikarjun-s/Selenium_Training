package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.Webgenericutility;

public class NopCommerce_Checkout {
	
	@FindBy(xpath="//li[@id='opc-billing']//div[@class='step-title']")
	public static WebElement billingAddressclick;
	

	@FindBy(id="BillingNewAddress_FirstName")
	public static WebElement firstName;
	
	@FindBy(id="BillingNewAddress_LastName")
	public static WebElement lastName;
	
	@FindBy(id="BillingNewAddress_Email")
	public static WebElement email;
	
	@FindBy(id="BillingNewAddress_CountryId")
	public static WebElement country;
	
	@FindBy(id="BillingNewAddress_City")
	public static WebElement city;
	
	@FindBy(id="BillingNewAddress_Address1")
	public static WebElement address1;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	public static WebElement zipPostCode;
	

	@FindBy(id="BillingNewAddress_PhoneNumber")
	public static WebElement phoneNumber;
	
	@FindBy(xpath="//div[@id='billing-buttons-container']//input[@class='button-1 new-address-next-step-button']")
	public static WebElement continueButton1;
	
	@FindBy(xpath="//input[@class='button-1 shipping-method-next-step-button']")
	public static WebElement continueButton2;
	

	@FindBy(xpath="//input[@class='button-1 payment-method-next-step-button']")
	public static WebElement continueButton3;
	
	@FindBy(xpath="//input[@class='button-1 payment-info-next-step-button']")
	public static WebElement continueButton4;
	
	@FindBy(xpath="//input[@class='button-1 confirm-order-next-step-button']")
	public static WebElement continueButton5;


public NopCommerce_Checkout(WebDriver driver){



	//This initElements method will create all WebElements

	PageFactory.initElements(driver, this);

}


public void billingAddressclick(){
	
	Webgenericutility.clickOn(billingAddressclick, 10);
}

public void enterFirstname(String fname){
	
	Webgenericutility.sendKeyValue(firstName, 0, fname);
	
}

public void enterLastname(String lname){
	
	Webgenericutility.sendKeyValue(lastName, 0, lname);
	
}

public void enterEmailID(String emailid){
	
	Webgenericutility.sendKeyValue(email, 0, emailid);
}
public void enterCountry(String country1){
	
	Webgenericutility.sendKeyValue(country, 0, country1);
}

public void enterCity(String city1){
	
	Webgenericutility.sendKeyValue(city, 0, city1);
}
public void enterAddress1(String address){
	
	Webgenericutility.sendKeyValue(address1, 0, address);
}

public void enterZipCode(String zippostal){
	
	Webgenericutility.sendKeyValue(zipPostCode, 0, zippostal);
}

public void enterPhoneNumber(String phonenumber){
	
	Webgenericutility.sendKeyValue(zipPostCode, 0, phonenumber);
}

public void billingAddresscontinueclick(){
	
	Webgenericutility.clickOn(continueButton1, 10);
}

public void shippingContinueClick(){
	
	Webgenericutility.clickOn(continueButton2, 10);
}
public void paymentContinueClick(){
	
	Webgenericutility.clickOn(continueButton3, 10);
}
public void paymentinformationContinueClick(){
	
	Webgenericutility.clickOn(continueButton4, 10);
}
public void confirmButtonClick(){
	
	Webgenericutility.clickOn(continueButton5, 10);
}
}
