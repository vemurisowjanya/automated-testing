package BaseTests;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import HomepageFeatures.Homepage;
import WebDriver.Driver;

/*
* @author Anjali
*/

/*
 * Starts the WebDrive before test and closes it after running the test. Common for all tests.
 */
public class CommonTests
{
	@Before
    public void InitDriver()
    {
	//Start WebDriver
    	Driver.Initialize (); 
    	
    	//Go to the homepage of portal
	Homepage.Goto();
    }
	   
    @After
    public void tearDown()
     {
    	try 
			{
    		    //Close WebDriver
				Driver.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
	}

		
	

}
