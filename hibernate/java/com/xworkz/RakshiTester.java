package com.xworkz;

import com.xworkz.dao.RichDAO;
import com.xworkz.dao.RichDAOImpl;
import com.xworkz.rich.RichEntity;

public class RakshiTester {

	public static void main(String[] args) {
		RichEntity entity = new RichEntity();
		entity.setId(2);
		entity.setName("ratan Tata");
		entity.setCountry("India");
		entity.setNetWorthInBillions(135);
		entity.setBusiness("Software");
		entity.setRank(5);
		entity.setMarried(true);
		
		RichDAO dao = new RichDAOImpl();
		dao.create(entity);
		System.out.println("Created successfully");
	}
}
