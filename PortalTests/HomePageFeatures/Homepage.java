package HomePageFeatures;

//navigate to the portal site

import static org.junit.Assert.*;
import org.junit.Test;

public class Homepage extends Helper.CommonCode {

	@Test
	public void testSysterslink() {
		driver.get(baseUrl + "/");
	    driver.findElement(SystersLink).click();
	    String str = driver.getCurrentUrl();
	    boolean content = driver.getPageSource().contains("Welcome to Systers Portal!");
	    assertEquals(baseUrl+"/",str);
	    assertTrue(content);
	}

}
