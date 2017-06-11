/*
 * @author Anjali
 * @since 2016-06-11
 * This class checks if a user is at the welcome page after successful login.
 */
package LoginAndRegistration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import Logs.log4j;
import PageObjectModel.constants;
import WebDriver.driver;


public class loggedInCheck 
{
    /*
     * @return boolean value for validation(pass or fail)
     */
	public static boolean hasLogeedIn() 
	{
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println(driver.Instance.getCurrentUrl());
		if(driver.Instance.getCurrentUrl().contains(constants.baseURL+"progressBar.php"))
		{
			System.out.println("inside progressBar");
			driver.Instance.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		WebElement title = driver.Instance.findElement(constants.welcomeTtile);
		String URL = driver.Instance.getCurrentUrl();
		log4j.Log.info("Title after login" + title.getText());
		String pageTitle = title.getText();
		System.out.println(pageTitle);
		System.out.println("url "+URL);
		if((pageTitle.contains(constants.pageTitleWelcome)) && (URL.contains(constants.baseURL+"welcome.php")))
		{
			System.out.println("Reaching here");
			return true;
		}
		else
			return false;
	}

}
