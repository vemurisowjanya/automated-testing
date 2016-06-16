package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test for my organization page
 * @author Madi Vachon
 **/

public class MyOrganization extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception{
    driver.get(baseUrl);
    if(driver.findElement(By.linkText("My Organization"))){
      JUnit.AssertTrue("Found the my organization link", true);
    }
    else {
      JUnit.fail("No my organization link found");
    }
  }
}
