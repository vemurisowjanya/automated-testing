package Helper;

import org.openqa.selenium.*;

public class logindetails extends testdata {

	public void login() {
   
	driver.get(baseUrl);
    driver.findElement(By.id("focus__this")).click();
    driver.findElement(By.id("focus__this")).clear();
    driver.findElement(By.id("focus__this")).sendKeys(usrnm);
    driver.findElement(By.name("p")).clear();
    driver.findElement(By.name("p")).sendKeys(pswd);
    driver.findElement(By.cssSelector("fieldset > input.button")).click();
	
	}
}
