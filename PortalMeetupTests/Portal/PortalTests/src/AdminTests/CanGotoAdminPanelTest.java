package AdminTests;
import org.junit.Assert;
import org.junit.Test;
import AdminFeatures.AdminLogin;
import AdminFeatures.AdminPanel;
import BaseTests.CommonTests;

/*
* @author Anjali
*/
/*
 * Checks navigation to admin panel by clicking on the admin panel tab listed on the drop down menu on the upper right  
 */
public class CanGotoAdminPanelTest extends CommonTests
{

	@Test
	public void test() 
	{
		//Log in
		AdminLogin.login();
		
		//Validate navigation to the admin panel
		Assert.assertEquals(true, AdminPanel.CanGotoAdminPanel());
	}

}
