package HomePageFeatures;

import static org.junit.Assert.*;

import org.junit.Test;

public class Loginclick extends Helper.CommonCode{

	@Test
	public void testloginlink() {
		driver.get(baseUrl + "/");
	    driver.findElement(LoginLink).click();
	    assertTrue(driver.getPageSource().contains("Please sign in "));
	    assertEquals(driver.getCurrentUrl(), baseUrl + "/accounts/login/");
	}

}
