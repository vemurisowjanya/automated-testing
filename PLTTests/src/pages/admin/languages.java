package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class Languages extends commons.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testLanguages() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Languages")).click();
  }
}
