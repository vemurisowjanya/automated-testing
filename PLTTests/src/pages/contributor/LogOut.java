package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class LogOut {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testLogOut() throws Exception {
    driver.get(baseUrl + "/users/edit");
    driver.findElement(By.id("sign_out_link")).click();
  }
}
