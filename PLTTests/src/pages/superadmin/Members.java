package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Members UI feature
 */

public class Members extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl);
    if(driver.findElement(By.linkText("Members"))){
      JUnit.AssertTrue("Found the members link", true);
    }
    else {
      JUnit.fail("No members link found");
    }
  }
}
