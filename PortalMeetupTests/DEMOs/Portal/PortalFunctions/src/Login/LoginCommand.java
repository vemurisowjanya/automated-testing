package Login;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class LoginCommand 
{
	private String username;
	private String password;

	public LoginCommand(String username) 
	{
		this.username = username;

	}
	public LoginCommand WithPassword(String password)
	{
		this.password=password;
		return this;
	}
	
	public void Login() 
	{
		
		
	    WebElement usrname=Driver.Instance.findElement(PageObjRef.username);
		usrname.clear();
		usrname.sendKeys(username);
		WebElement passwrd=Driver.Instance.findElement(PageObjRef.password);
		passwrd.clear();
		passwrd.sendKeys(password);
		WebElement signIn=Driver.Instance.findElement(PageObjRef.SignIn);
		signIn.click();
	}
	
	public static void GoogleLogin()
	{
		Driver.Instance.findElement(PageObjRef.Google).click();
	}
	public static void FacebookLogin() 
	{
		Driver.Instance.findElement(PageObjRef.Facebook).click();
		
	}
	public static void TwitterLogin() 
	{
		Driver.Instance.findElement(PageObjRef.Twitter).click();
		
	}
	public static void GithubLogin() 
	{
		Driver.Instance.findElement(PageObjRef.Github).click();
	}
	
}
