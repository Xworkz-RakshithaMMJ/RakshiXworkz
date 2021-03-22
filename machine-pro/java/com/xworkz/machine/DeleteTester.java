package com.xworkz.machine;

import com.xworkz.machine.dao.MachineDAO;
import com.xworkz.machine.dao.MachineDAOImpl;
import com.xworkz.machine.entity.MachineEntity;

public class DeleteTester {

	public static void main(String[] args) {
		/*MachineEntity entity=new MachineEntity();
		entity.setId(4);
		entity.setName("Bulldozer");
		entity.setCompanyName("Dozer");
		entity.setType("Excavating");*/
		
		MachineDAO dao=new MachineDAOImpl();
		//dao.save(entity);
		dao.deleteById(4);
	}

}
