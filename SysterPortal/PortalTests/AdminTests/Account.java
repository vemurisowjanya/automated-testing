package AdminTests;

import static org.junit.Assert.*;
import org.junit.Test;

public class Account extends Helper.AdminLogin{

	@Test
	public void testAccount() {
		adminlogin();
		driver.findElement(account).click();
	    assertTrue(driver.getPageSource().contains("Account administration")); 
	}

}
