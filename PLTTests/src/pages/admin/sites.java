package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class Sites extends commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testSites() throws Exception {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("Sites"))){
      JUnit.AssertTrue("Found the sites link", true);
    }
    else {
      JUnit.fail("No sites link found");
    }
  }
}
