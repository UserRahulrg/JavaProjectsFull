package com.ibm.jdbc_project_with_prepared_statement.service;

import com.ibm.jdbc_project_with_prepared_statement.dao.LaptopDao;
import com.ibm.jdbc_project_with_prepared_statement.dto.Laptop;

public class LaptopService {

	LaptopDao laptopDao = new LaptopDao();
	
	public Laptop saveLaptopService(Laptop laptop) {
		
		double price = laptop.getPrice();
		
		if(price >= 20000 && price <= 30000) {
			
			return laptopDao.saveLaptopDao(laptop);
		}
		
		else {
			System.out.println("");																																																																																																																																																																																														se pass price between 20 to 30 thousand only!!");
			return null;
		}
	}
	
	
}
