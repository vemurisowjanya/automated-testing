package AdminTests;

import org.junit.Assert;
import org.junit.Test;

import AdminFeatures.AdminLogin;
import AdminFeatures.EditPage;
import AdminFeatures.ViewUpdate;
import BaseTests.CommonTests;
import WebDriver.Driver;

public class CanEditHomepage extends CommonTests{

	 /*
	 * Tests if an admin can update his/her homepage after logging in, clicking on 
	 * edit profile, and entering a new homepage.
	 */

	@Test
	public void validTest()
	{
		String newHomepage = "https://anitaborg.org/";
		//Log in
		AdminLogin.login();
		
		//Navigate to edit Profile
		EditPage.Goto();
				
		//Enter new homepage and click update
		EditPage.ChangeHomepageTo(newHomepage).UpdateHomepage();
		
		//Validate
		Assert.assertEquals(true, ViewUpdate.HomepageHasChangedto(newHomepage));	
	}
	
	@Test
	public void invalidTest()
	{
		String newHomepage = "anitaborg";
		//Log in
		AdminLogin.login();
		
		//Navigate to edit Profile and get the URL of the page
		EditPage.Goto();
		String currentURL = Driver.Instance.getCurrentUrl();	
		
		//Enter new homepage and click update
		EditPage.ChangeBlogTo(newHomepage).UpdateHomepage();
		
		//Confirm that the user could not continue with the faulty homepage URL
		Assert.assertEquals(true, currentURL.equals(Driver.Instance.getCurrentUrl()));	
	}

}
