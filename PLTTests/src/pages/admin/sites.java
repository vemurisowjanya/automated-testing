package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class Sites extends commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testSites() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Sites")).click();
  }
}
