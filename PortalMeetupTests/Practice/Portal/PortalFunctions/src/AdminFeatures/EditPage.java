package AdminFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class EditPage 
{

	public static void Goto() 
	{
		//Find and click on edit button
		WebElement EditButton= Driver.Instance.findElement(PageObjRef.Edit);
		EditButton.click();
		
	}

	public static UpdateCommand ChangeLastnameTo(String change) 
	{
		
		return new UpdateCommand(change);
	}
	

}
