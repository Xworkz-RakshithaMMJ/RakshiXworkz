package com.xworkz.computer;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.computer.dao.ComputerDAO;
import com.xworkz.computer.dao.ComputerDAOImpl;
import com.xworkz.computer.entity.ComputerEntity;

public class GetAllTester {

	public static void main(String[] args) {
		ComputerEntity entity = new ComputerEntity();
		entity.setId(2);
		entity.setName("Dell");
		entity.setPrice(70000);
		entity.setBrand("Dell");
		entity.setType("Laptop");
		
		ComputerEntity entity1 = new ComputerEntity();
		entity1.setId(3);
		entity1.setName("Lenovo");
		entity1.setPrice(100000);
		entity1.setBrand("Lenovo");
		entity1.setType("Laptop");
		

		ComputerDAO dao=new ComputerDAOImpl();
		/*dao.save(entity);
		dao.save(entity1);
		 */	
		List<ComputerEntity> list = new ArrayList<ComputerEntity>();
		list.add(entity);
		list.add(entity1);
		List<ComputerEntity> entityFromDb=dao.getAll();
		System.out.println(entityFromDb);
	
		
	}

}
