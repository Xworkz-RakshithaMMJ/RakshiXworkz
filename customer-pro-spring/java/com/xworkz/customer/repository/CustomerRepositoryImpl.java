package com.xworkz.customer.repository;

import com.xworkz.customer.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	public CustomerRepositoryImpl() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save" +entity);
	}

}
