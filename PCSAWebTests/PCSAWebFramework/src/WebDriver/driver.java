/*
 * @author Anjali
 * @since 2016-06-08
 * This class creates a singleton instance of the Web Driver to be used across all classes.
 */
package WebDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import Logs.log4j;
import PageObjectModel.cloudServiceConstants;
import java.net.MalformedURLException;
import java.net.URL;

public class driver 
{
	public static WebDriver Instance;
	
	public static void initalizeDriver() throws Exception
	{
		//Initializing Log4j for logging
		DOMConfigurator.configure("log4j.xml");
		log4j.Log.info("Stating Webdriver");
		
		/*
		 * Local Testing setup.
		 * Edit the path to the chrome driver according to the location in the PC.
		 * Comment this part when testing on a cloud service
		 */
		System.setProperty("webdriver.chrome.driver", "D:\\GSoC Workspace\\ChromeDriver\\chromedriver.exe");
		Instance= new ChromeDriver();
		
		
		
		
		/*
		 * CLOUD SERVICE SETUP
		 * Uncomment line number 45 to 54 to run the tests on BrowserStack
		 * Comment line number 36 to 37 which are setup for local testing
		 * Edit and change the capability of browser, browser_version, os and os_version to test on a set of combination.
		 * The combinations can be found here: https://www.browserstack.com/automate/java#setting-os-and-browser
		 */
		/*DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "40.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "8");
		caps.setCapability("resolution", "1024x768");
		caps.setCapability("build", "v1");
		caps.setCapability("project", "AUT-PCSAWeb");
		caps.setCapability("browserstack.local", "true");
		Instance = new RemoteWebDriver(new URL(cloudServiceConstants.URL), caps);*/
		
		Instance.manage().window().maximize();
		Instance.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log4j.Log.info("Driver started");
	}
	
	/*
	 * @throws IOException
	 */
	public static void closeDriver() throws IOException
	{
		Instance.quit();
		log4j.Log.info("Driver closed");
	}
}
