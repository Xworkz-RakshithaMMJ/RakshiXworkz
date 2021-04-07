package com.xworkz.food.repository;

import com.xworkz.food.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {

	public FoodItemRepositoryImpl() {
		System.out.println("invoked FoodItemRepositoryImpl");
	}
	
	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoked save" +entity);
	}

}
