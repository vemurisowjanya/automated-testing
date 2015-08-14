package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for New Category UI feature on Categories page
 */

public class NewCategory extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/categories");
    if(driver.findElement(By.linkText("New Category"))){
      JUnit.AssertTrue("Found the new category link", true);
    }
    else {
      JUnit.fail("No new category link found");
    }
  }
}
