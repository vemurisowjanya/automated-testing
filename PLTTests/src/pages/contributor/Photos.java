package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class Photos {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testPhotos() throws Exception {
    driver.get(baseUrl + "/articles");
    driver.findElement(By.linkText("Photos")).click();
  }
}
