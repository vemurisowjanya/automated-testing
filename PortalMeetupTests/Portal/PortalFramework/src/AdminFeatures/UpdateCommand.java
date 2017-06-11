package AdminFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class UpdateCommand 
{

	
	private String change;

	public UpdateCommand(String change)
	{
		this.change=change;
	}

	public void Update() 
	{
	   //Find lastname
	   WebElement Lastname=	Driver.Instance.findElement(PageObjRef.Lastname);
	   Lastname.clear();
	   
	   //Enter new last name
	   Lastname.sendKeys(change);
	   
	   //Find and click submit
	   WebElement Submit=Driver.Instance.findElement(PageObjRef.Submit);
	   Submit.click();
	   
	}
	
	public void UpdateBlog()
	{
		//Find Blog
		WebElement blog = Driver.Instance.findElement(PageObjRef.Blog);
		blog.clear();
		
		//Enter new blog
		blog.sendKeys(change);
		
		//Find and click submit
		WebElement Submit=Driver.Instance.findElement(PageObjRef.Submit);
		Submit.click();
	}
	
	public void UpdateHomepage()
	{
		
		//Find Homepage
		WebElement homepage = Driver.Instance.findElement(PageObjRef.Homepage);
		homepage.clear();
		
		//Enter a new homepage
		homepage.sendKeys(change);
		
		//Find and click submit
		WebElement Submit=Driver.Instance.findElement(PageObjRef.Submit);
		Submit.click();
	}

	public void SetFirstName()
	{
		//Find first name
		WebElement firstName = Driver.Instance.findElement(PageObjRef.Firstname);
		firstName.clear();
		
		//Enter a new first name
		firstName.sendKeys(change);
	}
}
