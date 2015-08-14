package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class NewPhoto {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/articles");
    if(driver.findElement(By.linkText("New photo"))){
      JUnit.AssertTrue("Found the new photo link", true);
    }
    else {
      JUnit.fail("No new photo link found");
    }
  }
}
