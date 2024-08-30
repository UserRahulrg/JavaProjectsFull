package com.jsp.servlet_session_management.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(value = "/loginController")
public class LoginController  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession httpSession=req.getSession();
		
		String usename = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(usename.equalsIgnoreCase("aman")&&password.equalsIgnoreCase("aman@123")) {
			httpSession.setAttribute("userSession", usename);
			httpSession.setMaxInactiveInterval(60);
			resp.sendRedirect("home.jsp");
		}else {
			
			req.setAttribute("msg", "username/password is wrong");
			
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
		
	}

}
