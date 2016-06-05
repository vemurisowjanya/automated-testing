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
    String username = "test";
    String password = "test";

    driver.get(baseUrl + "/login");
    if(driver.findElement("Log in")){
      driver.sendKeys(username);
      driver.sendKeys(password);
      driver.findElement("Log in").click();
      JUnit.AssertTrue("Successfully logged in", true);
    }

    else {
      JUnit.fail("Failure logging in");
    }
  }
}
