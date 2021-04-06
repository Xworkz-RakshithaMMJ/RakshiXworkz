package com.xworkz.vendor.repository;

import com.xworkz.vendor.entity.HotelVendorEntity;

public class HotelVendorRepoImpl implements HotelVendorRepository {

	public HotelVendorRepoImpl() {
		System.out.println("created" +this.getClass().getSimpleName());
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("created" +entity);
		
	}

}
