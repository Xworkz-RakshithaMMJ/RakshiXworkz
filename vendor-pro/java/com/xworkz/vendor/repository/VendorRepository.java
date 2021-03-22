package com.xworkz.vendor.repository;

import java.util.List;

import com.xworkz.vendor.entity.VendorEntity;

public interface VendorRepository {

	public void persist(VendorEntity entity);

	public VendorEntity findByName(String name);

	public List<VendorEntity> getAll();

	public void deleteById(int id);
}
