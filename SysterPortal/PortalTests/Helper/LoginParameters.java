package Helper;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public abstract class LoginParameters extends UserLogin{
	
	protected String username;
	protected String password;
	protected int index;
	  
	  public LoginParameters(String username, String password, int index){
		  this.username = username;
		  this.password = password;
		  this.index = index;
		  }
	  @Parameters
		 public static Collection<Object[]> data() {
		   Object[][] data = new Object[][] { {"", "",1}, {"","password1",2}, {"username1","",3}, {"randomname", "randompass", 4}, {"shweta","shweta",5} };
		   return Arrays.asList(data);
		 }
}
