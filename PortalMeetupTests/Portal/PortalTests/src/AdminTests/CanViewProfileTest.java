package AdminTests;
import org.junit.Assert;
import org.junit.Test;
import AdminFeatures.AdminLogin;
import AdminFeatures.ViewProfile;
import BaseTests.CommonTests;

/*
* @author Anjali
*/
/*
 * Checks navigation on profile by clicking on the profile tab listed on the drop down menu on the upper right  
 */
public class CanViewProfileTest extends CommonTests
{

	@Test
	public void test() 
	{
		//Log in
	    AdminLogin.login();
	    
	    //Validate Navigation
		Assert.assertEquals(true, ViewProfile.CanViewProfile());		
	}

}
