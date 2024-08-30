package com.tcs.jdbc_simple_crud_operation.controller;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 

public class InsertStudentControllerII {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Connection connection = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jffadd-m9";
			String user = "root";
			String pass = "1234";
			
			connection = DriverManager.getConnection(url,user,pass); 
			System.out.println(connection);		// TODO Auto-generated method stub
				
			Statement statement = connection.createStatement();
			
			String insertStudentQuery =
					("insert into students(id,name,email,phone,doj) values(125,'sailesh','sailesh@gmail.com,98798,'1988-02-03'");
			
			statement.execute(insertStudentQuery);
			
			}	
			
			catch(ClassNotFoundException | SQLException e)
			{
				e.printStackTrace();
			}
			
			finally {
				
				try {
					connection.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}

	}




