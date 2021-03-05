package com.xworkz.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.BBCEntity;

public class BbcDAOImpl implements BbcDAO {

	public BbcDAOImpl() {

	}

	@Override
	public void create(BBCEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity :" + entity);
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
		factory.close();
	}

	@Override
	public BBCEntity getById(int id) {
		System.out.println("invoked id");
		System.out.println("entity :" + id);
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BBCEntity entityFromDb = session.get(BBCEntity.class, id);
		transaction.commit();
		session.close();
		factory.close();
		return entityFromDb;
	}

	@Override
	public BBCEntity updateNoOfTaskAndDaysInById(int id, int noOfTasks, int daysIn) {
		System.out.println("invoked updateNoOfTaskAndDaysInById");
		System.out.println("entity :" + id);
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(BBCEntity.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BBCEntity entityFromDb = session.get(BBCEntity.class, id);
		if (entityFromDb != null) {
			entityFromDb.setDaysIn(daysIn);
			entityFromDb.setNoOfTasks(noOfTasks);
			session.update(entityFromDb);
			transaction.commit();
			session.close();
			factory.close();
			System.out.println("can update");
		} else {
			System.out.println("cannot update");
		}

		return entityFromDb;
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked DeleteById");
		System.out.println("entity :" + id);
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(BBCEntity.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BBCEntity entityFromDb = session.get(BBCEntity.class, id);
		if (entityFromDb != null) {
			session.delete(entityFromDb);
			transaction.commit();
			session.close();
			factory.close();

		} else {
			System.out.println("cannot delete");
		}

	}
}
