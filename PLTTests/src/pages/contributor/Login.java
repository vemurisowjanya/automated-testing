package login;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Login UI feature
 */

public class Login extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
	driver.get(baseUrl + "/login");
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("contributor");
	driver.findElement(By.id("user_password")).clear();
	driver.findElement(By.id("user_password")).sendKeys("contributor");
	driver.findElement(By.name("commit")).click();
  }
}
