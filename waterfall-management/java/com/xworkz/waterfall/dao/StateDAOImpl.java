package com.xworkz.waterfall.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.util.SFUtil;

public class StateDAOImpl implements StateDAO {

	private SessionFactory factory = SFUtil.getFactory();

	public StateDAOImpl() {

	}

	@Override
	public void create(StateEntity entity) {
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

	/*
	 * @Override public void create(List<StateEntity> entities) { Transaction
	 * transaction; System.out.println("invoked create");
	 * System.out.println("entity" +entities); try (Session session =
	 * factory.openSession()) { //System.out.println("started up"); transaction
	 * = session.beginTransaction(); for (StateEntity stateEntity : entities) {
	 * session.save(stateEntity ); } transaction.commit();
	 * System.out.println("create list is success"); } }
	 */

	
	public void create(List<StateEntity> entities) {
		Transaction transaction=null;
		System.out.println("invoked create");
		System.out.println("entity" + entities);
		try {
			Session session = factory.openSession();
			transaction=session.beginTransaction();
			for (StateEntity stateEntity : entities) {
				// session.flush();
				session.save(stateEntity);
			}
			  transaction.commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}
}
