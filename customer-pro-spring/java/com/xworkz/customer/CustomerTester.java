package com.xworkz.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.repository.CustomerRepository;
import com.xworkz.customer.repository.CustomerRepositoryImpl;
import com.xworkz.customer.service.CustomerService;
import com.xworkz.customer.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("injection.xml");
		CustomerEntity entity = new CustomerEntity("Geetha", "kottur", 4, 900852);
		CustomerRepository repo = new CustomerRepositoryImpl();
		CustomerService service = context.getBean(CustomerService.class);
		boolean save=service.validateAndSave(entity);
		System.out.println(save);
	}
}
