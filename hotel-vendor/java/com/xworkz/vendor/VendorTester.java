package com.xworkz.vendor;

import com.xworkz.vendor.contants.HotelVendor;
import com.xworkz.vendor.entity.HotelVendorEntity;
import com.xworkz.vendor.repository.HotelVendorRepoImpl;
import com.xworkz.vendor.repository.HotelVendorRepository;
import com.xworkz.vendor.service.HotelVendorService;
import com.xworkz.vendor.service.HotelVendorServiceImpl;

public class VendorTester {

	public static void main(String[] args) {
		HotelVendorEntity entity = new HotelVendorEntity("Nakshatra", "Ballari", 90087, 3, HotelVendor.SUPPLIER);
		HotelVendorRepository repo = new HotelVendorRepoImpl();
		HotelVendorService service = new HotelVendorServiceImpl(repo);
		boolean save = service.validAndSave(entity);
		System.out.println(save);
	}
}
