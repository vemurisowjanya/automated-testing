package Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class LoggedInCheck 
{
    
	public static boolean IsAt() 
	{
		//Checks log in by validating against url.
		String URL=Driver.Instance.getCurrentUrl();
		String check= Driver.Instance.findElement(PageObjRef.LoginCheck).getText();
		
    
		if((!(URL.equals(PageObjRef.baseURL+"accounts/login/")))&&(check.startsWith("Successfully")))
		   return true;
		else
		   return false;
		
	}

	//Validates facebook login page
	public static boolean IsAtFacebookLogin()
	{
		if(Driver.Instance.getCurrentUrl().contains("https://www.facebook.com/login.php"))
		   return true;
		else
		   return false;
	}

	//Validates github login page
	public static boolean IsAtGitHUbLogin() 
	{
		if(Driver.Instance.getCurrentUrl().contains("https://github.com/login"))
		   return true;
		else
		   return false;
	}

	//Validates Google login page
	public static boolean IsAtGoogleLogin() 
	{

		if(Driver.Instance.getCurrentUrl().contains("https://accounts.google.com/ServiceLogin"))
		   return true;
		else
		   return false;
	}

	//Validates Twitter login page
	public static boolean IsAtTwitterLogin() 
	{
		if(Driver.Instance.getCurrentUrl().contains("https://twitter.com/login/"))
		   return true;
		else
		   return false;
	}

}
