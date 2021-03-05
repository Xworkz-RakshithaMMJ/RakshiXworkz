package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterfallDAO;
import com.xworkz.waterfall.dao.WaterfallDAOImpl;

public class SeeniTester {
public static void main(String[] args) {
	WaterfallDAO dao=new WaterfallDAOImpl();
	dao.deleteById(2);
}
}
