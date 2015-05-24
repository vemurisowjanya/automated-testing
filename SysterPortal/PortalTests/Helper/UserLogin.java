package Helper;

public abstract class UserLogin extends CommonCode {

	public void userlogin(){
		driver.get(baseUrl + "/");
	    driver.findElement(LoginLink).click();
	}
	
	public void loginentry(){
		driver.findElement(login_id).clear();
	    driver.findElement(login_id).sendKeys("shweta");
	    driver.findElement(login_pass).clear();
	    driver.findElement(login_pass).sendKeys("shweta");
	    driver.findElement(signInbutton).click();
	}
}
