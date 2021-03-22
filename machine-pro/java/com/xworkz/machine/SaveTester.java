package com.xworkz.machine;

import com.xworkz.machine.dao.MachineDAO;
import com.xworkz.machine.dao.MachineDAOImpl;
import com.xworkz.machine.entity.MachineEntity;

public class SaveTester {

	public static void main(String[] args) {
		MachineEntity entity= new MachineEntity();
		entity.setId(1);
		entity.setName("Computer");
		entity.setCompanyName("HP");
		entity.setType("Electronics");
		
		MachineDAO dao=new MachineDAOImpl();
		dao.save(entity);
	}

}
