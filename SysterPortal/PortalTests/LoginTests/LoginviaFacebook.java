package LoginTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginviaFacebook extends Helper.UserLogin{

	@Test
	public void testFacebook() {
		userlogin();
		driver.findElement(FacebookLink).click();
	    assertTrue(driver.getCurrentUrl().contains("https://www.facebook.com/login.php"));
	}

}
