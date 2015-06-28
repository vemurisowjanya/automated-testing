package Login;
import org.openqa.selenium.WebElement;
import WebDriver.Driver;
import WebElements.PageObjModel;


/*
 * @author Anjali
 */
public class LoginPage
{
    //Takes to the log in page
	public static void Goto()
	{
		WebElement Login=Driver.Instance.findElement(PageObjModel.Login);
		Login.click();
		
	}

	public static LoginCommand LoginAs(String username) 
	{
		return new LoginCommand(username);
	}

}
