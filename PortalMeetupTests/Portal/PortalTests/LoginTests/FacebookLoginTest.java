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
 * Tests login with Facebook by taking to the facebook login page
 */
public class FacebookLoginTest extends CommonTests
{
	@Test
	public void test()
       {
		//Goto Login page
		LoginPage.Goto();
		
		//Choose login with Facebook 
		LoginCommand.FacebookLogin();
		
		//Validate
		Assert.assertEquals(true,LoggedInCheck.IsAtFacebookLogin());
	}

}
