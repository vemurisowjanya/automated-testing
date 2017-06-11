package CommunityAdminPageFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;


/*
 * @author Anjali
 */
public class CommunityNewsActions extends CommunityAdminLogin
{

	private static void GotoNews() 
	{
		WebElement News= Driver.Instance.findElement(PageObjRef.News);
		News.click();	
	}

	public static boolean CanAddNews(String title, String newsSlug, String newsContent) 
	{
		WebElement AddNews, Title, Slug, Content, submit;
		
		//Login and goto news Page
		login();
		GotoNews();
		
		//Select Add news
		AddNews= Driver.Instance.findElement(PageObjRef.AddNews);
		AddNews.click();
		
		//Enter Details
		Title= Driver.Instance.findElement(PageObjRef.NewsTitle);
		Slug= Driver.Instance.findElement(PageObjRef.NewsSlug);
		Content= Driver.Instance.findElement(PageObjRef.NewsContent);
		Title.sendKeys(title);
		Slug.sendKeys(newsSlug);
		
		//Switch to Content frame and enter content
		Driver.Instance.switchTo().frame(Content);
		Driver.Instance.switchTo().activeElement().sendKeys(newsContent);
		Driver.Instance.switchTo().defaultContent();

		
		//Click save
		submit= Driver.Instance.findElement(PageObjRef.NewsSubmit);
		submit.click();
		
		//Validate
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/news/"+newsSlug+"/"))
		  return true;
		else 
		 return false;
	}

	public static void GotoEditCurrentNews()
	{
		//Login and goto news Page
		login();
		GotoNews();
		
		//Select news to be edited
		WebElement SelectNews= Driver.Instance.findElement(PageObjRef.NewsTobeEdited);
		SelectNews.click();
		
		//Click Edit current news
		Driver.Instance.findElement(PageObjRef.EditCurrentNews).click();
		
	}

	public static boolean HasTheNewsTitleChangedTo(String newTitle)
	{
		//Goto to edit news page
		GotoEditCurrentNews();
		
		//Select news title and enter new title
		Driver.Instance.findElement(PageObjRef.NewsTitle).clear();
		Driver.Instance.findElement(PageObjRef.NewsTitle).sendKeys(newTitle);
		
		//Click Submit
		WebElement submit= Driver.Instance.findElement(PageObjRef.NewsSubmit);
		submit.click();
		
		//Validate new news title
		String str_check=Driver.Instance.findElement(PageObjRef.UpdatedNewsTilte).getText();
		
		if(str_check.equals(newTitle))
			return true;
		else
			return false;
	}

	public static boolean HasCurrentNewsBeenDeleted()
	{
		//Login and goto news Page
		login();
		GotoNews();
		
		//Select news to be deleted
		WebElement SelectNews= Driver.Instance.findElement(PageObjRef.NewsTobeDeleted);
		SelectNews.click();
				
		//click delete current news and confirm
		WebElement DeleteNews=Driver.Instance.findElement(PageObjRef.DeleteCurrentAddNews);
		DeleteNews.click();
		WebElement Confirm =Driver.Instance.findElement(PageObjRef.ConfirmNewsDelete);
		Confirm.click();
		
		//Validate
	   if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/news/"))
		   return true;
	   else
		   return false;
	}
	
}
