package contributor;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Tests for LogOut UI feature
 */

public class LogOut extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("sign_out_link"))){
      JUnit.AssertTrue("Found the sign out link", true);
    }
    else {
      JUnit.fail("No sign out link found");
    }
  }
}
