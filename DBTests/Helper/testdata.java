package Helper;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public abstract class testdata extends Helper.PageObjectRef{
	
	protected WebDriver driver = null;
	public String usrnm = "ssrivastava";
	public String pswd = "giwhuw78";
	protected String baseUrl = "http://systersportal-demo.herokuapp.com";//protected String baseUrl = "http://systers.org/systers-dev/doku.php/gsocstudents2014?do=login";
	protected String url = "jdbc:mysql://localhost/shweta";
    protected String user = "root";
    protected String password = "check*123#";
    protected String driver_class = "com.mysql.jdbc.Driver";
    public Connection connection = null;
    protected String fileaddr = "/home/shwetambara/ScreenshotOnFail/sample.png";

    public void takeScreenshotonFailure() throws IOException{
		// take the screenshot at the end of every test
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        FileUtils.copyFile(scrFile, new File(fileaddr));   
	}

}
