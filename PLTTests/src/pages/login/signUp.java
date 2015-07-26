package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class SignUp extends commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testSignUp() throws Exception {
    driver.get(baseUrl + "/users");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
  }
}
