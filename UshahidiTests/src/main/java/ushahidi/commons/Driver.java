/**
 * 
 */
package ushahidi.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Kesha
 *
 */
public class Driver {

	WebDriver driver = null;
	
	public Driver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\TestingAutomation\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public WebDriver getInstance()
	{
		if(driver == null)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\TestingAutomation\\chromedriver.exe");
			return new ChromeDriver();
		}
		else
		{
			return driver;
		}
		
	}
}
