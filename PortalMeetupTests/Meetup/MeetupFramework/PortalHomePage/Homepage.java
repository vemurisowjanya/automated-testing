package PortalHomePage;
import WebDriver.Driver;
import WebElements.PageObjModel;

/*
 * @author Anjali
 */

/*
 * Takes to portal homepage
 */
public class Homepage 
{

	public static void Goto() 
	{
	   Driver.Instance.get(PageObjModel.baseURL);
	}

}
