package Login;
import org.openqa.selenium.WebElement;
import WebDriver.Driver;
import WebElements.PageObjModel;


/*
 * @author Anjali
 */
public class LoginCommand 
{

	private String username, password;
	
	public LoginCommand(String username)
	{
		this.username=username;
	}

	public LoginCommand WithPassword(String password)
	{
	    this.password=password;
	    return this;
	}

	//Log in with passed username and password
	public void Login() 
	{
		WebElement usrname=Driver.Instance.findElement(PageObjModel.username);
		usrname.clear();
		usrname.sendKeys(username);
		WebElement passwrd=Driver.Instance.findElement(PageObjModel.password);
		passwrd.clear();
		passwrd.sendKeys(password);
		WebElement signIn=Driver.Instance.findElement(PageObjModel.SignIn);
		signIn.click();
	}
	
	

}
