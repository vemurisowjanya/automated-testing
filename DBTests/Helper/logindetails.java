package Helper;


public class logindetails extends testdata {

	public void login() {
   
	driver.get(baseUrl);
	driver.findElement(login_id).clear();
    driver.findElement(login_id).sendKeys(usrnm);
    driver.findElement(login_pass).clear();
    driver.findElement(login_pass).sendKeys(pswd);
    driver.findElement(signInbutton).click();
	
	}
}
