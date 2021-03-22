package com.xworkz.vendor;

import com.xworkz.vendor.repository.VendorRepository;
import com.xworkz.vendor.repository.VendorRepositoryImpl;

public class DeleteTester {

	public static void main(String[] args) {
		VendorRepository dao = new VendorRepositoryImpl();
		dao.deleteById(2);

	}

}
