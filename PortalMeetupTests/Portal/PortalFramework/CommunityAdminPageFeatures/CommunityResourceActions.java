package CommunityAdminPageFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
 * @author Anjali
 */
public class CommunityResourceActions extends CommunityAdminLogin
{
	private static void GotoResource() 
	{
		WebElement Resource= Driver.Instance.findElement(PageObjRef.Resources);
		Resource.click();	
	}

	public static void GotoEditCurrentResource()
	{
		//Login and goto resource Page
		login();
		GotoResource();
		
		//Select resource to be edited
		WebElement SelectResource= Driver.Instance.findElement(PageObjRef.ResourceTobeEdited);
		SelectResource.click();
		
		//Click Edit current resource
		Driver.Instance.findElement(PageObjRef.EditCurrentResource).click();
		
	}
	
	public static boolean CanAddResource(String title, String resourceSlug, String resourceContent) 
	{
		//Login and goto resource
		login();
		GotoResource();
		
		WebElement AddResource, Title, Slug, Content, submit;
		
		//Select Add resource
		AddResource= Driver.Instance.findElement(PageObjRef.AddResource);
		AddResource.click();
		
		//Enter Details
		Title= Driver.Instance.findElement(PageObjRef.ResourceTitle);
		Slug= Driver.Instance.findElement(PageObjRef.ResourceSlug);
		Content= Driver.Instance.findElement(PageObjRef.ResourceContent);
		Title.sendKeys(title);
		Slug.sendKeys(resourceSlug);
				
		//Switch to Content frame and enter content
		Driver.Instance.switchTo().frame(Content);
	        Driver.Instance.switchTo().activeElement().sendKeys(resourceContent);
		Driver.Instance.switchTo().defaultContent();

		//Click save
		submit= Driver.Instance.findElement(PageObjRef.ResourceSubmit);
		submit.click();
				
		//Validate
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/resources/"+resourceSlug+"/"))
     		    return true;
		else 
	            return false;
		
	}

	public static boolean HasTheResourceTitleChangedTo(String title) 
	{
		//Login and goto edit resource Page
		GotoEditCurrentResource();
		
		//Select resource title and enter new title
		Driver.Instance.findElement(PageObjRef.ResourceTitle).clear();
		Driver.Instance.findElement(PageObjRef.ResourceTitle).sendKeys(title);
		
		//Click Submit
		WebElement submit= Driver.Instance.findElement(PageObjRef.ResourceSubmit);
		submit.click();
		
		//Validate new resource title
		String str_check=Driver.Instance.findElement(PageObjRef.UpdatedResourceTitle).getText();
		
		if(str_check.equals(title))
			return true;
		else
			return false;
	}
	
	public static boolean HasCurrentResourceBeenDeleted()
	{
		//Login and goto resource Page
		login();
		GotoResource();
		
		//Select resource to be deleted
		WebElement SelectResource= Driver.Instance.findElement(PageObjRef.ResourceTobeDeleted);
		SelectResource.click();
				
		//click delete current resource and confirm
		WebElement DeleteNews=Driver.Instance.findElement(PageObjRef.DeleteCurrentResource);
		DeleteNews.click();
		WebElement Confirm =Driver.Instance.findElement(PageObjRef.ConfirmResourceDelete);
		Confirm.click();
		
		//Validate
	        if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/resources/"))
		   return true;
	        else
		   return false;
	}

}
