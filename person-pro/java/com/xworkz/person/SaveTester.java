package com.xworkz.person;

import com.xworkz.person.entity.PersonEntity;
import com.xworkz.person.repository.PersonRepository;
import com.xworkz.person.repository.PersonRepositoryImpl;

public class SaveTester {

	public static void main(String[] args) {
		PersonEntity entity=new PersonEntity();
		entity.setId(1);
		entity.setName("Rakshitha");
		entity.setEmail("rak@gmail.com");
		entity.setPhoneNo(900856512);
		
		PersonRepository dao=new PersonRepositoryImpl();
		dao.persist(entity);
	}

}
