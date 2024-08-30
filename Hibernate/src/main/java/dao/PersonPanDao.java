package dao;

import dto.Pan;
import dto.Person;

import jakarta.persistence.*;

public class PersonPanDao {
	
	EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	public Person savePersonAndPanDao(Person person ,Pan pan) {
	try{
		et.begin();
		em.persist(pan);
		person.setPan(pan);
		em.persist(person);
		et.commit();
		return person;
		
	}catch (Exception e) {
		e.printStackTrace();
		return person;
	}
	finally {
		
	}
	
	//Make null the Pan in first table to remove the pan from second table
	
	
	
	
}
	
}

public boolean deletePanByIdDao(String panNumber) {
	
	Pan pan = em.find(Pan.class, panNumber);
	
	Query query = em.createNativeQuery("select * from person where pannumber=?1",Person.class);
	
	
	
	Object object = query.getSingleResult();
	
	if(object instanceof Person) {
		person = (Person)object;
		
	}
	else {
		System.out.println("Can not convert from object to Person");
	}
	

	if(pan != null) {
		et.begin();
		
		if(person != null) {
			person.setPan(null);
		}
		
	}
}


