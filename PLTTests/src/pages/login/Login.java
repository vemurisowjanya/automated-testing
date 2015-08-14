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
    driver.get(baseUrl + "/users/sign_in");
    if(driver.findElement(By.linkText("LOGIN"))){
      JUnit.AssertTrue("Found the login link", true);
    }
    else {
      JUnit.fail("No login link found");
    }
  }
}
