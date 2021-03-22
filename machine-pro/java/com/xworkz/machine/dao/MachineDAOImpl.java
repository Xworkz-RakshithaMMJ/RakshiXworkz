package com.xworkz.machine.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.machine.entity.MachineEntity;
import com.xworkz.util.SFUtil;

public class MachineDAOImpl implements MachineDAO {


	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public void save(MachineEntity entity) {
		System.out.println("invoked save");
		System.out.println("entity" + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		System.out.println("Commit is success");

	}

	@Override
	public MachineEntity findByName(String name) {
		try (Session session = this.factory.openSession()) {
			String hqlQuery = "SELECT MACHINE FROM MachineEntity MACHINE WHERE MACHINE.name='" + name + "'";
			Query<MachineEntity> query = session.createQuery(hqlQuery);
			MachineEntity templeEntity = query.uniqueResult();
			return templeEntity;
		}

	}

	@Override
	public List<MachineEntity> getAll() {
		try (Session session = factory.openSession()) {
			String hqlQuery = "SELECT MACHINE FROM MachineEntity MACHINE";
			Query<MachineEntity> query = session.createQuery(hqlQuery);
			List<MachineEntity> list = query.list();
			return list;
		}

	}

	@Override
	public void deleteById(int id) {
		MachineEntity entity;
		System.out.println("deleteById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			entity = session.get(MachineEntity.class, id);
			if (entity != null) {
				session.delete(entity);
				transaction.commit();
			} else {
				System.out.println("cannot delete");
			}
		}

	}


}
