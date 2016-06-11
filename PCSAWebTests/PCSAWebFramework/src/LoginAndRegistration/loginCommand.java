/*
 * @author Anjali
 * @since 2016-06-11
 */
package LoginAndRegistration;

import org.openqa.selenium.WebElement;
import PageObjectModel.loginPageElements;

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
	}

}
