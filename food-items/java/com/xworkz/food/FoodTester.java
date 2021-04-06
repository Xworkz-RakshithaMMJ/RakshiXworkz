package com.xworkz.food;

import com.xworkz.food.constants.FoodQuality;
import com.xworkz.food.constants.FoodType;
import com.xworkz.food.entity.FoodItemEntity;
import com.xworkz.food.repository.FoodItemRepository;
import com.xworkz.food.repository.FoodItemRepositoryImpl;
import com.xworkz.food.service.FoodItemService;
import com.xworkz.food.service.FoodItemServiceImpl;

public class FoodTester {

	public static void main(String[] args) {
		
		FoodItemEntity entity = new FoodItemEntity("Idli", 20, 2, FoodType.SOUTH_INDIAN, FoodQuality.GOOD, 4);
		FoodItemRepository repo = new FoodItemRepositoryImpl();
		FoodItemService service = new FoodItemServiceImpl(repo);
		boolean save=service.validateAndSave(entity);
		System.out.println(save);
		}
}