package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class Languages extends commons.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("Languages"))){
      JUnit.AssertTrue("Found the languages link", true);
    }
    else {
      JUnit.fail("No languages link found");
    }
  }
}
