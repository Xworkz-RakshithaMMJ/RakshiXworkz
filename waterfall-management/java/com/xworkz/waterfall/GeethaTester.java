package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterfallDAO;
import com.xworkz.waterfall.dao.WaterfallDAOImpl;
import com.xworkz.waterfall.entity.WaterfallEntity;

public class GeethaTester {
public static void main(String[] args) {
	WaterfallDAO dao=new WaterfallDAOImpl();
	WaterfallEntity entity=dao.getById(1);
	System.out.println(entity);
	
}
}
