package com.xworkz.coupon.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.coupon.entity.CouponEntity;
import com.xworkz.util.SFUtil;

public class CouponDAOImpl implements CouponDAO {

	private SessionFactory factory = SFUtil.getFactory();

	public CouponDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(CouponEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity" + entity);
		try (Session session = factory.openSession()) {
			System.out.println("started up");
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("create is success");
		}

	}

	@Override
	public void create(List<CouponEntity> entities) {
		Transaction transaction = null;
		System.out.println("invoked create");
		try {
			Session session = factory.openSession();
			{
				transaction = session.beginTransaction();
				for (CouponEntity couponEntity : entities) {
					// session.flush();
					session.save(couponEntity);
				}
				transaction.commit();
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

	@Override
	public CouponEntity getById(int id) {
		System.out.println("invoked getById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			CouponEntity entityFromDb = session.get(CouponEntity.class, id);
			transaction.commit();
			return entityFromDb;
		}

	}

	@Override
	public void UpdateBrandAndCodeById(String brandName, String code, int id) {
		CouponEntity entity;
		System.out.println("UpdateBrandAndCostById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			entity = session.get(CouponEntity.class, id);
			if (entity != null) {
				System.out.println("update is done" + id);
				entity.setName(brandName);
				entity.setCode("C789");
				session.update(entity);
				transaction.commit();
			} else {
				System.out.println("cannot update");
			}
		}

	}

	@Override
	public void deleteById(int id) {
		CouponEntity entity;
		System.out.println("deleteById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			entity = session.get(CouponEntity.class, id);
			if (entity != null) {
				session.delete(entity);
				transaction.commit();
			} else {
				System.out.println("cannot delete");
			}
		}
	}

}
