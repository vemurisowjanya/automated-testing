/**
 * This class tests the Important Details link found on the MACC's footer.
 * 
 * @author Daisy Nkweteyim
 */

package home_page_features;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ImportantDetails extends common.CommonCode {

	@Test
	public void ImportantDetailsTest() {
		
		//important details
		driver.findElement(By.xpath("html/body/div[3]/div/font/a[3]")).click();
		String actualURL= driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/details/", actualURL);
	}

}

