package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class Logout commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("Logout"))){
      JUnit.AssertTrue("Found the logout link", true);
    }
    else {
      JUnit.fail("No logout link found");
    }
  }
}
