package HomePageFeatures;

// click on the Contact option on the navigation bar

import static org.junit.Assert.*;
import org.junit.Test;

public class Contact extends Helper.CommonCode{

	@Test
	public void testContactlink() {
		driver.get(baseUrl + "/");
	    driver.findElement(ContactsLink).click();
	    assertTrue(driver.getPageSource().contains("Contact Systers"));
	}

}
