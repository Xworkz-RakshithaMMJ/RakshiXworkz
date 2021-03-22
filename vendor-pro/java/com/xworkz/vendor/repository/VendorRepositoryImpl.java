package com.xworkz.vendor.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.vendor.entity.VendorEntity;

public class VendorRepositoryImpl implements VendorRepository {
	
	@Override
	public void persist(VendorEntity entity) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

	@Override
	public VendorEntity findByName(String name) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query = session.createNamedQuery("findByName");
		query.setParameter("nm", name);
		VendorEntity entity = (VendorEntity) query.getSingleResult();
		session.getTransaction().commit();
		session.close();
		return entity;
		
	}

	@Override
	public List<VendorEntity> getAll() {

			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
			EntityManager session = factory.createEntityManager();
			session.getTransaction().begin();
			Query query = session.createNamedQuery("getAll");
			List<VendorEntity> list = query.getResultList();
			return list;
		}
	

	@Override
	public void deleteById(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query = session.createNamedQuery("deleteById");
		query.setParameter("id", id);
		Integer no = query.executeUpdate();
		System.out.println(no);
		session.getTransaction().commit();
		factory.close();
		session.close();
	}


}
