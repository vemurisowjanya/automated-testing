package AdminTests;

import static org.junit.Assert.*;
import org.junit.Test;

public class Comments extends Helper.AdminLogin{

	@Test
	public void testComments() {
		adminlogin();
		driver.findElement(comments).click();
	    assertTrue(driver.getPageSource().contains("Comments administration"));
	}

}
