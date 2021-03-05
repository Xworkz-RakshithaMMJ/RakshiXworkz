package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterfallDAO;
import com.xworkz.waterfall.dao.WaterfallDAOImpl;
import com.xworkz.waterfall.entity.WaterfallEntity;

public class Tester {
	public static void main(String[] args) {
		//SFUtil.getFactory();
		WaterfallEntity entity = new WaterfallEntity();
		entity.setName("Kunchikal");
		entity.setDepth(388);
		entity.setElectricityGenerated(true);
		entity.setHeight(455);
		entity.setLocation("Shimoga");
		entity.setNoOfDeath(5);
		entity.setRating(3);
		entity.setNoOfVisitors(55);
		entity.setSourceRiver("Tunga");
		entity.setDestination("Indian ocean");
		entity.setEntryFees(100);
		WaterfallDAO dao=new WaterfallDAOImpl();
		dao.create(entity);
		
	}
	
}
