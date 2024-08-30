//package com.ibm.Hibernate.controller;
//
//import java.util.List;
//
//import com.ibm.hibernate_simple_crud_project.dto.*;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.Persistence;
//import jakarta.persistence.Query;
//
//public class DisplayAllStudentController {
//
//	public static void main(String[] args) {
//		
//		EntityManager em =Persistence.createEntityManagerFactory("hibernate").createEntityManager();
//		
//		Query query =em.createQuery("fromStudent");
//		
//		List<Student> students = query.getResultList();
//		
//		for(Student student : Students) {
//			System.out.println(student);
//		}
//		
//	}
//}
