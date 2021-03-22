package com.xworkz.temple;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.temple.dao.TempleDAO;
import com.xworkz.temple.dao.TempleDAOImpl;
import com.xworkz.temple.entity.TempleEntity;

public class GetAllTester {

	public static void main(String[] args) {
		
		TempleEntity entity3 = new TempleEntity();
		entity3.setId(3);
		entity3.setName("Manjunatha");
		entity3.setLocation("Dharmastala");
		entity3.setNoOfVisitorsPerDay(101);
		entity3.setNoOfPriest(4);
		
		TempleEntity entity1 = new TempleEntity();
		entity1.setId(4);
		entity1.setName("Sharada");
		entity1.setLocation("Shrigeri");
		entity1.setNoOfVisitorsPerDay(102);
		entity1.setNoOfPriest(6);
		
		TempleDAO dao=new TempleDAOImpl();
		List<TempleEntity> list = new ArrayList<TempleEntity>();
		list.add(entity3);
		list.add(entity1);
		List<TempleEntity> entityFromDb=dao.getAll();
		System.out.println(entityFromDb);
	}

}
