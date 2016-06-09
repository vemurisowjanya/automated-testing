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
import org.openqa.selenium.firefox.FirefoxDriver;
import Logs.log4j;

public class driver 
{
	public static WebDriver Instance;
	
	public static void initalizeDriver()
	{
		//Initializing Log4j for logging
		DOMConfigurator.configure("log4j.xml");
		log4j.Log.info("Stating Webdriver");
		Instance = new FirefoxDriver();
		Instance.manage().window().maximize();
		Instance.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log4j.Log.info("Driver started");
	}
	
	/*
	 * @throws IOException
	 */
	public static void closeDriver() throws IOException
	{
		Instance.close();
		log4j.Log.info("Driver closed");
	}
}
