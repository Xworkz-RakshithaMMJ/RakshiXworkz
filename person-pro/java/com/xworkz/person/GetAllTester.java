package com.xworkz.person;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.person.entity.PersonEntity;
import com.xworkz.person.repository.PersonRepository;
import com.xworkz.person.repository.PersonRepositoryImpl;

public class GetAllTester {

	public static void main(String[] args) {
		
		PersonEntity entity=new PersonEntity();
		entity.setId(2);
		entity.setName("Geetha");
		entity.setEmail("gee@gmail.com");
		entity.setPhoneNo(900846512);
		
		PersonEntity entity1=new PersonEntity();
		entity1.setId(3);
		entity1.setName("Rajee");
		entity1.setEmail("raje@gmail.com");
		entity1.setPhoneNo(900846512);
		PersonRepository dao=new PersonRepositoryImpl();
		/*dao.persist(entity);
		dao.persist(entity1);*/
		List<PersonEntity> list = new ArrayList<PersonEntity>();
		list.add(entity);
		list.add(entity1);
		List<PersonEntity> entityFromDb=dao.getAll();
		System.out.println(entityFromDb);
	

	}

}
