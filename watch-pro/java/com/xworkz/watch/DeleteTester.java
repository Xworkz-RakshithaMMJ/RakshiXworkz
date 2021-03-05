package com.xworkz.watch;

import com.xworkz.watch.dao.WatchDAO;
import com.xworkz.watch.dao.WatchDAOImpl;

public class DeleteTester {

	public static void main(String[] args) {
		WatchDAO dao = new WatchDAOImpl();
		dao.deleteById(2);
	}
}
