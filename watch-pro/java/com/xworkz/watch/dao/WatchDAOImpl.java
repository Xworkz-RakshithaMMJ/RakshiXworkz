package com.xworkz.watch.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.watch.entity.WatchEntity;
import com.xworkz.watch.util.SFUtil;

public class WatchDAOImpl implements WatchDAO {

	private SessionFactory factory = SFUtil.getFactory();

	public WatchDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(WatchEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity" + entity);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		System.out.println("Commit is success");
	}

	@Override
	public WatchEntity getById(int id) {
		System.out.println("invoked getById");
		try(Session session = factory.openSession()){
		Transaction transaction = session.beginTransaction();
		WatchEntity entityFromDb = session.get(WatchEntity.class, id);
		transaction.commit();
		return entityFromDb;
	}
	}

	@Override
	public void UpdateBrandAndCostById(String brandName, double cost, int id) {
		WatchEntity entity;
		System.out.println("UpdateBrandAndCostById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			entity = session.get(WatchEntity.class, id);
			if (entity != null) {
				System.out.println("update is done" + id);
				entity.setBrandName(brandName);
				entity.setCost(cost);
				session.update(entity);
				transaction.commit();
			} else {
				System.out.println("cannot update");
			}
		}

	}

	@Override
	public void deleteById(int id) {
		WatchEntity entity;
		System.out.println("deleteById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			entity = session.get(WatchEntity.class, id);
			if (entity != null) {
				session.delete(entity);
				transaction.commit();
			} else {
				System.out.println("cannot delete");
			}
		}
	}

	@Override
	public void create(List<WatchEntity> entities) {
		Transaction transaction = null;
		System.out.println("invoked create");
		try {
			Session session = factory.openSession();
			{
				transaction = session.beginTransaction();
				for (WatchEntity watchEntity : entities) {
					// session.flush();
					session.save(watchEntity);
				}
				transaction.commit();
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}
}
