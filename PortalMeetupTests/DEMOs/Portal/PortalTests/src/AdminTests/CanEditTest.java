package AdminTests;
import org.junit.Assert;
import org.junit.Test;
import AdminFeatures.AdminLogin;
import AdminFeatures.EditPage;
import AdminFeatures.ViewUpdate;
import BaseTests.CommonTests;

/*
* @author Anjali
*/

public class CanEditTest extends CommonTests
{
	/*
	 * Tests if an admin can update her last name after logging  in, clicking on edit,
	 *  entering new last name and then view changes
	 */
	@Test
	public void test()
	{
		//Log in
		AdminLogin.login();
		
		//Navigate to edit Profile
		EditPage.Goto();
		
		//Enter new last name and click update
		EditPage.ChangeLastnameTo("Kumar").Update();
		
		//Validate
		Assert.assertEquals("Failed",true,ViewUpdate.HasChanged());	
	}

}
