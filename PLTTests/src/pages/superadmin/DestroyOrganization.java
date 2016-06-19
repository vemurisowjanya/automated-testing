package superadmin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to destroy organization
 * @author Madi Vachon
 **/

public class DestroyOrganization extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/organizations");
    driver.findElement(By.xpath("//li[5]/ul/li[3]/div/div/a/i")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Destroy')])[5]")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure[\\s\\S]$"));
  }
}
