package contributor;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Photos UI Feature
 */

public class Photos extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("Photos"))){
      JUnit.AssertTrue("Found the photos link", true);
    }
    else {
      JUnit.fail("No photos link found");
    }
  }
}
