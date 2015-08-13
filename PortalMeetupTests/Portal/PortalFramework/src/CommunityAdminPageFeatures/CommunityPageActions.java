package CommunityAdminPageFeatures;

import org.openqa.selenium.WebElement;

import PageElements.PageObjRef;
import WebDriver.Driver;


/*
 * @author Anjali
 */

public class CommunityPageActions extends CommunityAdminLogin
{

	public static boolean CanAddPage(String title, String pageSlug, String pageContent, String pageOrder) 
	{
		//Login as admin and goto community page
		login();
		
        WebElement AddPage, Title, Slug, Content,Order, submit;
		
		//Select Add Page
		AddPage= Driver.Instance.findElement(PageObjRef.AddPage);
		AddPage.click();
		
		//Enter Details
		Title= Driver.Instance.findElement(PageObjRef.PageTitle);
		Slug= Driver.Instance.findElement(PageObjRef.PageSlug);
		Content= Driver.Instance.findElement(PageObjRef.PageContent);
		Order= Driver.Instance.findElement(PageObjRef.PageOrder);
		Title.sendKeys(title);
		Slug.sendKeys(pageSlug);
		Order.sendKeys(pageOrder);
		
		//Switch to Content frame and enter content
		Driver.Instance.switchTo().frame(Content);
	    Driver.Instance.switchTo().activeElement().sendKeys(pageContent);
		Driver.Instance.switchTo().defaultContent();

		//Click save
		submit= Driver.Instance.findElement(PageObjRef.ResourceSubmit);
		submit.click();
				
		//Validate
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/p/"+pageSlug+"/"))
     		  return true;
		else 
	   		  return false;
		
	}

	public static boolean HasThePageTitleChangedTo(String title) 
	{
		//Login as admin and goto community page
		login();
		
		//Select Edit current page
		WebElement Edit= Driver.Instance.findElement(PageObjRef.EditCurrentPage);
		Edit.click();
		
		//Update Title
		WebElement Title= Driver.Instance.findElement(PageObjRef.PageTitle);
		Title.clear();
		Title.sendKeys(title);
		
		//Submit
		
		WebElement Submit= Driver.Instance.findElement(PageObjRef.PageSubmit);
		Submit.click();
		
		//Validate
		String UpdatedTitle = Driver.Instance.findElement(PageObjRef.CreatedPageTitle).getText();
		System.out.println(UpdatedTitle);
		
		if(UpdatedTitle.equals(title))
			return true;
		else
			return false;
	}

	public static boolean HasCurrentPageBeenDeleted() 
	{
		//Login as admin and goto community page
		login();
		
		//click delete current page and confirm
		WebElement DeletePage=Driver.Instance.findElement(PageObjRef.DeleteCurrentPage);
		DeletePage.click();
		WebElement Confirm =Driver.Instance.findElement(PageObjRef.ConfirmPageDelete);
		Confirm.click();
				
		//Validate
	   if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/news/"))
		   return true;
	   else
		   return false;
	}

}
