package ecommerce_jee_projects.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ecommerce_jee_projects.connection.EcommerceConnection;
import ecommerce_jee_projects.entity.Customer;

public class CustomerDaoImpl implements CustomerDao{

	Connection connection = EcommerceConnection.getEcommerceConnection();
	
	final String Customer_Register_Query= "insert into customer(name,email,password,image) values(?,?,?,?)";
	
	final String Get_customer_Query ="select * from customer";
	
	final String Get_All_Nonverified_Product_Owner_Details = "SELECT * FROM ";
	
	@Override
	public Customer registerCustomerDao(Customer customer) {
		
		try {
			
			PreparedStatement ps = connection.prepareStatement(Customer_Register_Query);
			
			ps.setString(1, customer.getCustomerName());	
			ps.setString(2, customer.getCustomerEmail());
			ps.setString(3, customer.getCustomerPassword());
			
			return customer;
		}
		catch(SQLException e) {
			
			e.printStackTrace();
		}
	}
}
