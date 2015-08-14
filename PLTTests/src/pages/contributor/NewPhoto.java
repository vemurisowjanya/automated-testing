package contributor;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Tests for New Photo UI feature
 */

public class NewPhoto extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/articles");
    if(driver.findElement(By.linkText("New Photo"))){
      JUnit.AssertTrue("Found the new photo link", true);
    }
    else {
      JUnit.fail("No new photo link found");
    }
  }
}
