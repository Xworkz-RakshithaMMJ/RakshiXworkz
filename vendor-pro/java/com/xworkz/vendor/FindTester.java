package com.xworkz.vendor;


import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.repository.VendorRepository;
import com.xworkz.vendor.repository.VendorRepositoryImpl;

public class FindTester {

	public static void main(String[] args) {
		VendorRepository repo = new VendorRepositoryImpl();
		VendorEntity entity=repo.findByName("Zomato");
		System.out.println(entity);
	}

}
