package Helper;

import org.openqa.selenium.By;

public abstract class UserLogin extends CommonCode{

	public void userlogin(){
		driver.get(baseUrl + "/");
	    driver.findElement(By.linkText("Login")).click();
	}
	
}
