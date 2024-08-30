package com.ibm.jdbc_project_with_prepared_statement.controller;

import com.ibm.jdbc_project_with_prepared_statement.dao.LaptopDao;
import com.ibm.jdbc_project_with_prepared_statement.dto.Laptop;

public class DisplayLaptopByIdController {
	
	public static void main(String[] args) {
		
		Laptop laptop = new LaptopDao().displayLaptopByIdDao(1234);
		
		if(laptop!= null) {
			System.out.println(laptop);
		}
		
		else{
			System.out.println("Given id is not Found!!");
		}
	}
	
	

}
