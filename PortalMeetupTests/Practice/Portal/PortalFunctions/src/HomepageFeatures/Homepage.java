package HomepageFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class Homepage 
{
    static String URL;
    static WebElement ReadMore;
    
    public static void Goto()
    {
    	Driver.Instance.get(PageObjRef.baseURL);
		
	}
    //Validates against url.
	public static boolean IsAtSystersCommunitiesPage() 
	{
	    ReadMore=Driver.Instance.findElement(PageObjRef.ReadMore1);
		ReadMore.click();
		
		for(String curURL : Driver.Instance.getWindowHandles())
	    {
	        Driver.Instance.switchTo().window(curURL);
	    }
		
		URL=Driver.Instance.getCurrentUrl();
		System.out.println(URL);
		
		if(URL.equals("http://anitaborg.org/get-involved/systers/"))
		   return true;
		else
			return false;
	}
	
	//Validates against url.
	public static boolean IsAtSystersCRAWPage() 
	{
	    ReadMore=Driver.Instance.findElement(PageObjRef.ReadMore2);
		ReadMore.click();
		
		for(String curURL : Driver.Instance.getWindowHandles())
	    {
	        Driver.Instance.switchTo().window(curURL);
	    }
		
		URL=Driver.Instance.getCurrentUrl();
		System.out.println(URL);
		
		if(URL.equals("http://anitaborg.org/get-involved/systers/systers-co-sponsored-cra-w-lists/"))
		   return true;
		else
			return false;
	}
	
	//Validates against url.
	public static boolean IsAtSystersInitiativesPage() 
	{
		ReadMore=Driver.Instance.findElement(PageObjRef.ReadMore3);
		ReadMore.click();
			
		for(String curURL : Driver.Instance.getWindowHandles())
	    {	
			Driver.Instance.switchTo().window(curURL);
	    }
			
		URL=Driver.Instance.getCurrentUrl();
		System.out.println(URL);
			
		if(URL.equals("http://anitaborg.org/get-involved/systers/systers-initiatives/"))
			 return true;
		else
			 return false;
	}
	
	 //Validates against url.
	public static Object IsAtSystersTechnicalInitiativePage() 
	{
		ReadMore=Driver.Instance.findElement(PageObjRef.ReadMore4);
		ReadMore.click();
			
		for(String curURL : Driver.Instance.getWindowHandles())
	    {	
			Driver.Instance.switchTo().window(curURL);
	    }
			
		URL=Driver.Instance.getCurrentUrl();
		System.out.println(URL);
			
		if(URL.equals("http://anitaborg.org/get-involved/systers/technical-interests/"))
			 return true;
		else
			 return false;
		
	}
	

}
