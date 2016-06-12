package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for my organization test
 */

public class MyOrganization extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl);
    if(driver.findElement(By.linkText("My Organization"))){
      JUnit.AssertTrue("Found the my organization link", true);
    }
    else {
      JUnit.fail("No my organization link found");
    }
  }
}
