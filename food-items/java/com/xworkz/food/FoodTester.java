package com.xworkz.food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.food.constants.FoodQuality;
import com.xworkz.food.constants.FoodType;
import com.xworkz.food.entity.FoodItemEntity;
import com.xworkz.food.service.FoodItemService;

public class FoodTester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("injection.xml");
		FoodItemService service = context.getBean(FoodItemService.class);
		FoodItemEntity entity = new FoodItemEntity("Idli", 20, 2, FoodType.SOUTH_INDIAN, FoodQuality.GOOD, 4);
		boolean save = service.validateAndSave(entity);
		System.out.println(save);
	}
}