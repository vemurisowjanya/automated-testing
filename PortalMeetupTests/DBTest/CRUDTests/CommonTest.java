package CRUDTests;
import java.io.IOException;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;
import DBFrame.ConnectToDB;

/*
 * @author Anjali
 */

public class CommonTest
{

	@Before
	public void Init() 
	{
		try 
		{
			ConnectToDB.Initialize();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown() throws SQLException
	{
		try 
		{
			ConnectToDB.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
