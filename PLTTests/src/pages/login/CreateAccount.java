package login;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to create account
 * @author Madi Vachon
 **/

public class CreateAccount extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/login");
    driver.findElement(By.linkText("Don’t have an account? Sign up")).click();
    new Select(driver.findElement(By.id("user_organization_id"))).selectByVisibleText("Red Cross");
    driver.findElement(By.id("user_email")).clear();
    driver.findElement(By.id("user_email")).sendKeys("test@gmail.com");
    driver.findElement(By.id("user_username")).clear();
    driver.findElement(By.id("user_username")).sendKeys("test");
    driver.findElement(By.id("user_first_name")).clear();
    driver.findElement(By.id("user_first_name")).sendKeys("test");
    driver.findElement(By.id("user_last_name")).clear();
    driver.findElement(By.id("user_last_name")).sendKeys("test");
    driver.findElement(By.id("user_gender_female")).click();
    new Select(driver.findElement(By.id("user_lang"))).selectByVisibleText("Chuukese");
    driver.findElement(By.id("user_password")).clear();
    driver.findElement(By.id("user_password")).sendKeys("test");
    driver.findElement(By.id("user_password_confirmation")).clear();
    driver.findElement(By.id("user_password_confirmation")).sendKeys("test");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }
}
