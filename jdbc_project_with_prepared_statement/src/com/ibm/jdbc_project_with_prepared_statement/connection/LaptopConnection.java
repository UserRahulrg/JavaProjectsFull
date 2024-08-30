package com.ibm.jdbc_project_with_prepared_statement.connection;

import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.Connection;

public class LaptopConnection {

	public static Connection getLaptopConnection(){
		try {
			//Step-1 Load/Register Driver
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step-2 connect
			
			String url = "jdbc:mysql://localhost:3306/jffadd-m9";
			String user = "root";
			String pass = "1234";
			
			return DriverManager.getConnection(url,user,pass);
			
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}



