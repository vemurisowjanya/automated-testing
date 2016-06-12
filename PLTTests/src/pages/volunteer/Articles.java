package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Articles UI feature
 */

public class Countries extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl);
    if(driver.findElement(By.linkText("Articles"))){
      JUnit.AssertTrue("Found the articles link", true);
    }
    else {
      JUnit.fail("No articles link found");
    }
  }
}
