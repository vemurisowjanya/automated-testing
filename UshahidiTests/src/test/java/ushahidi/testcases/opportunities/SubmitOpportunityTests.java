/**
 * 
 */
package ushahidi.testcases.opportunities;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

import ushahidi.commons.ApplicationConstants;
import ushahidi.commons.Driver;
import ushahidi.commons.OpportunitiesPageConstants;
import ushahidi.pages.homepage.MenubarPageReference;
import ushahidi.pages.loginpage.LoginPageReference;
import ushahidi.pages.loginpage.SignUpPageReference;
import ushahidi.pages.loginpage.UIPageReference;
import ushahidi.pages.opportunities.OpportunitiesPageReference;
import ushahidi.pages.opportunities.SubmitOpportunityPageReference;
import ushahidi.pages.opportunities.SuccessOpportunityPageReference;

/**
 * @author Kesha
 *
 */
public class SubmitOpportunityTests {
	private WebDriver driver = null;
	private OpportunitiesPageReference opportunity_page_ref;
	private SubmitOpportunityPageReference submit_page_ref;
	private LoginPageReference login_page_ref;
	private MenubarPageReference menu_page_ref;
	private SuccessOpportunityPageReference success_page_ref;
	private Random random_no;
	
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
		submit_page_ref = new SubmitOpportunityPageReference();
		login_page_ref = new LoginPageReference();
		menu_page_ref = new MenubarPageReference();
		opportunity_page_ref = new OpportunitiesPageReference();
		success_page_ref = new SuccessOpportunityPageReference();
		
		random_no = new Random();

		// Getting to the login page URL
		driver.get(ApplicationConstants.baseUrl + ApplicationConstants.extlogin);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// enter login details
		loginWith("kesha.shah1106@gmail.com", "abc123");
		
