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
    if(driver.findElement(By.linkText("Log in"))){
      JUnit.AssertTrue("Found the log in link", true);
    }
    else {
      JUnit.fail("No log in link found");
    }
  }
}
