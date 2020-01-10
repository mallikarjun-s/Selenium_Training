

package com.qa.basetests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.resources.DataRead;
import com.qa.resources.ReadExcel;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;




public class BaseTest extends DataRead{

	
	public static RequestSpecification httpRequest;
	public static Response response;



	
		
		public static String getresponse(String resp)
		{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/";
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, resp);
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		return responseBody;
		}
		
		public static int getstatusCode()
		{
			int status_code = response.getStatusCode();
			return status_code;
			
		}
		
	

	

		
	

}
