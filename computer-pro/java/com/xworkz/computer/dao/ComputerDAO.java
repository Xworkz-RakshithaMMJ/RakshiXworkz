package com.xworkz.computer.dao;

import java.util.List;

import com.xworkz.computer.entity.ComputerEntity;

public interface ComputerDAO {

	public void save(ComputerEntity entity);

	public ComputerEntity findByName(String name);

	public List<ComputerEntity> getAll();

	public void deleteById(int id);

}
