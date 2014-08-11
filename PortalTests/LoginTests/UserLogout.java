package LoginTests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;

public class UserLogout extends Helper.UserLogin{

	@Test
	public void testlogout() {
		userlogin();
		loginentry(); 
	    
		driver.findElement(By.linkText("Shwetambara Srivastava")).click();   
	    driver.findElement(Logout).click();
	    assertTrue(driver.getPageSource().contains("Are you sure you want to sign out?"));
	
	    driver.findElement(Signout).click();
	    assertEquals(driver.getCurrentUrl(), baseUrl + "/");		
	}
}
