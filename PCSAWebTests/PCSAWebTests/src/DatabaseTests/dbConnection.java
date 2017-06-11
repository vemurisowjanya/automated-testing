/*
 * @author Anjali
 * @since 2016-06-28
 * This class make the connection to the DB before running the test and closes the connection after the test.
 */
package DatabaseTests;

import java.sql.SQLException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Database.connectToDB;

public class dbConnection
{
	@BeforeMethod
	public void init()
	{
		connectToDB.initConnectionToDB();
		
	}
	
	@AfterMethod
	public void closeConnection()
	{
		try 
		{
			connectToDB.closeConnection();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
