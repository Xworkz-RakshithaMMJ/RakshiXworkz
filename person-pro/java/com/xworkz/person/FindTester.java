package com.xworkz.person;

import com.xworkz.person.entity.PersonEntity;
import com.xworkz.person.repository.PersonRepository;
import com.xworkz.person.repository.PersonRepositoryImpl;

public class FindTester {

	public static void main(String[] args) {
		PersonRepository repo = new PersonRepositoryImpl();
		PersonEntity entity=repo.findByName("Rakshitha");
		System.out.println(entity);
	}

}
