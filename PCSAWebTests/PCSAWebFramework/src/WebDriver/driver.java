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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import Logs.log4j;
import PageObjectModel.cloudServiceConstants;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

import static PageObjectModel.constants.chromeDriverFileName;
import static PageObjectModel.constants.chromeDriverURL;
import static PageObjectModel.constants.chromeDriverZip;

public class driver 
{
	public static WebDriver Instance;

	public static void initalizeDriver() throws Exception
	{
		//Initializing Log4j for logging
		DOMConfigurator.configure("log4j.xml");
		log4j.Log.info("Starting Webdriver");
		
		/*
		 * Local Testing setup.
		 * Edit the path to the chrome driver according to the location in the PC.
		 * Comment this part when testing on a cloud service
		 */
		driverManager manager = new driverManager();

		if(manager.checkIfFileExists("./chromedriver")){
			log4j.Log.info("Driver found!");
		}else{
			manager.download(chromeDriverZip, chromeDriverURL);
			manager.unzip("./"+chromeDriverZip, "./");
			manager.deleteZip("./"+chromeDriverZip);
			manager.makeFileExecutable("./"+chromeDriverFileName);
		}
		System.setProperty("webdriver.chrome.driver", chromeDriverFileName);
		Instance= new ChromeDriver();
		
		
		
		
		/*
		 * CLOUD SERVICE SETUP
		 * Uncomment line number 49 to 59 to run the tests on BrowserStack
		 * Comment line number 36 to 37 which are setup for local testing
		 * Edit and change the capability of browser, browser_version, os and os_version to test on a set of combination.
		 * The combinations can be found here: https://www.browserstack.com/automate/java#setting-os-and-browser
		 */
	/*	DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "51.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "7");
		caps.setCapability("resolution", "1024x768");
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("build", "version 1, Windows 7 Chrome 51.0");
		caps.setCapability("project", "AUT-PCSAWeb");
		caps.setCapability("browserstack.local", "true");
		Instance = new RemoteWebDriver(new URL(cloudServiceConstants.URL), caps); */
		
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

	public static void waitDriverForElement(WebElement element) throws IOException
	{
		(new WebDriverWait(Instance, 10)).until(ExpectedConditions.visibilityOf(element));
	}

	public static void sleepDriver(int timeInMilis){
		try {
			Thread.sleep(timeInMilis);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}

	}

}
