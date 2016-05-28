package login;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Remember Me UI feature
 */

public class RememberMe extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/login");
    if(driver.findElement(By.linkText("Remember Me"))){
      JUnit.AssertTrue("Found remember me link", true);
    }
    else {
      JUnit.fail("No remember me link found");
    }
  }
}
