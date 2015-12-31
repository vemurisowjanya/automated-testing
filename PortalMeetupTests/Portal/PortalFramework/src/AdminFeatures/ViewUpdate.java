package AdminFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class ViewUpdate 
{

	public static boolean HasChangedto(String fullName)
	{
		 //Checks for updated name and validates update
		 WebElement UpdatedName=Driver.Instance.findElement(PageObjRef.UpdatedName);
		 String check=UpdatedName.getText();//getText() extracts string in upper case 
	     
		 //Validate
		  if((check).contains(fullName.toUpperCase()))
			  return true;
		  else
			  return false;
	}
	
	public static boolean BlogHasChangedto(String newBlog)
	{
		//Checks for updated blog and validates update
		WebElement UpdatedBlog=Driver.Instance.findElement(PageObjRef.UpdatedBlog);
		String check=UpdatedBlog.getText();
		
		//Validate
		if(check.contains(newBlog))
			return true;
		else
			return false;
	}

	public static boolean HomepageHasChangedto(String newHomepage)
	{
		//Checks for updated blog and validates update
		WebElement UpdatedHomepage=Driver.Instance.findElement(PageObjRef.UpdatedHomepage);
		String check=UpdatedHomepage.getText();
		
		//Validate
		if(check.contains(newHomepage))
			return true;
		else
			return false;
	}
}
