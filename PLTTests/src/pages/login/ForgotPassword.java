package login;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to reset password
 * @author Madi Vachon
 **/

public class ForgotPassword extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/login");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("test");
    driver.findElement(By.id("user_password")).clear();
    driver.findElement(By.id("user_password")).sendKeys("t");
    driver.findElement(By.linkText("Forgot Password?")).click();
    driver.findElement(By.id("user_email")).clear();
    driver.findElement(By.id("user_email")).sendKeys("test@gmail.com");
    driver.findElement(By.name("commit")).click();
  }
}
