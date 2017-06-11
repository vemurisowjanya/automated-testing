package AdminFeatures;

import org.openqa.selenium.WebElement;

import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/
public class AdminPanel 
{

	public static boolean CanGotoAdminPanel()
	{
		//Select AdminPanel tab from dropdown and click on it
		WebElement Dropdown, AdminPanel;
		Dropdown= Driver.Instance.findElement(PageObjRef.AdminDropdown);
		Dropdown.click();
		AdminPanel= Driver.Instance.findElement(PageObjRef.AdminPanel);
		AdminPanel.click();
				
		//Validate
		WebElement AdminPanelCheck= Driver.Instance.findElement(PageObjRef.CheckAdminPanel);
		String check= AdminPanelCheck.getText();
	
		if((check.startsWith("Welcome"))&&(Driver.Instance.getCurrentUrl().equals(PageObjRef.baseURL+"admin/")))
			return true;
		else
			return false;
		
	}
	
}
