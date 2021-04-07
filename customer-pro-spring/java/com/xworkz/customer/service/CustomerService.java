package com.xworkz.customer.service;

import com.xworkz.customer.entity.CustomerEntity;

public interface CustomerService {

	public boolean validateAndSave(CustomerEntity entity);
}
