package com.xworkz.machine;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.machine.dao.MachineDAO;
import com.xworkz.machine.dao.MachineDAOImpl;
import com.xworkz.machine.entity.MachineEntity;

public class GetAllTester {

	public static void main(String[] args) {
		MachineEntity entity= new MachineEntity();
		entity.setId(2);
		entity.setName("Washing Machine");
		entity.setCompanyName("Onida");
		entity.setType("Household");
		
		MachineEntity entity1= new MachineEntity();
		entity1.setId(3);
		entity1.setName("Bulldozer");
		entity1.setCompanyName("Dozer");
		entity1.setType("Excavating");
		
		MachineDAO dao=new MachineDAOImpl();
		dao.save(entity);
		dao.save(entity1);
		List<MachineEntity> list = new ArrayList<MachineEntity>();
		list.add(entity);
		list.add(entity1);
		List<MachineEntity> entityFromDb=dao.getAll();
		System.out.println(entityFromDb);
	
	}

}
