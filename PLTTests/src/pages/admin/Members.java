package admin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

public class MembersAdmin extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/articles");
    driver.findElement(By.linkText("Members")).click();
  }

}
