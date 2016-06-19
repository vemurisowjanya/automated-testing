package superadmin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to destroy country
 * @author Madi Vachon
 **/

public class DestroyCountry extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/countries");
    driver.findElement(By.xpath("//li[6]/ul/li[5]/div/div/a/i")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[6]")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure[\\s\\S]$"));
  }

}
