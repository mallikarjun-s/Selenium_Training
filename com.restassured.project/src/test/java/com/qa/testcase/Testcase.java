package com.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.basetests.BaseTest;
import com.qa.resources.ReadExcel;

public class Testcase extends BaseTest{
	
	/*public Testcase()
	{
		BaseTest test = new BaseTest();
	}
*/	String abspath = System.getProperty("user.dir");
/*	@DataProvider(name = "TC001")
	public Object[] getData() throws Exception{
		ReadExcel excel = new ReadExcel();
		Object[] testObjArray = excel.getExcelData(abspath+"\\Excelfile\\TestData.xlsx","Sheet1");
		System.out.println(testObjArray);
	     return testObjArray;
	     
		}*/
	
	@DataProvider(name="TC001")
	public Object[][] getDataFromDataprovider(){

	    return new Object[][] {

	            {"Hyderabad"},
	            {"Chennai"},
	            {"Bangalore"}

	            };
	}
	
	@Test(dataProvider = "TC001")
	public void TC001(String resp){
		
		//BaseTest test = new BaseTest();
		BaseTest.getresponse(resp);
		Assert.assertEquals(BaseTest.getstatusCode(), 200);
	
	}
}
