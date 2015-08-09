package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class NewSite {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testNewSite() throws Exception {
    driver.get(baseUrl + "/sites");
    driver.findElement(By.linkText("New site")).click();
  }
}
