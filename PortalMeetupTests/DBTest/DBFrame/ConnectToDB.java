package DBFrame;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.mysql.jdbc.Statement;

/*
 * @author Anjali
 */

public class ConnectToDB 
{

	public static WebDriver Instance;
	public static String screenshot="Test";
	public static Connection con;
	public static Statement stmt;
	
	public static void Initialize() throws ClassNotFoundException, SQLException
	{
	    Class.forName(PageRefObj.JDBCDriver);
	    Properties p =new Properties();
	    p.put("user", PageRefObj.DBusername);
	    p.put("password", PageRefObj.DBpassword);
	    con=DriverManager.getConnection(PageRefObj.ConnectionURL, p);
	    stmt = (Statement)con.createStatement();
	}
	
	public static void close() throws IOException, SQLException 
	{
                //Close connection
		con.close();
	}
}
