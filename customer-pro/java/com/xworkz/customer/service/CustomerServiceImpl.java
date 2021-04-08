package com.xworkz.customer.service;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.repository.CustomerRepository;
import com.xworkz.customer.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new CustomerRepositoryImpl() ;
	
	public CustomerServiceImpl(CustomerRepository repository) {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
		
	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		System.out.println("validateAndsave" +entity);
		if(null!=entity){
			System.out.println("entity is valid");
			customerRepository.save(entity);
		}
		else{
			System.out.println("entity is invalid");
		}
		return false;
	}

	
}
