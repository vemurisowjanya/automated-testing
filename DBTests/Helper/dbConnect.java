package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;


public class dbConnect extends testdata{
	
	//Loading the sql server and connection to a database
    //can add @before but omit for now
    @Before
	public Connection createConnection() {
		try {
            //Load MySQL Java driver    	
            Class.forName(driver_class);
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        
        try {
            //Establish Java MySQL connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Successfully connected to the Database");
        } 
        catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
        }
        return connection;
    }  
     
   public Connection getConnection() {
	  
      return createConnection();
    }
   
   
   @After
 public void teardown() throws SQLException{
	 connection.close();
 }
    //main function to evaluate the result for success or failure, remove when linking to other code
/*public static void main(String args[]) throws IOException{
	instance.getValues();
	instance.createConnection();
	}
*/
}


