package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for the New country UI feature on the Countries page
 */

public class NewCountry extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/countries");
    if(driver.findElement(By.linkText("New country"))){
      JUnit.AssertTrue("Found the new country link", true);
    }
    else {
      JUnit.fail("No new country link found");
    }
  }
}
