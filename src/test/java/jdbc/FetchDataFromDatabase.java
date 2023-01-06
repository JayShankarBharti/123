package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FetchDataFromDatabase {

	public static void main(String[] args) throws SQLException {
		//Step 1: Create instance for jdbc driver
		//Driver should be imported from com.mysql.cj.jdbc
		//new Driver(); throws Exception
		Driver dbDriver= new Driver();
		
		//Step 2: Register driver to jdbc
		DriverManager.registerDriver(dbDriver);
		
		//Step 3: Establish the connection
		Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/wcsa3","root","root");
		
		//Step 4: create statement
		Statement state= connect.createStatement();
		
		//Step 5: Execute query
		ResultSet result= state.executeQuery("select * from students;");
		
		//Step 6: print the result
		while(result.next()) {
			System.out.println(result.getInt("id")+"\t"+result.getString("name")+"\t"+result.getInt("phone"));
		}
		//Step 7: Close database
		connect.close();
		
			
		

	}

}
