package Helper;

import java.sql.Connection;

import org.openqa.selenium.WebDriver;

public abstract class testdata {
	
	protected WebDriver driver = null;
	public String usrnm = "ssrivastava";
	public String pswd = "giwhuw78";
	protected String baseUrl = "http://systers.org/systers-dev/doku.php/gsocstudents2014?do=login";
	protected String url = "jdbc:mysql://localhost/shweta";
    protected String user = "root";
    protected String password = "check*123#";
    protected String driver_class = "com.mysql.jdbc.Driver";
    public Connection connection = null;

}
