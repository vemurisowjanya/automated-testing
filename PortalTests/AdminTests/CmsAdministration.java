package AdminTests;

import static org.junit.Assert.*;
import org.junit.Test;

public class CmsAdministration extends Helper.AdminLogin{
	
	@Test
	public void testCms() {
		adminlogin();
		driver.findElement(cms).click();
	    assertTrue(driver.getPageSource().contains("Cms administration"));
	
	}

}
