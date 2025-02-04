package ecommerce_jee_projects.controller;

import java.io.IOException;
import java.io.InputStream;

import ecommerce_jee_projects.dao.CustomerDao2;
import ecommerce_jee_projects.dao.CustomerDaoImpl;
import ecommerce_jee_projects.entity.Customer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet(value="/customerRegister")
public class RegisterCustomerController {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		
		String name = req.getParameter("customer-name");
		String email = req.getParameter("customer-email");
		String password = req.getParameter("customer-password");
		Part image = req.getPart("customer-image");
		
		InputStream stream = image.getInputStream();
		
		byte[] image1 = stream.readAllBytes();
		
		Customer cusomer1 = new Customer(name,email,password,image1);
		==
		//CustomerDao2 customerDao = new CustomerDaoImpl();
		
		//Customer customer2 = customerDao.registerCustomerDao(cusomer1);
		
		System.out.println(stream+""+image);
		System.out.println(password);
	}
}
