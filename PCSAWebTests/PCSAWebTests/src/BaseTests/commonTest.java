/*
 * @author Anjali
 * @since 2016-06-08
 * This class initializes the driver before a test run and closed it after a test
 */
package BaseTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import WebDriver.driver;

public class commonTest 
{
	@BeforeMethod
	public static void startDriver()
	{
		try 
		{
			driver.initalizeDriver();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public static void tearDown()
	{
		try
		{
			driver.closeDriver();
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
	}
}
