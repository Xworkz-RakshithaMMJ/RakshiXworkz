package com.xworkz.customer;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.repository.CustomerRepository;
import com.xworkz.customer.repository.CustomerRepositoryImpl;
import com.xworkz.customer.service.CustomerService;
import com.xworkz.customer.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {
		CustomerEntity entity = new CustomerEntity("Geetha", "kottur", 4, 900852);
		CustomerRepository repo = new CustomerRepositoryImpl();
		CustomerService service = new CustomerServiceImpl(repo);
		boolean save=service.validateAndSave(entity);
		System.out.println(save);
	}
}
