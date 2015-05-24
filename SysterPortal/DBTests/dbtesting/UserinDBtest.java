package dbtesting;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import Helper.dbConnect;
import Helper.logindetails;

public class UserinDBtest extends Helper.testdata {
	
	dbConnect instancedb = new dbConnect();
	logindetails instancelg = new logindetails();
	Statement stmt = null;
	Connection con = instancedb.connection;
@Before 

public void setUp() throws Exception {
	
  driver = new FirefoxDriver();
  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  instancedb.createConnection();
}

 @Test
 public void testUserCreation(String newEmail) throws Exception {

	 driver.get(baseUrl + "/");
	 driver.findElement(SignupLink).click();
	 assertEquals(driver.getCurrentUrl(), baseUrl + "/accounts/signup/");

	 driver.findElement(Username).clear();
	 driver.findElement(Username).sendKeys("dummy");
	 driver.findElement(Email).clear();
	 driver.findElement(Email).sendKeys("dummy@test.com");
	 driver.findElement(Password1).clear();
	 driver.findElement(Password1).sendKeys("dummypwd");
	 driver.findElement(Password2).clear();
	 driver.findElement(Password2).sendKeys("dummypwd");
	 driver.findElement(SignupButton).click();


//now check user you created is in DB
instancelg.login();
  
  try {
	  stmt = con.createStatement();  
	  String query = "select * from userDB";
	  ResultSet result = stmt.executeQuery(query);
	  if(result.next())
	  {
		  while(result.next()){
			  String username = result.getString("Username");
		         String password = result.getString("Password"); 
		         assertEquals(instancelg.usrnm, username);
		         assertEquals("user in Database", instancelg.pswd, password);
		  }
		  result.close();
	  }
  }
  catch (SQLException ex) {
	     System.out.println(ex);
	   	}

 }

@After

public void tearDown() throws Exception {

	instancedb.teardown();
    takeScreenshotonFailure();
    driver.close();  // close the driver

}

}