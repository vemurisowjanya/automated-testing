package AdminTests;

import static org.junit.Assert.*;
import org.junit.Test;

public class SitesAdmin extends Helper.AdminLogin{
	
	@Test
	public void testSites() { 
		adminlogin();
		driver.findElement(sites).click();
	    assertTrue(driver.getPageSource().contains("Sites administration"));
	}

}
