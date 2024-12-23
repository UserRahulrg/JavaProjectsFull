package com.ibm.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.time.LocalDate;

import com.ibm.servlet_simple_crud_operation.dao.StudentDao;
import com.ibm.servlet_simple_crud_operation.dto.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/editForm")
public class UpdateStudentController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//Parameters to fetch values for parameters that are need to be updated
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		String firstName = req.getParameter("firstName");

		String lastName = req.getParameter("lastName");

		String nickName = req.getParameter("nickName");

		String email = req.getParameter("email");

		String password = req.getParameter("password");

		String dob = req.getParameter("dob");

		long mobile = Long.parseLong(req.getParameter("mobile"));

		String gender = req.getParameter("gender");

		String address = req.getParameter("address");

		//creating object of student and passing values to he parameter sing edit form data
		
		Student student = new Student(id,firstName, lastName, nickName, email, password, LocalDate.parse(dob), mobile,
				gender, address);
		
		//creating object of StudentDao class and calling the function whle passing the above value student
		new StudentDao().updateStudentDao(student);
		
		//if above process is completed then display.jsp file will be processed and display page will be shown
		resp.sendRedirect("display.jsp");
		
	}
}
