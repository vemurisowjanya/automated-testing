/**
 * 
 */
package ushahidi.testcases.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ushahidi.commons.Driver;
import ushahidi.pages.loginpage.LoginPageRefrence;
/**
 * @author Kesha
 *
 */
public class ValidateLogin {

	WebDriver driver = null;
	LoginPageRefrence pageref;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Driver d = new Driver();
		driver = d.getInstance(); 
		pageref = new LoginPageRefrence();
	}
	
	@Test
	public void test() throws InterruptedException {

			// now driver use this to visit Google
	        driver.get("http://www.google.com");
	        Thread.sleep(5000);  
	        // Find the text input element by its name
	        WebElement element = driver.findElement(pageref.getQuery());

	        // Enter something to search for
	        element.sendKeys("Cheese!");

	        // Now submit the form. WebDriver will find the form for us from the element
	        element.submit();
	        Thread.sleep(5000);  
	        // Check the title of the page
	        System.out.println("Page title is: " + driver.getTitle());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		 driver.quit();
	}
}
