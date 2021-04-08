package com.xworkz.vendor.service;


import com.xworkz.vendor.entity.HotelVendorEntity;
import com.xworkz.vendor.repository.HotelVendorRepoImpl;
import com.xworkz.vendor.repository.HotelVendorRepository;

public class HotelVendorServiceImpl implements HotelVendorService {

	private HotelVendorRepository hotelRepository = new HotelVendorRepoImpl() ;
	
	public HotelVendorServiceImpl(HotelVendorRepository repository) {
		System.out.println("created" +this.getClass().getSimpleName());
	}

	@Override
	public boolean validAndSave(HotelVendorEntity entity) {
		System.out.println("validateAndSave" +entity);
		if(null!=entity){
			System.out.println("entity is valid");
			hotelRepository.save(entity);
		}
		else{
			System.out.println("entity is invalid");
		}
		return false;
		
	}

	
	
}
