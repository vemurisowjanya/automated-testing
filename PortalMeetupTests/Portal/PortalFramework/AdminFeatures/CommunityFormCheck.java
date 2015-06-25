package AdminFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class CommunityFormCheck 
{

	
	/*
	 * Navigates from homepage to the community form page
	 */
	public static boolean IsForm() 
	{
		//Store the current window handle
                String oldURL = Driver.Instance.getWindowHandle();
				
 	        //Click operation
   	        Driver.Instance.findElement(PageObjRef.CommunityTab).click();
 	        Driver.Instance.findElement(PageObjRef.ChooseCommunity).click();
			    
	        //Switch to new window opened
	        for(String curURL : Driver.Instance.getWindowHandles())
  	        {
    	            Driver.Instance.switchTo().window(curURL);
	            Driver.Instance.manage().window().maximize();
 	        }
			        
   	        // Perform the check
 	        WebElement FormTitle=Driver.Instance.findElement(PageObjRef.FormTitle);
	        String check=FormTitle.getText();
			    
  	        //Close the new window
	        Driver.Instance.close();

	        //Switch back to original window
                Driver.Instance.switchTo().window(oldURL);
		        
	        if(check.equals("Anita Borg Institute Community Proposal Form"))
	        	return true;
	        else
	        	return false;
		        		
	}

}
