package com.xworkz.vendor;

import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.repository.VendorRepository;
import com.xworkz.vendor.repository.VendorRepositoryImpl;

public class SaveTester {

	public static void main(String[] args) {
		VendorEntity entity=new VendorEntity();
		entity.setId(1);
		entity.setName("Zomato");
		entity.setLocation("Bengaluru");
		entity.setPrice(999);
		
		VendorRepository repo=new VendorRepositoryImpl();
		repo.persist(entity);
	}

}
