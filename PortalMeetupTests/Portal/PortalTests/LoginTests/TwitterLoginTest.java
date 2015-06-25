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
 * Tests login with Twitter by taking to the Twitter login page
 */
public class TwitterLoginTest extends CommonTests
{

	@Test
	public void test()
	{
		//Goto Login page
		LoginPage.Goto();
		
		//Goto Twitter login page
		LoginCommand.TwitterLogin();
		
		//Validate
		Assert.assertEquals(true,LoggedInCheck.IsAtTwitterLogin());
	}

}
