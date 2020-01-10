package com.qa.resources;

import org.testng.annotations.DataProvider;



public class DataRead {
	
	@DataProvider(name="TC001")
	public Object[][] getDataFromDataprovider(){

	    return new Object[][] {

	            {"Hyderabad"},
	            {"Chennai"},
	            {"Bangalore"}

	            };
	}
	
	
	/*	@DataProvider(name = "LoginData")
	public Object[][] Authentication() throws Exception{
		ReadExcel excel = new ReadExcel();
		Object[][] testObjArray = excel.getExcelData("D:\\F Drive\\Selenium Training Data\\workspace\\Selenium_WebDriver_3.9\\FlightTestData.xls","TestData");
		System.out.println(testObjArray);
	     return testObjArray;
	     
		}*/
}

