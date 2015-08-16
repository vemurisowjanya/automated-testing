/**
 * 
 */
package ushahidi.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import com.mysql.jdbc.Statement;

/**
 * @author Kesha
 *
 */
public class ConnectToDB {

	public static Connection con;
	public static Statement stmt;
	
	public static void Initialize() throws ClassNotFoundException, SQLException
	{
	    Class.forName(DBConfig.JDBCDriver);
	    Properties p =new Properties();
	    p.put("user", DBConfig.DBusername);
	    p.put("password", DBConfig.DBpassword);
	    con=DriverManager.getConnection(DBConfig.ConnectionURL, p);
	    stmt = (Statement)con.createStatement();
	}
	
	public static void close() throws IOException, SQLException 
	{
        //Close connection
		con.close();
	}
}