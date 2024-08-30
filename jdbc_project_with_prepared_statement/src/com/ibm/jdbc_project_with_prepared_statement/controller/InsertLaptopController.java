package com.ibm.jdbc_project_with_prepared_statement.controller;

import java.time.LocalDate;

import com.ibm.jdbc_project_with_prepared_statement.dao.LaptopDao;
import com.ibm.jdbc_project_with_prepared_statement.dto.Laptop;

public class InsertLaptopController {

	public static void main(String[] args) {
		
		LaptopDao dao new LaptopDao();
		
		Laptop laptop = new Laptop(1234,"HP","WHITE",30000,LocalDate.parse("2024-09-12"));
		
		Laptop l1 = dao.saveLaptopDao(laptop);
		
		if(l1 != null) {
			System.out.println("Data Stored");
		}
		else {
			System.out.println("Data not Inserted!!");
		}
	}
}
