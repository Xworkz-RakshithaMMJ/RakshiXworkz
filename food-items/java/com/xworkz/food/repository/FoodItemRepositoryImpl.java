package com.xworkz.food.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.food.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {

	public FoodItemRepositoryImpl() {
		System.out.println("invoked FoodItemRepositoryImpl");
	}
	
	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoked save" +entity);
		System.out.println("created" +entity);
		Configuration cfg = new Configuration();
		cfg.configure();
		//cfg.addAnnotatedClass(HotelVendorEntity.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
		factory.close();
	}

}
