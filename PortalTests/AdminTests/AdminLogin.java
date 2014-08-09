package AdminTests;

import static org.junit.Assert.*;
import org.junit.Test;

public class AdminLogin extends Helper.AdminLogin{

	@Test
	public void testadminlogin() {
		
		adminlogin();
		assertTrue(driver.getPageSource().contains("Site administration"));
	}

}
