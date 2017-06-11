package Login;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class LoginPage 
{
    public static int index;
	public static void Goto() 
	{
		WebElement login=Driver.Instance.findElement(PageObjRef.Login);
        login.click();   
	}

	public static LoginCommand LoginAs(String username) 
	{
		//if not at login page, takes to login page
		if(!isAt())
			Goto();
		return new LoginCommand(username);
	}
    
	public static boolean isAt()
	{
		String check= Driver.Instance.findElement(PageObjRef.Login).getText();
	   
		if(check.equals("LOGIN"))
		  return false;
		else
			return true;
	}

}
