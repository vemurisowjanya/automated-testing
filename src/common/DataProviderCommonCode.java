package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DataProviderCommonCode {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {		  	  
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(utilities.Constants.baseURL);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}