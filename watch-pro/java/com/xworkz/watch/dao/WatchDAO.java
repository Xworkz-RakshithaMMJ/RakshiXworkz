package com.xworkz.watch.dao;

import java.util.List;

import com.xworkz.watch.entity.WatchEntity;

public interface WatchDAO {

	public void create(WatchEntity entity);
	
	public void create(List<WatchEntity> entities);

	public WatchEntity getById(int id);

	public void UpdateBrandAndCostById(String brandName, double cost, int id);

	public void deleteById(int id);

}
