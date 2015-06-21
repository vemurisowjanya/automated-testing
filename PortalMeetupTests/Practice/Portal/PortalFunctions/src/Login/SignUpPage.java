package Login;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class SignUpPage 
{

	static WebElement  username, Email, password, Confirmpassword, Submit;
	static WebElement signup = Driver.Instance.findElement(PageObjRef.SignUp);
	public static void GotoSignUp()
	{
	
		signup.click();
	}
	
	public static void EnterUsername(String usrname) 
	{
		//Checks if at sign up page
		if(!isAt())
			GotoSignUp();
		username=Driver.Instance.findElement(PageObjRef.SignUpUsername);
		username.clear();
		username.sendKeys(usrname);
	}

	public static void EnterEmail(String email) 
	{
		Email=Driver.Instance.findElement(PageObjRef.SignUpEmail);
		Email.clear();
		Email.sendKeys(email);
		
	}

	public static void EnterPassword(String Password) 
	{
		password=Driver.Instance.findElement(PageObjRef.SignUpPassword);
		password.clear();
		password.sendKeys(Password);
		
	}

	public static void ConfirmPassword(String confirmpassword) 
	{
		Confirmpassword=Driver.Instance.findElement(PageObjRef.SignUpConfirmPassword);
		Confirmpassword.clear();
		Confirmpassword.sendKeys(confirmpassword);
		
	}

	public static void ClickSubmit() 
	{
		Submit=Driver.Instance.findElement(PageObjRef.SignUpSubmit);
		Submit.click();
	}
	
	public static boolean isAt()
	{
		String check=signup.getText();
		if(check.equals("SIGN UP"))
			return false;
		else
			return true;
	}
	
}
