package com.xworkz.temple;

import com.xworkz.temple.dao.TempleDAO;
import com.xworkz.temple.dao.TempleDAOImpl;
import com.xworkz.temple.entity.TempleEntity;

public class SaveTester {

	public static void main(String[] args) {
		
		TempleEntity entity=new TempleEntity();
		entity.setName("Kottureshwara");
		entity.setLocation("kottur");
		entity.setNoOfVisitorsPerDay(115);
		entity.setNoOfPriest(8);
		
		TempleDAO dao=new TempleDAOImpl();
		dao.save(entity);
	}

}
