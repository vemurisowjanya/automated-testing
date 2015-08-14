package com.example.tests;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for the edit UI feature on the Organization page
 */

public class EditOrganization extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/organizations/1");
    if(driver.findElement(By.linkText("Edit"))){
      JUnit.AssertTrue("Found edit link", true);
    }
    else {
      JUnit.fail("No edit link found");
    }
  }
}
