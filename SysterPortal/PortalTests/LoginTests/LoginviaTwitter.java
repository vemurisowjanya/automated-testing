package LoginTests;
//not complete
import static org.junit.Assert.*;
import org.junit.Test;

public class LoginviaTwitter  extends Helper.UserLogin{

	@Test
	public void testtwitter() {
		
		userlogin();
		driver.findElement(TwitterLink).click();
		boolean b = driver.getCurrentUrl().contains("..........");
		assertTrue(b);
	
	}

}
