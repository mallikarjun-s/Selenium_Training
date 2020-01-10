package com.qa.utilities;

import java.io.FileReader;
import java.util.Properties;



/**
 * @author Mallikarjun
 * @Property loader java class used to read data from commonVariable.properties file
 * 
 * 
 *
 */
public class PropertyLoader {
	
	/** Reading the commonVariables.properties file using File Reader **/
	public static FileReader src;
	public static Properties p;
	/**Creating a constructor to initialize the properties**/
	public PropertyLoader()
	{
		
		try 
		{
			src=new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\resources\\commonVariables.properties");
			p=new Properties();
			p.load(src);
		}
		catch(Exception e)
		{
			System.out.println("Error message is "+ e.getMessage());
		}
	}
	
	
	/**
	 * @author Mallikarjun
	 * Method to get Base URL property from properties file
	 */
	/**Reading base url from property file and returning to base class**/
	public String getBaseURL()
	{
		return p.getProperty("base_url");
		
	}
	
	/**
	 * @author Mallikarjun
	 * Method to get Browser Type property from properties file
	 */
	/**Reading Browser type from property file and returning to base class**/
	public String getBrowsertype()
	{
		return p.getProperty("browsertype");
		
	}

}
