package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Categories UI Feature
 */

public class Categories extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("Categories"))){
      JUnit.AssertTrue("Found the categories link", true);
    }
    else {
      JUnit.fail("No categories link found");
    }
  }
}
