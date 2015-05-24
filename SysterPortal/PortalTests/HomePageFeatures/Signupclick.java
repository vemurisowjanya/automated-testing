package HomePageFeatures;

import static org.junit.Assert.*;
import org.junit.Test;

public class Signupclick extends Helper.CommonCode{

	@Test
	public void testSignuplink() {
		driver.get(baseUrl + "/");
	    driver.findElement(SignupLink).click();
	    assertTrue(driver.getPageSource().contains("Already have an account?"));
	    assertEquals(driver.getCurrentUrl(), baseUrl + "/accounts/signup/");
	}
}
