package com.xworkz.computer.dao;

import java.util.List;

import com.xworkz.computer.entity.ComputerEntity;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.xworkz.util.SFUtil;

public class ComputerDAOImpl implements ComputerDAO {

	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public void save(ComputerEntity entity) {
		System.out.println("invoked save");
		System.out.println("entity" + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		System.out.println("Commit is success");

	}

	@Override
	public ComputerEntity findByName(String name) {
		try (Session session = this.factory.openSession()) {
			String hqlQuery = "SELECT COMPUTER FROM ComputerEntity COMPUTER WHERE COMPUTER.name='" + name + "'";
			Query<ComputerEntity> query = session.createQuery(hqlQuery);
			ComputerEntity templeEntity = query.uniqueResult();
			return templeEntity;
		}

	}

	@Override
	public List<ComputerEntity> getAll() {
		try (Session session = factory.openSession()) {
			String hqlQuery = "SELECT COMPUTER FROM ComputerEntity COMPUTER";
			Query<ComputerEntity> query = session.createQuery(hqlQuery);
			List<ComputerEntity> list = query.list();
			return list;
		}

	}

	@Override
	public void deleteById(int id) {
		ComputerEntity entity;
		System.out.println("deleteById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			entity = session.get(ComputerEntity.class, id);
			if (entity != null) {
				session.delete(entity);
				transaction.commit();
			} else {
				System.out.println("cannot delete");
			}
		}

	}

}
