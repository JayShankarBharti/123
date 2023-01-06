package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public c lass ModifyDatabase {

	public static void main(String[] args) throws SQLException {
		//Step 1: Create an instance for jdbc driver
		Driver dbDriver= new Driver();
		
		//Step 2: Register driver
		DriverManager.registerDriver(dbDriver);
		
		//Step 3: Establish connection
		Connection connect= DriverManager.getconnection("jdbc:mysql://localhost:3306/wcsa3","root","root");
		
		//S
		

	}

}
