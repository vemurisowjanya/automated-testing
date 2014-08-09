package LoginTests;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginviaGoogle  extends Helper.UserLogin{

	@Test
	public void testGoogle() {
		
		userlogin();
		driver.findElement(GoogleLink).click();
		boolean b = driver.getCurrentUrl().contains("https://accounts.google.com/ServiceLogin");
		assertTrue(b);
	
	}

}
