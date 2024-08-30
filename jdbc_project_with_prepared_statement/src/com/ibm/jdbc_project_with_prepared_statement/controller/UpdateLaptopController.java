package com.ibm.jdbc_project_with_prepared_statement.controller;

import java.util.Scanner;

import com.ibm.jdbc_project_with_prepared_statement.dao.LaptopDao;

public class UpdateLaptopController {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter laptop id to update name");
		int id = scanner.nextInt();
		
		System.out.println("enter new laptop name");
		String name = scanner.next();
		
		LaptopDao dao = new LaptopDao();
		
		int a=dao.updateLaptopNameByIdDao(id, name);
		
		String msg = (a!=0)?"updated":"given id is not found";
		
		System.out.println(msg);
	}

}

