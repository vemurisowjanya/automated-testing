/**
 * 
 */
package ushahidi.testcases.faq;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ushahidi.commons.ApplicationConstants;
import ushahidi.commons.Driver;
import ushahidi.commons.FaqPageConstants;
import ushahidi.pages.faq.FaqPageReference;
import ushahidi.pages.homepage.MenubarPageReference;
import ushahidi.pages.loginpage.LoginPageReference;
import ushahidi.pages.opportunities.OpportunitiesPageReference;
import ushahidi.pages.opportunities.SubmitOpportunityPageReference;
import ushahidi.pages.opportunities.SuccessOpportunityPageReference;

/**
 * @author Kesha
 *
 */
public class FaqTests {

	private WebDriver driver = null;
	private LoginPageReference login_page_ref;
	private MenubarPageReference menu_page_ref;
	private FaqPageReference faq_page_ref;
	
	private void loginWith(String username, String password)
			throws InterruptedException {
		// Enter user email id
		WebElement login_text = driver.findElements(login_page_ref.getLogin_text_class()).get(0);
		WebElement uname = login_text.findElement(login_page_ref.getUsername_id());
		uname.sendKeys(username);

		// Enter user password
		login_text = driver.findElements(login_page_ref.getLogin_text_class()).get(1);
		WebElement pswd = login_text.findElement(login_page_ref.getPassword_id());
		pswd.sendKeys(password);

		// Press Enter
		WebElement login = driver.findElement(login_page_ref.getSubmit_id());
		login.submit();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Driver d = new Driver();
		driver = d.getInstance();
		login_page_ref = new LoginPageReference();
		menu_page_ref = new MenubarPageReference();
		faq_page_ref = new FaqPageReference();
		
		// Getting to the login page URL
		driver.get(ApplicationConstants.baseUrl + ApplicationConstants.extlogin);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// enter login details
		loginWith("kesha.shah1106@gmail.com", "abc123");
		
		// submit on opportunities tab
		WebElement faq_menu = driver.findElement(menu_page_ref.getFaq());
		faq_menu.click();

	}

	@Test
	public void isTitleFaqPage() {
		System.out.println("Test: isTitleFaqPage");
		
		WebElement title = driver.findElement(faq_page_ref.getTitle());
		assertEquals(title.getText(), FaqPageConstants.title);
	}


	@Test
	public void isContentFaqPage() {
		System.out.println("Test: isContentFaqPage");
		
		WebElement content = driver.findElement(faq_page_ref.getContent());
		assertEquals(content.getText(), FaqPageConstants.content);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
