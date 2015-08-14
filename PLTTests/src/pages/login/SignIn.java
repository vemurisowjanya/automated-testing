package login;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Sign In UI feature
 */

public class SignIn extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/users");
    if(driver.findElement(By.linkText("Sign in"))){
      JUnit.AssertTrue("Found the sign in link", true);
    }
    else {
      JUnit.fail("No sign in link found");
    }
  }
}
