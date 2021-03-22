package com.xworkz.computer;

import com.xworkz.computer.dao.ComputerDAO;
import com.xworkz.computer.dao.ComputerDAOImpl;
import com.xworkz.computer.entity.ComputerEntity;

public class SaveTester {

	public static void main(String[] args) {
		ComputerEntity entity = new ComputerEntity();
		entity.setId(1);
		entity.setBrand("HP");
		entity.setPrice(45000);
		entity.setType("laptop");
		entity.setName("HP");
		
		ComputerDAO dao=new ComputerDAOImpl();
		dao.save(entity);
		
	}

}
