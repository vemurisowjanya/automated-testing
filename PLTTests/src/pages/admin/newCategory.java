package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class NewCategory extends commons.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testNewCategory() throws Exception {
    driver.get(baseUrl + "/categories");
    driver.findElement(By.linkText("New Category")).click();
  }
}
