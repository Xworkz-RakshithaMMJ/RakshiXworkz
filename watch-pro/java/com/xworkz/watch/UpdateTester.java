package com.xworkz.watch;

import com.xworkz.watch.dao.WatchDAO;
import com.xworkz.watch.dao.WatchDAOImpl;

public class UpdateTester {
	public static void main(String[] args) {
		WatchDAO dao = new WatchDAOImpl();
		dao.UpdateBrandAndCostById("Fastrack", 2000, 1);
	}
}
