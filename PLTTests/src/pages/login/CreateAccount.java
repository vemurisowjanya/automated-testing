package login;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Tests for CreateAccount UI feature
 */

public class CreateAccount extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("CREATE ACOUNT"))){
      JUnit.AssertTrue("Found the create account link", true);
    }
    else {
      JUnit.fail("No create account link found");
    }
  }
}
