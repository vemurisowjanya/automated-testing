package Helper;

import java.util.concurrent.TimeUnit;
import java.io.*;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openWebsite extends testdata {
	
//navigating to the website entered by the user
	@Before 
	public void setUp() throws Exception {
	   driver = new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   
	 }
	
	 public void takeScreenshotonFailure() throws IOException{
			// take the screenshot at the end of every test
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        // now save the screenshot to a file some place
	        FileUtils.copyFile(scrFile, new File("/home/shwetambara/ScreenshotOnFail/sample.png"));   
		}
	
	 @After
	 public void tearDown() throws Exception {
			
		 takeScreenshotonFailure();
		 
			   driver.close();  // close the driver
		}
}
