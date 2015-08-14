package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Countries UI feature
 */

public class Countries extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("Countries"))){
      JUnit.AssertTrue("Found the countries link", true);
    }
    else {
      JUnit.fail("No countries link found");
    }
  }
}
