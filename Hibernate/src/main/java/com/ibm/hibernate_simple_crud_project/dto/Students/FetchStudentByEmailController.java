package com.ibm.hibernate_simple_crud_project.dto.Students;

import jakarta.persistence.Query;

import java.util.List;

import com.ibm.hibernate_simple_crud_project.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchStudentByEmailController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		
		EntityManager em = emf.createEntityManager();
		
//		Query query = em.createQuery("Select s from Student s Where s.name?1");
//		query.setParameter(1, "Rohan");
//		
//		List<Student> student = query.getResultList();
//		
//		System.out.println(student);
		
		Query query = em.createNativeQuery("Select * from student where email:abc",Student.class);
		
		query . setParameter("abc", "rohan@gmail.com");
		
		List<Student> students = query . getResultList();
		
		for(Student student : students) {
			System.out.println(student);
		}
		
	}

}
