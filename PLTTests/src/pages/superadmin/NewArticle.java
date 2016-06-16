package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for NewArticle
 */

public class NewArticle extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl);
    if(driver.findElement(By.linkText("Logout"))){
      JUnit.AssertTrue("Found the logout link", true);
    }
    else {
      JUnit.fail("No logout link found");
    }
  }
}
