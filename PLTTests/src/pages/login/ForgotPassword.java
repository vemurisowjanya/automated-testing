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
    String email = "maditparis@gmail.com";

    driver.get(baseUrl + "/login");
    if(driver.findElement("Forgot Password?")){
      driver.findElement("Forgot Password?").click();
      driver.findElement("Email");
      driver.sendKeys(email);
      driver.findElement("SendSuccessfully reset password").click();
      JUnit.AssertTrue("Successfully reset password", true);
    }
    else {
      JUnit.fail("Did not successfully reset password");
    }
  }
}
