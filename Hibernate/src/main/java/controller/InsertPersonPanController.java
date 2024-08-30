package controller;

import dao.PersonPanDao;
import dto.Pan;
import dto.Person;

public class InsertPersonPanController {

	public static void main(String[] args) {
		
		PersonPanDao personPanDao = new PersonPanDao();
		
		Pan pan = new Pan("3RBTEW65","noida sector 14");	
	
		Person person = new Person(6966, "amir", "amir@gmail.com",null);
		
		personPanDao.savePersonAndPanDao(person, pan);
	}
}
