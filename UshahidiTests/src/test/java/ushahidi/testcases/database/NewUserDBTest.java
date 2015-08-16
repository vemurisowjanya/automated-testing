/**
 * 
 */
package ushahidi.testcases.database;

import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
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
import ushahidi.database.ConnectToDB;
import ushahidi.database.Crud;
import ushahidi.pages.loginpage.SignUpPageReference;
import ushahidi.pages.loginpage.UIPageReference;

/**
 * @author Kesha
 *
 */

/*
 * To maintain order execution of test, i.e, create will happen first n deletion at last. FixedMethodOrder is used
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewUserDBTest {

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

	private WebDriver driver = null;
	private UIPageReference uipageref;
	private SignUpPageReference pageref;

	private String name = "Test";
	private String email = "test@gmail.com";
			
	private void createAccountWith(String name, String email, String password, String verifypassword)
	{
		// Entering user name
		WebElement username_element = driver.findElement(pageref.getName());
		username_element.sendKeys(name);
		
		// Entering user email
		WebElement email_element = driver.findElement(pageref.getEmail());
		email_element.sendKeys(email);
		
		// Entering password
		WebElement password_element = driver.findElement(pageref.getPassword());
		password_element.sendKeys(password);
		
		//Entering verify password
		WebElement verify_element = driver.findElement(pageref.getVerifyPassword());
		verify_element.sendKeys(verifypassword);
		
		// Clicking on the signup button
		WebElement signup = driver.findElement(pageref.getSignUpBtn());
		signup.submit();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void TestA_createNewUser() {
		Driver d = new Driver();
		driver = d.getInstance();
		uipageref = new UIPageReference();
		pageref = new SignUpPageReference();
	
		// Getting to the login page URL
		driver.get(ApplicationConstants.baseUrl + ApplicationConstants.extlogin);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(uipageref.getCreateAccount_xpath()).click();

		createAccountWith(name, email, "password" , "password");
		String check = driver.findElement(pageref.getSuccess()).getText();
		System.out.println("TestA_createNewUser: \n" + check);
		Assert.assertEquals(LoginPageConstants.signupdone, check);
		driver.quit();
	}

	@Test
	public void TestB_checkDBforNewUserName() {
		System.out.println("TestB_checkDBforNewUserName");
		
		String query = " select name from users where name like'" + name + "'";
		try {
			boolean q = Crud.CanRead(query);
			System.out.println("New User Name found:" + q);
			assertEquals(true, q);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TestC_checkDBforNewUserEmail() {
		System.out.println("TestC_checkDBforNewUserEmail");
		
		String query = " select email from users where email like'" + email + "'";
		try {
			boolean q = Crud.CanRead(query);
			System.out.println("New User Email found:" + q);
			assertEquals(true, q);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestD_deleteDBforNewUser() {
		System.out.println("TestD_deleteDBforNewUser");
		
		String query = " delete from users where email like'" + email + "'";
		try {
			boolean q = Crud.CanDelete(query);
			System.out.println("Can delete new user: "+ q);
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
