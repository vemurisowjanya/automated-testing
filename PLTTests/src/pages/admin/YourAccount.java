package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Your Account
 */

public class Logout CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl);
    if(driver.findElement(By.linkText("Your Account"))){
      JUnit.AssertTrue("Found the your account link", true);
    }
    else {
      JUnit.fail("No your account link found");
    }
  }
}
