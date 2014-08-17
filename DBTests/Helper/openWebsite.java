package Helper;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openWebsite extends testdata {
	
//navigating to the website entered by the user
	@Before 
	public void setUp() throws Exception {
	   driver = new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 }
	
	 @After
	 public void tearDown() throws Exception {
			
		 takeScreenshotonFailure();
		 
			   driver.close();  // close the driver
		}
}
