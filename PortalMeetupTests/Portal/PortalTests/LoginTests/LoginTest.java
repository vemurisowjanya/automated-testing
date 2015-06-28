package LoginTests;
import java.util.Arrays;
import java.util.Collection;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import BaseTests.CommonTests;
import Login.LoggedInCheck;
import Login.LoginPage;

/*
* @author Anjali
*/

/*
 * Tests default login
 */
@RunWith(Parameterized.class)
public class LoginTest extends CommonTests
{
	private String username;
	private String password;
	
	@Parameters
	public static Collection<Object[]>data()
	{
		return Arrays.asList(new Object[][]{
				{"anjali","anjali"},//pass
				{"abc","xyz"},//fail
				{"random",""},//fail
				{"",""} //fail
		});		
	}
	public LoginTest(String username, String password) 
	{
		this.username=username;
		this.password=password;
		
	}

	@Test
	public void test() 
	{
		//Enter the user name and password
		LoginPage.LoginAs(username).WithPassword(password).Login();
		
		//Validate
		Assert.assertEquals(true,LoggedInCheck.IsAt());
	
	}
	
}
