package LoginTests;
import java.util.Arrays;
import java.util.Collection;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import BaseTests.CommonTests;
import Login.SignUpCheck;
import Login.SignUpPage;

/*
* @author Anjali
*/

/*
 * Validates sign up with different cases		
 */
@RunWith(Parameterized.class)
public class SignUpTest extends CommonTests
{
	private String username;
	private String Email;
	private String password;
	private String Confirmpassword;
	
	@Parameters
	public static Collection<Object[]>data()
	{
		return Arrays.asList(new Object[][]{
				{"xyz","abc@gmail.com","pass12"},//pass
				{"shally","anjali.shally@yahoo.com","abc1234"},//pass
				{"abc","",""}//fail, incomplete details
		});
	}

	public SignUpTest(String username, String Email, String pass)
	{
		this.username=username;
		this.Email= Email;
		this.password=pass;
		this.Confirmpassword=pass;
	}
	
	@Test
	public void test()
	{
		//Give details 
		SignUpPage.EnterUsername(username);
		SignUpPage.EnterEmail(Email);
		SignUpPage.EnterPassword(password);
		SignUpPage.ConfirmPassword(Confirmpassword);
		SignUpPage.ClickSubmit();
		
		//Validate
		Assert.assertEquals(true,SignUpCheck.HasSignedUp());
	}

}
