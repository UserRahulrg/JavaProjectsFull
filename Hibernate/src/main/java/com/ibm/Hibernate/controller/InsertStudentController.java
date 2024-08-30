//package com.ibm.Hibernate.controller;
//
//import java.time.LocalDate;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class InsertStudentController {
//
//	public static void main(String[] args) { 
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
//		EntityTransaction et = em.getTransaction;
//		EntityManager em = emf.createEntityManager() ;       ;
//		Student student = new Student(787,"Rohan","rohan@gmail.com",LocalDate.parse("1997-09-13"));
//		
//		et.begin();
//		em.persist(student);
//		et.commit();
//	}
//	
//}
