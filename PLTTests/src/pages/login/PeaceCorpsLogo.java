package login;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for the Peace Corps logo UI feature
 */

public class PeaceCorpsLogo extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.cssSelector("img.logo_img"))){
      JUnit.AssertTrue("Found peace corp logo link", true);
    }
    else {
      JUnit.fail("No peace corp logo link found");
    }
  }
}
