package AdminTests;

import static org.junit.Assert.*;
import org.junit.Test;

public class ChangePassword extends Helper.AdminLogin {

	 @Test
	  public void testchangepassword() throws Exception {
		String pwd="portal";
		 adminlogin();
	    driver.findElement(ChangePass).click();
	    driver.findElement(oldPassword).clear();
	    driver.findElement(oldPassword).sendKeys(pwd);
	    driver.findElement(newPassword1).clear();
	    driver.findElement(newPassword1).sendKeys(pwd);
	    driver.findElement(newPassword2).clear();
	    driver.findElement(newPassword2).sendKeys(pwd);
	    driver.findElement(changeButton).click();
	    
	    assertTrue(driver.getPageSource().contains("Password change successful"));
	  }

}
