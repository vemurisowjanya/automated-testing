/**
 * 
 */
package ushahidi.testcases.database;

import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ushahidi.commons.ApplicationConstants;
import ushahidi.commons.Driver;
import ushahidi.commons.LoginPageConstants;
import ushahidi.commons.OpportunitiesPageConstants;
import ushahidi.database.ConnectToDB;
import ushahidi.database.Crud;
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

/*
 * To maintain order execution of test, i.e, create will happen first n deletion at last. FixedMethodOrder is used
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OpportunityDBTest {

	private WebDriver driver = null;
	private OpportunitiesPageReference opportunity_page_ref;
	private SubmitOpportunityPageReference submit_page_ref;
	private LoginPageReference login_page_ref;
	private MenubarPageReference menu_page_ref;
	private SuccessOpportunityPageReference success_page_ref;
	
	private String resourceAvailable = "Volunteers";
	private String pCVName = "Kesha Shah";
	private String availableFrom = "06/11/2015"; //mm/dd/yyyy
	private String availableUntil = "06/28/2015"; //mm/dd/yyyy
	private String bestWayToContact = "+91-9234512345";
	private String additionalInfo= "Just another test";
	
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

	private void submitOpportunityWith(String resourceAvailable, String pCVName, String availableFrom, String availableUntil, String bestWayToContact, String additionalInfo)
	{
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		// submit on submit an opportunity
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
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		try 
		{
			ConnectToDB.Initialize();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void TestA_createNewOpportunity() {
		Driver d = new Driver();
		driver = d.getInstance();
		submit_page_ref = new SubmitOpportunityPageReference();
		login_page_ref = new LoginPageReference();
		menu_page_ref = new MenubarPageReference();
		opportunity_page_ref = new OpportunitiesPageReference();
		success_page_ref = new SuccessOpportunityPageReference();
		
		// Getting to the login page URL
		driver.get(ApplicationConstants.baseUrl + ApplicationConstants.extlogin);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// enter login details
		try {
			loginWith("kesha.shah1106@gmail.com", "abc123");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// submit on opportunities tab
		WebElement opportunity_menu = driver.findElement(menu_page_ref.getOpportunity());
		opportunity_menu.click();

		submitOpportunityWith(resourceAvailable, pCVName, availableFrom, availableUntil, bestWayToContact, additionalInfo);		
		
		WebElement success = driver.findElement(success_page_ref.getSuccess());
		
		String check = success.getText();
		System.out.println("TestA_createNewOpportunity: \n" + check);
		Assert.assertEquals(OpportunitiesPageConstants.successfulopportunity, check);
		driver.close();
	}

	@Test
	public void TestB_checkDBforResourceAvailable() {
		System.out.println("TestB_checkDBforNewUserName");
		
		String query = "select resource_available from opportunities where resource_available like'" + resourceAvailable + "'";
		try {
			boolean q = Crud.CanRead(query);
			System.out.println("Resource Available found:" + q);
			assertEquals(true, q);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TestC_checkDBforPCVName() {
		System.out.println("TestC_checkDBforPCVName");
		
		String query = "select pcv_name from opportunities where pcv_name like'" + pCVName + "'";
		try {
			boolean q = Crud.CanRead(query);
			System.out.println("PCV Name found:" + q);
			assertEquals(true, q);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestD_checkDBforAvailableFrom() {
		System.out.println("TestD_checkDBforAvailableFrom");
		
		String query = "select available_from from opportunities where available_from like'" + availableFrom + "'";
		try {
			boolean q = Crud.CanRead(query);
			System.out.println("AvailableFrom found: "+ q);
			assertEquals(true, q);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void TestE_checkDBforAvailableUntil() {
		System.out.println("TestE_checkDBforAvailableUntil");
		
		String query = "select available_until from opportunities where available_until like'" + availableUntil + "'";
		try {
			boolean q = Crud.CanRead(query);
			System.out.println("AvailableUntil found: "+ q);
			assertEquals(true, q);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void TestF_checkDBforContact() {
		System.out.println("TestF_checkDBforContact");
		
		String query = "select contact from opportunities where contact like'" + bestWayToContact + "'";
		try {
			boolean q = Crud.CanRead(query);
			System.out.println("Contact best way found: "+ q);
			assertEquals(true, q);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void TestG_checkDBforAdditionalInfo() {
		System.out.println("TestG_checkDBforAdditionalInfo");
		
		String query = "select add_info from opportunities where add_info like'" + additionalInfo + "'";
		try {
			boolean q = Crud.CanRead(query);
			System.out.println("Additional Information found: "+ q);
			assertEquals(true, q);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void TestH_checkDBforEntireOpportunity() {
		System.out.println("TestH_checkDBforEntireOpportunity");
		
		String query = "select * from opportunities where resource_available like '" 
						+ resourceAvailable + "' and pcv_name like '" + pCVName + 
						"' and available_from like '" + availableFrom + 
						"' and available_until like '" + availableUntil +
						"' and contact like '" + bestWayToContact +
						"' and add_info like '" + additionalInfo + "'";
		try {
			boolean q = Crud.CanRead(query);
			System.out.println("Entire Opportunity found: "+ q);
			assertEquals(true, q);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void TestI_deleteDBforEntireOpportunity() {
		System.out.println("TestI_deleteDBforEntireOpportunity");
		
		String query = "delete from opportunities where resource_available like '" 
						+ resourceAvailable + "' and pcv_name like '" + pCVName + 
						"' and available_from like '" + availableFrom + 
						"' and available_until like '" + availableUntil +
						"' and contact like '" + bestWayToContact +
						"' and add_info like '" + additionalInfo + "'";
		try {
			boolean q = Crud.CanDelete(query);
			System.out.println("Can delete entire opportunity: "+ q);
			assertEquals(true, q);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		try 
		{
			ConnectToDB.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
