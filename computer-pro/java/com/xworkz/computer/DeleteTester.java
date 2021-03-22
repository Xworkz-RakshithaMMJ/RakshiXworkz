package com.xworkz.computer;

import com.xworkz.computer.dao.ComputerDAO;
import com.xworkz.computer.dao.ComputerDAOImpl;

public class DeleteTester {

	public static void main(String[] args) {
		ComputerDAO dao=new ComputerDAOImpl();
		dao.deleteById(3);
	}

}
