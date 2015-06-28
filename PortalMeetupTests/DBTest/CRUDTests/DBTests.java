package CRUDTests;
import static org.junit.Assert.*;
import java.sql.SQLException;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import DBFrame.CRUD;

/*
 * @author Anjali
 */


/*
 * To maintain order execution of test, i.e, create will happen first n deletion at last. FixedMethodOrder is used
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DBTests extends CommonTest
{

	private String TableName= "userinfo";
	private String Query;
	
	//Create table
	@Test
	public void TestA_CreateTest() throws SQLException
	{
		Query="create table "+TableName+"(userID Int, userName varchar(50)," +
				       " userAge int, userCity varchar(50))";
		assertEquals(true, CRUD.CanCreate(Query,TableName));
	}
	
	
	//Insert tuple
	@Test
	public void TestB_InsertTest() throws SQLException
	{
		Query="insert into "+TableName+" values(125,'Anjali', 21, 'Manipal')";
		assertEquals(true, CRUD.CanInsert(Query));

	}
	
	//Read
	@Test
	public void TestC_ReadTest() throws SQLException
	{
		Query="select * from "+TableName+" where userID=125";
		assertEquals( true, CRUD.CanRead(Query));
	}
    
	//Update/Modify tuple
	@Test
	public void TestD_UpdateTest() throws SQLException
	{
		Query="update "+TableName+" set userAge=22 where userID=125";
		assertEquals(true, CRUD.CanUpdate(Query));
	}
	
	
	//delete tuple created
	@Test
	public void TestE_DeleteTest() throws SQLException
	{
		Query="delete from "+TableName+" where userID=125";
		assertEquals( true, CRUD.CanDelete(Query));
	}
}
