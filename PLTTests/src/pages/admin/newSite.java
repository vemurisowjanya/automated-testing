package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class NewSite {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/sites");
    if(driver.findElement(By.linkText("New site"))){
      JUnit.AssertTrue("Found the new site link", true);
    }
    else {
      JUnit.fail("No new site link found");
    }
  }
}
