package HomepageFeatures;
import org.openqa.selenium.WebElement;

import Login.SignUpPage;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class Homepage 
{
    static String URL;
    static WebElement ReadMore;
    static WebElement JoinSysters, Wiki, Contact, AboutUs;
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
	
	public static boolean IsAtJoinSysters()
	{
		JoinSysters=Driver.Instance.findElement(PageObjRef.JoinSysters);
		JoinSysters.click();
		
		//Validate Navigation
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"accounts/signup/"))
		    return true;
		else
			return false;

	}
	public static boolean IsAtAboutUs() 
	{
		AboutUs=Driver.Instance.findElement(PageObjRef.AboutUs);
		AboutUs.click();
		
		//Validate Navigation
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"about-us/"))
		    return true;
		else
			return false;
	}
	public static boolean IsAtWiki()
	{
		Wiki=Driver.Instance.findElement(PageObjRef.Wiki);
		Wiki.click();
	
		//Validate Navigation
		for(String curURL : Driver.Instance.getWindowHandles())
	    {
	        Driver.Instance.switchTo().window(curURL);
	    }
		
		URL=Driver.Instance.getCurrentUrl();
		
		System.out.println(URL);
		if(URL.equals("http://systers.org/systers-dev/doku.php"))
		   return true;
		else
			return false;
		
		
	}
	public static Object IsAtContact()
	{
		Contact=Driver.Instance.findElement(PageObjRef.Contact);
		Contact.click();
		
		//Validate Navigation
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"contact/"))
		    return true;
		else
			return false;
	}
	

}
