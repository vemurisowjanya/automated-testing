package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

public class BackOrganization extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/organizations/1");
    if(driver.findElement(By.linkText("Back"))){
      JUnit.AssertTrue("Found the back link", true);
    }
    else {
      JUnit.fail("No back link found");
    }
  }
}
