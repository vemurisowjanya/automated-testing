package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to logout
 * @author Madi Vachon
 **/

public class Logout extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception{
    driver.get(baseUrl);
    if(driver.findElement(By.linkText("Your Account"))){
      JUnit.AssertTrue("Found the your account link", true);
    }
    else {
      JUnit.fail("No your account link found");
    }
  }
}
