package com.xworkz.computer;

import com.xworkz.computer.dao.ComputerDAO;
import com.xworkz.computer.dao.ComputerDAOImpl;
import com.xworkz.computer.entity.ComputerEntity;

public class FindTester {

	public static void main(String[] args) {
		ComputerDAO dao=new ComputerDAOImpl();
		ComputerEntity entity=dao.findByName("HP");
		System.out.println(entity);
	}

}
