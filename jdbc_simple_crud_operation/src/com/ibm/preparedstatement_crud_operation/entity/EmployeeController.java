package com.ibm.preparedstatement_crud_operation.entity;

import java.io.Serializable;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Objects;

public class EmployeeController implements Serializable{

	private int id;
	private String name;
	private String email;
	private long phone;
	private LocalDate doj;
	
	public EmployeeController() {
		super();
	}
	
	public EmployeeController(int id,String name,String email,long phone,LocalDate doj) {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id1 = sc.nextInt();
		System.out.println("Enter name: ");
		String name1 = sc.nextLine();
		System.out.println("Enter email: ");
		String email1 = sc.nextLine();
		System.out.println("Enter Phone No: ");
		long phone1 = sc.nextLong();
		System.out.println("Enter emp joining Date :");
		String doj1 = sc.next();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub88
		
		
		@Override
		public int hashCode() {
			return Objects.hash(doj,email,id,name,phone);
		}
		
		@override
		public boolean equals(object obj) {
			if(this == obj)
			{
				return true;
			}
			if(obj == null)
			{
				return false;
			}
			if(getClass() != obj.getClass())
			{
				return false;
			}
			
			Employee other = Employee(obj);
			return Objects.equals(doj, other.doj) && Objects.equals(email,other.email.obj) && Objects.equals(id, other.id) &&
					Objects.equals(name,other.name) && phone == other.phone;
		}
		
		@override
		
		String insertQuery = "insert into employee(id,name,email,phone,doj) value(?,?,?,?)" ;
		
		switch(choice) {
		
		case 1:
		{
		try {
			PreparedStatement ps = conn.prepareStatement(insertQuery);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setLong(4,phone);
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Code is not Correct,kindly check your code!!");
		}
	}
		
		case 2:
		{
			String displayQuery = "SELECT * FROM employee" ;
			
			try 
			{
				PreparedStatement ps = conn.prepareStatement(displayQuery);
				ResultSet set = ps.executeQuery();
				
				while(set.next()) {
					
					int id = set.getInt("id");
					String name = set.getString("name");
					String email = set.getString("email");
					long phone = set.getLong("phone");
					LocalData doj = set.getDate("doj").toLocalDate();
					
					Employee emp = new Employee(id,name,email,phone,doj);
					
					System.out.println(emp);
				}
				
				
			}
			
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			}
		
		}
		}
		

}
