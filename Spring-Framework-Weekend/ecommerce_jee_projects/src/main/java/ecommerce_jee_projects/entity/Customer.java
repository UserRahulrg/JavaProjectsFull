package ecommerce_jee_projects.entity;

import jakarta.servlet.http.Part;

public class Customer {

	public Customer(String name, String email, String password, byte[] image1) {
		// TODO Auto-generated constructor stub
	}
	
	private int CustomerId;
	private int CustomerName;
	private int CustomerEmail;
	private int CustomerPassword;
	private Part image1;
	
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public int getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(int customerName) {
		CustomerName = customerName;
	}
	public int getCustomerEmail() {
		return CustomerEmail;
	}
	public void setCustomerEmail(int customerEmail) {
		CustomerEmail = customerEmail;
	}
	public int getCustomerPassword() {
		return CustomerPassword;
	}
	public void setCustomerPassword(int customerPassword) {
		CustomerPassword = customerPassword;
	}
	public Part getImage1() {
		return image1;
	}
	public void setImage1(Part image1) {
		this.image1 = image1;
	}
	
	
	
}
