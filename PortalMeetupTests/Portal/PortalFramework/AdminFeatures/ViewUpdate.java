package AdminFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class ViewUpdate 
{

	public static boolean HasChangedto(String newLastName)
	{
		 //Checks for updated name and validates update
		 WebElement UpdatedName=Driver.Instance.findElement(PageObjRef.UpdatedName);
		 String check=UpdatedName.getText();//getText() extracts string in upper case 
	     
		 //Validate
		  if((check).contains(newLastName.toUpperCase()))
			  return true;
		  else
			  return false;
	}

}
