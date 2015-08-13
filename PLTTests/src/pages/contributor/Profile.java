package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class Profile {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testProfile() throws Exception {
    driver.get(baseUrl + "/articles");
    driver.findElement(By.linkText("Con")).click();
  }
}
