package com.xworkz.waterfall;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.waterfall.dao.StateDAO;
import com.xworkz.waterfall.dao.StateDAOImpl;
import com.xworkz.waterfall.entity.StateEntity;

public class NanditaTester {

	public static void main(String[] args) {
		StateEntity entity=new StateEntity();
		entity.setSId(1);
		entity.setName("karnataka");
		entity.setPopulation(7.3);
		entity.setLanguage("kannada");
		entity.setNoOfDistricts(31);
		
		StateEntity entity1=new StateEntity("Telangana", 8.1, "Telugu", 18);
		
		StateEntity entity2=new StateEntity("AP", 8.6, "Telugu", 17);
		
		StateEntity entity3=new StateEntity("Maharashtra", 9.1, "Hindi", 16);
		
		
		StateDAO dao = new StateDAOImpl();
		List<StateEntity> entities= new ArrayList<StateEntity>();
		entities.add(entity1);
		entities.add(entity2);
		entities.add(entity3);
		dao.create(entities);
	}
}
