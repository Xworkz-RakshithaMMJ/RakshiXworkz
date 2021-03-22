package com.xworkz.temple;

import com.xworkz.temple.dao.TempleDAO;
import com.xworkz.temple.dao.TempleDAOImpl;

public class DeleteTester {

	public static void main(String[] args) {
		TempleDAO dao=new TempleDAOImpl();
		dao.deleteById(11);
	}

}
