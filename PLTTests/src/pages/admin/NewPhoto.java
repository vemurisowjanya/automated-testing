package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for New photo UI feature on Photos page
 */

public class NewPhoto extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/articles");
    if(driver.findElement(By.linkText("New photo"))){
      JUnit.AssertTrue("Found the new photo link", true);
    }
    else {
      JUnit.fail("No new photo link found");
    }
  }
}
