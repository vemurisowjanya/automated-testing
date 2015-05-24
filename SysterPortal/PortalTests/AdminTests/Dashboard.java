package AdminTests;

import static org.junit.Assert.*;
import org.junit.Test;

public class Dashboard extends Helper.AdminLogin{

	@Test
	public void testDashboard() {
		adminlogin();
		driver.findElement(dashboard).click();	    
	    assertTrue(driver.getPageSource().contains("Dashboard administration"));
	}

}
