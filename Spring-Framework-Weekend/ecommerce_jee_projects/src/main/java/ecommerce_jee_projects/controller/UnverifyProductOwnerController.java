package ecommerce_jee_projects.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value="/unverifyUser")
public class UnverifyProductOwnerController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException  {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		ProductOwnerDao dao = new ProductOwnerDaoImpl();
	}
	
	
	
	
}
