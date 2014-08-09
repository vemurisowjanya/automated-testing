package HomePageFeatures;

// click on the wiki option on the navigation bar

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class Wiki extends Helper.CommonCode{

	@Test
	public void testWikiLink() {
		driver.get(baseUrl + "/");
	    driver.findElement(By.linkText("Wiki")).click();
	    assertEquals(driver.getCurrentUrl(), "http://systers.org/systers-dev/doku.php");
	    assertEquals(driver.getTitle(),"start [ Systers-Dev Wiki]");
	
	}

}
