package CommunityAdminPageFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
 * @author Anjali
 */
public class CommunityUpdateCommand
{

	//for new name passed
	private static String change;
	
	//setting new name
	public CommunityUpdateCommand(String change) 
	{
		this.change=change;
	}
	
	//Update name
	public static void Update()
	{
		//Finding new name and entering new name
		WebElement CommunityName= Driver.Instance.findElement(PageObjRef.CommunityName);
		CommunityName.clear();
		CommunityName.sendKeys(change);
		
		//Clicking save
		WebElement submit=Driver.Instance.findElement(PageObjRef.CommunityEditSubmit);
		submit.click();
	}

	//Validating update by checking against new name
	public static boolean HasChanged() 
	{
		//Getting new name
		WebElement NewName=Driver.Instance.findElement(PageObjRef.NewCommunityName);
		
		//Validate
		if((NewName.getText()).equals(change))
			return true;
		else
			return false;
		
	}

}
