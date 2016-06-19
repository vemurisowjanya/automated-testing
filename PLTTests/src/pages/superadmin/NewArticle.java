package superadmin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to create new article
 * @author Madi Vachon
 **/

public class NewArticle extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Articles")).click();
    driver.findElement(By.cssSelector("i.icon-plus")).click();
    driver.findElement(By.id("article_picture")).clear();
    driver.findElement(By.id("article_picture")).sendKeys("/home/madi/Downloads/cat.jpg");
    new Select(driver.findElement(By.id("article_language_id"))).selectByVisibleText("Pohnpeian");
    new Select(driver.findElement(By.id("article_category_id"))).selectByVisibleText("Animals");
    driver.findElement(By.id("article_english")).clear();
    driver.findElement(By.id("article_english")).sendKeys("Cat");
    driver.findElement(By.id("article_phonetic")).clear();
    driver.findElement(By.id("article_phonetic")).sendKeys("Cat");
    new Select(driver.findElement(By.id("article_state"))).selectByVisibleText("Publish");
    driver.findElement(By.id("article_audios_attributes_0_content")).clear();
    driver.findElement(By.id("article_audios_attributes_0_content")).sendKeys("Cat");
    driver.findElement(By.id("article_audios_attributes_0_audio")).clear();
    driver.findElement(By.id("article_audios_attributes_0_audio")).sendKeys("/home/madi/Downloads/cat.jpg");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }
}
