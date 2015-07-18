package home_page_features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;


public class DataProviderTest {
	
	WebDriver driver;
			
	@Test(dataProvider = "Authentication")
	public void f(String username, String password) {
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys(username);
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys(password);
			
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
	}
	  
	  
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
	
	@DataProvider
	  	public String[][] Authentication() throws Exception {
	    String[][] cellData = utilities.ExcelLoginReader.read(utilities.Constants.pathLoginTestData, "Sheet1");
		return cellData;
	}
}
