package AdminTests;

import static org.junit.Assert.*;
import org.junit.Test;

public class AdminLogout extends Helper.AdminLogin{

	@Test
	public void testadminlogout() {
		
		adminlogin();
		driver.findElement(logout).click();
	    assertTrue(driver.getPageSource().contains("Logged out"));
	    assertTrue(driver.getPageSource().contains("Thanks for spending some quality time with the Web site today."));
	      
	}

}
