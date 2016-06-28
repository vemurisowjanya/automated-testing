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

import PageObjectModel.databaseConstants;

public class connectToDB
{
	static Connection connection = null;
	static Properties p = null;
	public static void initConnectionToDB()
	{
		
		try
		{
			Class.forName(databaseConstants.jdbcDriver).newInstance();
			connection = DriverManager.getConnection(databaseConstants.connectionURL+"?"+"user="+ databaseConstants.dbUsername+"&password="+databaseConstants.dbPassword);
			
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
