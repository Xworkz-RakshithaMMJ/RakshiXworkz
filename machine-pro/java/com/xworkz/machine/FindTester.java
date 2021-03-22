package com.xworkz.machine;

import com.xworkz.machine.dao.MachineDAO;
import com.xworkz.machine.dao.MachineDAOImpl;
import com.xworkz.machine.entity.MachineEntity;

public class FindTester {

	public static void main(String[] args) {
		MachineDAO dao=new MachineDAOImpl();
		MachineEntity entity=dao.findByName("Computer");
		System.out.println(entity);
	}

}
