package com.xworkz.temple.dao;

import java.util.List;

import com.xworkz.temple.entity.TempleEntity;

public interface TempleDAO {

	public void save(TempleEntity entity);
	
	public TempleEntity findByName(String name);
	
	public List<TempleEntity> getAll();
	
	public void deleteById(int id);
}
