package com.ibm.Hibernate.controller;

import java.time.LocalDate;

import com.ibm.hibernate_simple_crud_project.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class GetStudentByIdController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Student student = em.find(Student.class,787);
		
		if(student != null) {
			student.setName("akhil");
			student.setDob(LocalDate.parse("2024-09-09"));
			et.begin();
			em.merge(student);
//			em.remove(student);
			et.commit();
//			System.out.println("data Deleted");
			System.out.println("Data Updated Successfully!!");
			
		}
		else {
			System.out.println("given Id Is Not Found");
		}
		
	}

}

