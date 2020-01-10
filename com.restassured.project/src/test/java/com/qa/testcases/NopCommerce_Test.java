package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;
import com.qa.pages.NopCommerce_Cellphones;
import com.qa.pages.NopCommerce_Checkout;
import com.qa.pages.NopCommerce_HomePage;
import com.qa.pages.NopCommerce_Jewelry;
import com.qa.pages.NopCommerce_ShoppingCart;
import com.qa.pages.NopCommerce_Signin;
import com.qa.pages.NopCommerce_Successfulorder;

public class NopCommerce_Test extends BaseTest {
	
	NopCommerce_Cellphones obj_NopCommerce_Cellphones;
	NopCommerce_Checkout obj_NopCommerce_Checkout;
	NopCommerce_HomePage obj_NopCommerce_HomePage;
	NopCommerce_Jewelry obj_NopCommerce_Jewelry;
	NopCommerce_ShoppingCart obj_NopCommerce_ShoppingCart;
	NopCommerce_Signin obj_NopCommerce_Signin;
	NopCommerce_Successfulorder obj_NopCommerce_Successfulorder;
	
	

	@Test
	
	public void TC_001(){
		
		obj_NopCommerce_HomePage=new NopCommerce_HomePage(driver);
		obj_NopCommerce_HomePage.hoverToElectronics();
		obj_NopCommerce_HomePage.clickOnCellPhonesLink();
		
		obj_NopCommerce_Cellphones = new NopCommerce_Cellphones(driver);
		obj_NopCommerce_Jewelry=new NopCommerce_Jewelry(driver);
		obj_NopCommerce_Cellphones.sort_dropdown_L2H();
		obj_NopCommerce_Cellphones.addToCart1();
		obj_NopCommerce_Jewelry.JewelryCartContentClose();
		obj_NopCommerce_Cellphones.addToCart2();

		obj_NopCommerce_Jewelry.JewelryCartContentClose();
		obj_NopCommerce_Cellphones.jewellry_click();
		
		
		obj_NopCommerce_Jewelry.JewelryHighestPrice();
		obj_NopCommerce_Jewelry.JewelryAddToCart();
		obj_NopCommerce_Jewelry.JewelryCartContent();
		obj_NopCommerce_Jewelry.JewelryCartContentClose();
		obj_NopCommerce_Jewelry.JewelryMouseHoverShoppingCart();
		obj_NopCommerce_Jewelry.JewelryShoppingCart();
		
		obj_NopCommerce_ShoppingCart.getSubTotal();
		String item1_text = obj_NopCommerce_ShoppingCart.getItem1Text();
		String item2_text = obj_NopCommerce_ShoppingCart.getItem2Text();
		String item3_text = obj_NopCommerce_ShoppingCart.getItem3Text();
		obj_NopCommerce_ShoppingCart.updateJewelleryCount("3");
		obj_NopCommerce_ShoppingCart.clickUpdteShoppingCart();
		obj_NopCommerce_ShoppingCart.clickCheckOutBtn();
		obj_NopCommerce_ShoppingCart.closePopUp();
		obj_NopCommerce_ShoppingCart.acceptTerms();
		obj_NopCommerce_ShoppingCart.clickCheckOutBtn();
		
		obj_NopCommerce_Signin.checkoutAsGuest();
		
		
		
		
	}

}
