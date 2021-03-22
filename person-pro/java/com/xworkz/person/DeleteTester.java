package com.xworkz.person;

import com.xworkz.person.entity.PersonEntity;
import com.xworkz.person.repository.PersonRepository;
import com.xworkz.person.repository.PersonRepositoryImpl;

public class DeleteTester {

	public static void main(String[] args) {
		/*PersonEntity entity=new PersonEntity();
		entity.setId(4);
		entity.setName("Geetha");
		entity.setEmail("gee@gmail.com");
		entity.setPhoneNo(900846512);*/
		
		PersonRepository dao=new PersonRepositoryImpl();
		dao.deleteById(4);

	}

}
