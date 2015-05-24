package AdminTests;

import static org.junit.Assert.*;
import org.junit.Test;

public class Auth extends Helper.AdminLogin{

	@Test
	public void testAuth() {
		adminlogin();
		driver.findElement(auth).click();
	    assertTrue(driver.getPageSource().contains("Auth administration"));
	}

}
