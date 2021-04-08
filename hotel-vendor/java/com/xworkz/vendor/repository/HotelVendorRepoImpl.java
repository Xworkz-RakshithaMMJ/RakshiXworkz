package com.xworkz.vendor.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.vendor.entity.HotelVendorEntity;

public class HotelVendorRepoImpl implements HotelVendorRepository {

	public HotelVendorRepoImpl() {
		System.out.println("created" +this.getClass().getSimpleName());
	}

	@Override
	public void save(HotelVendorEntity entity) {
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
