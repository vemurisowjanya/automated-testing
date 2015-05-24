package LoginTests;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginonPortal extends Helper.LoginParameters{

	
	public LoginonPortal(String username, String password, int index) {
		super(username, password, index);
		// TODO Auto-generated constructor stub
	}

	public void loginform(){
		driver.findElement(login_id).clear();
	    driver.findElement(login_id).sendKeys(username);
	    driver.findElement(login_pass).clear();
	    driver.findElement(login_pass).sendKeys(password);
	    driver.findElement(signInbutton).click();
	}
	@Test
	public void testlogin() {
		
		userlogin();
		loginform();
	    driver.findElement(login_id).clear();
	    driver.findElement(login_id).sendKeys(username);
	    driver.findElement(login_pass).clear();
	    driver.findElement(login_pass).sendKeys(password);
	    driver.findElement(signInbutton).click();
	    
	    switch (index) {
	    case 1: 
	    	assertTrue(driver.getPageSource().contains("This field is required."));
	    	break;
	    	
	    case 2:
	    	assertTrue(driver.getPageSource().contains("This field is required."));
    	break;
    	
	    case 3: 
	    	assertTrue(driver.getPageSource().contains("This field is required."));
	    	break;
	    	
	    case 4 : 
	    	assertTrue(driver.getPageSource().contains("The username and/or password you specified are not correct."));
	    	break;
	    	
	    case 5: 
	    	assertEquals(driver.getCurrentUrl(), baseUrl + "/users/" + username + "/");
	    }
	}

}