		// submit on opportunities tab
		WebElement opportunity_menu = driver.findElement(menu_page_ref.getOpportunity());
		opportunity_menu.click();
	}

	private void submitOpportunityWith(String resourceAvailable, String pCVName, String availableFrom, String availableUntil, String bestWayToContact, String additionalInfo)
	{
		// submit on submit an opprtunity
		WebElement opportunity_submit = driver.findElement(opportunity_page_ref.getSubmitBtn());
		opportunity_submit.click();
		
		// sending resource Available.
		WebElement resource = driver.findElement(submit_page_ref.getResource());
		resource.sendKeys(resourceAvailable);
		
		// sending pcv name.
		WebElement pcv = driver.findElement(submit_page_ref.getPcv());
		pcv.sendKeys(pCVName);
		
		// sending Available from .
		WebElement availablefrom = driver.findElement(submit_page_ref.getAvailableFrom());
		availablefrom.sendKeys(availableFrom);
		
		// sending Available until.
		WebElement availableuntil = driver.findElement(submit_page_ref.getAvailableUntil());
		availableuntil.sendKeys(availableUntil);
		
		// sending best way to contact.
		WebElement contact = driver.findElement(submit_page_ref.getContactby());
		contact.sendKeys(bestWayToContact);
		
		// sending additional Info
		WebElement addinfo = driver.findElement(submit_page_ref.getAdditionalInfo());
		addinfo.sendKeys(additionalInfo);
		
		// clicking submit button
		WebElement submit = driver.findElement(submit_page_ref.getSubmit());
		submit.click();
	}
	
	@Test
	public void opporunityWithNoResource() {
		System.out.println("Test: opporunityWithNoResource ");
		
		submitOpportunityWith("", "Kesha Shah", "06/11/2015", "06/28/2015", "+91-9234512345", "additonal info here");
	
		List<WebElement> allErrors = driver.findElements(submit_page_ref.getErrorlog()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equals(OpportunitiesPageConstants.resourcerequired))
			{
				errorFound = true;
				break;
			}
		}
		
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void opporunityWithNoPCV() {
		System.out.println("Test: opporunityWithNoPCV ");
		
		submitOpportunityWith("Volunter", "", "06/11/2015", "06/28/2015", "+91-9234512345", "additonal info here");
	
		List<WebElement> allErrors = driver.findElements(submit_page_ref.getErrorlog()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equals(OpportunitiesPageConstants.pcvrequired))
			{
				errorFound = true;
				break;
			}
		}
		
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void opporunityWithNoAvailablefrom() {
		System.out.println("Test: opporunityWithNoAvailablefrom ");
		
		submitOpportunityWith("Volunter", "Kesha Shah", "", "06/28/2015", "+91-9234512345", "additonal info here");
	
		List<WebElement> allErrors = driver.findElements(submit_page_ref.getErrorlog()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equals(OpportunitiesPageConstants.availablefromrequired))
			{
				errorFound = true;
				break;
			}
		}
		
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void opporunityWithNoAvailableUntil() {
		System.out.println("Test: opporunityWithNoAvailableUntil ");
		
		submitOpportunityWith("Volunter", "Kesha Shah", "06/11/2015", "", "+91-9234512345", "additonal info here");
	
		List<WebElement> allErrors = driver.findElements(submit_page_ref.getErrorlog()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equals(OpportunitiesPageConstants.availableuntilrequired))
			{
				errorFound = true;
				break;
			}
		}
		
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void opporunityWithNoContact() {
		System.out.println("Test: opporunityWithNoContact ");
		
		submitOpportunityWith("Volunter", "Kesha Shah", "06/11/2015", "06/28/2015", "", "additonal info here");
	
		List<WebElement> allErrors = driver.findElements(submit_page_ref.getErrorlog()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equals(OpportunitiesPageConstants.contactrequired))
			{
				errorFound = true;
				break;
			}
		}
		
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void opporunityWithNoAdditionalInfo() {
		System.out.println("Test: opporunityWithNoAdditionalInfo ");
		
		submitOpportunityWith("Volunter", "Kesha Shah", "06/11/2015", "06/28/2015", "+91-9234512345", "");
	
		List<WebElement> allErrors = driver.findElements(submit_page_ref.getErrorlog()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equals(OpportunitiesPageConstants.additionalinforequired))
			{
				errorFound = true;
				break;
			}
		}
		
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void opporunityWithWrongFormatAvailableFrom() {
		System.out.println("Test: opporunityWithWrongFormatAvailableFrom ");
		
		submitOpportunityWith("Volunter", "Kesha Shah", "06112015", "06/28/2015", "+91-9234512345", "additonal info here");
	
		List<WebElement> allErrors = driver.findElements(submit_page_ref.getErrorlog()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equals(OpportunitiesPageConstants.availablefromformat))
			{
				errorFound = true;
				break;
			}
		}
		
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void opporunityWithWrongFormatAvailableUntil() {
		System.out.println("Test: opporunityWithWrongFormatAvailableUntil ");
		
		submitOpportunityWith("Volunter", "Kesha Shah", "06/11/2015", "06282015", "+91-9234512345", "additonal info here");
	
		List<WebElement> allErrors = driver.findElements(submit_page_ref.getErrorlog()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equals(OpportunitiesPageConstants.availableuntilformat))
			{
				errorFound = true;
				break;
			}
		}
		
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void opporunitySubmitPass() {
		System.out.println("Test: opporunitySubmitPass ");
		
		int rand = random_no.nextInt(1000);
		String resource = "Volunter" + rand;
		String pcv =  "KeshaShah" + rand;
		submitOpportunityWith(resource,pcv, "06/11/2015", "06/28/2015", "+91-9234512345", "additonal info here");
	
		WebElement success = driver.findElement(success_page_ref.getSuccess());
		System.out.println(success.getText());
		
		Assert.assertEquals(OpportunitiesPageConstants.successfulopportunity, success.getText());
	}
	
	@Test
	public void returnToOpportunityAfterSuccessfullyAddingOpportunity() {
		System.out.println("Test: returnToOpportunityAfterSuccessfullyAddingOpportunity ");
		
		int rand = random_no.nextInt(1000);
		String resource = "Volunter" + rand;
		String pcv =  "KeshaShah" + rand;
		submitOpportunityWith(resource,pcv, "06/11/2015", "06/28/2015", "+91-9234512345", "additonal info here");
	
		WebElement success = driver.findElement(success_page_ref.getSuccess());
		System.out.println(success.getText());	
		
		WebElement returntoops = driver.findElement(success_page_ref.getReturntoopportunity());
		returntoops.click();
		
		Assert.assertEquals(ApplicationConstants.baseUrl+ApplicationConstants.extopportunities, driver.getCurrentUrl());
	}
	
	@Test
	public void submitAnOpportunityAfterSuccessfullyAddingOpportunity() {
		System.out.println("Test: submitAnOpportunityAfterSuccessfullyAddingOpportunity ");
		
		int rand = random_no.nextInt(1000);
		String resource = "Volunter" + rand;
		String pcv =  "KeshaShah" + rand;
		submitOpportunityWith(resource,pcv, "06/11/2015", "06/28/2015", "+91-9234512345", "additonal info here");
	
		WebElement success = driver.findElement(success_page_ref.getSuccess());
		System.out.println(success.getText());	
		
		WebElement submitops = driver.findElement(success_page_ref.getSubmitopportunity());
		submitops.click();
		
		Assert.assertEquals(ApplicationConstants.baseUrl+ApplicationConstants.extopportunitiessubmit, driver.getCurrentUrl());	
	}
	
	@Test
	public void isOpportunityAddedToDatabase() {
		System.out.println("Test: isOpportunityAddedToDatabase ");
		
		int rand = random_no.nextInt(1000);
		String resource = "Volunter" + rand;
		String pcv =  "KeshaShah" + rand;
		String from = "06/11/2015";
		String until ="06/28/2015";
		String contact = "+91-9234512345";
		String addinfo = "additonal info here";
		submitOpportunityWith(resource, pcv, from, until, contact, addinfo);
	
		WebElement success = driver.findElement(success_page_ref.getSuccess());
		System.out.println(success.getText());	
		
		WebElement returntoops = driver.findElement(success_page_ref.getReturntoopportunity());
		returntoops.click();
		
		List<WebElement> rows = driver.findElements(opportunity_page_ref.getResourceAvailable());
		
		boolean found_resource = false;
		for (WebElement row: rows) {
			List<WebElement> cols = row.findElements(By.cssSelector("td"));
			found_resource = false;
			if(resource.equals(cols.get(0).getText()) && pcv.equals(cols.get(1).getText()) && until.equals(cols.get(2).getText()) && contact.equals(cols.get(3).getText()) && addinfo.equals(cols.get(4).getText()))
			{
				found_resource = true;
				break;
			}
		}
		Assert.assertEquals(true, found_resource);
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
