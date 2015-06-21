package LoginTests;
import junit.framework.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import Login.LoggedInCheck;
import Login.LoginCommand;
import Login.LoginPage;

/*
* @author Anjali
*/

/*
 * Tests login with Google by taking to the Google login page
 */
public class GoogleLoginTest extends CommonTests
{

	@Test
	public void test() 
	{
		//Goto Login page
		LoginPage.Goto();
		
		//Goto Google login page
		LoginCommand.GoogleLogin();
		
		//Validate
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAtGoogleLogin());
	}

}
