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
 * Tests login with Github by taking to the Github login page
 */
public class GithubLoginTest extends CommonTests
{
	@Test
	public void test()
        {
		//Goto Login page
		LoginPage.Goto();
		
		//Choose login with Github
		LoginCommand.GithubLogin();
		
		//Validate
		Assert.assertEquals(true,LoggedInCheck.IsAtGitHUbLogin());
	}

}
