package BaseTests;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import PortalHomePage.Homepage;
import WebDriver.Driver;

/*
 * @author Anjali
 */

public class CommonTest 
{

	@Before
	public void InitDriver()
	{
		//Start Webdriver
		Driver.Initialise();
		
		//Navigating to the portal homepage
		Homepage.Goto(); 
	}
	
	@After
	public void tearDown() throws IOException 
	{
		//Closing Webdriver after test
		Driver.close();
	}


}
