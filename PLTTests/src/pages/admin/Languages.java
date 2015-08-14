package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Languages UI feature
 */

public class Languages extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("Languages"))){
      JUnit.AssertTrue("Found the languages link", true);
    }
    else {
      JUnit.fail("No languages link found");
    }
  }
}
