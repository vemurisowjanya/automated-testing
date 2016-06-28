/*
 * @author Anjali
 * @since 2016-06-28
 * This class make the connection to the DB and closes the connection after the DB steps have been performed.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.api.jdbc.Statement;

import PageObjectModel.databaseConstants;

public class connectToDB
{
	public static Connection connection = null;
	public static Properties p = null;
	public static Statement stmt;
	public static void initConnectionToDB()
	{
		
		try
		{
			Class.forName(databaseConstants.jdbcDriver).newInstance();
			connection = DriverManager.getConnection(databaseConstants.connectionURL+"?"+"user="+ databaseConstants.dbUsername+"&password="+databaseConstants.dbPassword);
			stmt = (Statement)connection.createStatement();
			 
			if(connection != null)
				System.out.println("connection successfull");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void closeConnection() throws SQLException
	{
		connection.close();
	}
}
