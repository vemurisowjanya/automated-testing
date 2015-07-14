/**
 * The dashboard test
 * 
 * @author Daisy Nkweteyim
 */

package home_page_features;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class Home_Page_Malaria extends common.CommonCode {
	
	private String expectedTitle; 
		
	@Test
	public void DashboardTest() {
		expectedTitle = "Dashboard";

		driver.get(baseURL);
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		Assert.assertTrue("Expected value is not the same as the actual value.",
				expectedTitle.equals(actualTitle));
		
		//MACC NavBar print
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/a/h1")).click();
		
		//MACC NavBar icon
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/a/img")).click();
		
		//Malaria link
		driver.findElement(By.xpath
				("html/body/div[2]/div[1]/div/center/h2/a/font/u")).click(); //get both button and underlined
			
	}
	
}