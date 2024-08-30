package com.ibm.jdbc_project_with_prepared_statement.controller;

import com.ibm.jdbc_project_with_prepared_statement.dao.LaptopDao;

public class DeleteLaptopController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LaptopDao dao = new LaptopDao();
		int num =dao.deleteLaptopByIdDao(1234);
		
		String msg = (num !=0)?"delete":"given id is not found";
		System.err.println(msg);

	}

}


