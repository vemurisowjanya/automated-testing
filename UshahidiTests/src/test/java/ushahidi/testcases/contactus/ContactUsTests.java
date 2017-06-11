/**
 * 
 */
package ushahidi.testcases.contactus;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ushahidi.commons.ApplicationConstants;
import ushahidi.commons.ContactsPageConstants;
import ushahidi.commons.Driver;
import ushahidi.pages.contact.ContactUsPageReference;
import ushahidi.pages.homepage.MenubarPageReference;
import ushahidi.pages.loginpage.LoginPageReference;

/**
 * @author Kesha
 *
 */
public class ContactUsTests {

	private WebDriver driver = null;
	private LoginPageReference login_page_ref;
	private MenubarPageReference menu_page_ref;
	private ContactUsPageReference contact_page_ref;
	
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
		contact_page_ref = new ContactUsPageReference();
		
		// Getting to the login page URL
		driver.get(ApplicationConstants.baseUrl + ApplicationConstants.extlogin);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// enter login details
		loginWith("kesha.shah1106@gmail.com", "abc123");
		
		// submit on opportunities tab
		WebElement contact_menu = driver.findElement(menu_page_ref.getContactus());
		contact_menu.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	private void contactUsWith(String name, String email, String phno, String subject, String message, String security)
	{
		// sending name
		WebElement ele_name = driver.findElement(contact_page_ref.getName());
		ele_name.sendKeys(name);
		
		//sending email
		WebElement ele_email = driver.findElement(contact_page_ref.getEmail());
		ele_email.sendKeys(email);
		
		//sending phno
		WebElement ele_phno = driver.findElement(contact_page_ref.getPhno());
		ele_phno.sendKeys(phno);
		
		//sending subject
		WebElement ele_subject = driver.findElement(contact_page_ref.getSubject());
		ele_subject.sendKeys(subject);
		
		//sending message
		WebElement ele_message = driver.findElement(contact_page_ref.getMessage());
		ele_message.sendKeys(message);
		
		//sending security
		WebElement ele_security = driver.findElement(contact_page_ref.getSecurityAns());
		ele_security.sendKeys(security);
		
		//clicking submit button
		WebElement submit = driver.findElement(contact_page_ref.getSendmessage());
		submit.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	private String securityAnswer(String question)
	{
		System.out.println(question);
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(question);
		int sum=0;
        while(m.find()) {
            sum =sum + Integer.parseInt(m.group());
        }
	
        return String.valueOf(sum);
	}
	
	@Test
	public void contactWithAllDetails() {
		System.out.println("Test: contactWithAllDetails ");
		contactUsWith("Kesha", "kesha.shah1106@gmail.com", "0123456789", "Message:Test", "Just a test to check if Contact Us Page is working correctly", securityAnswer(driver.findElement(contact_page_ref.getSecurityQue()).getText()));

		WebElement successElement = driver.findElement(contact_page_ref.getSuccess()); 
		String successMessageReceived = successElement.getText();
		
		System.out.println("SuccessMessage: "+successMessageReceived);
		
		boolean successFound = false;
		
		if(successMessageReceived.equals(ContactsPageConstants.success))
			successFound = true;
		
		Assert.assertEquals(true, successFound);

	}

	@Test
	public void contactWithNoPhone() {
		System.out.println("Test: contactWithNoPhone ");
		contactUsWith("Kesha", "kesha.shah1106@gmail.com", "", "Message:Test", "Just a test to check if Contact Us Page is working correctly", securityAnswer(driver.findElement(contact_page_ref.getSecurityQue()).getText()));

		WebElement successElement = driver.findElement(contact_page_ref.getSuccess()); 
		String successMessageReceived = successElement.getText();
		
		System.out.println("SuccessMessage: "+successMessageReceived);
		
		boolean successFound = false;
		
		if(successMessageReceived.equals(ContactsPageConstants.success))
			successFound = true;
		
		Assert.assertEquals(true, successFound);
	}
	
	@Test
	public void contactWithNoName() {
		System.out.println("Test: contactWithNoName ");
		contactUsWith("", "kesha.shah1106@gmail.com", "0123456789", "Message:Test", "Just a test to check if Contact Us Page is working correctly", securityAnswer(driver.findElement(contact_page_ref.getSecurityQue()).getText()));
		
		List<WebElement> allErrors = driver.findElements(contact_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ContactsPageConstants.name_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}

	@Test
	public void contactWithNoEmail() {
		System.out.println("Test: contactWithNoEmail ");
		contactUsWith("Kesha", "", "0123456789", "Message:Test", "Just a test to check if Contact Us Page is working correctly", securityAnswer(driver.findElement(contact_page_ref.getSecurityQue()).getText()));
		
		List<WebElement> allErrors = driver.findElements(contact_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ContactsPageConstants.email_req))
			{ 
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}

	@Test
	public void contactWithNoSubject() {
		System.out.println("Test: contactWithNoSubject ");
		contactUsWith("Kesha", "kesha.shah1106@gmail.com", "0123456789", "", "Just a test to check if Contact Us Page is working correctly", securityAnswer(driver.findElement(contact_page_ref.getSecurityQue()).getText()));
		
		List<WebElement> allErrors = driver.findElements(contact_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ContactsPageConstants.sub_req))
			{ 
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void contactWithNoMessage() {
		System.out.println("Test: contactWithNoMessage ");
		contactUsWith("Kesha", "kesha.shah1106@gmail.com", "0123456789", "Message:Test", "", securityAnswer(driver.findElement(contact_page_ref.getSecurityQue()).getText()));
		
		List<WebElement> allErrors = driver.findElements(contact_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ContactsPageConstants.msg_req))
			{ 
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}

	@Test
	public void contactWithNoSecurity() {
		System.out.println("Test: contactWithNoSecurity ");
		contactUsWith("Kesha", "kesha.shah1106@gmail.com", "0123456789", "Message:Test", "Just a test to check if Contact Us Page is working correctly", "");
		
		List<WebElement> allErrors = driver.findElements(contact_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ContactsPageConstants.sec_req))
			{ 
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}

	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

}
