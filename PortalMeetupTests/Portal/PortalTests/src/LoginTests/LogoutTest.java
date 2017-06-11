package LoginTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import Login.LoginPage;
import Login.LogoutCheck;

/*
* @author Anjali
*/

/*
 * Tests Logout
 */
public class LogoutTest extends CommonTests
{

	@Test
	public void test() 
	{
		//Login
	    LoginPage.LoginAs("dummyUsername").WithPassword("dummyPassword").Login();
		
	    //Validate logout
	    Assert.assertEquals(true, LogoutCheck.HasLoggedOut());
	}

}
