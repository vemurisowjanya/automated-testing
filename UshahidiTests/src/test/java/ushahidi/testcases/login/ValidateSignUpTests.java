/**
 * 
 */
package ushahidi.testcases.login;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.DateTimeAtCompleted;

import junit.framework.Assert;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ushahidi.commons.ApplicationConstants;
import ushahidi.commons.Driver;
import ushahidi.commons.LoginPageConstants;
import ushahidi.pages.loginpage.LoginPageReference;
import ushahidi.pages.loginpage.SignUpPageReference;
import ushahidi.pages.loginpage.UIPageReference;

/**
 * @author Kesha
 *
 */
public class ValidateSignUpTests {
	
	private WebDriver driver = null;
	private UIPageReference uipageref;
	private SignUpPageReference pageref;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Driver d = new Driver();
		driver = d.getInstance();
		uipageref = new UIPageReference();
		pageref = new SignUpPageReference();
	
		// Getting to the login page URL
		driver.get(ApplicationConstants.baseUrl + ApplicationConstants.extlogin);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(uipageref.getCreateAccount_xpath()).click();
	}

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
	
	@Test
	public void AllCorrectDetails() {
		System.out.println("Test: AllCorrectDetails ");
		
		// just a logic to create new login name and email each time
		DateTime dt = new DateTime();
		DateTime now = dt.now();
		String name = now.toString().replace("-", "").replace("+", "").replace(":", "");
		String email = name+"@gmail.com";   
		String password = name.substring(0,5);
		String verifypassword = name.substring(0,5);
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getSuccess()).getText();
		System.out.println("AllCorrectDetails: " + check);
		Assert.assertEquals(LoginPageConstants.signupdone, check);		
	}

	@Test
	public void NoPasswordDetails() {
		System.out.println("Test: NoPasswordDetails ");
		
		String name = "kesha123";
		String email = name+"@gmail.com";   
		String password = "";
		String verifypassword = email.substring(0,5);
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("NoPasswordDetails: " + check);
		Assert.assertEquals(LoginPageConstants.withoutpassword, check);		
	}
	
	@Test
	public void NoNameDetails() {
		System.out.println("Test: NoNameDetails ");
		
		String name = "";
		String email = "kesha12345@gmail.com";   
		String password = email.substring(0,5);
		String verifypassword = email.substring(0,5);
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("NoNameDetails: " + check);
		Assert.assertEquals(LoginPageConstants.withoutname, check);		
	}
	
	@Test
	public void NoEmailDetails() {
		System.out.println("Test: NoEmailDetails ");
		
		String name = "kesha12345";
		String email = "";   
		String password = name.substring(0,5);
		String verifypassword = name.substring(0,5);
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("NoEmailDetails: " + check);
		Assert.assertEquals(LoginPageConstants.withoutemail, check);		
	}

	@Test
	public void NoNameAndEmailDetails() {
		System.out.println("Test: NoNameAndEmailDetails ");
		
		String name = "";
		String email = "";   
		String password = "kesha123";
		String verifypassword = "kesha123";
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("NoNameAndEmailDetails: " + check);
		Assert.assertEquals(LoginPageConstants.withoutname + "\n" +LoginPageConstants.withoutemail, check);		
	}
	
	
	@Test
	public void NoPasswordandNameDetails() {
		System.out.println("Test: NoPasswordandNameDetails ");
		
		String name = "";
		String email = "kesha123@gmail.com";   
		String password = "";
		String verifypassword = "";
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("NoPasswordandNameDetails: " + check);
		Assert.assertEquals(LoginPageConstants.withoutpassword + "\n" +LoginPageConstants.withoutname, check);		
	}
	
	@Test
	public void NoPasswordAndEmailDetails() {
		System.out.println("Test: NoPasswordAndEmailDetails ");
		
		String name = "kesha123";
		String email = "";   
		String password = "";
		String verifypassword = "";
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("NoPasswordAndEmailDetails: " + check);
		Assert.assertEquals(LoginPageConstants.withoutpassword + "\n" +LoginPageConstants.withoutemail, check);		
	}
	
	@Test
	public void NoPasswordNoNameAndEmailDetails() {
		System.out.println("Test: NoPasswordNoNameAndEmailDetails ");
		
		String name = "";
		String email = "";   
		String password = "";
		String verifypassword = "";
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("NoPasswordNoNameAndEmailDetails: " + check);
		Assert.assertEquals(LoginPageConstants.withoutpassword + "\n" + LoginPageConstants.withoutname + "\n" +LoginPageConstants.withoutemail, check);		
	}
	
	@Test
	public void EmailAlreadyExists() {
		System.out.println("Test: EmailAlreadyExists ");
		
		String name = "kesha.shah1106";
		String email = name +"@gmail.com";   
		String password = name.substring(0,5);
		String verifypassword = name.substring(0,5);
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("EmailAlreadyExists: " + check);
		Assert.assertEquals(LoginPageConstants.emailexists, check);		
	}
	
	@Test
	public void EmailAlreadyExistsAndNoName() {
		System.out.println("Test: EmailAlreadyExistsAndNoName ");
		
		String name = "";
		String email = "kesha.shah1106" +"@gmail.com";   
		String password = email.substring(0,5);
		String verifypassword = email.substring(0,5);
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("EmailAlreadyExistsAndNoName: " + check);
		Assert.assertEquals(LoginPageConstants.withoutname + "\n" + LoginPageConstants.emailexists, check);		
	}
	
	@Test
	public void EmailAlreadyExistsAndNoPassword() {
		System.out.println("Test: EmailAlreadyExistsAndNoPassword ");
		
		String name = "kesha.shah1106";
		String email = name +"@gmail.com";   
		String password = "";
		String verifypassword = "";
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("EmailAlreadyExistsAndNoPassword: " + check);
		Assert.assertEquals(LoginPageConstants.withoutpassword + "\n" + LoginPageConstants.emailexists, check);		
	}
	
	@Test
	public void EmailAlreadyExistsAndNoNameNoPassword() {
		System.out.println("Test: EmailAlreadyExistsAndNoNameNoPassword ");
		
		String name = "";
		String email = "kesha.shah1106" +"@gmail.com";   
		String password = "";
		String verifypassword = "";
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("EmailAlreadyExistsAndNoNameNoPassword: " + check);
		Assert.assertEquals(LoginPageConstants.withoutpassword + "\n" + LoginPageConstants.withoutname + "\n" + LoginPageConstants.emailexists, check);		
	}
	
	@Test
	public void PasswordsNotSame() {
		System.out.println("Test: PasswordsNotSame ");
		
		// just a logic to create new login name and email each time
		DateTime dt = new DateTime();
		DateTime now = dt.now();
		String name = now.toString().replace("-", "").replace("+", "").replace(":", "");
		String email = name +"@gmail.com";   
		String password = name.substring(0,4);
		String verifypassword = name.substring(0,5);
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("PasswordsNotSame: " + check);
		Assert.assertEquals(LoginPageConstants.passwordmismatch, check);		
	}

	@Test
	public void PasswordsNotSameAndNoName() {
		System.out.println("Test: PasswordsNotSameAndNoName ");
		
		// just a logic to create new login name and email each time
		DateTime dt = new DateTime();
		DateTime now = dt.now();
		String name = "";
		String email = now.toString().replace("-", "").replace("+", "").replace(":", "") + "@gmail.com";   
		String password = email.substring(0,4);
		String verifypassword = email.substring(0,5);
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("PasswordsNotSameAndNoName: " + check);
		Assert.assertEquals(LoginPageConstants.passwordmismatch + "\n" + LoginPageConstants.withoutname, check);		
	}

	@Test
	public void PasswordsNotSameAndNoEmail() {
		System.out.println("Test: PasswordsNotSameAndNoEmail ");
		
		// just a logic to create new login name and email each time
		DateTime dt = new DateTime();
		DateTime now = dt.now();
		String name = now.toString().replace("-", "").replace("+", "").replace(":", "");
		String email = ""; 
		String password = name.substring(0,4);
		String verifypassword = name.substring(0,5);
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("PasswordsNotSameAndNoEmail: " + check);
		Assert.assertEquals(LoginPageConstants.passwordmismatch + "\n" + LoginPageConstants.withoutemail, check);		
	}
	
	@Test
	public void PasswordsNotSameAndNoNameNoEmail() {
		System.out.println("Test: PasswordsNotSameAndNoNameNoEmail ");
		
		String name = "";
		String email = ""; 
		String password = "kesha12";
		String verifypassword = "kesha123";
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("PasswordsNotSameAndNoNameNoEmail: " + check);
		Assert.assertEquals(LoginPageConstants.passwordmismatch+ "\n" + LoginPageConstants.withoutname + "\n" + LoginPageConstants.withoutemail, check);		
	}

	@Test
	public void PasswordsNotSameAndEmailExists() {
		System.out.println("Test: PasswordsNotSameAndEmailExists ");
		
		String name = "kesha.shah1106";
		String email = name + "@gmail.com";   
		String password = email.substring(0,4);
		String verifypassword = email.substring(0,5);
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("PasswordsNotSameAndEmailExists: " + check);
		Assert.assertEquals(LoginPageConstants.passwordmismatch + "\n" + LoginPageConstants.emailexists, check);		
	}
	
	@Test
	public void PasswordsNotSameNoNameAndEmailExists() {
		System.out.println("Test: PasswordsNotSameNoNameAndEmailExists ");
		
		String name = "";
		String email = "kesha.shah1106" + "@gmail.com";   
		String password = email.substring(0,4);
		String verifypassword = email.substring(0,5);
		
		createAccountWith(name, email, password, verifypassword);
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("PasswordsNotSameAndEmailExists: " + check);
		Assert.assertEquals(LoginPageConstants.passwordmismatch + "\n" + LoginPageConstants.withoutname +"\n" + LoginPageConstants.emailexists, check);		
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
