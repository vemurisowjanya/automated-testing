package Login;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class SignUpCheck
{

	//Validates sign up
	public static boolean HasSignedUp() 
	{
		String check=Driver.Instance.getCurrentUrl();
	
		if(check.equals(PageObjRef.baseURL+"accounts/signup/"))
			return false;
		else
			return true;
		
	}

}
