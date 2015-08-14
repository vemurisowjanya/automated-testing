package com.example.tests;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Sites UI feature
 */

public class Sites extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("Sites"))){
      JUnit.AssertTrue("Found the sites link", true);
    }
    else {
      JUnit.fail("No sites link found");
    }
  }
}
