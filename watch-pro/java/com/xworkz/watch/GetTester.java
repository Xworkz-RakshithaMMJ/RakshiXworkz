package com.xworkz.watch;

import com.xworkz.watch.dao.WatchDAO;
import com.xworkz.watch.dao.WatchDAOImpl;
import com.xworkz.watch.entity.WatchEntity;

public class GetTester {

	public static void main(String[] args) {
		WatchDAO dao=new WatchDAOImpl();
		WatchEntity entity=dao.getById(1);
		//System.out.println(entity.getBrandName());
		System.out.println(entity);
	}

}
