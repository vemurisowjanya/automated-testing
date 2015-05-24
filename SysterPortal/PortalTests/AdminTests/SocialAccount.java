package AdminTests;

import static org.junit.Assert.*;
import org.junit.Test;

public class SocialAccount extends Helper.AdminLogin{

	@Test
	public void testSocialAccount() {
		adminlogin();
		driver.findElement(socialaccount).click();    
	    assertTrue(driver.getPageSource().contains("Socialaccount administration"));	
	}

}
