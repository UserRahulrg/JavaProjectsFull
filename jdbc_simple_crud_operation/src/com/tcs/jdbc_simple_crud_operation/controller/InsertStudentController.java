package com.tcs.jdbc_simple_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertStudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jffadd-m9";
			String user = "root";
			String pass = "1234"; 
			
			Connection connection = DriverManager.getConnection(url,user,pass);
			
			System.out.println(connection);
			
		}
		
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
