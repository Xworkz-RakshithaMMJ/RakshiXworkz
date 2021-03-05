package com.xworkz.watch;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.watch.dao.WatchDAO;
import com.xworkz.watch.dao.WatchDAOImpl;
import com.xworkz.watch.entity.WatchEntity;

public class CreateTester {
	public static void main(String[] args) {
		WatchEntity entity2 = new WatchEntity();
		entity2.setW_id(159);
		entity2.setBrandName("Daneil Wallington");
		entity2.setReceiptNo(1020);
		entity2.setCost(10000);
		entity2.setWatchType("Chain");

		WatchEntity entity1 = new WatchEntity();
		entity1.setW_id(158);
		entity1.setBrandName("Titan");
		entity1.setReceiptNo(1023);
		entity1.setCost(2500);
		entity1.setWatchType("Chain");

		WatchDAO dao = new WatchDAOImpl();
		List<WatchEntity> list = new ArrayList<WatchEntity>();
		list.add(entity2);
		list.add(entity1);
		dao.create(list);
	}
}
