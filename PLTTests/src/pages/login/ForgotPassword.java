package login;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Tests for ForgotPassword UI feature
 */

public class ForgotPassword extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/login");
    if(driver.findElement(By.linkText("Forgot Password?"))){
      JUnit.AssertTrue("Found the forgot password link", true);
    }
    else {
      JUnit.fail("No forgot password link found");
    }
  }
}
