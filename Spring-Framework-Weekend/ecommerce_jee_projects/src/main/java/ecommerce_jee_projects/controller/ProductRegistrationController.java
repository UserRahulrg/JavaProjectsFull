package ecommerce_jee_projects.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value="/productRegiter")
public class ProductRegistrationController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	
	String name = req.getParameter("");
	String color = req.getParameter("");
	
}
