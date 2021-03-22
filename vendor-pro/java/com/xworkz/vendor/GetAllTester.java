package com.xworkz.vendor;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.repository.VendorRepository;
import com.xworkz.vendor.repository.VendorRepositoryImpl;

public class GetAllTester {

	public static void main(String[] args) {
		VendorEntity entity=new VendorEntity();
		entity.setId(2);
		entity.setName("Swiggy");
		entity.setLocation("Bengaluru");
		entity.setPrice(9999);
		
		
		VendorEntity entity1=new VendorEntity();
		entity1.setId(3);
		entity.setName("Zomato");
		entity.setLocation("Bengaluru");
		entity.setPrice(999);
		
		VendorRepository dao=new VendorRepositoryImpl();
		/*dao.persist(entity);
		dao.persist(entity1);*/
		List<VendorEntity> list = new ArrayList<VendorEntity>();
		list.add(entity);
		list.add(entity1);
		List<VendorEntity> entityFromDb=dao.getAll();
		System.out.println(entityFromDb);
	


	}

}
