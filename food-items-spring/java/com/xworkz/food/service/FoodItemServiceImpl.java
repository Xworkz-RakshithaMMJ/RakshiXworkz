package com.xworkz.food.service;

import com.xworkz.food.entity.FoodItemEntity;
import com.xworkz.food.repository.FoodItemRepository;
import com.xworkz.food.repository.FoodItemRepositoryImpl;

public class FoodItemServiceImpl implements FoodItemService {

	private FoodItemRepository itemRepository = new FoodItemRepositoryImpl() ;
		
	public FoodItemServiceImpl(FoodItemRepository repository) {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	
	@Override
	public boolean validateAndSave(FoodItemEntity entity) {
		System.out.println("validateAndSave" +entity);
		if(null!=entity){
			System.out.println("entity is valid");
			itemRepository.save(entity);
		}
		else{
			System.out.println("entity is invalid");
		}
		return false;
		
	}

}
