package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterfallDAO;
import com.xworkz.waterfall.dao.WaterfallDAOImpl;

public class SwathiTester {
public static void main(String[] args) {
	WaterfallDAO dao=new WaterfallDAOImpl();
	dao.updateHeightAndDepthById(1,456,389);
}
}
