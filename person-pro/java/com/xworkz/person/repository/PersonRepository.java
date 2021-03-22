package com.xworkz.person.repository;

import java.util.List;

import com.xworkz.person.entity.PersonEntity;

public interface PersonRepository {

	public void persist(PersonEntity entity);

	public PersonEntity findByName(String name);

	public List<PersonEntity> getAll();

	public void deleteById(int id);
}
