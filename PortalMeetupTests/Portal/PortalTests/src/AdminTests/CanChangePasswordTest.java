package AdminTests;
import org.junit.Assert;
import org.junit.Test;
import AdminFeatures.AdminLogin;
import AdminFeatures.ChangePassword;
import BaseTests.CommonTests;

/*
* @author Anjali
*/
/*
 * Checks if the user can change existing password
 */
public class CanChangePasswordTest extends CommonTests
{
    private String OldPassword="anjali", NewPassword="anjali";
	@Test
	public void test() 
	{
		//Log in
		AdminLogin.login();
				
		//Validate
		Assert.assertEquals(true, ChangePassword.HasPasswordChanged(OldPassword, NewPassword));
	}

}
