/*
 * @author Anjali
 * @since 2016-06-11
 */
package LoginAndRegistration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import PageObjectModel.constants;
import PageObjectModel.loginPageElements;
import WebDriver.driver;

public class loginCommand 
{
	private String emailId;
    private String password;
    
	public loginCommand(String emailId) 
	{
		this.emailId = emailId;
	}
	
	public loginCommand withPassword(String password) 
	{
		this.password = password;
		return this;
	}
	
	public void login()
	{
		WebElement email, passwrd, loginButton;
		email = loginPageElements.emailId();
		passwrd = loginPageElements.password();
		loginButton = loginPageElements.signInButton();
		email.clear();
		passwrd.clear();
		email.sendKeys(emailId);
		passwrd.sendKeys(password);
		loginButton.click();
		//driver.Instance.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	}

}
