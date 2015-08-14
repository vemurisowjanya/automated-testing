package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class Photos {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/articles");
    if(driver.findElement(By.linkText("Photos"))){
      JUnit.AssertTrue("Found the photos link", true);
    }
    else {
      JUnit.fail("No photos link found");
    }
  }
}
