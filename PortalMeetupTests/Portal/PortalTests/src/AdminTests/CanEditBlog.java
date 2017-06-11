package AdminTests;

import org.junit.Assert;
import org.junit.Test;

import AdminFeatures.AdminLogin;
import AdminFeatures.EditPage;
import AdminFeatures.ViewUpdate;
import BaseTests.CommonTests;
import WebDriver.Driver;

public class CanEditBlog extends CommonTests{

	/*
	 * Tests if an admin can update his/her Blog after logging in, clicking on 
	 * edit profile, and entering a new Blog.
	 */
	
	@Test
	public void validTest()
	{
		String newBlog = "https://anitaborg.org/";
		//Log in
		AdminLogin.login();
		
		//Navigate to edit Profile
		EditPage.Goto();
				
		//Enter new blog and click update
		EditPage.ChangeBlogTo(newBlog).UpdateBlog();
		
		//Validate
		Assert.assertEquals(true, ViewUpdate.BlogHasChangedto(newBlog));	
	}
	
	@Test
	public void invalidTest()
	{
		String newBlog = "anitaborg";
		//Log in
		AdminLogin.login();
		
		//Navigate to edit Profile and get the URL of the page
		EditPage.Goto();
		String currentURL = Driver.Instance.getCurrentUrl();	
		
		//Enter new blog and click update
		EditPage.ChangeBlogTo(newBlog).UpdateBlog();
		
		//Confirm that the user could not continue with the faulty blog URL
		Assert.assertEquals(true, currentURL.equals(Driver.Instance.getCurrentUrl()));	
	}
}
