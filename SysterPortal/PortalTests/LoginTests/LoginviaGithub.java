package LoginTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginviaGithub extends Helper.UserLogin {

	@Test
	public void testgithub() {
		userlogin();
		driver.findElement(GithubLink).click();  
	    assertTrue(driver.getCurrentUrl().contains("https://github.com/login"));
	}

}
