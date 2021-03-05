package com.xworkz.waterfall.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.WaterfallEntity;
import com.xworkz.waterfall.util.SFUtil;

public class WaterfallDAOImpl implements WaterfallDAO {

	private SessionFactory factory = SFUtil.getFactory();

	public WaterfallDAOImpl() {
		System.out.println("created" + this.getClass());
	}

	@Override
	public void create(WaterfallEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity" + entity);
		try (Session session = factory.openSession()) {
			System.out.println("started up");
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("commit is success");
		}

	}

	@Override
	public void updateHeightAndDepthById(int id, double height, double depth) {
		System.out.println("invoked updateHeightAndDepthById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterfallEntity entityFromDb = session.get(WaterfallEntity.class, id);
			entityFromDb.setHeight(height);
			entityFromDb.setDepth(depth);
			session.update(entityFromDb);
			transaction.commit();
			System.out.println("update is success");
		}
	}

	@Override
	public WaterfallEntity getById(int id) {
		System.out.println("invoked id");
		System.out.println("entity :" + id);
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterfallEntity entityFromDb = session.get(WaterfallEntity.class, id);
			transaction.commit();
			return entityFromDb;
		}
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteByid");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterfallEntity entityFromDb = session.get(WaterfallEntity.class, id);
			session.delete(entityFromDb);
			transaction.commit();
			System.out.println("Deleted successfully");
		}

	}

}
