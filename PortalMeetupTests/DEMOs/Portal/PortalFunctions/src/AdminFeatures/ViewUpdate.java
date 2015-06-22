package AdminFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class ViewUpdate 
{

	public static boolean HasChanged()
	{
		 //Checks for updated name and validates update
		 WebElement UpdatedName=Driver.Instance.findElement(PageObjRef.UpdatedName);
		 String check=UpdatedName.getText();
	
		  if(check.equals("ANJALI KUMAR"))
			  return true;
		  else
			  return false;
	}

}
