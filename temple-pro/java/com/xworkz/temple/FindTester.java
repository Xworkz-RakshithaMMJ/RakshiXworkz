package com.xworkz.temple;

import com.xworkz.temple.dao.TempleDAO;
import com.xworkz.temple.dao.TempleDAOImpl;
import com.xworkz.temple.entity.TempleEntity;

public class FindTester {

	public static void main(String[] args) {
		
		TempleDAO dao=new TempleDAOImpl();
		
		TempleEntity temp=dao.findByName("Kottureshwara");
		System.out.println(temp);
	}

}
