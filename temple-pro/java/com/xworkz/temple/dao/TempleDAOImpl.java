package com.xworkz.temple.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.util.SFUtil;


public class TempleDAOImpl implements TempleDAO {

	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public void save(TempleEntity entity) {
		System.out.println("invoked save");
		System.out.println("entity" +entity);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		System.out.println("Commit is success");

	}

	@Override
	public TempleEntity findByName(String name) {
		
		try(Session session=this.factory.openSession()){
			String hqlQuery="SELECT TEMPLE FROM TempleEntity TEMPLE WHERE TEMPLE.name='"+name+"'";
			Query<TempleEntity> query=session.createQuery(hqlQuery);
			TempleEntity templeEntity=query.uniqueResult();
			return templeEntity;
		}
		
		
	}


	@Override
	public List<TempleEntity>  getAll() {
		try(Session session=factory.openSession()){
			String hqlQuery="SELECT TEMPLE FROM TempleEntity TEMPLE";
			Query<TempleEntity> query=session.createQuery(hqlQuery);
			List<TempleEntity> list=query.list();
			return list;
		}
		
	}

	@Override
	public void deleteById(int id) {
		TempleEntity entity;
		System.out.println("deleteById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			entity = session.get(TempleEntity.class, id);
			if (entity != null) {
				session.delete(entity);
				transaction.commit();
			} else {
				System.out.println("cannot delete");
			}
		}
		
	}
	

}
