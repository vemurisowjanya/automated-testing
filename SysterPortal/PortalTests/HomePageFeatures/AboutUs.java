package HomePageFeatures;

//click About Us option
// not feature not working currently so can't be tested and this is an assumed test

import static org.junit.Assert.*;
import org.junit.Test;

public class AboutUs extends Helper.CommonCode {

	@Test
	public void testAboutuslink(){
	    driver.get(baseUrl + "/");
	    driver.findElement(AboutLink).click();
	    assertTrue(driver.getPageSource().contains("About Systers"));
	    
	  }

}
