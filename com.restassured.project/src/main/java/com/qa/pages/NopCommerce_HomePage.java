package com.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utilities.Webgenericutility;


public class NopCommerce_HomePage {
	
	public WebDriver driver;
	public NopCommerce_HomePage(WebDriver driver){
		this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	//@FindBy(xpath="//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
	private By hoverElectronicsmenu=By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
	
	

	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
	private WebElement hoverElectronicsmenu1;
	
	@FindBy(xpath= "//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]")
	private WebElement cellPhone;
	
	private Webgenericutility utility=new Webgenericutility();
	
	public void hoverToElectronics()
    {
		WebDriverWait wait=new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(hoverElectronicsmenu));
		Actions a= new Actions(driver);
		a.moveToElement(hoverElectronicsmenu1);
		a.build().perform();
		//Webgenericutility.clickOn(cellPhone, 1000);
		
	}
	
	public void clickOnCellPhonesLink()
	{
		cellPhone.click();
	}

}
